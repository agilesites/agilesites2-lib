package wcs.core;

import COM.FutureTense.Interfaces.ICS;

/**
 * Interface for the Router
 * 
 * @author msciab
 * 
 */

public interface Router {
	
	/**
	 * Initialize the router with the site
	 * @param site
	 */
	public void init(String site);

	/**
	 * Route requests
	 * 
	 * @param ics
	 * @param path
	 * @param query
	 * @return
	 */
	public Call route(ICS ics, String path, String query);


}
