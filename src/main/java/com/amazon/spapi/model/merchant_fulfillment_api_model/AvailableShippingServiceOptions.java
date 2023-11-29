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
import com.amazon.spapi.model.merchant_fulfillment_api_model.AvailableCarrierWillPickUpOptionsList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.AvailableDeliveryExperienceOptionsList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The available shipping service options.
 */
@ApiModel(description = "The available shipping service options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:57.882+08:00")
public class AvailableShippingServiceOptions {
  @SerializedName("AvailableCarrierWillPickUpOptions")
  private AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions = null;

  @SerializedName("AvailableDeliveryExperienceOptions")
  private AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions = null;

  public AvailableShippingServiceOptions availableCarrierWillPickUpOptions(AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions) {
    this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
    return this;
  }

   /**
   * Get availableCarrierWillPickUpOptions
   * @return availableCarrierWillPickUpOptions
  **/
  @ApiModelProperty(required = true, value = "")
  public AvailableCarrierWillPickUpOptionsList getAvailableCarrierWillPickUpOptions() {
    return availableCarrierWillPickUpOptions;
  }

  public void setAvailableCarrierWillPickUpOptions(AvailableCarrierWillPickUpOptionsList availableCarrierWillPickUpOptions) {
    this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
  }

  public AvailableShippingServiceOptions availableDeliveryExperienceOptions(AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions) {
    this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
    return this;
  }

   /**
   * Get availableDeliveryExperienceOptions
   * @return availableDeliveryExperienceOptions
  **/
  @ApiModelProperty(required = true, value = "")
  public AvailableDeliveryExperienceOptionsList getAvailableDeliveryExperienceOptions() {
    return availableDeliveryExperienceOptions;
  }

  public void setAvailableDeliveryExperienceOptions(AvailableDeliveryExperienceOptionsList availableDeliveryExperienceOptions) {
    this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableShippingServiceOptions availableShippingServiceOptions = (AvailableShippingServiceOptions) o;
    return Objects.equals(this.availableCarrierWillPickUpOptions, availableShippingServiceOptions.availableCarrierWillPickUpOptions) &&
        Objects.equals(this.availableDeliveryExperienceOptions, availableShippingServiceOptions.availableDeliveryExperienceOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCarrierWillPickUpOptions, availableDeliveryExperienceOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableShippingServiceOptions {\n");
    
    sb.append("    availableCarrierWillPickUpOptions: ").append(toIndentedString(availableCarrierWillPickUpOptions)).append("\n");
    sb.append("    availableDeliveryExperienceOptions: ").append(toIndentedString(availableDeliveryExperienceOptions)).append("\n");
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

