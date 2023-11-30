/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.ErrorReason;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InvalidASIN
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:24.487+08:00")
public class InvalidASIN {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("ErrorReason")
  private ErrorReason errorReason = null;

  public InvalidASIN ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public InvalidASIN errorReason(ErrorReason errorReason) {
    this.errorReason = errorReason;
    return this;
  }

   /**
   * The reason that the ASIN is invalid.
   * @return errorReason
  **/
  @ApiModelProperty(value = "The reason that the ASIN is invalid.")
  public ErrorReason getErrorReason() {
    return errorReason;
  }

  public void setErrorReason(ErrorReason errorReason) {
    this.errorReason = errorReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidASIN invalidASIN = (InvalidASIN) o;
    return Objects.equals(this.ASIN, invalidASIN.ASIN) &&
        Objects.equals(this.errorReason, invalidASIN.errorReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, errorReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidASIN {\n");
    
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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

