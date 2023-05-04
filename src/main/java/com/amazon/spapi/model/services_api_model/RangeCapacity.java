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
import com.amazon.spapi.model.services_api_model.RangeSlot;
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

/**
 * Range capacity entity where each entry has a capacity type and corresponding slots.
 */
@ApiModel(description = "Range capacity entity where each entry has a capacity type and corresponding slots.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:46.175-04:00")
public class RangeCapacity {
  @SerializedName("capacityType")
  private CapacityType capacityType = null;

  @SerializedName("slots")
  private List<RangeSlot> slots = null;

  public RangeCapacity capacityType(CapacityType capacityType) {
    this.capacityType = capacityType;
    return this;
  }

   /**
   * Capacity type corresponding to the slots.
   * @return capacityType
  **/
  @ApiModelProperty(value = "Capacity type corresponding to the slots.")
  public CapacityType getCapacityType() {
    return capacityType;
  }

  public void setCapacityType(CapacityType capacityType) {
    this.capacityType = capacityType;
  }

  public RangeCapacity slots(List<RangeSlot> slots) {
    this.slots = slots;
    return this;
  }

  public RangeCapacity addSlotsItem(RangeSlot slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<RangeSlot>();
    }
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Array of capacity slots in range slot format.
   * @return slots
  **/
  @ApiModelProperty(value = "Array of capacity slots in range slot format.")
  public List<RangeSlot> getSlots() {
    return slots;
  }

  public void setSlots(List<RangeSlot> slots) {
    this.slots = slots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeCapacity rangeCapacity = (RangeCapacity) o;
    return Objects.equals(this.capacityType, rangeCapacity.capacityType) &&
        Objects.equals(this.slots, rangeCapacity.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityType, slots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeCapacity {\n");
    
    sb.append("    capacityType: ").append(toIndentedString(capacityType)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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

