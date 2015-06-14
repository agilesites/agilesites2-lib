package wcs.api;

import COM.FutureTense.Interfaces.ICS;
import wcs.core.Call;
import wcs.core.Id;
import wcs.core.Arg;

/**
 * Interface for the Router
 * 
 * @author msciab
 * 
 */

public interface Router extends wcs.core.Router {
	
	/**
	 * Route an asset
	 * 
	 * @param env
	 * @param url
	 * @return
	 */
	public Call route(Env env, URL url);

	/**
	 * Generate the link to an asset
	 * 
	 * @param env
	 * @param id
	 * @return
	 */
	public String link(Env env, Id id, Arg... args);

}
