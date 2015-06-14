package wcs.core;

import wcs.core.Arg;
import wcs.core.Args;
import wcs.core.Call;
import wcs.core.Id;
import wcs.core.Sequencer;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;

/**
 * Collections of utils supporting common idioms.
 * 
 * You need to import static wcs.core.Common.* to use them.
 * 
 * @author msciab
 * 
 */
public class Api {
	private static long tmpVarCounter = System.currentTimeMillis();

	/**
	 * Generate an unique temporary var name.
	 *
	 * @return
	 */
	public synchronized static String tmp() {
		++tmpVarCounter;
		return "_" + Long.toHexString(tmpVarCounter);
	}

	/**
	 * Create an arg holder
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public static Arg arg(String name, String value) {
		return new Arg(name, value);
	}

	/**
	 * Create list of args
	 * 
	 * @param name
	 * @param values
	 * @return
	 */
	public static Args args(String name, String... values) {
		return new Args(name, values);
	}


	/**
	 * Create an array of Arg from a list of strings in the form key=value
	 * 
	 * @param args
	 * @return
	 */
	public static Arg[] argv(String... args) {
		List<Arg> ls = new ArrayList<Arg>();
		for (String arg : args) {
			int pos = arg.indexOf("=");
			if (pos == -1)
				ls.add(new Arg(arg, ""));
			else
				ls.add(new Arg(arg.substring(0, pos), arg.substring(pos + 1)));
		}
		return ls.toArray(new Arg[0]);
	}

	/**
	 * Create an id
	 * 
	 * @param c
	 * @param cid
	 * @return
	 */
	public static Id id(String c, Long cid) {
		return new Id(c, cid);
	}

	/**
	 * Create an encoded call
	 */
	public static String call(String name, Arg... args) {
		return Call.encode(name, args);
	}

	/**
	 * Create an encoded call from a list of args
	 */
	public static String call(String name, List<Arg> args) {
		return Call.encode(name, args);
	}

	/**
	 * Guarantee a string will never be null, if parameters is null then it will
	 * be returned as the empty string.
	 * 
	 * @param s
	 * @return
	 */
	public static String nn(String s) {
		return s == null ? "" : s;
	}

	/**
	 * If null returns the alternative otherwise the object
	 * 
	 * @param obj
	 * @param alt
	 * @return
	 */
	public static Object ifn(Object obj, Object alt) {
		return obj == null ? alt : obj;
	}

	// formatter for fatwire format
	private static SimpleDateFormat fmt = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	/**
	 * Convert as a date, null if error
	 */
	public static java.util.Date toDate(String s) {
		if (s != null) {
			try {
				return fmt.parse(s);
			} catch (Exception e) {
			}
		}
		return null;
	}

	/**
	 * 
	 * Convert in a long, null if errors
	 * 
	 * @param l
	 * @return
	 */
	public static Long toLong(String l) {
		if (l == null)
			return null;
		try {
			long ll = Long.parseLong(l);
			return new Long(ll);
		} catch (NumberFormatException ex) {
			return null;
		} catch (Exception ex) {
			// log.warn(ex, "unexpected");
		}
		return null;
	}

	/**
	 * 
	 * Convert in a double, null if errors
	 * 
	 * @param l
	 * @return
	 */
	public static Double toDouble(String l) {
		if (l == null)
			return null;
		try {
			double dd = Double.parseDouble(l);
			return new Double(dd);
		} catch (NumberFormatException ex) {
			return null;
		} catch (Exception ex) {
			// log.warn(ex, "unexpected");
		}
		return null;
	}

	
	/**
	 * Convert in a int, null if erros
	 * 
	 * @param l
	 * @return
	 */
	public static Integer toInt(String l) {
		if (l == null)
			return null;
		try {
			int ll = Integer.parseInt(l);
			return new Integer(ll);
		} catch (NumberFormatException ex) {
		} catch (Exception ex) {
			// log.warn(ex, "unexpected");
		}
		return null;
	}

	/**
	 * Convenience method to dump the stream resulting of the picker
	 */
	public static String dumpStream(String html) {
		Sequencer seq = new Sequencer(html);
		StringBuilder sb = new StringBuilder(seq.header());
		while (seq.hasNext()) {
			Call call = seq.next();
			sb.append(call.toString());
			sb.append(seq.header());
		}
		return sb.toString();
	}

	/**
	 * Convenience method to dump an IList
	 */
	public static String dumpIList(IList ilist) {
		if (ilist == null)
			return "NULL ILIST!";
		StringBuffer sb = new StringBuffer("*****\n");
		for (int i = 1; i <= ilist.numRows(); i++) {
			sb.append(i + ") ");
			for (int j = 0; j < ilist.numColumns(); j++) {
				String k = ilist.getColumnName(j);
				sb.append(k).append("=");
				try {
					sb.append(ilist.getValue(k).toString()).append(" ");
				} catch (NoSuchFieldException e) {
					// e.printStackTrace();
				}
			}
			ilist.moveTo(i);
			sb.append("\n");
		}
		sb.append("*****");
		return sb.toString();
	}

	/**
	 * Stream an exceptions in a string
	 */
	public static String ex2str(Throwable ex) {
		CharArrayWriter caw = new CharArrayWriter();
		ex.printStackTrace(new PrintWriter(caw));
		return caw.toString();
	}

	/**
	 * Print on standard output
	 */
	public static void out(String message, Object... args) {
		System.out.println(args.length > 0 ? String.format(message, args)
				: message);
	}

	/**
	 * Get a logger by name
	 * 
	 * @param className
	 * @return
	 */
	public static Log getLog(String className) {
		return Log.getLog(className);
	}

	/**
	 * Get a logger by class
	 * 
	 * @param clazz
	 * @return
	 */
	public static Log getLog(Class<?> clazz) {
		return Log.getLog(clazz);
	}

}
