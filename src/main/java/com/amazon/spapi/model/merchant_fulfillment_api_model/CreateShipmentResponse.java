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
import com.amazon.spapi.model.merchant_fulfillment_api_model.ErrorList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.Shipment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema.
 */
@ApiModel(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:43.924-04:00")
public class CreateShipmentResponse {
  @SerializedName("payload")
  private Shipment payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CreateShipmentResponse payload(Shipment payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Shipment information.
   * @return payload
  **/
  @ApiModelProperty(value = "Shipment information.")
  public Shipment getPayload() {
    return payload;
  }

  public void setPayload(Shipment payload) {
    this.payload = payload;
  }

  public CreateShipmentResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the createShipment operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the createShipment operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentResponse createShipmentResponse = (CreateShipmentResponse) o;
    return Objects.equals(this.payload, createShipmentResponse.payload) &&
        Objects.equals(this.errors, createShipmentResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

