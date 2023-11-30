/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.aplus_content_api_model;

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
 * A whole number dimension and its unit of measurement. For example, this can represent 100 pixels.
 */
@ApiModel(description = "A whole number dimension and its unit of measurement. For example, this can represent 100 pixels.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:51:51.898+08:00")
public class IntegerWithUnits {
  @SerializedName("value")
  private Integer value = null;

  @SerializedName("units")
  private String units = null;

  public IntegerWithUnits value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The dimension value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The dimension value.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public IntegerWithUnits units(String units) {
    this.units = units;
    return this;
  }

   /**
   * The unit of measurement.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "The unit of measurement.")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegerWithUnits integerWithUnits = (IntegerWithUnits) o;
    return Objects.equals(this.value, integerWithUnits.value) &&
        Objects.equals(this.units, integerWithUnits.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerWithUnits {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

