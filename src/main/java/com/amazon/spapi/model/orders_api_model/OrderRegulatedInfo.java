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
import com.amazon.spapi.model.orders_api_model.RegulatedInformation;
import com.amazon.spapi.model.orders_api_model.RegulatedOrderVerificationStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The order&#39;s regulated information along with its verification status.
 */
@ApiModel(description = "The order's regulated information along with its verification status.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:25.479+08:00")
public class OrderRegulatedInfo {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("RegulatedInformation")
  private RegulatedInformation regulatedInformation = null;

  @SerializedName("RequiresDosageLabel")
  private Boolean requiresDosageLabel = null;

  @SerializedName("RegulatedOrderVerificationStatus")
  private RegulatedOrderVerificationStatus regulatedOrderVerificationStatus = null;

  public OrderRegulatedInfo amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order identifier, in 3-7-7 format.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public OrderRegulatedInfo regulatedInformation(RegulatedInformation regulatedInformation) {
    this.regulatedInformation = regulatedInformation;
    return this;
  }

   /**
   * The regulated information collected during purchase and used to verify the order.
   * @return regulatedInformation
  **/
  @ApiModelProperty(required = true, value = "The regulated information collected during purchase and used to verify the order.")
  public RegulatedInformation getRegulatedInformation() {
    return regulatedInformation;
  }

  public void setRegulatedInformation(RegulatedInformation regulatedInformation) {
    this.regulatedInformation = regulatedInformation;
  }

  public OrderRegulatedInfo requiresDosageLabel(Boolean requiresDosageLabel) {
    this.requiresDosageLabel = requiresDosageLabel;
    return this;
  }

   /**
   * When true, the order requires attaching a dosage information label when shipped.
   * @return requiresDosageLabel
  **/
  @ApiModelProperty(required = true, value = "When true, the order requires attaching a dosage information label when shipped.")
  public Boolean isRequiresDosageLabel() {
    return requiresDosageLabel;
  }

  public void setRequiresDosageLabel(Boolean requiresDosageLabel) {
    this.requiresDosageLabel = requiresDosageLabel;
  }

  public OrderRegulatedInfo regulatedOrderVerificationStatus(RegulatedOrderVerificationStatus regulatedOrderVerificationStatus) {
    this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
    return this;
  }

   /**
   * The order&#39;s verification status.
   * @return regulatedOrderVerificationStatus
  **/
  @ApiModelProperty(required = true, value = "The order's verification status.")
  public RegulatedOrderVerificationStatus getRegulatedOrderVerificationStatus() {
    return regulatedOrderVerificationStatus;
  }

  public void setRegulatedOrderVerificationStatus(RegulatedOrderVerificationStatus regulatedOrderVerificationStatus) {
    this.regulatedOrderVerificationStatus = regulatedOrderVerificationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRegulatedInfo orderRegulatedInfo = (OrderRegulatedInfo) o;
    return Objects.equals(this.amazonOrderId, orderRegulatedInfo.amazonOrderId) &&
        Objects.equals(this.regulatedInformation, orderRegulatedInfo.regulatedInformation) &&
        Objects.equals(this.requiresDosageLabel, orderRegulatedInfo.requiresDosageLabel) &&
        Objects.equals(this.regulatedOrderVerificationStatus, orderRegulatedInfo.regulatedOrderVerificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, regulatedInformation, requiresDosageLabel, regulatedOrderVerificationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRegulatedInfo {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    regulatedInformation: ").append(toIndentedString(regulatedInformation)).append("\n");
    sb.append("    requiresDosageLabel: ").append(toIndentedString(requiresDosageLabel)).append("\n");
    sb.append("    regulatedOrderVerificationStatus: ").append(toIndentedString(regulatedOrderVerificationStatus)).append("\n");
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

