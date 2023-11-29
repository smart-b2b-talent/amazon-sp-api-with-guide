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
import com.amazon.spapi.model.aplus_content_api_model.ImageComponent;
import com.amazon.spapi.model.aplus_content_api_model.StandardHeaderTextListBlock;
import com.amazon.spapi.model.aplus_content_api_model.StandardTextBlock;
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
 * A standard image with several paragraphs and a bulleted list.
 */
@ApiModel(description = "A standard image with several paragraphs and a bulleted list.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:30.497+08:00")
public class StandardSingleImageHighlightsModule {
  @SerializedName("image")
  private ImageComponent image = null;

  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("textBlock1")
  private StandardTextBlock textBlock1 = null;

  @SerializedName("textBlock2")
  private StandardTextBlock textBlock2 = null;

  @SerializedName("textBlock3")
  private StandardTextBlock textBlock3 = null;

  @SerializedName("bulletedListBlock")
  private StandardHeaderTextListBlock bulletedListBlock = null;

  public StandardSingleImageHighlightsModule image(ImageComponent image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public ImageComponent getImage() {
    return image;
  }

  public void setImage(ImageComponent image) {
    this.image = image;
  }

  public StandardSingleImageHighlightsModule headline(TextComponent headline) {
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

  public StandardSingleImageHighlightsModule textBlock1(StandardTextBlock textBlock1) {
    this.textBlock1 = textBlock1;
    return this;
  }

   /**
   * Get textBlock1
   * @return textBlock1
  **/
  @ApiModelProperty(value = "")
  public StandardTextBlock getTextBlock1() {
    return textBlock1;
  }

  public void setTextBlock1(StandardTextBlock textBlock1) {
    this.textBlock1 = textBlock1;
  }

  public StandardSingleImageHighlightsModule textBlock2(StandardTextBlock textBlock2) {
    this.textBlock2 = textBlock2;
    return this;
  }

   /**
   * Get textBlock2
   * @return textBlock2
  **/
  @ApiModelProperty(value = "")
  public StandardTextBlock getTextBlock2() {
    return textBlock2;
  }

  public void setTextBlock2(StandardTextBlock textBlock2) {
    this.textBlock2 = textBlock2;
  }

  public StandardSingleImageHighlightsModule textBlock3(StandardTextBlock textBlock3) {
    this.textBlock3 = textBlock3;
    return this;
  }

   /**
   * Get textBlock3
   * @return textBlock3
  **/
  @ApiModelProperty(value = "")
  public StandardTextBlock getTextBlock3() {
    return textBlock3;
  }

  public void setTextBlock3(StandardTextBlock textBlock3) {
    this.textBlock3 = textBlock3;
  }

  public StandardSingleImageHighlightsModule bulletedListBlock(StandardHeaderTextListBlock bulletedListBlock) {
    this.bulletedListBlock = bulletedListBlock;
    return this;
  }

   /**
   * Get bulletedListBlock
   * @return bulletedListBlock
  **/
  @ApiModelProperty(value = "")
  public StandardHeaderTextListBlock getBulletedListBlock() {
    return bulletedListBlock;
  }

  public void setBulletedListBlock(StandardHeaderTextListBlock bulletedListBlock) {
    this.bulletedListBlock = bulletedListBlock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardSingleImageHighlightsModule standardSingleImageHighlightsModule = (StandardSingleImageHighlightsModule) o;
    return Objects.equals(this.image, standardSingleImageHighlightsModule.image) &&
        Objects.equals(this.headline, standardSingleImageHighlightsModule.headline) &&
        Objects.equals(this.textBlock1, standardSingleImageHighlightsModule.textBlock1) &&
        Objects.equals(this.textBlock2, standardSingleImageHighlightsModule.textBlock2) &&
        Objects.equals(this.textBlock3, standardSingleImageHighlightsModule.textBlock3) &&
        Objects.equals(this.bulletedListBlock, standardSingleImageHighlightsModule.bulletedListBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, headline, textBlock1, textBlock2, textBlock3, bulletedListBlock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardSingleImageHighlightsModule {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    textBlock1: ").append(toIndentedString(textBlock1)).append("\n");
    sb.append("    textBlock2: ").append(toIndentedString(textBlock2)).append("\n");
    sb.append("    textBlock3: ").append(toIndentedString(textBlock3)).append("\n");
    sb.append("    bulletedListBlock: ").append(toIndentedString(bulletedListBlock)).append("\n");
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

