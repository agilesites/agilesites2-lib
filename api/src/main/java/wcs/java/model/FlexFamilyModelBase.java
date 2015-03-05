package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.def.AssetTypeDefManager;
import com.fatwire.assetapi.def.AssetTypeInfo;
import com.fatwire.assetapi.def.FlexAssetFamilyInfo;
import com.fatwire.system.Session;
import com.fatwire.system.SessionFactory;
import com.openmarket.gator.interfaces.FlexTypeManagerFactory;
import wcs.java.Asset;

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

    public String build(ICS ics,AssetTypeDefManager atdm) {

/*
        FlexTypeManagerFactory.getFlexGroupTypeManager(ics).add(assetType, templateType, attributeType, filterType);
        FlexTypeManagerFactory.getFlexFilterTypeManager(ics).add(filterType, attributeType);
        FlexTypeManagerFactory.getFlexAssetTypeManager(ics).add(assetType, parentGroupType, templateType, attributeType, filterType);
*/
        StringBuilder sb = new StringBuilder();
        try {
            for (FlexAssetFamilyInfo family : families) {
                AssetTypeInfo attributeInfo = family.getFlexAttributeInfo();
                //FlexTypeManagerFactory.getFlexAssetTypeManager(ics).add(attributeInfo.getAssetTypeName(), parentGroupType, templateType, attributeType, filterType);
                sb.append(atdm.createFlexFamily(family) ? "OK" : "KO");
            }
        } catch (AssetAccessException e) {
            sb.append(" ERR ").append(e.getMessage()).append("\n");
        }

        return sb.toString();

    }
}
