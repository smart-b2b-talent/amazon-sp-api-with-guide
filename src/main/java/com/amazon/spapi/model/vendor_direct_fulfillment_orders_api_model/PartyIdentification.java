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
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.Address;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.TaxRegistrationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PartyIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:12:01.408+08:00")
public class PartyIdentification {
  @SerializedName("partyId")
  private String partyId = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("taxInfo")
  private TaxRegistrationDetails taxInfo = null;

  public PartyIdentification partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * Assigned identification for the party. For example, warehouse code or vendor code. Please refer to specific party for more details.
   * @return partyId
  **/
  @ApiModelProperty(required = true, value = "Assigned identification for the party. For example, warehouse code or vendor code. Please refer to specific party for more details.")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public PartyIdentification address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Address details of the party.
   * @return address
  **/
  @ApiModelProperty(value = "Address details of the party.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PartyIdentification taxInfo(TaxRegistrationDetails taxInfo) {
    this.taxInfo = taxInfo;
    return this;
  }

   /**
   * Tax registration details of the entity.
   * @return taxInfo
  **/
  @ApiModelProperty(value = "Tax registration details of the entity.")
  public TaxRegistrationDetails getTaxInfo() {
    return taxInfo;
  }

  public void setTaxInfo(TaxRegistrationDetails taxInfo) {
    this.taxInfo = taxInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentification partyIdentification = (PartyIdentification) o;
    return Objects.equals(this.partyId, partyIdentification.partyId) &&
        Objects.equals(this.address, partyIdentification.address) &&
        Objects.equals(this.taxInfo, partyIdentification.taxInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, address, taxInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentification {\n");
    
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxInfo: ").append(toIndentedString(taxInfo)).append("\n");
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

