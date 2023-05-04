/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_outbound_api_model;

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
 * Address information for tracking the package.
 */
@ApiModel(description = "Address information for tracking the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:35.643-04:00")
public class TrackingAddress {
  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  public TrackingAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public TrackingAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public TrackingAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingAddress trackingAddress = (TrackingAddress) o;
    return Objects.equals(this.city, trackingAddress.city) &&
        Objects.equals(this.state, trackingAddress.state) &&
        Objects.equals(this.country, trackingAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

