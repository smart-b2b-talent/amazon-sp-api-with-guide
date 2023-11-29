/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.TransportDetailOutput;
import com.amazon.spapi.model.fulfillment_inbound_api_model.TransportHeader;
import com.amazon.spapi.model.fulfillment_inbound_api_model.TransportResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Inbound shipment information, including carrier details, shipment status, and the workflow status for a request for shipment with an Amazon-partnered carrier.
 */
@ApiModel(description = "Inbound shipment information, including carrier details, shipment status, and the workflow status for a request for shipment with an Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:51.210+08:00")
public class TransportContent {
  @SerializedName("TransportHeader")
  private TransportHeader transportHeader = null;

  @SerializedName("TransportDetails")
  private TransportDetailOutput transportDetails = null;

  @SerializedName("TransportResult")
  private TransportResult transportResult = null;

  public TransportContent transportHeader(TransportHeader transportHeader) {
    this.transportHeader = transportHeader;
    return this;
  }

   /**
   * Get transportHeader
   * @return transportHeader
  **/
  @ApiModelProperty(required = true, value = "")
  public TransportHeader getTransportHeader() {
    return transportHeader;
  }

  public void setTransportHeader(TransportHeader transportHeader) {
    this.transportHeader = transportHeader;
  }

  public TransportContent transportDetails(TransportDetailOutput transportDetails) {
    this.transportDetails = transportDetails;
    return this;
  }

   /**
   * Get transportDetails
   * @return transportDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public TransportDetailOutput getTransportDetails() {
    return transportDetails;
  }

  public void setTransportDetails(TransportDetailOutput transportDetails) {
    this.transportDetails = transportDetails;
  }

  public TransportContent transportResult(TransportResult transportResult) {
    this.transportResult = transportResult;
    return this;
  }

   /**
   * Get transportResult
   * @return transportResult
  **/
  @ApiModelProperty(required = true, value = "")
  public TransportResult getTransportResult() {
    return transportResult;
  }

  public void setTransportResult(TransportResult transportResult) {
    this.transportResult = transportResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportContent transportContent = (TransportContent) o;
    return Objects.equals(this.transportHeader, transportContent.transportHeader) &&
        Objects.equals(this.transportDetails, transportContent.transportDetails) &&
        Objects.equals(this.transportResult, transportContent.transportResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportHeader, transportDetails, transportResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportContent {\n");
    
    sb.append("    transportHeader: ").append(toIndentedString(transportHeader)).append("\n");
    sb.append("    transportDetails: ").append(toIndentedString(transportDetails)).append("\n");
    sb.append("    transportResult: ").append(toIndentedString(transportResult)).append("\n");
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

