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
import com.amazon.spapi.model.replenishment_api_model.ListOffersRequestFilters;
import com.amazon.spapi.model.replenishment_api_model.ListOffersRequestPagination;
import com.amazon.spapi.model.replenishment_api_model.ListOffersRequestSort;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request body for the &#x60;listOffers&#x60; operation.
 */
@ApiModel(description = "The request body for the `listOffers` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:09.675+08:00")
public class ListOffersRequest {
  @SerializedName("pagination")
  private ListOffersRequestPagination pagination = null;

  @SerializedName("filters")
  private ListOffersRequestFilters filters = null;

  @SerializedName("sort")
  private ListOffersRequestSort sort = null;

  public ListOffersRequest pagination(ListOffersRequestPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Use these parameters to paginate through the response.
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "Use these parameters to paginate through the response.")
  public ListOffersRequestPagination getPagination() {
    return pagination;
  }

  public void setPagination(ListOffersRequestPagination pagination) {
    this.pagination = pagination;
  }

  public ListOffersRequest filters(ListOffersRequestFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Use these parameters to filter results. Any result must match all provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.
   * @return filters
  **/
  @ApiModelProperty(required = true, value = "Use these parameters to filter results. Any result must match all provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.")
  public ListOffersRequestFilters getFilters() {
    return filters;
  }

  public void setFilters(ListOffersRequestFilters filters) {
    this.filters = filters;
  }

  public ListOffersRequest sort(ListOffersRequestSort sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Use these parameters to sort the response.
   * @return sort
  **/
  @ApiModelProperty(value = "Use these parameters to sort the response.")
  public ListOffersRequestSort getSort() {
    return sort;
  }

  public void setSort(ListOffersRequestSort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOffersRequest listOffersRequest = (ListOffersRequest) o;
    return Objects.equals(this.pagination, listOffersRequest.pagination) &&
        Objects.equals(this.filters, listOffersRequest.filters) &&
        Objects.equals(this.sort, listOffersRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, filters, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOffersRequest {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

