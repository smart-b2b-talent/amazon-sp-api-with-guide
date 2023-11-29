/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_fees_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.product_fees_api_model.MoneyType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Points
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:04.348+08:00")
public class Points {
  @SerializedName("PointsNumber")
  private Integer pointsNumber = null;

  @SerializedName("PointsMonetaryValue")
  private MoneyType pointsMonetaryValue = null;

  public Points pointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
    return this;
  }

   /**
   * Get pointsNumber
   * @return pointsNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPointsNumber() {
    return pointsNumber;
  }

  public void setPointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
  }

  public Points pointsMonetaryValue(MoneyType pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
    return this;
  }

   /**
   * Get pointsMonetaryValue
   * @return pointsMonetaryValue
  **/
  @ApiModelProperty(value = "")
  public MoneyType getPointsMonetaryValue() {
    return pointsMonetaryValue;
  }

  public void setPointsMonetaryValue(MoneyType pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Points points = (Points) o;
    return Objects.equals(this.pointsNumber, points.pointsNumber) &&
        Objects.equals(this.pointsMonetaryValue, points.pointsMonetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsNumber, pointsMonetaryValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Points {\n");
    
    sb.append("    pointsNumber: ").append(toIndentedString(pointsNumber)).append("\n");
    sb.append("    pointsMonetaryValue: ").append(toIndentedString(pointsMonetaryValue)).append("\n");
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

