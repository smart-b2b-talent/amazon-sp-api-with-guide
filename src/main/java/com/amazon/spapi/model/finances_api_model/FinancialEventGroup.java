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
 * Information related to a financial event group.
 */
@ApiModel(description = "Information related to a financial event group.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:09.317+08:00")
public class FinancialEventGroup {
  @SerializedName("FinancialEventGroupId")
  private String financialEventGroupId = null;

  @SerializedName("ProcessingStatus")
  private String processingStatus = null;

  @SerializedName("FundTransferStatus")
  private String fundTransferStatus = null;

  @SerializedName("OriginalTotal")
  private Currency originalTotal = null;

  @SerializedName("ConvertedTotal")
  private Currency convertedTotal = null;

  @SerializedName("FundTransferDate")
  private String fundTransferDate = null;

  @SerializedName("TraceId")
  private String traceId = null;

  @SerializedName("AccountTail")
  private String accountTail = null;

  @SerializedName("BeginningBalance")
  private Currency beginningBalance = null;

  @SerializedName("FinancialEventGroupStart")
  private String financialEventGroupStart = null;

  @SerializedName("FinancialEventGroupEnd")
  private String financialEventGroupEnd = null;

  public FinancialEventGroup financialEventGroupId(String financialEventGroupId) {
    this.financialEventGroupId = financialEventGroupId;
    return this;
  }

   /**
   * A unique identifier for the financial event group.
   * @return financialEventGroupId
  **/
  @ApiModelProperty(value = "A unique identifier for the financial event group.")
  public String getFinancialEventGroupId() {
    return financialEventGroupId;
  }

  public void setFinancialEventGroupId(String financialEventGroupId) {
    this.financialEventGroupId = financialEventGroupId;
  }

  public FinancialEventGroup processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * The processing status of the financial event group indicates whether the balance of the financial event group is settled.  Possible values:  * Open  * Closed
   * @return processingStatus
  **/
  @ApiModelProperty(value = "The processing status of the financial event group indicates whether the balance of the financial event group is settled.  Possible values:  * Open  * Closed")
  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public FinancialEventGroup fundTransferStatus(String fundTransferStatus) {
    this.fundTransferStatus = fundTransferStatus;
    return this;
  }

   /**
   * The status of the fund transfer.
   * @return fundTransferStatus
  **/
  @ApiModelProperty(value = "The status of the fund transfer.")
  public String getFundTransferStatus() {
    return fundTransferStatus;
  }

  public void setFundTransferStatus(String fundTransferStatus) {
    this.fundTransferStatus = fundTransferStatus;
  }

  public FinancialEventGroup originalTotal(Currency originalTotal) {
    this.originalTotal = originalTotal;
    return this;
  }

   /**
   * The total amount in the currency of the marketplace in which the transactions occurred.
   * @return originalTotal
  **/
  @ApiModelProperty(value = "The total amount in the currency of the marketplace in which the transactions occurred.")
  public Currency getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(Currency originalTotal) {
    this.originalTotal = originalTotal;
  }

  public FinancialEventGroup convertedTotal(Currency convertedTotal) {
    this.convertedTotal = convertedTotal;
    return this;
  }

   /**
   * The total amount in the currency of the marketplace in which the funds were disbursed.
   * @return convertedTotal
  **/
  @ApiModelProperty(value = "The total amount in the currency of the marketplace in which the funds were disbursed.")
  public Currency getConvertedTotal() {
    return convertedTotal;
  }

  public void setConvertedTotal(Currency convertedTotal) {
    this.convertedTotal = convertedTotal;
  }

  public FinancialEventGroup fundTransferDate(String fundTransferDate) {
    this.fundTransferDate = fundTransferDate;
    return this;
  }

   /**
   * The date and time when the disbursement or charge was initiated. Only present for closed settlements. In ISO 8601 date time format.
   * @return fundTransferDate
  **/
  @ApiModelProperty(value = "The date and time when the disbursement or charge was initiated. Only present for closed settlements. In ISO 8601 date time format.")
  public String getFundTransferDate() {
    return fundTransferDate;
  }

  public void setFundTransferDate(String fundTransferDate) {
    this.fundTransferDate = fundTransferDate;
  }

  public FinancialEventGroup traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

   /**
   * The trace identifier used by sellers to look up transactions externally.
   * @return traceId
  **/
  @ApiModelProperty(value = "The trace identifier used by sellers to look up transactions externally.")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public FinancialEventGroup accountTail(String accountTail) {
    this.accountTail = accountTail;
    return this;
  }

