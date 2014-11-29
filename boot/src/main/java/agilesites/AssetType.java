package agilesites;

/**
 * Declare a class must map to an asset type.
 * 
 * @author msciab
 *
 */
public @interface AssetType {
	
	/** 
	 * name of the type
	 */
	String name();
	
	/**
	 * Is it a flex asset or a basic asset?
	 * @return
	 */
	boolean flex() default false;
	
	/**
	 * Is it a parent asset?
	 * @return
	 */
	boolean parent() default false;
}
