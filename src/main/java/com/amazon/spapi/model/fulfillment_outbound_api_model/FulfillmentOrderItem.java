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
import com.amazon.spapi.model.fulfillment_outbound_api_model.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Item information for a fulfillment order.
 */
@ApiModel(description = "Item information for a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:53.196+08:00")
public class FulfillmentOrderItem {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("giftMessage")
  private String giftMessage = null;

  @SerializedName("displayableComment")
  private String displayableComment = null;

  @SerializedName("fulfillmentNetworkSku")
  private String fulfillmentNetworkSku = null;

  @SerializedName("orderItemDisposition")
  private String orderItemDisposition = null;

  @SerializedName("cancelledQuantity")
  private Integer cancelledQuantity = null;

  @SerializedName("unfulfillableQuantity")
  private Integer unfulfillableQuantity = null;

  @SerializedName("estimatedShipDate")
  private String estimatedShipDate = null;

  @SerializedName("estimatedArrivalDate")
  private String estimatedArrivalDate = null;

  @SerializedName("perUnitPrice")
  private Money perUnitPrice = null;

  @SerializedName("perUnitTax")
  private Money perUnitTax = null;

  @SerializedName("perUnitDeclaredValue")
  private Money perUnitDeclaredValue = null;

  public FulfillmentOrderItem sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSku
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public FulfillmentOrderItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * A fulfillment order item identifier submitted with a call to the createFulfillmentOrder operation.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "A fulfillment order item identifier submitted with a call to the createFulfillmentOrder operation.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public FulfillmentOrderItem quantity(Integer quantity) {
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

