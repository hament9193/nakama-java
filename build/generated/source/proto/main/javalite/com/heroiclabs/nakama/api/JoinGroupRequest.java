// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Immediately join an open group, or request to join a closed one.
 * </pre>
 *
 * Protobuf type {@code nakama.api.JoinGroupRequest}
 */
public  final class JoinGroupRequest extends
    com.google.protobuf.GeneratedMessageLite<
        JoinGroupRequest, JoinGroupRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.JoinGroupRequest)
    JoinGroupRequestOrBuilder {
  private JoinGroupRequest() {
    groupId_ = "";
  }
  public static final int GROUP_ID_FIELD_NUMBER = 1;
  private java.lang.String groupId_;
  /**
   * <pre>
   * The group ID to join.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  public java.lang.String getGroupId() {
    return groupId_;
  }
  /**
   * <pre>
   * The group ID to join.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(groupId_);
  }
  /**
   * <pre>
   * The group ID to join.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void setGroupId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    groupId_ = value;
  }
  /**
   * <pre>
   * The group ID to join.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void clearGroupId() {
    
    groupId_ = getDefaultInstance().getGroupId();
  }
  /**
   * <pre>
   * The group ID to join.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  private void setGroupIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    groupId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!groupId_.isEmpty()) {
      output.writeString(1, getGroupId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!groupId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getGroupId());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.JoinGroupRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Immediately join an open group, or request to join a closed one.
   * </pre>
   *
   * Protobuf type {@code nakama.api.JoinGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.JoinGroupRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.JoinGroupRequest)
      com.heroiclabs.nakama.api.JoinGroupRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.JoinGroupRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The group ID to join.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public java.lang.String getGroupId() {
      return instance.getGroupId();
    }
    /**
     * <pre>
     * The group ID to join.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      return instance.getGroupIdBytes();
    }
    /**
     * <pre>
     * The group ID to join.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder setGroupId(
        java.lang.String value) {
      copyOnWrite();
      instance.setGroupId(value);
      return this;
    }
    /**
     * <pre>
     * The group ID to join.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder clearGroupId() {
      copyOnWrite();
      instance.clearGroupId();
      return this;
    }
    /**
     * <pre>
     * The group ID to join.
     * </pre>
     *
     * <code>optional string group_id = 1;</code>
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGroupIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.JoinGroupRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.JoinGroupRequest();
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
        com.heroiclabs.nakama.api.JoinGroupRequest other = (com.heroiclabs.nakama.api.JoinGroupRequest) arg1;
        groupId_ = visitor.visitString(!groupId_.isEmpty(), groupId_,
            !other.groupId_.isEmpty(), other.groupId_);
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

                groupId_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.JoinGroupRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.JoinGroupRequest)
  private static final com.heroiclabs.nakama.api.JoinGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new JoinGroupRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.JoinGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<JoinGroupRequest> PARSER;

  public static com.google.protobuf.Parser<JoinGroupRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

