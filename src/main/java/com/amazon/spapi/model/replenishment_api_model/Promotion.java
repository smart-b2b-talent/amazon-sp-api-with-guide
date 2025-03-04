/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.replenishment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.replenishment_api_model.DiscountFunding;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Offer promotions to include in the result filter criteria.
 */
@ApiModel(description = "Offer promotions to include in the result filter criteria.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:09.675+08:00")
public class Promotion {
  @SerializedName("sellingPartnerFundedBaseDiscount")
  private DiscountFunding sellingPartnerFundedBaseDiscount = null;

  @SerializedName("sellingPartnerFundedTieredDiscount")
  private DiscountFunding sellingPartnerFundedTieredDiscount = null;

  @SerializedName("amazonFundedBaseDiscount")
  private DiscountFunding amazonFundedBaseDiscount = null;

  @SerializedName("amazonFundedTieredDiscount")
  private DiscountFunding amazonFundedTieredDiscount = null;

  public Promotion sellingPartnerFundedBaseDiscount(DiscountFunding sellingPartnerFundedBaseDiscount) {
    this.sellingPartnerFundedBaseDiscount = sellingPartnerFundedBaseDiscount;
    return this;
  }

   /**
   * A base discount set by the selling partner on the offer.
   * @return sellingPartnerFundedBaseDiscount
  **/
  @ApiModelProperty(value = "A base discount set by the selling partner on the offer.")
  public DiscountFunding getSellingPartnerFundedBaseDiscount() {
    return sellingPartnerFundedBaseDiscount;
  }

  public void setSellingPartnerFundedBaseDiscount(DiscountFunding sellingPartnerFundedBaseDiscount) {
    this.sellingPartnerFundedBaseDiscount = sellingPartnerFundedBaseDiscount;
  }

  public Promotion sellingPartnerFundedTieredDiscount(DiscountFunding sellingPartnerFundedTieredDiscount) {
    this.sellingPartnerFundedTieredDiscount = sellingPartnerFundedTieredDiscount;
    return this;
  }

   /**
   * A tiered discount set by the selling partner on the offer.
   * @return sellingPartnerFundedTieredDiscount
  **/
  @ApiModelProperty(value = "A tiered discount set by the selling partner on the offer.")
  public DiscountFunding getSellingPartnerFundedTieredDiscount() {
    return sellingPartnerFundedTieredDiscount;
  }

  public void setSellingPartnerFundedTieredDiscount(DiscountFunding sellingPartnerFundedTieredDiscount) {
    this.sellingPartnerFundedTieredDiscount = sellingPartnerFundedTieredDiscount;
  }

  public Promotion amazonFundedBaseDiscount(DiscountFunding amazonFundedBaseDiscount) {
    this.amazonFundedBaseDiscount = amazonFundedBaseDiscount;
    return this;
  }

   /**
   * A base discount set by Amazon on the offer.
   * @return amazonFundedBaseDiscount
  **/
  @ApiModelProperty(value = "A base discount set by Amazon on the offer.")
  public DiscountFunding getAmazonFundedBaseDiscount() {
    return amazonFundedBaseDiscount;
  }

  public void setAmazonFundedBaseDiscount(DiscountFunding amazonFundedBaseDiscount) {
    this.amazonFundedBaseDiscount = amazonFundedBaseDiscount;
  }

  public Promotion amazonFundedTieredDiscount(DiscountFunding amazonFundedTieredDiscount) {
    this.amazonFundedTieredDiscount = amazonFundedTieredDiscount;
    return this;
  }

   /**
   * A tiered discount set by Amazon on the offer.
   * @return amazonFundedTieredDiscount
  **/
  @ApiModelProperty(value = "A tiered discount set by Amazon on the offer.")
  public DiscountFunding getAmazonFundedTieredDiscount() {
    return amazonFundedTieredDiscount;
  }

  public void setAmazonFundedTieredDiscount(DiscountFunding amazonFundedTieredDiscount) {
    this.amazonFundedTieredDiscount = amazonFundedTieredDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.sellingPartnerFundedBaseDiscount, promotion.sellingPartnerFundedBaseDiscount) &&
        Objects.equals(this.sellingPartnerFundedTieredDiscount, promotion.sellingPartnerFundedTieredDiscount) &&
        Objects.equals(this.amazonFundedBaseDiscount, promotion.amazonFundedBaseDiscount) &&
        Objects.equals(this.amazonFundedTieredDiscount, promotion.amazonFundedTieredDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingPartnerFundedBaseDiscount, sellingPartnerFundedTieredDiscount, amazonFundedBaseDiscount, amazonFundedTieredDiscount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    sellingPartnerFundedBaseDiscount: ").append(toIndentedString(sellingPartnerFundedBaseDiscount)).append("\n");
    sb.append("    sellingPartnerFundedTieredDiscount: ").append(toIndentedString(sellingPartnerFundedTieredDiscount)).append("\n");
    sb.append("    amazonFundedBaseDiscount: ").append(toIndentedString(amazonFundedBaseDiscount)).append("\n");
    sb.append("    amazonFundedTieredDiscount: ").append(toIndentedString(amazonFundedTieredDiscount)).append("\n");
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

