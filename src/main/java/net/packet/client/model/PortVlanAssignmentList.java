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
import java.util.ArrayList;
import java.util.List;
import net.packet.client.model.PortVlanAssignment;

/**
 * PortVlanAssignmentList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class PortVlanAssignmentList {
  @SerializedName("vlan_assignments")
  private List<PortVlanAssignment> vlanAssignments = null;

  public PortVlanAssignmentList vlanAssignments(List<PortVlanAssignment> vlanAssignments) {
    this.vlanAssignments = vlanAssignments;
    return this;
  }

  public PortVlanAssignmentList addVlanAssignmentsItem(PortVlanAssignment vlanAssignmentsItem) {
    if (this.vlanAssignments == null) {
      this.vlanAssignments = new ArrayList<PortVlanAssignment>();
    }
    this.vlanAssignments.add(vlanAssignmentsItem);
    return this;
  }

   /**
   * Get vlanAssignments
   * @return vlanAssignments
  **/
  @ApiModelProperty(value = "")
  public List<PortVlanAssignment> getVlanAssignments() {
    return vlanAssignments;
  }

  public void setVlanAssignments(List<PortVlanAssignment> vlanAssignments) {
    this.vlanAssignments = vlanAssignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortVlanAssignmentList portVlanAssignmentList = (PortVlanAssignmentList) o;
    return Objects.equals(this.vlanAssignments, portVlanAssignmentList.vlanAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlanAssignments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortVlanAssignmentList {\n");
    
    sb.append("    vlanAssignments: ").append(toIndentedString(vlanAssignments)).append("\n");
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

