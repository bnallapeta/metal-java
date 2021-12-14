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
 * SelfServiceReservationItemRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-14T20:42:56.777Z")
public class SelfServiceReservationItemRequest {
  @SerializedName("metro_id")
  private UUID metroId = null;

  @SerializedName("plan_id")
  private UUID planId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("term")
  private String term = null;

  public SelfServiceReservationItemRequest metroId(UUID metroId) {
    this.metroId = metroId;
    return this;
  }

   /**
   * Get metroId
   * @return metroId
  **/
  @ApiModelProperty(value = "")
  public UUID getMetroId() {
    return metroId;
  }

  public void setMetroId(UUID metroId) {
    this.metroId = metroId;
  }

  public SelfServiceReservationItemRequest planId(UUID planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(value = "")
  public UUID getPlanId() {
    return planId;
  }

  public void setPlanId(UUID planId) {
    this.planId = planId;
  }

  public SelfServiceReservationItemRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SelfServiceReservationItemRequest amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public SelfServiceReservationItemRequest term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfServiceReservationItemRequest selfServiceReservationItemRequest = (SelfServiceReservationItemRequest) o;
    return Objects.equals(this.metroId, selfServiceReservationItemRequest.metroId) &&
        Objects.equals(this.planId, selfServiceReservationItemRequest.planId) &&
        Objects.equals(this.quantity, selfServiceReservationItemRequest.quantity) &&
        Objects.equals(this.amount, selfServiceReservationItemRequest.amount) &&
        Objects.equals(this.term, selfServiceReservationItemRequest.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metroId, planId, quantity, amount, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfServiceReservationItemRequest {\n");
    
    sb.append("    metroId: ").append(toIndentedString(metroId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

