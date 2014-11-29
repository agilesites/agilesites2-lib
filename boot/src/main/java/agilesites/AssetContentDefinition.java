package agilesites;

/**
 * Annotation to declare a class must map to a flex content asset definition.
 * 
 * @author msciab
 * 
 */
public @interface AssetContentDefinition {
	
	/**
	 * Name of the definition
	 */
	String name();
	
	/**
	 * Attribute type for the content
	 */
	String attributeType();

	/**
	 * Parent definition classes.
	 */
	Class<?>[] parents();
}
