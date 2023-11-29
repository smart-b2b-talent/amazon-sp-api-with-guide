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
import com.amazon.spapi.model.shipping_api_model.ContainerItem;
import com.amazon.spapi.model.shipping_api_model.Currency;
import com.amazon.spapi.model.shipping_api_model.Dimensions;
import com.amazon.spapi.model.shipping_api_model.Weight;
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
 * Container in the shipment.
 */
@ApiModel(description = "Container in the shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:45.887+08:00")
public class Container {
  /**
   * The type of physical container being used. (always &#39;PACKAGE&#39;)
   */
  @JsonAdapter(ContainerTypeEnum.Adapter.class)
  public enum ContainerTypeEnum {
    PACKAGE("PACKAGE");

    private String value;

    ContainerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContainerTypeEnum fromValue(String text) {
      for (ContainerTypeEnum b : ContainerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContainerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContainerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContainerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContainerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("containerType")
  private ContainerTypeEnum containerType = null;

  @SerializedName("containerReferenceId")
  private String containerReferenceId = null;

  @SerializedName("value")
  private Currency value = null;

  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("items")
  private List<ContainerItem> items = new ArrayList<ContainerItem>();

  @SerializedName("weight")
  private Weight weight = null;

  public Container containerType(ContainerTypeEnum containerType) {
    this.containerType = containerType;
    return this;
  }

   /**
   * The type of physical container being used. (always &#39;PACKAGE&#39;)
   * @return containerType
  **/
  @ApiModelProperty(value = "The type of physical container being used. (always 'PACKAGE')")
  public ContainerTypeEnum getContainerType() {
    return containerType;
  }

  public void setContainerType(ContainerTypeEnum containerType) {
    this.containerType = containerType;
  }

  public Container containerReferenceId(String containerReferenceId) {
    this.containerReferenceId = containerReferenceId;
    return this;
  }

   /**
   * Get containerReferenceId
   * @return containerReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContainerReferenceId() {
    return containerReferenceId;
  }

  public void setContainerReferenceId(String containerReferenceId) {
    this.containerReferenceId = containerReferenceId;
  }

  public Container value(Currency value) {
    this.value = value;
    return this;
  }

   /**
   * The total value of all items in the container.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The total value of all items in the container.")
  public Currency getValue() {
    return value;
  }

  public void setValue(Currency value) {
    this.value = value;
  }

  public Container dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * The length, width, height, and weight of the container.
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "The length, width, height, and weight of the container.")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Container items(List<ContainerItem> items) {
    this.items = items;
    return this;
  }

  public Container addItemsItem(ContainerItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of the items in the container.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of the items in the container.")
  public List<ContainerItem> getItems() {
    return items;
  }

  public void setItems(List<ContainerItem> items) {
    this.items = items;
  }

  public Container weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the container.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The weight of the container.")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.containerType, container.containerType) &&
        Objects.equals(this.containerReferenceId, container.containerReferenceId) &&
        Objects.equals(this.value, container.value) &&
        Objects.equals(this.dimensions, container.dimensions) &&
        Objects.equals(this.items, container.items) &&
        Objects.equals(this.weight, container.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerType, containerReferenceId, value, dimensions, items, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    containerReferenceId: ").append(toIndentedString(containerReferenceId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

