package wcs.java.model;

import java.util.LinkedList;
import java.util.List;

public class DefinitionModelBase extends ModelBase {

	private List<HasSetData> definitions = new LinkedList<HasSetData>();
	private String contentDefinitionType;
	private String parentDefinitionType;
	private String attributeType;

	public DefinitionModelBase(String contentDefinitionType,
			String parentDefinitionType, String attributeType) {
		this.contentDefinitionType = contentDefinitionType;
		this.parentDefinitionType = parentDefinitionType;
		this.attributeType = attributeType;
	}

	/**
	 * Create a parent definition
	 * 
	 */
	public ParentDefinition parentDef(DefinitionContainer dc) {
		ParentDefinition pdef = new ParentDefinition(parentDefinitionType,
				attributeType, //
				dc.getId(), dc.getName(), dc.getDescription());
		definitions.add(pdef);
		return pdef;
	}

	/**
	 * Create a parent definition
	 * 
	 */
	public ContentDefinition contentDef(DefinitionContainer dc) {
		ContentDefinition cdef = new ContentDefinition(contentDefinitionType,
				parentDefinitionType, attributeType, //
				dc.getId(), dc.getName(), dc.getDescription());
		definitions.add(cdef);
		return cdef;
	}

	/**
	 * Create a parent definition with Enum
	 *
	 */
	public ParentDefinition parentDef(AttributeEnum ae) {
		ParentDefinition pdef = new ParentDefinition(parentDefinitionType,
				attributeType, //
				ae.getId(), ae.toString(), ae.getDescription());
		definitions.add(pdef);
		return pdef;
	}

	/**
	 * Create a parent definition with Enum-
	 *
	 */
	public ContentDefinition contentDef(AttributeEnum ae) {
		ContentDefinition cdef = new ContentDefinition(contentDefinitionType,
				parentDefinitionType, attributeType, //
				ae.getId(), ae.toString(), ae.getDescription());
		definitions.add(cdef);
		return cdef;
	}
	@Override
	List<HasSetData> getAssetData() {
		return definitions;
	}
}
