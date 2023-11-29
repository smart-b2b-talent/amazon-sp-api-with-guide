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
 * Promised delivery information for the item.
 */
@ApiModel(description = "Promised delivery information for the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:40.519+08:00")
public class ItemDeliveryPromise {
  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  public ItemDeliveryPromise startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time of the start of the promised delivery window in ISO 8601 format.
   * @return startTime
  **/
  @ApiModelProperty(value = "The date and time of the start of the promised delivery window in ISO 8601 format.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ItemDeliveryPromise endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The date and time of the end of the promised delivery window in ISO 8601 format.
   * @return endTime
  **/
  @ApiModelProperty(value = "The date and time of the end of the promised delivery window in ISO 8601 format.")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDeliveryPromise itemDeliveryPromise = (ItemDeliveryPromise) o;
    return Objects.equals(this.startTime, itemDeliveryPromise.startTime) &&
        Objects.equals(this.endTime, itemDeliveryPromise.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDeliveryPromise {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

