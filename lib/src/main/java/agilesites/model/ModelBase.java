package agilesites.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.common.AssetNotExistException;
import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.AssetId;
import com.fatwire.assetapi.data.MutableAssetData;
import com.openmarket.xcelerate.asset.AssetIdImpl;
import com.thoughtworks.xstream.XStream;

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

	public String build(String sitename, long baseid, AssetDataManager adm) {

		StringBuilder sb = new StringBuilder();
		for (HasSetData data : getAssetData()) {
			String type = data.getType();
			String name = data.getName();
			String prefix = sitename+"_";
			if(!name.startsWith(prefix))
					name = prefix+name;			
			sb.append("ASSET " + type + " " + name);
			try {

				AssetId aid = new AssetIdImpl(type, data.getId());
				MutableAssetData ad = null;
				boolean update = false;

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
				
				data.setAdm(sitename, adm);
				data.setData(ad);

				List<AssetData> la = new LinkedList<AssetData>();
				la.add(ad);

				if (update) {
					sb.append(" UPDATE: ");
					adm.update(la);
					sb.append(" OK\n");
				} else {
					sb.append(" INSERT: ");
					adm.insert(la);
					sb.append(" OK\n");
				}

			} catch (Exception e) {
				sb.append(" ERR " + e.getMessage() + "\n");
			}
		}
		return sb.toString();

	}

}
