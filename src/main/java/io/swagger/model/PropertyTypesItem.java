package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyTypesItem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PropertyTypesItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T14:51:08.605Z[GMT]")


public class PropertyTypesItem   {
  @JsonProperty("_systemKey")
  private String _systemKey = null;

  @JsonProperty("_typeKey")
  private String _typeKey = null;

  @JsonProperty("_owner")
  private String _owner = null;

  @JsonProperty("_description")
  private String _description = null;

  @JsonProperty("_languageDependent")
  private Boolean _languageDependent = null;

  @JsonProperty("_marketDependent")
  private Boolean _marketDependent = null;

  @JsonProperty("_customerDependent")
  private Boolean _customerDependent = null;

  @JsonProperty("_baseType")
  private String _baseType = null;

  @JsonProperty("_typeId")
  private String _typeId = null;

  @JsonProperty("_isList")
  private Boolean _isList = null;

  @JsonProperty("_isMimeAsset")
  private Boolean _isMimeAsset = null;

  @JsonProperty("_components")
  private PropertyTypesItem _components = null;

  @JsonProperty("isEnum")
  private Boolean isEnum = null;

  @JsonProperty("isComposite")
  private Boolean isComposite = null;

  public PropertyTypesItem _systemKey(String _systemKey) {
    this._systemKey = _systemKey;
    return this;
  }

  /**
   * Get _systemKey
   * @return _systemKey
  **/
  @ApiModelProperty(example = "017/_systemKey", required = true, value = "")
      @NotNull

    public String getSystemKey() {
    return _systemKey;
  }

  public void setSystemKey(String _systemKey) {
    this._systemKey = _systemKey;
  }

  public PropertyTypesItem _typeKey(String _typeKey) {
    this._typeKey = _typeKey;
    return this;
  }

  /**
   * Get _typeKey
   * @return _typeKey
  **/
  @ApiModelProperty(example = "017/_typeKey", required = true, value = "")
      @NotNull

    public String getTypeKey() {
    return _typeKey;
  }

  public void setTypeKey(String _typeKey) {
    this._typeKey = _typeKey;
  }

  public PropertyTypesItem _owner(String _owner) {
    this._owner = _owner;
    return this;
  }

  /**
   * Get _owner
   * @return _owner
  **/
  @ApiModelProperty(example = "15", required = true, value = "")
      @NotNull

    public String getOwner() {
    return _owner;
  }

  public void setOwner(String _owner) {
    this._owner = _owner;
  }

  public PropertyTypesItem _description(String _description) {
    this._description = _description;
    return this;
  }

  /**
   * Get _description
   * @return _description
  **/
  @ApiModelProperty(example = "017/_description", required = true, value = "")
      @NotNull

    public String getDescription() {
    return _description;
  }

  public void setDescription(String _description) {
    this._description = _description;
  }

  public PropertyTypesItem _languageDependent(Boolean _languageDependent) {
    this._languageDependent = _languageDependent;
    return this;
  }

  /**
   * Get _languageDependent
   * @return _languageDependent
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isLanguageDependent() {
    return _languageDependent;
  }

  public void setLanguageDependent(Boolean _languageDependent) {
    this._languageDependent = _languageDependent;
  }

  public PropertyTypesItem _marketDependent(Boolean _marketDependent) {
    this._marketDependent = _marketDependent;
    return this;
  }

  /**
   * Get _marketDependent
   * @return _marketDependent
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isMarketDependent() {
    return _marketDependent;
  }

  public void setMarketDependent(Boolean _marketDependent) {
    this._marketDependent = _marketDependent;
  }

  public PropertyTypesItem _customerDependent(Boolean _customerDependent) {
    this._customerDependent = _customerDependent;
    return this;
  }

  /**
   * Get _customerDependent
   * @return _customerDependent
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isCustomerDependent() {
    return _customerDependent;
  }

  public void setCustomerDependent(Boolean _customerDependent) {
    this._customerDependent = _customerDependent;
  }

  public PropertyTypesItem _baseType(String _baseType) {
    this._baseType = _baseType;
    return this;
  }

  /**
   * Get _baseType
   * @return _baseType
  **/
  @ApiModelProperty(example = "String", required = true, value = "")
      @NotNull

    public String getBaseType() {
    return _baseType;
  }

  public void setBaseType(String _baseType) {
    this._baseType = _baseType;
  }

  public PropertyTypesItem _typeId(String _typeId) {
    this._typeId = _typeId;
    return this;
  }

  /**
   * Get _typeId
   * @return _typeId
  **/
  @ApiModelProperty(example = "pt11_424242", required = true, value = "")
      @NotNull

