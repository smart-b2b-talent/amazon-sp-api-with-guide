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
import com.amazon.spapi.model.finances_api_model.ChargeComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An item from a SAFE-T claim reimbursement.
 */
@ApiModel(description = "An item from a SAFE-T claim reimbursement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:09.317+08:00")
public class SAFETReimbursementItem {
  @SerializedName("itemChargeList")
  private ChargeComponentList itemChargeList = null;

  @SerializedName("productDescription")
  private String productDescription = null;

  @SerializedName("quantity")
  private String quantity = null;

  public SAFETReimbursementItem itemChargeList(ChargeComponentList itemChargeList) {
    this.itemChargeList = itemChargeList;
    return this;
  }

   /**
   * A list of charges associated with the item.
   * @return itemChargeList
  **/
  @ApiModelProperty(value = "A list of charges associated with the item.")
  public ChargeComponentList getItemChargeList() {
    return itemChargeList;
  }

  public void setItemChargeList(ChargeComponentList itemChargeList) {
    this.itemChargeList = itemChargeList;
  }

  public SAFETReimbursementItem productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

   /**
   * The description of the item as shown on the product detail page on the retail website.
   * @return productDescription
  **/
  @ApiModelProperty(value = "The description of the item as shown on the product detail page on the retail website.")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public SAFETReimbursementItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the item being reimbursed.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of units of the item being reimbursed.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SAFETReimbursementItem saFETReimbursementItem = (SAFETReimbursementItem) o;
    return Objects.equals(this.itemChargeList, saFETReimbursementItem.itemChargeList) &&
        Objects.equals(this.productDescription, saFETReimbursementItem.productDescription) &&
        Objects.equals(this.quantity, saFETReimbursementItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemChargeList, productDescription, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SAFETReimbursementItem {\n");
    
    sb.append("    itemChargeList: ").append(toIndentedString(itemChargeList)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

