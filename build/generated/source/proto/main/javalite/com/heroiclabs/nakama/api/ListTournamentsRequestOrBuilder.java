// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface ListTournamentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListTournamentsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  boolean hasCategoryStart();
  /**
   * <pre>
   * The start of the categories to include. Defaults to 0.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_start = 1;</code>
   */
  com.google.protobuf.UInt32Value getCategoryStart();

  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  boolean hasCategoryEnd();
  /**
   * <pre>
   * The end of the categories to include. Defaults to 128.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value category_end = 2;</code>
   */
  com.google.protobuf.UInt32Value getCategoryEnd();

  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The start time for tournaments. Defaults to epoch.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value start_time = 3;</code>
   */
  com.google.protobuf.UInt32Value getStartTime();

  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The end time for tournaments. Defaults to +1 year from current Unix time.
   * </pre>
   *
   * <code>optional .google.protobuf.UInt32Value end_time = 4;</code>
   */
  com.google.protobuf.UInt32Value getEndTime();

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 6;</code>
   */
  com.google.protobuf.Int32Value getLimit();

  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A next page cursor for listings (optional).
   * </pre>
   *
   * <code>optional string cursor = 8;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
