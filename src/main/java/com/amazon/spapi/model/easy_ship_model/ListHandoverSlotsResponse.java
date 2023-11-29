/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.easy_ship_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.easy_ship_model.TimeSlots;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the &#x60;listHandoverSlots&#x60; operation.
 */
@ApiModel(description = "The response schema for the `listHandoverSlots` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:10:49.741+08:00")
public class ListHandoverSlotsResponse {
  @SerializedName("amazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("timeSlots")
  private TimeSlots timeSlots = null;

  public ListHandoverSlotsResponse amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * Get amazonOrderId
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public ListHandoverSlotsResponse timeSlots(TimeSlots timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }

   /**
   * Get timeSlots
   * @return timeSlots
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeSlots getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(TimeSlots timeSlots) {
    this.timeSlots = timeSlots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHandoverSlotsResponse listHandoverSlotsResponse = (ListHandoverSlotsResponse) o;
    return Objects.equals(this.amazonOrderId, listHandoverSlotsResponse.amazonOrderId) &&
        Objects.equals(this.timeSlots, listHandoverSlotsResponse.timeSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, timeSlots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHandoverSlotsResponse {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
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

