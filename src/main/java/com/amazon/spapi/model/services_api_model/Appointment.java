/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.AppointmentTime;
import com.amazon.spapi.model.services_api_model.Poa;
import com.amazon.spapi.model.services_api_model.Technician;
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
 * The details of an appointment.
 */
@ApiModel(description = "The details of an appointment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:40.519+08:00")
public class Appointment {
  @SerializedName("appointmentId")
  private String appointmentId = null;

  /**
   * The status of the appointment.
   */
  @JsonAdapter(AppointmentStatusEnum.Adapter.class)
  public enum AppointmentStatusEnum {
    ACTIVE("ACTIVE"),
    
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED");

    private String value;

    AppointmentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppointmentStatusEnum fromValue(String text) {
      for (AppointmentStatusEnum b : AppointmentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppointmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppointmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppointmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppointmentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("appointmentStatus")
  private AppointmentStatusEnum appointmentStatus = null;

  @SerializedName("appointmentTime")
  private AppointmentTime appointmentTime = null;

  @SerializedName("assignedTechnicians")
  private List<Technician> assignedTechnicians = null;

  @SerializedName("rescheduledAppointmentId")
  private String rescheduledAppointmentId = null;

  @SerializedName("poa")
  private Poa poa = null;

  public Appointment appointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
    return this;
  }

   /**
   * The appointment identifier.
   * @return appointmentId
  **/
  @ApiModelProperty(value = "The appointment identifier.")
  public String getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
  }

  public Appointment appointmentStatus(AppointmentStatusEnum appointmentStatus) {
    this.appointmentStatus = appointmentStatus;
    return this;
  }

   /**
   * The status of the appointment.
   * @return appointmentStatus
  **/
  @ApiModelProperty(value = "The status of the appointment.")
  public AppointmentStatusEnum getAppointmentStatus() {
    return appointmentStatus;
  }

  public void setAppointmentStatus(AppointmentStatusEnum appointmentStatus) {
    this.appointmentStatus = appointmentStatus;
  }

  public Appointment appointmentTime(AppointmentTime appointmentTime) {
    this.appointmentTime = appointmentTime;
    return this;
  }

   /**
   * The time of the appointment window.
   * @return appointmentTime
  **/
  @ApiModelProperty(value = "The time of the appointment window.")
  public AppointmentTime getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(AppointmentTime appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

  public Appointment assignedTechnicians(List<Technician> assignedTechnicians) {
    this.assignedTechnicians = assignedTechnicians;
    return this;
  }

  public Appointment addAssignedTechniciansItem(Technician assignedTechniciansItem) {
    if (this.assignedTechnicians == null) {
      this.assignedTechnicians = new ArrayList<Technician>();
    }
    this.assignedTechnicians.add(assignedTechniciansItem);
    return this;
  }

   /**
   * A list of technicians assigned to the service job.
   * @return assignedTechnicians
  **/
  @ApiModelProperty(value = "A list of technicians assigned to the service job.")
  public List<Technician> getAssignedTechnicians() {
    return assignedTechnicians;
  }

  public void setAssignedTechnicians(List<Technician> assignedTechnicians) {
    this.assignedTechnicians = assignedTechnicians;
  }

  public Appointment rescheduledAppointmentId(String rescheduledAppointmentId) {
    this.rescheduledAppointmentId = rescheduledAppointmentId;
    return this;
  }

   /**
   * The identifier of a rescheduled appointment.
   * @return rescheduledAppointmentId
  **/
  @ApiModelProperty(value = "The identifier of a rescheduled appointment.")
  public String getRescheduledAppointmentId() {
    return rescheduledAppointmentId;
  }

  public void setRescheduledAppointmentId(String rescheduledAppointmentId) {
    this.rescheduledAppointmentId = rescheduledAppointmentId;
  }

  public Appointment poa(Poa poa) {
    this.poa = poa;
    return this;
  }

   /**
   * Proof of Appointment (POA) details.
   * @return poa
  **/
  @ApiModelProperty(value = "Proof of Appointment (POA) details.")
  public Poa getPoa() {
    return poa;
  }

  public void setPoa(Poa poa) {
    this.poa = poa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.appointmentId, appointment.appointmentId) &&
        Objects.equals(this.appointmentStatus, appointment.appointmentStatus) &&
        Objects.equals(this.appointmentTime, appointment.appointmentTime) &&
        Objects.equals(this.assignedTechnicians, appointment.assignedTechnicians) &&
        Objects.equals(this.rescheduledAppointmentId, appointment.rescheduledAppointmentId) &&
        Objects.equals(this.poa, appointment.poa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentId, appointmentStatus, appointmentTime, assignedTechnicians, rescheduledAppointmentId, poa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    appointmentStatus: ").append(toIndentedString(appointmentStatus)).append("\n");
    sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
    sb.append("    assignedTechnicians: ").append(toIndentedString(assignedTechnicians)).append("\n");
    sb.append("    rescheduledAppointmentId: ").append(toIndentedString(rescheduledAppointmentId)).append("\n");
    sb.append("    poa: ").append(toIndentedString(poa)).append("\n");
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

