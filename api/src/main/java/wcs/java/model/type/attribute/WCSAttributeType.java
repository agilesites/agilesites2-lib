package wcs.java.model.type.attribute;

import wcs.java.model.enums.AttributeTypeEnum;

public interface WCSAttributeType {

    /**
     * Return the attribute name, used for webcenter sites.
     * @return
     */
    AttributeTypeEnum getAttributeName();

}
