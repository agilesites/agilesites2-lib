package wcs.java;

import static wcs.Api.tmp;

import java.util.ArrayList;
import java.util.List;

import COM.FutureTense.Interfaces.ICS;
import wcs.Api;
import wcs.api.Arg;
import wcs.api.Id;
import wcs.api.Log;
import wcs.core.tag.CommercecontextTag;
import wcs.core.tag.VdmTag;

/**
 * Wrapper class for the Engage api
 * 
 * @author msciab
 * 
 */
public class Engage {

	private static Log log = Log.getLog(Log.class);
	private static Engage instance;

	private wcs.api.Env env;
	private ICS ics;

	private Engage() {
	}

	private void setEnv(wcs.api.Env e) {
		this.env = e;
		this.ics = e.ics();
	}

	
	/**
	 * Get the current session id
	 */
	
	public String sessionId() {
		return ics.SessionID();
	}
	
	/**
	 * Get the current Engage wrapper instance
	 * 
	 * @param e
	 * @return
	 */
	public static Engage getInstance(wcs.api.Env e) {
		if (instance == null)
			instance = new Engage();
		instance.setEnv(e);
		return instance;
	}

	/**
	 * Set alias of the current user to the current session
	 * 
	 * @param name
	 * @param value
	 */
	public void setAlias(String key, String value) {
		VdmTag.setalias().key(key).value(value).run(ics);
	}

	/**
	 * Set a scalar variable
	 * 
	 * @param name
	 * @param value
	 */
	public void setScalar(String name, String value) {
		VdmTag.setscalar().attribute(name).value(value).run(ics);
	}

	/**
	 * Get the value of a scalar variable.
	 * 
	 * @param name
	 * @return
	 */
	public String getScalar(String name) {
		return VdmTag.getscalar().attribute(name).eval(ics, "varname");
	}

	/**
	 * Return a list of the current segments.
	 * 
	 * @return
	 */
	public List<Id> getSegments() {

		List<Id> result = new ArrayList<Id>();
		String list = Api.tmp();
		CommercecontextTag.getsegments().listvarname(list);

		if (env.isList(list))
			for (int pos : env.getRange(list))
				result.add(new Id("Segment", //
						env.getLong(list, pos, "assetid")));
		return result;

	}

	/**
	 * Return a list of the recommended children.
	 * 
	 * @param a
	 * @param args
	 * @return
	 */

	public List<Id> getRecommended(wcs.api.Asset a, Arg... args) {

		List<Id> result = new ArrayList<Id>();
		if (!a.getC().equals("AdvCols")) {
			log.warn("%s not an AdvCols", a.toString());
			return result;
		}

		CommercecontextTag.Getrecommendations rec = CommercecontextTag
				.getrecommendations();

		String output = tmp();
		rec.listvarname(output);
		rec.collectionid(a.getCid().toString());
		if (args.length > 0)
			rec.set(args);
		rec.run(ics);

		if (env.isList(output))
			for (int pos : env.getRange(output))
				result.add(new Id(env.getString(output, pos, "assettype"), //
						env.getLong(output, pos, "assetid")));
		return result;

	}

}
