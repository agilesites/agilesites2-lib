package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.openmarket.xcelerate.asset.AssetIdImpl;
import wcs.Api;
import wcs.core.tag.AssetTag;

// the attribute
public class Attribute implements HasSetData, HasPostProcess {

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
	String[] assetsubtypename;

	public Attribute(String c, String type, DefinitionContainer dc, Mul mul,
			boolean notEmbedded, boolean existDep) {
		this.c = c;
		this.id = dc.getId();
		this.name = dc.getName();
		this.description = dc.getDescription();
		this.type = type;
		this.valuestyle = mul.getValue();
		this.depexist = existDep ? "E" : "X";
		this.embedtype = notEmbedded ? "H" : "U";
	}

	public Attribute setEditor(AttributeEnum attributeEditor) {
		this.attributetype = attributeEditor.getId();
		return this;
	}

	/**
	 * Set subtypes
	 * 
	 * @param assettypename
	 * @param assetsubtypename
	 * @return
	 */
	public Attribute setAssetType(String assettypename,
			String... assetsubtypename) {
		this.assettypename = assettypename;
		this.assetsubtypename = assetsubtypename;
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

			/*
			 * if (assetsubtypename != null && assetsubtypename.size() > 0)
			 * ad.getAttributeData("assetsubtypename").setDataAsList(
			 * assetsubtypename);
			 */

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

	@Override
	public String postProcess(String sitename, ICS ics) {
		if (assetsubtypename == null)
			return "";

		String tmp = Api.tmp();
		AssetTag.load().type(c).objectid("" + id).name(tmp).editable("true")
				.run(ics);
		// AssetTag.get().name(tmp).field(arg0)
		AssetTag.scatter().name(tmp).prefix(tmp).fieldlist("*").run(ics);
		StringBuilder sb = new StringBuilder("SUBTYPE ");
		/*
		 * Enumeration<?> en = ics.GetVars(); while (en.hasMoreElements()) {
		 * String v = en.nextElement().toString(); if (v.startsWith(tmp))
		 * sb.append(v).append("=").append(ics.GetVar(v)).append("\n"); }
		 */
		ics.SetVar(tmp + ":assetsubtypename:Total",
				assetsubtypename == null ? "0" : "" + assetsubtypename.length);
		{
			int i = 0;
			for (String s : assetsubtypename) {
				ics.SetVar(tmp + ":assetsubtypename:" + i, s);
				sb.append(s).append(" ");
				i++;
			}
		}
		sb.append("\n");
		AssetTag.gather().name(tmp).prefix(tmp).fieldlist("*").run(ics);
		AssetTag.save().name(tmp).run(ics);
		return sb.toString();
	}
}
