package wcs.java.util;

/**
 *
 * Utility class for naming conversion.
 */
public final class NamingUtil {

    /**
     * Converts standard constant naming convention (eg. MY_CONSTANT) to preferred Sites attribute naming
     * convention (eg. MyConstant)
     *
     * @param name Name to be converted (eg. MY_CONSTANT)
     * @return Converted name (eg. MyConstant)
     */
    public static String convert(String name) {
        String[] parts = name.split("_");
        StringBuilder sb = new StringBuilder();
        for (String part : parts){
            sb.append(part.substring(0, 1).toUpperCase());
            sb.append(part.substring(1).toLowerCase());
        }
        return sb.toString();
    }

	public static int hash(String name) {
		int hash = 3;
		String cname = convert(name);
		for(int i = 0; i<cname.length(); i++) 
			hash = hash*5 + name.charAt(i);
		return hash;
	}
}
