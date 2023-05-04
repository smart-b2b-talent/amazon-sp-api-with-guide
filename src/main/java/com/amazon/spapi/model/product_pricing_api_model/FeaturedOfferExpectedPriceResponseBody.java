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
import com.amazon.spapi.model.product_pricing_api_model.ErrorList;
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOfferExpectedPriceResultList;
import com.amazon.spapi.model.product_pricing_api_model.OfferIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The featured offer expected price response data for a requested SKU.
 */
@ApiModel(description = "The featured offer expected price response data for a requested SKU.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:41.182-04:00")
public class FeaturedOfferExpectedPriceResponseBody {
  @SerializedName("offerIdentifier")
  private OfferIdentifier offerIdentifier = null;

  @SerializedName("featuredOfferExpectedPriceResults")
  private FeaturedOfferExpectedPriceResultList featuredOfferExpectedPriceResults = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public FeaturedOfferExpectedPriceResponseBody offerIdentifier(OfferIdentifier offerIdentifier) {
    this.offerIdentifier = offerIdentifier;
    return this;
  }

   /**
   * Metadata that identifies the target offer for which the featured offer expected price result data was computed.
   * @return offerIdentifier
  **/
  @ApiModelProperty(required = true, value = "Metadata that identifies the target offer for which the featured offer expected price result data was computed.")
  public OfferIdentifier getOfferIdentifier() {
    return offerIdentifier;
  }

  public void setOfferIdentifier(OfferIdentifier offerIdentifier) {
    this.offerIdentifier = offerIdentifier;
  }

  public FeaturedOfferExpectedPriceResponseBody featuredOfferExpectedPriceResults(FeaturedOfferExpectedPriceResultList featuredOfferExpectedPriceResults) {
    this.featuredOfferExpectedPriceResults = featuredOfferExpectedPriceResults;
    return this;
  }

   /**
   * The featured offer expected price results for the requested target offer.
   * @return featuredOfferExpectedPriceResults
  **/
  @ApiModelProperty(value = "The featured offer expected price results for the requested target offer.")
  public FeaturedOfferExpectedPriceResultList getFeaturedOfferExpectedPriceResults() {
    return featuredOfferExpectedPriceResults;
  }

  public void setFeaturedOfferExpectedPriceResults(FeaturedOfferExpectedPriceResultList featuredOfferExpectedPriceResults) {
    this.featuredOfferExpectedPriceResults = featuredOfferExpectedPriceResults;
  }

  public FeaturedOfferExpectedPriceResponseBody errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * The errors that occurred if the operation was not successful (HTTP status code non-200).
   * @return errors
  **/
  @ApiModelProperty(value = "The errors that occurred if the operation was not successful (HTTP status code non-200).")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOfferExpectedPriceResponseBody featuredOfferExpectedPriceResponseBody = (FeaturedOfferExpectedPriceResponseBody) o;
    return Objects.equals(this.offerIdentifier, featuredOfferExpectedPriceResponseBody.offerIdentifier) &&
        Objects.equals(this.featuredOfferExpectedPriceResults, featuredOfferExpectedPriceResponseBody.featuredOfferExpectedPriceResults) &&
        Objects.equals(this.errors, featuredOfferExpectedPriceResponseBody.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIdentifier, featuredOfferExpectedPriceResults, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOfferExpectedPriceResponseBody {\n");
    
    sb.append("    offerIdentifier: ").append(toIndentedString(offerIdentifier)).append("\n");
    sb.append("    featuredOfferExpectedPriceResults: ").append(toIndentedString(featuredOfferExpectedPriceResults)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

