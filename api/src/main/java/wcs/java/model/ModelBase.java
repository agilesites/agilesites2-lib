package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.common.AssetNotExistException;
import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.AssetId;
import com.fatwire.assetapi.data.MutableAssetData;
import com.openmarket.xcelerate.asset.AssetIdImpl;
import com.thoughtworks.xstream.XStream;
import wcs.core.tag.DateformatTag;
import wcs.java.Env;

import java.util.*;

abstract public class ModelBase {

	// provide data for this
	abstract List<HasSetData> getAssetData();

	public void dump(Object object) {
		XStream xstream = new XStream();
		System.out.println(xstream.toXML(object));
	}

	private boolean assetExist(AssetDataManager adm, AssetId aid)
			throws AssetAccessException {
		List<AssetId> ls = new ArrayList<AssetId>();
		ls.add(aid);
		try {
			return adm.read(ls).iterator().hasNext();
		} catch (AssetNotExistException ex) {
			return false;
		}
	}

	public String build(String sitename, long baseid, AssetDataManager adm,
			ICS ics) {

		// initialize the env for an update call
		ics.SetVar("site",  sitename);
		Env env = new Env(ics);
		ics.SetSSVar("pubid", env.getSiteId());
		DateformatTag.create().name("_FormatDate_").run(ics);
		
		StringBuilder sb = new StringBuilder();
		for (HasSetData data : getAssetData()) {
			String type = data.getType();
			String name = data.getName();
			String prefix = sitename + "_";
			if (!name.startsWith(prefix))
				name = prefix + name;
			sb.append("ASSET ").append(type).append(" ").append(name);
			try {
				AssetId aid = new AssetIdImpl(type, data.getId());
				MutableAssetData ad;
				boolean update;
				
				if (assetExist(adm, aid)) {
					Iterator<MutableAssetData> iad = adm.readForUpdate(
							Arrays.asList(aid)).iterator();
					ad = iad.next();
					update = true;
				} else {
					ad = adm.newAssetData(type, "");
					ad.setAssetId(aid);
					update = false;
				}

				ad.getAttributeData("Publist").setDataAsList(
						Arrays.asList(sitename));
				ad.getAttributeData("name").setData(name);
				ad.getAttributeData("description").setData(
						data.getDescription());
/*
				clearing the data in Attributes in ad to insert a fresh definitions defined in the definitions. So that the removed/unspecified attributes will be moved out from the definition.
				The below check is made by :bharath
				*/
                if( ad.getAttributeData("Attributes") != null ){
                    ad.getAttributeData("Attributes").setData(null);
                }
				data.setAdm(sitename, adm);
				data.setData(ad);

				List<AssetData> la = new LinkedList<AssetData>();
				la.add(ad);

				// insert/update
				if (update) {
					sb.append(" UPDATE: ");
					adm.update(la);
					sb.append(" OK\n");
				} else {
					sb.append(" INSERT: ");
					adm.insert(la);
					sb.append(" OK\n");
				}

				// post process
				if (data instanceof HasPostProcess)
					sb.append(((HasPostProcess) data).postProcess(sitename, ics));

			} catch (Exception e) {
				sb.append(" ERR ").append(e.getMessage()).append("\n");
			}
		}
		return sb.toString();

	}

}
