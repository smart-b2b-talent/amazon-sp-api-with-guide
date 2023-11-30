/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_outbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_outbound_api_model.InvalidItemReason;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item that is invalid for return.
 */
@ApiModel(description = "An item that is invalid for return.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:26.811+08:00")
public class InvalidReturnItem {
  @SerializedName("sellerReturnItemId")
  private String sellerReturnItemId = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("invalidItemReason")
  private InvalidItemReason invalidItemReason = null;

  public InvalidReturnItem sellerReturnItemId(String sellerReturnItemId) {
    this.sellerReturnItemId = sellerReturnItemId;
    return this;
  }

   /**
   * An identifier assigned by the seller to the return item.
   * @return sellerReturnItemId
  **/
  @ApiModelProperty(required = true, value = "An identifier assigned by the seller to the return item.")
  public String getSellerReturnItemId() {
    return sellerReturnItemId;
  }

  public void setSellerReturnItemId(String sellerReturnItemId) {
    this.sellerReturnItemId = sellerReturnItemId;
  }

  public InvalidReturnItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * The identifier assigned to the item by the seller when the fulfillment order was created.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "The identifier assigned to the item by the seller when the fulfillment order was created.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public InvalidReturnItem invalidItemReason(InvalidItemReason invalidItemReason) {
    this.invalidItemReason = invalidItemReason;
    return this;
  }

   /**
   * Get invalidItemReason
   * @return invalidItemReason
  **/
  @ApiModelProperty(required = true, value = "")
  public InvalidItemReason getInvalidItemReason() {
    return invalidItemReason;
  }

  public void setInvalidItemReason(InvalidItemReason invalidItemReason) {
    this.invalidItemReason = invalidItemReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidReturnItem invalidReturnItem = (InvalidReturnItem) o;
    return Objects.equals(this.sellerReturnItemId, invalidReturnItem.sellerReturnItemId) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, invalidReturnItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.invalidItemReason, invalidReturnItem.invalidItemReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerReturnItemId, sellerFulfillmentOrderItemId, invalidItemReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidReturnItem {\n");
    
    sb.append("    sellerReturnItemId: ").append(toIndentedString(sellerReturnItemId)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    invalidItemReason: ").append(toIndentedString(invalidItemReason)).append("\n");
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

