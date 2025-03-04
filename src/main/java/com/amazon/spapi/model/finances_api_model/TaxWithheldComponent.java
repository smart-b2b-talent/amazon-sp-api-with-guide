/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances_api_model.ChargeComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the taxes withheld.
 */
@ApiModel(description = "Information about the taxes withheld.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:49.128+08:00")
public class TaxWithheldComponent {
  @SerializedName("TaxCollectionModel")
  private String taxCollectionModel = null;

  @SerializedName("TaxesWithheld")
  private ChargeComponentList taxesWithheld = null;

  public TaxWithheldComponent taxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
    return this;
  }

   /**
   * The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.
   * @return taxCollectionModel
  **/
  @ApiModelProperty(value = "The tax collection model applied to the item.  Possible values:  * MarketplaceFacilitator - Tax is withheld and remitted to the taxing authority by Amazon on behalf of the seller.  * Standard - Tax is paid to the seller and not remitted to the taxing authority by Amazon.")
  public String getTaxCollectionModel() {
    return taxCollectionModel;
  }

  public void setTaxCollectionModel(String taxCollectionModel) {
    this.taxCollectionModel = taxCollectionModel;
  }

  public TaxWithheldComponent taxesWithheld(ChargeComponentList taxesWithheld) {
    this.taxesWithheld = taxesWithheld;
    return this;
  }

   /**
   * A list of charges that represent the types and amounts of taxes withheld.
   * @return taxesWithheld
  **/
  @ApiModelProperty(value = "A list of charges that represent the types and amounts of taxes withheld.")
  public ChargeComponentList getTaxesWithheld() {
    return taxesWithheld;
  }

  public void setTaxesWithheld(ChargeComponentList taxesWithheld) {
    this.taxesWithheld = taxesWithheld;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxWithheldComponent taxWithheldComponent = (TaxWithheldComponent) o;
    return Objects.equals(this.taxCollectionModel, taxWithheldComponent.taxCollectionModel) &&
        Objects.equals(this.taxesWithheld, taxWithheldComponent.taxesWithheld);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxCollectionModel, taxesWithheld);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxWithheldComponent {\n");
    
    sb.append("    taxCollectionModel: ").append(toIndentedString(taxCollectionModel)).append("\n");
    sb.append("    taxesWithheld: ").append(toIndentedString(taxesWithheld)).append("\n");
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

