/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2021-06-30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.feeds_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information required to upload a feed document&#39;s contents.
 */
@ApiModel(description = "Information required to upload a feed document's contents.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:19.780+08:00")
public class CreateFeedDocumentResponse {
  @SerializedName("feedDocumentId")
  private String feedDocumentId = null;

  @SerializedName("url")
  private String url = null;

  public CreateFeedDocumentResponse feedDocumentId(String feedDocumentId) {
    this.feedDocumentId = feedDocumentId;
    return this;
  }

   /**
   * The identifier of the feed document.
   * @return feedDocumentId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the feed document.")
  public String getFeedDocumentId() {
    return feedDocumentId;
  }

  public void setFeedDocumentId(String feedDocumentId) {
    this.feedDocumentId = feedDocumentId;
  }

  public CreateFeedDocumentResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The presigned URL for uploading the feed contents. This URL expires after 5 minutes.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The presigned URL for uploading the feed contents. This URL expires after 5 minutes.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeedDocumentResponse createFeedDocumentResponse = (CreateFeedDocumentResponse) o;
    return Objects.equals(this.feedDocumentId, createFeedDocumentResponse.feedDocumentId) &&
        Objects.equals(this.url, createFeedDocumentResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedDocumentId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeedDocumentResponse {\n");
    
    sb.append("    feedDocumentId: ").append(toIndentedString(feedDocumentId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

