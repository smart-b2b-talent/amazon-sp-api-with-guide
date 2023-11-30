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
 * A payment made directly to a seller.
 */
@ApiModel(description = "A payment made directly to a seller.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:21.148+08:00")
public class DirectPayment {
  @SerializedName("DirectPaymentType")
  private String directPaymentType = null;

  @SerializedName("DirectPaymentAmount")
  private Currency directPaymentAmount = null;

  public DirectPayment directPaymentType(String directPaymentType) {
    this.directPaymentType = directPaymentType;
    return this;
  }

   /**
   * The type of payment.  Possible values:  * StoredValueCardRevenue - The amount that is deducted from the seller&#39;s account because the seller received money through a stored value card.  * StoredValueCardRefund - The amount that Amazon returns to the seller if the order that is bought using a stored value card is refunded.  * PrivateLabelCreditCardRevenue - The amount that is deducted from the seller&#39;s account because the seller received money through a private label credit card offered by Amazon.  * PrivateLabelCreditCardRefund - The amount that Amazon returns to the seller if the order that is bought using a private label credit card offered by Amazon is refunded.  * CollectOnDeliveryRevenue - The COD amount that the seller collected directly from the buyer.  * CollectOnDeliveryRefund - The amount that Amazon refunds to the buyer if an order paid for by COD is refunded.
   * @return directPaymentType
  **/
  @ApiModelProperty(value = "The type of payment.  Possible values:  * StoredValueCardRevenue - The amount that is deducted from the seller's account because the seller received money through a stored value card.  * StoredValueCardRefund - The amount that Amazon returns to the seller if the order that is bought using a stored value card is refunded.  * PrivateLabelCreditCardRevenue - The amount that is deducted from the seller's account because the seller received money through a private label credit card offered by Amazon.  * PrivateLabelCreditCardRefund - The amount that Amazon returns to the seller if the order that is bought using a private label credit card offered by Amazon is refunded.  * CollectOnDeliveryRevenue - The COD amount that the seller collected directly from the buyer.  * CollectOnDeliveryRefund - The amount that Amazon refunds to the buyer if an order paid for by COD is refunded.")
  public String getDirectPaymentType() {
    return directPaymentType;
  }

  public void setDirectPaymentType(String directPaymentType) {
    this.directPaymentType = directPaymentType;
  }

  public DirectPayment directPaymentAmount(Currency directPaymentAmount) {
    this.directPaymentAmount = directPaymentAmount;
    return this;
  }

   /**
   * The amount of the direct payment.
   * @return directPaymentAmount
  **/
  @ApiModelProperty(value = "The amount of the direct payment.")
  public Currency getDirectPaymentAmount() {
    return directPaymentAmount;
  }

  public void setDirectPaymentAmount(Currency directPaymentAmount) {
    this.directPaymentAmount = directPaymentAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectPayment directPayment = (DirectPayment) o;
    return Objects.equals(this.directPaymentType, directPayment.directPaymentType) &&
        Objects.equals(this.directPaymentAmount, directPayment.directPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directPaymentType, directPaymentAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectPayment {\n");
    
    sb.append("    directPaymentType: ").append(toIndentedString(directPaymentType)).append("\n");
    sb.append("    directPaymentAmount: ").append(toIndentedString(directPaymentAmount)).append("\n");
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

