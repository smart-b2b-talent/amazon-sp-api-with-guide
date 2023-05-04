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
import com.amazon.spapi.model.services_api_model.AppointmentResources;
import com.amazon.spapi.model.services_api_model.FulfillmentDocuments;
import com.amazon.spapi.model.services_api_model.FulfillmentTime;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input for set appointment fulfillment data operation.
 */
@ApiModel(description = "Input for set appointment fulfillment data operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:46.175-04:00")
public class SetAppointmentFulfillmentDataRequest {
  @SerializedName("fulfillmentTime")
  private FulfillmentTime fulfillmentTime = null;

  @SerializedName("appointmentResources")
  private AppointmentResources appointmentResources = null;

  @SerializedName("fulfillmentDocuments")
  private FulfillmentDocuments fulfillmentDocuments = null;

  public SetAppointmentFulfillmentDataRequest fulfillmentTime(FulfillmentTime fulfillmentTime) {
    this.fulfillmentTime = fulfillmentTime;
    return this;
  }

   /**
   * Input appointment time details.
   * @return fulfillmentTime
  **/
  @ApiModelProperty(value = "Input appointment time details.")
  public FulfillmentTime getFulfillmentTime() {
    return fulfillmentTime;
  }

  public void setFulfillmentTime(FulfillmentTime fulfillmentTime) {
    this.fulfillmentTime = fulfillmentTime;
  }

  public SetAppointmentFulfillmentDataRequest appointmentResources(AppointmentResources appointmentResources) {
    this.appointmentResources = appointmentResources;
    return this;
  }

   /**
   * Resources involved in appointment fulfillment.
   * @return appointmentResources
  **/
  @ApiModelProperty(value = "Resources involved in appointment fulfillment.")
  public AppointmentResources getAppointmentResources() {
    return appointmentResources;
  }

  public void setAppointmentResources(AppointmentResources appointmentResources) {
    this.appointmentResources = appointmentResources;
  }

  public SetAppointmentFulfillmentDataRequest fulfillmentDocuments(FulfillmentDocuments fulfillmentDocuments) {
    this.fulfillmentDocuments = fulfillmentDocuments;
    return this;
  }

   /**
   * Documents specific to appointment fulfillment.
   * @return fulfillmentDocuments
  **/
  @ApiModelProperty(value = "Documents specific to appointment fulfillment.")
  public FulfillmentDocuments getFulfillmentDocuments() {
    return fulfillmentDocuments;
  }

  public void setFulfillmentDocuments(FulfillmentDocuments fulfillmentDocuments) {
    this.fulfillmentDocuments = fulfillmentDocuments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAppointmentFulfillmentDataRequest setAppointmentFulfillmentDataRequest = (SetAppointmentFulfillmentDataRequest) o;
    return Objects.equals(this.fulfillmentTime, setAppointmentFulfillmentDataRequest.fulfillmentTime) &&
        Objects.equals(this.appointmentResources, setAppointmentFulfillmentDataRequest.appointmentResources) &&
        Objects.equals(this.fulfillmentDocuments, setAppointmentFulfillmentDataRequest.fulfillmentDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentTime, appointmentResources, fulfillmentDocuments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAppointmentFulfillmentDataRequest {\n");
    
    sb.append("    fulfillmentTime: ").append(toIndentedString(fulfillmentTime)).append("\n");
    sb.append("    appointmentResources: ").append(toIndentedString(appointmentResources)).append("\n");
    sb.append("    fulfillmentDocuments: ").append(toIndentedString(fulfillmentDocuments)).append("\n");
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

