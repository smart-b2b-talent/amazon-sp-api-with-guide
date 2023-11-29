/*
 * Selling Partner API for Vendor Direct Fulfillment Sandbox Test Data
 * The Selling Partner API for Vendor Direct Fulfillment Sandbox Test Data provides programmatic access to vendor direct fulfillment sandbox test data.
 *
 * OpenAPI spec version: 2021-10-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_sandbox_test_data_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_sandbox_test_data_api_model.TestOrder;
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
 * A scenario test case response returned when the request is successful.
 */
@ApiModel(description = "A scenario test case response returned when the request is successful.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:12:06.074+08:00")
public class Scenario {
  @SerializedName("scenarioId")
  private String scenarioId = null;

  @SerializedName("orders")
  private List<TestOrder> orders = new ArrayList<TestOrder>();

  public Scenario scenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * An identifier that identifies the type of scenario that user can use for testing.
   * @return scenarioId
  **/
  @ApiModelProperty(required = true, value = "An identifier that identifies the type of scenario that user can use for testing.")
  public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }

  public Scenario orders(List<TestOrder> orders) {
    this.orders = orders;
    return this;
  }

  public Scenario addOrdersItem(TestOrder ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * A list of orders that can be used by the caller to test each life cycle or scenario.
   * @return orders
  **/
  @ApiModelProperty(required = true, value = "A list of orders that can be used by the caller to test each life cycle or scenario.")
  public List<TestOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<TestOrder> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scenario scenario = (Scenario) o;
    return Objects.equals(this.scenarioId, scenario.scenarioId) &&
        Objects.equals(this.orders, scenario.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scenario {\n");
    
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

