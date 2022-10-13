/*
 * Minimal Example 
 * byte Array error in equal method
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ByteArrayObject
 */
@JsonPropertyOrder({
  ByteArrayObject.JSON_PROPERTY_NULLABLE_ARRAY,
  ByteArrayObject.JSON_PROPERTY_NORMAL_ARRAY,
  ByteArrayObject.JSON_PROPERTY_NULLABLE_STRING,
  ByteArrayObject.JSON_PROPERTY_STRING_FIELD,
  ByteArrayObject.JSON_PROPERTY_INT_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ByteArrayObject {
  public static final String JSON_PROPERTY_NULLABLE_ARRAY = "nullableArray";
  private JsonNullable<byte[]> nullableArray = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_NORMAL_ARRAY = "normalArray";
  private byte[] normalArray;

  public static final String JSON_PROPERTY_NULLABLE_STRING = "nullableString";
  private JsonNullable<String> nullableString = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STRING_FIELD = "stringField";
  private String stringField;

  public static final String JSON_PROPERTY_INT_FIELD = "intField";
  private BigDecimal intField;

  public ByteArrayObject() {
  }

  public ByteArrayObject nullableArray(byte[] nullableArray) {
    this.nullableArray = JsonNullable.<byte[]>of(nullableArray);
    
    return this;
  }

   /**
   * byte array.
   * @return nullableArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "byte array.")
  @JsonIgnore

  public byte[] getNullableArray() {
        return nullableArray.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getNullableArray_JsonNullable() {
    return nullableArray;
  }
  
  @JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
  public void setNullableArray_JsonNullable(JsonNullable<byte[]> nullableArray) {
    this.nullableArray = nullableArray;
  }

  public void setNullableArray(byte[] nullableArray) {
    this.nullableArray = JsonNullable.<byte[]>of(nullableArray);
  }


  public ByteArrayObject normalArray(byte[] normalArray) {
    
    this.normalArray = normalArray;
    return this;
  }

   /**
   * byte array.
   * @return normalArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "byte array.")
  @JsonProperty(JSON_PROPERTY_NORMAL_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getNormalArray() {
    return normalArray;
  }


  @JsonProperty(JSON_PROPERTY_NORMAL_ARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalArray(byte[] normalArray) {
    this.normalArray = normalArray;
  }


  public ByteArrayObject nullableString(String nullableString) {
    this.nullableString = JsonNullable.<String>of(nullableString);
    
    return this;
  }

   /**
   * Get nullableString
   * @return nullableString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNullableString() {
        return nullableString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNullableString_JsonNullable() {
    return nullableString;
  }
  
  @JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
  public void setNullableString_JsonNullable(JsonNullable<String> nullableString) {
    this.nullableString = nullableString;
  }

  public void setNullableString(String nullableString) {
    this.nullableString = JsonNullable.<String>of(nullableString);
  }


  public ByteArrayObject stringField(String stringField) {
    
    this.stringField = stringField;
    return this;
  }

   /**
   * Get stringField
   * @return stringField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRING_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStringField() {
    return stringField;
  }


  @JsonProperty(JSON_PROPERTY_STRING_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringField(String stringField) {
    this.stringField = stringField;
  }


  public ByteArrayObject intField(BigDecimal intField) {
    
    this.intField = intField;
    return this;
  }

   /**
   * Get intField
   * @return intField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIntField() {
    return intField;
  }


  @JsonProperty(JSON_PROPERTY_INT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntField(BigDecimal intField) {
    this.intField = intField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ByteArrayObject byteArrayObject = (ByteArrayObject) o;
    return equalsNullable(this.nullableArray, byteArrayObject.nullableArray) &&
        Arrays.equals(this.normalArray, byteArrayObject.normalArray) &&
        equalsNullable(this.nullableString, byteArrayObject.nullableString) &&
        Objects.equals(this.stringField, byteArrayObject.stringField) &&
        Objects.equals(this.intField, byteArrayObject.intField);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(nullableArray), Arrays.hashCode(normalArray), hashCodeNullable(nullableString), stringField, intField);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByteArrayObject {\n");
    sb.append("    nullableArray: ").append(toIndentedString(nullableArray)).append("\n");
    sb.append("    normalArray: ").append(toIndentedString(normalArray)).append("\n");
    sb.append("    nullableString: ").append(toIndentedString(nullableString)).append("\n");
    sb.append("    stringField: ").append(toIndentedString(stringField)).append("\n");
    sb.append("    intField: ").append(toIndentedString(intField)).append("\n");
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

}

