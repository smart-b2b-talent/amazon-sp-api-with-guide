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
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.ShipmentStatusUpdate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubmitShipmentStatusUpdatesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:35.708+08:00")
public class SubmitShipmentStatusUpdatesRequest {
  @SerializedName("shipmentStatusUpdates")
  private List<ShipmentStatusUpdate> shipmentStatusUpdates = null;

  public SubmitShipmentStatusUpdatesRequest shipmentStatusUpdates(List<ShipmentStatusUpdate> shipmentStatusUpdates) {
    this.shipmentStatusUpdates = shipmentStatusUpdates;
    return this;
  }

  public SubmitShipmentStatusUpdatesRequest addShipmentStatusUpdatesItem(ShipmentStatusUpdate shipmentStatusUpdatesItem) {
    if (this.shipmentStatusUpdates == null) {
      this.shipmentStatusUpdates = new ArrayList<ShipmentStatusUpdate>();
    }
    this.shipmentStatusUpdates.add(shipmentStatusUpdatesItem);
    return this;
  }

   /**
   * Get shipmentStatusUpdates
   * @return shipmentStatusUpdates
  **/
  @ApiModelProperty(value = "")
  public List<ShipmentStatusUpdate> getShipmentStatusUpdates() {
    return shipmentStatusUpdates;
  }

  public void setShipmentStatusUpdates(List<ShipmentStatusUpdate> shipmentStatusUpdates) {
    this.shipmentStatusUpdates = shipmentStatusUpdates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitShipmentStatusUpdatesRequest submitShipmentStatusUpdatesRequest = (SubmitShipmentStatusUpdatesRequest) o;
    return Objects.equals(this.shipmentStatusUpdates, submitShipmentStatusUpdatesRequest.shipmentStatusUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentStatusUpdates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShipmentStatusUpdatesRequest {\n");
    
    sb.append("    shipmentStatusUpdates: ").append(toIndentedString(shipmentStatusUpdates)).append("\n");
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

