/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  _Note:_ The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders_api_model.OpenInterval;
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
 * Business days and hours when the destination is open for deliveries.
 */
@ApiModel(description = "Business days and hours when the destination is open for deliveries.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:25.479+08:00")
public class BusinessHours {
  /**
   * Day of the week.
   */
  @JsonAdapter(DayOfWeekEnum.Adapter.class)
  public enum DayOfWeekEnum {
    SUN("SUN"),
    
    MON("MON"),
    
    TUE("TUE"),
    
    WED("WED"),
    
    THU("THU"),
    
    FRI("FRI"),
    
    SAT("SAT");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayOfWeekEnum fromValue(String text) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DayOfWeekEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DayOfWeek")
  private DayOfWeekEnum dayOfWeek = null;

  @SerializedName("OpenIntervals")
  private List<OpenInterval> openIntervals = null;

  public BusinessHours dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Day of the week.
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "Day of the week.")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public BusinessHours openIntervals(List<OpenInterval> openIntervals) {
    this.openIntervals = openIntervals;
    return this;
  }

  public BusinessHours addOpenIntervalsItem(OpenInterval openIntervalsItem) {
    if (this.openIntervals == null) {
      this.openIntervals = new ArrayList<OpenInterval>();
    }
    this.openIntervals.add(openIntervalsItem);
    return this;
  }

   /**
   * Time window during the day when the business is open.
   * @return openIntervals
  **/
  @ApiModelProperty(value = "Time window during the day when the business is open.")
  public List<OpenInterval> getOpenIntervals() {
    return openIntervals;
  }

  public void setOpenIntervals(List<OpenInterval> openIntervals) {
    this.openIntervals = openIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHours businessHours = (BusinessHours) o;
    return Objects.equals(this.dayOfWeek, businessHours.dayOfWeek) &&
        Objects.equals(this.openIntervals, businessHours.openIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, openIntervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHours {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    openIntervals: ").append(toIndentedString(openIntervals)).append("\n");
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

