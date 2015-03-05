package wcs.java.model;

import wcs.java.model.Attribute.Mul;

import java.util.LinkedList;
import java.util.List;

/**
 * Base of attribute model classes
 * 
 * @author msciab
 * 
 */
public class AttributeModelBase extends ModelBase {

	private String table;
	private List<HasSetData> attributesAndEditors = new LinkedList<HasSetData>();

	public AttributeModelBase(String table) {
		this.table = table;
	}

	public AttributeEditor attrEditor(DefinitionContainer dc, String xml) {
		AttributeEditor e = new AttributeEditor(dc, xml);
		attributesAndEditors.add(e);
		return e;
	}

	public AttributeEditor attrEditor(AttributeEnum ae, String xml) {
		AttributeEditor e = new AttributeEditor(ae, xml);
		attributesAndEditors.add(e);
		return e;
	}

    public Attribute attribute(String type, DefinitionContainer dc, Mul mul,
			boolean notEmbedded, boolean existDep) {
		Attribute a = new Attribute(table, type, dc, mul, notEmbedded, existDep);
		attributesAndEditors.add(a);
		return a;
	}

	public Attribute attrText(DefinitionContainer dc, Mul mul, boolean embedded) {
		return attribute("text", dc, mul, embedded, true);
	}

	public Attribute attrString(DefinitionContainer dc, Mul mul) {
		return attribute("string", dc, mul, true, true);
	}

	public Attribute attrBlob(DefinitionContainer dc, Mul mul) {
		return attribute("blob", dc, mul, true, true);
	}

	public Attribute attrDate(DefinitionContainer dc, Mul mul) {
		return attribute("date", dc, mul, true, true);
	}

	public Attribute attrMoney(DefinitionContainer dc, Mul mul) {
		return attribute("money", dc, mul, true, true);
	}

	public Attribute attrFloat(DefinitionContainer dc, Mul mul) {
		return attribute("float", dc, mul, true, true);
	}

	public Attribute attrInt(DefinitionContainer dc, Mul mul) {
		return attribute("int", dc, mul, true, true);
	}

	public Attribute attrAsset(DefinitionContainer dc, Mul mul) {
		return attribute("asset", dc, mul, true, true);
	}


	@Override
	List<HasSetData> getAssetData() {
		return attributesAndEditors;
	}

}
