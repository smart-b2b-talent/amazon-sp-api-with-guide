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
 * The input appointment time details.
 */
@ApiModel(description = "The input appointment time details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:46.175-04:00")
public class AppointmentTimeInput {
  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("durationInMinutes")
  private Integer durationInMinutes = null;

  public AppointmentTimeInput startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The date, time in UTC for the start time of an appointment in ISO 8601 format.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "The date, time in UTC for the start time of an appointment in ISO 8601 format.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public AppointmentTimeInput durationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
    return this;
  }

   /**
   * The duration of an appointment in minutes.
   * @return durationInMinutes
  **/
  @ApiModelProperty(value = "The duration of an appointment in minutes.")
  public Integer getDurationInMinutes() {
    return durationInMinutes;
  }

  public void setDurationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentTimeInput appointmentTimeInput = (AppointmentTimeInput) o;
    return Objects.equals(this.startTime, appointmentTimeInput.startTime) &&
        Objects.equals(this.durationInMinutes, appointmentTimeInput.durationInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, durationInMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentTimeInput {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
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

