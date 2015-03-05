package wcs.java.model;

public abstract class AttributeEditorBase {

    protected AttributeEnum name;

    public AttributeEditorBase(AttributeEnum name) {
        this.name = name;
    }

    public AttributeEnum getName() {
        return name;
    }

    public abstract String toXml();
    public abstract String getConfigElements();
}
