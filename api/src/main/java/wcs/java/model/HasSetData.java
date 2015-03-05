package wcs.java.model;

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
	 * @param data the AssetData
	 */
	public void setData(AssetData data);
	
	/**
	 * It will give an asset data - usually for filling with data
	 *
     * @param sitename the site name
	 * @param adm the AssetDataManager
	 */
	public void setAdm(String sitename, AssetDataManager adm);
}