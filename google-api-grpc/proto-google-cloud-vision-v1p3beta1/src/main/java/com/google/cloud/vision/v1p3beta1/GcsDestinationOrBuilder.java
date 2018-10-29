// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

public interface GcsDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google Cloud Storage URI where the results will be stored. Results will
   * be in JSON format and preceded by its corresponding input URI. This field
   * can either represent a single file, or a prefix for multiple outputs.
   * Prefixes must end in a `/`.
   * Examples:
   * *    File: gs://bucket-name/filename.json
   * *    Prefix: gs://bucket-name/prefix/here/
   * *    File: gs://bucket-name/prefix/here
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Google Cloud Storage URI where the results will be stored. Results will
   * be in JSON format and preceded by its corresponding input URI. This field
   * can either represent a single file, or a prefix for multiple outputs.
   * Prefixes must end in a `/`.
   * Examples:
   * *    File: gs://bucket-name/filename.json
   * *    Prefix: gs://bucket-name/prefix/here/
   * *    File: gs://bucket-name/prefix/here
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
