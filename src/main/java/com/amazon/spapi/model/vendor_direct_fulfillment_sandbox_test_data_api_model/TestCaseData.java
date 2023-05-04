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
import com.amazon.spapi.model.vendor_direct_fulfillment_sandbox_test_data_api_model.Scenario;
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
 * The set of test case data returned in response to the test data request.
 */
@ApiModel(description = "The set of test case data returned in response to the test data request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T21:37:54.575-04:00")
public class TestCaseData {
  @SerializedName("scenarios")
  private List<Scenario> scenarios = null;

  public TestCaseData scenarios(List<Scenario> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  public TestCaseData addScenariosItem(Scenario scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<Scenario>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

   /**
   * Set of use cases that describes the possible test scenarios.
   * @return scenarios
  **/
  @ApiModelProperty(value = "Set of use cases that describes the possible test scenarios.")
  public List<Scenario> getScenarios() {
    return scenarios;
  }

  public void setScenarios(List<Scenario> scenarios) {
    this.scenarios = scenarios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseData testCaseData = (TestCaseData) o;
    return Objects.equals(this.scenarios, testCaseData.scenarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarios);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseData {\n");
    
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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

