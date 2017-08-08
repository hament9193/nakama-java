/*
 * Copyright 2017 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stumbleupon.async.Deferred;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import okhttp3.*;
import okio.ByteString;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class DefaultClient implements Client {

    static final Gson GSON = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private final String serverKey;
    private final String host;
    private final int port;
    private final String lang;

    private final boolean ssl;
    private final int timeout;
    private final boolean noDelay;

    private final Map<String, Deferred> collationIds;

    private final OkHttpClient client;
    private WebSocket socket;

    private DefaultClient(final String serverKey, final String host, final int port, final String lang,
                          final boolean ssl, final int timeout, final boolean noDelay) {
        this.host = host;
        this.port = port;
        this.serverKey = serverKey;
        this.lang = lang;
        this.ssl = ssl;
        this.timeout = timeout;
        this.noDelay = noDelay;

        collationIds = new ConcurrentHashMap<>();


        client = new OkHttpClient.Builder()
                .connectTimeout(3000, TimeUnit.MILLISECONDS)
                .readTimeout(timeout, TimeUnit.MILLISECONDS)
                .writeTimeout(timeout, TimeUnit.MILLISECONDS)
                .build();
    }

    @Override
    public Deferred<Session> login(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/login");
    }

    @Override
    public Deferred<Session> register(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/register");
    }

    private Deferred<Session> authenticate(final AuthenticateMessage auth, final String path) {
        final Deferred<Session> deferred = new Deferred<>();

        final byte[] payload = auth.asBytes(UUID.randomUUID().toString());

        final HttpUrl url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath(path)
                .build();

        final Request request = new Request.Builder()
                .url(url)
                .method("POST", RequestBody.create(MediaType.parse("application/octet-stream;"), payload))
                .header("Authorization", "Basic " + ByteString.of((serverKey + ":").getBytes()).base64())
                .header("Accept-Language", lang)
                .header("User-Agent", "nakama-java/0.1.0") // TODO set user-agent based on build version.
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                deferred.callback(new DefaultError("Error sending message to server", Error.ErrorCode.UNKNOWN));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final ResponseBody body = response.body();
                if (body == null) {
                    deferred.callback(new DefaultError("Error in response body from server", Error.ErrorCode.UNKNOWN));
                    return;
                }
                final com.heroiclabs.nakama.Api.AuthenticateResponse authResponse;
                try {
                    authResponse = com.heroiclabs.nakama.Api.AuthenticateResponse.parseFrom(body.byteStream());
                } catch (IOException e) {
                    deferred.callback(new DefaultError("Error reading response from server", Error.ErrorCode.UNKNOWN));
                    return;
                } finally {
                    response.close();
                }

                switch (authResponse.getIdCase()) {
                    case SESSION:
                        deferred.callback(DefaultSession.restore(authResponse.getSession().getToken()));
                        break;
                    case ERROR:
                        deferred.callback(new DefaultError(authResponse.getError().getMessage(), authResponse.getError().getCode()));
                        break;
                    default:
                        deferred.callback(new DefaultError("Unknown response format from server", Error.ErrorCode.UNKNOWN));
                }
            }
        });

        return deferred;
    }

    @Override
    public synchronized Deferred<Boolean> connect(final @NonNull Session session) {
        final Deferred<Boolean> deferred = new Deferred<>();

        if (socket != null) {
            deferred.callback(new DefaultError("Client is already connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final String url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath("/api")
                .addQueryParameter("token", session.getToken())
                .addQueryParameter("lang", lang)
                .build()
                .toString()
                .replaceFirst("http", "ws");

        final Request request = new Request.Builder()
                .url(url)
                .build();

        socket = client.newWebSocket(request, new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                super.onOpen(webSocket, response);
                // Notify the deferred caller that the client has connected and is ready to use.
                deferred.callback(true);
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                super.onMessage(webSocket, text);
                // No text messages are expected.
                // TODO log an error and/or disconnect here?
            }

            @Override
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                super.onMessage(webSocket, bytes);

                final com.heroiclabs.nakama.Api.Envelope envelope;
                try {
                    envelope = com.heroiclabs.nakama.Api.Envelope.parseFrom(bytes.toByteArray());
                } catch (IOException e) {
                    // TODO notify a listener about error reading incoming message?
                    return;
                }

                final String collationId = envelope.getCollationId();
                if (collationId == null) {
                    // TODO handle purely incoming messages.
                    return;
                }

                final Deferred def = collationIds.get(collationId);
                if (def == null) {
                    // TODO notify a listener about not finding the deferred caller to respond to, or log a warning?
                    return;
                }

                switch (envelope.getPayloadCase()) {
                    case ERROR:
                        def.callback(new DefaultError(envelope.getError().getMessage(), envelope.getError().getCode()));
                        break;
                    case SELF:
                        def.callback(DefaultSelf.fromProto(envelope.getSelf().getSelf()));
                        break;
                    default:
                        def.callback(new DefaultError(envelope.getError().getMessage(), envelope.getError().getCode()));
                }
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                super.onClosing(webSocket, code, reason);
                // No action needed here.
            }

            @Override
            public void onClosed(WebSocket webSocket, int code, String reason) {
                super.onClosed(webSocket, code, reason);
                // Graceful socket disconnect is complete, clean up.
                // TODO callback any leftover deferred items with a disconnect error message?
                collationIds.clear();
                socket = null;
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                super.onFailure(webSocket, t, response);
                // Socket has failed and is no longer connected, clean up.
                // TODO callback any leftover deferred items with a disconnect error message?
                collationIds.clear();
                // TODO notify a listener about unexpected disconnect?
                socket = null;
            }
        });

        return deferred;
    }

    @Override
    public synchronized Deferred<Boolean> disconnect() {
        final Deferred<Boolean> deferred = new Deferred<>();

        if (socket != null) {
            // Returns true if a shutdown was initiated, false if already shutting down or disconnected.
            // Either result is acceptable here.
            // Socket reference will be set to null when disconnect is completed.
            socket.close(1000, null);
        }

        deferred.callback(true);
        return deferred;
    }

    @Override
    public <T> Deferred<T> send(final @NonNull CollatedMessage<T> message) {
        final Deferred<T> deferred = new Deferred<>();

        if (socket == null) {
            deferred.callback(new DefaultError("Client is not connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final String collationId = UUID.randomUUID().toString();
        final byte[] payload = message.asBytes(collationId);

        final boolean isEnqueued = socket.send(ByteString.of(payload));
        if (!isEnqueued) {
            deferred.callback(new DefaultError("Failed to send message, make sure the client is connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        collationIds.put(collationId, deferred);
        return deferred;
    }

    @Override
    public Deferred<Boolean> send(final @NonNull Message message) {
        final Deferred<Boolean> deferred = new Deferred<>();

        if (socket == null) {
            deferred.callback(new DefaultError("Client is not connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        final byte[] payload = message.asBytes();

        final boolean isEnqueued = socket.send(ByteString.of(payload));
        if (!isEnqueued) {
            deferred.callback(new DefaultError("Failed to send message, make sure the client is connected", Error.ErrorCode.UNKNOWN));
            return deferred;
        }

        deferred.callback(true);
        return deferred;
    }

    public static Client defaults(String serverKey) {
        return builder(serverKey).build();
    }

    public static Builder builder(String serverKey) {
        return new Builder(serverKey);
    }

    @RequiredArgsConstructor
    public static class Builder {
        private final @NonNull String serverKey;
        private String host = "127.0.0.1";
        private int port = 7350;
        private String lang = "en";
        private boolean ssl = false;
        private int timeout = 5000;
        private boolean noDelay = true;

        public Client build() {
            return new DefaultClient(serverKey, host, port, lang, ssl, timeout, noDelay);
        }

        public Builder host(final @NonNull String host) {
            this.host = host;
            return this;
        }

        public Builder port(final int port) {
            this.port = port;
            return this;
        }

        public Builder lang(final @NonNull String lang) {
            this.lang = lang;
            return this;
        }

        public Builder ssl(final boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder timeout(final int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder noDelay(final boolean noDelay) {
            this.noDelay = noDelay;
            return this;
        }
    }
}
