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
 * MetalGatewayInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class MetalGatewayInput {
  @SerializedName("virtual_network_id")
  private UUID virtualNetworkId = null;

  @SerializedName("ip_reservation_id")
  private UUID ipReservationId = null;

  @SerializedName("private_ipv4_subnet_size")
  private Integer privateIpv4SubnetSize = null;

  public MetalGatewayInput virtualNetworkId(UUID virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
    return this;
  }

   /**
   * The UUID of a metro virtual network that belongs to the same project as where the metal gateway will be created in.
   * @return virtualNetworkId
  **/
  @ApiModelProperty(required = true, value = "The UUID of a metro virtual network that belongs to the same project as where the metal gateway will be created in.")
  public UUID getVirtualNetworkId() {
    return virtualNetworkId;
  }

  public void setVirtualNetworkId(UUID virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }

  public MetalGatewayInput ipReservationId(UUID ipReservationId) {
    this.ipReservationId = ipReservationId;
    return this;
  }

   /**
   * The UUID of an IP reservation that belongs to the same project as where the metal gateway will be created in. This field is required unless the private IPv4 subnet size is specified.
   * @return ipReservationId
  **/
  @ApiModelProperty(value = "The UUID of an IP reservation that belongs to the same project as where the metal gateway will be created in. This field is required unless the private IPv4 subnet size is specified.")
  public UUID getIpReservationId() {
    return ipReservationId;
  }

  public void setIpReservationId(UUID ipReservationId) {
    this.ipReservationId = ipReservationId;
  }

  public MetalGatewayInput privateIpv4SubnetSize(Integer privateIpv4SubnetSize) {
    this.privateIpv4SubnetSize = privateIpv4SubnetSize;
    return this;
  }

   /**
   * The subnet size (8, 16, 32, 64, or 128) of the private IPv4 reservation that will be created for the metal gateway. This field is required unless a project IP reservation was specified.           Please keep in mind that the number of private metal gateway ranges are limited per project. If you would like to increase the limit per project, please contact support for assistance.
   * @return privateIpv4SubnetSize
  **/
  @ApiModelProperty(value = "The subnet size (8, 16, 32, 64, or 128) of the private IPv4 reservation that will be created for the metal gateway. This field is required unless a project IP reservation was specified.           Please keep in mind that the number of private metal gateway ranges are limited per project. If you would like to increase the limit per project, please contact support for assistance.")
  public Integer getPrivateIpv4SubnetSize() {
    return privateIpv4SubnetSize;
  }

  public void setPrivateIpv4SubnetSize(Integer privateIpv4SubnetSize) {
    this.privateIpv4SubnetSize = privateIpv4SubnetSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetalGatewayInput metalGatewayInput = (MetalGatewayInput) o;
    return Objects.equals(this.virtualNetworkId, metalGatewayInput.virtualNetworkId) &&
        Objects.equals(this.ipReservationId, metalGatewayInput.ipReservationId) &&
        Objects.equals(this.privateIpv4SubnetSize, metalGatewayInput.privateIpv4SubnetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNetworkId, ipReservationId, privateIpv4SubnetSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetalGatewayInput {\n");
    
    sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
    sb.append("    ipReservationId: ").append(toIndentedString(ipReservationId)).append("\n");
    sb.append("    privateIpv4SubnetSize: ").append(toIndentedString(privateIpv4SubnetSize)).append("\n");
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

