package wcs.java;

import com.fatwire.assetapi.data.MutableAssetData;
import wcs.java.util.Util;

import java.util.List;

public class ElementCatalogEntry  extends AssetSetup {

    private String name;


    /**
     * Create with a specific elementName and jsp file
     */
    public ElementCatalogEntry(String name, String elementFile) {
        super("CSElement", "", name);
        filename =  elementFile;
    }

    public List<String> getAttributes() {
        return null;
    }

    @Override
    public String getTemplate() {
        return Util.getResource("/" + filename);
    }

    void setData(MutableAssetData data) {
    }

    public AssetSetup description(String description) {
        setDescription(description);
        return this;
    }
}