/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchant_fulfillment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.merchant_fulfillment_api_model.AdditionalSellerInputsList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.HazmatType;
import com.amazon.spapi.model.merchant_fulfillment_api_model.LabelFormatOptionRequest;
import com.amazon.spapi.model.merchant_fulfillment_api_model.ShipmentRequestDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request schema.
 */
@ApiModel(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:57.882+08:00")
public class CreateShipmentRequest {
  @SerializedName("ShipmentRequestDetails")
  private ShipmentRequestDetails shipmentRequestDetails = null;

  @SerializedName("ShippingServiceId")
  private String shippingServiceId = null;

  @SerializedName("ShippingServiceOfferId")
  private String shippingServiceOfferId = null;

  @SerializedName("HazmatType")
  private HazmatType hazmatType = null;

  @SerializedName("LabelFormatOption")
  private LabelFormatOptionRequest labelFormatOption = null;

  @SerializedName("ShipmentLevelSellerInputsList")
  private AdditionalSellerInputsList shipmentLevelSellerInputsList = null;

  public CreateShipmentRequest shipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
    this.shipmentRequestDetails = shipmentRequestDetails;
    return this;
  }

   /**
   * Shipment information required for creating a shipment.
   * @return shipmentRequestDetails
  **/
  @ApiModelProperty(required = true, value = "Shipment information required for creating a shipment.")
  public ShipmentRequestDetails getShipmentRequestDetails() {
    return shipmentRequestDetails;
  }

  public void setShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
    this.shipmentRequestDetails = shipmentRequestDetails;
  }

  public CreateShipmentRequest shippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
    return this;
  }

   /**
   * Get shippingServiceId
   * @return shippingServiceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShippingServiceId() {
    return shippingServiceId;
  }

  public void setShippingServiceId(String shippingServiceId) {
    this.shippingServiceId = shippingServiceId;
  }

  public CreateShipmentRequest shippingServiceOfferId(String shippingServiceOfferId) {
    this.shippingServiceOfferId = shippingServiceOfferId;
    return this;
  }

   /**
   * Identifies a shipping service order made by a carrier.
   * @return shippingServiceOfferId
  **/
  @ApiModelProperty(value = "Identifies a shipping service order made by a carrier.")
  public String getShippingServiceOfferId() {
    return shippingServiceOfferId;
  }

  public void setShippingServiceOfferId(String shippingServiceOfferId) {
    this.shippingServiceOfferId = shippingServiceOfferId;
  }

  public CreateShipmentRequest hazmatType(HazmatType hazmatType) {
    this.hazmatType = hazmatType;
    return this;
  }

   /**
   * Hazardous materials options for a package. Consult the terms and conditions for each carrier for more information about hazardous materials.
   * @return hazmatType
  **/
  @ApiModelProperty(value = "Hazardous materials options for a package. Consult the terms and conditions for each carrier for more information about hazardous materials.")
  public HazmatType getHazmatType() {
    return hazmatType;
  }

  public void setHazmatType(HazmatType hazmatType) {
    this.hazmatType = hazmatType;
  }

  public CreateShipmentRequest labelFormatOption(LabelFormatOptionRequest labelFormatOption) {
    this.labelFormatOption = labelFormatOption;
    return this;
  }

   /**
   * Get labelFormatOption
   * @return labelFormatOption
  **/
  @ApiModelProperty(value = "")
  public LabelFormatOptionRequest getLabelFormatOption() {
    return labelFormatOption;
  }

  public void setLabelFormatOption(LabelFormatOptionRequest labelFormatOption) {
    this.labelFormatOption = labelFormatOption;
  }

  public CreateShipmentRequest shipmentLevelSellerInputsList(AdditionalSellerInputsList shipmentLevelSellerInputsList) {
    this.shipmentLevelSellerInputsList = shipmentLevelSellerInputsList;
    return this;
  }

   /**
   * A list of additional seller inputs required to ship this shipment.
   * @return shipmentLevelSellerInputsList
  **/
  @ApiModelProperty(value = "A list of additional seller inputs required to ship this shipment.")
  public AdditionalSellerInputsList getShipmentLevelSellerInputsList() {
    return shipmentLevelSellerInputsList;
  }

  public void setShipmentLevelSellerInputsList(AdditionalSellerInputsList shipmentLevelSellerInputsList) {
    this.shipmentLevelSellerInputsList = shipmentLevelSellerInputsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentRequest createShipmentRequest = (CreateShipmentRequest) o;
    return Objects.equals(this.shipmentRequestDetails, createShipmentRequest.shipmentRequestDetails) &&
        Objects.equals(this.shippingServiceId, createShipmentRequest.shippingServiceId) &&
        Objects.equals(this.shippingServiceOfferId, createShipmentRequest.shippingServiceOfferId) &&
        Objects.equals(this.hazmatType, createShipmentRequest.hazmatType) &&
        Objects.equals(this.labelFormatOption, createShipmentRequest.labelFormatOption) &&
        Objects.equals(this.shipmentLevelSellerInputsList, createShipmentRequest.shipmentLevelSellerInputsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentRequestDetails, shippingServiceId, shippingServiceOfferId, hazmatType, labelFormatOption, shipmentLevelSellerInputsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentRequest {\n");
    
    sb.append("    shipmentRequestDetails: ").append(toIndentedString(shipmentRequestDetails)).append("\n");
    sb.append("    shippingServiceId: ").append(toIndentedString(shippingServiceId)).append("\n");
    sb.append("    shippingServiceOfferId: ").append(toIndentedString(shippingServiceOfferId)).append("\n");
    sb.append("    hazmatType: ").append(toIndentedString(hazmatType)).append("\n");
    sb.append("    labelFormatOption: ").append(toIndentedString(labelFormatOption)).append("\n");
    sb.append("    shipmentLevelSellerInputsList: ").append(toIndentedString(shipmentLevelSellerInputsList)).append("\n");
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

