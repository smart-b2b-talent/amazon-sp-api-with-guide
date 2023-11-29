/*
 * Selling Partner API for Supply Sources
 * Manage configurations and capabilities of seller supply sources.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.supply_sources_api_model;

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
 * The operating hour schema
 */
@ApiModel(description = "The operating hour schema")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:50.997+08:00")
public class OperatingHour {
  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  public OperatingHour startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The opening time, ISO 8601 formatted timestamp without date, HH:mm.
   * @return startTime
  **/
  @ApiModelProperty(value = "The opening time, ISO 8601 formatted timestamp without date, HH:mm.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public OperatingHour endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The closing time, ISO 8601 formatted timestamp without date, HH:mm.
   * @return endTime
  **/
  @ApiModelProperty(value = "The closing time, ISO 8601 formatted timestamp without date, HH:mm.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
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
    OperatingHour operatingHour = (OperatingHour) o;
    return Objects.equals(this.startTime, operatingHour.startTime) &&
        Objects.equals(this.endTime, operatingHour.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingHour {\n");
    
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

