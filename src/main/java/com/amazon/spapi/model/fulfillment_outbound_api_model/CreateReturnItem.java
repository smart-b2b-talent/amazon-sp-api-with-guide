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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item that Amazon accepted for return.
 */
@ApiModel(description = "An item that Amazon accepted for return.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:53.196+08:00")
public class CreateReturnItem {
  @SerializedName("sellerReturnItemId")
  private String sellerReturnItemId = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("amazonShipmentId")
  private String amazonShipmentId = null;

  @SerializedName("returnReasonCode")
  private String returnReasonCode = null;

  @SerializedName("returnComment")
  private String returnComment = null;

  public CreateReturnItem sellerReturnItemId(String sellerReturnItemId) {
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

  public CreateReturnItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
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

  public CreateReturnItem amazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
    return this;
  }

   /**
   * The identifier for the shipment that is associated with the return item.
   * @return amazonShipmentId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the shipment that is associated with the return item.")
  public String getAmazonShipmentId() {
    return amazonShipmentId;
  }

  public void setAmazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
  }

  public CreateReturnItem returnReasonCode(String returnReasonCode) {
    this.returnReasonCode = returnReasonCode;
    return this;
  }

   /**
   * The return reason code assigned to the return item by the seller.
   * @return returnReasonCode
  **/
  @ApiModelProperty(required = true, value = "The return reason code assigned to the return item by the seller.")
  public String getReturnReasonCode() {
    return returnReasonCode;
  }

  public void setReturnReasonCode(String returnReasonCode) {
    this.returnReasonCode = returnReasonCode;
  }

  public CreateReturnItem returnComment(String returnComment) {
    this.returnComment = returnComment;
    return this;
  }

   /**
   * An optional comment about the return item.
   * @return returnComment
  **/
  @ApiModelProperty(value = "An optional comment about the return item.")
  public String getReturnComment() {
    return returnComment;
  }

  public void setReturnComment(String returnComment) {
    this.returnComment = returnComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReturnItem createReturnItem = (CreateReturnItem) o;
    return Objects.equals(this.sellerReturnItemId, createReturnItem.sellerReturnItemId) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, createReturnItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.amazonShipmentId, createReturnItem.amazonShipmentId) &&
        Objects.equals(this.returnReasonCode, createReturnItem.returnReasonCode) &&
        Objects.equals(this.returnComment, createReturnItem.returnComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerReturnItemId, sellerFulfillmentOrderItemId, amazonShipmentId, returnReasonCode, returnComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnItem {\n");
    
    sb.append("    sellerReturnItemId: ").append(toIndentedString(sellerReturnItemId)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
    sb.append("    returnReasonCode: ").append(toIndentedString(returnReasonCode)).append("\n");
    sb.append("    returnComment: ").append(toIndentedString(returnComment)).append("\n");
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

