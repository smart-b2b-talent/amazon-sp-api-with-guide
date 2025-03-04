/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.replenishment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.replenishment_api_model.AutoEnrollmentPreference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Offer preferences that you can include in the result filter criteria.
 */
@ApiModel(description = "Offer preferences that you can include in the result filter criteria.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:09.675+08:00")
public class Preference {
  @SerializedName("autoEnrollment")
  private List<AutoEnrollmentPreference> autoEnrollment = null;

  public Preference autoEnrollment(List<AutoEnrollmentPreference> autoEnrollment) {
    this.autoEnrollment = autoEnrollment;
    return this;
  }

  public Preference addAutoEnrollmentItem(AutoEnrollmentPreference autoEnrollmentItem) {
    if (this.autoEnrollment == null) {
      this.autoEnrollment = new ArrayList<AutoEnrollmentPreference>();
    }
    this.autoEnrollment.add(autoEnrollmentItem);
    return this;
  }

   /**
   * Filters the results to only include offers with the auto-enrollment preference specified.
   * @return autoEnrollment
  **/
  @ApiModelProperty(value = "Filters the results to only include offers with the auto-enrollment preference specified.")
  public List<AutoEnrollmentPreference> getAutoEnrollment() {
    return autoEnrollment;
  }

  public void setAutoEnrollment(List<AutoEnrollmentPreference> autoEnrollment) {
    this.autoEnrollment = autoEnrollment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preference preference = (Preference) o;
    return Objects.equals(this.autoEnrollment, preference.autoEnrollment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoEnrollment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preference {\n");
    
    sb.append("    autoEnrollment: ").append(toIndentedString(autoEnrollment)).append("\n");
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

