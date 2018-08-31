// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List leaderboard records from a given leaderboard.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListLeaderboardRecordsRequest}
 */
public  final class ListLeaderboardRecordsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListLeaderboardRecordsRequest, ListLeaderboardRecordsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListLeaderboardRecordsRequest)
    ListLeaderboardRecordsRequestOrBuilder {
  private ListLeaderboardRecordsRequest() {
    leaderboardId_ = "";
    ownerIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    cursor_ = "";
  }
  private int bitField0_;
  public static final int LEADERBOARD_ID_FIELD_NUMBER = 1;
  private java.lang.String leaderboardId_;
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  public java.lang.String getLeaderboardId() {
    return leaderboardId_;
  }
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLeaderboardIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(leaderboardId_);
  }
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  private void setLeaderboardId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    leaderboardId_ = value;
  }
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  private void clearLeaderboardId() {
    
    leaderboardId_ = getDefaultInstance().getLeaderboardId();
  }
  /**
   * <pre>
   * The ID of the leaderboard to list for.
   * </pre>
   *
   * <code>optional string leaderboard_id = 1;</code>
   */
  private void setLeaderboardIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    leaderboardId_ = value.toStringUtf8();
  }

  public static final int OWNER_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> ownerIds_;
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  public java.util.List<String> getOwnerIdsList() {
    return ownerIds_;
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  public int getOwnerIdsCount() {
    return ownerIds_.size();
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  public java.lang.String getOwnerIds(int index) {
    return ownerIds_.get(index);
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerIdsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        ownerIds_.get(index));
  }
  private void ensureOwnerIdsIsMutable() {
    if (!ownerIds_.isModifiable()) {
      ownerIds_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(ownerIds_);
     }
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  private void setOwnerIds(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureOwnerIdsIsMutable();
    ownerIds_.set(index, value);
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  private void addOwnerIds(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureOwnerIdsIsMutable();
    ownerIds_.add(value);
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  private void addAllOwnerIds(
      java.lang.Iterable<java.lang.String> values) {
    ensureOwnerIdsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, ownerIds_);
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  private void clearOwnerIds() {
    ownerIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  private void addOwnerIdsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureOwnerIdsIsMutable();
    ownerIds_.add(value.toStringUtf8());
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  private void setLimit(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  private void setLimit(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  private void mergeLimit(com.google.protobuf.Int32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.Int32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int CURSOR_FIELD_NUMBER = 4;
  private java.lang.String cursor_;
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  public java.lang.String getCursor() {
    return cursor_;
  }
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cursor_);
  }
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void setCursor(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cursor_ = value;
  }
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void clearCursor() {
    
    cursor_ = getDefaultInstance().getCursor();
  }
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  private void setCursorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cursor_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!leaderboardId_.isEmpty()) {
      output.writeString(1, getLeaderboardId());
    }
    for (int i = 0; i < ownerIds_.size(); i++) {
      output.writeString(2, ownerIds_.get(i));
    }
    if (limit_ != null) {
      output.writeMessage(3, getLimit());
    }
    if (!cursor_.isEmpty()) {
      output.writeString(4, getCursor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!leaderboardId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getLeaderboardId());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ownerIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(ownerIds_.get(i));
      }
      size += dataSize;
      size += 1 * getOwnerIdsList().size();
    }
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLimit());
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getCursor());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List leaderboard records from a given leaderboard.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListLeaderboardRecordsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListLeaderboardRecordsRequest)
      com.heroiclabs.nakama.api.ListLeaderboardRecordsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ID of the leaderboard to list for.
     * </pre>
     *
     * <code>optional string leaderboard_id = 1;</code>
     */
    public java.lang.String getLeaderboardId() {
      return instance.getLeaderboardId();
    }
    /**
     * <pre>
     * The ID of the leaderboard to list for.
     * </pre>
     *
     * <code>optional string leaderboard_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLeaderboardIdBytes() {
      return instance.getLeaderboardIdBytes();
    }
    /**
     * <pre>
     * The ID of the leaderboard to list for.
     * </pre>
     *
     * <code>optional string leaderboard_id = 1;</code>
     */
    public Builder setLeaderboardId(
        java.lang.String value) {
      copyOnWrite();
      instance.setLeaderboardId(value);
      return this;
    }
    /**
     * <pre>
     * The ID of the leaderboard to list for.
     * </pre>
     *
     * <code>optional string leaderboard_id = 1;</code>
     */
    public Builder clearLeaderboardId() {
      copyOnWrite();
      instance.clearLeaderboardId();
      return this;
    }
    /**
     * <pre>
     * The ID of the leaderboard to list for.
     * </pre>
     *
     * <code>optional string leaderboard_id = 1;</code>
     */
    public Builder setLeaderboardIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLeaderboardIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public java.util.List<String>
        getOwnerIdsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOwnerIdsList());
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public int getOwnerIdsCount() {
      return instance.getOwnerIdsCount();
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public java.lang.String getOwnerIds(int index) {
      return instance.getOwnerIds(index);
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerIdsBytes(int index) {
      return instance.getOwnerIdsBytes(index);
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public Builder setOwnerIds(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setOwnerIds(index, value);
      return this;
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public Builder addOwnerIds(
        java.lang.String value) {
      copyOnWrite();
      instance.addOwnerIds(value);
      return this;
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public Builder addAllOwnerIds(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllOwnerIds(values);
      return this;
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public Builder clearOwnerIds() {
      copyOnWrite();
      instance.clearOwnerIds();
      return this;
    }
    /**
     * <pre>
     * One or more owners to retrieve records for.
     * </pre>
     *
     * <code>repeated string owner_ids = 2;</code>
     */
    public Builder addOwnerIdsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addOwnerIdsBytes(value);
      return this;
    }

    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public com.google.protobuf.Int32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 3;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * A next or previous page cursor.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public java.lang.String getCursor() {
      return instance.getCursor();
    }
    /**
     * <pre>
     * A next or previous page cursor.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      return instance.getCursorBytes();
    }
    /**
     * <pre>
     * A next or previous page cursor.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder setCursor(
        java.lang.String value) {
      copyOnWrite();
      instance.setCursor(value);
      return this;
    }
    /**
     * <pre>
     * A next or previous page cursor.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder clearCursor() {
      copyOnWrite();
      instance.clearCursor();
      return this;
    }
    /**
     * <pre>
     * A next or previous page cursor.
     * </pre>
     *
     * <code>optional string cursor = 4;</code>
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCursorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListLeaderboardRecordsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        ownerIds_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest other = (com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest) arg1;
        leaderboardId_ = visitor.visitString(!leaderboardId_.isEmpty(), leaderboardId_,
            !other.leaderboardId_.isEmpty(), other.leaderboardId_);
        ownerIds_= visitor.visitList(ownerIds_, other.ownerIds_);
        limit_ = visitor.visitMessage(limit_, other.limit_);
        cursor_ = visitor.visitString(!cursor_.isEmpty(), cursor_,
            !other.cursor_.isEmpty(), other.cursor_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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

                leaderboardId_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();
                if (!ownerIds_.isModifiable()) {
                  ownerIds_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(ownerIds_);
                }
                ownerIds_.add(s);
                break;
              }
              case 26: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                cursor_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ListLeaderboardRecordsRequest)
  private static final com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListLeaderboardRecordsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListLeaderboardRecordsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListLeaderboardRecordsRequest> PARSER;

  public static com.google.protobuf.Parser<ListLeaderboardRecordsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

