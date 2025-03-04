/*
 * Selling Partner API for Direct Fulfillment Payments
 * The Selling Partner API for Direct Fulfillment Payments provides programmatic access to a direct fulfillment vendor's invoice data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_payments_api_model;

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
 * A field where the selling party can provide additional information for tax-related or any other purposes.
 */
@ApiModel(description = "A field where the selling party can provide additional information for tax-related or any other purposes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:32.431+08:00")
public class AdditionalDetails {
  /**
   * The type of the additional information provided by the selling party.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SUR("SUR"),
    
    OCR("OCR");

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

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("languageCode")
  private String languageCode = null;

  public AdditionalDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the additional information provided by the selling party.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the additional information provided by the selling party.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AdditionalDetails detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * The detail of the additional information provided by the selling party.
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "The detail of the additional information provided by the selling party.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public AdditionalDetails languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language code of the additional information detail.
   * @return languageCode
  **/
  @ApiModelProperty(value = "The language code of the additional information detail.")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDetails additionalDetails = (AdditionalDetails) o;
    return Objects.equals(this.type, additionalDetails.type) &&
        Objects.equals(this.detail, additionalDetails.detail) &&
        Objects.equals(this.languageCode, additionalDetails.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, detail, languageCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

