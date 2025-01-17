/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.JSON;

/**
 * DeviceActionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeviceActionInput {
  /**
   * Action to perform. See Device.actions for possible actions.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    POWER_ON("power_on"),
    
    POWER_OFF("power_off"),
    
    REBOOT("reboot"),
    
    RESCUE("rescue"),
    
    REINSTALL("reinstall");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_FORCE_DELETE = "force_delete";
  @SerializedName(SERIALIZED_NAME_FORCE_DELETE)
  private Boolean forceDelete;

  public static final String SERIALIZED_NAME_DEPROVISION_FAST = "deprovision_fast";
  @SerializedName(SERIALIZED_NAME_DEPROVISION_FAST)
  private Boolean deprovisionFast;

  public static final String SERIALIZED_NAME_PRESERVE_DATA = "preserve_data";
  @SerializedName(SERIALIZED_NAME_PRESERVE_DATA)
  private Boolean preserveData;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operating_system";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private String operatingSystem;

  public static final String SERIALIZED_NAME_IPXE_SCRIPT_URL = "ipxe_script_url";
  @SerializedName(SERIALIZED_NAME_IPXE_SCRIPT_URL)
  private String ipxeScriptUrl;

  public DeviceActionInput() {
  }

  public DeviceActionInput type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Action to perform. See Device.actions for possible actions.
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public DeviceActionInput forceDelete(Boolean forceDelete) {
    
    this.forceDelete = forceDelete;
    return this;
  }

   /**
   * May be required to perform actions under certain conditions
   * @return forceDelete
  **/
  @javax.annotation.Nullable

  public Boolean getForceDelete() {
    return forceDelete;
  }


  public void setForceDelete(Boolean forceDelete) {
    this.forceDelete = forceDelete;
  }


  public DeviceActionInput deprovisionFast(Boolean deprovisionFast) {
    
    this.deprovisionFast = deprovisionFast;
    return this;
  }

   /**
   * When type is &#x60;reinstall&#x60;, enabling fast deprovisioning will bypass full disk wiping.
   * @return deprovisionFast
  **/
  @javax.annotation.Nullable

  public Boolean getDeprovisionFast() {
    return deprovisionFast;
  }


  public void setDeprovisionFast(Boolean deprovisionFast) {
    this.deprovisionFast = deprovisionFast;
  }


  public DeviceActionInput preserveData(Boolean preserveData) {
    
    this.preserveData = preserveData;
    return this;
  }

   /**
   * When type is &#x60;reinstall&#x60;, preserve the existing data on all disks except the operating-system disk.
   * @return preserveData
  **/
  @javax.annotation.Nullable

  public Boolean getPreserveData() {
    return preserveData;
  }


  public void setPreserveData(Boolean preserveData) {
    this.preserveData = preserveData;
  }


  public DeviceActionInput operatingSystem(String operatingSystem) {
    
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * When type is &#x60;reinstall&#x60;, use this &#x60;operating_system&#x60; (defaults to the current &#x60;operating system&#x60;)
   * @return operatingSystem
  **/
  @javax.annotation.Nullable

  public String getOperatingSystem() {
    return operatingSystem;
  }


  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public DeviceActionInput ipxeScriptUrl(String ipxeScriptUrl) {
    
    this.ipxeScriptUrl = ipxeScriptUrl;
    return this;
  }

   /**
   * When type is &#x60;reinstall&#x60;, use this &#x60;ipxe_script_url&#x60; (&#x60;operating_system&#x60; must be &#x60;custom_ipxe&#x60;, defaults to the current &#x60;ipxe_script_url&#x60;)
   * @return ipxeScriptUrl
  **/
  @javax.annotation.Nullable

  public String getIpxeScriptUrl() {
    return ipxeScriptUrl;
  }


  public void setIpxeScriptUrl(String ipxeScriptUrl) {
    this.ipxeScriptUrl = ipxeScriptUrl;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DeviceActionInput instance itself
   */
  public DeviceActionInput putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    DeviceActionInput deviceActionInput = (DeviceActionInput) o;
    return Objects.equals(this.type, deviceActionInput.type) &&
        Objects.equals(this.forceDelete, deviceActionInput.forceDelete) &&
        Objects.equals(this.deprovisionFast, deviceActionInput.deprovisionFast) &&
        Objects.equals(this.preserveData, deviceActionInput.preserveData) &&
        Objects.equals(this.operatingSystem, deviceActionInput.operatingSystem) &&
        Objects.equals(this.ipxeScriptUrl, deviceActionInput.ipxeScriptUrl)&&
        Objects.equals(this.additionalProperties, deviceActionInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, forceDelete, deprovisionFast, preserveData, operatingSystem, ipxeScriptUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceActionInput {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
    sb.append("    deprovisionFast: ").append(toIndentedString(deprovisionFast)).append("\n");
    sb.append("    preserveData: ").append(toIndentedString(preserveData)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    ipxeScriptUrl: ").append(toIndentedString(ipxeScriptUrl)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("force_delete");
    openapiFields.add("deprovision_fast");
    openapiFields.add("preserve_data");
    openapiFields.add("operating_system");
    openapiFields.add("ipxe_script_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceActionInput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceActionInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceActionInput is not found in the empty JSON string", DeviceActionInput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeviceActionInput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("operating_system") != null && !jsonObj.get("operating_system").isJsonNull()) && !jsonObj.get("operating_system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operating_system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operating_system").toString()));
      }
      if ((jsonObj.get("ipxe_script_url") != null && !jsonObj.get("ipxe_script_url").isJsonNull()) && !jsonObj.get("ipxe_script_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipxe_script_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipxe_script_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceActionInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceActionInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceActionInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceActionInput.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceActionInput>() {
           @Override
           public void write(JsonWriter out, DeviceActionInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
           public DeviceActionInput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeviceActionInput instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
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
  * Create an instance of DeviceActionInput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceActionInput
  * @throws IOException if the JSON string is invalid with respect to DeviceActionInput
  */
  public static DeviceActionInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceActionInput.class);
  }

 /**
  * Convert an instance of DeviceActionInput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

