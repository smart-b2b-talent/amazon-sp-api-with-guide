/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.aplus_content_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.aplus_content_api_model.AplusResponse;
import com.amazon.spapi.model.aplus_content_api_model.MessageSet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostContentDocumentSuspendSubmissionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:30.497+08:00")
public class PostContentDocumentSuspendSubmissionResponse extends AplusResponse {
  @SerializedName("warnings")
  private MessageSet warnings = null;

  public PostContentDocumentSuspendSubmissionResponse warnings(MessageSet warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public MessageSet getWarnings() {
    return warnings;
  }

  public void setWarnings(MessageSet warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContentDocumentSuspendSubmissionResponse postContentDocumentSuspendSubmissionResponse = (PostContentDocumentSuspendSubmissionResponse) o;
    return Objects.equals(this.warnings, postContentDocumentSuspendSubmissionResponse.warnings) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentDocumentSuspendSubmissionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

