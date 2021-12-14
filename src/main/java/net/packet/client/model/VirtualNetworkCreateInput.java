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
import java.util.UUID;

/**
 * VirtualNetworkCreateInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class VirtualNetworkCreateInput {
  @SerializedName("project_id")
  private UUID projectId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("facility")
  private String facility = null;

  @SerializedName("metro")
  private String metro = null;

  @SerializedName("vxlan")
  private Integer vxlan = null;

  public VirtualNetworkCreateInput projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(required = true, value = "")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public VirtualNetworkCreateInput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VirtualNetworkCreateInput facility(String facility) {
    this.facility = facility;
    return this;
  }

   /**
   * The UUID (or facility code) for the Facility in which to create this Virtual network.
   * @return facility
  **/
  @ApiModelProperty(value = "The UUID (or facility code) for the Facility in which to create this Virtual network.")
  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public VirtualNetworkCreateInput metro(String metro) {
    this.metro = metro;
    return this;
  }

   /**
   * The UUID (or metro code) for the Metro in which to create this Virtual Network.
   * @return metro
  **/
  @ApiModelProperty(value = "The UUID (or metro code) for the Metro in which to create this Virtual Network.")
  public String getMetro() {
    return metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public VirtualNetworkCreateInput vxlan(Integer vxlan) {
    this.vxlan = vxlan;
    return this;
  }

   /**
   * VLAN ID between 2-3999. Must be unique for the project within the Metro in which this Virtual Network is being created. If no value is specified, the next-available VLAN ID in the range 1000-1999 will be automatically selected.
   * @return vxlan
  **/
  @ApiModelProperty(example = "1099", value = "VLAN ID between 2-3999. Must be unique for the project within the Metro in which this Virtual Network is being created. If no value is specified, the next-available VLAN ID in the range 1000-1999 will be automatically selected.")
  public Integer getVxlan() {
    return vxlan;
  }

  public void setVxlan(Integer vxlan) {
    this.vxlan = vxlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualNetworkCreateInput virtualNetworkCreateInput = (VirtualNetworkCreateInput) o;
    return Objects.equals(this.projectId, virtualNetworkCreateInput.projectId) &&
        Objects.equals(this.description, virtualNetworkCreateInput.description) &&
        Objects.equals(this.facility, virtualNetworkCreateInput.facility) &&
        Objects.equals(this.metro, virtualNetworkCreateInput.metro) &&
        Objects.equals(this.vxlan, virtualNetworkCreateInput.vxlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, description, facility, metro, vxlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualNetworkCreateInput {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    vxlan: ").append(toIndentedString(vxlan)).append("\n");
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

