package wcs.java.model.enums;

public enum StartMenuTypeEnum {
    MENU_TYPE_NEW("ContentForm"),
    MENU_TYPE_FIND("Search");

    private String type;

    private StartMenuTypeEnum(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
