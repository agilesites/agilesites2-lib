package agilesites.model;

public class ContentDefinition extends ParentDefinition implements HasSetData {
	
	private String type;
	
	public ContentDefinition(String type, String parent, String attributeTable, long id,
			String name, String description) {
		super(parent, attributeTable, id, name, description);
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}
}
