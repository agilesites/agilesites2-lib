package wcs.java.model;

import COM.FutureTense.Interfaces.FTValList;
import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;

import java.util.LinkedList;
import java.util.List;

public class FlexFamilyModelBase {

    private List<FlexAssetFamilyInfo> families = new LinkedList<>();


	public FlexFamilyModelBase() {
	}

	List<FlexAssetFamilyInfo> getFlexFamilyData() {
		return families;
	}

    public void addFlexFamilyData(FlexAssetFamilyInfo info) {
        families.add(info);

    }

    public String build(ICS ics, String username, String password) {

        FTValList ls = new FTValList();
        ls.setValString("ftcmd", "login");
        ls.setValString("username", username);
        ls.setValString("password", password);
        ics.CatalogManager(ls);
        StringBuilder sb = new StringBuilder();
        try {
            for (FlexAssetFamilyInfo family : families) {
                sb.append("Flex family (").append(family.getFlexAttributeInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexAssetInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexParentInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexDefInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexParentDefInfo().getAssetTypeName()).append(" ")
                        .append(family.getFlexFilterInfo().getAssetTypeName()).append(")");
                sb.append(createFlexFamily(ics, family));
            }
        } catch (Exception e) {
            e.printStackTrace();
            sb.append(" ERR ").append(e.getMessage()).append("\n");
        }

        return sb.toString();

    }
    public String createFlexFamily(ICS ics, FlexAssetFamilyInfo flexAssetFamilyInfo) throws AssetAccessException {

        FTValList values = new FTValList();
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

        //FIXME read base storage dir from configuration file
        values.setValString("defdirBase", "C:\\Projects\\agilesites2-demo\\sites\\shared\\Storage");


        ics.CallElement("OpenMarket/Gator/FlexibleAssets/AssetMaker/makeasset",values);
        return " Created" ;
    }
}
