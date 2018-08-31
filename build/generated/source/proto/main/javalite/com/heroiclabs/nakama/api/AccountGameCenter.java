// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Send Apple's Game Center account credentials to the server. Used with authenticate/link/unlink.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AccountGameCenter}
 */
public  final class AccountGameCenter extends
    com.google.protobuf.GeneratedMessageLite<
        AccountGameCenter, AccountGameCenter.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.AccountGameCenter)
    AccountGameCenterOrBuilder {
  private AccountGameCenter() {
    playerId_ = "";
    bundleId_ = "";
    salt_ = "";
    signature_ = "";
    publicKeyUrl_ = "";
  }
  public static final int PLAYER_ID_FIELD_NUMBER = 1;
  private java.lang.String playerId_;
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  public java.lang.String getPlayerId() {
    return playerId_;
  }
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPlayerIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(playerId_);
  }
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  private void setPlayerId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    playerId_ = value;
  }
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  private void clearPlayerId() {
    
    playerId_ = getDefaultInstance().getPlayerId();
  }
  /**
   * <pre>
   * Player ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string player_id = 1;</code>
   */
  private void setPlayerIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    playerId_ = value.toStringUtf8();
  }

  public static final int BUNDLE_ID_FIELD_NUMBER = 2;
  private java.lang.String bundleId_;
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  public java.lang.String getBundleId() {
    return bundleId_;
  }
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBundleIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bundleId_);
  }
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  private void setBundleId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    bundleId_ = value;
  }
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  private void clearBundleId() {
    
    bundleId_ = getDefaultInstance().getBundleId();
  }
  /**
   * <pre>
   * Bundle ID (generated by GameCenter).
   * </pre>
   *
   * <code>optional string bundle_id = 2;</code>
   */
  private void setBundleIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    bundleId_ = value.toStringUtf8();
  }

  public static final int TIMESTAMP_SECONDS_FIELD_NUMBER = 3;
  private long timestampSeconds_;
  /**
   * <pre>
   * Time since UNIX epoch when the signature was created.
   * </pre>
   *
   * <code>optional int64 timestamp_seconds = 3;</code>
   */
  public long getTimestampSeconds() {
    return timestampSeconds_;
  }
  /**
   * <pre>
   * Time since UNIX epoch when the signature was created.
   * </pre>
   *
   * <code>optional int64 timestamp_seconds = 3;</code>
   */
  private void setTimestampSeconds(long value) {
    
    timestampSeconds_ = value;
  }
  /**
   * <pre>
   * Time since UNIX epoch when the signature was created.
   * </pre>
   *
   * <code>optional int64 timestamp_seconds = 3;</code>
   */
  private void clearTimestampSeconds() {
    
    timestampSeconds_ = 0L;
  }

  public static final int SALT_FIELD_NUMBER = 4;
  private java.lang.String salt_;
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  public java.lang.String getSalt() {
    return salt_;
  }
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSaltBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(salt_);
  }
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  private void setSalt(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    salt_ = value;
  }
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  private void clearSalt() {
    
    salt_ = getDefaultInstance().getSalt();
  }
  /**
   * <pre>
   * A random "NSString" used to compute the hash and keep it randomized.
   * </pre>
   *
   * <code>optional string salt = 4;</code>
   */
  private void setSaltBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    salt_ = value.toStringUtf8();
  }

  public static final int SIGNATURE_FIELD_NUMBER = 5;
  private java.lang.String signature_;
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  public java.lang.String getSignature() {
    return signature_;
  }
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSignatureBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(signature_);
  }
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  private void setSignature(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    signature_ = value;
  }
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  private void clearSignature() {
    
    signature_ = getDefaultInstance().getSignature();
  }
  /**
   * <pre>
   * The verification signature data generated.
   * </pre>
   *
   * <code>optional string signature = 5;</code>
   */
  private void setSignatureBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    signature_ = value.toStringUtf8();
  }

  public static final int PUBLIC_KEY_URL_FIELD_NUMBER = 6;
  private java.lang.String publicKeyUrl_;
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  public java.lang.String getPublicKeyUrl() {
    return publicKeyUrl_;
  }
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPublicKeyUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(publicKeyUrl_);
  }
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  private void setPublicKeyUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    publicKeyUrl_ = value;
  }
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  private void clearPublicKeyUrl() {
    
    publicKeyUrl_ = getDefaultInstance().getPublicKeyUrl();
  }
  /**
   * <pre>
   * The URL for the public encryption key.
   * </pre>
   *
   * <code>optional string public_key_url = 6;</code>
   */
  private void setPublicKeyUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    publicKeyUrl_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!playerId_.isEmpty()) {
      output.writeString(1, getPlayerId());
    }
    if (!bundleId_.isEmpty()) {
      output.writeString(2, getBundleId());
    }
    if (timestampSeconds_ != 0L) {
      output.writeInt64(3, timestampSeconds_);
    }
    if (!salt_.isEmpty()) {
      output.writeString(4, getSalt());
    }
    if (!signature_.isEmpty()) {
      output.writeString(5, getSignature());
    }
    if (!publicKeyUrl_.isEmpty()) {
      output.writeString(6, getPublicKeyUrl());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!playerId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getPlayerId());
    }
    if (!bundleId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getBundleId());
    }
    if (timestampSeconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timestampSeconds_);
    }
    if (!salt_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getSalt());
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getSignature());
    }
    if (!publicKeyUrl_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(6, getPublicKeyUrl());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGameCenter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.AccountGameCenter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Send Apple's Game Center account credentials to the server. Used with authenticate/link/unlink.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AccountGameCenter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.AccountGameCenter, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AccountGameCenter)
      com.heroiclabs.nakama.api.AccountGameCenterOrBuilder {
    // Construct using com.heroiclabs.nakama.api.AccountGameCenter.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Player ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string player_id = 1;</code>
     */
    public java.lang.String getPlayerId() {
      return instance.getPlayerId();
    }
    /**
     * <pre>
     * Player ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string player_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPlayerIdBytes() {
      return instance.getPlayerIdBytes();
    }
    /**
     * <pre>
     * Player ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string player_id = 1;</code>
     */
    public Builder setPlayerId(
        java.lang.String value) {
      copyOnWrite();
      instance.setPlayerId(value);
      return this;
    }
    /**
     * <pre>
     * Player ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string player_id = 1;</code>
     */
    public Builder clearPlayerId() {
      copyOnWrite();
      instance.clearPlayerId();
      return this;
    }
    /**
     * <pre>
     * Player ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string player_id = 1;</code>
     */
    public Builder setPlayerIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPlayerIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Bundle ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string bundle_id = 2;</code>
     */
    public java.lang.String getBundleId() {
      return instance.getBundleId();
    }
    /**
     * <pre>
     * Bundle ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string bundle_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBundleIdBytes() {
      return instance.getBundleIdBytes();
    }
    /**
     * <pre>
     * Bundle ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string bundle_id = 2;</code>
     */
    public Builder setBundleId(
        java.lang.String value) {
      copyOnWrite();
      instance.setBundleId(value);
      return this;
    }
    /**
     * <pre>
     * Bundle ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string bundle_id = 2;</code>
     */
    public Builder clearBundleId() {
      copyOnWrite();
      instance.clearBundleId();
      return this;
    }
    /**
     * <pre>
     * Bundle ID (generated by GameCenter).
     * </pre>
     *
     * <code>optional string bundle_id = 2;</code>
     */
    public Builder setBundleIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBundleIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Time since UNIX epoch when the signature was created.
     * </pre>
     *
     * <code>optional int64 timestamp_seconds = 3;</code>
     */
    public long getTimestampSeconds() {
      return instance.getTimestampSeconds();
    }
    /**
     * <pre>
     * Time since UNIX epoch when the signature was created.
     * </pre>
     *
     * <code>optional int64 timestamp_seconds = 3;</code>
     */
    public Builder setTimestampSeconds(long value) {
      copyOnWrite();
      instance.setTimestampSeconds(value);
      return this;
    }
    /**
     * <pre>
     * Time since UNIX epoch when the signature was created.
     * </pre>
     *
     * <code>optional int64 timestamp_seconds = 3;</code>
     */
    public Builder clearTimestampSeconds() {
      copyOnWrite();
      instance.clearTimestampSeconds();
      return this;
    }

    /**
     * <pre>
     * A random "NSString" used to compute the hash and keep it randomized.
     * </pre>
     *
     * <code>optional string salt = 4;</code>
     */
    public java.lang.String getSalt() {
      return instance.getSalt();
    }
    /**
     * <pre>
     * A random "NSString" used to compute the hash and keep it randomized.
     * </pre>
     *
     * <code>optional string salt = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSaltBytes() {
      return instance.getSaltBytes();
    }
    /**
     * <pre>
     * A random "NSString" used to compute the hash and keep it randomized.
     * </pre>
     *
     * <code>optional string salt = 4;</code>
     */
    public Builder setSalt(
        java.lang.String value) {
      copyOnWrite();
      instance.setSalt(value);
      return this;
    }
    /**
     * <pre>
     * A random "NSString" used to compute the hash and keep it randomized.
     * </pre>
     *
     * <code>optional string salt = 4;</code>
     */
    public Builder clearSalt() {
      copyOnWrite();
      instance.clearSalt();
      return this;
    }
    /**
     * <pre>
     * A random "NSString" used to compute the hash and keep it randomized.
     * </pre>
     *
     * <code>optional string salt = 4;</code>
     */
    public Builder setSaltBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSaltBytes(value);
      return this;
    }

    /**
     * <pre>
     * The verification signature data generated.
     * </pre>
     *
     * <code>optional string signature = 5;</code>
     */
    public java.lang.String getSignature() {
      return instance.getSignature();
    }
    /**
     * <pre>
     * The verification signature data generated.
     * </pre>
     *
     * <code>optional string signature = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSignatureBytes() {
      return instance.getSignatureBytes();
    }
    /**
     * <pre>
     * The verification signature data generated.
     * </pre>
     *
     * <code>optional string signature = 5;</code>
     */
    public Builder setSignature(
        java.lang.String value) {
      copyOnWrite();
      instance.setSignature(value);
      return this;
    }
    /**
     * <pre>
     * The verification signature data generated.
     * </pre>
     *
     * <code>optional string signature = 5;</code>
     */
    public Builder clearSignature() {
      copyOnWrite();
      instance.clearSignature();
      return this;
    }
    /**
     * <pre>
     * The verification signature data generated.
     * </pre>
     *
     * <code>optional string signature = 5;</code>
     */
    public Builder setSignatureBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSignatureBytes(value);
      return this;
    }

    /**
     * <pre>
     * The URL for the public encryption key.
     * </pre>
     *
     * <code>optional string public_key_url = 6;</code>
     */
    public java.lang.String getPublicKeyUrl() {
      return instance.getPublicKeyUrl();
    }
    /**
     * <pre>
     * The URL for the public encryption key.
     * </pre>
     *
     * <code>optional string public_key_url = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPublicKeyUrlBytes() {
      return instance.getPublicKeyUrlBytes();
    }
    /**
     * <pre>
     * The URL for the public encryption key.
     * </pre>
     *
     * <code>optional string public_key_url = 6;</code>
     */
    public Builder setPublicKeyUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setPublicKeyUrl(value);
      return this;
    }
    /**
     * <pre>
     * The URL for the public encryption key.
     * </pre>
     *
     * <code>optional string public_key_url = 6;</code>
     */
    public Builder clearPublicKeyUrl() {
      copyOnWrite();
      instance.clearPublicKeyUrl();
      return this;
    }
    /**
     * <pre>
     * The URL for the public encryption key.
     * </pre>
     *
     * <code>optional string public_key_url = 6;</code>
     */
    public Builder setPublicKeyUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPublicKeyUrlBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AccountGameCenter)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.AccountGameCenter();
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
        com.heroiclabs.nakama.api.AccountGameCenter other = (com.heroiclabs.nakama.api.AccountGameCenter) arg1;
        playerId_ = visitor.visitString(!playerId_.isEmpty(), playerId_,
            !other.playerId_.isEmpty(), other.playerId_);
        bundleId_ = visitor.visitString(!bundleId_.isEmpty(), bundleId_,
            !other.bundleId_.isEmpty(), other.bundleId_);
        timestampSeconds_ = visitor.visitLong(timestampSeconds_ != 0L, timestampSeconds_,
            other.timestampSeconds_ != 0L, other.timestampSeconds_);
        salt_ = visitor.visitString(!salt_.isEmpty(), salt_,
            !other.salt_.isEmpty(), other.salt_);
        signature_ = visitor.visitString(!signature_.isEmpty(), signature_,
            !other.signature_.isEmpty(), other.signature_);
        publicKeyUrl_ = visitor.visitString(!publicKeyUrl_.isEmpty(), publicKeyUrl_,
            !other.publicKeyUrl_.isEmpty(), other.publicKeyUrl_);
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
              case 10: {
                String s = input.readStringRequireUtf8();

                playerId_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                bundleId_ = s;
                break;
              }
              case 24: {

                timestampSeconds_ = input.readInt64();
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                salt_ = s;
                break;
              }
              case 42: {
                String s = input.readStringRequireUtf8();

                signature_ = s;
                break;
              }
              case 50: {
                String s = input.readStringRequireUtf8();

                publicKeyUrl_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.AccountGameCenter.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.AccountGameCenter)
  private static final com.heroiclabs.nakama.api.AccountGameCenter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AccountGameCenter();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.AccountGameCenter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AccountGameCenter> PARSER;

  public static com.google.protobuf.Parser<AccountGameCenter> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

