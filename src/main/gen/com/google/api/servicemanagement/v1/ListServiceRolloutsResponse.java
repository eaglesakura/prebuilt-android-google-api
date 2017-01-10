// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Response message for ListServiceRollouts method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsResponse}
 */
public  final class ListServiceRolloutsResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListServiceRolloutsResponse, ListServiceRolloutsResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
    ListServiceRolloutsResponseOrBuilder {
  private ListServiceRolloutsResponse() {
    rollouts_ = emptyProtobufList();
    nextPageToken_ = "";
  }
  private int bitField0_;
  public static final int ROLLOUTS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.servicemanagement.v1.Rollout> rollouts_;
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  public java.util.List<com.google.api.servicemanagement.v1.Rollout> getRolloutsList() {
    return rollouts_;
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  public java.util.List<? extends com.google.api.servicemanagement.v1.RolloutOrBuilder> 
      getRolloutsOrBuilderList() {
    return rollouts_;
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  public int getRolloutsCount() {
    return rollouts_.size();
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  public com.google.api.servicemanagement.v1.Rollout getRollouts(int index) {
    return rollouts_.get(index);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  public com.google.api.servicemanagement.v1.RolloutOrBuilder getRolloutsOrBuilder(
      int index) {
    return rollouts_.get(index);
  }
  private void ensureRolloutsIsMutable() {
    if (!rollouts_.isModifiable()) {
      rollouts_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(rollouts_);
     }
  }

  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void setRollouts(
      int index, com.google.api.servicemanagement.v1.Rollout value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureRolloutsIsMutable();
    rollouts_.set(index, value);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void setRollouts(
      int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
    ensureRolloutsIsMutable();
    rollouts_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void addRollouts(com.google.api.servicemanagement.v1.Rollout value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureRolloutsIsMutable();
    rollouts_.add(value);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void addRollouts(
      int index, com.google.api.servicemanagement.v1.Rollout value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureRolloutsIsMutable();
    rollouts_.add(index, value);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void addRollouts(
      com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
    ensureRolloutsIsMutable();
    rollouts_.add(builderForValue.build());
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void addRollouts(
      int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
    ensureRolloutsIsMutable();
    rollouts_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void addAllRollouts(
      java.lang.Iterable<? extends com.google.api.servicemanagement.v1.Rollout> values) {
    ensureRolloutsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, rollouts_);
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void clearRollouts() {
    rollouts_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The list of rollout resources.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
   */
  private void removeRollouts(int index) {
    ensureRolloutsIsMutable();
    rollouts_.remove(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.String nextPageToken_;
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken_;
  }
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(nextPageToken_);
  }
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void setNextPageToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    nextPageToken_ = value;
  }
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void clearNextPageToken() {
    
    nextPageToken_ = getDefaultInstance().getNextPageToken();
  }
  /**
   * <pre>
   * The token of the next page of results.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  private void setNextPageTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    nextPageToken_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rollouts_.size(); i++) {
      output.writeMessage(1, rollouts_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      output.writeString(2, getNextPageToken());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rollouts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rollouts_.get(i));
    }
    if (!nextPageToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getNextPageToken());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.servicemanagement.v1.ListServiceRolloutsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response message for ListServiceRollouts method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.servicemanagement.v1.ListServiceRolloutsResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
      com.google.api.servicemanagement.v1.ListServiceRolloutsResponseOrBuilder {
    // Construct using com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.Rollout> getRolloutsList() {
      return java.util.Collections.unmodifiableList(
          instance.getRolloutsList());
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public int getRolloutsCount() {
      return instance.getRolloutsCount();
    }/**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public com.google.api.servicemanagement.v1.Rollout getRollouts(int index) {
      return instance.getRollouts(index);
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder setRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout value) {
      copyOnWrite();
      instance.setRollouts(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder setRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      copyOnWrite();
      instance.setRollouts(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(com.google.api.servicemanagement.v1.Rollout value) {
      copyOnWrite();
      instance.addRollouts(value);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout value) {
      copyOnWrite();
      instance.addRollouts(index, value);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      copyOnWrite();
      instance.addRollouts(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addRollouts(
        int index, com.google.api.servicemanagement.v1.Rollout.Builder builderForValue) {
      copyOnWrite();
      instance.addRollouts(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder addAllRollouts(
        java.lang.Iterable<? extends com.google.api.servicemanagement.v1.Rollout> values) {
      copyOnWrite();
      instance.addAllRollouts(values);
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder clearRollouts() {
      copyOnWrite();
      instance.clearRollouts();
      return this;
    }
    /**
     * <pre>
     * The list of rollout resources.
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.Rollout rollouts = 1;</code>
     */
    public Builder removeRollouts(int index) {
      copyOnWrite();
      instance.removeRollouts(index);
      return this;
    }

    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      return instance.getNextPageToken();
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      return instance.getNextPageTokenBytes();
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setNextPageToken(value);
      return this;
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      copyOnWrite();
      instance.clearNextPageToken();
      return this;
    }
    /**
     * <pre>
     * The token of the next page of results.
     * </pre>
     *
     * <code>optional string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNextPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.servicemanagement.v1.ListServiceRolloutsResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        rollouts_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.servicemanagement.v1.ListServiceRolloutsResponse other = (com.google.api.servicemanagement.v1.ListServiceRolloutsResponse) arg1;
        rollouts_= visitor.visitList(rollouts_, other.rollouts_);
        nextPageToken_ = visitor.visitString(!nextPageToken_.isEmpty(), nextPageToken_,
            !other.nextPageToken_.isEmpty(), other.nextPageToken_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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
                if (!rollouts_.isModifiable()) {
                  rollouts_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(rollouts_);
                }
                rollouts_.add(
                    input.readMessage(com.google.api.servicemanagement.v1.Rollout.parser(), extensionRegistry));
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                nextPageToken_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.servicemanagement.v1.ListServiceRolloutsResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ListServiceRolloutsResponse)
  private static final com.google.api.servicemanagement.v1.ListServiceRolloutsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListServiceRolloutsResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListServiceRolloutsResponse> PARSER;

  public static com.google.protobuf.Parser<ListServiceRolloutsResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
