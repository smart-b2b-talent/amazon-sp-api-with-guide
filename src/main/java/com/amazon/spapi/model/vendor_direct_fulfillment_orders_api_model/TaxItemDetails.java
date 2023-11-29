/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model.TaxLineItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Total tax details for the line item.
 */
@ApiModel(description = "Total tax details for the line item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:30.605+08:00")
public class TaxItemDetails {
  @SerializedName("taxLineItem")
  private TaxLineItem taxLineItem = null;

  public TaxItemDetails taxLineItem(TaxLineItem taxLineItem) {
    this.taxLineItem = taxLineItem;
    return this;
  }

   /**
   * Tax details.
   * @return taxLineItem
  **/
  @ApiModelProperty(value = "Tax details.")
  public TaxLineItem getTaxLineItem() {
    return taxLineItem;
  }

  public void setTaxLineItem(TaxLineItem taxLineItem) {
    this.taxLineItem = taxLineItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxItemDetails taxItemDetails = (TaxItemDetails) o;
    return Objects.equals(this.taxLineItem, taxItemDetails.taxLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLineItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxItemDetails {\n");
    
    sb.append("    taxLineItem: ").append(toIndentedString(taxLineItem)).append("\n");
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

