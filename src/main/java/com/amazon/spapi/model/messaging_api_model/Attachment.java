/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.messaging_api_model;

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
 * Represents a file uploaded to a destination that was created by the [createUploadDestinationForResource](doc:uploads-api-reference#post-uploads2020-11-01uploaddestinationsresource) operation of the Selling Partner API for Uploads.
 */
@ApiModel(description = "Represents a file uploaded to a destination that was created by the [createUploadDestinationForResource](doc:uploads-api-reference#post-uploads2020-11-01uploaddestinationsresource) operation of the Selling Partner API for Uploads.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:59.849+08:00")
public class Attachment {
  @SerializedName("uploadDestinationId")
  private String uploadDestinationId = null;

  @SerializedName("fileName")
  private String fileName = null;

  public Attachment uploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
    return this;
  }

   /**
   * The identifier of the upload destination. Get this value by calling the [createUploadDestinationForResource](doc:uploads-api-reference#post-uploads2020-11-01uploaddestinationsresource) operation of the Uploads API.
   * @return uploadDestinationId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the upload destination. Get this value by calling the [createUploadDestinationForResource](doc:uploads-api-reference#post-uploads2020-11-01uploaddestinationsresource) operation of the Uploads API.")
  public String getUploadDestinationId() {
    return uploadDestinationId;
  }

  public void setUploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
  }

  public Attachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file, including the extension. This is the file name that will appear in the message. This does not need to match the file name of the file that you uploaded.
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "The name of the file, including the extension. This is the file name that will appear in the message. This does not need to match the file name of the file that you uploaded.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.uploadDestinationId, attachment.uploadDestinationId) &&
        Objects.equals(this.fileName, attachment.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadDestinationId, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

