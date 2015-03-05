package wcs.java.model.type;

import wcs.java.model.enums.AttributeTypeEnum;

public class AssetAttributeType implements WCSAttributeType {
    @Override
    public AttributeTypeEnum getAttributeName() {
        return AttributeTypeEnum.ASSET;
    }
}
