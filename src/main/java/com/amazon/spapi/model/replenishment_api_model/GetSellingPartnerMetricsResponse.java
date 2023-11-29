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
import com.amazon.spapi.model.replenishment_api_model.GetSellingPartnerMetricsResponseMetric;
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
 * The response schema for the &#x60;getSellingPartnerMetrics&#x60; operation.
 */
@ApiModel(description = "The response schema for the `getSellingPartnerMetrics` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:32.279+08:00")
public class GetSellingPartnerMetricsResponse {
  @SerializedName("metrics")
  private List<GetSellingPartnerMetricsResponseMetric> metrics = null;

  public GetSellingPartnerMetricsResponse metrics(List<GetSellingPartnerMetricsResponseMetric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public GetSellingPartnerMetricsResponse addMetricsItem(GetSellingPartnerMetricsResponseMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<GetSellingPartnerMetricsResponseMetric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * A list of metrics data for the selling partner.
   * @return metrics
  **/
  @ApiModelProperty(value = "A list of metrics data for the selling partner.")
  public List<GetSellingPartnerMetricsResponseMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<GetSellingPartnerMetricsResponseMetric> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSellingPartnerMetricsResponse getSellingPartnerMetricsResponse = (GetSellingPartnerMetricsResponse) o;
    return Objects.equals(this.metrics, getSellingPartnerMetricsResponse.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSellingPartnerMetricsResponse {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

