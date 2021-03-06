// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface WriteTournamentRecordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.WriteTournamentRecordRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The tournament ID to write the record for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  java.lang.String getTournamentId();
  /**
   * <pre>
   * The tournament ID to write the record for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getTournamentIdBytes();

  /**
   * <pre>
   * Record input.
   * </pre>
   *
   * <code>optional .nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite record = 2;</code>
   */
  boolean hasRecord();
  /**
   * <pre>
   * Record input.
   * </pre>
   *
   * <code>optional .nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite record = 2;</code>
   */
  com.heroiclabs.nakama.api.WriteTournamentRecordRequest.TournamentRecordWrite getRecord();
}
