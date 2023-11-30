/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances_api_model.FeeComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An event related to a trial shipment.
 */
@ApiModel(description = "An event related to a trial shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:21.148+08:00")
public class TrialShipmentEvent {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("FinancialEventGroupId")
  private String financialEventGroupId = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("SKU")
  private String SKU = null;

  @SerializedName("FeeList")
  private FeeComponentList feeList = null;

  public TrialShipmentEvent amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined identifier for an order.
   * @return amazonOrderId
  **/
  @ApiModelProperty(value = "An Amazon-defined identifier for an order.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public TrialShipmentEvent financialEventGroupId(String financialEventGroupId) {
    this.financialEventGroupId = financialEventGroupId;
    return this;
  }

   /**
   * The identifier of the financial event group.
   * @return financialEventGroupId
  **/
  @ApiModelProperty(value = "The identifier of the financial event group.")
  public String getFinancialEventGroupId() {
    return financialEventGroupId;
  }

  public void setFinancialEventGroupId(String financialEventGroupId) {
    this.financialEventGroupId = financialEventGroupId;
  }

  public TrialShipmentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public TrialShipmentEvent SKU(String SKU) {
    this.SKU = SKU;
    return this;
  }

   /**
   * The seller SKU of the item. The seller SKU is qualified by the seller&#39;s seller ID, which is included with every call to the Selling Partner API.
   * @return SKU
  **/
  @ApiModelProperty(value = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
  public String getSKU() {
    return SKU;
  }

  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  public TrialShipmentEvent feeList(FeeComponentList feeList) {
    this.feeList = feeList;
    return this;
  }

   /**
   * A list of fees charged by Amazon for trial shipments.
   * @return feeList
  **/
  @ApiModelProperty(value = "A list of fees charged by Amazon for trial shipments.")
  public FeeComponentList getFeeList() {
    return feeList;
  }

  public void setFeeList(FeeComponentList feeList) {
    this.feeList = feeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialShipmentEvent trialShipmentEvent = (TrialShipmentEvent) o;
    return Objects.equals(this.amazonOrderId, trialShipmentEvent.amazonOrderId) &&
        Objects.equals(this.financialEventGroupId, trialShipmentEvent.financialEventGroupId) &&
        Objects.equals(this.postedDate, trialShipmentEvent.postedDate) &&
        Objects.equals(this.SKU, trialShipmentEvent.SKU) &&
        Objects.equals(this.feeList, trialShipmentEvent.feeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, financialEventGroupId, postedDate, SKU, feeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialShipmentEvent {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    financialEventGroupId: ").append(toIndentedString(financialEventGroupId)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
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

