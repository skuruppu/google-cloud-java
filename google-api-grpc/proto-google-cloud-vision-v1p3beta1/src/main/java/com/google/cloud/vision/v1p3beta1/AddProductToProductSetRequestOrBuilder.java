// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

public interface AddProductToProductSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.AddProductToProductSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name for the ProductSet to modify.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name for the ProductSet to modify.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource name for the Product to be added to this ProductSet.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
   * </pre>
   *
   * <code>string product = 2;</code>
   */
  java.lang.String getProduct();
  /**
   * <pre>
   * The resource name for the Product to be added to this ProductSet.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
   * </pre>
   *
   * <code>string product = 2;</code>
   */
  com.google.protobuf.ByteString
      getProductBytes();
}
