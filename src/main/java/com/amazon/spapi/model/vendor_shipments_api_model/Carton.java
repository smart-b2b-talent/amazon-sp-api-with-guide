/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_shipments_api_model.ContainerIdentification;
import com.amazon.spapi.model.vendor_shipments_api_model.ContainerItem;
import com.amazon.spapi.model.vendor_shipments_api_model.Dimensions;
import com.amazon.spapi.model.vendor_shipments_api_model.Weight;
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
 * Details of the carton/package being shipped.
 */
@ApiModel(description = "Details of the carton/package being shipped.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:12:16.566+08:00")
public class Carton {
  @SerializedName("cartonIdentifiers")
  private List<ContainerIdentification> cartonIdentifiers = null;

  @SerializedName("cartonSequenceNumber")
  private String cartonSequenceNumber = null;

  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("weight")
  private Weight weight = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("items")
  private List<ContainerItem> items = new ArrayList<ContainerItem>();

  public Carton cartonIdentifiers(List<ContainerIdentification> cartonIdentifiers) {
    this.cartonIdentifiers = cartonIdentifiers;
    return this;
  }

  public Carton addCartonIdentifiersItem(ContainerIdentification cartonIdentifiersItem) {
    if (this.cartonIdentifiers == null) {
      this.cartonIdentifiers = new ArrayList<ContainerIdentification>();
    }
    this.cartonIdentifiers.add(cartonIdentifiersItem);
    return this;
  }

   /**
   * A list of carton identifiers.
   * @return cartonIdentifiers
  **/
  @ApiModelProperty(value = "A list of carton identifiers.")
  public List<ContainerIdentification> getCartonIdentifiers() {
    return cartonIdentifiers;
  }

  public void setCartonIdentifiers(List<ContainerIdentification> cartonIdentifiers) {
    this.cartonIdentifiers = cartonIdentifiers;
  }

  public Carton cartonSequenceNumber(String cartonSequenceNumber) {
    this.cartonSequenceNumber = cartonSequenceNumber;
    return this;
  }

   /**
   * Carton sequence number for the carton. The first carton will be 001, the second 002, and so on. This number is used as a reference to refer to this carton from the pallet level.
   * @return cartonSequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Carton sequence number for the carton. The first carton will be 001, the second 002, and so on. This number is used as a reference to refer to this carton from the pallet level.")
  public String getCartonSequenceNumber() {
    return cartonSequenceNumber;
  }

  public void setCartonSequenceNumber(String cartonSequenceNumber) {
    this.cartonSequenceNumber = cartonSequenceNumber;
  }

  public Carton dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Carton weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Carton trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * This is required to be provided for every carton in the small parcel shipments.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "This is required to be provided for every carton in the small parcel shipments.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Carton items(List<ContainerItem> items) {
    this.items = items;
    return this;
  }

  public Carton addItemsItem(ContainerItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of container item details.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of container item details.")
  public List<ContainerItem> getItems() {
    return items;
  }

  public void setItems(List<ContainerItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carton carton = (Carton) o;
    return Objects.equals(this.cartonIdentifiers, carton.cartonIdentifiers) &&
        Objects.equals(this.cartonSequenceNumber, carton.cartonSequenceNumber) &&
        Objects.equals(this.dimensions, carton.dimensions) &&
        Objects.equals(this.weight, carton.weight) &&
        Objects.equals(this.trackingNumber, carton.trackingNumber) &&
        Objects.equals(this.items, carton.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartonIdentifiers, cartonSequenceNumber, dimensions, weight, trackingNumber, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carton {\n");
    
    sb.append("    cartonIdentifiers: ").append(toIndentedString(cartonIdentifiers)).append("\n");
    sb.append("    cartonSequenceNumber: ").append(toIndentedString(cartonSequenceNumber)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

