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
 * The A+ Content standard image and text block, with a related caption. The caption may not display on all devices.
 */
@ApiModel(description = "The A+ Content standard image and text block, with a related caption. The caption may not display on all devices.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:46:30.497+08:00")
public class StandardImageTextCaptionBlock {
  @SerializedName("block")
  private StandardImageTextBlock block = null;

  @SerializedName("caption")
  private TextComponent caption = null;

  public StandardImageTextCaptionBlock block(StandardImageTextBlock block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock() {
    return block;
  }

  public void setBlock(StandardImageTextBlock block) {
    this.block = block;
  }

  public StandardImageTextCaptionBlock caption(TextComponent caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(value = "")
  public TextComponent getCaption() {
    return caption;
  }

  public void setCaption(TextComponent caption) {
    this.caption = caption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardImageTextCaptionBlock standardImageTextCaptionBlock = (StandardImageTextCaptionBlock) o;
    return Objects.equals(this.block, standardImageTextCaptionBlock.block) &&
        Objects.equals(this.caption, standardImageTextCaptionBlock.caption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(block, caption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardImageTextCaptionBlock {\n");
    
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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

