/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.packet.client.model;

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
 * CapacityCheckPerFacilityInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class CapacityCheckPerFacilityInfo {
  @SerializedName("facility")
  private String facility = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("quantity")
  private String quantity = null;

  @SerializedName("available")
  private Boolean available = null;

  public CapacityCheckPerFacilityInfo facility(String facility) {
    this.facility = facility;
    return this;
  }

   /**
   * Get facility
   * @return facility
  **/
  @ApiModelProperty(value = "")
  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public CapacityCheckPerFacilityInfo plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public CapacityCheckPerFacilityInfo quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public CapacityCheckPerFacilityInfo available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityCheckPerFacilityInfo capacityCheckPerFacilityInfo = (CapacityCheckPerFacilityInfo) o;
    return Objects.equals(this.facility, capacityCheckPerFacilityInfo.facility) &&
        Objects.equals(this.plan, capacityCheckPerFacilityInfo.plan) &&
        Objects.equals(this.quantity, capacityCheckPerFacilityInfo.quantity) &&
        Objects.equals(this.available, capacityCheckPerFacilityInfo.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facility, plan, quantity, available);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityCheckPerFacilityInfo {\n");
    
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

