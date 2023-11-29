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
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.CustomerInvoice;
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.Pagination;
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
 * CustomerInvoiceList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:35.708+08:00")
public class CustomerInvoiceList {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("customerInvoices")
  private List<CustomerInvoice> customerInvoices = null;

  public CustomerInvoiceList pagination(Pagination pagination) {
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

  public CustomerInvoiceList customerInvoices(List<CustomerInvoice> customerInvoices) {
    this.customerInvoices = customerInvoices;
    return this;
  }

  public CustomerInvoiceList addCustomerInvoicesItem(CustomerInvoice customerInvoicesItem) {
    if (this.customerInvoices == null) {
      this.customerInvoices = new ArrayList<CustomerInvoice>();
    }
    this.customerInvoices.add(customerInvoicesItem);
    return this;
  }

   /**
   * Get customerInvoices
   * @return customerInvoices
  **/
  @ApiModelProperty(value = "")
  public List<CustomerInvoice> getCustomerInvoices() {
    return customerInvoices;
  }

  public void setCustomerInvoices(List<CustomerInvoice> customerInvoices) {
    this.customerInvoices = customerInvoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInvoiceList customerInvoiceList = (CustomerInvoiceList) o;
    return Objects.equals(this.pagination, customerInvoiceList.pagination) &&
        Objects.equals(this.customerInvoices, customerInvoiceList.customerInvoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, customerInvoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    customerInvoices: ").append(toIndentedString(customerInvoices)).append("\n");
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

