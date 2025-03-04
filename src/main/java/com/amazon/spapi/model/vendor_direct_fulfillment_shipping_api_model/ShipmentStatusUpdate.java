/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.PartyIdentification;
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.StatusUpdateDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ShipmentStatusUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:35.708+08:00")
public class ShipmentStatusUpdate {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  @SerializedName("statusUpdateDetails")
  private StatusUpdateDetails statusUpdateDetails = null;

  public ShipmentStatusUpdate purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number of the shipment for which to update the shipment status.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "Purchase order number of the shipment for which to update the shipment status.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public ShipmentStatusUpdate sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "ID of the selling party or vendor.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public ShipmentStatusUpdate shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Warehouse code of vendor.
   * @return shipFromParty
  **/
  @ApiModelProperty(required = true, value = "Warehouse code of vendor.")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public ShipmentStatusUpdate statusUpdateDetails(StatusUpdateDetails statusUpdateDetails) {
    this.statusUpdateDetails = statusUpdateDetails;
    return this;
  }

   /**
   * Provide the details about the status of the shipment at that particular point of time.
   * @return statusUpdateDetails
  **/
  @ApiModelProperty(required = true, value = "Provide the details about the status of the shipment at that particular point of time.")
  public StatusUpdateDetails getStatusUpdateDetails() {
    return statusUpdateDetails;
  }

  public void setStatusUpdateDetails(StatusUpdateDetails statusUpdateDetails) {
    this.statusUpdateDetails = statusUpdateDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentStatusUpdate shipmentStatusUpdate = (ShipmentStatusUpdate) o;
    return Objects.equals(this.purchaseOrderNumber, shipmentStatusUpdate.purchaseOrderNumber) &&
        Objects.equals(this.sellingParty, shipmentStatusUpdate.sellingParty) &&
        Objects.equals(this.shipFromParty, shipmentStatusUpdate.shipFromParty) &&
        Objects.equals(this.statusUpdateDetails, shipmentStatusUpdate.statusUpdateDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, sellingParty, shipFromParty, statusUpdateDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentStatusUpdate {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    statusUpdateDetails: ").append(toIndentedString(statusUpdateDetails)).append("\n");
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

