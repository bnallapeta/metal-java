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
 * IPAssignmentInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class IPAssignmentInput {
  @SerializedName("address")
  private String address = null;

  @SerializedName("manageable")
  private Boolean manageable = null;

  @SerializedName("customdata")
  private Object customdata = null;

  public IPAssignmentInput address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IPAssignmentInput manageable(Boolean manageable) {
    this.manageable = manageable;
    return this;
  }

   /**
   * Get manageable
   * @return manageable
  **/
  @ApiModelProperty(value = "")
  public Boolean isManageable() {
    return manageable;
  }

  public void setManageable(Boolean manageable) {
    this.manageable = manageable;
  }

  public IPAssignmentInput customdata(Object customdata) {
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @ApiModelProperty(value = "")
  public Object getCustomdata() {
    return customdata;
  }

  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAssignmentInput ipAssignmentInput = (IPAssignmentInput) o;
    return Objects.equals(this.address, ipAssignmentInput.address) &&
        Objects.equals(this.manageable, ipAssignmentInput.manageable) &&
        Objects.equals(this.customdata, ipAssignmentInput.customdata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, manageable, customdata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAssignmentInput {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
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

