/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.notifications_api_model.AggregationFilter;
import com.amazon.spapi.model.notifications_api_model.AggregationSettings;
import com.amazon.spapi.model.notifications_api_model.MarketplaceFilter;
import com.amazon.spapi.model.notifications_api_model.MarketplaceIds;
import com.amazon.spapi.model.notifications_api_model.OrderChangeTypeFilter;
import com.amazon.spapi.model.notifications_api_model.OrderChangeTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A notificationType specific filter. This object contains all of the currently available filters and properties that you can use to define a notificationType specific filter.
 */
@ApiModel(description = "A notificationType specific filter. This object contains all of the currently available filters and properties that you can use to define a notificationType specific filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T10:47:01.140+08:00")
public class EventFilter extends AggregationFilter {
  @SerializedName("marketplaceIds")
  private MarketplaceIds marketplaceIds = null;

  @SerializedName("orderChangeTypes")
  private OrderChangeTypes orderChangeTypes = null;

  /**
   * An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.
   */
  @JsonAdapter(EventFilterTypeEnum.Adapter.class)
  public enum EventFilterTypeEnum {
    ANY_OFFER_CHANGED("ANY_OFFER_CHANGED"),
    
    ORDER_CHANGE("ORDER_CHANGE");

    private String value;

    EventFilterTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventFilterTypeEnum fromValue(String text) {
      for (EventFilterTypeEnum b : EventFilterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventFilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventFilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventFilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventFilterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("eventFilterType")
  private EventFilterTypeEnum eventFilterType = null;

  public EventFilter marketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

   /**
   * Get marketplaceIds
   * @return marketplaceIds
  **/
  @ApiModelProperty(value = "")
  public MarketplaceIds getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public EventFilter orderChangeTypes(OrderChangeTypes orderChangeTypes) {
    this.orderChangeTypes = orderChangeTypes;
    return this;
  }

   /**
   * Get orderChangeTypes
   * @return orderChangeTypes
  **/
  @ApiModelProperty(value = "")
  public OrderChangeTypes getOrderChangeTypes() {
    return orderChangeTypes;
  }

  public void setOrderChangeTypes(OrderChangeTypes orderChangeTypes) {
    this.orderChangeTypes = orderChangeTypes;
  }

  public EventFilter eventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
    return this;
  }

   /**
   * An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.
   * @return eventFilterType
  **/
  @ApiModelProperty(required = true, value = "An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.")
  public EventFilterTypeEnum getEventFilterType() {
    return eventFilterType;
  }

  public void setEventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventFilter eventFilter = (EventFilter) o;
    return Objects.equals(this.marketplaceIds, eventFilter.marketplaceIds) &&
        Objects.equals(this.orderChangeTypes, eventFilter.orderChangeTypes) &&
        Objects.equals(this.eventFilterType, eventFilter.eventFilterType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceIds, orderChangeTypes, eventFilterType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    orderChangeTypes: ").append(toIndentedString(orderChangeTypes)).append("\n");
    sb.append("    eventFilterType: ").append(toIndentedString(eventFilterType)).append("\n");
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

