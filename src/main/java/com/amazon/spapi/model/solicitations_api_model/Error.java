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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Error response returned when the request is unsuccessful.
 */
@ApiModel(description = "Error response returned when the request is unsuccessful.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:39.730-04:00")
public class Error {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private String details = null;

  public Error code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An error code that identifies the type of error that occurred.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "An error code that identifies the type of error that occurred.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message that describes the error condition in a human-readable form.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A message that describes the error condition in a human-readable form.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Additional details that can help the caller understand or fix the issue.
   * @return details
  **/
  @ApiModelProperty(value = "Additional details that can help the caller understand or fix the issue.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

