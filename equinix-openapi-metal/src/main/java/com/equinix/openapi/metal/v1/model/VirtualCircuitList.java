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
import com.equinix.openapi.metal.v1.model.VirtualCircuitListVirtualCircuitsInner;
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
 * VirtualCircuitList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualCircuitList {
  public static final String SERIALIZED_NAME_VIRTUAL_CIRCUITS = "virtual_circuits";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_CIRCUITS)
  private List<VirtualCircuitListVirtualCircuitsInner> virtualCircuits = null;

  public VirtualCircuitList() { 
  }

  public VirtualCircuitList virtualCircuits(List<VirtualCircuitListVirtualCircuitsInner> virtualCircuits) {
    
    this.virtualCircuits = virtualCircuits;
    return this;
  }

  public VirtualCircuitList addVirtualCircuitsItem(VirtualCircuitListVirtualCircuitsInner virtualCircuitsItem) {
    if (this.virtualCircuits == null) {
      this.virtualCircuits = new ArrayList<>();
    }
    this.virtualCircuits.add(virtualCircuitsItem);
    return this;
  }

   /**
   * Get virtualCircuits
   * @return virtualCircuits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualCircuitListVirtualCircuitsInner> getVirtualCircuits() {
    return virtualCircuits;
  }


  public void setVirtualCircuits(List<VirtualCircuitListVirtualCircuitsInner> virtualCircuits) {
    this.virtualCircuits = virtualCircuits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualCircuitList virtualCircuitList = (VirtualCircuitList) o;
    return Objects.equals(this.virtualCircuits, virtualCircuitList.virtualCircuits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualCircuits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualCircuitList {\n");
    sb.append("    virtualCircuits: ").append(toIndentedString(virtualCircuits)).append("\n");
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
    openapiFields.add("virtual_circuits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VirtualCircuitList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VirtualCircuitList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualCircuitList is not found in the empty JSON string", VirtualCircuitList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VirtualCircuitList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VirtualCircuitList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayvirtualCircuits = jsonObj.getAsJsonArray("virtual_circuits");
      if (jsonArrayvirtualCircuits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("virtual_circuits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `virtual_circuits` to be an array in the JSON string but got `%s`", jsonObj.get("virtual_circuits").toString()));
        }

        // validate the optional field `virtual_circuits` (array)
        for (int i = 0; i < jsonArrayvirtualCircuits.size(); i++) {
          VirtualCircuitListVirtualCircuitsInner.validateJsonObject(jsonArrayvirtualCircuits.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualCircuitList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualCircuitList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualCircuitList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualCircuitList.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualCircuitList>() {
           @Override
           public void write(JsonWriter out, VirtualCircuitList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VirtualCircuitList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VirtualCircuitList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualCircuitList
  * @throws IOException if the JSON string is invalid with respect to VirtualCircuitList
  */
  public static VirtualCircuitList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualCircuitList.class);
  }

 /**
  * Convert an instance of VirtualCircuitList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
