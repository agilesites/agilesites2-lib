package wcs.java.model;

import COM.FutureTense.Interfaces.FTValList;
import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.def.AssetTypeDef;
import com.fatwire.assetapi.def.AssetTypeDefManager;
import com.fatwire.assetapi.def.AssetTypeDefManagerImpl;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;
import wcs.java.model.type.WCSFlexAssetType;

import java.util.LinkedList;
import java.util.List;

public class FlexFamilyModelBase {

    private List<FlexAssetFamilyInfo> families = new LinkedList<FlexAssetFamilyInfo>();
    private List<WCSFlexAssetType> flexParents = new LinkedList<WCSFlexAssetType>();
    private List<WCSFlexAssetType> flexTypes = new LinkedList<WCSFlexAssetType>();


	public FlexFamilyModelBase() {
	}

	List<FlexAssetFamilyInfo> getFlexFamilyData() {
		return families;
	}

    public List<WCSFlexAssetType> getFlexParents() {
        return flexParents;
    }

    public List<WCSFlexAssetType> getFlexTypes() {
        return flexTypes;
    }

    public void addFlexFamilyData(FlexAssetFamilyInfo info) {
        families.add(info);
    }

    public void addFlexType(WCSFlexAssetType data) {
        flexTypes.add(data);
    }
    public void addFlexParent(WCSFlexAssetType data) {
        flexParents.add(data);
    }

    public String build(ICS ics, String username, String password) {

        StringBuilder sb = new StringBuilder();
        try {
            for (FlexAssetFamilyInfo family : families) {
                sb.append("Flex family (").append(family.getFlexAttributeInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexAssetInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexParentInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexDefInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexParentDefInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexFilterInfo().getAssetTypeName()).append(")");
                sb.append(createFlexFamily(ics, family)).append("\n");
            }
            for (WCSFlexAssetType flexType : flexParents) {
                sb.append("Flex parent ").append(flexType.getName());
                sb.append(addFlexParent(ics, flexType)).append("\n");
            }
            for (WCSFlexAssetType flexType : flexTypes) {
                sb.append("Flex type ").append(flexType.getName());
                sb.append(addFlexType(ics, flexType)).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            sb.append(" ERR ").append(e.getMessage()).append("\n");
        }

        return sb.toString();

    }

    private String addFlexType(ICS ics, WCSFlexAssetType flexType) {
        AssetTypeDef def = null;
        try {
            AssetTypeDefManager atdm = new AssetTypeDefManagerImpl(ics);
            def = atdm.findByName(flexType.getName(), null);
        } catch (AssetAccessException e) {
            //e.printStackTrace();
        }
        if (def == null) {
            FTValList values = new FTValList();
            values.setValString("request_internal", "true");
            values.setValString("op", "make");
            values.setValString("DescFilt", flexType.getDescription());
            values.setValString("Filt", flexType.getName());
            values.setValString("PluralFilt",flexType.getPluralForm());
            values.setValString("def", flexType.getContentDef());
            values.setValString("member", "asset");
            values.setValString("parent", flexType.getParent());
            values.setValString("cs_environment", "standard");
            values.setValString("cs_formmode", "WCM");
            ics.CallElement("OpenMarket/Xcelerate/Admin/FlexFamily",values);
        }
        return " Created" ;
    }

    private String addFlexParent(ICS ics, WCSFlexAssetType flexType) {
        AssetTypeDef def = null;
        try {
            AssetTypeDefManager atdm = new AssetTypeDefManagerImpl(ics);
            def = atdm.findByName(flexType.getName(), null);
        } catch (AssetAccessException e) {
            //e.printStackTrace();
        }
        if (def == null) {
            FTValList values = new FTValList();
            values.setValString("request_internal", "true");
            values.setValString("op", "make");
            values.setValString("DescFilt", flexType.getDescription());
            values.setValString("Filt", flexType.getName());
            values.setValString("PluralFilt",flexType.getPluralForm());
            values.setValString("member", "parent");
            values.setValString("parent", flexType.getParent());
            values.setValString("cs_environment", "standard");
            values.setValString("cs_formmode", "WCM");
            ics.CallElement("OpenMarket/Xcelerate/Admin/FlexFamily",values);
        }
        return " Created" ;
    }

    public String createFlexFamily(ICS ics, FlexAssetFamilyInfo flexAssetFamilyInfo) throws AssetAccessException {

        FTValList values = new FTValList();
        values.setValString("request_internal", "true");
        values.setValString("Attr", flexAssetFamilyInfo.getFlexAttributeInfo().getAssetTypeName());
        values.setValString("DescAttr", flexAssetFamilyInfo.getFlexAttributeInfo().getDescription());
        values.setValString("PluralAttr",flexAssetFamilyInfo.getFlexAttributeInfo().getPlural());
        values.setValString("Filt", flexAssetFamilyInfo.getFlexFilterInfo().getAssetTypeName());
        values.setValString("DescFilt", flexAssetFamilyInfo.getFlexFilterInfo().getDescription());
        values.setValString("PluralFilt", flexAssetFamilyInfo.getFlexFilterInfo().getPlural());
        values.setValString("Prod", flexAssetFamilyInfo.getFlexAssetInfo().getAssetTypeName());
        values.setValString("DescProd", flexAssetFamilyInfo.getFlexAssetInfo().getDescription());
        values.setValString("PluralProd", flexAssetFamilyInfo.getFlexAssetInfo().getPlural());
        values.setValString("Group", flexAssetFamilyInfo.getFlexParentInfo().getAssetTypeName());
        values.setValString("DescGroup", flexAssetFamilyInfo.getFlexParentInfo().getDescription());
        values.setValString("PluralGroup", flexAssetFamilyInfo.getFlexParentInfo().getPlural());
        values.setValString("PT", flexAssetFamilyInfo.getFlexDefInfo().getAssetTypeName());
        values.setValString("DescPT", flexAssetFamilyInfo.getFlexDefInfo().getDescription());
        values.setValString("PluralPT", flexAssetFamilyInfo.getFlexDefInfo().getPlural());
        values.setValString("PGT", flexAssetFamilyInfo.getFlexParentDefInfo().getAssetTypeName());
        values.setValString("DescPGT", flexAssetFamilyInfo.getFlexParentDefInfo().getDescription());
        values.setValString("PluralPGT", flexAssetFamilyInfo.getFlexParentDefInfo().getPlural());

        String defdirBase = ics.GetProperty("xcelerate.defaultbase","futuretense_xcel.ini", true);
        values.setValString("defdirBase", defdirBase);

        ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/makeasset",values);
        return " Created" ;
    }
}
