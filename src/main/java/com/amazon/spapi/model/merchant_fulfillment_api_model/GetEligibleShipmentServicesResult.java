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
import com.amazon.spapi.model.merchant_fulfillment_api_model.RejectedShippingServiceList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.ShippingServiceList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.TemporarilyUnavailableCarrierList;
import com.amazon.spapi.model.merchant_fulfillment_api_model.TermsAndConditionsNotAcceptedCarrierList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The payload for the getEligibleShipmentServices operation.
 */
@ApiModel(description = "The payload for the getEligibleShipmentServices operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:33.036+08:00")
public class GetEligibleShipmentServicesResult {
  @SerializedName("ShippingServiceList")
  private ShippingServiceList shippingServiceList = null;

  @SerializedName("RejectedShippingServiceList")
  private RejectedShippingServiceList rejectedShippingServiceList = null;

  @SerializedName("TemporarilyUnavailableCarrierList")
  private TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList = null;

  @SerializedName("TermsAndConditionsNotAcceptedCarrierList")
  private TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList = null;

  public GetEligibleShipmentServicesResult shippingServiceList(ShippingServiceList shippingServiceList) {
    this.shippingServiceList = shippingServiceList;
    return this;
  }

   /**
   * A list of shipping services offers.
   * @return shippingServiceList
  **/
  @ApiModelProperty(required = true, value = "A list of shipping services offers.")
  public ShippingServiceList getShippingServiceList() {
    return shippingServiceList;
  }

  public void setShippingServiceList(ShippingServiceList shippingServiceList) {
    this.shippingServiceList = shippingServiceList;
  }

  public GetEligibleShipmentServicesResult rejectedShippingServiceList(RejectedShippingServiceList rejectedShippingServiceList) {
    this.rejectedShippingServiceList = rejectedShippingServiceList;
    return this;
  }

   /**
   * Get rejectedShippingServiceList
   * @return rejectedShippingServiceList
  **/
  @ApiModelProperty(value = "")
  public RejectedShippingServiceList getRejectedShippingServiceList() {
    return rejectedShippingServiceList;
  }

  public void setRejectedShippingServiceList(RejectedShippingServiceList rejectedShippingServiceList) {
    this.rejectedShippingServiceList = rejectedShippingServiceList;
  }

  public GetEligibleShipmentServicesResult temporarilyUnavailableCarrierList(TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList) {
    this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
    return this;
  }

   /**
   * Get temporarilyUnavailableCarrierList
   * @return temporarilyUnavailableCarrierList
  **/
  @ApiModelProperty(value = "")
  public TemporarilyUnavailableCarrierList getTemporarilyUnavailableCarrierList() {
    return temporarilyUnavailableCarrierList;
  }

  public void setTemporarilyUnavailableCarrierList(TemporarilyUnavailableCarrierList temporarilyUnavailableCarrierList) {
    this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
  }

  public GetEligibleShipmentServicesResult termsAndConditionsNotAcceptedCarrierList(TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList) {
    this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
    return this;
  }

   /**
   * Get termsAndConditionsNotAcceptedCarrierList
   * @return termsAndConditionsNotAcceptedCarrierList
  **/
  @ApiModelProperty(value = "")
  public TermsAndConditionsNotAcceptedCarrierList getTermsAndConditionsNotAcceptedCarrierList() {
    return termsAndConditionsNotAcceptedCarrierList;
  }

  public void setTermsAndConditionsNotAcceptedCarrierList(TermsAndConditionsNotAcceptedCarrierList termsAndConditionsNotAcceptedCarrierList) {
    this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEligibleShipmentServicesResult getEligibleShipmentServicesResult = (GetEligibleShipmentServicesResult) o;
    return Objects.equals(this.shippingServiceList, getEligibleShipmentServicesResult.shippingServiceList) &&
        Objects.equals(this.rejectedShippingServiceList, getEligibleShipmentServicesResult.rejectedShippingServiceList) &&
        Objects.equals(this.temporarilyUnavailableCarrierList, getEligibleShipmentServicesResult.temporarilyUnavailableCarrierList) &&
        Objects.equals(this.termsAndConditionsNotAcceptedCarrierList, getEligibleShipmentServicesResult.termsAndConditionsNotAcceptedCarrierList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingServiceList, rejectedShippingServiceList, temporarilyUnavailableCarrierList, termsAndConditionsNotAcceptedCarrierList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEligibleShipmentServicesResult {\n");
    
    sb.append("    shippingServiceList: ").append(toIndentedString(shippingServiceList)).append("\n");
    sb.append("    rejectedShippingServiceList: ").append(toIndentedString(rejectedShippingServiceList)).append("\n");
    sb.append("    temporarilyUnavailableCarrierList: ").append(toIndentedString(temporarilyUnavailableCarrierList)).append("\n");
    sb.append("    termsAndConditionsNotAcceptedCarrierList: ").append(toIndentedString(termsAndConditionsNotAcceptedCarrierList)).append("\n");
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

