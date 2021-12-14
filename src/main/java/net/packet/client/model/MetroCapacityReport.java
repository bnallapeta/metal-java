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
import net.packet.client.model.CapacityPerFacility;

/**
 * MetroCapacityReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class MetroCapacityReport {
  @SerializedName("ny")
  private CapacityPerFacility ny = null;

  @SerializedName("sv")
  private CapacityPerFacility sv = null;

  @SerializedName("am")
  private CapacityPerFacility am = null;

  @SerializedName("ch")
  private CapacityPerFacility ch = null;

  @SerializedName("la")
  private CapacityPerFacility la = null;

  @SerializedName("sg")
  private CapacityPerFacility sg = null;

  @SerializedName("da")
  private CapacityPerFacility da = null;

  public MetroCapacityReport ny(CapacityPerFacility ny) {
    this.ny = ny;
    return this;
  }

   /**
   * Get ny
   * @return ny
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getNy() {
    return ny;
  }

  public void setNy(CapacityPerFacility ny) {
    this.ny = ny;
  }

  public MetroCapacityReport sv(CapacityPerFacility sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Get sv
   * @return sv
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getSv() {
    return sv;
  }

  public void setSv(CapacityPerFacility sv) {
    this.sv = sv;
  }

  public MetroCapacityReport am(CapacityPerFacility am) {
    this.am = am;
    return this;
  }

   /**
   * Get am
   * @return am
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getAm() {
    return am;
  }

  public void setAm(CapacityPerFacility am) {
    this.am = am;
  }

  public MetroCapacityReport ch(CapacityPerFacility ch) {
    this.ch = ch;
    return this;
  }

   /**
   * Get ch
   * @return ch
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getCh() {
    return ch;
  }

  public void setCh(CapacityPerFacility ch) {
    this.ch = ch;
  }

  public MetroCapacityReport la(CapacityPerFacility la) {
    this.la = la;
    return this;
  }

   /**
   * Get la
   * @return la
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getLa() {
    return la;
  }

  public void setLa(CapacityPerFacility la) {
    this.la = la;
  }

  public MetroCapacityReport sg(CapacityPerFacility sg) {
    this.sg = sg;
    return this;
  }

   /**
   * Get sg
   * @return sg
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getSg() {
    return sg;
  }

  public void setSg(CapacityPerFacility sg) {
    this.sg = sg;
  }

  public MetroCapacityReport da(CapacityPerFacility da) {
    this.da = da;
    return this;
  }

   /**
   * Get da
   * @return da
  **/
  @ApiModelProperty(value = "")
  public CapacityPerFacility getDa() {
    return da;
  }

  public void setDa(CapacityPerFacility da) {
    this.da = da;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetroCapacityReport metroCapacityReport = (MetroCapacityReport) o;
    return Objects.equals(this.ny, metroCapacityReport.ny) &&
        Objects.equals(this.sv, metroCapacityReport.sv) &&
        Objects.equals(this.am, metroCapacityReport.am) &&
        Objects.equals(this.ch, metroCapacityReport.ch) &&
        Objects.equals(this.la, metroCapacityReport.la) &&
        Objects.equals(this.sg, metroCapacityReport.sg) &&
        Objects.equals(this.da, metroCapacityReport.da);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ny, sv, am, ch, la, sg, da);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroCapacityReport {\n");
    
    sb.append("    ny: ").append(toIndentedString(ny)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    am: ").append(toIndentedString(am)).append("\n");
    sb.append("    ch: ").append(toIndentedString(ch)).append("\n");
    sb.append("    la: ").append(toIndentedString(la)).append("\n");
    sb.append("    sg: ").append(toIndentedString(sg)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
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

