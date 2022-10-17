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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Capitalization
 */
@JsonPropertyOrder({
  Capitalization.JSON_PROPERTY_SMALL_CAMEL,
  Capitalization.JSON_PROPERTY_CAPITAL_CAMEL,
  Capitalization.JSON_PROPERTY_SMALL_SNAKE,
  Capitalization.JSON_PROPERTY_CAPITAL_SNAKE,
  Capitalization.JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS,
  Capitalization.JSON_PROPERTY_A_T_T_N_A_M_E
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class Capitalization  implements Serializable {
  public static final String JSON_PROPERTY_SMALL_CAMEL = "smallCamel";
  @JsonProperty(JSON_PROPERTY_SMALL_CAMEL)
  private String smallCamel;

  public static final String JSON_PROPERTY_CAPITAL_CAMEL = "CapitalCamel";
  @JsonProperty(JSON_PROPERTY_CAPITAL_CAMEL)
  private String capitalCamel;

  public static final String JSON_PROPERTY_SMALL_SNAKE = "small_Snake";
  @JsonProperty(JSON_PROPERTY_SMALL_SNAKE)
  private String smallSnake;

  public static final String JSON_PROPERTY_CAPITAL_SNAKE = "Capital_Snake";
  @JsonProperty(JSON_PROPERTY_CAPITAL_SNAKE)
  private String capitalSnake;

  public static final String JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS = "SCA_ETH_Flow_Points";
  @JsonProperty(JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS)
  private String scAETHFlowPoints;

  public static final String JSON_PROPERTY_A_T_T_N_A_M_E = "ATT_NAME";
  @JsonProperty(JSON_PROPERTY_A_T_T_N_A_M_E)
  private String ATT_NAME;

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

  /**
   * Get smallCamel
   * @return smallCamel
   **/
  @JsonProperty(value = "smallCamel")
  @ApiModelProperty(value = "")
  
  public String getSmallCamel() {
    return smallCamel;
  }

  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

  /**
   * Get capitalCamel
   * @return capitalCamel
   **/
  @JsonProperty(value = "CapitalCamel")
  @ApiModelProperty(value = "")
  
  public String getCapitalCamel() {
    return capitalCamel;
  }

  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

  /**
   * Get smallSnake
   * @return smallSnake
   **/
  @JsonProperty(value = "small_Snake")
  @ApiModelProperty(value = "")
  
  public String getSmallSnake() {
    return smallSnake;
  }

  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

  /**
   * Get capitalSnake
   * @return capitalSnake
   **/
  @JsonProperty(value = "Capital_Snake")
  @ApiModelProperty(value = "")
  
  public String getCapitalSnake() {
    return capitalSnake;
  }

  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
   **/
  @JsonProperty(value = "SCA_ETH_Flow_Points")
  @ApiModelProperty(value = "")
  
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }

  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  /**
   * Name of the pet 
   * @return ATT_NAME
   **/
  @JsonProperty(value = "ATT_NAME")
  @ApiModelProperty(value = "Name of the pet ")
  
  public String getATTNAME() {
    return ATT_NAME;
  }

  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

