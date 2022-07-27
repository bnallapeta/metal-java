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
 * SpotMarketRequestCreateInputInstanceAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpotMarketRequestCreateInputInstanceAttributes {
  public static final String SERIALIZED_NAME_ALWAYS_PXE = "always_pxe";
  @SerializedName(SERIALIZED_NAME_ALWAYS_PXE)
  private Boolean alwaysPxe;

  public static final String SERIALIZED_NAME_BILLING_CYCLE = "billing_cycle";
  @SerializedName(SERIALIZED_NAME_BILLING_CYCLE)
  private String billingCycle;

  public static final String SERIALIZED_NAME_CUSTOMDATA = "customdata";
  @SerializedName(SERIALIZED_NAME_CUSTOMDATA)
  private Object customdata;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = null;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NO_SSH_KEYS = "no_ssh_keys";
  @SerializedName(SERIALIZED_NAME_NO_SSH_KEYS)
  private Boolean noSshKeys;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM = "operating_system";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private String operatingSystem;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_PRIVATE_IPV4_SUBNET_SIZE = "private_ipv4_subnet_size";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPV4_SUBNET_SIZE)
  private Integer privateIpv4SubnetSize;

  public static final String SERIALIZED_NAME_PROJECT_SSH_KEYS = "project_ssh_keys";
  @SerializedName(SERIALIZED_NAME_PROJECT_SSH_KEYS)
  private List<UUID> projectSshKeys = null;

  public static final String SERIALIZED_NAME_PUBLIC_IPV4_SUBNET_SIZE = "public_ipv4_subnet_size";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IPV4_SUBNET_SIZE)
  private Integer publicIpv4SubnetSize;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TERMINATION_TIME = "termination_time";
  @SerializedName(SERIALIZED_NAME_TERMINATION_TIME)
  private OffsetDateTime terminationTime;

  public static final String SERIALIZED_NAME_USER_SSH_KEYS = "user_ssh_keys";
  @SerializedName(SERIALIZED_NAME_USER_SSH_KEYS)
  private List<UUID> userSshKeys = null;

  public static final String SERIALIZED_NAME_USERDATA = "userdata";
  @SerializedName(SERIALIZED_NAME_USERDATA)
  private String userdata;

  public SpotMarketRequestCreateInputInstanceAttributes() {
  }

  public SpotMarketRequestCreateInputInstanceAttributes alwaysPxe(Boolean alwaysPxe) {
    
    this.alwaysPxe = alwaysPxe;
    return this;
  }

   /**
   * Get alwaysPxe
   * @return alwaysPxe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAlwaysPxe() {
    return alwaysPxe;
  }


  public void setAlwaysPxe(Boolean alwaysPxe) {
    this.alwaysPxe = alwaysPxe;
  }


  public SpotMarketRequestCreateInputInstanceAttributes billingCycle(String billingCycle) {
    
    this.billingCycle = billingCycle;
    return this;
  }

   /**
   * Get billingCycle
   * @return billingCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBillingCycle() {
    return billingCycle;
  }


  public void setBillingCycle(String billingCycle) {
    this.billingCycle = billingCycle;
  }


  public SpotMarketRequestCreateInputInstanceAttributes customdata(Object customdata) {
    
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


  public SpotMarketRequestCreateInputInstanceAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SpotMarketRequestCreateInputInstanceAttributes features(List<String> features) {
    
    this.features = features;
    return this;
  }

  public SpotMarketRequestCreateInputInstanceAttributes addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }


  public SpotMarketRequestCreateInputInstanceAttributes hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public SpotMarketRequestCreateInputInstanceAttributes hostnames(List<String> hostnames) {
    
    this.hostnames = hostnames;
    return this;
  }

  public SpotMarketRequestCreateInputInstanceAttributes addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public SpotMarketRequestCreateInputInstanceAttributes locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public SpotMarketRequestCreateInputInstanceAttributes noSshKeys(Boolean noSshKeys) {
    
    this.noSshKeys = noSshKeys;
    return this;
  }

   /**
   * Get noSshKeys
   * @return noSshKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoSshKeys() {
    return noSshKeys;
  }


  public void setNoSshKeys(Boolean noSshKeys) {
    this.noSshKeys = noSshKeys;
  }


  public SpotMarketRequestCreateInputInstanceAttributes operatingSystem(String operatingSystem) {
    
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperatingSystem() {
    return operatingSystem;
  }


  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }


  public SpotMarketRequestCreateInputInstanceAttributes plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    this.plan = plan;
  }


  public SpotMarketRequestCreateInputInstanceAttributes privateIpv4SubnetSize(Integer privateIpv4SubnetSize) {
    
    this.privateIpv4SubnetSize = privateIpv4SubnetSize;
    return this;
  }

   /**
   * Get privateIpv4SubnetSize
   * @return privateIpv4SubnetSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrivateIpv4SubnetSize() {
    return privateIpv4SubnetSize;
  }


  public void setPrivateIpv4SubnetSize(Integer privateIpv4SubnetSize) {
    this.privateIpv4SubnetSize = privateIpv4SubnetSize;
  }


  public SpotMarketRequestCreateInputInstanceAttributes projectSshKeys(List<UUID> projectSshKeys) {
    
    this.projectSshKeys = projectSshKeys;
    return this;
  }

  public SpotMarketRequestCreateInputInstanceAttributes addProjectSshKeysItem(UUID projectSshKeysItem) {
    if (this.projectSshKeys == null) {
      this.projectSshKeys = new ArrayList<>();
    }
    this.projectSshKeys.add(projectSshKeysItem);
    return this;
  }

   /**
   * Get projectSshKeys
   * @return projectSshKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getProjectSshKeys() {
    return projectSshKeys;
  }


  public void setProjectSshKeys(List<UUID> projectSshKeys) {
    this.projectSshKeys = projectSshKeys;
  }


  public SpotMarketRequestCreateInputInstanceAttributes publicIpv4SubnetSize(Integer publicIpv4SubnetSize) {
    
    this.publicIpv4SubnetSize = publicIpv4SubnetSize;
    return this;
  }

   /**
   * Get publicIpv4SubnetSize
   * @return publicIpv4SubnetSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPublicIpv4SubnetSize() {
    return publicIpv4SubnetSize;
  }


  public void setPublicIpv4SubnetSize(Integer publicIpv4SubnetSize) {
    this.publicIpv4SubnetSize = publicIpv4SubnetSize;
  }


  public SpotMarketRequestCreateInputInstanceAttributes tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SpotMarketRequestCreateInputInstanceAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public SpotMarketRequestCreateInputInstanceAttributes terminationTime(OffsetDateTime terminationTime) {
    
    this.terminationTime = terminationTime;
    return this;
  }

   /**
   * Get terminationTime
   * @return terminationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTerminationTime() {
    return terminationTime;
  }


  public void setTerminationTime(OffsetDateTime terminationTime) {
    this.terminationTime = terminationTime;
  }


  public SpotMarketRequestCreateInputInstanceAttributes userSshKeys(List<UUID> userSshKeys) {
    
    this.userSshKeys = userSshKeys;
    return this;
  }

  public SpotMarketRequestCreateInputInstanceAttributes addUserSshKeysItem(UUID userSshKeysItem) {
    if (this.userSshKeys == null) {
      this.userSshKeys = new ArrayList<>();
    }
    this.userSshKeys.add(userSshKeysItem);
    return this;
  }

   /**
   * The UUIDs of users whose SSH keys should be included on the provisioned device.
   * @return userSshKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUIDs of users whose SSH keys should be included on the provisioned device.")

  public List<UUID> getUserSshKeys() {
    return userSshKeys;
  }


  public void setUserSshKeys(List<UUID> userSshKeys) {
    this.userSshKeys = userSshKeys;
  }


  public SpotMarketRequestCreateInputInstanceAttributes userdata(String userdata) {
    
    this.userdata = userdata;
    return this;
  }

   /**
   * Get userdata
   * @return userdata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserdata() {
    return userdata;
  }


  public void setUserdata(String userdata) {
    this.userdata = userdata;
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
  public SpotMarketRequestCreateInputInstanceAttributes putAdditionalProperty(String key, Object value) {
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
    SpotMarketRequestCreateInputInstanceAttributes spotMarketRequestCreateInputInstanceAttributes = (SpotMarketRequestCreateInputInstanceAttributes) o;
    return Objects.equals(this.alwaysPxe, spotMarketRequestCreateInputInstanceAttributes.alwaysPxe) &&
        Objects.equals(this.billingCycle, spotMarketRequestCreateInputInstanceAttributes.billingCycle) &&
        Objects.equals(this.customdata, spotMarketRequestCreateInputInstanceAttributes.customdata) &&
        Objects.equals(this.description, spotMarketRequestCreateInputInstanceAttributes.description) &&
        Objects.equals(this.features, spotMarketRequestCreateInputInstanceAttributes.features) &&
        Objects.equals(this.hostname, spotMarketRequestCreateInputInstanceAttributes.hostname) &&
        Objects.equals(this.hostnames, spotMarketRequestCreateInputInstanceAttributes.hostnames) &&
        Objects.equals(this.locked, spotMarketRequestCreateInputInstanceAttributes.locked) &&
        Objects.equals(this.noSshKeys, spotMarketRequestCreateInputInstanceAttributes.noSshKeys) &&
        Objects.equals(this.operatingSystem, spotMarketRequestCreateInputInstanceAttributes.operatingSystem) &&
        Objects.equals(this.plan, spotMarketRequestCreateInputInstanceAttributes.plan) &&
        Objects.equals(this.privateIpv4SubnetSize, spotMarketRequestCreateInputInstanceAttributes.privateIpv4SubnetSize) &&
        Objects.equals(this.projectSshKeys, spotMarketRequestCreateInputInstanceAttributes.projectSshKeys) &&
        Objects.equals(this.publicIpv4SubnetSize, spotMarketRequestCreateInputInstanceAttributes.publicIpv4SubnetSize) &&
        Objects.equals(this.tags, spotMarketRequestCreateInputInstanceAttributes.tags) &&
        Objects.equals(this.terminationTime, spotMarketRequestCreateInputInstanceAttributes.terminationTime) &&
        Objects.equals(this.userSshKeys, spotMarketRequestCreateInputInstanceAttributes.userSshKeys) &&
        Objects.equals(this.userdata, spotMarketRequestCreateInputInstanceAttributes.userdata)&&
        Objects.equals(this.additionalProperties, spotMarketRequestCreateInputInstanceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysPxe, billingCycle, customdata, description, features, hostname, hostnames, locked, noSshKeys, operatingSystem, plan, privateIpv4SubnetSize, projectSshKeys, publicIpv4SubnetSize, tags, terminationTime, userSshKeys, userdata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpotMarketRequestCreateInputInstanceAttributes {\n");
    sb.append("    alwaysPxe: ").append(toIndentedString(alwaysPxe)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    noSshKeys: ").append(toIndentedString(noSshKeys)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    privateIpv4SubnetSize: ").append(toIndentedString(privateIpv4SubnetSize)).append("\n");
    sb.append("    projectSshKeys: ").append(toIndentedString(projectSshKeys)).append("\n");
    sb.append("    publicIpv4SubnetSize: ").append(toIndentedString(publicIpv4SubnetSize)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    terminationTime: ").append(toIndentedString(terminationTime)).append("\n");
    sb.append("    userSshKeys: ").append(toIndentedString(userSshKeys)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
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
    openapiFields.add("always_pxe");
    openapiFields.add("billing_cycle");
    openapiFields.add("customdata");
    openapiFields.add("description");
    openapiFields.add("features");
    openapiFields.add("hostname");
    openapiFields.add("hostnames");
    openapiFields.add("locked");
    openapiFields.add("no_ssh_keys");
    openapiFields.add("operating_system");
    openapiFields.add("plan");
    openapiFields.add("private_ipv4_subnet_size");
    openapiFields.add("project_ssh_keys");
    openapiFields.add("public_ipv4_subnet_size");
    openapiFields.add("tags");
    openapiFields.add("termination_time");
    openapiFields.add("user_ssh_keys");
    openapiFields.add("userdata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpotMarketRequestCreateInputInstanceAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpotMarketRequestCreateInputInstanceAttributes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpotMarketRequestCreateInputInstanceAttributes is not found in the empty JSON string", SpotMarketRequestCreateInputInstanceAttributes.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("billing_cycle") != null && !jsonObj.get("billing_cycle").isJsonNull()) && !jsonObj.get("billing_cycle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_cycle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_cycle").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) && !jsonObj.get("features").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("hostnames") != null && !jsonObj.get("hostnames").isJsonNull()) && !jsonObj.get("hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("hostnames").toString()));
      }
      if ((jsonObj.get("operating_system") != null && !jsonObj.get("operating_system").isJsonNull()) && !jsonObj.get("operating_system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operating_system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operating_system").toString()));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("project_ssh_keys") != null && !jsonObj.get("project_ssh_keys").isJsonNull()) && !jsonObj.get("project_ssh_keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_ssh_keys` to be an array in the JSON string but got `%s`", jsonObj.get("project_ssh_keys").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("user_ssh_keys") != null && !jsonObj.get("user_ssh_keys").isJsonNull()) && !jsonObj.get("user_ssh_keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ssh_keys` to be an array in the JSON string but got `%s`", jsonObj.get("user_ssh_keys").toString()));
      }
      if ((jsonObj.get("userdata") != null && !jsonObj.get("userdata").isJsonNull()) && !jsonObj.get("userdata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userdata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userdata").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpotMarketRequestCreateInputInstanceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpotMarketRequestCreateInputInstanceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpotMarketRequestCreateInputInstanceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpotMarketRequestCreateInputInstanceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<SpotMarketRequestCreateInputInstanceAttributes>() {
           @Override
           public void write(JsonWriter out, SpotMarketRequestCreateInputInstanceAttributes value) throws IOException {
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
           public SpotMarketRequestCreateInputInstanceAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpotMarketRequestCreateInputInstanceAttributes instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpotMarketRequestCreateInputInstanceAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpotMarketRequestCreateInputInstanceAttributes
  * @throws IOException if the JSON string is invalid with respect to SpotMarketRequestCreateInputInstanceAttributes
  */
  public static SpotMarketRequestCreateInputInstanceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpotMarketRequestCreateInputInstanceAttributes.class);
  }

 /**
  * Convert an instance of SpotMarketRequestCreateInputInstanceAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

