// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

package io.grafeas.v1beta1.attestation;

/**
 * <pre>
 * Details of an attestation occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.attestation.Details}
 */
public  final class Details extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.attestation.Details)
    DetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Details() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Details(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.grafeas.v1beta1.attestation.Attestation.Builder subBuilder = null;
            if (attestation_ != null) {
              subBuilder = attestation_.toBuilder();
            }
            attestation_ = input.readMessage(io.grafeas.v1beta1.attestation.Attestation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(attestation_);
              attestation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.attestation.AttestationOuterClass.internal_static_grafeas_v1beta1_attestation_Details_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.attestation.AttestationOuterClass.internal_static_grafeas_v1beta1_attestation_Details_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.attestation.Details.class, io.grafeas.v1beta1.attestation.Details.Builder.class);
  }

  public static final int ATTESTATION_FIELD_NUMBER = 1;
  private io.grafeas.v1beta1.attestation.Attestation attestation_;
  /**
   * <pre>
   * Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   */
  public boolean hasAttestation() {
    return attestation_ != null;
  }
  /**
   * <pre>
   * Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   */
  public io.grafeas.v1beta1.attestation.Attestation getAttestation() {
    return attestation_ == null ? io.grafeas.v1beta1.attestation.Attestation.getDefaultInstance() : attestation_;
  }
  /**
   * <pre>
   * Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   */
  public io.grafeas.v1beta1.attestation.AttestationOrBuilder getAttestationOrBuilder() {
    return getAttestation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (attestation_ != null) {
      output.writeMessage(1, getAttestation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attestation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAttestation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grafeas.v1beta1.attestation.Details)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.attestation.Details other = (io.grafeas.v1beta1.attestation.Details) obj;

    boolean result = true;
    result = result && (hasAttestation() == other.hasAttestation());
    if (hasAttestation()) {
      result = result && getAttestation()
          .equals(other.getAttestation());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAttestation()) {
      hash = (37 * hash) + ATTESTATION_FIELD_NUMBER;
      hash = (53 * hash) + getAttestation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.attestation.Details parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.attestation.Details parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.attestation.Details parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grafeas.v1beta1.attestation.Details prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Details of an attestation occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.attestation.Details}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.attestation.Details)
      io.grafeas.v1beta1.attestation.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.attestation.AttestationOuterClass.internal_static_grafeas_v1beta1_attestation_Details_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.attestation.AttestationOuterClass.internal_static_grafeas_v1beta1_attestation_Details_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.attestation.Details.class, io.grafeas.v1beta1.attestation.Details.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.attestation.Details.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attestationBuilder_ == null) {
        attestation_ = null;
      } else {
        attestation_ = null;
        attestationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.attestation.AttestationOuterClass.internal_static_grafeas_v1beta1_attestation_Details_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.attestation.Details getDefaultInstanceForType() {
      return io.grafeas.v1beta1.attestation.Details.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.attestation.Details build() {
      io.grafeas.v1beta1.attestation.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.attestation.Details buildPartial() {
      io.grafeas.v1beta1.attestation.Details result = new io.grafeas.v1beta1.attestation.Details(this);
      if (attestationBuilder_ == null) {
        result.attestation_ = attestation_;
      } else {
        result.attestation_ = attestationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.attestation.Details) {
        return mergeFrom((io.grafeas.v1beta1.attestation.Details)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.attestation.Details other) {
      if (other == io.grafeas.v1beta1.attestation.Details.getDefaultInstance()) return this;
      if (other.hasAttestation()) {
        mergeAttestation(other.getAttestation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grafeas.v1beta1.attestation.Details parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.attestation.Details) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grafeas.v1beta1.attestation.Attestation attestation_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.attestation.Attestation, io.grafeas.v1beta1.attestation.Attestation.Builder, io.grafeas.v1beta1.attestation.AttestationOrBuilder> attestationBuilder_;
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public boolean hasAttestation() {
      return attestationBuilder_ != null || attestation_ != null;
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public io.grafeas.v1beta1.attestation.Attestation getAttestation() {
      if (attestationBuilder_ == null) {
        return attestation_ == null ? io.grafeas.v1beta1.attestation.Attestation.getDefaultInstance() : attestation_;
      } else {
        return attestationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public Builder setAttestation(io.grafeas.v1beta1.attestation.Attestation value) {
      if (attestationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attestation_ = value;
        onChanged();
      } else {
        attestationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public Builder setAttestation(
        io.grafeas.v1beta1.attestation.Attestation.Builder builderForValue) {
      if (attestationBuilder_ == null) {
        attestation_ = builderForValue.build();
        onChanged();
      } else {
        attestationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public Builder mergeAttestation(io.grafeas.v1beta1.attestation.Attestation value) {
      if (attestationBuilder_ == null) {
        if (attestation_ != null) {
          attestation_ =
            io.grafeas.v1beta1.attestation.Attestation.newBuilder(attestation_).mergeFrom(value).buildPartial();
        } else {
          attestation_ = value;
        }
        onChanged();
      } else {
        attestationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public Builder clearAttestation() {
      if (attestationBuilder_ == null) {
        attestation_ = null;
        onChanged();
      } else {
        attestation_ = null;
        attestationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public io.grafeas.v1beta1.attestation.Attestation.Builder getAttestationBuilder() {
      
      onChanged();
      return getAttestationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    public io.grafeas.v1beta1.attestation.AttestationOrBuilder getAttestationOrBuilder() {
      if (attestationBuilder_ != null) {
        return attestationBuilder_.getMessageOrBuilder();
      } else {
        return attestation_ == null ?
            io.grafeas.v1beta1.attestation.Attestation.getDefaultInstance() : attestation_;
      }
    }
    /**
     * <pre>
     * Attestation for the resource.
     * </pre>
     *
     * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grafeas.v1beta1.attestation.Attestation, io.grafeas.v1beta1.attestation.Attestation.Builder, io.grafeas.v1beta1.attestation.AttestationOrBuilder> 
        getAttestationFieldBuilder() {
      if (attestationBuilder_ == null) {
        attestationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.attestation.Attestation, io.grafeas.v1beta1.attestation.Attestation.Builder, io.grafeas.v1beta1.attestation.AttestationOrBuilder>(
                getAttestation(),
                getParentForChildren(),
                isClean());
        attestation_ = null;
      }
      return attestationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.attestation.Details)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.attestation.Details)
  private static final io.grafeas.v1beta1.attestation.Details DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.attestation.Details();
  }

  public static io.grafeas.v1beta1.attestation.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Details>
      PARSER = new com.google.protobuf.AbstractParser<Details>() {
    @java.lang.Override
    public Details parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Details(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.attestation.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

