// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CheckAvailableService.proto

package com.item.management.client.service;

/**
 * Protobuf type {@code com.item.management.client.service.CheckAvailableRequestResponse}
 */
public  final class CheckAvailableRequestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.item.management.client.service.CheckAvailableRequestResponse)
    CheckAvailableRequestResponseOrBuilder {
  // Use CheckAvailableRequestResponse.newBuilder() to construct.
  private CheckAvailableRequestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckAvailableRequestResponse() {
    requestId_ = "";
    officeId_ = "";
    total_ = 0;
    serialNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CheckAvailableRequestResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            requestId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            officeId_ = s;
            break;
          }
          case 24: {

            total_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              serialNumbers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            serialNumbers_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        serialNumbers_ = serialNumbers_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.item.management.client.service.CheckAvailableServiceOuterClass.internal_static_com_item_management_client_service_CheckAvailableRequestResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.item.management.client.service.CheckAvailableServiceOuterClass.internal_static_com_item_management_client_service_CheckAvailableRequestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.item.management.client.service.CheckAvailableRequestResponse.class, com.item.management.client.service.CheckAvailableRequestResponse.Builder.class);
  }

  private int bitField0_;
  public static final int REQUESTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestId_;
  /**
   * <code>string requestId = 1;</code>
   */
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <code>string requestId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFICEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object officeId_;
  /**
   * <code>string officeId = 2;</code>
   */
  public java.lang.String getOfficeId() {
    java.lang.Object ref = officeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      officeId_ = s;
      return s;
    }
  }
  /**
   * <code>string officeId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOfficeIdBytes() {
    java.lang.Object ref = officeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      officeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_FIELD_NUMBER = 3;
  private int total_;
  /**
   * <code>int32 total = 3;</code>
   */
  public int getTotal() {
    return total_;
  }

  public static final int SERIALNUMBERS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList serialNumbers_;
  /**
   * <code>repeated string serialNumbers = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getSerialNumbersList() {
    return serialNumbers_;
  }
  /**
   * <code>repeated string serialNumbers = 4;</code>
   */
  public int getSerialNumbersCount() {
    return serialNumbers_.size();
  }
  /**
   * <code>repeated string serialNumbers = 4;</code>
   */
  public java.lang.String getSerialNumbers(int index) {
    return serialNumbers_.get(index);
  }
  /**
   * <code>repeated string serialNumbers = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSerialNumbersBytes(int index) {
    return serialNumbers_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
    }
    if (!getOfficeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, officeId_);
    }
    if (total_ != 0) {
      output.writeInt32(3, total_);
    }
    for (int i = 0; i < serialNumbers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serialNumbers_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
    }
    if (!getOfficeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, officeId_);
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, total_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < serialNumbers_.size(); i++) {
        dataSize += computeStringSizeNoTag(serialNumbers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSerialNumbersList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.item.management.client.service.CheckAvailableRequestResponse)) {
      return super.equals(obj);
    }
    com.item.management.client.service.CheckAvailableRequestResponse other = (com.item.management.client.service.CheckAvailableRequestResponse) obj;

    boolean result = true;
    result = result && getRequestId()
        .equals(other.getRequestId());
    result = result && getOfficeId()
        .equals(other.getOfficeId());
    result = result && (getTotal()
        == other.getTotal());
    result = result && getSerialNumbersList()
        .equals(other.getSerialNumbersList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (37 * hash) + OFFICEID_FIELD_NUMBER;
    hash = (53 * hash) + getOfficeId().hashCode();
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    if (getSerialNumbersCount() > 0) {
      hash = (37 * hash) + SERIALNUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getSerialNumbersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.item.management.client.service.CheckAvailableRequestResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.item.management.client.service.CheckAvailableRequestResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.item.management.client.service.CheckAvailableRequestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.item.management.client.service.CheckAvailableRequestResponse)
      com.item.management.client.service.CheckAvailableRequestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.item.management.client.service.CheckAvailableServiceOuterClass.internal_static_com_item_management_client_service_CheckAvailableRequestResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.item.management.client.service.CheckAvailableServiceOuterClass.internal_static_com_item_management_client_service_CheckAvailableRequestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.item.management.client.service.CheckAvailableRequestResponse.class, com.item.management.client.service.CheckAvailableRequestResponse.Builder.class);
    }

    // Construct using com.item.management.client.service.CheckAvailableRequestResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      requestId_ = "";

      officeId_ = "";

      total_ = 0;

      serialNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.item.management.client.service.CheckAvailableServiceOuterClass.internal_static_com_item_management_client_service_CheckAvailableRequestResponse_descriptor;
    }

    public com.item.management.client.service.CheckAvailableRequestResponse getDefaultInstanceForType() {
      return com.item.management.client.service.CheckAvailableRequestResponse.getDefaultInstance();
    }

    public com.item.management.client.service.CheckAvailableRequestResponse build() {
      com.item.management.client.service.CheckAvailableRequestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.item.management.client.service.CheckAvailableRequestResponse buildPartial() {
      com.item.management.client.service.CheckAvailableRequestResponse result = new com.item.management.client.service.CheckAvailableRequestResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.requestId_ = requestId_;
      result.officeId_ = officeId_;
      result.total_ = total_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        serialNumbers_ = serialNumbers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.serialNumbers_ = serialNumbers_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.item.management.client.service.CheckAvailableRequestResponse) {
        return mergeFrom((com.item.management.client.service.CheckAvailableRequestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.item.management.client.service.CheckAvailableRequestResponse other) {
      if (other == com.item.management.client.service.CheckAvailableRequestResponse.getDefaultInstance()) return this;
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        onChanged();
      }
      if (!other.getOfficeId().isEmpty()) {
        officeId_ = other.officeId_;
        onChanged();
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (!other.serialNumbers_.isEmpty()) {
        if (serialNumbers_.isEmpty()) {
          serialNumbers_ = other.serialNumbers_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureSerialNumbersIsMutable();
          serialNumbers_.addAll(other.serialNumbers_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.item.management.client.service.CheckAvailableRequestResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.item.management.client.service.CheckAvailableRequestResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object requestId_ = "";
    /**
     * <code>string requestId = 1;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object officeId_ = "";
    /**
     * <code>string officeId = 2;</code>
     */
    public java.lang.String getOfficeId() {
      java.lang.Object ref = officeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        officeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string officeId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOfficeIdBytes() {
      java.lang.Object ref = officeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        officeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string officeId = 2;</code>
     */
    public Builder setOfficeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      officeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string officeId = 2;</code>
     */
    public Builder clearOfficeId() {
      
      officeId_ = getDefaultInstance().getOfficeId();
      onChanged();
      return this;
    }
    /**
     * <code>string officeId = 2;</code>
     */
    public Builder setOfficeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      officeId_ = value;
      onChanged();
      return this;
    }

    private int total_ ;
    /**
     * <code>int32 total = 3;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>int32 total = 3;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total = 3;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList serialNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSerialNumbersIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        serialNumbers_ = new com.google.protobuf.LazyStringArrayList(serialNumbers_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSerialNumbersList() {
      return serialNumbers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public int getSerialNumbersCount() {
      return serialNumbers_.size();
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public java.lang.String getSerialNumbers(int index) {
      return serialNumbers_.get(index);
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSerialNumbersBytes(int index) {
      return serialNumbers_.getByteString(index);
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public Builder setSerialNumbers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSerialNumbersIsMutable();
      serialNumbers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public Builder addSerialNumbers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSerialNumbersIsMutable();
      serialNumbers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public Builder addAllSerialNumbers(
        java.lang.Iterable<java.lang.String> values) {
      ensureSerialNumbersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, serialNumbers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public Builder clearSerialNumbers() {
      serialNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string serialNumbers = 4;</code>
     */
    public Builder addSerialNumbersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSerialNumbersIsMutable();
      serialNumbers_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.item.management.client.service.CheckAvailableRequestResponse)
  }

  // @@protoc_insertion_point(class_scope:com.item.management.client.service.CheckAvailableRequestResponse)
  private static final com.item.management.client.service.CheckAvailableRequestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.item.management.client.service.CheckAvailableRequestResponse();
  }

  public static com.item.management.client.service.CheckAvailableRequestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckAvailableRequestResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckAvailableRequestResponse>() {
    public CheckAvailableRequestResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CheckAvailableRequestResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckAvailableRequestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckAvailableRequestResponse> getParserForType() {
    return PARSER;
  }

  public com.item.management.client.service.CheckAvailableRequestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
