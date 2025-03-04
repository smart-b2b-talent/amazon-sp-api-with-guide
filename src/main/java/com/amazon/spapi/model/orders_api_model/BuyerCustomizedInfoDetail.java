/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

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
 * Buyer information for custom orders from the Amazon Custom program.
 */
@ApiModel(description = "Buyer information for custom orders from the Amazon Custom program.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:02.473+08:00")
public class BuyerCustomizedInfoDetail {
  @SerializedName("CustomizedURL")
  private String customizedURL = null;

  public BuyerCustomizedInfoDetail customizedURL(String customizedURL) {
    this.customizedURL = customizedURL;
    return this;
  }

   /**
   * The location of a zip file containing Amazon Custom data.
   * @return customizedURL
  **/
  @ApiModelProperty(value = "The location of a zip file containing Amazon Custom data.")
  public String getCustomizedURL() {
    return customizedURL;
  }

  public void setCustomizedURL(String customizedURL) {
    this.customizedURL = customizedURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerCustomizedInfoDetail buyerCustomizedInfoDetail = (BuyerCustomizedInfoDetail) o;
    return Objects.equals(this.customizedURL, buyerCustomizedInfoDetail.customizedURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizedURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerCustomizedInfoDetail {\n");
    
    sb.append("    customizedURL: ").append(toIndentedString(customizedURL)).append("\n");
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

