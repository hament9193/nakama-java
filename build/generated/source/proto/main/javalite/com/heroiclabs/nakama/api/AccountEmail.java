// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Send an email with password to the server. Used with authenticate/link/unlink.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AccountEmail}
 */
public  final class AccountEmail extends
    com.google.protobuf.GeneratedMessageLite<
        AccountEmail, AccountEmail.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.AccountEmail)
    AccountEmailOrBuilder {
  private AccountEmail() {
    email_ = "";
    password_ = "";
  }
  public static final int EMAIL_FIELD_NUMBER = 1;
  private java.lang.String email_;
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  public java.lang.String getEmail() {
    return email_;
  }
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(email_);
  }
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  private void setEmail(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    email_ = value;
  }
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  private void clearEmail() {
    
    email_ = getDefaultInstance().getEmail();
  }
  /**
   * <pre>
   * A valid RFC-5322 email address.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   */
  private void setEmailBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    email_ = value.toStringUtf8();
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private java.lang.String password_;
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  public java.lang.String getPassword() {
    return password_;
  }
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(password_);
  }
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  private void setPassword(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    password_ = value;
  }
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  private void clearPassword() {
    
    password_ = getDefaultInstance().getPassword();
  }
  /**
   * <pre>
   * A password for the user account.
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  private void setPasswordBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    password_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!email_.isEmpty()) {
      output.writeString(1, getEmail());
    }
    if (!password_.isEmpty()) {
      output.writeString(2, getPassword());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!email_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getEmail());
    }
    if (!password_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getPassword());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountEmail parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.AccountEmail prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Send an email with password to the server. Used with authenticate/link/unlink.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AccountEmail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.AccountEmail, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AccountEmail)
      com.heroiclabs.nakama.api.AccountEmailOrBuilder {
    // Construct using com.heroiclabs.nakama.api.AccountEmail.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A valid RFC-5322 email address.
     * </pre>
     *
     * <code>optional string email = 1;</code>
     */
    public java.lang.String getEmail() {
      return instance.getEmail();
    }
    /**
     * <pre>
     * A valid RFC-5322 email address.
     * </pre>
     *
     * <code>optional string email = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      return instance.getEmailBytes();
    }
    /**
     * <pre>
     * A valid RFC-5322 email address.
     * </pre>
     *
     * <code>optional string email = 1;</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      copyOnWrite();
      instance.setEmail(value);
      return this;
    }
    /**
     * <pre>
     * A valid RFC-5322 email address.
     * </pre>
     *
     * <code>optional string email = 1;</code>
     */
    public Builder clearEmail() {
      copyOnWrite();
      instance.clearEmail();
      return this;
    }
    /**
     * <pre>
     * A valid RFC-5322 email address.
     * </pre>
     *
     * <code>optional string email = 1;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEmailBytes(value);
      return this;
    }

    /**
     * <pre>
     * A password for the user account.
     * </pre>
     *
     * <code>optional string password = 2;</code>
     */
    public java.lang.String getPassword() {
      return instance.getPassword();
    }
    /**
     * <pre>
     * A password for the user account.
     * </pre>
     *
     * <code>optional string password = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      return instance.getPasswordBytes();
    }
    /**
     * <pre>
     * A password for the user account.
     * </pre>
     *
     * <code>optional string password = 2;</code>
     */
    public Builder setPassword(
        java.lang.String value) {
      copyOnWrite();
      instance.setPassword(value);
      return this;
    }
    /**
     * <pre>
     * A password for the user account.
     * </pre>
     *
     * <code>optional string password = 2;</code>
     */
    public Builder clearPassword() {
      copyOnWrite();
      instance.clearPassword();
      return this;
    }
    /**
     * <pre>
     * A password for the user account.
     * </pre>
     *
     * <code>optional string password = 2;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPasswordBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AccountEmail)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.AccountEmail();
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
        com.heroiclabs.nakama.api.AccountEmail other = (com.heroiclabs.nakama.api.AccountEmail) arg1;
        email_ = visitor.visitString(!email_.isEmpty(), email_,
            !other.email_.isEmpty(), other.email_);
        password_ = visitor.visitString(!password_.isEmpty(), password_,
            !other.password_.isEmpty(), other.password_);
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

                email_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                password_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.AccountEmail.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.AccountEmail)
  private static final com.heroiclabs.nakama.api.AccountEmail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AccountEmail();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.AccountEmail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AccountEmail> PARSER;

  public static com.google.protobuf.Parser<AccountEmail> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

