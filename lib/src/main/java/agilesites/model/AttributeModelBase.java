package agilesites.model;

import agilesites.model.Attribute.Mul;
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

	public AttributeEditor attrEditor(AttributeEnum ae, String xml) {
		AttributeEditor e = new AttributeEditor(ae, xml);
		attributesAndEditors.add(e);
		return e;
	}
    public AttributeEditor attrEditor(AttributeEditor telmoreAttributeEditor) {
        
    	//AttributeEditor e = new AttributeEditor(telmoreAttributeEditor.getName(), telmoreAttributeEditor.toXml());
        //attributesAndEditors.add(e);
        //return e;
    	throw new RuntimeException("FIX ME!!!");
    	//return null;
    }

	public Attribute attribute(String type, AttributeEnum ae, Mul mul,
			boolean notEmbedded, boolean existDep) {
		Attribute a = new Attribute(table, type, ae, mul, notEmbedded, existDep);
		attributesAndEditors.add(a);
		return a;
	}

	public Attribute attrText(AttributeEnum ae, Mul mul, boolean embedded) {
		return attribute("text", ae, mul, embedded, true);
	}

	public Attribute attrString(AttributeEnum ae, Mul mul) {
		return attribute("string", ae, mul, true, true);
	}

	public Attribute attrBlob(AttributeEnum ae, Mul mul) {
		return attribute("blob", ae, mul, true, true);
	}

	public Attribute attrDate(AttributeEnum ae, Mul mul) {
		return attribute("date", ae, mul, true, true);
	}

	public Attribute attrMoney(AttributeEnum ae, Mul mul) {
		return attribute("money", ae, mul, true, true);
	}

	public Attribute attrFloat(AttributeEnum ae, Mul mul) {
		return attribute("float", ae, mul, true, true);
	}

	public Attribute attrInt(AttributeEnum ae, Mul mul) {
		return attribute("int", ae, mul, true, true);
	}

	public Attribute attrAsset(AttributeEnum ae, Mul mul) {
		return attribute("asset", ae, mul, true, true);
	}

	@Override
	List<HasSetData> getAssetData() {
		return attributesAndEditors;
	}

}
