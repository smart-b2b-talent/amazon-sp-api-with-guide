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
import com.amazon.spapi.model.vendor_shipments_api_model.Duration;
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
 * Expiry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:42.836+08:00")
public class Expiry {
  @SerializedName("manufacturerDate")
  private OffsetDateTime manufacturerDate = null;

  @SerializedName("expiryDate")
  private OffsetDateTime expiryDate = null;

  @SerializedName("expiryAfterDuration")
  private Duration expiryAfterDuration = null;

  public Expiry manufacturerDate(OffsetDateTime manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
    return this;
  }

   /**
   * Production, packaging or assembly date determined by the manufacturer. Its meaning is determined based on the trade item context.
   * @return manufacturerDate
  **/
  @ApiModelProperty(value = "Production, packaging or assembly date determined by the manufacturer. Its meaning is determined based on the trade item context.")
  public OffsetDateTime getManufacturerDate() {
    return manufacturerDate;
  }

  public void setManufacturerDate(OffsetDateTime manufacturerDate) {
    this.manufacturerDate = manufacturerDate;
  }

  public Expiry expiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The date that determines the limit of consumption or use of a product. Its meaning is determined based on the trade item context.
   * @return expiryDate
  **/
  @ApiModelProperty(value = "The date that determines the limit of consumption or use of a product. Its meaning is determined based on the trade item context.")
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Expiry expiryAfterDuration(Duration expiryAfterDuration) {
    this.expiryAfterDuration = expiryAfterDuration;
    return this;
  }

   /**
   * Duration after manufacturing date during which the product is valid for consumption.
   * @return expiryAfterDuration
  **/
  @ApiModelProperty(value = "Duration after manufacturing date during which the product is valid for consumption.")
  public Duration getExpiryAfterDuration() {
    return expiryAfterDuration;
  }

  public void setExpiryAfterDuration(Duration expiryAfterDuration) {
    this.expiryAfterDuration = expiryAfterDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expiry expiry = (Expiry) o;
    return Objects.equals(this.manufacturerDate, expiry.manufacturerDate) &&
        Objects.equals(this.expiryDate, expiry.expiryDate) &&
        Objects.equals(this.expiryAfterDuration, expiry.expiryAfterDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturerDate, expiryDate, expiryAfterDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expiry {\n");
    
    sb.append("    manufacturerDate: ").append(toIndentedString(manufacturerDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    expiryAfterDuration: ").append(toIndentedString(expiryAfterDuration)).append("\n");
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

