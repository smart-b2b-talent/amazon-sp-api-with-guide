/*
 * Selling Partner API for Tokens 
 * The Selling Partner API for Tokens provides a secure way to access a customer's PII (Personally Identifiable Information). You can call the Tokens API to get a Restricted Data Token (RDT) for one or more restricted resources that you specify. The RDT authorizes subsequent calls to restricted operations that correspond to the restricted resources that you specified.  For more information, see the [Tokens API Use Case Guide](doc:tokens-api-use-case-guide).
 *
 * OpenAPI spec version: 2021-03-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.tokens_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.tokens_api_model.RestrictedResource;
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
 * The request schema for the createRestrictedDataToken operation.
 */
@ApiModel(description = "The request schema for the createRestrictedDataToken operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:53.425+08:00")
public class CreateRestrictedDataTokenRequest {
  @SerializedName("targetApplication")
  private String targetApplication = null;

  @SerializedName("restrictedResources")
  private List<RestrictedResource> restrictedResources = new ArrayList<RestrictedResource>();

  public CreateRestrictedDataTokenRequest targetApplication(String targetApplication) {
    this.targetApplication = targetApplication;
    return this;
  }

   /**
   * The application ID for the target application to which access is being delegated.
   * @return targetApplication
  **/
  @ApiModelProperty(value = "The application ID for the target application to which access is being delegated.")
  public String getTargetApplication() {
    return targetApplication;
  }

  public void setTargetApplication(String targetApplication) {
    this.targetApplication = targetApplication;
  }

  public CreateRestrictedDataTokenRequest restrictedResources(List<RestrictedResource> restrictedResources) {
    this.restrictedResources = restrictedResources;
    return this;
  }

  public CreateRestrictedDataTokenRequest addRestrictedResourcesItem(RestrictedResource restrictedResourcesItem) {
    this.restrictedResources.add(restrictedResourcesItem);
    return this;
  }

   /**
   * A list of restricted resources. Maximum: 50
   * @return restrictedResources
  **/
  @ApiModelProperty(required = true, value = "A list of restricted resources. Maximum: 50")
  public List<RestrictedResource> getRestrictedResources() {
    return restrictedResources;
  }

  public void setRestrictedResources(List<RestrictedResource> restrictedResources) {
    this.restrictedResources = restrictedResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRestrictedDataTokenRequest createRestrictedDataTokenRequest = (CreateRestrictedDataTokenRequest) o;
    return Objects.equals(this.targetApplication, createRestrictedDataTokenRequest.targetApplication) &&
        Objects.equals(this.restrictedResources, createRestrictedDataTokenRequest.restrictedResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetApplication, restrictedResources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRestrictedDataTokenRequest {\n");
    
    sb.append("    targetApplication: ").append(toIndentedString(targetApplication)).append("\n");
    sb.append("    restrictedResources: ").append(toIndentedString(restrictedResources)).append("\n");
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

