/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The time period used to group data in the response. Note that this is only valid for the performance time period type.
 */
@JsonAdapter(AggregationFrequency.Adapter.class)
public enum AggregationFrequency {
  
  WEEK("WEEK"),
  
  MONTH("MONTH"),
  
  QUARTER("QUARTER"),
  
  YEAR("YEAR");

  private String value;

  AggregationFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AggregationFrequency fromValue(String text) {
    for (AggregationFrequency b : AggregationFrequency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AggregationFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final AggregationFrequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AggregationFrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AggregationFrequency.fromValue(String.valueOf(value));
    }
  }
}

