/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_orders_api_model;

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
 * Details of quantity ordered.
 */
@ApiModel(description = "Details of quantity ordered.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:53:01.693+08:00")
public class ItemQuantity {
  @SerializedName("amount")
  private Integer amount = null;

  /**
   * Unit of measure for the acknowledged quantity.
   */
  @JsonAdapter(UnitOfMeasureEnum.Adapter.class)
  public enum UnitOfMeasureEnum {
    EACH("Each");

    private String value;

    UnitOfMeasureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitOfMeasureEnum fromValue(String text) {
      for (UnitOfMeasureEnum b : UnitOfMeasureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitOfMeasureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitOfMeasureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitOfMeasureEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitOfMeasureEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("unitOfMeasure")
  private UnitOfMeasureEnum unitOfMeasure = null;

  public ItemQuantity amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Acknowledged quantity. This value should not be zero.
   * @return amount
  **/
  @ApiModelProperty(value = "Acknowledged quantity. This value should not be zero.")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ItemQuantity unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure for the acknowledged quantity.
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "Unit of measure for the acknowledged quantity.")
  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemQuantity itemQuantity = (ItemQuantity) o;
    return Objects.equals(this.amount, itemQuantity.amount) &&
        Objects.equals(this.unitOfMeasure, itemQuantity.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unitOfMeasure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemQuantity {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

