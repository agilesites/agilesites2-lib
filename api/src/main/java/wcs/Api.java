package wcs;

import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;
import wcs.api.Model;
import wcs.api.*;
import wcs.core.*;

import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Collections of utils supporting common idioms.
 * 
 * You need to import static wcs.core.Common.* to use them.
 * 
 * @author msciab
 * 
 */
public class Api  extends wcs.core.Api {
	private static long tmpVarCounter = System.currentTimeMillis();

	/**
	 * Access to the env in a JSP
	public static Env env(ICS ics) {
		return wcs.core.WCS.getEnv(ics, "wcs.java.Env");
	}*/

	/**
	 * Create a Model with args
	 */
	public static Model model(Arg... args) {
		return new Model(args);
	}

	/**
	 * Create a Model extending an existing model
	 */
	public static Model model(Model m, Arg... args) {
		return new Model(m, args);
	}

	/**
	 * Print on standard output some contents
	 */
	public static void out(String message, Content... contents) {
		System.out.println(message);
		for (Content c : contents) {
			System.out.println(c.dump());
		}
	}

	/**
	 * Print on standard output some contents
	 */
	public static void out(Content... contents) {
		for (Content c : contents) {
			System.out.println(c.dump());
		}
	}

	/**
	 * Print on standard output a content attributes
	 */
	public static void out(String message, Content content, String name) {
		System.out.println(message + ": " + content.dump(name));
	}

	/**
	 * Print on standard output a content attributes
	 */
	public static void out(Content content, String name) {
		System.out.println(content.dump(name));
	}


}
