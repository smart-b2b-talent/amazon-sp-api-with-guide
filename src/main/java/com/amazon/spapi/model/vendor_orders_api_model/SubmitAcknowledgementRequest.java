/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_orders_api_model.OrderAcknowledgement;
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
 * The request schema for the submitAcknowledgment operation.
 */
@ApiModel(description = "The request schema for the submitAcknowledgment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:36.873-04:00")
public class SubmitAcknowledgementRequest {
  @SerializedName("acknowledgements")
  private List<OrderAcknowledgement> acknowledgements = null;

  public SubmitAcknowledgementRequest acknowledgements(List<OrderAcknowledgement> acknowledgements) {
    this.acknowledgements = acknowledgements;
    return this;
  }

  public SubmitAcknowledgementRequest addAcknowledgementsItem(OrderAcknowledgement acknowledgementsItem) {
    if (this.acknowledgements == null) {
      this.acknowledgements = new ArrayList<OrderAcknowledgement>();
    }
    this.acknowledgements.add(acknowledgementsItem);
    return this;
  }

   /**
   * Get acknowledgements
   * @return acknowledgements
  **/
  @ApiModelProperty(value = "")
  public List<OrderAcknowledgement> getAcknowledgements() {
    return acknowledgements;
  }

  public void setAcknowledgements(List<OrderAcknowledgement> acknowledgements) {
    this.acknowledgements = acknowledgements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitAcknowledgementRequest submitAcknowledgementRequest = (SubmitAcknowledgementRequest) o;
    return Objects.equals(this.acknowledgements, submitAcknowledgementRequest.acknowledgements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitAcknowledgementRequest {\n");
    
    sb.append("    acknowledgements: ").append(toIndentedString(acknowledgements)).append("\n");
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

