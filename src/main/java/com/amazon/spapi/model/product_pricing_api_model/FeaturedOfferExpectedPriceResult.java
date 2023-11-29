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
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOffer;
import com.amazon.spapi.model.product_pricing_api_model.FeaturedOfferExpectedPrice;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The featured offer expected price result data for the requested offer.
 */
@ApiModel(description = "The featured offer expected price result data for the requested offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:28.929+08:00")
public class FeaturedOfferExpectedPriceResult {
  @SerializedName("featuredOfferExpectedPrice")
  private FeaturedOfferExpectedPrice featuredOfferExpectedPrice = null;

  @SerializedName("resultStatus")
  private String resultStatus = null;

  @SerializedName("competingFeaturedOffer")
  private FeaturedOffer competingFeaturedOffer = null;

  @SerializedName("currentFeaturedOffer")
  private FeaturedOffer currentFeaturedOffer = null;

  public FeaturedOfferExpectedPriceResult featuredOfferExpectedPrice(FeaturedOfferExpectedPrice featuredOfferExpectedPrice) {
    this.featuredOfferExpectedPrice = featuredOfferExpectedPrice;
    return this;
  }

   /**
   * Get featuredOfferExpectedPrice
   * @return featuredOfferExpectedPrice
  **/
  @ApiModelProperty(value = "")
  public FeaturedOfferExpectedPrice getFeaturedOfferExpectedPrice() {
    return featuredOfferExpectedPrice;
  }

  public void setFeaturedOfferExpectedPrice(FeaturedOfferExpectedPrice featuredOfferExpectedPrice) {
    this.featuredOfferExpectedPrice = featuredOfferExpectedPrice;
  }

  public FeaturedOfferExpectedPriceResult resultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
    return this;
  }

   /**
   * The status of the featured offer expected price computation. Possible values include &#x60;VALID_FOEP&#x60;, &#x60;NO_COMPETING_OFFER&#x60;, &#x60;OFFER_NOT_ELIGIBLE&#x60;, &#x60;OFFER_NOT_FOUND&#x60;, &#x60;ASIN_NOT_ELIGIBLE&#x60;. Additional values may be added in the future.
   * @return resultStatus
  **/
  @ApiModelProperty(required = true, value = "The status of the featured offer expected price computation. Possible values include `VALID_FOEP`, `NO_COMPETING_OFFER`, `OFFER_NOT_ELIGIBLE`, `OFFER_NOT_FOUND`, `ASIN_NOT_ELIGIBLE`. Additional values may be added in the future.")
  public String getResultStatus() {
    return resultStatus;
  }

  public void setResultStatus(String resultStatus) {
    this.resultStatus = resultStatus;
  }

  public FeaturedOfferExpectedPriceResult competingFeaturedOffer(FeaturedOffer competingFeaturedOffer) {
    this.competingFeaturedOffer = competingFeaturedOffer;
    return this;
  }

   /**
   * The offer that will likely be the featured offer if the target offer is priced above its featured offer expected price. If the target offer is currently the featured offer, this property will be different than &#x60;currentFeaturedOffer&#x60;.
   * @return competingFeaturedOffer
  **/
  @ApiModelProperty(value = "The offer that will likely be the featured offer if the target offer is priced above its featured offer expected price. If the target offer is currently the featured offer, this property will be different than `currentFeaturedOffer`.")
  public FeaturedOffer getCompetingFeaturedOffer() {
    return competingFeaturedOffer;
  }

  public void setCompetingFeaturedOffer(FeaturedOffer competingFeaturedOffer) {
    this.competingFeaturedOffer = competingFeaturedOffer;
  }

  public FeaturedOfferExpectedPriceResult currentFeaturedOffer(FeaturedOffer currentFeaturedOffer) {
    this.currentFeaturedOffer = currentFeaturedOffer;
    return this;
  }

   /**
   * The offer that is currently the featured offer. If the target offer is not currently featured, then this property will be equal to &#x60;competingFeaturedOffer&#x60;.
   * @return currentFeaturedOffer
  **/
  @ApiModelProperty(value = "The offer that is currently the featured offer. If the target offer is not currently featured, then this property will be equal to `competingFeaturedOffer`.")
  public FeaturedOffer getCurrentFeaturedOffer() {
    return currentFeaturedOffer;
  }

  public void setCurrentFeaturedOffer(FeaturedOffer currentFeaturedOffer) {
    this.currentFeaturedOffer = currentFeaturedOffer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOfferExpectedPriceResult featuredOfferExpectedPriceResult = (FeaturedOfferExpectedPriceResult) o;
    return Objects.equals(this.featuredOfferExpectedPrice, featuredOfferExpectedPriceResult.featuredOfferExpectedPrice) &&
        Objects.equals(this.resultStatus, featuredOfferExpectedPriceResult.resultStatus) &&
        Objects.equals(this.competingFeaturedOffer, featuredOfferExpectedPriceResult.competingFeaturedOffer) &&
        Objects.equals(this.currentFeaturedOffer, featuredOfferExpectedPriceResult.currentFeaturedOffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuredOfferExpectedPrice, resultStatus, competingFeaturedOffer, currentFeaturedOffer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOfferExpectedPriceResult {\n");
    
    sb.append("    featuredOfferExpectedPrice: ").append(toIndentedString(featuredOfferExpectedPrice)).append("\n");
    sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
    sb.append("    competingFeaturedOffer: ").append(toIndentedString(competingFeaturedOffer)).append("\n");
    sb.append("    currentFeaturedOffer: ").append(toIndentedString(currentFeaturedOffer)).append("\n");
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

