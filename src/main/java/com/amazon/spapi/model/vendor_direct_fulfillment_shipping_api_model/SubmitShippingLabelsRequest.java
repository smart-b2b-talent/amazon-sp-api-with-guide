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
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.ShippingLabelRequest;
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
 * SubmitShippingLabelsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:53:06.148+08:00")
public class SubmitShippingLabelsRequest {
  @SerializedName("shippingLabelRequests")
  private List<ShippingLabelRequest> shippingLabelRequests = null;

  public SubmitShippingLabelsRequest shippingLabelRequests(List<ShippingLabelRequest> shippingLabelRequests) {
    this.shippingLabelRequests = shippingLabelRequests;
    return this;
  }

  public SubmitShippingLabelsRequest addShippingLabelRequestsItem(ShippingLabelRequest shippingLabelRequestsItem) {
    if (this.shippingLabelRequests == null) {
      this.shippingLabelRequests = new ArrayList<ShippingLabelRequest>();
    }
    this.shippingLabelRequests.add(shippingLabelRequestsItem);
    return this;
  }

   /**
   * Get shippingLabelRequests
   * @return shippingLabelRequests
  **/
  @ApiModelProperty(value = "")
  public List<ShippingLabelRequest> getShippingLabelRequests() {
    return shippingLabelRequests;
  }

  public void setShippingLabelRequests(List<ShippingLabelRequest> shippingLabelRequests) {
    this.shippingLabelRequests = shippingLabelRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitShippingLabelsRequest submitShippingLabelsRequest = (SubmitShippingLabelsRequest) o;
    return Objects.equals(this.shippingLabelRequests, submitShippingLabelsRequest.shippingLabelRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingLabelRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShippingLabelsRequest {\n");
    
    sb.append("    shippingLabelRequests: ").append(toIndentedString(shippingLabelRequests)).append("\n");
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

