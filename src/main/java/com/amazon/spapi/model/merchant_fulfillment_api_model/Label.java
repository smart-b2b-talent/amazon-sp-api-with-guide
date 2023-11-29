/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchant_fulfillment_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.merchant_fulfillment_api_model.FileContents;
import com.amazon.spapi.model.merchant_fulfillment_api_model.LabelDimensions;
import com.amazon.spapi.model.merchant_fulfillment_api_model.LabelFormat;
import com.amazon.spapi.model.merchant_fulfillment_api_model.StandardIdForLabel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data for creating a shipping label and dimensions for printing the label.
 */
@ApiModel(description = "Data for creating a shipping label and dimensions for printing the label.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:20.124+08:00")
public class Label {
  @SerializedName("CustomTextForLabel")
  private String customTextForLabel = null;

  @SerializedName("Dimensions")
  private LabelDimensions dimensions = null;

  @SerializedName("FileContents")
  private FileContents fileContents = null;

  @SerializedName("LabelFormat")
  private LabelFormat labelFormat = null;

  @SerializedName("StandardIdForLabel")
  private StandardIdForLabel standardIdForLabel = null;

  public Label customTextForLabel(String customTextForLabel) {
    this.customTextForLabel = customTextForLabel;
    return this;
  }

   /**
   * Get customTextForLabel
   * @return customTextForLabel
  **/
  @ApiModelProperty(value = "")
  public String getCustomTextForLabel() {
    return customTextForLabel;
  }

  public void setCustomTextForLabel(String customTextForLabel) {
    this.customTextForLabel = customTextForLabel;
  }

  public Label dimensions(LabelDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public LabelDimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(LabelDimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Label fileContents(FileContents fileContents) {
    this.fileContents = fileContents;
    return this;
  }

   /**
   * Get fileContents
   * @return fileContents
  **/
  @ApiModelProperty(required = true, value = "")
  public FileContents getFileContents() {
    return fileContents;
  }

  public void setFileContents(FileContents fileContents) {
    this.fileContents = fileContents;
  }

  public Label labelFormat(LabelFormat labelFormat) {
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * Get labelFormat
   * @return labelFormat
  **/
  @ApiModelProperty(value = "")
  public LabelFormat getLabelFormat() {
    return labelFormat;
  }

  public void setLabelFormat(LabelFormat labelFormat) {
    this.labelFormat = labelFormat;
  }

  public Label standardIdForLabel(StandardIdForLabel standardIdForLabel) {
    this.standardIdForLabel = standardIdForLabel;
    return this;
  }

   /**
   * Get standardIdForLabel
   * @return standardIdForLabel
  **/
  @ApiModelProperty(value = "")
  public StandardIdForLabel getStandardIdForLabel() {
    return standardIdForLabel;
  }

  public void setStandardIdForLabel(StandardIdForLabel standardIdForLabel) {
    this.standardIdForLabel = standardIdForLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.customTextForLabel, label.customTextForLabel) &&
        Objects.equals(this.dimensions, label.dimensions) &&
        Objects.equals(this.fileContents, label.fileContents) &&
        Objects.equals(this.labelFormat, label.labelFormat) &&
        Objects.equals(this.standardIdForLabel, label.standardIdForLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTextForLabel, dimensions, fileContents, labelFormat, standardIdForLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    customTextForLabel: ").append(toIndentedString(customTextForLabel)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    fileContents: ").append(toIndentedString(fileContents)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    standardIdForLabel: ").append(toIndentedString(standardIdForLabel)).append("\n");
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

