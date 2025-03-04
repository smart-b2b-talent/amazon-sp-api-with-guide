/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_orders_api_model.OrderDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:41.239+08:00")
public class Order {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  /**
   * This field will contain the current state of the purchase order.
   */
  @JsonAdapter(PurchaseOrderStateEnum.Adapter.class)
  public enum PurchaseOrderStateEnum {
    NEW("New"),
    
    ACKNOWLEDGED("Acknowledged"),
    
    CLOSED("Closed");

    private String value;

    PurchaseOrderStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurchaseOrderStateEnum fromValue(String text) {
      for (PurchaseOrderStateEnum b : PurchaseOrderStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PurchaseOrderStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurchaseOrderStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurchaseOrderStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurchaseOrderStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("purchaseOrderState")
  private PurchaseOrderStateEnum purchaseOrderState = null;

  @SerializedName("orderDetails")
  private OrderDetails orderDetails = null;

  public Order purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order number for this order. Formatting Notes: 8-character alpha-numeric code.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "The purchase order number for this order. Formatting Notes: 8-character alpha-numeric code.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public Order purchaseOrderState(PurchaseOrderStateEnum purchaseOrderState) {
    this.purchaseOrderState = purchaseOrderState;
    return this;
  }

   /**
   * This field will contain the current state of the purchase order.
   * @return purchaseOrderState
  **/
  @ApiModelProperty(required = true, value = "This field will contain the current state of the purchase order.")
  public PurchaseOrderStateEnum getPurchaseOrderState() {
    return purchaseOrderState;
  }

  public void setPurchaseOrderState(PurchaseOrderStateEnum purchaseOrderState) {
    this.purchaseOrderState = purchaseOrderState;
  }

  public Order orderDetails(OrderDetails orderDetails) {
    this.orderDetails = orderDetails;
    return this;
  }

   /**
   * Details of an order.
   * @return orderDetails
  **/
  @ApiModelProperty(value = "Details of an order.")
  public OrderDetails getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(OrderDetails orderDetails) {
    this.orderDetails = orderDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.purchaseOrderNumber, order.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderState, order.purchaseOrderState) &&
        Objects.equals(this.orderDetails, order.orderDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, purchaseOrderState, orderDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderState: ").append(toIndentedString(purchaseOrderState)).append("\n");
    sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
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

