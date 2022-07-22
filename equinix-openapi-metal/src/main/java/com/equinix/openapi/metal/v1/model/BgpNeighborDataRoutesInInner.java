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
 * BgpNeighborDataRoutesInInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BgpNeighborDataRoutesInInner {
  public static final String SERIALIZED_NAME_EXACT = "exact";
  @SerializedName(SERIALIZED_NAME_EXACT)
  private Boolean exact;

  public static final String SERIALIZED_NAME_ROUTE = "route";
  @SerializedName(SERIALIZED_NAME_ROUTE)
  private String route;

  public BgpNeighborDataRoutesInInner() { 
  }

  public BgpNeighborDataRoutesInInner exact(Boolean exact) {
    
    this.exact = exact;
    return this;
  }

   /**
   * Get exact
   * @return exact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExact() {
    return exact;
  }


  public void setExact(Boolean exact) {
    this.exact = exact;
  }


  public BgpNeighborDataRoutesInInner route(String route) {
    
    this.route = route;
    return this;
  }

   /**
   * A project network
   * @return route
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.32.16.0/31", value = "A project network")

  public String getRoute() {
    return route;
  }


  public void setRoute(String route) {
    this.route = route;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpNeighborDataRoutesInInner bgpNeighborDataRoutesInInner = (BgpNeighborDataRoutesInInner) o;
    return Objects.equals(this.exact, bgpNeighborDataRoutesInInner.exact) &&
        Objects.equals(this.route, bgpNeighborDataRoutesInInner.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exact, route);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpNeighborDataRoutesInInner {\n");
    sb.append("    exact: ").append(toIndentedString(exact)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
    openapiFields.add("exact");
    openapiFields.add("route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BgpNeighborDataRoutesInInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BgpNeighborDataRoutesInInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BgpNeighborDataRoutesInInner is not found in the empty JSON string", BgpNeighborDataRoutesInInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BgpNeighborDataRoutesInInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BgpNeighborDataRoutesInInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("route") != null && !jsonObj.get("route").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BgpNeighborDataRoutesInInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BgpNeighborDataRoutesInInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BgpNeighborDataRoutesInInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BgpNeighborDataRoutesInInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BgpNeighborDataRoutesInInner>() {
           @Override
           public void write(JsonWriter out, BgpNeighborDataRoutesInInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BgpNeighborDataRoutesInInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BgpNeighborDataRoutesInInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BgpNeighborDataRoutesInInner
  * @throws IOException if the JSON string is invalid with respect to BgpNeighborDataRoutesInInner
  */
  public static BgpNeighborDataRoutesInInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BgpNeighborDataRoutesInInner.class);
  }

 /**
  * Convert an instance of BgpNeighborDataRoutesInInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

