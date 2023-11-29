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
 * Failed ad hoc disbursement event list.
 */
@ApiModel(description = "Failed ad hoc disbursement event list.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:49.128+08:00")
public class FailedAdhocDisbursementEvent {
  @SerializedName("FundsTransfersType")
  private String fundsTransfersType = null;

  @SerializedName("TransferId")
  private String transferId = null;

  @SerializedName("DisbursementId")
  private String disbursementId = null;

  @SerializedName("PaymentDisbursementType")
  private String paymentDisbursementType = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TransferAmount")
  private Currency transferAmount = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  public FailedAdhocDisbursementEvent fundsTransfersType(String fundsTransfersType) {
    this.fundsTransfersType = fundsTransfersType;
    return this;
  }

   /**
   * The type of fund transfer.   Example \&quot;Refund\&quot;
   * @return fundsTransfersType
  **/
  @ApiModelProperty(value = "The type of fund transfer.   Example \"Refund\"")
  public String getFundsTransfersType() {
    return fundsTransfersType;
  }

  public void setFundsTransfersType(String fundsTransfersType) {
    this.fundsTransfersType = fundsTransfersType;
  }

  public FailedAdhocDisbursementEvent transferId(String transferId) {
    this.transferId = transferId;
    return this;
  }

   /**
   * The transfer identifier.
   * @return transferId
  **/
  @ApiModelProperty(value = "The transfer identifier.")
  public String getTransferId() {
    return transferId;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

  public FailedAdhocDisbursementEvent disbursementId(String disbursementId) {
    this.disbursementId = disbursementId;
    return this;
  }

   /**
   * The disbursement identifier.
   * @return disbursementId
  **/
  @ApiModelProperty(value = "The disbursement identifier.")
  public String getDisbursementId() {
    return disbursementId;
  }

  public void setDisbursementId(String disbursementId) {
    this.disbursementId = disbursementId;
  }

  public FailedAdhocDisbursementEvent paymentDisbursementType(String paymentDisbursementType) {
    this.paymentDisbursementType = paymentDisbursementType;
    return this;
  }

   /**
   * The type of payment for disbursement.   Example &#x60;CREDIT_CARD&#x60;
   * @return paymentDisbursementType
  **/
  @ApiModelProperty(value = "The type of payment for disbursement.   Example `CREDIT_CARD`")
  public String getPaymentDisbursementType() {
    return paymentDisbursementType;
  }

  public void setPaymentDisbursementType(String paymentDisbursementType) {
    this.paymentDisbursementType = paymentDisbursementType;
  }

  public FailedAdhocDisbursementEvent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the failed &#x60;AdhocDisbursement&#x60;.   Example &#x60;HARD_DECLINED&#x60;
   * @return status
  **/
  @ApiModelProperty(value = "The status of the failed `AdhocDisbursement`.   Example `HARD_DECLINED`")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FailedAdhocDisbursementEvent transferAmount(Currency transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * The amount of the Adhoc Disbursement.
   * @return transferAmount
  **/
  @ApiModelProperty(value = "The amount of the Adhoc Disbursement.")
  public Currency getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Currency transferAmount) {
    this.transferAmount = transferAmount;
  }

  public FailedAdhocDisbursementEvent postedDate(String postedDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedAdhocDisbursementEvent failedAdhocDisbursementEvent = (FailedAdhocDisbursementEvent) o;
    return Objects.equals(this.fundsTransfersType, failedAdhocDisbursementEvent.fundsTransfersType) &&
        Objects.equals(this.transferId, failedAdhocDisbursementEvent.transferId) &&
        Objects.equals(this.disbursementId, failedAdhocDisbursementEvent.disbursementId) &&
        Objects.equals(this.paymentDisbursementType, failedAdhocDisbursementEvent.paymentDisbursementType) &&
        Objects.equals(this.status, failedAdhocDisbursementEvent.status) &&
        Objects.equals(this.transferAmount, failedAdhocDisbursementEvent.transferAmount) &&
        Objects.equals(this.postedDate, failedAdhocDisbursementEvent.postedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsTransfersType, transferId, disbursementId, paymentDisbursementType, status, transferAmount, postedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedAdhocDisbursementEvent {\n");
    
    sb.append("    fundsTransfersType: ").append(toIndentedString(fundsTransfersType)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    disbursementId: ").append(toIndentedString(disbursementId)).append("\n");
    sb.append("    paymentDisbursementType: ").append(toIndentedString(paymentDisbursementType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
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

