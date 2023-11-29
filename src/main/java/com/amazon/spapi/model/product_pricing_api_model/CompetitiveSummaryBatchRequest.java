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
import com.amazon.spapi.model.product_pricing_api_model.CompetitiveSummaryRequestList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The &#x60;competitiveSummary&#x60; batch request data.
 */
@ApiModel(description = "The `competitiveSummary` batch request data.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:06.258+08:00")
public class CompetitiveSummaryBatchRequest {
  @SerializedName("requests")
  private CompetitiveSummaryRequestList requests = null;

  public CompetitiveSummaryBatchRequest requests(CompetitiveSummaryRequestList requests) {
    this.requests = requests;
    return this;
  }

   /**
   * A batched list of &#x60;competitiveSummary&#x60; requests.
   * @return requests
  **/
  @ApiModelProperty(required = true, value = "A batched list of `competitiveSummary` requests.")
  public CompetitiveSummaryRequestList getRequests() {
    return requests;
  }

  public void setRequests(CompetitiveSummaryRequestList requests) {
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
    CompetitiveSummaryBatchRequest competitiveSummaryBatchRequest = (CompetitiveSummaryBatchRequest) o;
    return Objects.equals(this.requests, competitiveSummaryBatchRequest.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitiveSummaryBatchRequest {\n");
    
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

