package agilesites.model;

import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;

//common part for attributes and editors
interface HasSetData {

	public long getId();
	
	public String getType();

	public String getName();

	public String getDescription();
	
	/**
	 * It will inject an asset datamanager - usually for querying
	 * 
	 * @param data
	 */
	public void setData(AssetData data);
	
	/**
	 * It will give an asset data - usually for filling with data
	 * 
	 * @param adm
	 */
	public void setAdm(String sitename, AssetDataManager adm);
}