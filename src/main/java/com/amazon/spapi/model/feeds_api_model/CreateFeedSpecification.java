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
import com.amazon.spapi.model.feeds_api_model.FeedOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information required to create the feed.
 */
@ApiModel(description = "Information required to create the feed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:38.765-04:00")
public class CreateFeedSpecification {
  @SerializedName("feedType")
  private String feedType = null;

  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = new ArrayList<String>();

  @SerializedName("inputFeedDocumentId")
  private String inputFeedDocumentId = null;

  @SerializedName("feedOptions")
  private FeedOptions feedOptions = null;

  public CreateFeedSpecification feedType(String feedType) {
    this.feedType = feedType;
    return this;
  }

   /**
   * The feed type.
   * @return feedType
  **/
  @ApiModelProperty(required = true, value = "The feed type.")
  public String getFeedType() {
    return feedType;
  }

  public void setFeedType(String feedType) {
    this.feedType = feedType;
  }

  public CreateFeedSpecification marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public CreateFeedSpecification addMarketplaceIdsItem(String marketplaceIdsItem) {
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * A list of identifiers for marketplaces that you want the feed to be applied to.
   * @return marketplaceIds
  **/
  @ApiModelProperty(required = true, value = "A list of identifiers for marketplaces that you want the feed to be applied to.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public CreateFeedSpecification inputFeedDocumentId(String inputFeedDocumentId) {
    this.inputFeedDocumentId = inputFeedDocumentId;
    return this;
  }

   /**
   * The document identifier returned by the createFeedDocument operation. Upload the feed document contents before calling the createFeed operation.
   * @return inputFeedDocumentId
  **/
  @ApiModelProperty(required = true, value = "The document identifier returned by the createFeedDocument operation. Upload the feed document contents before calling the createFeed operation.")
  public String getInputFeedDocumentId() {
    return inputFeedDocumentId;
  }

  public void setInputFeedDocumentId(String inputFeedDocumentId) {
    this.inputFeedDocumentId = inputFeedDocumentId;
  }

  public CreateFeedSpecification feedOptions(FeedOptions feedOptions) {
    this.feedOptions = feedOptions;
    return this;
  }

   /**
   * Get feedOptions
   * @return feedOptions
  **/
  @ApiModelProperty(value = "")
  public FeedOptions getFeedOptions() {
    return feedOptions;
  }

  public void setFeedOptions(FeedOptions feedOptions) {
    this.feedOptions = feedOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeedSpecification createFeedSpecification = (CreateFeedSpecification) o;
    return Objects.equals(this.feedType, createFeedSpecification.feedType) &&
        Objects.equals(this.marketplaceIds, createFeedSpecification.marketplaceIds) &&
        Objects.equals(this.inputFeedDocumentId, createFeedSpecification.inputFeedDocumentId) &&
        Objects.equals(this.feedOptions, createFeedSpecification.feedOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedType, marketplaceIds, inputFeedDocumentId, feedOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeedSpecification {\n");
    
    sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    inputFeedDocumentId: ").append(toIndentedString(inputFeedDocumentId)).append("\n");
    sb.append("    feedOptions: ").append(toIndentedString(feedOptions)).append("\n");
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

