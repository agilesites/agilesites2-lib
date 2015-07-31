package wcs.java.model;


import wcs.java.model.enums.AttributeTypeEnum;

import java.util.Arrays;

/**
 * WCS Definition container, used for data keeping of attributes and asset definitions.
 *
 */
public class DefinitionContainer {

    private long id;
    private String name;
    private String description;
    private AttributeTypeEnum type;
    private Attribute.Mul mul;
    private boolean required;
    private AttributeEnum editor;
    private String assetType;
    private String assetSubtypes[];
    private String conflictValue;

    /**
     * Constructor for asset definition
     * @param id the attribute id
     * @param name the attribute name
     * @param description the attribute description
     */
    public DefinitionContainer(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Constructor for attribute definition with editor
     * @param id the attribute id
     * @param name the attribute name
     * @param description the attribute description
     * @param type the attribute type
     * @param mul single|multiple
     * @param editor the attribute editor name
     * @param assetType the asset type name
     * @param assetSubtypes the asset subtype names
     */
    public DefinitionContainer(long id, String name, String description, AttributeTypeEnum type, Attribute.Mul mul, AttributeEnum editor, String assetType, String... assetSubtypes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.mul = mul;
        this.editor = editor;
        this.assetType = assetType;
        this.assetSubtypes = assetSubtypes;
    }

    /**
     * Constructor for attribute definition with editor
     * @param id the attribute id
     * @param name the attribute name
     * @param description the attribute description
     * @param type the attribute type
     * @param mul single|multiple
     * @param editor the attribute editor name
     * @param assetType the asset type name
     */
    public DefinitionContainer(long id, String name, String description, AttributeTypeEnum type, Attribute.Mul mul, AttributeEnum editor, String assetType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.mul = mul;
        this.editor = editor;
        this.assetType = assetType;
    }

    /**
     * Constructor for attribute definition
     * @param id the attribute id
     * @param name the attribute name
     * @param description the attribute description
     * @param type the attribute type
     * @param mul single|multiple
     */
    public DefinitionContainer(long id, String name, String description, AttributeTypeEnum type, Attribute.Mul mul) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.mul = mul;
    }

    /**
     * Constructor for start menu
     * @param id the attribute id
     * @param name the attribute name
     * @param description the attribute description
     * @param assetType the asset type
     */
    public DefinitionContainer(long id, String name, String description, String assetType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.assetType = assetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefinitionContainer that = (DefinitionContainer) o;

        if (!name.equals(that.name)) return false;
        if (type != that.type) {conflictValue = "type"; return false;}
        if (description != null ? !description.equals(that.description) : that.description != null)  {that.conflictValue = "description"; return false;}
        if (mul != that.mul) {conflictValue = "mul"; return false;}
        if (editor != null ? !editor.equals(that.editor) : that.editor != null) {conflictValue = "editor"; return false;}
        if (assetType != null ? !assetType.equals(that.assetType) : that.assetType != null) {conflictValue = "assetType"; return false;}
        if (!Arrays.equals(assetSubtypes, that.assetSubtypes)) {conflictValue = "assetSubtypes"; return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + type.hashCode();
        result = 31 * result + (mul != null ? mul.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + (assetType != null ? assetType.hashCode() : 0);
        result = 31 * result + (assetSubtypes != null ? Arrays.hashCode(assetSubtypes) : 0);
        return result;
    }

    public String toString() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AttributeTypeEnum getType() {
        return type;
    }

    public void setType(AttributeTypeEnum type) {
        this.type = type;
    }

    public Attribute.Mul getMul() {
        return mul;
    }

    public void setMul(Attribute.Mul mul) {
        this.mul = mul;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public AttributeEnum getEditor() {
        return editor;
    }

    public void setEditor(AttributeEnum editor) {
        this.editor = editor;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String[] getAssetSubtypes() {
        return assetSubtypes;
    }

    public String getConflictValue() {
        return conflictValue;
    }
}
