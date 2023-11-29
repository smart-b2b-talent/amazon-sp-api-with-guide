/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.notifications_api_model.MarketplaceIds;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Use this event filter to customize your subscription to send notifications for only the specified marketplaceId&#39;s.
 */
@ApiModel(description = "Use this event filter to customize your subscription to send notifications for only the specified marketplaceId's.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:23.893+08:00")
public class MarketplaceFilter {
  @SerializedName("marketplaceIds")
  private MarketplaceIds marketplaceIds = null;

  public MarketplaceFilter marketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

   /**
   * Get marketplaceIds
   * @return marketplaceIds
  **/
  @ApiModelProperty(value = "")
  public MarketplaceIds getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceFilter marketplaceFilter = (MarketplaceFilter) o;
    return Objects.equals(this.marketplaceIds, marketplaceFilter.marketplaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceFilter {\n");
    
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
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

