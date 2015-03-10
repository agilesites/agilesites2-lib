package wcs.java.model.definition;

import com.fatwire.assetapi.def.AssetTypeInfo;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;

/**
 * Created by jelerak on 3/9/2015.
 */
public class WCSFlexFamilyInfo  implements FlexAssetFamilyInfo{
    private AssetTypeInfo flexAttributeInfo;
    private AssetTypeInfo flexParentDefInfo;
    private AssetTypeInfo flexDefInfo;
    private AssetTypeInfo flexParentInfo;
    private AssetTypeInfo flexAssetInfo;
    private AssetTypeInfo flexFilterInfo;


    @Override
    public AssetTypeInfo getFlexAttributeInfo() {
        return flexAttributeInfo;
    }

    @Override
    public AssetTypeInfo getFlexParentDefInfo() {
        return flexParentDefInfo;
    }

    @Override
    public AssetTypeInfo getFlexDefInfo() {
        return flexDefInfo;
    }

    @Override
    public AssetTypeInfo getFlexParentInfo() {
        return flexParentInfo;
    }

    @Override
    public AssetTypeInfo getFlexAssetInfo() {
        return flexAssetInfo;
    }

    @Override
    public AssetTypeInfo getFlexFilterInfo() {
        return flexFilterInfo;
    }

    public void flexAttribute(String name, String description, String plural) {
        this.flexAttributeInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    public void flexParentDef(String name, String description, String plural) {
        this.flexParentDefInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    public void flexDef(String name, String description, String plural) {
        this.flexDefInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    public void flexParent(String name, String description, String plural) {
        this.flexParentInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    public void flexAsset(String name, String description, String plural) {
        this.flexAssetInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    public void flexFilter(String name, String description, String plural) {
        this.flexFilterInfo = new FlexAssetTypeInfo(name,description,plural);
    }

    static class FlexAssetTypeInfo implements AssetTypeInfo {

        String assetTypeName;
        String description;
        String plural;
        boolean assetTypeIndexingEnabled = true;

        public FlexAssetTypeInfo(String assetTypeName, String description, String plural) {
            this.assetTypeName = assetTypeName;
            this.description = description;
            this.plural = plural;
        }

        @Override
        public String getAssetTypeName() {
            return assetTypeName;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public String getPlural() {
            return plural;
        }

        @Override
        public boolean isAssetTypeIndexingEnabled() {
            return assetTypeIndexingEnabled;
        }
    }
}
