// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * A list of users belonging to a group, along with their role.
 * </pre>
 *
 * Protobuf type {@code nakama.api.GroupUserList}
 */
public  final class GroupUserList extends
    com.google.protobuf.GeneratedMessageLite<
        GroupUserList, GroupUserList.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.GroupUserList)
    GroupUserListOrBuilder {
  private GroupUserList() {
    groupUsers_ = emptyProtobufList();
  }
  public interface GroupUserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:nakama.api.GroupUserList.GroupUser)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    boolean hasUser();
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    com.heroiclabs.nakama.api.User getUser();

    /**
     * <pre>
     * Their relationship to the group.
     * </pre>
     *
     * <code>optional int32 state = 2;</code>
     */
    int getState();
  }
  /**
   * <pre>
   * A single user-role pair.
   * </pre>
   *
   * Protobuf type {@code nakama.api.GroupUserList.GroupUser}
   */
  public  static final class GroupUser extends
      com.google.protobuf.GeneratedMessageLite<
          GroupUser, GroupUser.Builder> implements
      // @@protoc_insertion_point(message_implements:nakama.api.GroupUserList.GroupUser)
      GroupUserOrBuilder {
    private GroupUser() {
    }
    /**
     * <pre>
     * The group role status.
     * </pre>
     *
     * Protobuf enum {@code nakama.api.GroupUserList.GroupUser.State}
     */
    public enum State
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <pre>
       * Default case. Assumed as SUPERADMIN state.
       * </pre>
       *
       * <code>STATE_UNSPECIFIED = 0;</code>
       */
      STATE_UNSPECIFIED(0),
      /**
       * <pre>
       * The user is a superadmin with full control of the group.
       * </pre>
       *
       * <code>SUPERADMIN = 1;</code>
       */
      SUPERADMIN(1),
      /**
       * <pre>
       * The user is an admin with additional privileges.
       * </pre>
       *
       * <code>ADMIN = 2;</code>
       */
      ADMIN(2),
      /**
       * <pre>
       * The user is a regular member.
       * </pre>
       *
       * <code>MEMBER = 3;</code>
       */
      MEMBER(3),
      /**
       * <pre>
       * The user has requested to join the group
       * </pre>
       *
       * <code>JOIN_REQUEST = 4;</code>
       */
      JOIN_REQUEST(4),
      UNRECOGNIZED(-1),
      ;

      /**
       * <pre>
       * Default case. Assumed as SUPERADMIN state.
       * </pre>
       *
       * <code>STATE_UNSPECIFIED = 0;</code>
       */
      public static final int STATE_UNSPECIFIED_VALUE = 0;
      /**
       * <pre>
       * The user is a superadmin with full control of the group.
       * </pre>
       *
       * <code>SUPERADMIN = 1;</code>
       */
      public static final int SUPERADMIN_VALUE = 1;
      /**
       * <pre>
       * The user is an admin with additional privileges.
       * </pre>
       *
       * <code>ADMIN = 2;</code>
       */
      public static final int ADMIN_VALUE = 2;
      /**
       * <pre>
       * The user is a regular member.
       * </pre>
       *
       * <code>MEMBER = 3;</code>
       */
      public static final int MEMBER_VALUE = 3;
      /**
       * <pre>
       * The user has requested to join the group
       * </pre>
       *
       * <code>JOIN_REQUEST = 4;</code>
       */
      public static final int JOIN_REQUEST_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_UNSPECIFIED;
          case 1: return SUPERADMIN;
          case 2: return ADMIN;
          case 3: return MEMBER;
          case 4: return JOIN_REQUEST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:nakama.api.GroupUserList.GroupUser.State)
    }

    public static final int USER_FIELD_NUMBER = 1;
    private com.heroiclabs.nakama.api.User user_;
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    public com.heroiclabs.nakama.api.User getUser() {
      return user_ == null ? com.heroiclabs.nakama.api.User.getDefaultInstance() : user_;
    }
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    private void setUser(com.heroiclabs.nakama.api.User value) {
      if (value == null) {
        throw new NullPointerException();
      }
      user_ = value;
      
      }
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    private void setUser(
        com.heroiclabs.nakama.api.User.Builder builderForValue) {
      user_ = builderForValue.build();
      
    }
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    private void mergeUser(com.heroiclabs.nakama.api.User value) {
      if (user_ != null &&
          user_ != com.heroiclabs.nakama.api.User.getDefaultInstance()) {
        user_ =
          com.heroiclabs.nakama.api.User.newBuilder(user_).mergeFrom(value).buildPartial();
      } else {
        user_ = value;
      }
      
    }
    /**
     * <pre>
     * User.
     * </pre>
     *
     * <code>optional .nakama.api.User user = 1;</code>
     */
    private void clearUser() {  user_ = null;
      
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <pre>
     * Their relationship to the group.
     * </pre>
     *
     * <code>optional int32 state = 2;</code>
     */
    public int getState() {
      return state_;
    }
    /**
     * <pre>
     * Their relationship to the group.
     * </pre>
     *
     * <code>optional int32 state = 2;</code>
     */
    private void setState(int value) {
      
      state_ = value;
    }
    /**
     * <pre>
     * Their relationship to the group.
     * </pre>
     *
     * <code>optional int32 state = 2;</code>
     */
    private void clearState() {
      
      state_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (user_ != null) {
        output.writeMessage(1, getUser());
      }
      if (state_ != 0) {
        output.writeInt32(2, state_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUser());
      }
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, state_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.heroiclabs.nakama.api.GroupUserList.GroupUser prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * A single user-role pair.
     * </pre>
     *
     * Protobuf type {@code nakama.api.GroupUserList.GroupUser}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.heroiclabs.nakama.api.GroupUserList.GroupUser, Builder> implements
        // @@protoc_insertion_point(builder_implements:nakama.api.GroupUserList.GroupUser)
        com.heroiclabs.nakama.api.GroupUserList.GroupUserOrBuilder {
      // Construct using com.heroiclabs.nakama.api.GroupUserList.GroupUser.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public boolean hasUser() {
        return instance.hasUser();
      }
      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public com.heroiclabs.nakama.api.User getUser() {
        return instance.getUser();
      }
      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public Builder setUser(com.heroiclabs.nakama.api.User value) {
        copyOnWrite();
        instance.setUser(value);
        return this;
        }
      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public Builder setUser(
          com.heroiclabs.nakama.api.User.Builder builderForValue) {
        copyOnWrite();
        instance.setUser(builderForValue);
        return this;
      }
      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public Builder mergeUser(com.heroiclabs.nakama.api.User value) {
        copyOnWrite();
        instance.mergeUser(value);
        return this;
      }
      /**
       * <pre>
       * User.
       * </pre>
       *
       * <code>optional .nakama.api.User user = 1;</code>
       */
      public Builder clearUser() {  copyOnWrite();
        instance.clearUser();
        return this;
      }

      /**
       * <pre>
       * Their relationship to the group.
       * </pre>
       *
       * <code>optional int32 state = 2;</code>
       */
      public int getState() {
        return instance.getState();
      }
      /**
       * <pre>
       * Their relationship to the group.
       * </pre>
       *
       * <code>optional int32 state = 2;</code>
       */
      public Builder setState(int value) {
        copyOnWrite();
        instance.setState(value);
        return this;
      }
      /**
       * <pre>
       * Their relationship to the group.
       * </pre>
       *
       * <code>optional int32 state = 2;</code>
       */
      public Builder clearState() {
        copyOnWrite();
        instance.clearState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:nakama.api.GroupUserList.GroupUser)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.heroiclabs.nakama.api.GroupUserList.GroupUser();
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
          com.heroiclabs.nakama.api.GroupUserList.GroupUser other = (com.heroiclabs.nakama.api.GroupUserList.GroupUser) arg1;
          user_ = visitor.visitMessage(user_, other.user_);
          state_ = visitor.visitInt(state_ != 0, state_,
              other.state_ != 0, other.state_);
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
                  com.heroiclabs.nakama.api.User.Builder subBuilder = null;
                  if (user_ != null) {
                    subBuilder = user_.toBuilder();
                  }
                  user_ = input.readMessage(com.heroiclabs.nakama.api.User.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(user_);
                    user_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  state_ = input.readInt32();
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
          if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.GroupUserList.GroupUser.class) {
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


    // @@protoc_insertion_point(class_scope:nakama.api.GroupUserList.GroupUser)
    private static final com.heroiclabs.nakama.api.GroupUserList.GroupUser DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GroupUser();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.heroiclabs.nakama.api.GroupUserList.GroupUser getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<GroupUser> PARSER;

    public static com.google.protobuf.Parser<GroupUser> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public static final int GROUP_USERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.api.GroupUserList.GroupUser> groupUsers_;
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  public java.util.List<com.heroiclabs.nakama.api.GroupUserList.GroupUser> getGroupUsersList() {
    return groupUsers_;
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.api.GroupUserList.GroupUserOrBuilder> 
      getGroupUsersOrBuilderList() {
    return groupUsers_;
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  public int getGroupUsersCount() {
    return groupUsers_.size();
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  public com.heroiclabs.nakama.api.GroupUserList.GroupUser getGroupUsers(int index) {
    return groupUsers_.get(index);
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  public com.heroiclabs.nakama.api.GroupUserList.GroupUserOrBuilder getGroupUsersOrBuilder(
      int index) {
    return groupUsers_.get(index);
  }
  private void ensureGroupUsersIsMutable() {
    if (!groupUsers_.isModifiable()) {
      groupUsers_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(groupUsers_);
     }
  }

  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void setGroupUsers(
      int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureGroupUsersIsMutable();
    groupUsers_.set(index, value);
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void setGroupUsers(
      int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
    ensureGroupUsersIsMutable();
    groupUsers_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void addGroupUsers(com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureGroupUsersIsMutable();
    groupUsers_.add(value);
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void addGroupUsers(
      int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureGroupUsersIsMutable();
    groupUsers_.add(index, value);
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void addGroupUsers(
      com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
    ensureGroupUsersIsMutable();
    groupUsers_.add(builderForValue.build());
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void addGroupUsers(
      int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
    ensureGroupUsersIsMutable();
    groupUsers_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void addAllGroupUsers(
      java.lang.Iterable<? extends com.heroiclabs.nakama.api.GroupUserList.GroupUser> values) {
    ensureGroupUsersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, groupUsers_);
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void clearGroupUsers() {
    groupUsers_ = emptyProtobufList();
  }
  /**
   * <pre>
   * User-role pairs for a group.
   * </pre>
   *
   * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
   */
  private void removeGroupUsers(int index) {
    ensureGroupUsersIsMutable();
    groupUsers_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < groupUsers_.size(); i++) {
      output.writeMessage(1, groupUsers_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < groupUsers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groupUsers_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.GroupUserList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.GroupUserList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A list of users belonging to a group, along with their role.
   * </pre>
   *
   * Protobuf type {@code nakama.api.GroupUserList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.GroupUserList, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.GroupUserList)
      com.heroiclabs.nakama.api.GroupUserListOrBuilder {
    // Construct using com.heroiclabs.nakama.api.GroupUserList.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public java.util.List<com.heroiclabs.nakama.api.GroupUserList.GroupUser> getGroupUsersList() {
      return java.util.Collections.unmodifiableList(
          instance.getGroupUsersList());
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public int getGroupUsersCount() {
      return instance.getGroupUsersCount();
    }/**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public com.heroiclabs.nakama.api.GroupUserList.GroupUser getGroupUsers(int index) {
      return instance.getGroupUsers(index);
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder setGroupUsers(
        int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
      copyOnWrite();
      instance.setGroupUsers(index, value);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder setGroupUsers(
        int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
      copyOnWrite();
      instance.setGroupUsers(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder addGroupUsers(com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
      copyOnWrite();
      instance.addGroupUsers(value);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder addGroupUsers(
        int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser value) {
      copyOnWrite();
      instance.addGroupUsers(index, value);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder addGroupUsers(
        com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
      copyOnWrite();
      instance.addGroupUsers(builderForValue);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder addGroupUsers(
        int index, com.heroiclabs.nakama.api.GroupUserList.GroupUser.Builder builderForValue) {
      copyOnWrite();
      instance.addGroupUsers(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder addAllGroupUsers(
        java.lang.Iterable<? extends com.heroiclabs.nakama.api.GroupUserList.GroupUser> values) {
      copyOnWrite();
      instance.addAllGroupUsers(values);
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder clearGroupUsers() {
      copyOnWrite();
      instance.clearGroupUsers();
      return this;
    }
    /**
     * <pre>
     * User-role pairs for a group.
     * </pre>
     *
     * <code>repeated .nakama.api.GroupUserList.GroupUser group_users = 1;</code>
     */
    public Builder removeGroupUsers(int index) {
      copyOnWrite();
      instance.removeGroupUsers(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.GroupUserList)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.GroupUserList();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        groupUsers_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.GroupUserList other = (com.heroiclabs.nakama.api.GroupUserList) arg1;
        groupUsers_= visitor.visitList(groupUsers_, other.groupUsers_);
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
                if (!groupUsers_.isModifiable()) {
                  groupUsers_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(groupUsers_);
                }
                groupUsers_.add(
                    input.readMessage(com.heroiclabs.nakama.api.GroupUserList.GroupUser.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.GroupUserList.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.GroupUserList)
  private static final com.heroiclabs.nakama.api.GroupUserList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GroupUserList();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.GroupUserList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GroupUserList> PARSER;

  public static com.google.protobuf.Parser<GroupUserList> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
