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
import com.amazon.spapi.model.product_pricing_api_model.Condition;
import com.amazon.spapi.model.product_pricing_api_model.FulfillmentType;
import com.amazon.spapi.model.product_pricing_api_model.MoneyType;
import com.amazon.spapi.model.product_pricing_api_model.Points;
import com.amazon.spapi.model.product_pricing_api_model.ShippingOption;
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
 * The offer data of a product.
 */
@ApiModel(description = "The offer data of a product.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:06.258+08:00")
public class Offer {
  @SerializedName("sellerId")
  private String sellerId = null;

  @SerializedName("condition")
  private Condition condition = null;

  @SerializedName("fulfillmentType")
  private FulfillmentType fulfillmentType = null;

  @SerializedName("listingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("shippingOptions")
  private List<ShippingOption> shippingOptions = null;

  @SerializedName("points")
  private Points points = null;

  public Offer sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(required = true, value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public Offer condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Item Condition.
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "Item Condition.")
  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public Offer fulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

   /**
   * The fulfillment type for the offer. Possible values are AFN (Amazon Fulfillment Network) and MFN (Merchant Fulfillment Network).
   * @return fulfillmentType
  **/
  @ApiModelProperty(required = true, value = "The fulfillment type for the offer. Possible values are AFN (Amazon Fulfillment Network) and MFN (Merchant Fulfillment Network).")
  public FulfillmentType getFulfillmentType() {
    return fulfillmentType;
  }

  public void setFulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
  }

  public Offer listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * Offer buying price. Does not include shipping, points, or applicable promotions.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "Offer buying price. Does not include shipping, points, or applicable promotions.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public Offer shippingOptions(List<ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public Offer addShippingOptionsItem(ShippingOption shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<ShippingOption>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

   /**
   * A list of shipping options associated with this offer
   * @return shippingOptions
  **/
  @ApiModelProperty(value = "A list of shipping options associated with this offer")
  public List<ShippingOption> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  public Offer points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item, and their monetary value. Note that the Points element is only returned in Japan (JP).
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item, and their monetary value. Note that the Points element is only returned in Japan (JP).")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.sellerId, offer.sellerId) &&
        Objects.equals(this.condition, offer.condition) &&
        Objects.equals(this.fulfillmentType, offer.fulfillmentType) &&
        Objects.equals(this.listingPrice, offer.listingPrice) &&
        Objects.equals(this.shippingOptions, offer.shippingOptions) &&
        Objects.equals(this.points, offer.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, condition, fulfillmentType, listingPrice, shippingOptions, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    fulfillmentType: ").append(toIndentedString(fulfillmentType)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

