// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session_entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public interface GetSessionEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;` or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
   * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display
   * Name&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the session entity type. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;` or `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
   * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type Display
   * Name&gt;`. If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
