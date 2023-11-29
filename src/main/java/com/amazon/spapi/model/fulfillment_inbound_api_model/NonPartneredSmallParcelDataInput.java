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
import com.amazon.spapi.model.fulfillment_inbound_api_model.NonPartneredSmallParcelPackageInputList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information that you provide to Amazon about a Small Parcel shipment shipped by a carrier that has not partnered with Amazon.
 */
@ApiModel(description = "Information that you provide to Amazon about a Small Parcel shipment shipped by a carrier that has not partnered with Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:12.118+08:00")
public class NonPartneredSmallParcelDataInput {
  @SerializedName("CarrierName")
  private String carrierName = null;

  @SerializedName("PackageList")
  private NonPartneredSmallParcelPackageInputList packageList = null;

  public NonPartneredSmallParcelDataInput carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The carrier that you are using for the inbound shipment.
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The carrier that you are using for the inbound shipment.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public NonPartneredSmallParcelDataInput packageList(NonPartneredSmallParcelPackageInputList packageList) {
    this.packageList = packageList;
    return this;
  }

   /**
   * Get packageList
   * @return packageList
  **/
  @ApiModelProperty(required = true, value = "")
  public NonPartneredSmallParcelPackageInputList getPackageList() {
    return packageList;
  }

  public void setPackageList(NonPartneredSmallParcelPackageInputList packageList) {
    this.packageList = packageList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonPartneredSmallParcelDataInput nonPartneredSmallParcelDataInput = (NonPartneredSmallParcelDataInput) o;
    return Objects.equals(this.carrierName, nonPartneredSmallParcelDataInput.carrierName) &&
        Objects.equals(this.packageList, nonPartneredSmallParcelDataInput.packageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, packageList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonPartneredSmallParcelDataInput {\n");
    
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
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

