package agilesites.model;

import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.openmarket.xcelerate.asset.AssetIdImpl;

import java.util.List;

// the attribute
public class Attribute implements HasSetData {

	// multiplicity
	public enum Mul {
		SINGLE("S"), MULTIPLE("O"), UNIQUE("N");
		private String value;

		private Mul(String s) {
			value = s;
		}

		public String getValue() {
			return value;
		}
	}

	String c;
	long id;
	String name;
	String description;
	String type;
	String valuestyle;
	String embedtype;
	String depexist;
	long attributetype = -1;
	String assettypename;
	List<String> assetsubtypename;

	public Attribute(String c, String type, AttributeEnum ae, Mul mul,
			boolean notEmbedded, boolean existDep) {
		this.c = c;
		this.id = ae.getId();
		this.name = ae.toString();
		this.description = ae.getDescription();
		this.type = type;
		this.valuestyle = mul.getValue();
		this.depexist = existDep ? "E" : "X";
		this.embedtype = notEmbedded ? "H" : "U";
	}

	public Attribute setEditor(AttributeEnum attributeEditor) {
		this.attributetype = attributeEditor.getId();
		return this;
	}

	public Attribute setAssetType(String assettypename
	/* , String... assetsubtypename */) {
		this.assettypename = assettypename;
		// this.assetsubtypename = Arrays.asList(assetsubtypename);
		return this;
	}

	@Override
	public void setData(AssetData ad) {
		ad.getAttributeData("type").setData(type);
		ad.getAttributeData("valuestyle").setData(valuestyle);
		ad.getAttributeData("embedtype").setData(embedtype);
		ad.getAttributeData("deptype").setData(depexist);
		ad.getAttributeData("editing").setData("L");
		ad.getAttributeData("storage").setData("L");
		if (attributetype > 0)
			ad.getAttributeData("attributetype").setData(
					new AssetIdImpl("AttrTypes", attributetype));
		try {
			if (assettypename != null)
				ad.getAttributeData("assettypename").setData(assettypename);

			// for (String s : ad.getAttributeNames())
			// System.out.println(s + ":"
			// + ad.getAttributeData(s).getDataAsList().toString());
			// if (assetsubtypename != null)
			// ad.getAttributeData("subtype").setDataAsList(assetsubtypename);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
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
		return c;
	}

	@Override
	public void setAdm(String sitename, AssetDataManager adm) {
		/* ignored - not used */
	}
}
