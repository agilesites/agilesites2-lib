package wcs.java.model.editors;

public abstract class AbstractAttributeEditor  {

    protected String name;

    public AbstractAttributeEditor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String toXml();
}
