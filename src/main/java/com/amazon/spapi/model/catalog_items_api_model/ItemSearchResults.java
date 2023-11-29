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
import com.amazon.spapi.model.catalog_items_api_model.Item;
import com.amazon.spapi.model.catalog_items_api_model.Pagination;
import com.amazon.spapi.model.catalog_items_api_model.Refinements;
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
 * Items in the Amazon catalog and search related metadata.
 */
@ApiModel(description = "Items in the Amazon catalog and search related metadata.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:39.638+08:00")
public class ItemSearchResults {
  @SerializedName("numberOfResults")
  private Integer numberOfResults = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("refinements")
  private Refinements refinements = null;

  @SerializedName("items")
  private List<Item> items = new ArrayList<Item>();

  public ItemSearchResults numberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
    return this;
  }

   /**
   * For &#x60;identifiers&#x60;-based searches, the total number of Amazon catalog items found. For &#x60;keywords&#x60;-based searches, the estimated total number of Amazon catalog items matched by the search query (only results up to the page count limit will be returned per request regardless of the number found).  Note: The maximum number of items (ASINs) that can be returned and paged through is 1000.
   * @return numberOfResults
  **/
  @ApiModelProperty(required = true, value = "For `identifiers`-based searches, the total number of Amazon catalog items found. For `keywords`-based searches, the estimated total number of Amazon catalog items matched by the search query (only results up to the page count limit will be returned per request regardless of the number found).  Note: The maximum number of items (ASINs) that can be returned and paged through is 1000.")
  public Integer getNumberOfResults() {
    return numberOfResults;
  }

  public void setNumberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
  }

  public ItemSearchResults pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * If available, the &#x60;nextToken&#x60; and/or &#x60;previousToken&#x60; values required to return paginated results.
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "If available, the `nextToken` and/or `previousToken` values required to return paginated results.")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public ItemSearchResults refinements(Refinements refinements) {
    this.refinements = refinements;
    return this;
  }

   /**
   * Search refinements for &#x60;keywords&#x60;-based searches.
   * @return refinements
  **/
  @ApiModelProperty(required = true, value = "Search refinements for `keywords`-based searches.")
  public Refinements getRefinements() {
    return refinements;
  }

  public void setRefinements(Refinements refinements) {
    this.refinements = refinements;
  }

  public ItemSearchResults items(List<Item> items) {
    this.items = items;
    return this;
  }

  public ItemSearchResults addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items from the Amazon catalog.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of items from the Amazon catalog.")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
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
    ItemSearchResults itemSearchResults = (ItemSearchResults) o;
    return Objects.equals(this.numberOfResults, itemSearchResults.numberOfResults) &&
        Objects.equals(this.pagination, itemSearchResults.pagination) &&
        Objects.equals(this.refinements, itemSearchResults.refinements) &&
        Objects.equals(this.items, itemSearchResults.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfResults, pagination, refinements, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSearchResults {\n");
    
    sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    refinements: ").append(toIndentedString(refinements)).append("\n");
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

