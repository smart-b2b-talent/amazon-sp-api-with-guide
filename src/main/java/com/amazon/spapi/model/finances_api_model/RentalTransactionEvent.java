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
import com.amazon.spapi.model.finances_api_model.ChargeComponentList;
import com.amazon.spapi.model.finances_api_model.Currency;
import com.amazon.spapi.model.finances_api_model.FeeComponentList;
import com.amazon.spapi.model.finances_api_model.TaxWithheldComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An event related to a rental transaction.
 */
@ApiModel(description = "An event related to a rental transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:21.148+08:00")
public class RentalTransactionEvent {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("RentalEventType")
  private String rentalEventType = null;

  @SerializedName("ExtensionLength")
  private Integer extensionLength = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("RentalChargeList")
  private ChargeComponentList rentalChargeList = null;

  @SerializedName("RentalFeeList")
  private FeeComponentList rentalFeeList = null;

  @SerializedName("MarketplaceName")
  private String marketplaceName = null;

  @SerializedName("RentalInitialValue")
  private Currency rentalInitialValue = null;

  @SerializedName("RentalReimbursement")
  private Currency rentalReimbursement = null;

  @SerializedName("RentalTaxWithheldList")
  private TaxWithheldComponentList rentalTaxWithheldList = null;

  public RentalTransactionEvent amazonOrderId(String amazonOrderId) {
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

  public RentalTransactionEvent rentalEventType(String rentalEventType) {
    this.rentalEventType = rentalEventType;
    return this;
  }

   /**
   * The type of rental event.  Possible values:  * RentalCustomerPayment-Buyout - Transaction type that represents when the customer wants to buy out a rented item.  * RentalCustomerPayment-Extension - Transaction type that represents when the customer wants to extend the rental period.  * RentalCustomerRefund-Buyout - Transaction type that represents when the customer requests a refund for the buyout of the rented item.  * RentalCustomerRefund-Extension - Transaction type that represents when the customer requests a refund over the extension on the rented item.  * RentalHandlingFee - Transaction type that represents the fee that Amazon charges sellers who rent through Amazon.  * RentalChargeFailureReimbursement - Transaction type that represents when Amazon sends money to the seller to compensate for a failed charge.  * RentalLostItemReimbursement - Transaction type that represents when Amazon sends money to the seller to compensate for a lost item.
   * @return rentalEventType
  **/
  @ApiModelProperty(value = "The type of rental event.  Possible values:  * RentalCustomerPayment-Buyout - Transaction type that represents when the customer wants to buy out a rented item.  * RentalCustomerPayment-Extension - Transaction type that represents when the customer wants to extend the rental period.  * RentalCustomerRefund-Buyout - Transaction type that represents when the customer requests a refund for the buyout of the rented item.  * RentalCustomerRefund-Extension - Transaction type that represents when the customer requests a refund over the extension on the rented item.  * RentalHandlingFee - Transaction type that represents the fee that Amazon charges sellers who rent through Amazon.  * RentalChargeFailureReimbursement - Transaction type that represents when Amazon sends money to the seller to compensate for a failed charge.  * RentalLostItemReimbursement - Transaction type that represents when Amazon sends money to the seller to compensate for a lost item.")
  public String getRentalEventType() {
    return rentalEventType;
  }

  public void setRentalEventType(String rentalEventType) {
    this.rentalEventType = rentalEventType;
  }

  public RentalTransactionEvent extensionLength(Integer extensionLength) {
    this.extensionLength = extensionLength;
    return this;
  }

   /**
   * The number of days that the buyer extended an already rented item. This value is only returned for RentalCustomerPayment-Extension and RentalCustomerRefund-Extension events.
   * @return extensionLength
  **/
  @ApiModelProperty(value = "The number of days that the buyer extended an already rented item. This value is only returned for RentalCustomerPayment-Extension and RentalCustomerRefund-Extension events.")
  public Integer getExtensionLength() {
    return extensionLength;
  }

  public void setExtensionLength(Integer extensionLength) {
    this.extensionLength = extensionLength;
  }

  public RentalTransactionEvent postedDate(String postedDate) {
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

  public RentalTransactionEvent rentalChargeList(ChargeComponentList rentalChargeList) {
    this.rentalChargeList = rentalChargeList;
    return this;
  }

   /**
   * A list of charges associated with the rental event.
   * @return rentalChargeList
  **/
  @ApiModelProperty(value = "A list of charges associated with the rental event.")
  public ChargeComponentList getRentalChargeList() {
    return rentalChargeList;
  }

  public void setRentalChargeList(ChargeComponentList rentalChargeList) {
    this.rentalChargeList = rentalChargeList;
  }

  public RentalTransactionEvent rentalFeeList(FeeComponentList rentalFeeList) {
    this.rentalFeeList = rentalFeeList;
    return this;
  }

   /**
   * A list of fees associated with the rental event.
   * @return rentalFeeList
  **/
  @ApiModelProperty(value = "A list of fees associated with the rental event.")
  public FeeComponentList getRentalFeeList() {
    return rentalFeeList;
  }

  public void setRentalFeeList(FeeComponentList rentalFeeList) {
    this.rentalFeeList = rentalFeeList;
  }

  public RentalTransactionEvent marketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
    return this;
  }

   /**
   * The name of the marketplace.
   * @return marketplaceName
  **/
  @ApiModelProperty(value = "The name of the marketplace.")
  public String getMarketplaceName() {
    return marketplaceName;
  }

  public void setMarketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
  }

