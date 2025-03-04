/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.ItemDelivery;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about an item associated with the service job.
 */
@ApiModel(description = "Information about an item associated with the service job.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:17.007+08:00")
public class AssociatedItem {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("orderId")
  private String orderId = null;

  /**
   * The status of the item.
   */
  @JsonAdapter(ItemStatusEnum.Adapter.class)
  public enum ItemStatusEnum {
    ACTIVE("ACTIVE"),
    
    CANCELLED("CANCELLED"),
    
    SHIPPED("SHIPPED"),
    
    DELIVERED("DELIVERED");

    private String value;

    ItemStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ItemStatusEnum fromValue(String text) {
      for (ItemStatusEnum b : ItemStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ItemStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ItemStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ItemStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("itemStatus")
  private ItemStatusEnum itemStatus = null;

  @SerializedName("brandName")
  private String brandName = null;

  @SerializedName("itemDelivery")
  private ItemDelivery itemDelivery = null;

  public AssociatedItem asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public AssociatedItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the item.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AssociatedItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The total number of items included in the order.
   * @return quantity
  **/
  @ApiModelProperty(value = "The total number of items included in the order.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public AssociatedItem orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The Amazon-defined identifier for an order placed by the buyer in 3-7-7 format.
   * @return orderId
  **/
  @ApiModelProperty(value = "The Amazon-defined identifier for an order placed by the buyer in 3-7-7 format.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public AssociatedItem itemStatus(ItemStatusEnum itemStatus) {
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * The status of the item.
   * @return itemStatus
  **/
  @ApiModelProperty(value = "The status of the item.")
  public ItemStatusEnum getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(ItemStatusEnum itemStatus) {
    this.itemStatus = itemStatus;
  }

  public AssociatedItem brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * The brand name of the item.
   * @return brandName
  **/
  @ApiModelProperty(value = "The brand name of the item.")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public AssociatedItem itemDelivery(ItemDelivery itemDelivery) {
    this.itemDelivery = itemDelivery;
    return this;
  }

   /**
   * Delivery information for the item.
   * @return itemDelivery
  **/
  @ApiModelProperty(value = "Delivery information for the item.")
  public ItemDelivery getItemDelivery() {
    return itemDelivery;
  }

  public void setItemDelivery(ItemDelivery itemDelivery) {
    this.itemDelivery = itemDelivery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedItem associatedItem = (AssociatedItem) o;
    return Objects.equals(this.asin, associatedItem.asin) &&
        Objects.equals(this.title, associatedItem.title) &&
        Objects.equals(this.quantity, associatedItem.quantity) &&
        Objects.equals(this.orderId, associatedItem.orderId) &&
        Objects.equals(this.itemStatus, associatedItem.itemStatus) &&
        Objects.equals(this.brandName, associatedItem.brandName) &&
        Objects.equals(this.itemDelivery, associatedItem.itemDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, title, quantity, orderId, itemStatus, brandName, itemDelivery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedItem {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    itemDelivery: ").append(toIndentedString(itemDelivery)).append("\n");
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

