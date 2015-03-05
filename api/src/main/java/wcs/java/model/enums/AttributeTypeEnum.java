package wcs.java.model.enums;

public enum AttributeTypeEnum {
    STRING("string"),
    TEXT("text"),
    INT("int"),
    BLOB("blob"),
    FLOAT("float"),
    MONEY("money"),
    DATE("date"),
    ASSET("asset");

    private String type;

    private AttributeTypeEnum(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
