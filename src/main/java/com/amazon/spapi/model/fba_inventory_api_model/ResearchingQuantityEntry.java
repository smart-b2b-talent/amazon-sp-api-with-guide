/*
 * Selling Partner API for FBA Inventory
 * The Selling Partner API for FBA Inventory lets you programmatically retrieve information about inventory in Amazon's fulfillment network.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fba_inventory_api_model;

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
 * The misplaced or warehouse damaged inventory that is actively being confirmed at our fulfillment centers.
 */
@ApiModel(description = "The misplaced or warehouse damaged inventory that is actively being confirmed at our fulfillment centers.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:10:56.728+08:00")
public class ResearchingQuantityEntry {
  /**
   * The duration of the research.
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    RESEARCHINGQUANTITYINSHORTTERM("researchingQuantityInShortTerm"),
    
    RESEARCHINGQUANTITYINMIDTERM("researchingQuantityInMidTerm"),
    
    RESEARCHINGQUANTITYINLONGTERM("researchingQuantityInLongTerm");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public ResearchingQuantityEntry name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The duration of the research.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The duration of the research.")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public ResearchingQuantityEntry quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of units.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResearchingQuantityEntry researchingQuantityEntry = (ResearchingQuantityEntry) o;
    return Objects.equals(this.name, researchingQuantityEntry.name) &&
        Objects.equals(this.quantity, researchingQuantityEntry.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResearchingQuantityEntry {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

