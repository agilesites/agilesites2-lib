package wcs.java.model.enums;

public enum AssetTypeNames {

    STATIC("Static"),
    TEMPLATE("Template"),
    CS_ELEMENT("CSElement"),
    SITE_ENTRY("SiteEntry"),
    ATTR_TYPES("AttrTypes"),
    PAGE_ATTRIBUTE("PageAttribute"),
    PAGE_DEFINITION("PageDefinition"),
    PAGE("Page"),
    ADV_COLS("AdvCols"),
    SEGMENTS("Segments"),
    SCALAR_VARS("ScalarVals");

    private String desc;

    private AssetTypeNames(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }

}

