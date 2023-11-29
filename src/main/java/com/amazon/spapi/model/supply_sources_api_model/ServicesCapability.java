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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The services capability of a supply source.
 */
@ApiModel(description = "The services capability of a supply source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:24.793+08:00")
public class ServicesCapability {
  @SerializedName("isSupported")
  private Boolean isSupported = null;

  @SerializedName("operationalConfiguration")
  private OperationalConfiguration operationalConfiguration = null;

  public ServicesCapability isSupported(Boolean isSupported) {
    this.isSupported = isSupported;
    return this;
  }

   /**
   * When true, &#x60;SupplySource&#x60; supports the Service capability.
   * @return isSupported
  **/
  @ApiModelProperty(value = "When true, `SupplySource` supports the Service capability.")
  public Boolean isIsSupported() {
    return isSupported;
  }

  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  public ServicesCapability operationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
    return this;
  }

   /**
   * Get operationalConfiguration
   * @return operationalConfiguration
  **/
  @ApiModelProperty(value = "")
  public OperationalConfiguration getOperationalConfiguration() {
    return operationalConfiguration;
  }

  public void setOperationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesCapability servicesCapability = (ServicesCapability) o;
    return Objects.equals(this.isSupported, servicesCapability.isSupported) &&
        Objects.equals(this.operationalConfiguration, servicesCapability.operationalConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSupported, operationalConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesCapability {\n");
    
    sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
    sb.append("    operationalConfiguration: ").append(toIndentedString(operationalConfiguration)).append("\n");
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

