/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.aplus_content_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.aplus_content_api_model.ContentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The full context for an A+ Content publishing event.
 */
@ApiModel(description = "The full context for an A+ Content publishing event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:46.835-04:00")
public class PublishRecord {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("asin")
  private String asin = null;

  @SerializedName("contentType")
  private ContentType contentType = null;

  @SerializedName("contentSubType")
  private String contentSubType = null;

  @SerializedName("contentReferenceKey")
  private String contentReferenceKey = null;

  public PublishRecord marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public PublishRecord locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PublishRecord asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * Get asin
   * @return asin
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public PublishRecord contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "")
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PublishRecord contentSubType(String contentSubType) {
    this.contentSubType = contentSubType;
    return this;
  }

   /**
   * Get contentSubType
   * @return contentSubType
  **/
  @ApiModelProperty(value = "")
  public String getContentSubType() {
    return contentSubType;
  }

  public void setContentSubType(String contentSubType) {
    this.contentSubType = contentSubType;
  }

  public PublishRecord contentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
    return this;
  }

   /**
   * Get contentReferenceKey
   * @return contentReferenceKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentReferenceKey() {
    return contentReferenceKey;
  }

  public void setContentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishRecord publishRecord = (PublishRecord) o;
    return Objects.equals(this.marketplaceId, publishRecord.marketplaceId) &&
        Objects.equals(this.locale, publishRecord.locale) &&
        Objects.equals(this.asin, publishRecord.asin) &&
        Objects.equals(this.contentType, publishRecord.contentType) &&
        Objects.equals(this.contentSubType, publishRecord.contentSubType) &&
        Objects.equals(this.contentReferenceKey, publishRecord.contentReferenceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, locale, asin, contentType, contentSubType, contentReferenceKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishRecord {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentSubType: ").append(toIndentedString(contentSubType)).append("\n");
    sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

