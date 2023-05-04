/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.   **Note:** If you are new to the Amazon Shipping API, refer to the latest version of <a href=\"https://developer-docs.amazon.com/amazon-shipping/docs/shipping-api-v2-reference\">Amazon Shipping API (v2)</a> on the <a href=\"https://developer-docs.amazon.com/amazon-shipping/\">Amazon Shipping Developer Documentation</a> site.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.shipping_api_model.RateList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The payload schema for the createShipment operation.
 */
@ApiModel(description = "The payload schema for the createShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:53.947-04:00")
public class CreateShipmentResult {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("eligibleRates")
  private RateList eligibleRates = null;

  public CreateShipmentResult shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public CreateShipmentResult eligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
    return this;
  }

   /**
   * Get eligibleRates
   * @return eligibleRates
  **/
  @ApiModelProperty(required = true, value = "")
  public RateList getEligibleRates() {
    return eligibleRates;
  }

  public void setEligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentResult createShipmentResult = (CreateShipmentResult) o;
    return Objects.equals(this.shipmentId, createShipmentResult.shipmentId) &&
        Objects.equals(this.eligibleRates, createShipmentResult.eligibleRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, eligibleRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentResult {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    eligibleRates: ").append(toIndentedString(eligibleRates)).append("\n");
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

