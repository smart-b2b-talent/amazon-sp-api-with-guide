/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.notifications_api_model.ProcessingDirective;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a subscription to receive notifications.
 */
@ApiModel(description = "Represents a subscription to receive notifications.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:01.140+08:00")
public class Subscription {
  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("payloadVersion")
  private String payloadVersion = null;

  @SerializedName("destinationId")
  private String destinationId = null;

  @SerializedName("processingDirective")
  private ProcessingDirective processingDirective = null;

  public Subscription subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The subscription identifier generated when the subscription is created.
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "The subscription identifier generated when the subscription is created.")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public Subscription payloadVersion(String payloadVersion) {
    this.payloadVersion = payloadVersion;
    return this;
  }

   /**
   * The version of the payload object to be used in the notification.
   * @return payloadVersion
  **/
  @ApiModelProperty(required = true, value = "The version of the payload object to be used in the notification.")
  public String getPayloadVersion() {
    return payloadVersion;
  }

  public void setPayloadVersion(String payloadVersion) {
    this.payloadVersion = payloadVersion;
  }

  public Subscription destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The identifier for the destination where notifications will be delivered.
   * @return destinationId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the destination where notifications will be delivered.")
  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public Subscription processingDirective(ProcessingDirective processingDirective) {
    this.processingDirective = processingDirective;
    return this;
  }

   /**
   * Get processingDirective
   * @return processingDirective
  **/
  @ApiModelProperty(value = "")
  public ProcessingDirective getProcessingDirective() {
    return processingDirective;
  }

  public void setProcessingDirective(ProcessingDirective processingDirective) {
    this.processingDirective = processingDirective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.payloadVersion, subscription.payloadVersion) &&
        Objects.equals(this.destinationId, subscription.destinationId) &&
        Objects.equals(this.processingDirective, subscription.processingDirective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, payloadVersion, destinationId, processingDirective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    payloadVersion: ").append(toIndentedString(payloadVersion)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    processingDirective: ").append(toIndentedString(processingDirective)).append("\n");
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

