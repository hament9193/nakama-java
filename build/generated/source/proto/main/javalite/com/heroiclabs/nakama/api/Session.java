// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A user's session used to authenticate messages.
 * </pre>
 *
 * Protobuf type {@code nakama.api.Session}
 */
public  final class Session extends
    com.google.protobuf.GeneratedMessageLite<
        Session, Session.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.Session)
    SessionOrBuilder {
  private Session() {
    token_ = "";
    udpToken_ = "";
  }
  public static final int CREATED_FIELD_NUMBER = 1;
  private boolean created_;
  /**
   * <pre>
   * True if the corresponding account was just created, false otherwise.
   * </pre>
   *
   * <code>optional bool created = 1;</code>
   */
  public boolean getCreated() {
    return created_;
  }
  /**
   * <pre>
   * True if the corresponding account was just created, false otherwise.
   * </pre>
   *
   * <code>optional bool created = 1;</code>
   */
  private void setCreated(boolean value) {
    
    created_ = value;
  }
  /**
   * <pre>
   * True if the corresponding account was just created, false otherwise.
   * </pre>
   *
   * <code>optional bool created = 1;</code>
   */
  private void clearCreated() {
    
    created_ = false;
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  private java.lang.String token_;
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  public java.lang.String getToken() {
    return token_;
  }
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(token_);
  }
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  private void setToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    token_ = value;
  }
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  private void clearToken() {
    
    token_ = getDefaultInstance().getToken();
  }
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  private void setTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    token_ = value.toStringUtf8();
  }

  public static final int UDP_TOKEN_FIELD_NUMBER = 3;
  private java.lang.String udpToken_;
  /**
   * <pre>
   * rUDP specific authentication credentials.
   * </pre>
   *
   * <code>optional string udp_token = 3;</code>
   */
  public java.lang.String getUdpToken() {
    return udpToken_;
  }
  /**
   * <pre>
   * rUDP specific authentication credentials.
   * </pre>
   *
   * <code>optional string udp_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUdpTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(udpToken_);
  }
  /**
   * <pre>
   * rUDP specific authentication credentials.
   * </pre>
   *
   * <code>optional string udp_token = 3;</code>
   */
  private void setUdpToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    udpToken_ = value;
  }
  /**
   * <pre>
   * rUDP specific authentication credentials.
   * </pre>
   *
   * <code>optional string udp_token = 3;</code>
   */
  private void clearUdpToken() {
    
    udpToken_ = getDefaultInstance().getUdpToken();
  }
  /**
   * <pre>
   * rUDP specific authentication credentials.
   * </pre>
   *
   * <code>optional string udp_token = 3;</code>
   */
  private void setUdpTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    udpToken_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (created_ != false) {
      output.writeBool(1, created_);
    }
    if (!token_.isEmpty()) {
      output.writeString(2, getToken());
    }
    if (!udpToken_.isEmpty()) {
      output.writeString(3, getUdpToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (created_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, created_);
    }
    if (!token_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getToken());
    }
    if (!udpToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUdpToken());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.Session parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Session parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Session parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.Session parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.Session prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A user's session used to authenticate messages.
   * </pre>
   *
   * Protobuf type {@code nakama.api.Session}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.Session, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.Session)
      com.heroiclabs.nakama.api.SessionOrBuilder {
    // Construct using com.heroiclabs.nakama.api.Session.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * True if the corresponding account was just created, false otherwise.
     * </pre>
     *
     * <code>optional bool created = 1;</code>
     */
    public boolean getCreated() {
      return instance.getCreated();
    }
    /**
     * <pre>
     * True if the corresponding account was just created, false otherwise.
     * </pre>
     *
     * <code>optional bool created = 1;</code>
     */
    public Builder setCreated(boolean value) {
      copyOnWrite();
      instance.setCreated(value);
      return this;
    }
    /**
     * <pre>
     * True if the corresponding account was just created, false otherwise.
     * </pre>
     *
     * <code>optional bool created = 1;</code>
     */
    public Builder clearCreated() {
      copyOnWrite();
      instance.clearCreated();
      return this;
    }

    /**
     * <pre>
     * Authentication credentials.
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public java.lang.String getToken() {
      return instance.getToken();
    }
    /**
     * <pre>
     * Authentication credentials.
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return instance.getTokenBytes();
    }
    /**
     * <pre>
     * Authentication credentials.
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setToken(value);
      return this;
    }
    /**
     * <pre>
     * Authentication credentials.
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public Builder clearToken() {
      copyOnWrite();
      instance.clearToken();
      return this;
    }
    /**
     * <pre>
     * Authentication credentials.
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTokenBytes(value);
      return this;
    }

    /**
     * <pre>
     * rUDP specific authentication credentials.
     * </pre>
     *
     * <code>optional string udp_token = 3;</code>
     */
    public java.lang.String getUdpToken() {
      return instance.getUdpToken();
    }
    /**
     * <pre>
     * rUDP specific authentication credentials.
     * </pre>
     *
     * <code>optional string udp_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUdpTokenBytes() {
      return instance.getUdpTokenBytes();
    }
    /**
     * <pre>
     * rUDP specific authentication credentials.
     * </pre>
     *
     * <code>optional string udp_token = 3;</code>
     */
    public Builder setUdpToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setUdpToken(value);
      return this;
    }
    /**
     * <pre>
     * rUDP specific authentication credentials.
     * </pre>
     *
     * <code>optional string udp_token = 3;</code>
     */
    public Builder clearUdpToken() {
      copyOnWrite();
      instance.clearUdpToken();
      return this;
    }
    /**
     * <pre>
     * rUDP specific authentication credentials.
     * </pre>
     *
     * <code>optional string udp_token = 3;</code>
     */
    public Builder setUdpTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUdpTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.Session)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.Session();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.Session other = (com.heroiclabs.nakama.api.Session) arg1;
        created_ = visitor.visitBoolean(created_ != false, created_,
            other.created_ != false, other.created_);
        token_ = visitor.visitString(!token_.isEmpty(), token_,
            !other.token_.isEmpty(), other.token_);
        udpToken_ = visitor.visitString(!udpToken_.isEmpty(), udpToken_,
            !other.udpToken_.isEmpty(), other.udpToken_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                created_ = input.readBool();
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                token_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                udpToken_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.Session.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.api.Session)
  private static final com.heroiclabs.nakama.api.Session DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Session();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.Session getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Session> PARSER;

  public static com.google.protobuf.Parser<Session> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

