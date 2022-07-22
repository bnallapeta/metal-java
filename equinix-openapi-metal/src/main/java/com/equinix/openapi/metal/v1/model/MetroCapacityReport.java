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
import com.equinix.openapi.metal.v1.model.CapacityPerFacility;
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
 * MetroCapacityReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetroCapacityReport {
  public static final String SERIALIZED_NAME_AM = "am";
  @SerializedName(SERIALIZED_NAME_AM)
  private CapacityPerFacility am;

  public static final String SERIALIZED_NAME_AT = "at";
  @SerializedName(SERIALIZED_NAME_AT)
  private CapacityPerFacility at;

  public static final String SERIALIZED_NAME_CH = "ch";
  @SerializedName(SERIALIZED_NAME_CH)
  private CapacityPerFacility ch;

  public static final String SERIALIZED_NAME_DA = "da";
  @SerializedName(SERIALIZED_NAME_DA)
  private CapacityPerFacility da;

  public static final String SERIALIZED_NAME_DC = "dc";
  @SerializedName(SERIALIZED_NAME_DC)
  private CapacityPerFacility dc;

  public static final String SERIALIZED_NAME_FR = "fr";
  @SerializedName(SERIALIZED_NAME_FR)
  private CapacityPerFacility fr;

  public static final String SERIALIZED_NAME_HK = "hk";
  @SerializedName(SERIALIZED_NAME_HK)
  private CapacityPerFacility hk;

  public static final String SERIALIZED_NAME_LA = "la";
  @SerializedName(SERIALIZED_NAME_LA)
  private CapacityPerFacility la;

  public static final String SERIALIZED_NAME_LD = "ld";
  @SerializedName(SERIALIZED_NAME_LD)
  private CapacityPerFacility ld;

  public static final String SERIALIZED_NAME_MD = "md";
  @SerializedName(SERIALIZED_NAME_MD)
  private CapacityPerFacility md;

  public static final String SERIALIZED_NAME_NY = "ny";
  @SerializedName(SERIALIZED_NAME_NY)
  private CapacityPerFacility ny;

  public static final String SERIALIZED_NAME_PA = "pa";
  @SerializedName(SERIALIZED_NAME_PA)
  private CapacityPerFacility pa;

  public static final String SERIALIZED_NAME_SE = "se";
  @SerializedName(SERIALIZED_NAME_SE)
  private CapacityPerFacility se;

  public static final String SERIALIZED_NAME_SG = "sg";
  @SerializedName(SERIALIZED_NAME_SG)
  private CapacityPerFacility sg;

  public static final String SERIALIZED_NAME_SL = "sl";
  @SerializedName(SERIALIZED_NAME_SL)
  private CapacityPerFacility sl;

  public static final String SERIALIZED_NAME_SP = "sp";
  @SerializedName(SERIALIZED_NAME_SP)
  private CapacityPerFacility sp;

  public static final String SERIALIZED_NAME_SV = "sv";
  @SerializedName(SERIALIZED_NAME_SV)
  private CapacityPerFacility sv;

  public static final String SERIALIZED_NAME_SY = "sy";
  @SerializedName(SERIALIZED_NAME_SY)
  private CapacityPerFacility sy;

  public static final String SERIALIZED_NAME_TR = "tr";
  @SerializedName(SERIALIZED_NAME_TR)
  private CapacityPerFacility tr;

  public static final String SERIALIZED_NAME_TY = "ty";
  @SerializedName(SERIALIZED_NAME_TY)
  private CapacityPerFacility ty;

  public MetroCapacityReport() { 
  }

  public MetroCapacityReport am(CapacityPerFacility am) {
    
    this.am = am;
    return this;
  }

   /**
   * Get am
   * @return am
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getAm() {
    return am;
  }


  public void setAm(CapacityPerFacility am) {
    this.am = am;
  }


  public MetroCapacityReport at(CapacityPerFacility at) {
    
    this.at = at;
    return this;
  }

   /**
   * Get at
   * @return at
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getAt() {
    return at;
  }


  public void setAt(CapacityPerFacility at) {
    this.at = at;
  }


  public MetroCapacityReport ch(CapacityPerFacility ch) {
    
    this.ch = ch;
    return this;
  }

   /**
   * Get ch
   * @return ch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getCh() {
    return ch;
  }


  public void setCh(CapacityPerFacility ch) {
    this.ch = ch;
  }


  public MetroCapacityReport da(CapacityPerFacility da) {
    
    this.da = da;
    return this;
  }

   /**
   * Get da
   * @return da
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getDa() {
    return da;
  }


  public void setDa(CapacityPerFacility da) {
    this.da = da;
  }


  public MetroCapacityReport dc(CapacityPerFacility dc) {
    
    this.dc = dc;
    return this;
  }

   /**
   * Get dc
   * @return dc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getDc() {
    return dc;
  }


  public void setDc(CapacityPerFacility dc) {
    this.dc = dc;
  }


  public MetroCapacityReport fr(CapacityPerFacility fr) {
    
    this.fr = fr;
    return this;
  }

   /**
   * Get fr
   * @return fr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getFr() {
    return fr;
  }


  public void setFr(CapacityPerFacility fr) {
    this.fr = fr;
  }


  public MetroCapacityReport hk(CapacityPerFacility hk) {
    
    this.hk = hk;
    return this;
  }

   /**
   * Get hk
   * @return hk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getHk() {
    return hk;
  }


  public void setHk(CapacityPerFacility hk) {
    this.hk = hk;
  }


  public MetroCapacityReport la(CapacityPerFacility la) {
    
    this.la = la;
    return this;
  }

   /**
   * Get la
   * @return la
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getLa() {
    return la;
  }


  public void setLa(CapacityPerFacility la) {
    this.la = la;
  }


  public MetroCapacityReport ld(CapacityPerFacility ld) {
    
    this.ld = ld;
    return this;
  }

   /**
   * Get ld
   * @return ld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getLd() {
    return ld;
  }


  public void setLd(CapacityPerFacility ld) {
    this.ld = ld;
  }


  public MetroCapacityReport md(CapacityPerFacility md) {
    
    this.md = md;
    return this;
  }

   /**
   * Get md
   * @return md
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getMd() {
    return md;
  }


  public void setMd(CapacityPerFacility md) {
    this.md = md;
  }


  public MetroCapacityReport ny(CapacityPerFacility ny) {
    
    this.ny = ny;
    return this;
  }

   /**
   * Get ny
   * @return ny
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getNy() {
    return ny;
  }


  public void setNy(CapacityPerFacility ny) {
    this.ny = ny;
  }


  public MetroCapacityReport pa(CapacityPerFacility pa) {
    
    this.pa = pa;
    return this;
  }

   /**
   * Get pa
   * @return pa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getPa() {
    return pa;
  }


  public void setPa(CapacityPerFacility pa) {
    this.pa = pa;
  }


  public MetroCapacityReport se(CapacityPerFacility se) {
    
    this.se = se;
    return this;
  }

   /**
   * Get se
   * @return se
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSe() {
    return se;
  }


  public void setSe(CapacityPerFacility se) {
    this.se = se;
  }


  public MetroCapacityReport sg(CapacityPerFacility sg) {
    
    this.sg = sg;
    return this;
  }

   /**
   * Get sg
   * @return sg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSg() {
    return sg;
  }


  public void setSg(CapacityPerFacility sg) {
    this.sg = sg;
  }


  public MetroCapacityReport sl(CapacityPerFacility sl) {
    
    this.sl = sl;
    return this;
  }

   /**
   * Get sl
   * @return sl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSl() {
    return sl;
  }


  public void setSl(CapacityPerFacility sl) {
    this.sl = sl;
  }


  public MetroCapacityReport sp(CapacityPerFacility sp) {
    
    this.sp = sp;
    return this;
  }

   /**
   * Get sp
   * @return sp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSp() {
    return sp;
  }


  public void setSp(CapacityPerFacility sp) {
    this.sp = sp;
  }


  public MetroCapacityReport sv(CapacityPerFacility sv) {
    
    this.sv = sv;
    return this;
  }

   /**
   * Get sv
   * @return sv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSv() {
    return sv;
  }


  public void setSv(CapacityPerFacility sv) {
    this.sv = sv;
  }


  public MetroCapacityReport sy(CapacityPerFacility sy) {
    
    this.sy = sy;
    return this;
  }

   /**
   * Get sy
   * @return sy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getSy() {
    return sy;
  }


  public void setSy(CapacityPerFacility sy) {
    this.sy = sy;
  }


  public MetroCapacityReport tr(CapacityPerFacility tr) {
    
    this.tr = tr;
    return this;
  }

   /**
   * Get tr
   * @return tr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getTr() {
    return tr;
  }


  public void setTr(CapacityPerFacility tr) {
    this.tr = tr;
  }


  public MetroCapacityReport ty(CapacityPerFacility ty) {
    
    this.ty = ty;
    return this;
  }

   /**
   * Get ty
   * @return ty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapacityPerFacility getTy() {
    return ty;
  }


  public void setTy(CapacityPerFacility ty) {
    this.ty = ty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetroCapacityReport metroCapacityReport = (MetroCapacityReport) o;
    return Objects.equals(this.am, metroCapacityReport.am) &&
        Objects.equals(this.at, metroCapacityReport.at) &&
        Objects.equals(this.ch, metroCapacityReport.ch) &&
        Objects.equals(this.da, metroCapacityReport.da) &&
        Objects.equals(this.dc, metroCapacityReport.dc) &&
        Objects.equals(this.fr, metroCapacityReport.fr) &&
        Objects.equals(this.hk, metroCapacityReport.hk) &&
        Objects.equals(this.la, metroCapacityReport.la) &&
        Objects.equals(this.ld, metroCapacityReport.ld) &&
        Objects.equals(this.md, metroCapacityReport.md) &&
        Objects.equals(this.ny, metroCapacityReport.ny) &&
        Objects.equals(this.pa, metroCapacityReport.pa) &&
        Objects.equals(this.se, metroCapacityReport.se) &&
        Objects.equals(this.sg, metroCapacityReport.sg) &&
        Objects.equals(this.sl, metroCapacityReport.sl) &&
        Objects.equals(this.sp, metroCapacityReport.sp) &&
        Objects.equals(this.sv, metroCapacityReport.sv) &&
        Objects.equals(this.sy, metroCapacityReport.sy) &&
        Objects.equals(this.tr, metroCapacityReport.tr) &&
        Objects.equals(this.ty, metroCapacityReport.ty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(am, at, ch, da, dc, fr, hk, la, ld, md, ny, pa, se, sg, sl, sp, sv, sy, tr, ty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroCapacityReport {\n");
    sb.append("    am: ").append(toIndentedString(am)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    ch: ").append(toIndentedString(ch)).append("\n");
    sb.append("    da: ").append(toIndentedString(da)).append("\n");
    sb.append("    dc: ").append(toIndentedString(dc)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
    sb.append("    hk: ").append(toIndentedString(hk)).append("\n");
    sb.append("    la: ").append(toIndentedString(la)).append("\n");
    sb.append("    ld: ").append(toIndentedString(ld)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    ny: ").append(toIndentedString(ny)).append("\n");
    sb.append("    pa: ").append(toIndentedString(pa)).append("\n");
    sb.append("    se: ").append(toIndentedString(se)).append("\n");
    sb.append("    sg: ").append(toIndentedString(sg)).append("\n");
    sb.append("    sl: ").append(toIndentedString(sl)).append("\n");
    sb.append("    sp: ").append(toIndentedString(sp)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    sy: ").append(toIndentedString(sy)).append("\n");
    sb.append("    tr: ").append(toIndentedString(tr)).append("\n");
    sb.append("    ty: ").append(toIndentedString(ty)).append("\n");
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
    openapiFields.add("am");
    openapiFields.add("at");
    openapiFields.add("ch");
    openapiFields.add("da");
    openapiFields.add("dc");
    openapiFields.add("fr");
    openapiFields.add("hk");
    openapiFields.add("la");
    openapiFields.add("ld");
    openapiFields.add("md");
    openapiFields.add("ny");
    openapiFields.add("pa");
    openapiFields.add("se");
    openapiFields.add("sg");
    openapiFields.add("sl");
    openapiFields.add("sp");
    openapiFields.add("sv");
    openapiFields.add("sy");
    openapiFields.add("tr");
    openapiFields.add("ty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetroCapacityReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetroCapacityReport.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetroCapacityReport is not found in the empty JSON string", MetroCapacityReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetroCapacityReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetroCapacityReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `am`
      if (jsonObj.getAsJsonObject("am") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("am"));
      }
      // validate the optional field `at`
      if (jsonObj.getAsJsonObject("at") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("at"));
      }
      // validate the optional field `ch`
      if (jsonObj.getAsJsonObject("ch") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ch"));
      }
      // validate the optional field `da`
      if (jsonObj.getAsJsonObject("da") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("da"));
      }
      // validate the optional field `dc`
      if (jsonObj.getAsJsonObject("dc") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("dc"));
      }
      // validate the optional field `fr`
      if (jsonObj.getAsJsonObject("fr") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("fr"));
      }
      // validate the optional field `hk`
      if (jsonObj.getAsJsonObject("hk") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("hk"));
      }
      // validate the optional field `la`
      if (jsonObj.getAsJsonObject("la") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("la"));
      }
      // validate the optional field `ld`
      if (jsonObj.getAsJsonObject("ld") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ld"));
      }
      // validate the optional field `md`
      if (jsonObj.getAsJsonObject("md") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("md"));
      }
      // validate the optional field `ny`
      if (jsonObj.getAsJsonObject("ny") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ny"));
      }
      // validate the optional field `pa`
      if (jsonObj.getAsJsonObject("pa") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("pa"));
      }
      // validate the optional field `se`
      if (jsonObj.getAsJsonObject("se") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("se"));
      }
      // validate the optional field `sg`
      if (jsonObj.getAsJsonObject("sg") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sg"));
      }
      // validate the optional field `sl`
      if (jsonObj.getAsJsonObject("sl") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sl"));
      }
      // validate the optional field `sp`
      if (jsonObj.getAsJsonObject("sp") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sp"));
      }
      // validate the optional field `sv`
      if (jsonObj.getAsJsonObject("sv") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sv"));
      }
      // validate the optional field `sy`
      if (jsonObj.getAsJsonObject("sy") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("sy"));
      }
      // validate the optional field `tr`
      if (jsonObj.getAsJsonObject("tr") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("tr"));
      }
      // validate the optional field `ty`
      if (jsonObj.getAsJsonObject("ty") != null) {
        CapacityPerFacility.validateJsonObject(jsonObj.getAsJsonObject("ty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetroCapacityReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetroCapacityReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetroCapacityReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetroCapacityReport.class));

       return (TypeAdapter<T>) new TypeAdapter<MetroCapacityReport>() {
           @Override
           public void write(JsonWriter out, MetroCapacityReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetroCapacityReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetroCapacityReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetroCapacityReport
  * @throws IOException if the JSON string is invalid with respect to MetroCapacityReport
  */
  public static MetroCapacityReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetroCapacityReport.class);
  }

 /**
  * Convert an instance of MetroCapacityReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

