package wcs.java.model.type.attribute;

import wcs.java.model.enums.AttributeTypeEnum;

public class TextAttributeType implements WCSAttributeType {
    @Override
    public AttributeTypeEnum getAttributeName() {
        return AttributeTypeEnum.TEXT;
    }
}
