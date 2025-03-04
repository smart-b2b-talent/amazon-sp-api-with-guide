/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchant_fulfillment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.merchant_fulfillment_api_model.AdditionalSellerInputsList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.TransparencyCodeList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Amazon order item identifier and a quantity.
 */
@ApiModel(description = "An Amazon order item identifier and a quantity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:57.882+08:00")
public class Item {
  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("ItemWeight")
  private Weight itemWeight = null;

  @SerializedName("ItemDescription")
  private String itemDescription = null;

  @SerializedName("TransparencyCodeList")
  private TransparencyCodeList transparencyCodeList = null;

  @SerializedName("ItemLevelSellerInputsList")
  private AdditionalSellerInputsList itemLevelSellerInputsList = null;

  public Item orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * Get orderItemId
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item itemWeight(Weight itemWeight) {
    this.itemWeight = itemWeight;
    return this;
  }

   /**
   * Get itemWeight
   * @return itemWeight
  **/
  @ApiModelProperty(value = "")
  public Weight getItemWeight() {
    return itemWeight;
  }

  public void setItemWeight(Weight itemWeight) {
    this.itemWeight = itemWeight;
  }

  public Item itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Get itemDescription
   * @return itemDescription
  **/
  @ApiModelProperty(value = "")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public Item transparencyCodeList(TransparencyCodeList transparencyCodeList) {
    this.transparencyCodeList = transparencyCodeList;
    return this;
  }

   /**
   * Get transparencyCodeList
   * @return transparencyCodeList
  **/
  @ApiModelProperty(value = "")
  public TransparencyCodeList getTransparencyCodeList() {
    return transparencyCodeList;
  }

  public void setTransparencyCodeList(TransparencyCodeList transparencyCodeList) {
    this.transparencyCodeList = transparencyCodeList;
  }

  public Item itemLevelSellerInputsList(AdditionalSellerInputsList itemLevelSellerInputsList) {
    this.itemLevelSellerInputsList = itemLevelSellerInputsList;
    return this;
  }

   /**
   * A list of additional seller inputs required to ship this item using the chosen shipping service.
   * @return itemLevelSellerInputsList
  **/
  @ApiModelProperty(value = "A list of additional seller inputs required to ship this item using the chosen shipping service.")
  public AdditionalSellerInputsList getItemLevelSellerInputsList() {
    return itemLevelSellerInputsList;
  }

  public void setItemLevelSellerInputsList(AdditionalSellerInputsList itemLevelSellerInputsList) {
    this.itemLevelSellerInputsList = itemLevelSellerInputsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.orderItemId, item.orderItemId) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.itemWeight, item.itemWeight) &&
        Objects.equals(this.itemDescription, item.itemDescription) &&
        Objects.equals(this.transparencyCodeList, item.transparencyCodeList) &&
        Objects.equals(this.itemLevelSellerInputsList, item.itemLevelSellerInputsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, quantity, itemWeight, itemDescription, transparencyCodeList, itemLevelSellerInputsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemWeight: ").append(toIndentedString(itemWeight)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    transparencyCodeList: ").append(toIndentedString(transparencyCodeList)).append("\n");
    sb.append("    itemLevelSellerInputsList: ").append(toIndentedString(itemLevelSellerInputsList)).append("\n");
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

