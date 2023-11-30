/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model;

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
 * Address of the party.
 */
@ApiModel(description = "Address of the party.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:53:06.148+08:00")
public class Address {
  @SerializedName("name")
  private String name = null;

  @SerializedName("addressLine1")
  private String addressLine1 = null;

  @SerializedName("addressLine2")
  private String addressLine2 = null;

  @SerializedName("addressLine3")
  private String addressLine3 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("county")
  private String county = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("stateOrRegion")
  private String stateOrRegion = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("phone")
  private String phone = null;

  public Address name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the person, business or institution at that address.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the person, business or institution at that address.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * First line of the address.
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "First line of the address.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Additional street address information, if required.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Additional street address information, if required.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Additional street address information, if required.
   * @return addressLine3
  **/
  @ApiModelProperty(value = "Additional street address information, if required.")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city where the person, business or institution is located.
   * @return city
  **/
  @ApiModelProperty(value = "The city where the person, business or institution is located.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address county(String county) {
    this.county = county;
    return this;
  }

   /**
   * The county where person, business or institution is located.
   * @return county
  **/
  @ApiModelProperty(value = "The county where person, business or institution is located.")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Address district(String district) {
    this.district = district;
    return this;
  }

   /**
   * The district where person, business or institution is located.
   * @return district
  **/
  @ApiModelProperty(value = "The district where person, business or institution is located.")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Address stateOrRegion(String stateOrRegion) {
    this.stateOrRegion = stateOrRegion;
    return this;
  }

   /**
   * The state or region where person, business or institution is located.
   * @return stateOrRegion
  **/
  @ApiModelProperty(value = "The state or region where person, business or institution is located.")
  public String getStateOrRegion() {
    return stateOrRegion;
  }

  public void setStateOrRegion(String stateOrRegion) {
    this.stateOrRegion = stateOrRegion;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of that address. It contains a series of letters or digits or both, sometimes including spaces or punctuation.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code of that address. It contains a series of letters or digits or both, sometimes including spaces or punctuation.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two digit country code in ISO 3166-1 alpha-2 format.
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "The two digit country code in ISO 3166-1 alpha-2 format.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the person, business or institution located at that address.
   * @return phone
  **/
  @ApiModelProperty(value = "The phone number of the person, business or institution located at that address.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.name, address.name) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressLine3, address.addressLine3) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.county, address.county) &&
        Objects.equals(this.district, address.district) &&
        Objects.equals(this.stateOrRegion, address.stateOrRegion) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.phone, address.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addressLine1, addressLine2, addressLine3, city, county, district, stateOrRegion, postalCode, countryCode, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    stateOrRegion: ").append(toIndentedString(stateOrRegion)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

