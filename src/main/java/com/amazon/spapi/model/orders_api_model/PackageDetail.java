/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders_api_model.ConfirmShipmentOrderItemsList;
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
 * Properties of packages
 */
@ApiModel(description = "Properties of packages")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:02.473+08:00")
public class PackageDetail {
  @SerializedName("packageReferenceId")
  private String packageReferenceId = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("carrierName")
  private String carrierName = null;

  @SerializedName("shippingMethod")
  private String shippingMethod = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  @SerializedName("shipFromSupplySourceId")
  private String shipFromSupplySourceId = null;

  @SerializedName("orderItems")
  private ConfirmShipmentOrderItemsList orderItems = null;

  public PackageDetail packageReferenceId(String packageReferenceId) {
    this.packageReferenceId = packageReferenceId;
    return this;
  }

   /**
   * Get packageReferenceId
   * @return packageReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPackageReferenceId() {
    return packageReferenceId;
  }

  public void setPackageReferenceId(String packageReferenceId) {
    this.packageReferenceId = packageReferenceId;
  }

  public PackageDetail carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Identifies the carrier that will deliver the package. This field is required for all marketplaces, see [reference](https://developer-docs.amazon.com/sp-api/changelog/carriercode-value-required-in-shipment-confirmations-for-br-mx-ca-sg-au-in-jp-marketplaces).
   * @return carrierCode
  **/
  @ApiModelProperty(required = true, value = "Identifies the carrier that will deliver the package. This field is required for all marketplaces, see [reference](https://developer-docs.amazon.com/sp-api/changelog/carriercode-value-required-in-shipment-confirmations-for-br-mx-ca-sg-au-in-jp-marketplaces).")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public PackageDetail carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Carrier Name that will deliver the package. Required when carrierCode is \&quot;Others\&quot; 
   * @return carrierName
  **/
  @ApiModelProperty(value = "Carrier Name that will deliver the package. Required when carrierCode is \"Others\" ")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public PackageDetail shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Ship method to be used for shipping the order.
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Ship method to be used for shipping the order.")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public PackageDetail trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number used to obtain tracking and delivery information.
   * @return trackingNumber
  **/
  @ApiModelProperty(required = true, value = "The tracking number used to obtain tracking and delivery information.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public PackageDetail shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * The shipping date for the package. Must be in ISO-8601 date/time format.
   * @return shipDate
  **/
  @ApiModelProperty(required = true, value = "The shipping date for the package. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public PackageDetail shipFromSupplySourceId(String shipFromSupplySourceId) {
    this.shipFromSupplySourceId = shipFromSupplySourceId;
    return this;
  }

   /**
   * The unique identifier of the supply source.
   * @return shipFromSupplySourceId
  **/
  @ApiModelProperty(value = "The unique identifier of the supply source.")
  public String getShipFromSupplySourceId() {
    return shipFromSupplySourceId;
  }

  public void setShipFromSupplySourceId(String shipFromSupplySourceId) {
    this.shipFromSupplySourceId = shipFromSupplySourceId;
  }

  public PackageDetail orderItems(ConfirmShipmentOrderItemsList orderItems) {
    this.orderItems = orderItems;
    return this;
  }

   /**
   * The list of order items and quantities to be updated.
   * @return orderItems
  **/
  @ApiModelProperty(required = true, value = "The list of order items and quantities to be updated.")
  public ConfirmShipmentOrderItemsList getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(ConfirmShipmentOrderItemsList orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDetail packageDetail = (PackageDetail) o;
    return Objects.equals(this.packageReferenceId, packageDetail.packageReferenceId) &&
        Objects.equals(this.carrierCode, packageDetail.carrierCode) &&
        Objects.equals(this.carrierName, packageDetail.carrierName) &&
        Objects.equals(this.shippingMethod, packageDetail.shippingMethod) &&
        Objects.equals(this.trackingNumber, packageDetail.trackingNumber) &&
        Objects.equals(this.shipDate, packageDetail.shipDate) &&
        Objects.equals(this.shipFromSupplySourceId, packageDetail.shipFromSupplySourceId) &&
        Objects.equals(this.orderItems, packageDetail.orderItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageReferenceId, carrierCode, carrierName, shippingMethod, trackingNumber, shipDate, shipFromSupplySourceId, orderItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDetail {\n");
    
    sb.append("    packageReferenceId: ").append(toIndentedString(packageReferenceId)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    shipFromSupplySourceId: ").append(toIndentedString(shipFromSupplySourceId)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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

