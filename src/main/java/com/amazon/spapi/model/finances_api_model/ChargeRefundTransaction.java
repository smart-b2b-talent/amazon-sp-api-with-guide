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
import com.amazon.spapi.model.finances_api_model.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The charge refund transaction.
 */
@ApiModel(description = "The charge refund transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:49.128+08:00")
public class ChargeRefundTransaction {
  @SerializedName("ChargeAmount")
  private Currency chargeAmount = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  public ChargeRefundTransaction chargeAmount(Currency chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * The amount of the charge refund credit.
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "The amount of the charge refund credit.")
  public Currency getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(Currency chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public ChargeRefundTransaction chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * The type of charge.
   * @return chargeType
  **/
  @ApiModelProperty(value = "The type of charge.")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRefundTransaction chargeRefundTransaction = (ChargeRefundTransaction) o;
    return Objects.equals(this.chargeAmount, chargeRefundTransaction.chargeAmount) &&
        Objects.equals(this.chargeType, chargeRefundTransaction.chargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeAmount, chargeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRefundTransaction {\n");
    
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
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

