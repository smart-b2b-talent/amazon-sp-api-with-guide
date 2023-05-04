/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders_api_model.Address;
import com.amazon.spapi.model.orders_api_model.DeliveryPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The shipping address for the order.
 */
@ApiModel(description = "The shipping address for the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:44.667-04:00")
public class OrderAddress {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("BuyerCompanyName")
  private String buyerCompanyName = null;

  @SerializedName("ShippingAddress")
  private Address shippingAddress = null;

  @SerializedName("DeliveryPreferences")
  private DeliveryPreferences deliveryPreferences = null;

  public OrderAddress amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order identifier, in 3-7-7 format.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public OrderAddress buyerCompanyName(String buyerCompanyName) {
    this.buyerCompanyName = buyerCompanyName;
    return this;
  }

   /**
   * Company name of the destination address.
   * @return buyerCompanyName
  **/
  @ApiModelProperty(value = "Company name of the destination address.")
  public String getBuyerCompanyName() {
    return buyerCompanyName;
  }

  public void setBuyerCompanyName(String buyerCompanyName) {
    this.buyerCompanyName = buyerCompanyName;
  }

  public OrderAddress shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public OrderAddress deliveryPreferences(DeliveryPreferences deliveryPreferences) {
    this.deliveryPreferences = deliveryPreferences;
    return this;
  }

   /**
   * Get deliveryPreferences
   * @return deliveryPreferences
  **/
  @ApiModelProperty(value = "")
  public DeliveryPreferences getDeliveryPreferences() {
    return deliveryPreferences;
  }

  public void setDeliveryPreferences(DeliveryPreferences deliveryPreferences) {
    this.deliveryPreferences = deliveryPreferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAddress orderAddress = (OrderAddress) o;
    return Objects.equals(this.amazonOrderId, orderAddress.amazonOrderId) &&
        Objects.equals(this.buyerCompanyName, orderAddress.buyerCompanyName) &&
        Objects.equals(this.shippingAddress, orderAddress.shippingAddress) &&
        Objects.equals(this.deliveryPreferences, orderAddress.deliveryPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, buyerCompanyName, shippingAddress, deliveryPreferences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAddress {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    buyerCompanyName: ").append(toIndentedString(buyerCompanyName)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    deliveryPreferences: ").append(toIndentedString(deliveryPreferences)).append("\n");
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

