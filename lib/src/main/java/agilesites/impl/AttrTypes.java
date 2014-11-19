package agilesites.impl;

import java.util.List;
import agilesites.util.Util;
import com.fatwire.assetapi.data.BlobObject;
import com.fatwire.assetapi.data.BlobObjectImpl;
import com.fatwire.assetapi.data.MutableAssetData;

/**
 * AttrTypes definition class
 * 
 * @author msciab
 * 
 */
public class AttrTypes extends AssetSetup {

	private String urlxml;

	public AttrTypes(String name, String urlxml) {
		super("AttrTypes", "", name);
		this.urlxml = urlxml;
	}

	public List<String> getAttributes() {
		return Util.listString("name", "description", "urlxml");
	}

	void setData(MutableAssetData data) {

		// blob
		BlobObject blob = new BlobObjectImpl("AttrTypes." + getName(),
				"AgileSites", urlxml.getBytes());

		data.getAttributeData("urlxml").setData(blob);
	}

	/**
	 * Fluent description setter
	 * 
	 * @param description
	 * @return
	 */
	public AttrTypes description(String description) {
		setDescription(description);
		return this;
	}
}
