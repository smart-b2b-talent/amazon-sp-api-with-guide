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
import com.amazon.spapi.model.replenishment_api_model.AggregationFrequency;
import com.amazon.spapi.model.replenishment_api_model.Metric;
import com.amazon.spapi.model.replenishment_api_model.ProgramTypes;
import com.amazon.spapi.model.replenishment_api_model.TimeInterval;
import com.amazon.spapi.model.replenishment_api_model.TimePeriodType;
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
 * The request body for the &#x60;getSellingPartnerMetrics&#x60; operation.
 */
@ApiModel(description = "The request body for the `getSellingPartnerMetrics` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:09.675+08:00")
public class GetSellingPartnerMetricsRequest {
  @SerializedName("aggregationFrequency")
  private AggregationFrequency aggregationFrequency = null;

  @SerializedName("timeInterval")
  private TimeInterval timeInterval = null;

  @SerializedName("metrics")
  private List<Metric> metrics = null;

  @SerializedName("timePeriodType")
  private TimePeriodType timePeriodType = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("programTypes")
  private ProgramTypes programTypes = null;

  public GetSellingPartnerMetricsRequest aggregationFrequency(AggregationFrequency aggregationFrequency) {
    this.aggregationFrequency = aggregationFrequency;
    return this;
  }

   /**
   * Get aggregationFrequency
   * @return aggregationFrequency
  **/
  @ApiModelProperty(value = "")
  public AggregationFrequency getAggregationFrequency() {
    return aggregationFrequency;
  }

  public void setAggregationFrequency(AggregationFrequency aggregationFrequency) {
    this.aggregationFrequency = aggregationFrequency;
  }

  public GetSellingPartnerMetricsRequest timeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * A time interval used to compute metrics.
   * @return timeInterval
  **/
  @ApiModelProperty(required = true, value = "A time interval used to compute metrics.")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  public GetSellingPartnerMetricsRequest metrics(List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public GetSellingPartnerMetricsRequest addMetricsItem(Metric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<Metric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * The list of metrics requested. If no metric value is provided, data for all of the metrics will be returned.
   * @return metrics
  **/
  @ApiModelProperty(value = "The list of metrics requested. If no metric value is provided, data for all of the metrics will be returned.")
  public List<Metric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
  }

  public GetSellingPartnerMetricsRequest timePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
    return this;
  }

   /**
   * Get timePeriodType
   * @return timePeriodType
  **/
  @ApiModelProperty(required = true, value = "")
  public TimePeriodType getTimePeriodType() {
    return timePeriodType;
  }

  public void setTimePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
  }

  public GetSellingPartnerMetricsRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public GetSellingPartnerMetricsRequest programTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
    return this;
  }

   /**
   * The list of replenishment program types for which to return metrics.
   * @return programTypes
  **/
  @ApiModelProperty(required = true, value = "The list of replenishment program types for which to return metrics.")
  public ProgramTypes getProgramTypes() {
    return programTypes;
  }

  public void setProgramTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSellingPartnerMetricsRequest getSellingPartnerMetricsRequest = (GetSellingPartnerMetricsRequest) o;
    return Objects.equals(this.aggregationFrequency, getSellingPartnerMetricsRequest.aggregationFrequency) &&
        Objects.equals(this.timeInterval, getSellingPartnerMetricsRequest.timeInterval) &&
        Objects.equals(this.metrics, getSellingPartnerMetricsRequest.metrics) &&
        Objects.equals(this.timePeriodType, getSellingPartnerMetricsRequest.timePeriodType) &&
        Objects.equals(this.marketplaceId, getSellingPartnerMetricsRequest.marketplaceId) &&
        Objects.equals(this.programTypes, getSellingPartnerMetricsRequest.programTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationFrequency, timeInterval, metrics, timePeriodType, marketplaceId, programTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSellingPartnerMetricsRequest {\n");
    
    sb.append("    aggregationFrequency: ").append(toIndentedString(aggregationFrequency)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    timePeriodType: ").append(toIndentedString(timePeriodType)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    programTypes: ").append(toIndentedString(programTypes)).append("\n");
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

