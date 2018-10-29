// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1beta1/assets.proto

package com.google.cloud.asset.v1beta1;

public interface AssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1beta1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full name of the asset. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The full name of the asset. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more information.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of the asset. Example: "google.compute.disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  java.lang.String getAssetType();
  /**
   * <pre>
   * Type of the asset. Example: "google.compute.disk".
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssetTypeBytes();

  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  boolean hasResource();
  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  com.google.cloud.asset.v1beta1.Resource getResource();
  /**
   * <pre>
   * Representation of the resource.
   * </pre>
   *
   * <code>.google.cloud.asset.v1beta1.Resource resource = 3;</code>
   */
  com.google.cloud.asset.v1beta1.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each
   * resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  boolean hasIamPolicy();
  /**
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each
   * resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  com.google.iam.v1.Policy getIamPolicy();
  /**
   * <pre>
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each
   * resource, there must be at most one Cloud IAM policy set on it.
   * </pre>
   *
   * <code>.google.iam.v1.Policy iam_policy = 4;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getIamPolicyOrBuilder();
}
