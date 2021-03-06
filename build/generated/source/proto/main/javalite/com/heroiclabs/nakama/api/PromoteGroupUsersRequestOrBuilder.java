// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface PromoteGroupUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.PromoteGroupUsersRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The group ID to promote in.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The group ID to promote in.
   * </pre>
   *
   * <code>optional string group_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The users to promote.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  java.util.List<String>
      getUserIdsList();
  /**
   * <pre>
   * The users to promote.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  int getUserIdsCount();
  /**
   * <pre>
   * The users to promote.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  java.lang.String getUserIds(int index);
  /**
   * <pre>
   * The users to promote.
   * </pre>
   *
   * <code>repeated string user_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);
}
