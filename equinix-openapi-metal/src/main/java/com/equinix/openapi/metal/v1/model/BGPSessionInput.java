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
 * BGPSessionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BGPSessionInput {
  /**
   * Address family for BGP session.
   */
  @JsonAdapter(AddressFamilyEnum.Adapter.class)
  public enum AddressFamilyEnum {
    IPV4("ipv4"),
    
    IPV6("ipv6");

    private String value;

    AddressFamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressFamilyEnum fromValue(String value) {
      for (AddressFamilyEnum b : AddressFamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddressFamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressFamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressFamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressFamilyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_FAMILY = "address_family";
  @SerializedName(SERIALIZED_NAME_ADDRESS_FAMILY)
  private AddressFamilyEnum addressFamily;

  public static final String SERIALIZED_NAME_DEFAULT_ROUTE = "default_route";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ROUTE)
  private Boolean defaultRoute = false;

  public BGPSessionInput() {
  }

  public BGPSessionInput addressFamily(AddressFamilyEnum addressFamily) {
    
    this.addressFamily = addressFamily;
    return this;
  }

   /**
   * Address family for BGP session.
   * @return addressFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ipv4", value = "Address family for BGP session.")

  public AddressFamilyEnum getAddressFamily() {
    return addressFamily;
  }


  public void setAddressFamily(AddressFamilyEnum addressFamily) {
    this.addressFamily = addressFamily;
  }


  public BGPSessionInput defaultRoute(Boolean defaultRoute) {
    
    this.defaultRoute = defaultRoute;
    return this;
  }

   /**
   * Set the default route policy.
   * @return defaultRoute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the default route policy.")

  public Boolean getDefaultRoute() {
    return defaultRoute;
  }


  public void setDefaultRoute(Boolean defaultRoute) {
    this.defaultRoute = defaultRoute;
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
  public BGPSessionInput putAdditionalProperty(String key, Object value) {
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
    BGPSessionInput bgPSessionInput = (BGPSessionInput) o;
    return Objects.equals(this.addressFamily, bgPSessionInput.addressFamily) &&
        Objects.equals(this.defaultRoute, bgPSessionInput.defaultRoute)&&
        Objects.equals(this.additionalProperties, bgPSessionInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFamily, defaultRoute, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BGPSessionInput {\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
    sb.append("    defaultRoute: ").append(toIndentedString(defaultRoute)).append("\n");
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
    openapiFields.add("address_family");
    openapiFields.add("default_route");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BGPSessionInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BGPSessionInput.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BGPSessionInput is not found in the empty JSON string", BGPSessionInput.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("address_family") != null && !jsonObj.get("address_family").isJsonNull()) && !jsonObj.get("address_family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_family").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BGPSessionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BGPSessionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BGPSessionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BGPSessionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<BGPSessionInput>() {
           @Override
           public void write(JsonWriter out, BGPSessionInput value) throws IOException {
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
           public BGPSessionInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BGPSessionInput instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BGPSessionInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BGPSessionInput
  * @throws IOException if the JSON string is invalid with respect to BGPSessionInput
  */
  public static BGPSessionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BGPSessionInput.class);
  }

 /**
  * Convert an instance of BGPSessionInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

