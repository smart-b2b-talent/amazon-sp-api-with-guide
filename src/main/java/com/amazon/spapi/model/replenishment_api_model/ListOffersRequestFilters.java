/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery (automatic or manual) of any replenishable item at a frequency chosen by the customer.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.replenishment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.replenishment_api_model.EligibilityStatus;
import com.amazon.spapi.model.replenishment_api_model.Preference;
import com.amazon.spapi.model.replenishment_api_model.ProgramTypes;
import com.amazon.spapi.model.replenishment_api_model.Promotion;
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
 * Use these parameters to filter results. Any result must match all of the provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.
 */
@ApiModel(description = "Use these parameters to filter results. Any result must match all of the provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:52:44.904+08:00")
public class ListOffersRequestFilters {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("skus")
  private List<String> skus = null;

  @SerializedName("asins")
  private List<String> asins = null;

  @SerializedName("eligibilities")
  private List<EligibilityStatus> eligibilities = null;

  @SerializedName("preferences")
  private Preference preferences = null;

  @SerializedName("promotions")
  private Promotion promotions = null;

  @SerializedName("programTypes")
  private ProgramTypes programTypes = null;

  public ListOffersRequestFilters marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ListOffersRequestFilters skus(List<String> skus) {
    this.skus = skus;
    return this;
  }

  public ListOffersRequestFilters addSkusItem(String skusItem) {
    if (this.skus == null) {
      this.skus = new ArrayList<String>();
    }
    this.skus.add(skusItem);
    return this;
  }

   /**
   * A list of SKUs to filter. This filter is only supported for sellers and not for vendors.
   * @return skus
  **/
  @ApiModelProperty(value = "A list of SKUs to filter. This filter is only supported for sellers and not for vendors.")
  public List<String> getSkus() {
    return skus;
  }

  public void setSkus(List<String> skus) {
    this.skus = skus;
  }

  public ListOffersRequestFilters asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  public ListOffersRequestFilters addAsinsItem(String asinsItem) {
    if (this.asins == null) {
      this.asins = new ArrayList<String>();
    }
    this.asins.add(asinsItem);
    return this;
  }

   /**
   * A list of Amazon Standard Identification Numbers (ASINs).
   * @return asins
  **/
  @ApiModelProperty(value = "A list of Amazon Standard Identification Numbers (ASINs).")
  public List<String> getAsins() {
    return asins;
  }

  public void setAsins(List<String> asins) {
    this.asins = asins;
  }

  public ListOffersRequestFilters eligibilities(List<EligibilityStatus> eligibilities) {
    this.eligibilities = eligibilities;
    return this;
  }

  public ListOffersRequestFilters addEligibilitiesItem(EligibilityStatus eligibilitiesItem) {
    if (this.eligibilities == null) {
      this.eligibilities = new ArrayList<EligibilityStatus>();
    }
    this.eligibilities.add(eligibilitiesItem);
    return this;
  }

   /**
   * A list of eligibilities associated with an offer.
   * @return eligibilities
  **/
  @ApiModelProperty(value = "A list of eligibilities associated with an offer.")
  public List<EligibilityStatus> getEligibilities() {
    return eligibilities;
  }

  public void setEligibilities(List<EligibilityStatus> eligibilities) {
    this.eligibilities = eligibilities;
  }

  public ListOffersRequestFilters preferences(Preference preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Offer preferences to include in the result filter criteria.
   * @return preferences
  **/
  @ApiModelProperty(value = "Offer preferences to include in the result filter criteria.")
  public Preference getPreferences() {
    return preferences;
  }

  public void setPreferences(Preference preferences) {
    this.preferences = preferences;
  }

  public ListOffersRequestFilters promotions(Promotion promotions) {
    this.promotions = promotions;
    return this;
  }

   /**
   * Offer promotions to include in the result filter criteria.
   * @return promotions
  **/
  @ApiModelProperty(value = "Offer promotions to include in the result filter criteria.")
  public Promotion getPromotions() {
    return promotions;
  }

  public void setPromotions(Promotion promotions) {
    this.promotions = promotions;
  }

  public ListOffersRequestFilters programTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
    return this;
  }

   /**
   * Get programTypes
   * @return programTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public ProgramTypes getProgramTypes() {
    return programTypes;
  }

  public void setProgramTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOffersRequestFilters listOffersRequestFilters = (ListOffersRequestFilters) o;
    return Objects.equals(this.marketplaceId, listOffersRequestFilters.marketplaceId) &&
        Objects.equals(this.skus, listOffersRequestFilters.skus) &&
        Objects.equals(this.asins, listOffersRequestFilters.asins) &&
        Objects.equals(this.eligibilities, listOffersRequestFilters.eligibilities) &&
        Objects.equals(this.preferences, listOffersRequestFilters.preferences) &&
        Objects.equals(this.promotions, listOffersRequestFilters.promotions) &&
        Objects.equals(this.programTypes, listOffersRequestFilters.programTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, skus, asins, eligibilities, preferences, promotions, programTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOffersRequestFilters {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    asins: ").append(toIndentedString(asins)).append("\n");
    sb.append("    eligibilities: ").append(toIndentedString(eligibilities)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("    programTypes: ").append(toIndentedString(programTypes)).append("\n");
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