  public RentalTransactionEvent rentalInitialValue(Currency rentalInitialValue) {
    this.rentalInitialValue = rentalInitialValue;
    return this;
  }

   /**
   * The amount of money the customer originally paid to rent the item. This value is only returned for RentalChargeFailureReimbursement and RentalLostItemReimbursement events.
   * @return rentalInitialValue
  **/
  @ApiModelProperty(value = "The amount of money the customer originally paid to rent the item. This value is only returned for RentalChargeFailureReimbursement and RentalLostItemReimbursement events.")
  public Currency getRentalInitialValue() {
    return rentalInitialValue;
  }

  public void setRentalInitialValue(Currency rentalInitialValue) {
    this.rentalInitialValue = rentalInitialValue;
  }

  public RentalTransactionEvent rentalReimbursement(Currency rentalReimbursement) {
    this.rentalReimbursement = rentalReimbursement;
    return this;
  }

   /**
   * The amount of money Amazon sends the seller to compensate for a lost item or a failed charge. This value is only returned for RentalChargeFailureReimbursement and RentalLostItemReimbursement events.
   * @return rentalReimbursement
  **/
  @ApiModelProperty(value = "The amount of money Amazon sends the seller to compensate for a lost item or a failed charge. This value is only returned for RentalChargeFailureReimbursement and RentalLostItemReimbursement events.")
  public Currency getRentalReimbursement() {
    return rentalReimbursement;
  }

  public void setRentalReimbursement(Currency rentalReimbursement) {
    this.rentalReimbursement = rentalReimbursement;
  }

  public RentalTransactionEvent rentalTaxWithheldList(TaxWithheldComponentList rentalTaxWithheldList) {
    this.rentalTaxWithheldList = rentalTaxWithheldList;
    return this;
  }

   /**
   * A list of taxes withheld information for a rental item.
   * @return rentalTaxWithheldList
  **/
  @ApiModelProperty(value = "A list of taxes withheld information for a rental item.")
  public TaxWithheldComponentList getRentalTaxWithheldList() {
    return rentalTaxWithheldList;
  }

  public void setRentalTaxWithheldList(TaxWithheldComponentList rentalTaxWithheldList) {
    this.rentalTaxWithheldList = rentalTaxWithheldList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RentalTransactionEvent rentalTransactionEvent = (RentalTransactionEvent) o;
    return Objects.equals(this.amazonOrderId, rentalTransactionEvent.amazonOrderId) &&
        Objects.equals(this.rentalEventType, rentalTransactionEvent.rentalEventType) &&
        Objects.equals(this.extensionLength, rentalTransactionEvent.extensionLength) &&
        Objects.equals(this.postedDate, rentalTransactionEvent.postedDate) &&
        Objects.equals(this.rentalChargeList, rentalTransactionEvent.rentalChargeList) &&
        Objects.equals(this.rentalFeeList, rentalTransactionEvent.rentalFeeList) &&
        Objects.equals(this.marketplaceName, rentalTransactionEvent.marketplaceName) &&
        Objects.equals(this.rentalInitialValue, rentalTransactionEvent.rentalInitialValue) &&
        Objects.equals(this.rentalReimbursement, rentalTransactionEvent.rentalReimbursement) &&
        Objects.equals(this.rentalTaxWithheldList, rentalTransactionEvent.rentalTaxWithheldList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, rentalEventType, extensionLength, postedDate, rentalChargeList, rentalFeeList, marketplaceName, rentalInitialValue, rentalReimbursement, rentalTaxWithheldList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RentalTransactionEvent {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    rentalEventType: ").append(toIndentedString(rentalEventType)).append("\n");
    sb.append("    extensionLength: ").append(toIndentedString(extensionLength)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    rentalChargeList: ").append(toIndentedString(rentalChargeList)).append("\n");
    sb.append("    rentalFeeList: ").append(toIndentedString(rentalFeeList)).append("\n");
    sb.append("    marketplaceName: ").append(toIndentedString(marketplaceName)).append("\n");
    sb.append("    rentalInitialValue: ").append(toIndentedString(rentalInitialValue)).append("\n");
    sb.append("    rentalReimbursement: ").append(toIndentedString(rentalReimbursement)).append("\n");
    sb.append("    rentalTaxWithheldList: ").append(toIndentedString(rentalTaxWithheldList)).append("\n");
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

