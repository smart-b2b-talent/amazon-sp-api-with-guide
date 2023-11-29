/*
 * Selling Partner API for Retail Procurement Payments
 * The Selling Partner API for Retail Procurement Payments provides programmatic access to vendors payments data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_invoices_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_invoices_api_model.Invoice;
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
 * The request schema for the submitInvoices operation.
 */
@ApiModel(description = "The request schema for the submitInvoices operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:12:11.950+08:00")
public class SubmitInvoicesRequest {
  @SerializedName("invoices")
  private List<Invoice> invoices = null;

  public SubmitInvoicesRequest invoices(List<Invoice> invoices) {
    this.invoices = invoices;
    return this;
  }

  public SubmitInvoicesRequest addInvoicesItem(Invoice invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<Invoice>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public List<Invoice> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<Invoice> invoices) {
    this.invoices = invoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitInvoicesRequest submitInvoicesRequest = (SubmitInvoicesRequest) o;
    return Objects.equals(this.invoices, submitInvoicesRequest.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitInvoicesRequest {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

