/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_shipments_api_model.ItemDetails;
import com.amazon.spapi.model.vendor_shipments_api_model.ItemQuantity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Carton/Pallet level details for the item.
 */
@ApiModel(description = "Carton/Pallet level details for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:42.836+08:00")
public class ContainerItem {
  @SerializedName("itemReference")
  private String itemReference = null;

  @SerializedName("shippedQuantity")
  private ItemQuantity shippedQuantity = null;

  @SerializedName("itemDetails")
  private ItemDetails itemDetails = null;

  public ContainerItem itemReference(String itemReference) {
    this.itemReference = itemReference;
    return this;
  }

   /**
   * The reference number for the item. Please provide the itemSequenceNumber from the &#39;items&#39; segment to refer to that item&#39;s details here.
   * @return itemReference
  **/
  @ApiModelProperty(required = true, value = "The reference number for the item. Please provide the itemSequenceNumber from the 'items' segment to refer to that item's details here.")
  public String getItemReference() {
    return itemReference;
  }

  public void setItemReference(String itemReference) {
    this.itemReference = itemReference;
  }

  public ContainerItem shippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
    return this;
  }

   /**
   * Total item quantity shipped in this carton/pallet.
   * @return shippedQuantity
  **/
  @ApiModelProperty(required = true, value = "Total item quantity shipped in this carton/pallet.")
  public ItemQuantity getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }

  public ContainerItem itemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }

   /**
   * Get itemDetails
   * @return itemDetails
  **/
  @ApiModelProperty(value = "")
  public ItemDetails getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(ItemDetails itemDetails) {
    this.itemDetails = itemDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerItem containerItem = (ContainerItem) o;
    return Objects.equals(this.itemReference, containerItem.itemReference) &&
        Objects.equals(this.shippedQuantity, containerItem.shippedQuantity) &&
        Objects.equals(this.itemDetails, containerItem.itemDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference, shippedQuantity, itemDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerItem {\n");
    
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("    shippedQuantity: ").append(toIndentedString(shippedQuantity)).append("\n");
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
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

