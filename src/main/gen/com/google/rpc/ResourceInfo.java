// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Describes the resource that is being accessed.
 * </pre>
 *
 * Protobuf type {@code google.rpc.ResourceInfo}
 */
public  final class ResourceInfo extends
    com.google.protobuf.GeneratedMessageLite<
        ResourceInfo, ResourceInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:google.rpc.ResourceInfo)
    ResourceInfoOrBuilder {
  private ResourceInfo() {
    resourceType_ = "";
    resourceName_ = "";
    owner_ = "";
    description_ = "";
  }
  public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
  private java.lang.String resourceType_;
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public java.lang.String getResourceType() {
    return resourceType_;
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(resourceType_);
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  private void setResourceType(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    resourceType_ = value;
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  private void clearResourceType() {
    
    resourceType_ = getDefaultInstance().getResourceType();
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  private void setResourceTypeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    resourceType_ = value.toStringUtf8();
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
  private java.lang.String resourceName_;
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  public java.lang.String getResourceName() {
    return resourceName_;
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(resourceName_);
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  private void setResourceName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    resourceName_ = value;
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  private void clearResourceName() {
    
    resourceName_ = getDefaultInstance().getResourceName();
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>optional string resource_name = 2;</code>
   */
  private void setResourceNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    resourceName_ = value.toStringUtf8();
  }

  public static final int OWNER_FIELD_NUMBER = 3;
  private java.lang.String owner_;
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public java.lang.String getOwner() {
    return owner_;
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(owner_);
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  private void setOwner(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    owner_ = value;
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  private void clearOwner() {
    
    owner_ = getDefaultInstance().getOwner();
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  private void setOwnerBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    owner_ = value.toStringUtf8();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private java.lang.String description_;
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  private void setDescription(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    description_ = value;
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>optional string description = 4;</code>
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    description_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!resourceType_.isEmpty()) {
      output.writeString(1, getResourceType());
    }
    if (!resourceName_.isEmpty()) {
      output.writeString(2, getResourceName());
    }
    if (!owner_.isEmpty()) {
      output.writeString(3, getOwner());
    }
    if (!description_.isEmpty()) {
      output.writeString(4, getDescription());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!resourceType_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getResourceType());
    }
    if (!resourceName_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getResourceName());
    }
    if (!owner_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getOwner());
    }
    if (!description_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getDescription());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.ResourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.rpc.ResourceInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Describes the resource that is being accessed.
   * </pre>
   *
   * Protobuf type {@code google.rpc.ResourceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.rpc.ResourceInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.ResourceInfo)
      com.google.rpc.ResourceInfoOrBuilder {
    // Construct using com.google.rpc.ResourceInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public java.lang.String getResourceType() {
      return instance.getResourceType();
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      return instance.getResourceTypeBytes();
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceType(
        java.lang.String value) {
      copyOnWrite();
      instance.setResourceType(value);
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder clearResourceType() {
      copyOnWrite();
      instance.clearResourceType();
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResourceTypeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public java.lang.String getResourceName() {
      return instance.getResourceName();
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      return instance.getResourceNameBytes();
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder setResourceName(
        java.lang.String value) {
      copyOnWrite();
      instance.setResourceName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder clearResourceName() {
      copyOnWrite();
      instance.clearResourceName();
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>optional string resource_name = 2;</code>
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResourceNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public java.lang.String getOwner() {
      return instance.getOwner();
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      return instance.getOwnerBytes();
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwner(
        java.lang.String value) {
      copyOnWrite();
      instance.setOwner(value);
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder clearOwner() {
      copyOnWrite();
      instance.clearOwner();
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOwnerBytes(value);
      return this;
    }

    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>optional string description = 4;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.ResourceInfo)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.rpc.ResourceInfo();
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
        com.google.rpc.ResourceInfo other = (com.google.rpc.ResourceInfo) arg1;
        resourceType_ = visitor.visitString(!resourceType_.isEmpty(), resourceType_,
            !other.resourceType_.isEmpty(), other.resourceType_);
        resourceName_ = visitor.visitString(!resourceName_.isEmpty(), resourceName_,
            !other.resourceName_.isEmpty(), other.resourceName_);
        owner_ = visitor.visitString(!owner_.isEmpty(), owner_,
            !other.owner_.isEmpty(), other.owner_);
        description_ = visitor.visitString(!description_.isEmpty(), description_,
            !other.description_.isEmpty(), other.description_);
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

                resourceType_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                resourceName_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                owner_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                description_ = s;
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
        if (PARSER == null) {    synchronized (com.google.rpc.ResourceInfo.class) {
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


  // @@protoc_insertion_point(class_scope:google.rpc.ResourceInfo)
  private static final com.google.rpc.ResourceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResourceInfo();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.rpc.ResourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ResourceInfo> PARSER;

  public static com.google.protobuf.Parser<ResourceInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

