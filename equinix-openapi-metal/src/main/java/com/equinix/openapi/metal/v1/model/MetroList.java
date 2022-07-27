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
import com.equinix.openapi.metal.v1.model.Metro;
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
 * MetroList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetroList {
  public static final String SERIALIZED_NAME_METROS = "metros";
  @SerializedName(SERIALIZED_NAME_METROS)
  private List<Metro> metros = null;

  public MetroList() { 
  }

  public MetroList metros(List<Metro> metros) {
    
    this.metros = metros;
    return this;
  }

  public MetroList addMetrosItem(Metro metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<>();
    }
    this.metros.add(metrosItem);
    return this;
  }

   /**
   * Get metros
   * @return metros
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Metro> getMetros() {
    return metros;
  }


  public void setMetros(List<Metro> metros) {
    this.metros = metros;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetroList metroList = (MetroList) o;
    return Objects.equals(this.metros, metroList.metros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroList {\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
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
    openapiFields.add("metros");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetroList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetroList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetroList is not found in the empty JSON string", MetroList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetroList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetroList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymetros = jsonObj.getAsJsonArray("metros");
      if (jsonArraymetros != null) {
        // ensure the json data is an array
        if (!jsonObj.get("metros").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `metros` to be an array in the JSON string but got `%s`", jsonObj.get("metros").toString()));
        }

        // validate the optional field `metros` (array)
        for (int i = 0; i < jsonArraymetros.size(); i++) {
          Metro.validateJsonObject(jsonArraymetros.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetroList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetroList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetroList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetroList.class));

       return (TypeAdapter<T>) new TypeAdapter<MetroList>() {
           @Override
           public void write(JsonWriter out, MetroList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetroList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetroList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetroList
  * @throws IOException if the JSON string is invalid with respect to MetroList
  */
  public static MetroList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetroList.class);
  }

 /**
  * Convert an instance of MetroList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
