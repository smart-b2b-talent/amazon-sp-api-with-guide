/*
 * Selling Partner API for Solicitations
 * With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.solicitations_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.solicitations_api_model.ErrorList;
import com.amazon.spapi.model.solicitations_api_model.GetSolicitationActionsForOrderResponseEmbedded;
import com.amazon.spapi.model.solicitations_api_model.GetSolicitationActionsForOrderResponseLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getSolicitationActionsForOrder operation.
 */
@ApiModel(description = "The response schema for the getSolicitationActionsForOrder operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:39.730-04:00")
public class GetSolicitationActionsForOrderResponse {
  @SerializedName("_links")
  private GetSolicitationActionsForOrderResponseLinks links = null;

  @SerializedName("_embedded")
  private GetSolicitationActionsForOrderResponseEmbedded embedded = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetSolicitationActionsForOrderResponse links(GetSolicitationActionsForOrderResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GetSolicitationActionsForOrderResponseLinks getLinks() {
    return links;
  }

  public void setLinks(GetSolicitationActionsForOrderResponseLinks links) {
    this.links = links;
  }

  public GetSolicitationActionsForOrderResponse embedded(GetSolicitationActionsForOrderResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public GetSolicitationActionsForOrderResponseEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(GetSolicitationActionsForOrderResponseEmbedded embedded) {
    this.embedded = embedded;
  }

  public GetSolicitationActionsForOrderResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSolicitationActionsForOrderResponse getSolicitationActionsForOrderResponse = (GetSolicitationActionsForOrderResponse) o;
    return Objects.equals(this.links, getSolicitationActionsForOrderResponse.links) &&
        Objects.equals(this.embedded, getSolicitationActionsForOrderResponse.embedded) &&
        Objects.equals(this.errors, getSolicitationActionsForOrderResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, embedded, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSolicitationActionsForOrderResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

