package wcs.java.model.type.attribute;

import wcs.java.model.enums.AttributeTypeEnum;

public class DateAttributeType implements WCSAttributeType {
    @Override
    public AttributeTypeEnum getAttributeName() {
        return AttributeTypeEnum.DATE;
    }
}
