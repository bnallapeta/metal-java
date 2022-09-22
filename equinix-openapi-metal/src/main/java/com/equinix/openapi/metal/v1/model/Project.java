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
import java.time.OffsetDateTime;
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
 * Project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Project {
  public static final String SERIALIZED_NAME_BGP_CONFIG = "bgp_config";
  @SerializedName(SERIALIZED_NAME_BGP_CONFIG)
  private Href bgpConfig;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<Href> devices = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  private List<Href> invitations = null;

  public static final String SERIALIZED_NAME_MAX_DEVICES = "max_devices";
  @SerializedName(SERIALIZED_NAME_MAX_DEVICES)
  private Object maxDevices;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<Href> members = null;

  public static final String SERIALIZED_NAME_MEMBERSHIPS = "memberships";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIPS)
  private List<Href> memberships = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_STATUS = "network_status";
  @SerializedName(SERIALIZED_NAME_NETWORK_STATUS)
  private Object networkStatus;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private Href paymentMethod;

  public static final String SERIALIZED_NAME_SSH_KEYS = "ssh_keys";
  @SerializedName(SERIALIZED_NAME_SSH_KEYS)
  private List<Href> sshKeys = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<Href> volumes = null;

  public Project() {
  }

  public Project bgpConfig(Href bgpConfig) {
    
    this.bgpConfig = bgpConfig;
    return this;
  }

   /**
   * Get bgpConfig
   * @return bgpConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Href getBgpConfig() {
    return bgpConfig;
  }


  public void setBgpConfig(Href bgpConfig) {
    this.bgpConfig = bgpConfig;
  }


  public Project createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Project customdata(Object customdata) {
    
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCustomdata() {
    return customdata;
  }


  public void setCustomdata(Object customdata) {
    this.customdata = customdata;
  }


  public Project devices(List<Href> devices) {
    
    this.devices = devices;
    return this;
  }

  public Project addDevicesItem(Href devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getDevices() {
    return devices;
  }


  public void setDevices(List<Href> devices) {
    this.devices = devices;
  }


  public Project id(UUID id) {
    
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


  public Project invitations(List<Href> invitations) {
    
    this.invitations = invitations;
    return this;
  }

  public Project addInvitationsItem(Href invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

   /**
   * Get invitations
   * @return invitations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getInvitations() {
    return invitations;
  }


  public void setInvitations(List<Href> invitations) {
    this.invitations = invitations;
  }


  public Project maxDevices(Object maxDevices) {
    
    this.maxDevices = maxDevices;
    return this;
  }

   /**
   * Get maxDevices
   * @return maxDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaxDevices() {
    return maxDevices;
  }


  public void setMaxDevices(Object maxDevices) {
    this.maxDevices = maxDevices;
  }


  public Project members(List<Href> members) {
    
    this.members = members;
    return this;
  }

  public Project addMembersItem(Href membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getMembers() {
    return members;
  }


  public void setMembers(List<Href> members) {
    this.members = members;
  }


  public Project memberships(List<Href> memberships) {
    
    this.memberships = memberships;
    return this;
  }

  public Project addMembershipsItem(Href membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getMemberships() {
    return memberships;
  }


  public void setMemberships(List<Href> memberships) {
    this.memberships = memberships;
  }


  public Project name(String name) {
    
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


  public Project networkStatus(Object networkStatus) {
    
    this.networkStatus = networkStatus;
    return this;
  }

   /**
   * Get networkStatus
   * @return networkStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNetworkStatus() {
    return networkStatus;
  }


  public void setNetworkStatus(Object networkStatus) {
    this.networkStatus = networkStatus;
  }


  public Project paymentMethod(Href paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Href getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(Href paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Project sshKeys(List<Href> sshKeys) {
    
    this.sshKeys = sshKeys;
    return this;
  }

  public Project addSshKeysItem(Href sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Get sshKeys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getSshKeys() {
    return sshKeys;
  }


  public void setSshKeys(List<Href> sshKeys) {
    this.sshKeys = sshKeys;
  }


  public Project updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Project volumes(List<Href> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public Project addVolumesItem(Href volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Href> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<Href> volumes) {
    this.volumes = volumes;
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
  public Project putAdditionalProperty(String key, Object value) {
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
    Project project = (Project) o;
    return Objects.equals(this.bgpConfig, project.bgpConfig) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.customdata, project.customdata) &&
        Objects.equals(this.devices, project.devices) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.invitations, project.invitations) &&
        Objects.equals(this.maxDevices, project.maxDevices) &&
        Objects.equals(this.members, project.members) &&
        Objects.equals(this.memberships, project.memberships) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.networkStatus, project.networkStatus) &&
        Objects.equals(this.paymentMethod, project.paymentMethod) &&
        Objects.equals(this.sshKeys, project.sshKeys) &&
        Objects.equals(this.updatedAt, project.updatedAt) &&
        Objects.equals(this.volumes, project.volumes)&&
        Objects.equals(this.additionalProperties, project.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpConfig, createdAt, customdata, devices, id, invitations, maxDevices, members, memberships, name, networkStatus, paymentMethod, sshKeys, updatedAt, volumes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    bgpConfig: ").append(toIndentedString(bgpConfig)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    maxDevices: ").append(toIndentedString(maxDevices)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkStatus: ").append(toIndentedString(networkStatus)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("bgp_config");
    openapiFields.add("created_at");
    openapiFields.add("customdata");
    openapiFields.add("devices");
    openapiFields.add("id");
    openapiFields.add("invitations");
    openapiFields.add("max_devices");
    openapiFields.add("members");
    openapiFields.add("memberships");
    openapiFields.add("name");
    openapiFields.add("network_status");
    openapiFields.add("payment_method");
    openapiFields.add("ssh_keys");
    openapiFields.add("updated_at");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Project
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Project.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Project is not found in the empty JSON string", Project.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bgp_config`
      if (jsonObj.get("bgp_config") != null && !jsonObj.get("bgp_config").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("bgp_config"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            Href.validateJsonObject(jsonArraydevices.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("invitations") != null && !jsonObj.get("invitations").isJsonNull()) {
        JsonArray jsonArrayinvitations = jsonObj.getAsJsonArray("invitations");
        if (jsonArrayinvitations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("invitations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `invitations` to be an array in the JSON string but got `%s`", jsonObj.get("invitations").toString()));
          }

          // validate the optional field `invitations` (array)
          for (int i = 0; i < jsonArrayinvitations.size(); i++) {
            Href.validateJsonObject(jsonArrayinvitations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            Href.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("memberships") != null && !jsonObj.get("memberships").isJsonNull()) {
        JsonArray jsonArraymemberships = jsonObj.getAsJsonArray("memberships");
        if (jsonArraymemberships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("memberships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `memberships` to be an array in the JSON string but got `%s`", jsonObj.get("memberships").toString()));
          }

          // validate the optional field `memberships` (array)
          for (int i = 0; i < jsonArraymemberships.size(); i++) {
            Href.validateJsonObject(jsonArraymemberships.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `payment_method`
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) {
        Href.validateJsonObject(jsonObj.getAsJsonObject("payment_method"));
      }
      if (jsonObj.get("ssh_keys") != null && !jsonObj.get("ssh_keys").isJsonNull()) {
        JsonArray jsonArraysshKeys = jsonObj.getAsJsonArray("ssh_keys");
        if (jsonArraysshKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ssh_keys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ssh_keys` to be an array in the JSON string but got `%s`", jsonObj.get("ssh_keys").toString()));
          }

          // validate the optional field `ssh_keys` (array)
          for (int i = 0; i < jsonArraysshKeys.size(); i++) {
            Href.validateJsonObject(jsonArraysshKeys.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            Href.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Project.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Project' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Project> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Project.class));

       return (TypeAdapter<T>) new TypeAdapter<Project>() {
           @Override
           public void write(JsonWriter out, Project value) throws IOException {
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
           public Project read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Project instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Project given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Project
  * @throws IOException if the JSON string is invalid with respect to Project
  */
  public static Project fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Project.class);
  }

 /**
  * Convert an instance of Project to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

