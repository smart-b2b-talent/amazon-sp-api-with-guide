/*
 * Selling Partner API for Retail Procurement Payments
 * The Selling Partner API for Retail Procurement Payments provides programmatic access to vendors payments data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_invoices_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_invoices_api_model.Money;
import com.amazon.spapi.model.vendor_invoices_api_model.TaxDetails;
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
 * Monetary and tax details of the charge.
 */
@ApiModel(description = "Monetary and tax details of the charge.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:39.708+08:00")
public class ChargeDetails {
  /**
   * Type of the charge applied.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FREIGHT("Freight"),
    
    PACKING("Packing"),
    
    DUTY("Duty"),
    
    SERVICE("Service"),
    
    SMALLORDER("SmallOrder"),
    
    INSURANCEPLACEMENTCOST("InsurancePlacementCost"),
    
    INSURANCEFEE("InsuranceFee"),
    
    SPECIALHANDLINGSERVICE("SpecialHandlingService"),
    
    COLLECTIONANDRECYCLINGSERVICE("CollectionAndRecyclingService"),
    
    ENVIRONMENTALPROTECTIONSERVICE("EnvironmentalProtectionService"),
    
    TAXCOLLECTEDATSOURCE("TaxCollectedAtSource");

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

  @SerializedName("description")
  private String description = null;

  @SerializedName("chargeAmount")
  private Money chargeAmount = null;

  @SerializedName("taxDetails")
  private List<TaxDetails> taxDetails = null;

  public ChargeDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the charge applied.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the charge applied.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChargeDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the charge.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the charge.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChargeDetails chargeAmount(Money chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Total monetary amount related to this charge.
   * @return chargeAmount
  **/
  @ApiModelProperty(required = true, value = "Total monetary amount related to this charge.")
  public Money getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(Money chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public ChargeDetails taxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public ChargeDetails addTaxDetailsItem(TaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<TaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Tax amount details applied on this charge.
   * @return taxDetails
  **/
  @ApiModelProperty(value = "Tax amount details applied on this charge.")
  public List<TaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeDetails chargeDetails = (ChargeDetails) o;
    return Objects.equals(this.type, chargeDetails.type) &&
        Objects.equals(this.description, chargeDetails.description) &&
        Objects.equals(this.chargeAmount, chargeDetails.chargeAmount) &&
        Objects.equals(this.taxDetails, chargeDetails.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, chargeAmount, taxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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

