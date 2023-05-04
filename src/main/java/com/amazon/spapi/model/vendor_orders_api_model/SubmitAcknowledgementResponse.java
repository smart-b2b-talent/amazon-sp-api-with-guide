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
import com.amazon.spapi.model.vendor_orders_api_model.ErrorList;
import com.amazon.spapi.model.vendor_orders_api_model.TransactionId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the submitAcknowledgement operation
 */
@ApiModel(description = "The response schema for the submitAcknowledgement operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:36.873-04:00")
public class SubmitAcknowledgementResponse {
  @SerializedName("payload")
  private TransactionId payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public SubmitAcknowledgementResponse payload(TransactionId payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the submitAcknowledgement operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the submitAcknowledgement operation.")
  public TransactionId getPayload() {
    return payload;
  }

  public void setPayload(TransactionId payload) {
    this.payload = payload;
  }

  public SubmitAcknowledgementResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
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
    SubmitAcknowledgementResponse submitAcknowledgementResponse = (SubmitAcknowledgementResponse) o;
    return Objects.equals(this.payload, submitAcknowledgementResponse.payload) &&
        Objects.equals(this.errors, submitAcknowledgementResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitAcknowledgementResponse {\n");
    
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

