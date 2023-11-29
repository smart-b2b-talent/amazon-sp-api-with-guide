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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Label details as part of the transport label response
 */
@ApiModel(description = "Label details as part of the transport label response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:42.836+08:00")
public class LabelData {
  @SerializedName("labelSequenceNumber")
  private Integer labelSequenceNumber = null;

  /**
   * Type of the label format like PDF
   */
  @JsonAdapter(LabelFormatEnum.Adapter.class)
  public enum LabelFormatEnum {
    PDF("PDF");

    private String value;

    LabelFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LabelFormatEnum fromValue(String text) {
      for (LabelFormatEnum b : LabelFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LabelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LabelFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LabelFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LabelFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("labelFormat")
  private LabelFormatEnum labelFormat = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("trackingId")
  private String trackingId = null;

  @SerializedName("label")
  private String label = null;

  public LabelData labelSequenceNumber(Integer labelSequenceNumber) {
    this.labelSequenceNumber = labelSequenceNumber;
    return this;
  }

   /**
   * Label list sequence number
   * @return labelSequenceNumber
  **/
  @ApiModelProperty(value = "Label list sequence number")
  public Integer getLabelSequenceNumber() {
    return labelSequenceNumber;
  }

  public void setLabelSequenceNumber(Integer labelSequenceNumber) {
    this.labelSequenceNumber = labelSequenceNumber;
  }

  public LabelData labelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * Type of the label format like PDF
   * @return labelFormat
  **/
  @ApiModelProperty(value = "Type of the label format like PDF")
  public LabelFormatEnum getLabelFormat() {
    return labelFormat;
  }

  public void setLabelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
  }

  public LabelData carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Unique identification for  the carrier like UPS,DHL,USPS..etc
   * @return carrierCode
  **/
  @ApiModelProperty(value = "Unique identification for  the carrier like UPS,DHL,USPS..etc")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public LabelData trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Tracking Id for the transportation.
   * @return trackingId
  **/
  @ApiModelProperty(value = "Tracking Id for the transportation.")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public LabelData label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label created as part of the transportation and it is base64 encoded
   * @return label
  **/
  @ApiModelProperty(value = "Label created as part of the transportation and it is base64 encoded")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelData labelData = (LabelData) o;
    return Objects.equals(this.labelSequenceNumber, labelData.labelSequenceNumber) &&
        Objects.equals(this.labelFormat, labelData.labelFormat) &&
        Objects.equals(this.carrierCode, labelData.carrierCode) &&
        Objects.equals(this.trackingId, labelData.trackingId) &&
        Objects.equals(this.label, labelData.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSequenceNumber, labelFormat, carrierCode, trackingId, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelData {\n");
    
    sb.append("    labelSequenceNumber: ").append(toIndentedString(labelSequenceNumber)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

