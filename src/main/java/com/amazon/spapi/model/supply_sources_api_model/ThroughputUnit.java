/*
 * Selling Partner API for Supply Sources
 * Manage configurations and capabilities of seller supply sources.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.supply_sources_api_model;

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
 * The throughput unit
 */
@JsonAdapter(ThroughputUnit.Adapter.class)
public enum ThroughputUnit {
  
  ORDER("Order");

  private String value;

  ThroughputUnit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ThroughputUnit fromValue(String text) {
    for (ThroughputUnit b : ThroughputUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ThroughputUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final ThroughputUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ThroughputUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ThroughputUnit.fromValue(String.valueOf(value));
    }
  }
}

