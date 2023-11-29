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
import com.amazon.spapi.model.finances_api_model.ChargeRefundTransactions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An event related to charge refund.
 */
@ApiModel(description = "An event related to charge refund.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:09.317+08:00")
public class ChargeRefundEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("ReasonCode")
  private String reasonCode = null;

  @SerializedName("ReasonCodeDescription")
  private String reasonCodeDescription = null;

  @SerializedName("ChargeRefundTransactions")
  private ChargeRefundTransactions chargeRefundTransactions = null;

  public ChargeRefundEvent postedDate(String postedDate) {
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

  public ChargeRefundEvent reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The reason given for a charge refund.  Example: &#x60;SubscriptionFeeCorrection&#x60;
   * @return reasonCode
  **/
  @ApiModelProperty(value = "The reason given for a charge refund.  Example: `SubscriptionFeeCorrection`")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ChargeRefundEvent reasonCodeDescription(String reasonCodeDescription) {
    this.reasonCodeDescription = reasonCodeDescription;
    return this;
  }

   /**
   * A description of the Reason Code.   Example: &#x60;SubscriptionFeeCorrection&#x60;
   * @return reasonCodeDescription
  **/
  @ApiModelProperty(value = "A description of the Reason Code.   Example: `SubscriptionFeeCorrection`")
  public String getReasonCodeDescription() {
    return reasonCodeDescription;
  }

  public void setReasonCodeDescription(String reasonCodeDescription) {
    this.reasonCodeDescription = reasonCodeDescription;
  }

  public ChargeRefundEvent chargeRefundTransactions(ChargeRefundTransactions chargeRefundTransactions) {
    this.chargeRefundTransactions = chargeRefundTransactions;
    return this;
  }

   /**
   * The amount of the charge refund credit.
   * @return chargeRefundTransactions
  **/
  @ApiModelProperty(value = "The amount of the charge refund credit.")
  public ChargeRefundTransactions getChargeRefundTransactions() {
    return chargeRefundTransactions;
  }

  public void setChargeRefundTransactions(ChargeRefundTransactions chargeRefundTransactions) {
    this.chargeRefundTransactions = chargeRefundTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRefundEvent chargeRefundEvent = (ChargeRefundEvent) o;
    return Objects.equals(this.postedDate, chargeRefundEvent.postedDate) &&
        Objects.equals(this.reasonCode, chargeRefundEvent.reasonCode) &&
        Objects.equals(this.reasonCodeDescription, chargeRefundEvent.reasonCodeDescription) &&
        Objects.equals(this.chargeRefundTransactions, chargeRefundEvent.chargeRefundTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, reasonCode, reasonCodeDescription, chargeRefundTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRefundEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonCodeDescription: ").append(toIndentedString(reasonCodeDescription)).append("\n");
    sb.append("    chargeRefundTransactions: ").append(toIndentedString(chargeRefundTransactions)).append("\n");
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

