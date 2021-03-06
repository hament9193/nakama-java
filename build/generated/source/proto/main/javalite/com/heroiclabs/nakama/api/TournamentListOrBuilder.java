// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface TournamentListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.TournamentList)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Tournament> 
      getTournamentsList();
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  com.heroiclabs.nakama.api.Tournament getTournaments(int index);
  /**
   * <pre>
   * The list of tournaments returned.
   * </pre>
   *
   * <code>repeated .nakama.api.Tournament tournaments = 1;</code>
   */
  int getTournamentsCount();

  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A pagination cursor (optional).
   * </pre>
   *
   * <code>optional string cursor = 2;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();
}