    public String getTypeId() {
    return _typeId;
  }

  public void setTypeId(String _typeId) {
    this._typeId = _typeId;
  }

  public PropertyTypesItem _isList(Boolean _isList) {
    this._isList = _isList;
    return this;
  }

  /**
   * Get _isList
   * @return _isList
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isIsList() {
    return _isList;
  }

  public void setIsList(Boolean _isList) {
    this._isList = _isList;
  }

  public PropertyTypesItem _isMimeAsset(Boolean _isMimeAsset) {
    this._isMimeAsset = _isMimeAsset;
    return this;
  }

  /**
   * Get _isMimeAsset
   * @return _isMimeAsset
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isIsMimeAsset() {
    return _isMimeAsset;
  }

  public void setIsMimeAsset(Boolean _isMimeAsset) {
    this._isMimeAsset = _isMimeAsset;
  }

  public PropertyTypesItem _components(PropertyTypesItem _components) {
    this._components = _components;
    return this;
  }

  /**
   * Get _components
   * @return _components
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PropertyTypesItem getComponents() {
    return _components;
  }

  public void setComponents(PropertyTypesItem _components) {
    this._components = _components;
  }

  public PropertyTypesItem isEnum(Boolean isEnum) {
    this.isEnum = isEnum;
    return this;
  }

  /**
   * Get isEnum
   * @return isEnum
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isIsEnum() {
    return isEnum;
  }

  public void setIsEnum(Boolean isEnum) {
    this.isEnum = isEnum;
  }

  public PropertyTypesItem isComposite(Boolean isComposite) {
    this.isComposite = isComposite;
    return this;
  }

  /**
   * Get isComposite
   * @return isComposite
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
      @NotNull

    public Boolean isIsComposite() {
    return isComposite;
  }

  public void setIsComposite(Boolean isComposite) {
    this.isComposite = isComposite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyTypesItem propertyTypesItem = (PropertyTypesItem) o;
    return Objects.equals(this._systemKey, propertyTypesItem._systemKey) &&
        Objects.equals(this._typeKey, propertyTypesItem._typeKey) &&
        Objects.equals(this._owner, propertyTypesItem._owner) &&
        Objects.equals(this._description, propertyTypesItem._description) &&
        Objects.equals(this._languageDependent, propertyTypesItem._languageDependent) &&
        Objects.equals(this._marketDependent, propertyTypesItem._marketDependent) &&
        Objects.equals(this._customerDependent, propertyTypesItem._customerDependent) &&
        Objects.equals(this._baseType, propertyTypesItem._baseType) &&
        Objects.equals(this._typeId, propertyTypesItem._typeId) &&
        Objects.equals(this._isList, propertyTypesItem._isList) &&
        Objects.equals(this._isMimeAsset, propertyTypesItem._isMimeAsset) &&
        Objects.equals(this._components, propertyTypesItem._components) &&
        Objects.equals(this.isEnum, propertyTypesItem.isEnum) &&
        Objects.equals(this.isComposite, propertyTypesItem.isComposite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_systemKey, _typeKey, _owner, _description, _languageDependent, _marketDependent, _customerDependent, _baseType, _typeId, _isList, _isMimeAsset, _components, isEnum, isComposite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyTypesItem {\n");
    
    sb.append("    _systemKey: ").append(toIndentedString(_systemKey)).append("\n");
    sb.append("    _typeKey: ").append(toIndentedString(_typeKey)).append("\n");
    sb.append("    _owner: ").append(toIndentedString(_owner)).append("\n");
    sb.append("    _description: ").append(toIndentedString(_description)).append("\n");
    sb.append("    _languageDependent: ").append(toIndentedString(_languageDependent)).append("\n");
    sb.append("    _marketDependent: ").append(toIndentedString(_marketDependent)).append("\n");
    sb.append("    _customerDependent: ").append(toIndentedString(_customerDependent)).append("\n");
    sb.append("    _baseType: ").append(toIndentedString(_baseType)).append("\n");
    sb.append("    _typeId: ").append(toIndentedString(_typeId)).append("\n");
    sb.append("    _isList: ").append(toIndentedString(_isList)).append("\n");
    sb.append("    _isMimeAsset: ").append(toIndentedString(_isMimeAsset)).append("\n");
    sb.append("    _components: ").append(toIndentedString(_components)).append("\n");
    sb.append("    isEnum: ").append(toIndentedString(isEnum)).append("\n");
    sb.append("    isComposite: ").append(toIndentedString(isComposite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
