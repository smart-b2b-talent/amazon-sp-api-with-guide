/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.ErrorList;
import com.amazon.spapi.model.services_api_model.UpdateReservationRecord;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema for the &#x60;updateReservation&#x60; operation.
 */
@ApiModel(description = "Response schema for the `updateReservation` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:17.007+08:00")
public class UpdateReservationResponse {
  @SerializedName("payload")
  private UpdateReservationRecord payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public UpdateReservationResponse payload(UpdateReservationRecord payload) {
    this.payload = payload;
    return this;
  }

   /**
   * &#x60;UpdateReservationRecord&#x60; contains only the new &#x60;reservationId&#x60; if the operation was successful. Otherwise it will contain the reservation entity with warnings/errors.
   * @return payload
  **/
  @ApiModelProperty(value = "`UpdateReservationRecord` contains only the new `reservationId` if the operation was successful. Otherwise it will contain the reservation entity with warnings/errors.")
  public UpdateReservationRecord getPayload() {
    return payload;
  }

  public void setPayload(UpdateReservationRecord payload) {
    this.payload = payload;
  }

  public UpdateReservationResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Errors encountered, if any.
   * @return errors
  **/
  @ApiModelProperty(value = "Errors encountered, if any.")
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
    UpdateReservationResponse updateReservationResponse = (UpdateReservationResponse) o;
    return Objects.equals(this.payload, updateReservationResponse.payload) &&
        Objects.equals(this.errors, updateReservationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReservationResponse {\n");
    
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

