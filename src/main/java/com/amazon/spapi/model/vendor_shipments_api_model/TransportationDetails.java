/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_shipments_api_model.CarrierDetails;
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
 * TransportationDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:53:12.211+08:00")
public class TransportationDetails {
  /**
   * The type of shipment.
   */
  @JsonAdapter(ShipModeEnum.Adapter.class)
  public enum ShipModeEnum {
    TRUCKLOAD("TruckLoad"),
    
    LESSTHANTRUCKLOAD("LessThanTruckLoad"),
    
    SMALLPARCEL("SmallParcel");

    private String value;

    ShipModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShipModeEnum fromValue(String text) {
      for (ShipModeEnum b : ShipModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShipModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShipModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShipModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShipModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("shipMode")
  private ShipModeEnum shipMode = null;

  /**
   * The mode of transportation for this shipment.
   */
  @JsonAdapter(TransportationModeEnum.Adapter.class)
  public enum TransportationModeEnum {
    ROAD("Road"),
    
    AIR("Air"),
    
    OCEAN("Ocean");

    private String value;

    TransportationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportationModeEnum fromValue(String text) {
      for (TransportationModeEnum b : TransportationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransportationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransportationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transportationMode")
  private TransportationModeEnum transportationMode = null;

  @SerializedName("shippedDate")
  private OffsetDateTime shippedDate = null;

  @SerializedName("estimatedDeliveryDate")
  private OffsetDateTime estimatedDeliveryDate = null;

  @SerializedName("shipmentDeliveryDate")
  private OffsetDateTime shipmentDeliveryDate = null;

  @SerializedName("carrierDetails")
  private CarrierDetails carrierDetails = null;

  @SerializedName("billOfLadingNumber")
  private String billOfLadingNumber = null;

  public TransportationDetails shipMode(ShipModeEnum shipMode) {
    this.shipMode = shipMode;
    return this;
  }

   /**
   * The type of shipment.
   * @return shipMode
  **/
  @ApiModelProperty(value = "The type of shipment.")
  public ShipModeEnum getShipMode() {
    return shipMode;
  }

  public void setShipMode(ShipModeEnum shipMode) {
    this.shipMode = shipMode;
  }

  public TransportationDetails transportationMode(TransportationModeEnum transportationMode) {
    this.transportationMode = transportationMode;
    return this;
  }

   /**
   * The mode of transportation for this shipment.
   * @return transportationMode
  **/
  @ApiModelProperty(value = "The mode of transportation for this shipment.")
  public TransportationModeEnum getTransportationMode() {
    return transportationMode;
  }

  public void setTransportationMode(TransportationModeEnum transportationMode) {
    this.transportationMode = transportationMode;
  }

  public TransportationDetails shippedDate(OffsetDateTime shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * Date when shipment is performed by the Vendor to Buyer
   * @return shippedDate
  **/
  @ApiModelProperty(value = "Date when shipment is performed by the Vendor to Buyer")
  public OffsetDateTime getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(OffsetDateTime shippedDate) {
    this.shippedDate = shippedDate;
  }

  public TransportationDetails estimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * Estimated Date on which shipment will be delivered from Vendor to Buyer
   * @return estimatedDeliveryDate
  **/
  @ApiModelProperty(value = "Estimated Date on which shipment will be delivered from Vendor to Buyer")
  public OffsetDateTime getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }

  public TransportationDetails shipmentDeliveryDate(OffsetDateTime shipmentDeliveryDate) {
    this.shipmentDeliveryDate = shipmentDeliveryDate;
    return this;
  }

   /**
   * Date on which shipment will be delivered from Vendor to Buyer
   * @return shipmentDeliveryDate
  **/
  @ApiModelProperty(value = "Date on which shipment will be delivered from Vendor to Buyer")
  public OffsetDateTime getShipmentDeliveryDate() {
    return shipmentDeliveryDate;
  }

  public void setShipmentDeliveryDate(OffsetDateTime shipmentDeliveryDate) {
    this.shipmentDeliveryDate = shipmentDeliveryDate;
  }

  public TransportationDetails carrierDetails(CarrierDetails carrierDetails) {
    this.carrierDetails = carrierDetails;
    return this;
  }

   /**
   * Indicates the carrier details and their contact informations
   * @return carrierDetails
  **/
  @ApiModelProperty(value = "Indicates the carrier details and their contact informations")
  public CarrierDetails getCarrierDetails() {
    return carrierDetails;
  }

  public void setCarrierDetails(CarrierDetails carrierDetails) {
    this.carrierDetails = carrierDetails;
  }

  public TransportationDetails billOfLadingNumber(String billOfLadingNumber) {
    this.billOfLadingNumber = billOfLadingNumber;
    return this;
  }

   /**
   * Bill Of Lading (BOL) number is the unique number assigned by the vendor. The BOL present in the Shipment Confirmation message ideally matches the paper BOL provided with the shipment, but that is no must. Instead of BOL, an alternative reference number (like Delivery Note Number) for the shipment can also be sent in this field.
   * @return billOfLadingNumber
  **/
  @ApiModelProperty(value = "Bill Of Lading (BOL) number is the unique number assigned by the vendor. The BOL present in the Shipment Confirmation message ideally matches the paper BOL provided with the shipment, but that is no must. Instead of BOL, an alternative reference number (like Delivery Note Number) for the shipment can also be sent in this field.")
  public String getBillOfLadingNumber() {
    return billOfLadingNumber;
  }

  public void setBillOfLadingNumber(String billOfLadingNumber) {
    this.billOfLadingNumber = billOfLadingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportationDetails transportationDetails = (TransportationDetails) o;
    return Objects.equals(this.shipMode, transportationDetails.shipMode) &&
        Objects.equals(this.transportationMode, transportationDetails.transportationMode) &&
        Objects.equals(this.shippedDate, transportationDetails.shippedDate) &&
        Objects.equals(this.estimatedDeliveryDate, transportationDetails.estimatedDeliveryDate) &&
        Objects.equals(this.shipmentDeliveryDate, transportationDetails.shipmentDeliveryDate) &&
        Objects.equals(this.carrierDetails, transportationDetails.carrierDetails) &&
        Objects.equals(this.billOfLadingNumber, transportationDetails.billOfLadingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipMode, transportationMode, shippedDate, estimatedDeliveryDate, shipmentDeliveryDate, carrierDetails, billOfLadingNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportationDetails {\n");
    
    sb.append("    shipMode: ").append(toIndentedString(shipMode)).append("\n");
    sb.append("    transportationMode: ").append(toIndentedString(transportationMode)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    shipmentDeliveryDate: ").append(toIndentedString(shipmentDeliveryDate)).append("\n");
    sb.append("    carrierDetails: ").append(toIndentedString(carrierDetails)).append("\n");
    sb.append("    billOfLadingNumber: ").append(toIndentedString(billOfLadingNumber)).append("\n");
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

