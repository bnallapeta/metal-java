/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:    ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
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
import com.equinix.openapi.metal.v1.model.VirtualCircuitUpdateInput;
import com.equinix.openapi.metal.v1.model.VrfVirtualCircuitUpdateInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.equinix.openapi.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVirtualCircuitRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateVirtualCircuitRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateVirtualCircuitRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateVirtualCircuitRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VirtualCircuitUpdateInput> adapterVirtualCircuitUpdateInput = gson.getDelegateAdapter(this, TypeToken.get(VirtualCircuitUpdateInput.class));
            final TypeAdapter<VrfVirtualCircuitUpdateInput> adapterVrfVirtualCircuitUpdateInput = gson.getDelegateAdapter(this, TypeToken.get(VrfVirtualCircuitUpdateInput.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateVirtualCircuitRequest>() {
                @Override
                public void write(JsonWriter out, UpdateVirtualCircuitRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `VirtualCircuitUpdateInput`
                    if (value.getActualInstance() instanceof VirtualCircuitUpdateInput) {
                        JsonObject obj = adapterVirtualCircuitUpdateInput.toJsonTree((VirtualCircuitUpdateInput)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `VrfVirtualCircuitUpdateInput`
                    if (value.getActualInstance() instanceof VrfVirtualCircuitUpdateInput) {
                        JsonObject obj = adapterVrfVirtualCircuitUpdateInput.toJsonTree((VrfVirtualCircuitUpdateInput)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput");
                }

                @Override
                public UpdateVirtualCircuitRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize VirtualCircuitUpdateInput
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VirtualCircuitUpdateInput.validateJsonObject(jsonObject);
                        actualAdapter = adapterVirtualCircuitUpdateInput;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'VirtualCircuitUpdateInput'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for VirtualCircuitUpdateInput failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'VirtualCircuitUpdateInput'", e);
                    }

                    // deserialize VrfVirtualCircuitUpdateInput
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VrfVirtualCircuitUpdateInput.validateJsonObject(jsonObject);
                        actualAdapter = adapterVrfVirtualCircuitUpdateInput;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'VrfVirtualCircuitUpdateInput'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for VrfVirtualCircuitUpdateInput failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'VrfVirtualCircuitUpdateInput'", e);
                    }

                    if (match == 1) {
                        UpdateVirtualCircuitRequest ret = new UpdateVirtualCircuitRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateVirtualCircuitRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateVirtualCircuitRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateVirtualCircuitRequest(VirtualCircuitUpdateInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateVirtualCircuitRequest(VrfVirtualCircuitUpdateInput o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("VirtualCircuitUpdateInput", new GenericType<VirtualCircuitUpdateInput>() {
        });
        schemas.put("VrfVirtualCircuitUpdateInput", new GenericType<VrfVirtualCircuitUpdateInput>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateVirtualCircuitRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof VirtualCircuitUpdateInput) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VrfVirtualCircuitUpdateInput) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput");
    }

    /**
     * Get the actual instance, which can be the following:
     * VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput
     *
     * @return The actual instance (VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirtualCircuitUpdateInput`. If the actual instance is not `VirtualCircuitUpdateInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirtualCircuitUpdateInput`
     * @throws ClassCastException if the instance is not `VirtualCircuitUpdateInput`
     */
    public VirtualCircuitUpdateInput getVirtualCircuitUpdateInput() throws ClassCastException {
        return (VirtualCircuitUpdateInput)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VrfVirtualCircuitUpdateInput`. If the actual instance is not `VrfVirtualCircuitUpdateInput`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VrfVirtualCircuitUpdateInput`
     * @throws ClassCastException if the instance is not `VrfVirtualCircuitUpdateInput`
     */
    public VrfVirtualCircuitUpdateInput getVrfVirtualCircuitUpdateInput() throws ClassCastException {
        return (VrfVirtualCircuitUpdateInput)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateVirtualCircuitRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with VirtualCircuitUpdateInput
    try {
      VirtualCircuitUpdateInput.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for VirtualCircuitUpdateInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with VrfVirtualCircuitUpdateInput
    try {
      VrfVirtualCircuitUpdateInput.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for VrfVirtualCircuitUpdateInput failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateVirtualCircuitRequest with oneOf schemas: VirtualCircuitUpdateInput, VrfVirtualCircuitUpdateInput. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UpdateVirtualCircuitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVirtualCircuitRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateVirtualCircuitRequest
  */
  public static UpdateVirtualCircuitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVirtualCircuitRequest.class);
  }

 /**
  * Convert an instance of UpdateVirtualCircuitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

