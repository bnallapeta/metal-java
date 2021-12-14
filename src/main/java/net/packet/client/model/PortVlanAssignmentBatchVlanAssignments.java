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
 * PortVlanAssignmentBatchVlanAssignments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class PortVlanAssignmentBatchVlanAssignments {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("vlan")
  private Integer vlan = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ASSIGNED("assigned"),
    
    UNASSIGNED("unassigned");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("native")
  private Boolean _native = null;

  public PortVlanAssignmentBatchVlanAssignments id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PortVlanAssignmentBatchVlanAssignments vlan(Integer vlan) {
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @ApiModelProperty(value = "")
  public Integer getVlan() {
    return vlan;
  }

  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }

  public PortVlanAssignmentBatchVlanAssignments state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PortVlanAssignmentBatchVlanAssignments _native(Boolean _native) {
    this._native = _native;
    return this;
  }

   /**
   * Get _native
   * @return _native
  **/
  @ApiModelProperty(value = "")
  public Boolean isNative() {
    return _native;
  }

  public void setNative(Boolean _native) {
    this._native = _native;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortVlanAssignmentBatchVlanAssignments portVlanAssignmentBatchVlanAssignments = (PortVlanAssignmentBatchVlanAssignments) o;
    return Objects.equals(this.id, portVlanAssignmentBatchVlanAssignments.id) &&
        Objects.equals(this.vlan, portVlanAssignmentBatchVlanAssignments.vlan) &&
        Objects.equals(this.state, portVlanAssignmentBatchVlanAssignments.state) &&
        Objects.equals(this._native, portVlanAssignmentBatchVlanAssignments._native);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vlan, state, _native);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortVlanAssignmentBatchVlanAssignments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    _native: ").append(toIndentedString(_native)).append("\n");
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

