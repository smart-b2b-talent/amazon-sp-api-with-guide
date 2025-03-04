/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.ShipmentDates;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Shipment details required for the shipment.
 */
@ApiModel(description = "Shipment details required for the shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:30.605+08:00")
public class ShipmentDetails {
  @SerializedName("isPriorityShipment")
  private Boolean isPriorityShipment = null;

  @SerializedName("isScheduledDeliveryShipment")
  private Boolean isScheduledDeliveryShipment = null;

  @SerializedName("isPslipRequired")
  private Boolean isPslipRequired = null;

  @SerializedName("isGift")
  private Boolean isGift = null;

  @SerializedName("shipMethod")
  private String shipMethod = null;

  @SerializedName("shipmentDates")
  private ShipmentDates shipmentDates = null;

  @SerializedName("messageToCustomer")
  private String messageToCustomer = null;

  public ShipmentDetails isPriorityShipment(Boolean isPriorityShipment) {
    this.isPriorityShipment = isPriorityShipment;
    return this;
  }

   /**
   * When true, this is a priority shipment.
   * @return isPriorityShipment
  **/
  @ApiModelProperty(required = true, value = "When true, this is a priority shipment.")
  public Boolean isIsPriorityShipment() {
    return isPriorityShipment;
  }

  public void setIsPriorityShipment(Boolean isPriorityShipment) {
    this.isPriorityShipment = isPriorityShipment;
  }

  public ShipmentDetails isScheduledDeliveryShipment(Boolean isScheduledDeliveryShipment) {
    this.isScheduledDeliveryShipment = isScheduledDeliveryShipment;
    return this;
  }

   /**
   * When true, this order is part of a scheduled delivery program.
   * @return isScheduledDeliveryShipment
  **/
  @ApiModelProperty(value = "When true, this order is part of a scheduled delivery program.")
  public Boolean isIsScheduledDeliveryShipment() {
    return isScheduledDeliveryShipment;
  }

  public void setIsScheduledDeliveryShipment(Boolean isScheduledDeliveryShipment) {
    this.isScheduledDeliveryShipment = isScheduledDeliveryShipment;
  }

  public ShipmentDetails isPslipRequired(Boolean isPslipRequired) {
    this.isPslipRequired = isPslipRequired;
    return this;
  }

   /**
   * When true, a packing slip is required to be sent to the customer.
   * @return isPslipRequired
  **/
  @ApiModelProperty(required = true, value = "When true, a packing slip is required to be sent to the customer.")
  public Boolean isIsPslipRequired() {
    return isPslipRequired;
  }

  public void setIsPslipRequired(Boolean isPslipRequired) {
    this.isPslipRequired = isPslipRequired;
  }

  public ShipmentDetails isGift(Boolean isGift) {
    this.isGift = isGift;
    return this;
  }

   /**
   * When true, the order contain a gift. Include the gift message and gift wrap information.
   * @return isGift
  **/
  @ApiModelProperty(value = "When true, the order contain a gift. Include the gift message and gift wrap information.")
  public Boolean isIsGift() {
    return isGift;
  }

  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }

  public ShipmentDetails shipMethod(String shipMethod) {
    this.shipMethod = shipMethod;
    return this;
  }

   /**
   * Ship method to be used for shipping the order. Amazon defines ship method codes indicating the shipping carrier and shipment service level. To see the full list of ship methods in use, including both the code and the friendly name, search the &#39;Help&#39; section on Vendor Central for &#39;ship methods&#39;.
   * @return shipMethod
  **/
  @ApiModelProperty(required = true, value = "Ship method to be used for shipping the order. Amazon defines ship method codes indicating the shipping carrier and shipment service level. To see the full list of ship methods in use, including both the code and the friendly name, search the 'Help' section on Vendor Central for 'ship methods'.")
  public String getShipMethod() {
    return shipMethod;
  }

  public void setShipMethod(String shipMethod) {
    this.shipMethod = shipMethod;
  }

  public ShipmentDetails shipmentDates(ShipmentDates shipmentDates) {
    this.shipmentDates = shipmentDates;
    return this;
  }

   /**
   * Get shipmentDates
   * @return shipmentDates
  **/
  @ApiModelProperty(required = true, value = "")
  public ShipmentDates getShipmentDates() {
    return shipmentDates;
  }

  public void setShipmentDates(ShipmentDates shipmentDates) {
    this.shipmentDates = shipmentDates;
  }

  public ShipmentDetails messageToCustomer(String messageToCustomer) {
    this.messageToCustomer = messageToCustomer;
    return this;
  }

   /**
   * Message to customer for order status.
   * @return messageToCustomer
  **/
  @ApiModelProperty(required = true, value = "Message to customer for order status.")
  public String getMessageToCustomer() {
    return messageToCustomer;
  }

  public void setMessageToCustomer(String messageToCustomer) {
    this.messageToCustomer = messageToCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDetails shipmentDetails = (ShipmentDetails) o;
    return Objects.equals(this.isPriorityShipment, shipmentDetails.isPriorityShipment) &&
        Objects.equals(this.isScheduledDeliveryShipment, shipmentDetails.isScheduledDeliveryShipment) &&
        Objects.equals(this.isPslipRequired, shipmentDetails.isPslipRequired) &&
        Objects.equals(this.isGift, shipmentDetails.isGift) &&
        Objects.equals(this.shipMethod, shipmentDetails.shipMethod) &&
        Objects.equals(this.shipmentDates, shipmentDetails.shipmentDates) &&
        Objects.equals(this.messageToCustomer, shipmentDetails.messageToCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPriorityShipment, isScheduledDeliveryShipment, isPslipRequired, isGift, shipMethod, shipmentDates, messageToCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDetails {\n");
    
    sb.append("    isPriorityShipment: ").append(toIndentedString(isPriorityShipment)).append("\n");
    sb.append("    isScheduledDeliveryShipment: ").append(toIndentedString(isScheduledDeliveryShipment)).append("\n");
    sb.append("    isPslipRequired: ").append(toIndentedString(isPslipRequired)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    shipMethod: ").append(toIndentedString(shipMethod)).append("\n");
    sb.append("    shipmentDates: ").append(toIndentedString(shipmentDates)).append("\n");
    sb.append("    messageToCustomer: ").append(toIndentedString(messageToCustomer)).append("\n");
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

