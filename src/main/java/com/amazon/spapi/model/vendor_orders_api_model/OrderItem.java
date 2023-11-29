/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_orders_api_model.ItemQuantity;
import com.amazon.spapi.model.vendor_orders_api_model.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:12:13.745+08:00")
public class OrderItem {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("amazonProductIdentifier")
  private String amazonProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("orderedQuantity")
  private ItemQuantity orderedQuantity = null;

  @SerializedName("isBackOrderAllowed")
  private Boolean isBackOrderAllowed = null;

  @SerializedName("netCost")
  private Money netCost = null;

  @SerializedName("listPrice")
  private Money listPrice = null;

  public OrderItem itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on.
   * @return itemSequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on.")
  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public OrderItem amazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
    return this;
  }

   /**
   * Amazon Standard Identification Number (ASIN) of an item.
   * @return amazonProductIdentifier
  **/
  @ApiModelProperty(value = "Amazon Standard Identification Number (ASIN) of an item.")
  public String getAmazonProductIdentifier() {
    return amazonProductIdentifier;
  }

  public void setAmazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
  }

  public OrderItem vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item.
   * @return vendorProductIdentifier
  **/
  @ApiModelProperty(value = "The vendor selected product identification of the item.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public OrderItem orderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

   /**
   * Item quantity ordered.
   * @return orderedQuantity
  **/
  @ApiModelProperty(required = true, value = "Item quantity ordered.")
  public ItemQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public OrderItem isBackOrderAllowed(Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
    return this;
  }

   /**
   * When true, we will accept backorder confirmations for this item.
   * @return isBackOrderAllowed
  **/
  @ApiModelProperty(required = true, value = "When true, we will accept backorder confirmations for this item.")
  public Boolean isIsBackOrderAllowed() {
    return isBackOrderAllowed;
  }

  public void setIsBackOrderAllowed(Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
  }

  public OrderItem netCost(Money netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * The price to Amazon each (cost).
   * @return netCost
  **/
  @ApiModelProperty(value = "The price to Amazon each (cost).")
  public Money getNetCost() {
    return netCost;
  }

  public void setNetCost(Money netCost) {
    this.netCost = netCost;
  }

  public OrderItem listPrice(Money listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * The price to Amazon each (list).
   * @return listPrice
  **/
  @ApiModelProperty(value = "The price to Amazon each (list).")
  public Money getListPrice() {
    return listPrice;
  }

  public void setListPrice(Money listPrice) {
    this.listPrice = listPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.itemSequenceNumber, orderItem.itemSequenceNumber) &&
        Objects.equals(this.amazonProductIdentifier, orderItem.amazonProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, orderItem.vendorProductIdentifier) &&
        Objects.equals(this.orderedQuantity, orderItem.orderedQuantity) &&
        Objects.equals(this.isBackOrderAllowed, orderItem.isBackOrderAllowed) &&
        Objects.equals(this.netCost, orderItem.netCost) &&
        Objects.equals(this.listPrice, orderItem.listPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, amazonProductIdentifier, vendorProductIdentifier, orderedQuantity, isBackOrderAllowed, netCost, listPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    amazonProductIdentifier: ").append(toIndentedString(amazonProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    isBackOrderAllowed: ").append(toIndentedString(isBackOrderAllowed)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
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

