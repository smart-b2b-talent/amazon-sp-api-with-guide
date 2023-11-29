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
import com.amazon.spapi.model.vendor_shipments_api_model.Volume;
import com.amazon.spapi.model.vendor_shipments_api_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Shipment measurement details.
 */
@ApiModel(description = "Shipment measurement details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:42.836+08:00")
public class TransportShipmentMeasurements {
  @SerializedName("totalCartonCount")
  private Integer totalCartonCount = null;

  @SerializedName("totalPalletStackable")
  private Integer totalPalletStackable = null;

  @SerializedName("totalPalletNonStackable")
  private Integer totalPalletNonStackable = null;

  @SerializedName("shipmentWeight")
  private Weight shipmentWeight = null;

  @SerializedName("shipmentVolume")
  private Volume shipmentVolume = null;

  public TransportShipmentMeasurements totalCartonCount(Integer totalCartonCount) {
    this.totalCartonCount = totalCartonCount;
    return this;
  }

   /**
   * Total number of cartons present in the shipment. Provide the cartonCount only for non-palletized shipments.
   * @return totalCartonCount
  **/
  @ApiModelProperty(value = "Total number of cartons present in the shipment. Provide the cartonCount only for non-palletized shipments.")
  public Integer getTotalCartonCount() {
    return totalCartonCount;
  }

  public void setTotalCartonCount(Integer totalCartonCount) {
    this.totalCartonCount = totalCartonCount;
  }

  public TransportShipmentMeasurements totalPalletStackable(Integer totalPalletStackable) {
    this.totalPalletStackable = totalPalletStackable;
    return this;
  }

   /**
   * Total number of Stackable Pallets present in the shipment.
   * @return totalPalletStackable
  **/
  @ApiModelProperty(value = "Total number of Stackable Pallets present in the shipment.")
  public Integer getTotalPalletStackable() {
    return totalPalletStackable;
  }

  public void setTotalPalletStackable(Integer totalPalletStackable) {
    this.totalPalletStackable = totalPalletStackable;
  }

  public TransportShipmentMeasurements totalPalletNonStackable(Integer totalPalletNonStackable) {
    this.totalPalletNonStackable = totalPalletNonStackable;
    return this;
  }

   /**
   * Total number of Non Stackable Pallets present in the shipment.
   * @return totalPalletNonStackable
  **/
  @ApiModelProperty(value = "Total number of Non Stackable Pallets present in the shipment.")
  public Integer getTotalPalletNonStackable() {
    return totalPalletNonStackable;
  }

  public void setTotalPalletNonStackable(Integer totalPalletNonStackable) {
    this.totalPalletNonStackable = totalPalletNonStackable;
  }

  public TransportShipmentMeasurements shipmentWeight(Weight shipmentWeight) {
    this.shipmentWeight = shipmentWeight;
    return this;
  }

   /**
   * Total Weight of the shipment.
   * @return shipmentWeight
  **/
  @ApiModelProperty(value = "Total Weight of the shipment.")
  public Weight getShipmentWeight() {
    return shipmentWeight;
  }

  public void setShipmentWeight(Weight shipmentWeight) {
    this.shipmentWeight = shipmentWeight;
  }

  public TransportShipmentMeasurements shipmentVolume(Volume shipmentVolume) {
    this.shipmentVolume = shipmentVolume;
    return this;
  }

   /**
   * Total Volume of the shipment.
   * @return shipmentVolume
  **/
  @ApiModelProperty(value = "Total Volume of the shipment.")
  public Volume getShipmentVolume() {
    return shipmentVolume;
  }

  public void setShipmentVolume(Volume shipmentVolume) {
    this.shipmentVolume = shipmentVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportShipmentMeasurements transportShipmentMeasurements = (TransportShipmentMeasurements) o;
    return Objects.equals(this.totalCartonCount, transportShipmentMeasurements.totalCartonCount) &&
        Objects.equals(this.totalPalletStackable, transportShipmentMeasurements.totalPalletStackable) &&
        Objects.equals(this.totalPalletNonStackable, transportShipmentMeasurements.totalPalletNonStackable) &&
        Objects.equals(this.shipmentWeight, transportShipmentMeasurements.shipmentWeight) &&
        Objects.equals(this.shipmentVolume, transportShipmentMeasurements.shipmentVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCartonCount, totalPalletStackable, totalPalletNonStackable, shipmentWeight, shipmentVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportShipmentMeasurements {\n");
    
    sb.append("    totalCartonCount: ").append(toIndentedString(totalCartonCount)).append("\n");
    sb.append("    totalPalletStackable: ").append(toIndentedString(totalPalletStackable)).append("\n");
    sb.append("    totalPalletNonStackable: ").append(toIndentedString(totalPalletNonStackable)).append("\n");
    sb.append("    shipmentWeight: ").append(toIndentedString(shipmentWeight)).append("\n");
    sb.append("    shipmentVolume: ").append(toIndentedString(shipmentVolume)).append("\n");
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