   /**
   * The account tail of the payment instrument.
   * @return accountTail
  **/
  @ApiModelProperty(value = "The account tail of the payment instrument.")
  public String getAccountTail() {
    return accountTail;
  }

  public void setAccountTail(String accountTail) {
    this.accountTail = accountTail;
  }

  public FinancialEventGroup beginningBalance(Currency beginningBalance) {
    this.beginningBalance = beginningBalance;
    return this;
  }

   /**
   * The balance at the beginning of the settlement period.
   * @return beginningBalance
  **/
  @ApiModelProperty(value = "The balance at the beginning of the settlement period.")
  public Currency getBeginningBalance() {
    return beginningBalance;
  }

  public void setBeginningBalance(Currency beginningBalance) {
    this.beginningBalance = beginningBalance;
  }

  public FinancialEventGroup financialEventGroupStart(String financialEventGroupStart) {
    this.financialEventGroupStart = financialEventGroupStart;
    return this;
  }

   /**
   * The date and time at which the financial event group is opened. In ISO 8601 date time format.
   * @return financialEventGroupStart
  **/
  @ApiModelProperty(value = "The date and time at which the financial event group is opened. In ISO 8601 date time format.")
  public String getFinancialEventGroupStart() {
    return financialEventGroupStart;
  }

  public void setFinancialEventGroupStart(String financialEventGroupStart) {
    this.financialEventGroupStart = financialEventGroupStart;
  }

  public FinancialEventGroup financialEventGroupEnd(String financialEventGroupEnd) {
    this.financialEventGroupEnd = financialEventGroupEnd;
    return this;
  }

   /**
   * The date and time at which the financial event group is closed. In ISO 8601 date time format.
   * @return financialEventGroupEnd
  **/
  @ApiModelProperty(value = "The date and time at which the financial event group is closed. In ISO 8601 date time format.")
  public String getFinancialEventGroupEnd() {
    return financialEventGroupEnd;
  }

  public void setFinancialEventGroupEnd(String financialEventGroupEnd) {
    this.financialEventGroupEnd = financialEventGroupEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialEventGroup financialEventGroup = (FinancialEventGroup) o;
    return Objects.equals(this.financialEventGroupId, financialEventGroup.financialEventGroupId) &&
        Objects.equals(this.processingStatus, financialEventGroup.processingStatus) &&
        Objects.equals(this.fundTransferStatus, financialEventGroup.fundTransferStatus) &&
        Objects.equals(this.originalTotal, financialEventGroup.originalTotal) &&
        Objects.equals(this.convertedTotal, financialEventGroup.convertedTotal) &&
        Objects.equals(this.fundTransferDate, financialEventGroup.fundTransferDate) &&
        Objects.equals(this.traceId, financialEventGroup.traceId) &&
        Objects.equals(this.accountTail, financialEventGroup.accountTail) &&
        Objects.equals(this.beginningBalance, financialEventGroup.beginningBalance) &&
        Objects.equals(this.financialEventGroupStart, financialEventGroup.financialEventGroupStart) &&
        Objects.equals(this.financialEventGroupEnd, financialEventGroup.financialEventGroupEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialEventGroupId, processingStatus, fundTransferStatus, originalTotal, convertedTotal, fundTransferDate, traceId, accountTail, beginningBalance, financialEventGroupStart, financialEventGroupEnd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialEventGroup {\n");
    
    sb.append("    financialEventGroupId: ").append(toIndentedString(financialEventGroupId)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    fundTransferStatus: ").append(toIndentedString(fundTransferStatus)).append("\n");
    sb.append("    originalTotal: ").append(toIndentedString(originalTotal)).append("\n");
    sb.append("    convertedTotal: ").append(toIndentedString(convertedTotal)).append("\n");
    sb.append("    fundTransferDate: ").append(toIndentedString(fundTransferDate)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    accountTail: ").append(toIndentedString(accountTail)).append("\n");
    sb.append("    beginningBalance: ").append(toIndentedString(beginningBalance)).append("\n");
    sb.append("    financialEventGroupStart: ").append(toIndentedString(financialEventGroupStart)).append("\n");
    sb.append("    financialEventGroupEnd: ").append(toIndentedString(financialEventGroupEnd)).append("\n");
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

