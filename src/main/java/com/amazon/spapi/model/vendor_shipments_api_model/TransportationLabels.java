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
import com.amazon.spapi.model.vendor_shipments_api_model.Pagination;
import com.amazon.spapi.model.vendor_shipments_api_model.TransportLabel;
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
 * TransportationLabels
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:42.836+08:00")
public class TransportationLabels {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("transportLabels")
  private List<TransportLabel> transportLabels = null;

  public TransportationLabels pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public TransportationLabels transportLabels(List<TransportLabel> transportLabels) {
    this.transportLabels = transportLabels;
    return this;
  }

  public TransportationLabels addTransportLabelsItem(TransportLabel transportLabelsItem) {
    if (this.transportLabels == null) {
      this.transportLabels = new ArrayList<TransportLabel>();
    }
    this.transportLabels.add(transportLabelsItem);
    return this;
  }

   /**
   * Get transportLabels
   * @return transportLabels
  **/
  @ApiModelProperty(value = "")
  public List<TransportLabel> getTransportLabels() {
    return transportLabels;
  }

  public void setTransportLabels(List<TransportLabel> transportLabels) {
    this.transportLabels = transportLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportationLabels transportationLabels = (TransportationLabels) o;
    return Objects.equals(this.pagination, transportationLabels.pagination) &&
        Objects.equals(this.transportLabels, transportationLabels.transportLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, transportLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportationLabels {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    transportLabels: ").append(toIndentedString(transportLabels)).append("\n");
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

