package wcs.java.model;

import wcs.java.model.enums.Constants;
import wcs.java.util.NamingUtil;

public class EditorAttribute implements AttributeEnum {

    private String name;
    private long id;
    private String desc;

    public EditorAttribute(String description, String name) {
        this.id = Constants.ATTRIBUTE_START + NamingUtil.hash(name);
        this.desc = description;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
