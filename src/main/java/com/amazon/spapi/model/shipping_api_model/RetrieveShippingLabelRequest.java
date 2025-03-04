/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.   **Note:** If you are new to the Amazon Shipping API, refer to the latest version of <a href=\"https://developer-docs.amazon.com/amazon-shipping/docs/shipping-api-v2-reference\">Amazon Shipping API (v2)</a> on the <a href=\"https://developer-docs.amazon.com/amazon-shipping/\">Amazon Shipping Developer Documentation</a> site.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.shipping_api_model.LabelSpecification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for the retrieveShippingLabel operation.
 */
@ApiModel(description = "The request schema for the retrieveShippingLabel operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:20.740+08:00")
public class RetrieveShippingLabelRequest {
  @SerializedName("labelSpecification")
  private LabelSpecification labelSpecification = null;

  public RetrieveShippingLabelRequest labelSpecification(LabelSpecification labelSpecification) {
    this.labelSpecification = labelSpecification;
    return this;
  }

   /**
   * Get labelSpecification
   * @return labelSpecification
  **/
  @ApiModelProperty(required = true, value = "")
  public LabelSpecification getLabelSpecification() {
    return labelSpecification;
  }

  public void setLabelSpecification(LabelSpecification labelSpecification) {
    this.labelSpecification = labelSpecification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveShippingLabelRequest retrieveShippingLabelRequest = (RetrieveShippingLabelRequest) o;
    return Objects.equals(this.labelSpecification, retrieveShippingLabelRequest.labelSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveShippingLabelRequest {\n");
    
    sb.append("    labelSpecification: ").append(toIndentedString(labelSpecification)).append("\n");
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

