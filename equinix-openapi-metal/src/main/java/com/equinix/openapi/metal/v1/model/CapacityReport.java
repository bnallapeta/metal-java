/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.metal.v1.model.CapacityPerFacility;
import com.equinix.openapi.metal.v1.model.CapacityPerNewFacility;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * CapacityReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CapacityReport {
  public static final String SERIALIZED_NAME_AMS1 = "ams1";
  @SerializedName(SERIALIZED_NAME_AMS1)
  private CapacityPerFacility ams1;

  public static final String SERIALIZED_NAME_ATL1 = "atl1";
  @SerializedName(SERIALIZED_NAME_ATL1)
  private CapacityPerNewFacility atl1;

  public static final String SERIALIZED_NAME_DFW1 = "dfw1";
  @SerializedName(SERIALIZED_NAME_DFW1)
  private CapacityPerNewFacility dfw1;

  public static final String SERIALIZED_NAME_EWR1 = "ewr1";
  @SerializedName(SERIALIZED_NAME_EWR1)
  private CapacityPerFacility ewr1;

  public static final String SERIALIZED_NAME_FRA1 = "fra1";
  @SerializedName(SERIALIZED_NAME_FRA1)
  private CapacityPerNewFacility fra1;

  public static final String SERIALIZED_NAME_IAD1 = "iad1";
  @SerializedName(SERIALIZED_NAME_IAD1)
  private CapacityPerNewFacility iad1;

  public static final String SERIALIZED_NAME_LAX1 = "lax1";
  @SerializedName(SERIALIZED_NAME_LAX1)
  private CapacityPerNewFacility lax1;

  public static final String SERIALIZED_NAME_NRT1 = "nrt1";
  @SerializedName(SERIALIZED_NAME_NRT1)
  private CapacityPerFacility nrt1;

  public static final String SERIALIZED_NAME_ORD1 = "ord1";
  @SerializedName(SERIALIZED_NAME_ORD1)
  private CapacityPerNewFacility ord1;

  public static final String SERIALIZED_NAME_SEA1 = "sea1";
  @SerializedName(SERIALIZED_NAME_SEA1)
  private CapacityPerNewFacility sea1;

  public static final String SERIALIZED_NAME_SIN1 = "sin1";
  @SerializedName(SERIALIZED_NAME_SIN1)
  private CapacityPerNewFacility sin1;

  public static final String SERIALIZED_NAME_SJC1 = "sjc1";
  @SerializedName(SERIALIZED_NAME_SJC1)
  private CapacityPerFacility sjc1;

  public static final String SERIALIZED_NAME_SYD1 = "syd1";
  @SerializedName(SERIALIZED_NAME_SYD1)
  private CapacityPerNewFacility syd1;

  public static final String SERIALIZED_NAME_YYZ1 = "yyz1";
  @SerializedName(SERIALIZED_NAME_YYZ1)
  private CapacityPerNewFacility yyz1;

  public CapacityReport() {
  }

  public CapacityReport ams1(CapacityPerFacility ams1) {
    
    this.ams1 = ams1;
    return this;
  }

   /**
   * Get ams1
   * @return ams1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getAms1() {
    return ams1;
  }


  public void setAms1(CapacityPerFacility ams1) {
    this.ams1 = ams1;
  }


  public CapacityReport atl1(CapacityPerNewFacility atl1) {
    
    this.atl1 = atl1;
    return this;
  }

   /**
   * Get atl1
   * @return atl1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getAtl1() {
    return atl1;
  }


  public void setAtl1(CapacityPerNewFacility atl1) {
    this.atl1 = atl1;
  }


  public CapacityReport dfw1(CapacityPerNewFacility dfw1) {
    
    this.dfw1 = dfw1;
    return this;
  }

   /**
   * Get dfw1
   * @return dfw1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getDfw1() {
    return dfw1;
  }


  public void setDfw1(CapacityPerNewFacility dfw1) {
    this.dfw1 = dfw1;
  }


  public CapacityReport ewr1(CapacityPerFacility ewr1) {
    
    this.ewr1 = ewr1;
    return this;
  }

   /**
   * Get ewr1
   * @return ewr1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getEwr1() {
    return ewr1;
  }


  public void setEwr1(CapacityPerFacility ewr1) {
    this.ewr1 = ewr1;
  }


  public CapacityReport fra1(CapacityPerNewFacility fra1) {
    
    this.fra1 = fra1;
    return this;
  }

   /**
   * Get fra1
   * @return fra1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getFra1() {
    return fra1;
  }


  public void setFra1(CapacityPerNewFacility fra1) {
    this.fra1 = fra1;
  }


  public CapacityReport iad1(CapacityPerNewFacility iad1) {
    
    this.iad1 = iad1;
    return this;
  }

   /**
   * Get iad1
   * @return iad1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getIad1() {
    return iad1;
  }


  public void setIad1(CapacityPerNewFacility iad1) {
    this.iad1 = iad1;
  }


  public CapacityReport lax1(CapacityPerNewFacility lax1) {
    
    this.lax1 = lax1;
    return this;
  }

   /**
   * Get lax1
   * @return lax1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getLax1() {
    return lax1;
  }


  public void setLax1(CapacityPerNewFacility lax1) {
    this.lax1 = lax1;
  }


  public CapacityReport nrt1(CapacityPerFacility nrt1) {
    
    this.nrt1 = nrt1;
    return this;
  }

   /**
   * Get nrt1
   * @return nrt1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getNrt1() {
    return nrt1;
  }


  public void setNrt1(CapacityPerFacility nrt1) {
    this.nrt1 = nrt1;
  }


  public CapacityReport ord1(CapacityPerNewFacility ord1) {
    
    this.ord1 = ord1;
    return this;
  }

   /**
   * Get ord1
   * @return ord1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getOrd1() {
    return ord1;
  }


  public void setOrd1(CapacityPerNewFacility ord1) {
    this.ord1 = ord1;
  }


  public CapacityReport sea1(CapacityPerNewFacility sea1) {
    
    this.sea1 = sea1;
    return this;
  }

   /**
   * Get sea1
   * @return sea1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getSea1() {
    return sea1;
  }


  public void setSea1(CapacityPerNewFacility sea1) {
    this.sea1 = sea1;
  }


  public CapacityReport sin1(CapacityPerNewFacility sin1) {
    
    this.sin1 = sin1;
    return this;
  }

   /**
   * Get sin1
   * @return sin1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getSin1() {
    return sin1;
  }


  public void setSin1(CapacityPerNewFacility sin1) {
    this.sin1 = sin1;
  }


  public CapacityReport sjc1(CapacityPerFacility sjc1) {
    
    this.sjc1 = sjc1;
    return this;
  }

   /**
   * Get sjc1
   * @return sjc1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSjc1() {
    return sjc1;
  }


  public void setSjc1(CapacityPerFacility sjc1) {
    this.sjc1 = sjc1;
  }


  public CapacityReport syd1(CapacityPerNewFacility syd1) {
    
    this.syd1 = syd1;
    return this;
  }

   /**
   * Get syd1
   * @return syd1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getSyd1() {
    return syd1;
  }


  public void setSyd1(CapacityPerNewFacility syd1) {
    this.syd1 = syd1;
  }


  public CapacityReport yyz1(CapacityPerNewFacility yyz1) {
    
    this.yyz1 = yyz1;
    return this;
  }

   /**
   * Get yyz1
   * @return yyz1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerNewFacility getYyz1() {
    return yyz1;
  }


  public void setYyz1(CapacityPerNewFacility yyz1) {
    this.yyz1 = yyz1;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public CapacityReport putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityReport capacityReport = (CapacityReport) o;
    return Objects.equals(this.ams1, capacityReport.ams1) &&
        Objects.equals(this.atl1, capacityReport.atl1) &&
        Objects.equals(this.dfw1, capacityReport.dfw1) &&
        Objects.equals(this.ewr1, capacityReport.ewr1) &&
        Objects.equals(this.fra1, capacityReport.fra1) &&
        Objects.equals(this.iad1, capacityReport.iad1) &&
        Objects.equals(this.lax1, capacityReport.lax1) &&
        Objects.equals(this.nrt1, capacityReport.nrt1) &&
        Objects.equals(this.ord1, capacityReport.ord1) &&
        Objects.equals(this.sea1, capacityReport.sea1) &&
        Objects.equals(this.sin1, capacityReport.sin1) &&
        Objects.equals(this.sjc1, capacityReport.sjc1) &&
        Objects.equals(this.syd1, capacityReport.syd1) &&
        Objects.equals(this.yyz1, capacityReport.yyz1)&&
        Objects.equals(this.additionalProperties, capacityReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ams1, atl1, dfw1, ewr1, fra1, iad1, lax1, nrt1, ord1, sea1, sin1, sjc1, syd1, yyz1, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityReport {\n");
    sb.append("    ams1: ").append(toIndentedString(ams1)).append("\n");
    sb.append("    atl1: ").append(toIndentedString(atl1)).append("\n");
    sb.append("    dfw1: ").append(toIndentedString(dfw1)).append("\n");
    sb.append("    ewr1: ").append(toIndentedString(ewr1)).append("\n");
    sb.append("    fra1: ").append(toIndentedString(fra1)).append("\n");
    sb.append("    iad1: ").append(toIndentedString(iad1)).append("\n");
    sb.append("    lax1: ").append(toIndentedString(lax1)).append("\n");
    sb.append("    nrt1: ").append(toIndentedString(nrt1)).append("\n");
    sb.append("    ord1: ").append(toIndentedString(ord1)).append("\n");
    sb.append("    sea1: ").append(toIndentedString(sea1)).append("\n");
    sb.append("    sin1: ").append(toIndentedString(sin1)).append("\n");
    sb.append("    sjc1: ").append(toIndentedString(sjc1)).append("\n");
    sb.append("    syd1: ").append(toIndentedString(syd1)).append("\n");
    sb.append("    yyz1: ").append(toIndentedString(yyz1)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ams1");
    openapiFields.add("atl1");
    openapiFields.add("dfw1");
    openapiFields.add("ewr1");
    openapiFields.add("fra1");
    openapiFields.add("iad1");
    openapiFields.add("lax1");
    openapiFields.add("nrt1");
    openapiFields.add("ord1");
    openapiFields.add("sea1");
    openapiFields.add("sin1");
    openapiFields.add("sjc1");
    openapiFields.add("syd1");
    openapiFields.add("yyz1");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CapacityReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CapacityReport.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapacityReport is not found in the empty JSON string", CapacityReport.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ams1`
      if (jsonObj.get("ams1") != null && !jsonObj.get("ams1").isJsonNull()) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ams1"));
      }
      // validate the optional field `atl1`
      if (jsonObj.get("atl1") != null && !jsonObj.get("atl1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("atl1"));
      }
      // validate the optional field `dfw1`
      if (jsonObj.get("dfw1") != null && !jsonObj.get("dfw1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("dfw1"));
      }
      // validate the optional field `ewr1`
      if (jsonObj.get("ewr1") != null && !jsonObj.get("ewr1").isJsonNull()) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ewr1"));
      }
      // validate the optional field `fra1`
      if (jsonObj.get("fra1") != null && !jsonObj.get("fra1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("fra1"));
      }
      // validate the optional field `iad1`
      if (jsonObj.get("iad1") != null && !jsonObj.get("iad1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("iad1"));
      }
      // validate the optional field `lax1`
      if (jsonObj.get("lax1") != null && !jsonObj.get("lax1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("lax1"));
      }
      // validate the optional field `nrt1`
      if (jsonObj.get("nrt1") != null && !jsonObj.get("nrt1").isJsonNull()) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("nrt1"));
      }
      // validate the optional field `ord1`
      if (jsonObj.get("ord1") != null && !jsonObj.get("ord1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("ord1"));
      }
      // validate the optional field `sea1`
      if (jsonObj.get("sea1") != null && !jsonObj.get("sea1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("sea1"));
      }
      // validate the optional field `sin1`
      if (jsonObj.get("sin1") != null && !jsonObj.get("sin1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("sin1"));
      }
      // validate the optional field `sjc1`
      if (jsonObj.get("sjc1") != null && !jsonObj.get("sjc1").isJsonNull()) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sjc1"));
      }
      // validate the optional field `syd1`
      if (jsonObj.get("syd1") != null && !jsonObj.get("syd1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("syd1"));
      }
      // validate the optional field `yyz1`
      if (jsonObj.get("yyz1") != null && !jsonObj.get("yyz1").isJsonNull()) {
        CapacityPerNewFacility.validateJsonObject(jsonObj.getAsJsonObject("yyz1"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapacityReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapacityReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapacityReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapacityReport.class));

       return (TypeAdapter<T>) new TypeAdapter<CapacityReport>() {
           @Override
           public void write(JsonWriter out, CapacityReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CapacityReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CapacityReport instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CapacityReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapacityReport
  * @throws IOException if the JSON string is invalid with respect to CapacityReport
  */
  public static CapacityReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapacityReport.class);
  }

 /**
  * Convert an instance of CapacityReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

