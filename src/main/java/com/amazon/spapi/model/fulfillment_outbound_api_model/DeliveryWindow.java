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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The time range within which a Scheduled Delivery fulfillment order should be delivered. This is only available in the JP marketplace.
 */
@ApiModel(description = "The time range within which a Scheduled Delivery fulfillment order should be delivered. This is only available in the JP marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:53.196+08:00")
public class DeliveryWindow {
  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  public DeliveryWindow startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date and time of the start of the Scheduled Delivery window, in ISO 8601 date time format.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the start of the Scheduled Delivery window, in ISO 8601 date time format.")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public DeliveryWindow endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date and time of the end of the Scheduled Delivery window, in ISO 8601 date time format.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "The date and time of the end of the Scheduled Delivery window, in ISO 8601 date time format.")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryWindow deliveryWindow = (DeliveryWindow) o;
    return Objects.equals(this.startDate, deliveryWindow.startDate) &&
        Objects.equals(this.endDate, deliveryWindow.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryWindow {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

