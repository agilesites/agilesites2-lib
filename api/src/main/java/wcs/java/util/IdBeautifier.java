package wcs.java.util;


import wcs.api.Asset;
import wcs.java.model.enums.Constants;

import java.util.UUID;

public final class IdBeautifier {

    /**
     * simply generates an id string that consist of the subtype of an asset and the id
     * (Often it's needed to provide some kind of unique id in the html template using the picker - this helps doing it ;) )
     * @param a the asset to get the nice id for
     * @return a nice string id
     */
    public static String getId(Asset a){
        return a.getSubtype() + "-" + a.getId().cid;
    }

    /**
     * Generates an unique ID based on the UUID random generator
     * @return a unique id
     */
    public static String generateGlobalUniqueId(){
        return UUID.randomUUID().toString();
    }

    /**
     * Generates an unique definition ID, based on definition name.
     * @param name
     * @return unique definition id
     */
    public static long generateUniqueAttrId(String name) {
        return Constants.ATTRIBUTE_START + NamingUtil.hash(name);
    }

    /**
     * Generates an unique definition ID, based on definition name.
     * @param name
     * @return unique definition id
     */
    public static long generateUniqueDefId(String name) {
        return Constants.DEFINITION_START + NamingUtil.hash(name);
    }

    /**
     * Generates an unique page definition ID, based on definition name.
     * @param name
     * @return unique definition id
     */
    public static long generateUniquePageDefId(String name) {
        return Constants.PAGE_DEFINITION_START + NamingUtil.hash(name);
    }

    /**
     * Generates an unique page attribute ID, based on definition name.
     * @param name
     * @return unique definition id
     */
    public static long generateUniquePageAttrId(String name) {
        return Constants.PAGE_ATTRIBUTE_START + NamingUtil.hash(name);
    }

    /**
     * Generates an unique start menu ID, based on asset name.
     * @param name
     * @return unique start menu id
     */
    public static long generateUniqueStartMenuId(String name) {
        return Constants.STARTMENU_START + NamingUtil.hash(name);
    }
}
