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
import com.amazon.spapi.model.shipping_api_model.Address;
import com.amazon.spapi.model.shipping_api_model.ContainerList;
import com.amazon.spapi.model.shipping_api_model.LabelSpecification;
import com.amazon.spapi.model.shipping_api_model.ServiceType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * The payload schema for the purchaseShipment operation.
 */
@ApiModel(description = "The payload schema for the purchaseShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:20.740+08:00")
public class PurchaseShipmentRequest {
  @SerializedName("clientReferenceId")
  private String clientReferenceId = null;

  @SerializedName("shipTo")
  private Address shipTo = null;

  @SerializedName("shipFrom")
  private Address shipFrom = null;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  @SerializedName("serviceType")
  private ServiceType serviceType = null;

  @SerializedName("containers")
  private ContainerList containers = null;

  @SerializedName("labelSpecification")
  private LabelSpecification labelSpecification = null;

  public PurchaseShipmentRequest clientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
    return this;
  }

   /**
   * Get clientReferenceId
   * @return clientReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClientReferenceId() {
    return clientReferenceId;
  }

  public void setClientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
  }

  public PurchaseShipmentRequest shipTo(Address shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipTo() {
    return shipTo;
  }

  public void setShipTo(Address shipTo) {
    this.shipTo = shipTo;
  }

  public PurchaseShipmentRequest shipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
    return this;
  }

   /**
   * Get shipFrom
   * @return shipFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipFrom() {
    return shipFrom;
  }

  public void setShipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
  }

  public PurchaseShipmentRequest shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * The start date and time. This defaults to the current date and time.
   * @return shipDate
  **/
  @ApiModelProperty(value = "The start date and time. This defaults to the current date and time.")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public PurchaseShipmentRequest serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(required = true, value = "")
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public PurchaseShipmentRequest containers(ContainerList containers) {
    this.containers = containers;
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "")
  public ContainerList getContainers() {
    return containers;
  }

  public void setContainers(ContainerList containers) {
    this.containers = containers;
  }

  public PurchaseShipmentRequest labelSpecification(LabelSpecification labelSpecification) {
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
    PurchaseShipmentRequest purchaseShipmentRequest = (PurchaseShipmentRequest) o;
    return Objects.equals(this.clientReferenceId, purchaseShipmentRequest.clientReferenceId) &&
        Objects.equals(this.shipTo, purchaseShipmentRequest.shipTo) &&
        Objects.equals(this.shipFrom, purchaseShipmentRequest.shipFrom) &&
        Objects.equals(this.shipDate, purchaseShipmentRequest.shipDate) &&
        Objects.equals(this.serviceType, purchaseShipmentRequest.serviceType) &&
        Objects.equals(this.containers, purchaseShipmentRequest.containers) &&
        Objects.equals(this.labelSpecification, purchaseShipmentRequest.labelSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceId, shipTo, shipFrom, shipDate, serviceType, containers, labelSpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseShipmentRequest {\n");
    
    sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

