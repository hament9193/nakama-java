// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface SessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.Session)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * True if the corresponding account was just created, false otherwise.
   * </pre>
   *
   * <code>optional bool created = 1;</code>
   */
  boolean getCreated();

  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   * Authentication credentials.
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
