package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import wcs.java.ElementCatalog;
import wcs.java.ElementCatalogEntry;
import wcs.java.Env;
import wcs.java.util.Util;

import java.lang.reflect.Method;

/**
 * Imports static assets for a site
 * 
 * @author msciab
 * 
 */
public class ElementImporter {

	private static Log log = Log.getLog(Env.class);

    /**
	 * The element importer for the site
	 *
	 */
	public ElementImporter(){
	}


	public String setup(ICS ics, String username, String password, String sitename) throws Exception {

        StringBuilder sb = new StringBuilder();
        Class<?>[] catalogClasses = Util.classesFromResource(sitename, "catalog.txt");
        ElementCatalog ec = new ElementCatalog(ics, username, password);
        for (Class<?> clazz : catalogClasses) {
            Method m = clazz.getDeclaredMethod("setup");
            if (m == null)
                continue;
            Object obj = m.invoke("setup");
            if (obj != null && obj instanceof ElementCatalogEntry) {
                ElementCatalogEntry entry = (ElementCatalogEntry) obj;
                log.debug("found an actual instance");
                ec.replace(entry.getFilename(), entry.getTemplate());
            }

        }
        //ec.close();

      return sb.toString();

	}

}
