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
import com.equinix.openapi.metal.v1.model.IPAssignment;
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
 * IPAssignmentList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IPAssignmentList {
  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<IPAssignment> ipAddresses = null;

  public IPAssignmentList() {
  }

  public IPAssignmentList ipAddresses(List<IPAssignment> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public IPAssignmentList addIpAddressesItem(IPAssignment ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IPAssignment> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<IPAssignment> ipAddresses) {
    this.ipAddresses = ipAddresses;
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
  public IPAssignmentList putAdditionalProperty(String key, Object value) {
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
    IPAssignmentList ipAssignmentList = (IPAssignmentList) o;
    return Objects.equals(this.ipAddresses, ipAssignmentList.ipAddresses)&&
        Objects.equals(this.additionalProperties, ipAssignmentList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAssignmentList {\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
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
    openapiFields.add("ip_addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IPAssignmentList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IPAssignmentList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAssignmentList is not found in the empty JSON string", IPAssignmentList.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("ip_addresses") != null && !jsonObj.get("ip_addresses").isJsonNull()) {
        JsonArray jsonArrayipAddresses = jsonObj.getAsJsonArray("ip_addresses");
        if (jsonArrayipAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ip_addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ip_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("ip_addresses").toString()));
          }

          // validate the optional field `ip_addresses` (array)
          for (int i = 0; i < jsonArrayipAddresses.size(); i++) {
            IPAssignment.validateJsonObject(jsonArrayipAddresses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAssignmentList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAssignmentList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAssignmentList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAssignmentList.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAssignmentList>() {
           @Override
           public void write(JsonWriter out, IPAssignmentList value) throws IOException {
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
           public IPAssignmentList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IPAssignmentList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IPAssignmentList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPAssignmentList
  * @throws IOException if the JSON string is invalid with respect to IPAssignmentList
  */
  public static IPAssignmentList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAssignmentList.class);
  }

 /**
  * Convert an instance of IPAssignmentList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

