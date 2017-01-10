// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for GetServiceConfig method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.GetServiceConfigRequest}
 */
public  final class GetServiceConfigRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetServiceConfigRequest, GetServiceConfigRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.GetServiceConfigRequest)
    GetServiceConfigRequestOrBuilder {
  private GetServiceConfigRequest() {
    serviceName_ = "";
    configId_ = "";
  }
  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private java.lang.String serviceName_;
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    return serviceName_;
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(serviceName_);
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void setServiceName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    serviceName_ = value;
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void clearServiceName() {
    
    serviceName_ = getDefaultInstance().getServiceName();
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>optional string service_name = 1;</code>
   */
  private void setServiceNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    serviceName_ = value.toStringUtf8();
  }

  public static final int CONFIG_ID_FIELD_NUMBER = 2;
  private java.lang.String configId_;
  /**
   * <code>optional string config_id = 2;</code>
   */
  public java.lang.String getConfigId() {
    return configId_;
  }
  /**
   * <code>optional string config_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getConfigIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(configId_);
  }
  /**
   * <code>optional string config_id = 2;</code>
   */
  private void setConfigId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    configId_ = value;
  }
  /**
   * <code>optional string config_id = 2;</code>
   */
  private void clearConfigId() {
    
    configId_ = getDefaultInstance().getConfigId();
  }
  /**
   * <code>optional string config_id = 2;</code>
   */
  private void setConfigIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    configId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!serviceName_.isEmpty()) {
      output.writeString(1, getServiceName());
    }
    if (!configId_.isEmpty()) {
      output.writeString(2, getConfigId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!serviceName_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getServiceName());
    }
    if (!configId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getConfigId());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.GetServiceConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Request message for GetServiceConfig method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.GetServiceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.GetServiceConfigRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.GetServiceConfigRequest)
      com.google.api.servicemanagement.v1.GetServiceConfigRequestOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.GetServiceConfigRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      return instance.getServiceName();
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      return instance.getServiceNameBytes();
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      copyOnWrite();
      instance.setServiceName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      copyOnWrite();
      instance.clearServiceName();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>optional string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setServiceNameBytes(value);
      return this;
    }

    /**
     * <code>optional string config_id = 2;</code>
     */
    public java.lang.String getConfigId() {
      return instance.getConfigId();
    }
    /**
     * <code>optional string config_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getConfigIdBytes() {
      return instance.getConfigIdBytes();
    }
    /**
     * <code>optional string config_id = 2;</code>
     */
    public Builder setConfigId(
        java.lang.String value) {
      copyOnWrite();
      instance.setConfigId(value);
      return this;
    }
    /**
     * <code>optional string config_id = 2;</code>
     */
    public Builder clearConfigId() {
      copyOnWrite();
      instance.clearConfigId();
      return this;
    }
    /**
     * <code>optional string config_id = 2;</code>
     */
    public Builder setConfigIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setConfigIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.GetServiceConfigRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.GetServiceConfigRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.servicemanagement.v1.GetServiceConfigRequest other = (com.google.api.servicemanagement.v1.GetServiceConfigRequest) arg1;
        serviceName_ = visitor.visitString(!serviceName_.isEmpty(), serviceName_,
            !other.serviceName_.isEmpty(), other.serviceName_);
        configId_ = visitor.visitString(!configId_.isEmpty(), configId_,
            !other.configId_.isEmpty(), other.configId_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                String s = input.readStringRequireUtf8();

                serviceName_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                configId_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.GetServiceConfigRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.GetServiceConfigRequest)
  private static final com.google.api.servicemanagement.v1.GetServiceConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetServiceConfigRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetServiceConfigRequest> PARSER;

  public static com.google.protobuf.Parser<GetServiceConfigRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
