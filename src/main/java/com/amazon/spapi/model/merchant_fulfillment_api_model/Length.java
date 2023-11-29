/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchant_fulfillment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.merchant_fulfillment_api_model.UnitOfLength;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The length.
 */
@ApiModel(description = "The length.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:20.124+08:00")
public class Length {
  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("unit")
  private UnitOfLength unit = null;

  public Length value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value in units.
   * @return value
  **/
  @ApiModelProperty(value = "The value in units.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Length unit(UnitOfLength unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public UnitOfLength getUnit() {
    return unit;
  }

  public void setUnit(UnitOfLength unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Length length = (Length) o;
    return Objects.equals(this.value, length.value) &&
        Objects.equals(this.unit, length.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Length {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

