/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_outbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_outbound_api_model.CreateFulfillmentReturnResult;
import com.amazon.spapi.model.fulfillment_outbound_api_model.ErrorList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the createFulfillmentReturn operation.
 */
@ApiModel(description = "The response schema for the createFulfillmentReturn operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:35.643-04:00")
public class CreateFulfillmentReturnResponse {
  @SerializedName("payload")
  private CreateFulfillmentReturnResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CreateFulfillmentReturnResponse payload(CreateFulfillmentReturnResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the createFulfillmentReturn operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the createFulfillmentReturn operation.")
  public CreateFulfillmentReturnResult getPayload() {
    return payload;
  }

  public void setPayload(CreateFulfillmentReturnResult payload) {
    this.payload = payload;
  }

  public CreateFulfillmentReturnResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the createFulfillmentReturn operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the createFulfillmentReturn operation.")
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
    CreateFulfillmentReturnResponse createFulfillmentReturnResponse = (CreateFulfillmentReturnResponse) o;
    return Objects.equals(this.payload, createFulfillmentReturnResponse.payload) &&
        Objects.equals(this.errors, createFulfillmentReturnResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFulfillmentReturnResponse {\n");
    
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

