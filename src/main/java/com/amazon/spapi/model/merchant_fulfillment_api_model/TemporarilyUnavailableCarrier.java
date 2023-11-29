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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A carrier who is temporarily unavailable, most likely due to a service outage experienced by the carrier.
 */
@ApiModel(description = "A carrier who is temporarily unavailable, most likely due to a service outage experienced by the carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:57.882+08:00")
public class TemporarilyUnavailableCarrier {
  @SerializedName("CarrierName")
  private String carrierName = null;

  public TemporarilyUnavailableCarrier carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the carrier.
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The name of the carrier.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporarilyUnavailableCarrier temporarilyUnavailableCarrier = (TemporarilyUnavailableCarrier) o;
    return Objects.equals(this.carrierName, temporarilyUnavailableCarrier.carrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporarilyUnavailableCarrier {\n");
    
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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

