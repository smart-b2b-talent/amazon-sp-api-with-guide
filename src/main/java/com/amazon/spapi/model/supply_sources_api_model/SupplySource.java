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
import com.amazon.spapi.model.supply_sources_api_model.Address;
import com.amazon.spapi.model.supply_sources_api_model.SupplySourceCapabilities;
import com.amazon.spapi.model.supply_sources_api_model.SupplySourceConfiguration;
import com.amazon.spapi.model.supply_sources_api_model.SupplySourceStatusReadOnly;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The supply source details, including configurations and capabilities.
 */
@ApiModel(description = "The supply source details, including configurations and capabilities.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:24.793+08:00")
public class SupplySource {
  @SerializedName("supplySourceId")
  private String supplySourceId = null;

  @SerializedName("supplySourceCode")
  private String supplySourceCode = null;

  @SerializedName("alias")
  private String alias = null;

  @SerializedName("status")
  private SupplySourceStatusReadOnly status = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("configuration")
  private SupplySourceConfiguration _configuration = null;

  @SerializedName("capabilities")
  private SupplySourceCapabilities capabilities = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public SupplySource supplySourceId(String supplySourceId) {
    this.supplySourceId = supplySourceId;
    return this;
  }

   /**
   * Get supplySourceId
   * @return supplySourceId
  **/
  @ApiModelProperty(value = "")
  public String getSupplySourceId() {
    return supplySourceId;
  }

  public void setSupplySourceId(String supplySourceId) {
    this.supplySourceId = supplySourceId;
  }

  public SupplySource supplySourceCode(String supplySourceCode) {
    this.supplySourceCode = supplySourceCode;
    return this;
  }

   /**
   * Get supplySourceCode
   * @return supplySourceCode
  **/
  @ApiModelProperty(value = "")
  public String getSupplySourceCode() {
    return supplySourceCode;
  }

  public void setSupplySourceCode(String supplySourceCode) {
    this.supplySourceCode = supplySourceCode;
  }

  public SupplySource alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public SupplySource status(SupplySourceStatusReadOnly status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SupplySourceStatusReadOnly getStatus() {
    return status;
  }

  public void setStatus(SupplySourceStatusReadOnly status) {
    this.status = status;
  }

  public SupplySource address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public SupplySource _configuration(SupplySourceConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public SupplySourceConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(SupplySourceConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public SupplySource capabilities(SupplySourceCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")
  public SupplySourceCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(SupplySourceCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public SupplySource createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SupplySource updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplySource supplySource = (SupplySource) o;
    return Objects.equals(this.supplySourceId, supplySource.supplySourceId) &&
        Objects.equals(this.supplySourceCode, supplySource.supplySourceCode) &&
        Objects.equals(this.alias, supplySource.alias) &&
        Objects.equals(this.status, supplySource.status) &&
        Objects.equals(this.address, supplySource.address) &&
        Objects.equals(this._configuration, supplySource._configuration) &&
        Objects.equals(this.capabilities, supplySource.capabilities) &&
        Objects.equals(this.createdAt, supplySource.createdAt) &&
        Objects.equals(this.updatedAt, supplySource.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplySourceId, supplySourceCode, alias, status, address, _configuration, capabilities, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplySource {\n");
    
    sb.append("    supplySourceId: ").append(toIndentedString(supplySourceId)).append("\n");
    sb.append("    supplySourceCode: ").append(toIndentedString(supplySourceCode)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

