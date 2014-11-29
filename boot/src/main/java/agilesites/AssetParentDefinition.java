package agilesites;

/**
 * Declare a class must map to flex asset parent definition.
 * 
 * @author msciab
 * 
 */
public @interface AssetParentDefinition {

	/**
	 * Name of the definition
	 */
	String name();

	/**
	 * Attribute type for the content
	 */
	String attributeType();

}
