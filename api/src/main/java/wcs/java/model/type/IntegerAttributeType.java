package wcs.java.model.type;

import wcs.java.model.enums.AttributeTypeEnum;

public class IntegerAttributeType implements WCSAttributeType {
    @Override
    public AttributeTypeEnum getAttributeName() {
        return AttributeTypeEnum.INT;
    }
}
