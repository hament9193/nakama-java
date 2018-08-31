// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface ListNotificationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListNotificationsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The number of notifications to get. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * The number of notifications to get. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  com.google.protobuf.Int32Value getLimit();

  /**
   * <pre>
   * A cursor to page through notifications. May be cached by clients to get from point in time forwards.
   * </pre>
   *
   * <code>optional string cacheable_cursor = 2;</code>
   */
  java.lang.String getCacheableCursor();
  /**
   * <pre>
   * A cursor to page through notifications. May be cached by clients to get from point in time forwards.
   * </pre>
   *
   * <code>optional string cacheable_cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getCacheableCursorBytes();
}
