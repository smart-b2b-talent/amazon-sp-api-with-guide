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
import com.amazon.spapi.model.finances_api_model.AdjustmentItemList;
import com.amazon.spapi.model.finances_api_model.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An adjustment to the seller&#39;s account.
 */
@ApiModel(description = "An adjustment to the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:49.128+08:00")
public class AdjustmentEvent {
  @SerializedName("AdjustmentType")
  private String adjustmentType = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("AdjustmentAmount")
  private Currency adjustmentAmount = null;

  @SerializedName("AdjustmentItemList")
  private AdjustmentItemList adjustmentItemList = null;

  public AdjustmentEvent adjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
    return this;
  }

   /**
   * The type of adjustment.  Possible values:  * FBAInventoryReimbursement - An FBA inventory reimbursement to a seller&#39;s account. This occurs if a seller&#39;s inventory is damaged.  * ReserveEvent - A reserve event that is generated at the time of a settlement period closing. This occurs when some money from a seller&#39;s account is held back.  * PostageBilling - The amount paid by a seller for shipping labels.  * PostageRefund - The reimbursement of shipping labels purchased for orders that were canceled or refunded.  * LostOrDamagedReimbursement - An Amazon Easy Ship reimbursement to a seller&#39;s account for a package that we lost or damaged.  * CanceledButPickedUpReimbursement - An Amazon Easy Ship reimbursement to a seller&#39;s account. This occurs when a package is picked up and the order is subsequently canceled. This value is used only in the India marketplace.  * ReimbursementClawback - An Amazon Easy Ship reimbursement clawback from a seller&#39;s account. This occurs when a prior reimbursement is reversed. This value is used only in the India marketplace.  * SellerRewards - An award credited to a seller&#39;s account for their participation in an offer in the Seller Rewards program. Applies only to the India marketplace.
   * @return adjustmentType
  **/
  @ApiModelProperty(value = "The type of adjustment.  Possible values:  * FBAInventoryReimbursement - An FBA inventory reimbursement to a seller's account. This occurs if a seller's inventory is damaged.  * ReserveEvent - A reserve event that is generated at the time of a settlement period closing. This occurs when some money from a seller's account is held back.  * PostageBilling - The amount paid by a seller for shipping labels.  * PostageRefund - The reimbursement of shipping labels purchased for orders that were canceled or refunded.  * LostOrDamagedReimbursement - An Amazon Easy Ship reimbursement to a seller's account for a package that we lost or damaged.  * CanceledButPickedUpReimbursement - An Amazon Easy Ship reimbursement to a seller's account. This occurs when a package is picked up and the order is subsequently canceled. This value is used only in the India marketplace.  * ReimbursementClawback - An Amazon Easy Ship reimbursement clawback from a seller's account. This occurs when a prior reimbursement is reversed. This value is used only in the India marketplace.  * SellerRewards - An award credited to a seller's account for their participation in an offer in the Seller Rewards program. Applies only to the India marketplace.")
  public String getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  public AdjustmentEvent postedDate(String postedDate) {
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

  public AdjustmentEvent adjustmentAmount(Currency adjustmentAmount) {
    this.adjustmentAmount = adjustmentAmount;
    return this;
  }

   /**
   * The amount adjusted as part of this event.
   * @return adjustmentAmount
  **/
  @ApiModelProperty(value = "The amount adjusted as part of this event.")
  public Currency getAdjustmentAmount() {
    return adjustmentAmount;
  }

  public void setAdjustmentAmount(Currency adjustmentAmount) {
    this.adjustmentAmount = adjustmentAmount;
  }

  public AdjustmentEvent adjustmentItemList(AdjustmentItemList adjustmentItemList) {
    this.adjustmentItemList = adjustmentItemList;
    return this;
  }

   /**
   * A list of information about adjustments to an account.
   * @return adjustmentItemList
  **/
  @ApiModelProperty(value = "A list of information about adjustments to an account.")
  public AdjustmentItemList getAdjustmentItemList() {
    return adjustmentItemList;
  }

  public void setAdjustmentItemList(AdjustmentItemList adjustmentItemList) {
    this.adjustmentItemList = adjustmentItemList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentEvent adjustmentEvent = (AdjustmentEvent) o;
    return Objects.equals(this.adjustmentType, adjustmentEvent.adjustmentType) &&
        Objects.equals(this.postedDate, adjustmentEvent.postedDate) &&
        Objects.equals(this.adjustmentAmount, adjustmentEvent.adjustmentAmount) &&
        Objects.equals(this.adjustmentItemList, adjustmentEvent.adjustmentItemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, postedDate, adjustmentAmount, adjustmentItemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentEvent {\n");
    
    sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
    sb.append("    adjustmentItemList: ").append(toIndentedString(adjustmentItemList)).append("\n");
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

