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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BillOfLadingDownloadURL
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:51.210+08:00")
public class BillOfLadingDownloadURL {
  @SerializedName("DownloadURL")
  private String downloadURL = null;

  public BillOfLadingDownloadURL downloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
    return this;
  }

   /**
   * URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds
   * @return downloadURL
  **/
  @ApiModelProperty(value = "URL to download the bill of lading for the package. Note: The URL will only be valid for 15 seconds")
  public String getDownloadURL() {
    return downloadURL;
  }

  public void setDownloadURL(String downloadURL) {
    this.downloadURL = downloadURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillOfLadingDownloadURL billOfLadingDownloadURL = (BillOfLadingDownloadURL) o;
    return Objects.equals(this.downloadURL, billOfLadingDownloadURL.downloadURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLadingDownloadURL {\n");
    
    sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
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

