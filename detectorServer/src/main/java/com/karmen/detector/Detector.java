// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: detector.proto

package com.karmen.grpc.detector;

public final class Detector {
  private Detector() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DetectorRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DetectorRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isDetected = 1;</code>
     * @return The isDetected.
     */
    boolean getIsDetected();
  }
  /**
   * Protobuf type {@code DetectorRequest}
   */
  public  static final class DetectorRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DetectorRequest)
      DetectorRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetectorRequest.newBuilder() to construct.
    private DetectorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetectorRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DetectorRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetectorRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              isDetected_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return Detector.internal_static_DetectorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Detector.internal_static_DetectorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Detector.DetectorRequest.class, Detector.DetectorRequest.Builder.class);
    }

    public static final int ISDETECTED_FIELD_NUMBER = 1;
    private boolean isDetected_;
    /**
     * <code>bool isDetected = 1;</code>
     * @return The isDetected.
     */
    public boolean getIsDetected() {
      return isDetected_;
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
      if (isDetected_ != false) {
        output.writeBool(1, isDetected_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDetected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isDetected_);
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
      if (!(obj instanceof Detector.DetectorRequest)) {
        return super.equals(obj);
      }
      Detector.DetectorRequest other = (Detector.DetectorRequest) obj;

      if (getIsDetected()
          != other.getIsDetected()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ISDETECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDetected());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Detector.DetectorRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Detector.DetectorRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Detector.DetectorRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Detector.DetectorRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Detector.DetectorRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Detector.DetectorRequest parseFrom(
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
    public static Builder newBuilder(Detector.DetectorRequest prototype) {
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
     * Protobuf type {@code DetectorRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DetectorRequest)
        Detector.DetectorRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Detector.internal_static_DetectorRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Detector.internal_static_DetectorRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Detector.DetectorRequest.class, Detector.DetectorRequest.Builder.class);
      }

      // Construct using com.karmen.grpc.detector.Detector.DetectorRequest.newBuilder()
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
        isDetected_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Detector.internal_static_DetectorRequest_descriptor;
      }

      @java.lang.Override
      public Detector.DetectorRequest getDefaultInstanceForType() {
        return Detector.DetectorRequest.getDefaultInstance();
      }

      @java.lang.Override
      public Detector.DetectorRequest build() {
        Detector.DetectorRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Detector.DetectorRequest buildPartial() {
        Detector.DetectorRequest result = new Detector.DetectorRequest(this);
        result.isDetected_ = isDetected_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Detector.DetectorRequest) {
          return mergeFrom((Detector.DetectorRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Detector.DetectorRequest other) {
        if (other == Detector.DetectorRequest.getDefaultInstance()) return this;
        if (other.getIsDetected() != false) {
          setIsDetected(other.getIsDetected());
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
        Detector.DetectorRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Detector.DetectorRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isDetected_ ;
      /**
       * <code>bool isDetected = 1;</code>
       * @return The isDetected.
       */
      public boolean getIsDetected() {
        return isDetected_;
      }
      /**
       * <code>bool isDetected = 1;</code>
       * @param value The isDetected to set.
       * @return This builder for chaining.
       */
      public Builder setIsDetected(boolean value) {
        
        isDetected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isDetected = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDetected() {
        
        isDetected_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DetectorRequest)
    }

    // @@protoc_insertion_point(class_scope:DetectorRequest)
    private static final Detector.DetectorRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Detector.DetectorRequest();
    }

    public static Detector.DetectorRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DetectorRequest>
        PARSER = new com.google.protobuf.AbstractParser<DetectorRequest>() {
      @java.lang.Override
      public DetectorRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetectorRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetectorRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetectorRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Detector.DetectorRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DetectorResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DetectorResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string responsemsg = 1;</code>
     * @return The responsemsg.
     */
    java.lang.String getResponsemsg();
    /**
     * <code>string responsemsg = 1;</code>
     * @return The bytes for responsemsg.
     */
    com.google.protobuf.ByteString
        getResponsemsgBytes();

    /**
     * <code>int32 responseCode = 2;</code>
     * @return The responseCode.
     */
    int getResponseCode();
  }
  /**
   * Protobuf type {@code DetectorResponse}
   */
  public  static final class DetectorResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DetectorResponse)
      DetectorResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DetectorResponse.newBuilder() to construct.
    private DetectorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DetectorResponse() {
      responsemsg_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DetectorResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DetectorResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              java.lang.String s = input.readStringRequireUtf8();

              responsemsg_ = s;
              break;
            }
            case 16: {

              responseCode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return Detector.internal_static_DetectorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Detector.internal_static_DetectorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Detector.DetectorResponse.class, Detector.DetectorResponse.Builder.class);
    }

    public static final int RESPONSEMSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object responsemsg_;
    /**
     * <code>string responsemsg = 1;</code>
     * @return The responsemsg.
     */
    public java.lang.String getResponsemsg() {
      java.lang.Object ref = responsemsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responsemsg_ = s;
        return s;
      }
    }
    /**
     * <code>string responsemsg = 1;</code>
     * @return The bytes for responsemsg.
     */
    public com.google.protobuf.ByteString
        getResponsemsgBytes() {
      java.lang.Object ref = responsemsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responsemsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESPONSECODE_FIELD_NUMBER = 2;
    private int responseCode_;
    /**
     * <code>int32 responseCode = 2;</code>
     * @return The responseCode.
     */
    public int getResponseCode() {
      return responseCode_;
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
      if (!getResponsemsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responsemsg_);
      }
      if (responseCode_ != 0) {
        output.writeInt32(2, responseCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getResponsemsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responsemsg_);
      }
      if (responseCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, responseCode_);
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
      if (!(obj instanceof Detector.DetectorResponse)) {
        return super.equals(obj);
      }
      Detector.DetectorResponse other = (Detector.DetectorResponse) obj;

      if (!getResponsemsg()
          .equals(other.getResponsemsg())) return false;
      if (getResponseCode()
          != other.getResponseCode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESPONSEMSG_FIELD_NUMBER;
      hash = (53 * hash) + getResponsemsg().hashCode();
      hash = (37 * hash) + RESPONSECODE_FIELD_NUMBER;
      hash = (53 * hash) + getResponseCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Detector.DetectorResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Detector.DetectorResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Detector.DetectorResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Detector.DetectorResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Detector.DetectorResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Detector.DetectorResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Detector.DetectorResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Detector.DetectorResponse parseFrom(
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
    public static Builder newBuilder(Detector.DetectorResponse prototype) {
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
     * Protobuf type {@code DetectorResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DetectorResponse)
        Detector.DetectorResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Detector.internal_static_DetectorResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Detector.internal_static_DetectorResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Detector.DetectorResponse.class, Detector.DetectorResponse.Builder.class);
      }

      // Construct using com.karmen.grpc.detector.Detector.DetectorResponse.newBuilder()
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
        responsemsg_ = "";

        responseCode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Detector.internal_static_DetectorResponse_descriptor;
      }

      @java.lang.Override
      public Detector.DetectorResponse getDefaultInstanceForType() {
        return Detector.DetectorResponse.getDefaultInstance();
      }

      @java.lang.Override
      public Detector.DetectorResponse build() {
        Detector.DetectorResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Detector.DetectorResponse buildPartial() {
        Detector.DetectorResponse result = new Detector.DetectorResponse(this);
        result.responsemsg_ = responsemsg_;
        result.responseCode_ = responseCode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Detector.DetectorResponse) {
          return mergeFrom((Detector.DetectorResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Detector.DetectorResponse other) {
        if (other == Detector.DetectorResponse.getDefaultInstance()) return this;
        if (!other.getResponsemsg().isEmpty()) {
          responsemsg_ = other.responsemsg_;
          onChanged();
        }
        if (other.getResponseCode() != 0) {
          setResponseCode(other.getResponseCode());
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
        Detector.DetectorResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Detector.DetectorResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object responsemsg_ = "";
      /**
       * <code>string responsemsg = 1;</code>
       * @return The responsemsg.
       */
      public java.lang.String getResponsemsg() {
        java.lang.Object ref = responsemsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          responsemsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string responsemsg = 1;</code>
       * @return The bytes for responsemsg.
       */
      public com.google.protobuf.ByteString
          getResponsemsgBytes() {
        java.lang.Object ref = responsemsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          responsemsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string responsemsg = 1;</code>
       * @param value The responsemsg to set.
       * @return This builder for chaining.
       */
      public Builder setResponsemsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        responsemsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string responsemsg = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResponsemsg() {
        
        responsemsg_ = getDefaultInstance().getResponsemsg();
        onChanged();
        return this;
      }
      /**
       * <code>string responsemsg = 1;</code>
       * @param value The bytes for responsemsg to set.
       * @return This builder for chaining.
       */
      public Builder setResponsemsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        responsemsg_ = value;
        onChanged();
        return this;
      }

      private int responseCode_ ;
      /**
       * <code>int32 responseCode = 2;</code>
       * @return The responseCode.
       */
      public int getResponseCode() {
        return responseCode_;
      }
      /**
       * <code>int32 responseCode = 2;</code>
       * @param value The responseCode to set.
       * @return This builder for chaining.
       */
      public Builder setResponseCode(int value) {
        
        responseCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 responseCode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearResponseCode() {
        
        responseCode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DetectorResponse)
    }

    // @@protoc_insertion_point(class_scope:DetectorResponse)
    private static final Detector.DetectorResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Detector.DetectorResponse();
    }

    public static Detector.DetectorResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DetectorResponse>
        PARSER = new com.google.protobuf.AbstractParser<DetectorResponse>() {
      @java.lang.Override
      public DetectorResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DetectorResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DetectorResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DetectorResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Detector.DetectorResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectorRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectorRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectorResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016detector.proto\"%\n\017DetectorRequest\022\022\n\ni" +
      "sDetected\030\001 \001(\010\"=\n\020DetectorResponse\022\023\n\013r" +
      "esponsemsg\030\001 \001(\t\022\024\n\014responseCode\030\002 \001(\0052@" +
      "\n\010detector\0224\n\013checkStatus\022\020.DetectorRequ" +
      "est\032\021.DetectorResponse\"\000B\021\n\017com.karmen.g" +
      "rpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DetectorRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DetectorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectorRequest_descriptor,
        new java.lang.String[] { "IsDetected", });
    internal_static_DetectorResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_DetectorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectorResponse_descriptor,
        new java.lang.String[] { "Responsemsg", "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
