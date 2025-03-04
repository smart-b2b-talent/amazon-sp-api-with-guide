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
import com.amazon.spapi.model.vendor_orders_api_model.ItemStatus;
import com.amazon.spapi.model.vendor_orders_api_model.PartyIdentification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Current status of a purchase order.
 */
@ApiModel(description = "Current status of a purchase order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:41.239+08:00")
public class OrderStatus {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  /**
   * The status of the buyer&#39;s purchase order for this order.
   */
  @JsonAdapter(PurchaseOrderStatusEnum.Adapter.class)
  public enum PurchaseOrderStatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

    private String value;

    PurchaseOrderStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurchaseOrderStatusEnum fromValue(String text) {
      for (PurchaseOrderStatusEnum b : PurchaseOrderStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PurchaseOrderStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurchaseOrderStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurchaseOrderStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurchaseOrderStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("purchaseOrderStatus")
  private PurchaseOrderStatusEnum purchaseOrderStatus = null;

  @SerializedName("purchaseOrderDate")
  private OffsetDateTime purchaseOrderDate = null;

  @SerializedName("lastUpdatedDate")
  private OffsetDateTime lastUpdatedDate = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipToParty")
  private PartyIdentification shipToParty = null;

  @SerializedName("itemStatus")
  private ItemStatus itemStatus = null;

  public OrderStatus purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The buyer&#39;s purchase order number for this order. Formatting Notes: 8-character alpha-numeric code.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "The buyer's purchase order number for this order. Formatting Notes: 8-character alpha-numeric code.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public OrderStatus purchaseOrderStatus(PurchaseOrderStatusEnum purchaseOrderStatus) {
    this.purchaseOrderStatus = purchaseOrderStatus;
    return this;
  }

   /**
   * The status of the buyer&#39;s purchase order for this order.
   * @return purchaseOrderStatus
  **/
  @ApiModelProperty(required = true, value = "The status of the buyer's purchase order for this order.")
  public PurchaseOrderStatusEnum getPurchaseOrderStatus() {
    return purchaseOrderStatus;
  }

  public void setPurchaseOrderStatus(PurchaseOrderStatusEnum purchaseOrderStatus) {
    this.purchaseOrderStatus = purchaseOrderStatus;
  }

  public OrderStatus purchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * The date the purchase order was placed. Must be in ISO-8601 date/time format.
   * @return purchaseOrderDate
  **/
  @ApiModelProperty(required = true, value = "The date the purchase order was placed. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public OrderStatus lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * The date when the purchase order was last updated. Must be in ISO-8601 date/time format.
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(value = "The date when the purchase order was last updated. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public OrderStatus sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * Name/Address and tax details of the selling party.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "Name/Address and tax details of the selling party.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public OrderStatus shipToParty(PartyIdentification shipToParty) {
    this.shipToParty = shipToParty;
    return this;
  }

   /**
   * Name/Address and tax details of the ship to party. Find a list of fulfillment center addresses for a region on the [Resources page of Amazon Vendor Central](https://vendorcentral.amazon.com/hz/vendor/members/support/help/node/GPZ88XH8HQM97ZV6).
   * @return shipToParty
  **/
  @ApiModelProperty(required = true, value = "Name/Address and tax details of the ship to party. Find a list of fulfillment center addresses for a region on the [Resources page of Amazon Vendor Central](https://vendorcentral.amazon.com/hz/vendor/members/support/help/node/GPZ88XH8HQM97ZV6).")
  public PartyIdentification getShipToParty() {
    return shipToParty;
  }

  public void setShipToParty(PartyIdentification shipToParty) {
    this.shipToParty = shipToParty;
  }

  public OrderStatus itemStatus(ItemStatus itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Detailed order status.
   * @return itemStatus
  **/
  @ApiModelProperty(required = true, value = "Detailed order status.")
  public ItemStatus getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(ItemStatus itemStatus) {
    this.itemStatus = itemStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatus orderStatus = (OrderStatus) o;
    return Objects.equals(this.purchaseOrderNumber, orderStatus.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderStatus, orderStatus.purchaseOrderStatus) &&
        Objects.equals(this.purchaseOrderDate, orderStatus.purchaseOrderDate) &&
        Objects.equals(this.lastUpdatedDate, orderStatus.lastUpdatedDate) &&
        Objects.equals(this.sellingParty, orderStatus.sellingParty) &&
        Objects.equals(this.shipToParty, orderStatus.shipToParty) &&
        Objects.equals(this.itemStatus, orderStatus.itemStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, purchaseOrderStatus, purchaseOrderDate, lastUpdatedDate, sellingParty, shipToParty, itemStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatus {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderStatus: ").append(toIndentedString(purchaseOrderStatus)).append("\n");
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipToParty: ").append(toIndentedString(shipToParty)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
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

