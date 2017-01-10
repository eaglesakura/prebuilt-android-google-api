// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 * <pre>
 * User-defined authentication requirements, including support for
 * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * </pre>
 *
 * Protobuf type {@code google.api.AuthRequirement}
 */
public  final class AuthRequirement extends
    com.google.protobuf.GeneratedMessageLite<
        AuthRequirement, AuthRequirement.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.AuthRequirement)
    AuthRequirementOrBuilder {
  private AuthRequirement() {
    providerId_ = "";
    audiences_ = "";
  }
  public static final int PROVIDER_ID_FIELD_NUMBER = 1;
  private java.lang.String providerId_;
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  public java.lang.String getProviderId() {
    return providerId_;
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProviderIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(providerId_);
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  private void setProviderId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    providerId_ = value;
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  private void clearProviderId() {
    
    providerId_ = getDefaultInstance().getProviderId();
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  private void setProviderIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    providerId_ = value.toStringUtf8();
  }

  public static final int AUDIENCES_FIELD_NUMBER = 2;
  private java.lang.String audiences_;
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  public java.lang.String getAudiences() {
    return audiences_;
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAudiencesBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(audiences_);
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  private void setAudiences(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    audiences_ = value;
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  private void clearAudiences() {
    
    audiences_ = getDefaultInstance().getAudiences();
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  private void setAudiencesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    audiences_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!providerId_.isEmpty()) {
      output.writeString(1, getProviderId());
    }
    if (!audiences_.isEmpty()) {
      output.writeString(2, getAudiences());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!providerId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getProviderId());
    }
    if (!audiences_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getAudiences());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.AuthRequirement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthRequirement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthRequirement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.AuthRequirement prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * User-defined authentication requirements, including support for
   * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
   * </pre>
   *
   * Protobuf type {@code google.api.AuthRequirement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.AuthRequirement, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthRequirement)
      com.google.api.AuthRequirementOrBuilder {
    // Construct using com.google.api.AuthRequirement.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public java.lang.String getProviderId() {
      return instance.getProviderId();
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProviderIdBytes() {
      return instance.getProviderIdBytes();
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder setProviderId(
        java.lang.String value) {
      copyOnWrite();
      instance.setProviderId(value);
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder clearProviderId() {
      copyOnWrite();
      instance.clearProviderId();
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder setProviderIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setProviderIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public java.lang.String getAudiences() {
      return instance.getAudiences();
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAudiencesBytes() {
      return instance.getAudiencesBytes();
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder setAudiences(
        java.lang.String value) {
      copyOnWrite();
      instance.setAudiences(value);
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder clearAudiences() {
      copyOnWrite();
      instance.clearAudiences();
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder setAudiencesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAudiencesBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.AuthRequirement)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.AuthRequirement();
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
        com.google.api.AuthRequirement other = (com.google.api.AuthRequirement) arg1;
        providerId_ = visitor.visitString(!providerId_.isEmpty(), providerId_,
            !other.providerId_.isEmpty(), other.providerId_);
        audiences_ = visitor.visitString(!audiences_.isEmpty(), audiences_,
            !other.audiences_.isEmpty(), other.audiences_);
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

                providerId_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                audiences_ = s;
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
        if (PARSER == null) {    synchronized (com.google.api.AuthRequirement.class) {
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


  // @@protoc_insertion_point(class_scope:google.api.AuthRequirement)
  private static final com.google.api.AuthRequirement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthRequirement();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.api.AuthRequirement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AuthRequirement> PARSER;

  public static com.google.protobuf.Parser<AuthRequirement> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
