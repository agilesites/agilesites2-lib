package agilesites.impl;

import agilesites.core.tag.BlobserviceTag;
import COM.FutureTense.Interfaces.ICS;

/**
 * Base class for configuration, to be extended site by site
 * 
 * @author msciab
 * 
 */
abstract public class Config implements agilesites.api.Config {

	private String blobId = null;
	private String blobUrl = null;
	private String blobTable = null;


	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getBlobId()
	 */
	@Override
	public String getBlobId(ICS ics) {
		if (blobId == null)
			blobId = BlobserviceTag.getidcolumn().eval(ics, "VARNAME");
		
		return blobId;
	}

	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getBlobUrl()
	 */
	@Override
	public String getBlobUrl(ICS ics) {
		if (blobUrl == null)
			blobUrl = BlobserviceTag.geturlcolumn().eval(ics, "VARNAME");
		return blobUrl;
	}

	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getBlobTable()
	 */
	@Override
	public String getBlobTable(ICS ics) {
		if (blobTable == null)
			blobTable = BlobserviceTag.gettablename().eval(ics, "VARNAME");
		return blobTable;
	}


	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getProperty(java.lang.String)
	 */
	@Override
	public String getProperty(String name) {
		//return agilesites.core.WCS.getProperty(name);
		throw new RuntimeException("FIX ME!!!");
	}

	// // ABSTRACT PART ////

	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getAttributeType(java.lang.String)
	 */
	@Override
	abstract public String getAttributeType(String type);

	/* (non-Javadoc)
	 * @see agilesites.impl.IConfig#getSite()
	 */
	@Override
	abstract public String getSite();

}
