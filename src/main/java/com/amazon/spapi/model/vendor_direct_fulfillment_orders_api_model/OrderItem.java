/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.BuyerCustomizedInfoDetail;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.GiftDetails;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.ItemQuantity;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.Money;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.ScheduledDeliveryShipment;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.TaxItemDetails;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:30.605+08:00")
public class OrderItem {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("orderedQuantity")
  private ItemQuantity orderedQuantity = null;

  @SerializedName("scheduledDeliveryShipment")
  private ScheduledDeliveryShipment scheduledDeliveryShipment = null;

  @SerializedName("giftDetails")
  private GiftDetails giftDetails = null;

  @SerializedName("netPrice")
  private Money netPrice = null;

  @SerializedName("taxDetails")
  private TaxItemDetails taxDetails = null;

  @SerializedName("totalPrice")
  private Money totalPrice = null;

  @SerializedName("buyerCustomizedInfo")
  private BuyerCustomizedInfoDetail buyerCustomizedInfo = null;

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

  public OrderItem buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Buyer&#39;s standard identification number (ASIN) of an item.
   * @return buyerProductIdentifier
  **/
  @ApiModelProperty(value = "Buyer's standard identification number (ASIN) of an item.")
  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
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

  public OrderItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title for the item.
   * @return title
  **/
  @ApiModelProperty(value = "Title for the item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public OrderItem scheduledDeliveryShipment(ScheduledDeliveryShipment scheduledDeliveryShipment) {
    this.scheduledDeliveryShipment = scheduledDeliveryShipment;
    return this;
  }

   /**
   * Details for the scheduled delivery shipment.
   * @return scheduledDeliveryShipment
  **/
  @ApiModelProperty(value = "Details for the scheduled delivery shipment.")
  public ScheduledDeliveryShipment getScheduledDeliveryShipment() {
    return scheduledDeliveryShipment;
  }

  public void setScheduledDeliveryShipment(ScheduledDeliveryShipment scheduledDeliveryShipment) {
    this.scheduledDeliveryShipment = scheduledDeliveryShipment;
  }

  public OrderItem giftDetails(GiftDetails giftDetails) {
    this.giftDetails = giftDetails;
    return this;
  }

   /**
   * Gift message and wrapId details.
   * @return giftDetails
  **/
  @ApiModelProperty(value = "Gift message and wrapId details.")
  public GiftDetails getGiftDetails() {
    return giftDetails;
  }

  public void setGiftDetails(GiftDetails giftDetails) {
    this.giftDetails = giftDetails;
  }

  public OrderItem netPrice(Money netPrice) {
    this.netPrice = netPrice;
    return this;
  }

   /**
   * Net price (before tax) to vendor with currency details.
   * @return netPrice
  **/
  @ApiModelProperty(required = true, value = "Net price (before tax) to vendor with currency details.")
  public Money getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(Money netPrice) {
    this.netPrice = netPrice;
  }

  public OrderItem taxDetails(TaxItemDetails taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

   /**
   * Total tax details for the line item.
   * @return taxDetails
  **/
  @ApiModelProperty(value = "Total tax details for the line item.")
  public TaxItemDetails getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(TaxItemDetails taxDetails) {
    this.taxDetails = taxDetails;
  }

  public OrderItem totalPrice(Money totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * The price to Amazon each (cost).
   * @return totalPrice
  **/
  @ApiModelProperty(value = "The price to Amazon each (cost).")
  public Money getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Money totalPrice) {
    this.totalPrice = totalPrice;
  }

  public OrderItem buyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
    this.buyerCustomizedInfo = buyerCustomizedInfo;
    return this;
  }

   /**
   * The buyer information for products the vendor has configured as customizable, specifying the types of customizations or configurations along with types and ranges for their product. This provides the ability for buyers to customize multiple aspects of the products according to what the vendor allows.
   * @return buyerCustomizedInfo
  **/
  @ApiModelProperty(value = "The buyer information for products the vendor has configured as customizable, specifying the types of customizations or configurations along with types and ranges for their product. This provides the ability for buyers to customize multiple aspects of the products according to what the vendor allows.")
  public BuyerCustomizedInfoDetail getBuyerCustomizedInfo() {
    return buyerCustomizedInfo;
  }

  public void setBuyerCustomizedInfo(BuyerCustomizedInfoDetail buyerCustomizedInfo) {
    this.buyerCustomizedInfo = buyerCustomizedInfo;
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
        Objects.equals(this.buyerProductIdentifier, orderItem.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, orderItem.vendorProductIdentifier) &&
        Objects.equals(this.title, orderItem.title) &&
        Objects.equals(this.orderedQuantity, orderItem.orderedQuantity) &&
        Objects.equals(this.scheduledDeliveryShipment, orderItem.scheduledDeliveryShipment) &&
        Objects.equals(this.giftDetails, orderItem.giftDetails) &&
        Objects.equals(this.netPrice, orderItem.netPrice) &&
        Objects.equals(this.taxDetails, orderItem.taxDetails) &&
        Objects.equals(this.totalPrice, orderItem.totalPrice) &&
        Objects.equals(this.buyerCustomizedInfo, orderItem.buyerCustomizedInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, title, orderedQuantity, scheduledDeliveryShipment, giftDetails, netPrice, taxDetails, totalPrice, buyerCustomizedInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    scheduledDeliveryShipment: ").append(toIndentedString(scheduledDeliveryShipment)).append("\n");
    sb.append("    giftDetails: ").append(toIndentedString(giftDetails)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    buyerCustomizedInfo: ").append(toIndentedString(buyerCustomizedInfo)).append("\n");
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

