package wcs.java.model.enums;

/**
 *
 * Constants used by the application.
 */
public final class Constants {
    private Constants() {}

    /** Maximumum lenght an attribute is permitted by AgileSites. */
    public static final int ATTRIBUTE_MAX_LENGH = 40;

    public static final long FIRST = 1000000000000l;
	public static final long PAGE_ATTRIBUTE_START = FIRST + 10000000000l;
	public static final long ATTRIBUTE_EDITOR_START = FIRST + 20000000000l;
	public static final long DEFINITION_START = FIRST + 30000000000l;
	public static final long ATTRIBUTE_START = FIRST + 40000000000l;
    public static final long PAGE_DEFINITION_START = FIRST + 50000000000l;
    public static final long STARTMENU_START = FIRST + 60000000000l;
}
