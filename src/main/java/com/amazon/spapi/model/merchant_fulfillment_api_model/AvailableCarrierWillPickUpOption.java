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
import com.amazon.spapi.model.merchant_fulfillment_api_model.CarrierWillPickUpOption;
import com.amazon.spapi.model.merchant_fulfillment_api_model.CurrencyAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Indicates whether the carrier will pick up the package, and what fee is charged, if any.
 */
@ApiModel(description = "Indicates whether the carrier will pick up the package, and what fee is charged, if any.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:57.882+08:00")
public class AvailableCarrierWillPickUpOption {
  @SerializedName("CarrierWillPickUpOption")
  private CarrierWillPickUpOption carrierWillPickUpOption = null;

  @SerializedName("Charge")
  private CurrencyAmount charge = null;

  public AvailableCarrierWillPickUpOption carrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
    this.carrierWillPickUpOption = carrierWillPickUpOption;
    return this;
  }

   /**
   * Get carrierWillPickUpOption
   * @return carrierWillPickUpOption
  **/
  @ApiModelProperty(required = true, value = "")
  public CarrierWillPickUpOption getCarrierWillPickUpOption() {
    return carrierWillPickUpOption;
  }

  public void setCarrierWillPickUpOption(CarrierWillPickUpOption carrierWillPickUpOption) {
    this.carrierWillPickUpOption = carrierWillPickUpOption;
  }

  public AvailableCarrierWillPickUpOption charge(CurrencyAmount charge) {
    this.charge = charge;
    return this;
  }

   /**
   * The fee charged.
   * @return charge
  **/
  @ApiModelProperty(required = true, value = "The fee charged.")
  public CurrencyAmount getCharge() {
    return charge;
  }

  public void setCharge(CurrencyAmount charge) {
    this.charge = charge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCarrierWillPickUpOption availableCarrierWillPickUpOption = (AvailableCarrierWillPickUpOption) o;
    return Objects.equals(this.carrierWillPickUpOption, availableCarrierWillPickUpOption.carrierWillPickUpOption) &&
        Objects.equals(this.charge, availableCarrierWillPickUpOption.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierWillPickUpOption, charge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCarrierWillPickUpOption {\n");
    
    sb.append("    carrierWillPickUpOption: ").append(toIndentedString(carrierWillPickUpOption)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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

