/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_pricing_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOfferExpectedPriceRequestList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request body for the &#x60;getFeaturedOfferExpectedPriceBatch&#x60; operation.
 */
@ApiModel(description = "The request body for the `getFeaturedOfferExpectedPriceBatch` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:28.929+08:00")
public class GetFeaturedOfferExpectedPriceBatchRequest {
  @SerializedName("requests")
  private FeaturedOfferExpectedPriceRequestList requests = null;

  public GetFeaturedOfferExpectedPriceBatchRequest requests(FeaturedOfferExpectedPriceRequestList requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @ApiModelProperty(value = "")
  public FeaturedOfferExpectedPriceRequestList getRequests() {
    return requests;
  }

  public void setRequests(FeaturedOfferExpectedPriceRequestList requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequest = (GetFeaturedOfferExpectedPriceBatchRequest) o;
    return Objects.equals(this.requests, getFeaturedOfferExpectedPriceBatchRequest.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeaturedOfferExpectedPriceBatchRequest {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

