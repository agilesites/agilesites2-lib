package wcs.java.model.type;

import wcs.java.model.enums.AttributeTypeEnum;

public interface WCSAttributeType {

    /**
     * Return the attribute name, used for webcenter sites.
     * @return
     */
    AttributeTypeEnum getAttributeName();

}
