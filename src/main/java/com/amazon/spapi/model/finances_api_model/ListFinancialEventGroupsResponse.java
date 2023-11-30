/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances_api_model.ErrorList;
import com.amazon.spapi.model.finances_api_model.ListFinancialEventGroupsPayload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the listFinancialEventGroups operation.
 */
@ApiModel(description = "The response schema for the listFinancialEventGroups operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:21.148+08:00")
public class ListFinancialEventGroupsResponse {
  @SerializedName("payload")
  private ListFinancialEventGroupsPayload payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public ListFinancialEventGroupsResponse payload(ListFinancialEventGroupsPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the listFinancialEventGroups operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the listFinancialEventGroups operation.")
  public ListFinancialEventGroupsPayload getPayload() {
    return payload;
  }

  public void setPayload(ListFinancialEventGroupsPayload payload) {
    this.payload = payload;
  }

  public ListFinancialEventGroupsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the listFinancialEventGroups operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the listFinancialEventGroups operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFinancialEventGroupsResponse listFinancialEventGroupsResponse = (ListFinancialEventGroupsResponse) o;
    return Objects.equals(this.payload, listFinancialEventGroupsResponse.payload) &&
        Objects.equals(this.errors, listFinancialEventGroupsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFinancialEventGroupsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

