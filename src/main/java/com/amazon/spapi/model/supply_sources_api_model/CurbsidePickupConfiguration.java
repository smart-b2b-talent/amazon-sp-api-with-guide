/*
 * Selling Partner API for Supply Sources
 * Manage configurations and capabilities of seller supply sources.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.supply_sources_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.supply_sources_api_model.OperationalConfiguration;
import com.amazon.spapi.model.supply_sources_api_model.ParkingWithAddressConfiguration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The curbside pickup configuration of a supply source.
 */
@ApiModel(description = "The curbside pickup configuration of a supply source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:24.793+08:00")
public class CurbsidePickupConfiguration {
  @SerializedName("isSupported")
  private Boolean isSupported = null;

  @SerializedName("operationalConfiguration")
  private OperationalConfiguration operationalConfiguration = null;

  @SerializedName("parkingWithAddressConfiguration")
  private ParkingWithAddressConfiguration parkingWithAddressConfiguration = null;

  public CurbsidePickupConfiguration isSupported(Boolean isSupported) {
    this.isSupported = isSupported;
    return this;
  }

   /**
   * When true, curbside pickup is supported by the supply source.
   * @return isSupported
  **/
  @ApiModelProperty(value = "When true, curbside pickup is supported by the supply source.")
  public Boolean isIsSupported() {
    return isSupported;
  }

  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  public CurbsidePickupConfiguration operationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
    return this;
  }

   /**
   * The operational configuration for the curbside pickup configuration.
   * @return operationalConfiguration
  **/
  @ApiModelProperty(value = "The operational configuration for the curbside pickup configuration.")
  public OperationalConfiguration getOperationalConfiguration() {
    return operationalConfiguration;
  }

  public void setOperationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
  }

  public CurbsidePickupConfiguration parkingWithAddressConfiguration(ParkingWithAddressConfiguration parkingWithAddressConfiguration) {
    this.parkingWithAddressConfiguration = parkingWithAddressConfiguration;
    return this;
  }

   /**
   * The parking configuration for curbside pickup with address for customers to use.
   * @return parkingWithAddressConfiguration
  **/
  @ApiModelProperty(value = "The parking configuration for curbside pickup with address for customers to use.")
  public ParkingWithAddressConfiguration getParkingWithAddressConfiguration() {
    return parkingWithAddressConfiguration;
  }

  public void setParkingWithAddressConfiguration(ParkingWithAddressConfiguration parkingWithAddressConfiguration) {
    this.parkingWithAddressConfiguration = parkingWithAddressConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurbsidePickupConfiguration curbsidePickupConfiguration = (CurbsidePickupConfiguration) o;
    return Objects.equals(this.isSupported, curbsidePickupConfiguration.isSupported) &&
        Objects.equals(this.operationalConfiguration, curbsidePickupConfiguration.operationalConfiguration) &&
        Objects.equals(this.parkingWithAddressConfiguration, curbsidePickupConfiguration.parkingWithAddressConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSupported, operationalConfiguration, parkingWithAddressConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurbsidePickupConfiguration {\n");
    
    sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
    sb.append("    operationalConfiguration: ").append(toIndentedString(operationalConfiguration)).append("\n");
    sb.append("    parkingWithAddressConfiguration: ").append(toIndentedString(parkingWithAddressConfiguration)).append("\n");
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

