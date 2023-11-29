/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalog_items_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.catalog_items_api_model.ItemVariationTheme;
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
 * Relationship details for an Amazon catalog item.
 */
@ApiModel(description = "Relationship details for an Amazon catalog item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:39.638+08:00")
public class ItemRelationship {
  @SerializedName("childAsins")
  private List<String> childAsins = null;

  @SerializedName("parentAsins")
  private List<String> parentAsins = null;

  @SerializedName("variationTheme")
  private ItemVariationTheme variationTheme = null;

  /**
   * Type of relationship.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VARIATION("VARIATION"),
    
    PACKAGE_HIERARCHY("PACKAGE_HIERARCHY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public ItemRelationship childAsins(List<String> childAsins) {
    this.childAsins = childAsins;
    return this;
  }

  public ItemRelationship addChildAsinsItem(String childAsinsItem) {
    if (this.childAsins == null) {
      this.childAsins = new ArrayList<String>();
    }
    this.childAsins.add(childAsinsItem);
    return this;
  }

   /**
   * Identifiers (ASINs) of the related items that are children of this item.
   * @return childAsins
  **/
  @ApiModelProperty(value = "Identifiers (ASINs) of the related items that are children of this item.")
  public List<String> getChildAsins() {
    return childAsins;
  }

  public void setChildAsins(List<String> childAsins) {
    this.childAsins = childAsins;
  }

  public ItemRelationship parentAsins(List<String> parentAsins) {
    this.parentAsins = parentAsins;
    return this;
  }

  public ItemRelationship addParentAsinsItem(String parentAsinsItem) {
    if (this.parentAsins == null) {
      this.parentAsins = new ArrayList<String>();
    }
    this.parentAsins.add(parentAsinsItem);
    return this;
  }

   /**
   * Identifiers (ASINs) of the related items that are parents of this item.
   * @return parentAsins
  **/
  @ApiModelProperty(value = "Identifiers (ASINs) of the related items that are parents of this item.")
  public List<String> getParentAsins() {
    return parentAsins;
  }

  public void setParentAsins(List<String> parentAsins) {
    this.parentAsins = parentAsins;
  }

  public ItemRelationship variationTheme(ItemVariationTheme variationTheme) {
    this.variationTheme = variationTheme;
    return this;
  }

   /**
   * For \&quot;VARIATION\&quot; relationships, variation theme indicating the combination of Amazon item catalog attributes that define the variation family.
   * @return variationTheme
  **/
  @ApiModelProperty(value = "For \"VARIATION\" relationships, variation theme indicating the combination of Amazon item catalog attributes that define the variation family.")
  public ItemVariationTheme getVariationTheme() {
    return variationTheme;
  }

  public void setVariationTheme(ItemVariationTheme variationTheme) {
    this.variationTheme = variationTheme;
  }

  public ItemRelationship type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of relationship.
   * @return type
  **/
  @ApiModelProperty(example = "VARIATION", required = true, value = "Type of relationship.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemRelationship itemRelationship = (ItemRelationship) o;
    return Objects.equals(this.childAsins, itemRelationship.childAsins) &&
        Objects.equals(this.parentAsins, itemRelationship.parentAsins) &&
        Objects.equals(this.variationTheme, itemRelationship.variationTheme) &&
        Objects.equals(this.type, itemRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childAsins, parentAsins, variationTheme, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRelationship {\n");
    
    sb.append("    childAsins: ").append(toIndentedString(childAsins)).append("\n");
    sb.append("    parentAsins: ").append(toIndentedString(parentAsins)).append("\n");
    sb.append("    variationTheme: ").append(toIndentedString(variationTheme)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