  public FulfillmentOrderItem giftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
    return this;
  }

   /**
   * A message to the gift recipient, if applicable.
   * @return giftMessage
  **/
  @ApiModelProperty(value = "A message to the gift recipient, if applicable.")
  public String getGiftMessage() {
    return giftMessage;
  }

  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }

  public FulfillmentOrderItem displayableComment(String displayableComment) {
    this.displayableComment = displayableComment;
    return this;
  }

   /**
   * Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip.
   * @return displayableComment
  **/
  @ApiModelProperty(value = "Item-specific text that displays in recipient-facing materials such as the outbound shipment packing slip.")
  public String getDisplayableComment() {
    return displayableComment;
  }

  public void setDisplayableComment(String displayableComment) {
    this.displayableComment = displayableComment;
  }

  public FulfillmentOrderItem fulfillmentNetworkSku(String fulfillmentNetworkSku) {
    this.fulfillmentNetworkSku = fulfillmentNetworkSku;
    return this;
  }

   /**
   * Amazon&#39;s fulfillment network SKU of the item.
   * @return fulfillmentNetworkSku
  **/
  @ApiModelProperty(value = "Amazon's fulfillment network SKU of the item.")
  public String getFulfillmentNetworkSku() {
    return fulfillmentNetworkSku;
  }

  public void setFulfillmentNetworkSku(String fulfillmentNetworkSku) {
    this.fulfillmentNetworkSku = fulfillmentNetworkSku;
  }

  public FulfillmentOrderItem orderItemDisposition(String orderItemDisposition) {
    this.orderItemDisposition = orderItemDisposition;
    return this;
  }

   /**
   * Indicates whether the item is sellable or unsellable.
   * @return orderItemDisposition
  **/
  @ApiModelProperty(value = "Indicates whether the item is sellable or unsellable.")
  public String getOrderItemDisposition() {
    return orderItemDisposition;
  }

  public void setOrderItemDisposition(String orderItemDisposition) {
    this.orderItemDisposition = orderItemDisposition;
  }

  public FulfillmentOrderItem cancelledQuantity(Integer cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
    return this;
  }

   /**
   * The item quantity that was cancelled by the seller.
   * @return cancelledQuantity
  **/
  @ApiModelProperty(required = true, value = "The item quantity that was cancelled by the seller.")
  public Integer getCancelledQuantity() {
    return cancelledQuantity;
  }

  public void setCancelledQuantity(Integer cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
  }

  public FulfillmentOrderItem unfulfillableQuantity(Integer unfulfillableQuantity) {
    this.unfulfillableQuantity = unfulfillableQuantity;
    return this;
  }

   /**
   * The item quantity that is unfulfillable.
   * @return unfulfillableQuantity
  **/
  @ApiModelProperty(required = true, value = "The item quantity that is unfulfillable.")
  public Integer getUnfulfillableQuantity() {
    return unfulfillableQuantity;
  }

  public void setUnfulfillableQuantity(Integer unfulfillableQuantity) {
    this.unfulfillableQuantity = unfulfillableQuantity;
  }

  public FulfillmentOrderItem estimatedShipDate(String estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
    return this;
  }

   /**
   * The estimated date and time that the item quantity is scheduled to ship from the fulfillment center. Note that this value can change over time. If the shipment that contains the item quantity has been cancelled, estimatedShipDate is not returned.
   * @return estimatedShipDate
  **/
  @ApiModelProperty(value = "The estimated date and time that the item quantity is scheduled to ship from the fulfillment center. Note that this value can change over time. If the shipment that contains the item quantity has been cancelled, estimatedShipDate is not returned.")
  public String getEstimatedShipDate() {
    return estimatedShipDate;
  }

  public void setEstimatedShipDate(String estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
  }

  public FulfillmentOrderItem estimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
    return this;
  }

   /**
   * The estimated arrival date and time of the item quantity. Note that this value can change over time. If the shipment that contains the item quantity has been cancelled, estimatedArrivalDate is not returned.
   * @return estimatedArrivalDate
  **/
  @ApiModelProperty(value = "The estimated arrival date and time of the item quantity. Note that this value can change over time. If the shipment that contains the item quantity has been cancelled, estimatedArrivalDate is not returned.")
  public String getEstimatedArrivalDate() {
    return estimatedArrivalDate;
  }

  public void setEstimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
  }

  public FulfillmentOrderItem perUnitPrice(Money perUnitPrice) {
    this.perUnitPrice = perUnitPrice;
    return this;
  }

   /**
   * The amount to be collected from the recipient for this item in a COD (Cash On Delivery) order.
   * @return perUnitPrice
  **/
  @ApiModelProperty(value = "The amount to be collected from the recipient for this item in a COD (Cash On Delivery) order.")
  public Money getPerUnitPrice() {
    return perUnitPrice;
  }

  public void setPerUnitPrice(Money perUnitPrice) {
    this.perUnitPrice = perUnitPrice;
  }

  public FulfillmentOrderItem perUnitTax(Money perUnitTax) {
    this.perUnitTax = perUnitTax;
    return this;
  }

   /**
   * The tax on the amount to be collected from the recipient for this item in a COD (Cash On Delivery) order.
   * @return perUnitTax
  **/
  @ApiModelProperty(value = "The tax on the amount to be collected from the recipient for this item in a COD (Cash On Delivery) order.")
  public Money getPerUnitTax() {
    return perUnitTax;
  }

  public void setPerUnitTax(Money perUnitTax) {
    this.perUnitTax = perUnitTax;
  }

  public FulfillmentOrderItem perUnitDeclaredValue(Money perUnitDeclaredValue) {
    this.perUnitDeclaredValue = perUnitDeclaredValue;
    return this;
  }

   /**
   * The monetary value assigned by the seller to this item.
   * @return perUnitDeclaredValue
  **/
  @ApiModelProperty(value = "The monetary value assigned by the seller to this item.")
  public Money getPerUnitDeclaredValue() {
    return perUnitDeclaredValue;
  }

  public void setPerUnitDeclaredValue(Money perUnitDeclaredValue) {
    this.perUnitDeclaredValue = perUnitDeclaredValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentOrderItem fulfillmentOrderItem = (FulfillmentOrderItem) o;
    return Objects.equals(this.sellerSku, fulfillmentOrderItem.sellerSku) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, fulfillmentOrderItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.quantity, fulfillmentOrderItem.quantity) &&
        Objects.equals(this.giftMessage, fulfillmentOrderItem.giftMessage) &&
        Objects.equals(this.displayableComment, fulfillmentOrderItem.displayableComment) &&
        Objects.equals(this.fulfillmentNetworkSku, fulfillmentOrderItem.fulfillmentNetworkSku) &&
        Objects.equals(this.orderItemDisposition, fulfillmentOrderItem.orderItemDisposition) &&
        Objects.equals(this.cancelledQuantity, fulfillmentOrderItem.cancelledQuantity) &&
        Objects.equals(this.unfulfillableQuantity, fulfillmentOrderItem.unfulfillableQuantity) &&
        Objects.equals(this.estimatedShipDate, fulfillmentOrderItem.estimatedShipDate) &&
        Objects.equals(this.estimatedArrivalDate, fulfillmentOrderItem.estimatedArrivalDate) &&
        Objects.equals(this.perUnitPrice, fulfillmentOrderItem.perUnitPrice) &&
        Objects.equals(this.perUnitTax, fulfillmentOrderItem.perUnitTax) &&
        Objects.equals(this.perUnitDeclaredValue, fulfillmentOrderItem.perUnitDeclaredValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, sellerFulfillmentOrderItemId, quantity, giftMessage, displayableComment, fulfillmentNetworkSku, orderItemDisposition, cancelledQuantity, unfulfillableQuantity, estimatedShipDate, estimatedArrivalDate, perUnitPrice, perUnitTax, perUnitDeclaredValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentOrderItem {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    displayableComment: ").append(toIndentedString(displayableComment)).append("\n");
    sb.append("    fulfillmentNetworkSku: ").append(toIndentedString(fulfillmentNetworkSku)).append("\n");
    sb.append("    orderItemDisposition: ").append(toIndentedString(orderItemDisposition)).append("\n");
    sb.append("    cancelledQuantity: ").append(toIndentedString(cancelledQuantity)).append("\n");
    sb.append("    unfulfillableQuantity: ").append(toIndentedString(unfulfillableQuantity)).append("\n");
    sb.append("    estimatedShipDate: ").append(toIndentedString(estimatedShipDate)).append("\n");
    sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
    sb.append("    perUnitPrice: ").append(toIndentedString(perUnitPrice)).append("\n");
    sb.append("    perUnitTax: ").append(toIndentedString(perUnitTax)).append("\n");
    sb.append("    perUnitDeclaredValue: ").append(toIndentedString(perUnitDeclaredValue)).append("\n");
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

