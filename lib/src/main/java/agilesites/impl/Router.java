package agilesites.impl;

import agilesites.api.Arg;
import agilesites.api.Call;
import agilesites.api.Env;
import agilesites.api.Id;
import agilesites.api.Log;
import agilesites.api.URL;
import agilesites.util.Util;
import COM.FutureTense.Interfaces.ICS;

/**
 * The router - implement the abstract methods to provide url->asset and
 * asset->burl conversions.
 * 
 * @author msciab
 * 
 */
abstract public class Router implements agilesites.api.Router {

	private static Log log = Log.getLog(Router.class);
	private ICS i;
	private Env e;
	private String site;
	
	@Override
	public void init(String site) {
		this.site = site;
	}
	
	public String getSite() {
		return site;
	}

	@Override
	public Call route(ICS ics, String _path, String _query) {
		if (log.debug())
			log.debug("site=%s" + site + " path=" + _path + " query=" + _query);
		this.i = ics;
		this.e = new agilesites.impl.Env(i);
		this.site = ics.GetVar("site");
		if (_query == null || _query.trim().length() == 0)
			_query = "";
		else
			_query = "?" + _query;
		return route(e, URL.parse(_path, _query));
	}

	/**
	 * Create a call to an element
	 * 
	 * @param name
	 * @param args
	 * @return
	 */
	public Call call(String name, Arg... args) {
		Call call = new Call("ICS:CALLELEMENT", args);
		call.addArg("site", site);
		call.addArg("element", site + "/" + Util.normalizedName(site, name));
		log.trace("call returns %s", call.toString());
		return call;
	}

	/**
	 * Route an asset
	 * 
	 * @param env
	 * @param url
	 * @return
	 */
	abstract public Call route(Env env, URL url);

	/**
	 * Link an asset
	 * 
	 * @param env
	 * @param id
	 * @return
	 */
	abstract public String link(Env env, Id id, Arg... args);
}
