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
import com.amazon.spapi.model.vendor_orders_api_model.ItemQuantity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * OrderItemAcknowledgement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:41.239+08:00")
public class OrderItemAcknowledgement {
  /**
   * This indicates the acknowledgement code.
   */
  @JsonAdapter(AcknowledgementCodeEnum.Adapter.class)
  public enum AcknowledgementCodeEnum {
    ACCEPTED("Accepted"),
    
    BACKORDERED("Backordered"),
    
    REJECTED("Rejected");

    private String value;

    AcknowledgementCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AcknowledgementCodeEnum fromValue(String text) {
      for (AcknowledgementCodeEnum b : AcknowledgementCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AcknowledgementCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AcknowledgementCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AcknowledgementCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AcknowledgementCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("acknowledgementCode")
  private AcknowledgementCodeEnum acknowledgementCode = null;

  @SerializedName("acknowledgedQuantity")
  private ItemQuantity acknowledgedQuantity = null;

  @SerializedName("scheduledShipDate")
  private OffsetDateTime scheduledShipDate = null;

  @SerializedName("scheduledDeliveryDate")
  private OffsetDateTime scheduledDeliveryDate = null;

  /**
   * Indicates the reason for rejection.
   */
  @JsonAdapter(RejectionReasonEnum.Adapter.class)
  public enum RejectionReasonEnum {
    TEMPORARILYUNAVAILABLE("TemporarilyUnavailable"),
    
    INVALIDPRODUCTIDENTIFIER("InvalidProductIdentifier"),
    
    OBSOLETEPRODUCT("ObsoleteProduct");

    private String value;

    RejectionReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RejectionReasonEnum fromValue(String text) {
      for (RejectionReasonEnum b : RejectionReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RejectionReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RejectionReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RejectionReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RejectionReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rejectionReason")
  private RejectionReasonEnum rejectionReason = null;

  public OrderItemAcknowledgement acknowledgementCode(AcknowledgementCodeEnum acknowledgementCode) {
    this.acknowledgementCode = acknowledgementCode;
    return this;
  }

   /**
   * This indicates the acknowledgement code.
   * @return acknowledgementCode
  **/
  @ApiModelProperty(required = true, value = "This indicates the acknowledgement code.")
  public AcknowledgementCodeEnum getAcknowledgementCode() {
    return acknowledgementCode;
  }

  public void setAcknowledgementCode(AcknowledgementCodeEnum acknowledgementCode) {
    this.acknowledgementCode = acknowledgementCode;
  }

  public OrderItemAcknowledgement acknowledgedQuantity(ItemQuantity acknowledgedQuantity) {
    this.acknowledgedQuantity = acknowledgedQuantity;
    return this;
  }

   /**
   * Details of quantity acknowledged with the above acknowledgement code.
   * @return acknowledgedQuantity
  **/
  @ApiModelProperty(required = true, value = "Details of quantity acknowledged with the above acknowledgement code.")
  public ItemQuantity getAcknowledgedQuantity() {
    return acknowledgedQuantity;
  }

  public void setAcknowledgedQuantity(ItemQuantity acknowledgedQuantity) {
    this.acknowledgedQuantity = acknowledgedQuantity;
  }

  public OrderItemAcknowledgement scheduledShipDate(OffsetDateTime scheduledShipDate) {
    this.scheduledShipDate = scheduledShipDate;
    return this;
  }

   /**
   * Estimated ship date per line item. Must be in ISO-8601 date/time format.
   * @return scheduledShipDate
  **/
  @ApiModelProperty(value = "Estimated ship date per line item. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getScheduledShipDate() {
    return scheduledShipDate;
  }

  public void setScheduledShipDate(OffsetDateTime scheduledShipDate) {
    this.scheduledShipDate = scheduledShipDate;
  }

  public OrderItemAcknowledgement scheduledDeliveryDate(OffsetDateTime scheduledDeliveryDate) {
    this.scheduledDeliveryDate = scheduledDeliveryDate;
    return this;
  }

   /**
   * Estimated delivery date per line item. Must be in ISO-8601 date/time format.
   * @return scheduledDeliveryDate
  **/
  @ApiModelProperty(value = "Estimated delivery date per line item. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getScheduledDeliveryDate() {
    return scheduledDeliveryDate;
  }

  public void setScheduledDeliveryDate(OffsetDateTime scheduledDeliveryDate) {
    this.scheduledDeliveryDate = scheduledDeliveryDate;
  }

  public OrderItemAcknowledgement rejectionReason(RejectionReasonEnum rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Indicates the reason for rejection.
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "Indicates the reason for rejection.")
  public RejectionReasonEnum getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(RejectionReasonEnum rejectionReason) {
    this.rejectionReason = rejectionReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemAcknowledgement orderItemAcknowledgement = (OrderItemAcknowledgement) o;
    return Objects.equals(this.acknowledgementCode, orderItemAcknowledgement.acknowledgementCode) &&
        Objects.equals(this.acknowledgedQuantity, orderItemAcknowledgement.acknowledgedQuantity) &&
        Objects.equals(this.scheduledShipDate, orderItemAcknowledgement.scheduledShipDate) &&
        Objects.equals(this.scheduledDeliveryDate, orderItemAcknowledgement.scheduledDeliveryDate) &&
        Objects.equals(this.rejectionReason, orderItemAcknowledgement.rejectionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgementCode, acknowledgedQuantity, scheduledShipDate, scheduledDeliveryDate, rejectionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemAcknowledgement {\n");
    
    sb.append("    acknowledgementCode: ").append(toIndentedString(acknowledgementCode)).append("\n");
    sb.append("    acknowledgedQuantity: ").append(toIndentedString(acknowledgedQuantity)).append("\n");
    sb.append("    scheduledShipDate: ").append(toIndentedString(scheduledShipDate)).append("\n");
    sb.append("    scheduledDeliveryDate: ").append(toIndentedString(scheduledDeliveryDate)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
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

