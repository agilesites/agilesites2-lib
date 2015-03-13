package wcs.java.model;

import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import wcs.api.Arg;

public class StartMenu implements HasSetData {
	long id;
	String name;
	String description;
	String type;
	String assetType;
	String assetSubtype;
    Arg[] arguments;

	public StartMenu(long id, String name, String description, String type, String assetType, String assetSubtype) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.assetType = assetType;
		this.assetSubtype = assetSubtype;
	}

	public StartMenu(String type, DefinitionContainer dc, String subtype) {
		this.id = dc.getId();
		this.name = dc.getName();
		this.description = dc.getDescription();
		this.type = type;
		this.assetType = dc.getAssetType();
		this.assetSubtype = subtype;
	}

    public StartMenu(String type, DefinitionContainer dc, String subtype, Arg... args) {
        this(type,dc,subtype);
        this.arguments = args;
    }

    @Override
	public void setData(AssetData ad) {
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
		return type;
	}

	public String getAssetType() {
		return assetType;
	}

	public String getAssetSubtype() {
		return assetSubtype;
	}

	@Override
	public void setAdm(String sitename, AssetDataManager adm) {
		/* ignored - not used */
	}

}
