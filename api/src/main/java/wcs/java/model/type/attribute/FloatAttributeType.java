package wcs.java.model.type.attribute;

import wcs.java.model.enums.AttributeTypeEnum;

public class FloatAttributeType implements WCSAttributeType {

    @Override
    public AttributeTypeEnum getAttributeName() {
        return AttributeTypeEnum.FLOAT;
    }
}
