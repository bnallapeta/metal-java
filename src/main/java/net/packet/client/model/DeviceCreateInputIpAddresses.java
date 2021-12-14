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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DeviceCreateInputIpAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class DeviceCreateInputIpAddresses {
  @SerializedName("address_family")
  private BigDecimal addressFamily = null;

  @SerializedName("public")
  private Boolean _public = true;

  @SerializedName("cidr")
  private BigDecimal cidr = null;

  @SerializedName("ip_reservations")
  private List<String> ipReservations = null;

  public DeviceCreateInputIpAddresses addressFamily(BigDecimal addressFamily) {
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Address Family for IP Address
   * @return addressFamily
  **/
  @ApiModelProperty(example = "4.0", value = "Address Family for IP Address")
  public BigDecimal getAddressFamily() {
    return addressFamily;
  }

  public void setAddressFamily(BigDecimal addressFamily) {
    this.addressFamily = addressFamily;
  }

  public DeviceCreateInputIpAddresses _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Address Type for IP Address
   * @return _public
  **/
  @ApiModelProperty(example = "false", value = "Address Type for IP Address")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public DeviceCreateInputIpAddresses cidr(BigDecimal cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Cidr Size for the IP Block created. Valid values depends on the operating system being provisioned. (28..32 for IPv4 addresses, 124..127 for IPv6 addresses)
   * @return cidr
  **/
  @ApiModelProperty(example = "28.0", value = "Cidr Size for the IP Block created. Valid values depends on the operating system being provisioned. (28..32 for IPv4 addresses, 124..127 for IPv6 addresses)")
  public BigDecimal getCidr() {
    return cidr;
  }

  public void setCidr(BigDecimal cidr) {
    this.cidr = cidr;
  }

  public DeviceCreateInputIpAddresses ipReservations(List<String> ipReservations) {
    this.ipReservations = ipReservations;
    return this;
  }

  public DeviceCreateInputIpAddresses addIpReservationsItem(String ipReservationsItem) {
    if (this.ipReservations == null) {
      this.ipReservations = new ArrayList<String>();
    }
    this.ipReservations.add(ipReservationsItem);
    return this;
  }

   /**
   * UUIDs of any IP reservations to use when assigning IPs
   * @return ipReservations
  **/
  @ApiModelProperty(value = "UUIDs of any IP reservations to use when assigning IPs")
  public List<String> getIpReservations() {
    return ipReservations;
  }

  public void setIpReservations(List<String> ipReservations) {
    this.ipReservations = ipReservations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCreateInputIpAddresses deviceCreateInputIpAddresses = (DeviceCreateInputIpAddresses) o;
    return Objects.equals(this.addressFamily, deviceCreateInputIpAddresses.addressFamily) &&
        Objects.equals(this._public, deviceCreateInputIpAddresses._public) &&
        Objects.equals(this.cidr, deviceCreateInputIpAddresses.cidr) &&
        Objects.equals(this.ipReservations, deviceCreateInputIpAddresses.ipReservations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFamily, _public, cidr, ipReservations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCreateInputIpAddresses {\n");
    
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    ipReservations: ").append(toIndentedString(ipReservations)).append("\n");
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

