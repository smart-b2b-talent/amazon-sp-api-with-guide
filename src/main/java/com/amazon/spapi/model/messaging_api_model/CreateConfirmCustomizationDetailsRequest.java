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
import com.amazon.spapi.model.messaging_api_model.Attachment;
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
 * The request schema for the confirmCustomizationDetails operation.
 */
@ApiModel(description = "The request schema for the confirmCustomizationDetails operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:40.181-04:00")
public class CreateConfirmCustomizationDetailsRequest {
  @SerializedName("text")
  private String text = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  public CreateConfirmCustomizationDetailsRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text to be sent to the buyer. Only links related to customization details are allowed. Do not include HTML or email addresses. The text must be written in the buyer&#39;s language of preference, which can be retrieved from the GetAttributes operation.
   * @return text
  **/
  @ApiModelProperty(value = "The text to be sent to the buyer. Only links related to customization details are allowed. Do not include HTML or email addresses. The text must be written in the buyer's language of preference, which can be retrieved from the GetAttributes operation.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateConfirmCustomizationDetailsRequest attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CreateConfirmCustomizationDetailsRequest addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments to include in the message to the buyer.
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments to include in the message to the buyer.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfirmCustomizationDetailsRequest createConfirmCustomizationDetailsRequest = (CreateConfirmCustomizationDetailsRequest) o;
    return Objects.equals(this.text, createConfirmCustomizationDetailsRequest.text) &&
        Objects.equals(this.attachments, createConfirmCustomizationDetailsRequest.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfirmCustomizationDetailsRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

