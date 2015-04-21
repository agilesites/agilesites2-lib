package wcs.java.model.type;

/**
 * Created by alemonge1 on 07/04/2015.
 */
public class WCSFlexAssetType {
    String name;
    String description;
    String pluralForm;
    String parent;
    private String contentDef;
    private String attributeType;
    private String filterType;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public WCSFlexAssetType(String name, String description, String pluralForm, String parent) {
        this.name = name;
        this.description = description;
        this.pluralForm = pluralForm;
        this.parent = parent;
    }

    public WCSFlexAssetType(String name, String description, String pluralForm, String parent, String contentDef) {
        this.name = name;
        this.description = description;
        this.pluralForm = pluralForm;
        this.parent = parent;
        this.contentDef = contentDef;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPluralForm() {
        return pluralForm;
    }

    public String getParent() {
        return parent;
    }

    public String getContentDef() {
        return contentDef;
    }

    public void setContentDef(String contentDef) {
        this.contentDef = contentDef;
    }
}
