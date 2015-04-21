package wcs.java.model;

import COM.FutureTense.Interfaces.FTValList;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.Utilities;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.def.AssetTypeDef;
import com.fatwire.assetapi.def.AssetTypeDefManager;
import com.fatwire.assetapi.def.AssetTypeDefManagerImpl;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;
import com.openmarket.assetframework.assettypemanager.AssetTypeManager;
import com.openmarket.basic.interfaces.AssetException;
import com.openmarket.gator.fatypemanager.FlexAssetTypeManager;
import com.openmarket.gator.fatypemanager.FlexGroupTypeManager;
import com.openmarket.xcelerate.commands.AssetDispatcher;
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

    public String build(ICS ics) {

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
            try {
                FTValList values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("assetname", flexType.getName());
                values.setValString("AssetDescription", flexType.getDescription());
                values.setValString("AssetPlural",flexType.getPluralForm());
                values.setValString("AssetChild", "T");
                values.setValString("assetlogic", "com.openmarket.assetframework.complexasset.ComplexAsset");
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addAssetType", values);

                AssetTypeManager atm = new AssetTypeManager(ics);
                atm.setAsset(flexType.getName(), "com.openmarket.gator.flexassets.FlexAssetManager", "Catalog");

                values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("elementtype", "FlexAssets");
                values.setValString("AssetType", flexType.getName());
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addElements", values);

                values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("sqltype", "FlexAssets");
                values.setValString("AssetType", flexType.getName());
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addSQL", values);


                FlexAssetTypeManager fatm = new FlexAssetTypeManager(ics);
                fatm.add(flexType.getName(), flexType.getParent(), flexType.getContentDef(), flexType.getAttributeType(), flexType.getFilterType());

                String defdirBase = ics.GetProperty("xcelerate.defaultbase","futuretense_xcel.ini", true);
                values = new FTValList();
                values.setValString("TYPE", flexType.getName());
                values.setValString("ACL", "Browser,SiteGod,xceleditor,xceladmin");
                values.setValString("DIR", Utilities.fileName(defdirBase, flexType.getName()));
                AssetDispatcher.Install(ics, values);

            } catch (AssetException e) {
                e.printStackTrace();
                return (" Error: " + e.getMessage());
            }
            return " Created" ;
        } else {
            // TODO
            return " Updated";
        }
    }

    private String addFlexParent(ICS ics, WCSFlexAssetType flexType) {
        AssetTypeDef def = null;
        AssetTypeDefManager atdm = new AssetTypeDefManagerImpl(ics);
        try {
            def = atdm.findByName(flexType.getName(), null);
        } catch (AssetAccessException e) {
            //e.printStackTrace();
        }
        if (def == null) {
            try {
                FTValList values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("assetname", flexType.getName());
                values.setValString("AssetDescription", flexType.getDescription());
                values.setValString("AssetPlural",flexType.getPluralForm());
                values.setValString("AssetChild", "T");
                values.setValString("assetlogic", "com.openmarket.assetframework.complexasset.ComplexAsset");
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addAssetType", values);

                AssetTypeManager atm = new AssetTypeManager(ics);
                atm.setAsset(flexType.getName(), "com.openmarket.gator.flexgroups.FlexGroupManager", "Catalog");

                values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("elementtype", "FlexGroups");
                values.setValString("AssetType", flexType.getName());
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addElements", values);

                values = new FTValList();
                values.setValString("request_internal", "true");
                values.setValString("sqltype", "FlexGroups");
                values.setValString("AssetType", flexType.getName());
                ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/addSQL", values);

                FlexGroupTypeManager fgtm = new FlexGroupTypeManager(ics);
                fgtm.add(flexType.getName(), flexType.getContentDef(), flexType.getAttributeType(), flexType.getFilterType());

                String defdirBase = ics.GetProperty("xcelerate.defaultbase","futuretense_xcel.ini", true);
                values = new FTValList();
                values.setValString("TYPE", flexType.getName());
                values.setValString("ACL", "Browser,SiteGod,xceleditor,xceladmin");
                values.setValString("DIR", Utilities.fileName(defdirBase, flexType.getName()));
                AssetDispatcher.Install(ics, values);


            } catch (AssetException e) {
                e.printStackTrace();
                return (" Error: " + e.getMessage());
            }
            return " Created" ;
        } else {
            // TODO
            return " Updated";
        }
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
