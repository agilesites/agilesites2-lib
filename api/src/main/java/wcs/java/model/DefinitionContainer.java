package wcs.java.model;


import wcs.java.model.enums.AttributeTypeEnum;

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

    /**
     * Name has to be unique
     * @param obj the object to compare to
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((DefinitionContainer)obj).getName());
    }

    @Override
    public int hashCode() {
        return 31 + ((name == null) ? 0 : name.hashCode());
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
}
