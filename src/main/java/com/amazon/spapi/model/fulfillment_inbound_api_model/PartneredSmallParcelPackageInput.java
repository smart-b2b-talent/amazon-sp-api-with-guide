/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.Dimensions;
import com.amazon.spapi.model.fulfillment_inbound_api_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Dimension and weight information for the package.
 */
@ApiModel(description = "Dimension and weight information for the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:51.210+08:00")
public class PartneredSmallParcelPackageInput {
  @SerializedName("Dimensions")
  private Dimensions dimensions = null;

  @SerializedName("Weight")
  private Weight weight = null;

  public PartneredSmallParcelPackageInput dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public PartneredSmallParcelPackageInput weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredSmallParcelPackageInput partneredSmallParcelPackageInput = (PartneredSmallParcelPackageInput) o;
    return Objects.equals(this.dimensions, partneredSmallParcelPackageInput.dimensions) &&
        Objects.equals(this.weight, partneredSmallParcelPackageInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredSmallParcelPackageInput {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

