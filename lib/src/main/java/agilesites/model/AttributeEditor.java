package agilesites.model;

import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.BlobObject;
import com.fatwire.assetapi.data.BlobObjectImpl;

// the attribute editor
public class AttributeEditor implements HasSetData {
	long id;
	String name;
	String description;
	String xml;

	AttributeEditor(AttributeEnum ae, String xml) {
		this.id = ae.getId();
		this.name = ae.toString();
		this.description = ae.getDescription();
		if (xml.startsWith("<?xml"))
			this.xml = xml;
		else
			this.xml = "<?xml version=\"1.0\"?>\n"
					+ "<!DOCTYPE PRESENTATIONOBJECT SYSTEM \"presentationobject.dtd\">\n"
					+ "<PRESENTATIONOBJECT NAME=\"RichText\">\n" + xml
					+ "</PRESENTATIONOBJECT>";
	}

	@Override
	public void setData(AssetData ad) {
		BlobObject blob = new BlobObjectImpl("AttrTypes", name.toLowerCase()
				+ ".xml", //
				xml.getBytes());
		ad.getAttributeData("urlxml").setData(blob);
		System.out.println(blob);
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getType() {
		return "AttrTypes";
	}

	@Override
	public void setAdm(String sitename, AssetDataManager adm) {
		/* ignored - not used */
	}

}
