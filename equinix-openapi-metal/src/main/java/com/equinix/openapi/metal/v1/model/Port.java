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
import com.equinix.openapi.metal.v1.model.Href;
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
import java.util.UUID;

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
 * Port
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Port {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_DISBOND_OPERATION_SUPPORTED = "disbond_operation_supported";
  @SerializedName(SERIALIZED_NAME_DISBOND_OPERATION_SUPPORTED)
  private Boolean disbondOperationSupported;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VIRTUAL_NETWORKS = "virtual_networks";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_NETWORKS)
  private List<Href> virtualNetworks = null;

  public Port() { 
  }

  public Port data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public Port disbondOperationSupported(Boolean disbondOperationSupported) {
    
    this.disbondOperationSupported = disbondOperationSupported;
    return this;
  }

   /**
   * Indicates whether or not the bond can be broken on the port (when applicable).
   * @return disbondOperationSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not the bond can be broken on the port (when applicable).")

  public Boolean getDisbondOperationSupported() {
    return disbondOperationSupported;
  }


  public void setDisbondOperationSupported(Boolean disbondOperationSupported) {
    this.disbondOperationSupported = disbondOperationSupported;
  }


  public Port href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public Port id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Port name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Port type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Port virtualNetworks(List<Href> virtualNetworks) {
    
    this.virtualNetworks = virtualNetworks;
    return this;
  }

  public Port addVirtualNetworksItem(Href virtualNetworksItem) {
    if (this.virtualNetworks == null) {
      this.virtualNetworks = new ArrayList<>();
    }
    this.virtualNetworks.add(virtualNetworksItem);
    return this;
  }

   /**
   * Get virtualNetworks
   * @return virtualNetworks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getVirtualNetworks() {
    return virtualNetworks;
  }


  public void setVirtualNetworks(List<Href> virtualNetworks) {
    this.virtualNetworks = virtualNetworks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Port port = (Port) o;
    return Objects.equals(this.data, port.data) &&
        Objects.equals(this.disbondOperationSupported, port.disbondOperationSupported) &&
        Objects.equals(this.href, port.href) &&
        Objects.equals(this.id, port.id) &&
        Objects.equals(this.name, port.name) &&
        Objects.equals(this.type, port.type) &&
        Objects.equals(this.virtualNetworks, port.virtualNetworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, disbondOperationSupported, href, id, name, type, virtualNetworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Port {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    disbondOperationSupported: ").append(toIndentedString(disbondOperationSupported)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    virtualNetworks: ").append(toIndentedString(virtualNetworks)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("disbond_operation_supported");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("virtual_networks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Port
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Port.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Port is not found in the empty JSON string", Port.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Port.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Port` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("href") != null && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      JsonArray jsonArrayvirtualNetworks = jsonObj.getAsJsonArray("virtual_networks");
      if (jsonArrayvirtualNetworks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("virtual_networks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `virtual_networks` to be an array in the JSON string but got `%s`", jsonObj.get("virtual_networks").toString()));
        }

        // validate the optional field `virtual_networks` (array)
        for (int i = 0; i < jsonArrayvirtualNetworks.size(); i++) {
          Href.validateJsonObject(jsonArrayvirtualNetworks.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Port.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Port' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Port> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Port.class));

       return (TypeAdapter<T>) new TypeAdapter<Port>() {
           @Override
           public void write(JsonWriter out, Port value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Port read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Port given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Port
  * @throws IOException if the JSON string is invalid with respect to Port
  */
  public static Port fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Port.class);
  }

 /**
  * Convert an instance of Port to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
