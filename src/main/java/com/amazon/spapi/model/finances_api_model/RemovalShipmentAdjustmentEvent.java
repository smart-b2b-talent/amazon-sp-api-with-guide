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
import com.amazon.spapi.model.finances_api_model.RemovalShipmentItemAdjustment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A financial adjustment event for FBA liquidated inventory. A positive value indicates money owed to Amazon by the buyer (for example, when the charge was incorrectly calculated as less than it should be). A negative value indicates a full or partial refund owed to the buyer (for example, when the buyer receives damaged items or fewer items than ordered).
 */
@ApiModel(description = "A financial adjustment event for FBA liquidated inventory. A positive value indicates money owed to Amazon by the buyer (for example, when the charge was incorrectly calculated as less than it should be). A negative value indicates a full or partial refund owed to the buyer (for example, when the buyer receives damaged items or fewer items than ordered).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:09.317+08:00")
public class RemovalShipmentAdjustmentEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("AdjustmentEventId")
  private String adjustmentEventId = null;

  @SerializedName("MerchantOrderId")
  private String merchantOrderId = null;

  @SerializedName("OrderId")
  private String orderId = null;

  @SerializedName("TransactionType")
  private String transactionType = null;

  @SerializedName("RemovalShipmentItemAdjustmentList")
  private List<RemovalShipmentItemAdjustment> removalShipmentItemAdjustmentList = null;

  public RemovalShipmentAdjustmentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public RemovalShipmentAdjustmentEvent adjustmentEventId(String adjustmentEventId) {
    this.adjustmentEventId = adjustmentEventId;
    return this;
  }

   /**
   * The unique identifier for the adjustment event.
   * @return adjustmentEventId
  **/
  @ApiModelProperty(value = "The unique identifier for the adjustment event.")
  public String getAdjustmentEventId() {
    return adjustmentEventId;
  }

  public void setAdjustmentEventId(String adjustmentEventId) {
    this.adjustmentEventId = adjustmentEventId;
  }

  public RemovalShipmentAdjustmentEvent merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

   /**
   * The merchant removal orderId.
   * @return merchantOrderId
  **/
  @ApiModelProperty(value = "The merchant removal orderId.")
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  public RemovalShipmentAdjustmentEvent orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The orderId for shipping inventory.
   * @return orderId
  **/
  @ApiModelProperty(value = "The orderId for shipping inventory.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public RemovalShipmentAdjustmentEvent transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION.
   * @return transactionType
  **/
  @ApiModelProperty(value = "The type of removal order.  Possible values:  * WHOLESALE_LIQUIDATION.")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public RemovalShipmentAdjustmentEvent removalShipmentItemAdjustmentList(List<RemovalShipmentItemAdjustment> removalShipmentItemAdjustmentList) {
    this.removalShipmentItemAdjustmentList = removalShipmentItemAdjustmentList;
    return this;
  }

  public RemovalShipmentAdjustmentEvent addRemovalShipmentItemAdjustmentListItem(RemovalShipmentItemAdjustment removalShipmentItemAdjustmentListItem) {
    if (this.removalShipmentItemAdjustmentList == null) {
      this.removalShipmentItemAdjustmentList = new ArrayList<RemovalShipmentItemAdjustment>();
    }
    this.removalShipmentItemAdjustmentList.add(removalShipmentItemAdjustmentListItem);
    return this;
  }

   /**
   * A comma-delimited list of Removal shipmentItemAdjustment details for FBA inventory.
   * @return removalShipmentItemAdjustmentList
  **/
  @ApiModelProperty(value = "A comma-delimited list of Removal shipmentItemAdjustment details for FBA inventory.")
  public List<RemovalShipmentItemAdjustment> getRemovalShipmentItemAdjustmentList() {
    return removalShipmentItemAdjustmentList;
  }

  public void setRemovalShipmentItemAdjustmentList(List<RemovalShipmentItemAdjustment> removalShipmentItemAdjustmentList) {
    this.removalShipmentItemAdjustmentList = removalShipmentItemAdjustmentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovalShipmentAdjustmentEvent removalShipmentAdjustmentEvent = (RemovalShipmentAdjustmentEvent) o;
    return Objects.equals(this.postedDate, removalShipmentAdjustmentEvent.postedDate) &&
        Objects.equals(this.adjustmentEventId, removalShipmentAdjustmentEvent.adjustmentEventId) &&
        Objects.equals(this.merchantOrderId, removalShipmentAdjustmentEvent.merchantOrderId) &&
        Objects.equals(this.orderId, removalShipmentAdjustmentEvent.orderId) &&
        Objects.equals(this.transactionType, removalShipmentAdjustmentEvent.transactionType) &&
        Objects.equals(this.removalShipmentItemAdjustmentList, removalShipmentAdjustmentEvent.removalShipmentItemAdjustmentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, adjustmentEventId, merchantOrderId, orderId, transactionType, removalShipmentItemAdjustmentList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovalShipmentAdjustmentEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    adjustmentEventId: ").append(toIndentedString(adjustmentEventId)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    removalShipmentItemAdjustmentList: ").append(toIndentedString(removalShipmentItemAdjustmentList)).append("\n");
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

