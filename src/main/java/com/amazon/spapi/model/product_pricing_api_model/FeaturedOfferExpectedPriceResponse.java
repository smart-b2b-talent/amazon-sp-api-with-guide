/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, see the [Product Pricing v2022-05-01 Use Case Guide](doc:product-pricing-api-v2022-05-01-use-case-guide).
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
import com.amazon.spapi.model.product_pricing_api_model.BatchResponse;
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOfferExpectedPriceRequestParams;
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOfferExpectedPriceResponseBody;
import com.amazon.spapi.model.product_pricing_api_model.HttpHeaders;
import com.amazon.spapi.model.product_pricing_api_model.HttpStatusLine;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FeaturedOfferExpectedPriceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:41.182-04:00")
public class FeaturedOfferExpectedPriceResponse extends BatchResponse {
  @SerializedName("request")
  private FeaturedOfferExpectedPriceRequestParams request = null;

  @SerializedName("body")
  private FeaturedOfferExpectedPriceResponseBody body = null;

  public FeaturedOfferExpectedPriceResponse request(FeaturedOfferExpectedPriceRequestParams request) {
    this.request = request;
    return this;
  }

   /**
   * Use these request parameters to map the response back to the request.
   * @return request
  **/
  @ApiModelProperty(required = true, value = "Use these request parameters to map the response back to the request.")
  public FeaturedOfferExpectedPriceRequestParams getRequest() {
    return request;
  }

  public void setRequest(FeaturedOfferExpectedPriceRequestParams request) {
    this.request = request;
  }

  public FeaturedOfferExpectedPriceResponse body(FeaturedOfferExpectedPriceResponseBody body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public FeaturedOfferExpectedPriceResponseBody getBody() {
    return body;
  }

  public void setBody(FeaturedOfferExpectedPriceResponseBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOfferExpectedPriceResponse featuredOfferExpectedPriceResponse = (FeaturedOfferExpectedPriceResponse) o;
    return Objects.equals(this.request, featuredOfferExpectedPriceResponse.request) &&
        Objects.equals(this.body, featuredOfferExpectedPriceResponse.body) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, body, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOfferExpectedPriceResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

