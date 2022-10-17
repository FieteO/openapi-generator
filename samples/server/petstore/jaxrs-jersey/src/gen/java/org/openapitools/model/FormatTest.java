/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * FormatTest
 */
@JsonPropertyOrder({
  FormatTest.JSON_PROPERTY_INTEGER,
  FormatTest.JSON_PROPERTY_INT32,
  FormatTest.JSON_PROPERTY_INT64,
  FormatTest.JSON_PROPERTY_NUMBER,
  FormatTest.JSON_PROPERTY_FLOAT,
  FormatTest.JSON_PROPERTY_DOUBLE,
  FormatTest.JSON_PROPERTY_DECIMAL,
  FormatTest.JSON_PROPERTY_STRING,
  FormatTest.JSON_PROPERTY_BYTE,
  FormatTest.JSON_PROPERTY_BINARY,
  FormatTest.JSON_PROPERTY_DATE,
  FormatTest.JSON_PROPERTY_DATE_TIME,
  FormatTest.JSON_PROPERTY_UUID,
  FormatTest.JSON_PROPERTY_PASSWORD,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS,
  FormatTest.JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class FormatTest   {
  public static final String JSON_PROPERTY_INTEGER = "integer";
  @JsonProperty(JSON_PROPERTY_INTEGER)
  private Integer integer;

  public static final String JSON_PROPERTY_INT32 = "int32";
  @JsonProperty(JSON_PROPERTY_INT32)
  private Integer int32;

  public static final String JSON_PROPERTY_INT64 = "int64";
  @JsonProperty(JSON_PROPERTY_INT64)
  private Long int64;

  public static final String JSON_PROPERTY_NUMBER = "number";
  @JsonProperty(JSON_PROPERTY_NUMBER)
  private BigDecimal number;

  public static final String JSON_PROPERTY_FLOAT = "float";
  @JsonProperty(JSON_PROPERTY_FLOAT)
  private Float _float;

  public static final String JSON_PROPERTY_DOUBLE = "double";
  @JsonProperty(JSON_PROPERTY_DOUBLE)
  private Double _double;

  public static final String JSON_PROPERTY_DECIMAL = "decimal";
  @JsonProperty(JSON_PROPERTY_DECIMAL)
  private BigDecimal decimal;

  public static final String JSON_PROPERTY_STRING = "string";
  @JsonProperty(JSON_PROPERTY_STRING)
  private String string;

  public static final String JSON_PROPERTY_BYTE = "byte";
  @JsonProperty(JSON_PROPERTY_BYTE)
  private byte[] _byte;

  public static final String JSON_PROPERTY_BINARY = "binary";
  @JsonProperty(JSON_PROPERTY_BINARY)
  private File binary;

  public static final String JSON_PROPERTY_DATE = "date";
  @JsonProperty(JSON_PROPERTY_DATE)
  private Date date;

  public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
  @JsonProperty(JSON_PROPERTY_DATE_TIME)
  private Date dateTime;

  public static final String JSON_PROPERTY_UUID = "uuid";
  @JsonProperty(JSON_PROPERTY_UUID)
  private UUID uuid;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  private String password;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS = "pattern_with_digits";
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS)
  private String patternWithDigits;

  public static final String JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER = "pattern_with_digits_and_delimiter";
  @JsonProperty(JSON_PROPERTY_PATTERN_WITH_DIGITS_AND_DELIMITER)
  private String patternWithDigitsAndDelimiter;

  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }

  /**
   * Get integer
   * minimum: 10
   * maximum: 100
   * @return integer
   **/
  @JsonProperty(value = "integer")
  @ApiModelProperty(value = "")
   @Min(10) @Max(100)
  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

  /**
   * Get int32
   * minimum: 20
   * maximum: 200
   * @return int32
   **/
  @JsonProperty(value = "int32")
  @ApiModelProperty(value = "")
   @Min(20) @Max(200)
  public Integer getInt32() {
    return int32;
  }

  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }

  /**
   * Get int64
   * @return int64
   **/
  @JsonProperty(value = "int64")
  @ApiModelProperty(value = "")
  
  public Long getInt64() {
    return int64;
  }

  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * minimum: 32.1
   * maximum: 543.2
   * @return number
   **/
  @JsonProperty(value = "number")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid  @DecimalMin("32.1") @DecimalMax("543.2")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }

  /**
   * Get _float
   * minimum: 54.3
   * maximum: 987.6
   * @return _float
   **/
  @JsonProperty(value = "float")
  @ApiModelProperty(value = "")
   @DecimalMin("54.3") @DecimalMax("987.6")
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }

  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * minimum: 67.8
   * maximum: 123.4
   * @return _double
   **/
  @JsonProperty(value = "double")
  @ApiModelProperty(value = "")
   @DecimalMin("67.8") @DecimalMax("123.4")
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }

  public FormatTest decimal(BigDecimal decimal) {
    this.decimal = decimal;
    return this;
  }

  /**
   * Get decimal
   * @return decimal
   **/
  @JsonProperty(value = "decimal")
  @ApiModelProperty(value = "")
  @Valid 
  public BigDecimal getDecimal() {
    return decimal;
  }

  public void setDecimal(BigDecimal decimal) {
    this.decimal = decimal;
  }

  public FormatTest string(String string) {
    this.string = string;
    return this;
  }

  /**
   * Get string
   * @return string
   **/
  @JsonProperty(value = "string")
  @ApiModelProperty(value = "")
   @Pattern(regexp="/[a-z]/i")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

  /**
   * Get _byte
   * @return _byte
   **/
  @JsonProperty(value = "byte")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public byte[] getByte() {
    return _byte;
  }

  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  public FormatTest binary(File binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
   **/
  @JsonProperty(value = "binary")
  @ApiModelProperty(value = "")
  
  public File getBinary() {
    return binary;
  }

  public void setBinary(File binary) {
    this.binary = binary;
  }

  public FormatTest date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @JsonProperty(value = "date")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public FormatTest dateTime(Date dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
   **/
  @JsonProperty(value = "dateTime")
  @ApiModelProperty(value = "")
  
  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  public FormatTest uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   **/
  @JsonProperty(value = "uuid")
  @ApiModelProperty(example = "72f98069-206d-4f12-9f12-3d1e525a8e84", value = "")
  
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public FormatTest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @JsonProperty(value = "password")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Size(min=10,max=64)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FormatTest patternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
    return this;
  }

  /**
   * A string that is a 10 digit number. Can have leading zeros.
   * @return patternWithDigits
   **/
  @JsonProperty(value = "pattern_with_digits")
  @ApiModelProperty(value = "A string that is a 10 digit number. Can have leading zeros.")
   @Pattern(regexp="^\\d{10}$")
  public String getPatternWithDigits() {
    return patternWithDigits;
  }

  public void setPatternWithDigits(String patternWithDigits) {
    this.patternWithDigits = patternWithDigits;
  }

  public FormatTest patternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
    return this;
  }

  /**
   * A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.
   * @return patternWithDigitsAndDelimiter
   **/
  @JsonProperty(value = "pattern_with_digits_and_delimiter")
  @ApiModelProperty(value = "A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.")
   @Pattern(regexp="/^image_\\d{1,3}$/i")
  public String getPatternWithDigitsAndDelimiter() {
    return patternWithDigitsAndDelimiter;
  }

  public void setPatternWithDigitsAndDelimiter(String patternWithDigitsAndDelimiter) {
    this.patternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.decimal, formatTest.decimal) &&
        Objects.equals(this.string, formatTest.string) &&
        Objects.equals(this._byte, formatTest._byte) &&
        Objects.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.uuid, formatTest.uuid) &&
        Objects.equals(this.password, formatTest.password) &&
        Objects.equals(this.patternWithDigits, formatTest.patternWithDigits) &&
        Objects.equals(this.patternWithDigitsAndDelimiter, formatTest.patternWithDigitsAndDelimiter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, decimal, string, _byte, binary, date, dateTime, uuid, password, patternWithDigits, patternWithDigitsAndDelimiter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    patternWithDigits: ").append(toIndentedString(patternWithDigits)).append("\n");
    sb.append("    patternWithDigitsAndDelimiter: ").append(toIndentedString(patternWithDigitsAndDelimiter)).append("\n");
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

