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
import com.amazon.spapi.model.services_api_model.CapacityType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Request schema for the &#x60;getRangeSlotCapacity&#x60; operation. This schema is used to define the time range and capacity types that are being queried.
 */
@ApiModel(description = "Request schema for the `getRangeSlotCapacity` operation. This schema is used to define the time range and capacity types that are being queried.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:17.007+08:00")
public class RangeSlotCapacityQuery {
  @SerializedName("capacityTypes")
  private List<CapacityType> capacityTypes = null;

  @SerializedName("startDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("endDateTime")
  private OffsetDateTime endDateTime = null;

  public RangeSlotCapacityQuery capacityTypes(List<CapacityType> capacityTypes) {
    this.capacityTypes = capacityTypes;
    return this;
  }

  public RangeSlotCapacityQuery addCapacityTypesItem(CapacityType capacityTypesItem) {
    if (this.capacityTypes == null) {
      this.capacityTypes = new ArrayList<CapacityType>();
    }
    this.capacityTypes.add(capacityTypesItem);
    return this;
  }

   /**
   * An array of capacity types which are being requested. Default value is &#x60;[SCHEDULED_CAPACITY]&#x60;.
   * @return capacityTypes
  **/
  @ApiModelProperty(value = "An array of capacity types which are being requested. Default value is `[SCHEDULED_CAPACITY]`.")
  public List<CapacityType> getCapacityTypes() {
    return capacityTypes;
  }

  public void setCapacityTypes(List<CapacityType> capacityTypes) {
    this.capacityTypes = capacityTypes;
  }

  public RangeSlotCapacityQuery startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Start date time from which the capacity slots are being requested in ISO 8601 format.
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "Start date time from which the capacity slots are being requested in ISO 8601 format.")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public RangeSlotCapacityQuery endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * End date time up to which the capacity slots are being requested in ISO 8601 format.
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "End date time up to which the capacity slots are being requested in ISO 8601 format.")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeSlotCapacityQuery rangeSlotCapacityQuery = (RangeSlotCapacityQuery) o;
    return Objects.equals(this.capacityTypes, rangeSlotCapacityQuery.capacityTypes) &&
        Objects.equals(this.startDateTime, rangeSlotCapacityQuery.startDateTime) &&
        Objects.equals(this.endDateTime, rangeSlotCapacityQuery.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityTypes, startDateTime, endDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeSlotCapacityQuery {\n");
    
    sb.append("    capacityTypes: ").append(toIndentedString(capacityTypes)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

