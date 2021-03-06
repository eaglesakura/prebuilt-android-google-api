// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/documentation.proto

package com.google.api;

/**
 * <pre>
 * Represents a documentation page. A page can contain subpages to represent
 * nested documentation set structure.
 * </pre>
 *
 * Protobuf type {@code google.api.Page}
 */
public  final class Page extends
    com.google.protobuf.GeneratedMessageLite<
        Page, Page.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.Page)
    PageOrBuilder {
  private Page() {
    name_ = "";
    content_ = "";
    subpages_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the page. It will be used as an identity of the page to
   * generate URI of the page, text of the link to this page in navigation,
   * etc. The full page name (start from the root page name to this page
   * concatenated with `.`) can be used as reference to the page in your
   * documentation. For example:
   * &lt;pre&gt;&lt;code&gt;pages:
   * - name: Tutorial
   *   content: &amp;#40;== include tutorial.md ==&amp;#41;
   *   subpages:
   *   - name: Java
   *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
   * &lt;/code&gt;&lt;/pre&gt;
   * You can reference `Java` page using Markdown reference link syntax:
   * `[Java][Tutorial.Java]`.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private java.lang.String content_;
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
   * to include content from a Markdown file.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  public java.lang.String getContent() {
    return content_;
  }
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
   * to include content from a Markdown file.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  public com.google.protobuf.ByteString
      getContentBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(content_);
  }
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
   * to include content from a Markdown file.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  private void setContent(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    content_ = value;
  }
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
   * to include content from a Markdown file.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  private void clearContent() {
    
    content_ = getDefaultInstance().getContent();
  }
  /**
   * <pre>
   * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
   * to include content from a Markdown file.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  private void setContentBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    content_ = value.toStringUtf8();
  }

  public static final int SUBPAGES_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.Page> subpages_;
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  public java.util.List<com.google.api.Page> getSubpagesList() {
    return subpages_;
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  public java.util.List<? extends com.google.api.PageOrBuilder> 
      getSubpagesOrBuilderList() {
    return subpages_;
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  public int getSubpagesCount() {
    return subpages_.size();
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  public com.google.api.Page getSubpages(int index) {
    return subpages_.get(index);
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  public com.google.api.PageOrBuilder getSubpagesOrBuilder(
      int index) {
    return subpages_.get(index);
  }
  private void ensureSubpagesIsMutable() {
    if (!subpages_.isModifiable()) {
      subpages_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(subpages_);
     }
  }

  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void setSubpages(
      int index, com.google.api.Page value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSubpagesIsMutable();
    subpages_.set(index, value);
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void setSubpages(
      int index, com.google.api.Page.Builder builderForValue) {
    ensureSubpagesIsMutable();
    subpages_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void addSubpages(com.google.api.Page value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSubpagesIsMutable();
    subpages_.add(value);
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void addSubpages(
      int index, com.google.api.Page value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureSubpagesIsMutable();
    subpages_.add(index, value);
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void addSubpages(
      com.google.api.Page.Builder builderForValue) {
    ensureSubpagesIsMutable();
    subpages_.add(builderForValue.build());
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void addSubpages(
      int index, com.google.api.Page.Builder builderForValue) {
    ensureSubpagesIsMutable();
    subpages_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void addAllSubpages(
      java.lang.Iterable<? extends com.google.api.Page> values) {
    ensureSubpagesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, subpages_);
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void clearSubpages() {
    subpages_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Subpages of this page. The order of subpages specified here will be
   * honored in the generated docset.
   * </pre>
   *
   * <code>repeated .google.api.Page subpages = 3;</code>
   */
  private void removeSubpages(int index) {
    ensureSubpagesIsMutable();
    subpages_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!name_.isEmpty()) {
      output.writeString(1, getName());
    }
    if (!content_.isEmpty()) {
      output.writeString(2, getContent());
    }
    for (int i = 0; i < subpages_.size(); i++) {
      output.writeMessage(3, subpages_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getName());
    }
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getContent());
    }
    for (int i = 0; i < subpages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, subpages_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.Page parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Page parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Page parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Page parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Page parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Page parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Page parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Page parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Page parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Page parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Page prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Represents a documentation page. A page can contain subpages to represent
   * nested documentation set structure.
   * </pre>
   *
   * Protobuf type {@code google.api.Page}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.Page, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Page)
      com.google.api.PageOrBuilder {
    // Construct using com.google.api.Page.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the page. It will be used as an identity of the page to
     * generate URI of the page, text of the link to this page in navigation,
     * etc. The full page name (start from the root page name to this page
     * concatenated with `.`) can be used as reference to the page in your
     * documentation. For example:
     * &lt;pre&gt;&lt;code&gt;pages:
     * - name: Tutorial
     *   content: &amp;#40;== include tutorial.md ==&amp;#41;
     *   subpages:
     *   - name: Java
     *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
     * &lt;/code&gt;&lt;/pre&gt;
     * You can reference `Java` page using Markdown reference link syntax:
     * `[Java][Tutorial.Java]`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the page. It will be used as an identity of the page to
     * generate URI of the page, text of the link to this page in navigation,
     * etc. The full page name (start from the root page name to this page
     * concatenated with `.`) can be used as reference to the page in your
     * documentation. For example:
     * &lt;pre&gt;&lt;code&gt;pages:
     * - name: Tutorial
     *   content: &amp;#40;== include tutorial.md ==&amp;#41;
     *   subpages:
     *   - name: Java
     *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
     * &lt;/code&gt;&lt;/pre&gt;
     * You can reference `Java` page using Markdown reference link syntax:
     * `[Java][Tutorial.Java]`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the page. It will be used as an identity of the page to
     * generate URI of the page, text of the link to this page in navigation,
     * etc. The full page name (start from the root page name to this page
     * concatenated with `.`) can be used as reference to the page in your
     * documentation. For example:
     * &lt;pre&gt;&lt;code&gt;pages:
     * - name: Tutorial
     *   content: &amp;#40;== include tutorial.md ==&amp;#41;
     *   subpages:
     *   - name: Java
     *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
     * &lt;/code&gt;&lt;/pre&gt;
     * You can reference `Java` page using Markdown reference link syntax:
     * `[Java][Tutorial.Java]`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the page. It will be used as an identity of the page to
     * generate URI of the page, text of the link to this page in navigation,
     * etc. The full page name (start from the root page name to this page
     * concatenated with `.`) can be used as reference to the page in your
     * documentation. For example:
     * &lt;pre&gt;&lt;code&gt;pages:
     * - name: Tutorial
     *   content: &amp;#40;== include tutorial.md ==&amp;#41;
     *   subpages:
     *   - name: Java
     *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
     * &lt;/code&gt;&lt;/pre&gt;
     * You can reference `Java` page using Markdown reference link syntax:
     * `[Java][Tutorial.Java]`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the page. It will be used as an identity of the page to
     * generate URI of the page, text of the link to this page in navigation,
     * etc. The full page name (start from the root page name to this page
     * concatenated with `.`) can be used as reference to the page in your
     * documentation. For example:
     * &lt;pre&gt;&lt;code&gt;pages:
     * - name: Tutorial
     *   content: &amp;#40;== include tutorial.md ==&amp;#41;
     *   subpages:
     *   - name: Java
     *     content: &amp;#40;== include tutorial_java.md ==&amp;#41;
     * &lt;/code&gt;&lt;/pre&gt;
     * You can reference `Java` page using Markdown reference link syntax:
     * `[Java][Tutorial.Java]`.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
     * to include content from a Markdown file.
     * </pre>
     *
     * <code>optional string content = 2;</code>
     */
    public java.lang.String getContent() {
      return instance.getContent();
    }
    /**
     * <pre>
     * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
     * to include content from a Markdown file.
     * </pre>
     *
     * <code>optional string content = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      return instance.getContentBytes();
    }
    /**
     * <pre>
     * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
     * to include content from a Markdown file.
     * </pre>
     *
     * <code>optional string content = 2;</code>
     */
    public Builder setContent(
        java.lang.String value) {
      copyOnWrite();
      instance.setContent(value);
      return this;
    }
    /**
     * <pre>
     * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
     * to include content from a Markdown file.
     * </pre>
     *
     * <code>optional string content = 2;</code>
     */
    public Builder clearContent() {
      copyOnWrite();
      instance.clearContent();
      return this;
    }
    /**
     * <pre>
     * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;== include {path} ==&amp;#41;&lt;/code&gt;
     * to include content from a Markdown file.
     * </pre>
     *
     * <code>optional string content = 2;</code>
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setContentBytes(value);
      return this;
    }

    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public java.util.List<com.google.api.Page> getSubpagesList() {
      return java.util.Collections.unmodifiableList(
          instance.getSubpagesList());
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public int getSubpagesCount() {
      return instance.getSubpagesCount();
    }/**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public com.google.api.Page getSubpages(int index) {
      return instance.getSubpages(index);
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder setSubpages(
        int index, com.google.api.Page value) {
      copyOnWrite();
      instance.setSubpages(index, value);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder setSubpages(
        int index, com.google.api.Page.Builder builderForValue) {
      copyOnWrite();
      instance.setSubpages(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder addSubpages(com.google.api.Page value) {
      copyOnWrite();
      instance.addSubpages(value);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder addSubpages(
        int index, com.google.api.Page value) {
      copyOnWrite();
      instance.addSubpages(index, value);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder addSubpages(
        com.google.api.Page.Builder builderForValue) {
      copyOnWrite();
      instance.addSubpages(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder addSubpages(
        int index, com.google.api.Page.Builder builderForValue) {
      copyOnWrite();
      instance.addSubpages(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder addAllSubpages(
        java.lang.Iterable<? extends com.google.api.Page> values) {
      copyOnWrite();
      instance.addAllSubpages(values);
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder clearSubpages() {
      copyOnWrite();
      instance.clearSubpages();
      return this;
    }
    /**
     * <pre>
     * Subpages of this page. The order of subpages specified here will be
     * honored in the generated docset.
     * </pre>
     *
     * <code>repeated .google.api.Page subpages = 3;</code>
     */
    public Builder removeSubpages(int index) {
      copyOnWrite();
      instance.removeSubpages(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.Page)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.Page();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        subpages_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.api.Page other = (com.google.api.Page) arg1;
        name_ = visitor.visitString(!name_.isEmpty(), name_,
            !other.name_.isEmpty(), other.name_);
        content_ = visitor.visitString(!content_.isEmpty(), content_,
            !other.content_.isEmpty(), other.content_);
        subpages_= visitor.visitList(subpages_, other.subpages_);
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
                String s = input.readStringRequireUtf8();

                name_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                content_ = s;
                break;
              }
              case 26: {
                if (!subpages_.isModifiable()) {
                  subpages_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(subpages_);
                }
                subpages_.add(
                    input.readMessage(com.google.api.Page.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.google.api.Page.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.Page)
  private static final com.google.api.Page DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Page();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.Page getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Page> PARSER;

  public static com.google.protobuf.Parser<Page> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

