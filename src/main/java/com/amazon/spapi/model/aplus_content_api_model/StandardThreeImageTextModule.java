/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.aplus_content_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.aplus_content_api_model.StandardImageTextBlock;
import com.amazon.spapi.model.aplus_content_api_model.TextComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Three standard images with text, presented across a single row.
 */
@ApiModel(description = "Three standard images with text, presented across a single row.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-30T16:51:51.898+08:00")
public class StandardThreeImageTextModule {
  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("block1")
  private StandardImageTextBlock block1 = null;

  @SerializedName("block2")
  private StandardImageTextBlock block2 = null;

  @SerializedName("block3")
  private StandardImageTextBlock block3 = null;

  public StandardThreeImageTextModule headline(TextComponent headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(value = "")
  public TextComponent getHeadline() {
    return headline;
  }

  public void setHeadline(TextComponent headline) {
    this.headline = headline;
  }

  public StandardThreeImageTextModule block1(StandardImageTextBlock block1) {
    this.block1 = block1;
    return this;
  }

   /**
   * Get block1
   * @return block1
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock1() {
    return block1;
  }

  public void setBlock1(StandardImageTextBlock block1) {
    this.block1 = block1;
  }

  public StandardThreeImageTextModule block2(StandardImageTextBlock block2) {
    this.block2 = block2;
    return this;
  }

   /**
   * Get block2
   * @return block2
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock2() {
    return block2;
  }

  public void setBlock2(StandardImageTextBlock block2) {
    this.block2 = block2;
  }

  public StandardThreeImageTextModule block3(StandardImageTextBlock block3) {
    this.block3 = block3;
    return this;
  }

   /**
   * Get block3
   * @return block3
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock3() {
    return block3;
  }

  public void setBlock3(StandardImageTextBlock block3) {
    this.block3 = block3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardThreeImageTextModule standardThreeImageTextModule = (StandardThreeImageTextModule) o;
    return Objects.equals(this.headline, standardThreeImageTextModule.headline) &&
        Objects.equals(this.block1, standardThreeImageTextModule.block1) &&
        Objects.equals(this.block2, standardThreeImageTextModule.block2) &&
        Objects.equals(this.block3, standardThreeImageTextModule.block3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, block1, block2, block3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardThreeImageTextModule {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    block1: ").append(toIndentedString(block1)).append("\n");
    sb.append("    block2: ").append(toIndentedString(block2)).append("\n");
    sb.append("    block3: ").append(toIndentedString(block3)).append("\n");
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

