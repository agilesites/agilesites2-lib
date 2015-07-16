package wcs.core;

import java.io.File;
import java.util.StringTokenizer;

import wcs.api.Call;
import wcs.api.Element;
import wcs.api.Log;
import wcs.api.Router;
import COM.FutureTense.Interfaces.ICS;
import wcs.core.exception.ElementException;

public class Dispatcher {

    final static Log log = Log.getLog(Dispatcher.class);

    private Loader loader;

    private static Dispatcher dispatcher = null;

    private static int defaultPollInterval = 100;

    /**
     * Load the dispatcher singleton using parameters from the futuretense.ini
     *
     * @param ics
     * @return
     */
    static Dispatcher getDispatcher(ICS ics) {

        if (dispatcher == null) {
            String jarPath = ics.GetProperty("agilesites.dir");


            if (jarPath == null) {
                log.debug("[Dispatcher.getDispatcher] creating static dispatcher");
                dispatcher = new Dispatcher();
                return dispatcher;
            }

            String storagePath = ics.GetProperty("xcelerate.defaultbase",
                    "futuretense_xcel.ini", true);

            try {
                defaultPollInterval = Integer.parseInt(ics.GetProperty("agilesites.poll"));
            } catch (Exception e) {
            }

            File jarDir = new File(jarPath);
            File assetJarDir = new File(new File(storagePath), "Jar");
            //jarDir.mkdirs();
            //assetJarDir.mkdirs();
            log.debug("[Dispatcher.getDispatcher] dir=%s asset=%s defaultpoll=%d", jarDir, assetJarDir,
                    defaultPollInterval);
            dispatcher = new Dispatcher(jarDir, assetJarDir);
        }
        return dispatcher;
    }

    /**
     * New dispatcher looking for a given jar
     *
     * @param jarDir
     * @param assetJarDir
     */
    public Dispatcher(File jarDir, File assetJarDir) {
        log.debug("[Dispatcher.<init>] jarDir=%s assetJarDir=%s", jarDir, assetJarDir);
        loader = new Loader(jarDir, assetJarDir,
                Thread.currentThread().getContextClassLoader()
                /*getClass().getClassLoader()*/);
        log.debug("[Dispatcher.<init>] got loader");
    }

    /**
     * New dispatcher looking for a given jar
     *
     */
    public Dispatcher() {
        log.debug("[Dispatcher.<init>] static loader");
        loader = new Loader();
        log.debug("[Dispatcher.<init>] got loader");
    }

    /**
     * Default (legacy) dispatch using the default poll interval if not specified
     *
     * @param ics
     * @param className
     * @return
     */
    @Deprecated
    public String dispatch(ICS ics, String className) {
        return dispatch(ics, className, defaultPollInterval);
    }

    /**
     * Call the given class after reloading the jar and creating a wrapper for
     * ICS and the Element
     *
     * @param ics
     * @return
     */
    public String dispatch(ICS ics, String className, int interval) {
        try {

            // jar & classname
            ClassLoader cl = loader.getClassLoader(interval);

            // instantiate
            @SuppressWarnings("rawtypes")
            Class clazz = Class.forName(className, true, cl);
            Object obj = clazz.newInstance();

            // cast and execute
            if (obj instanceof Element) {
                Element element = (Element) obj;
                return element.exec(ics);
            }
            return "<h1>Not Found Element " + className + "<h1>";

        } catch (ElementException e1) {
            throw  e1;
        }
        catch (Exception e2) {
            String message = "[Dispacher.dispach] exception loading " + className
                    + ":" + e2.getMessage();
            log.error(message);
            throw new ElementException(message, e2);
/*
            return "<h1>Exception</h1><p>Class: " + className
                    + "</p>\n<p>Message: " + e.getMessage() + "</p>\n";
*/
        }

    }

    /**
     * Load a class from the classloader
     *
     * @param className
     * @return
     */
    public Class<?> loadClass(String className) {
        return loader.loadClass(className, defaultPollInterval);
    }

    /**
     * Load a site specific class from the classloader
     *
     * @param ics
     * @param name
     * @return
     */
    public Class<?> loadSiteClass(ICS ics, String name) {
        String site = ics.GetVar("site");
        String className = WCS.normalizeSiteName(site) + "." + name;
        return loadClass(className);
    }

    /**
     * Route a call from the url assembler
     *
     * @param ics
     * @return
     * @throws Exception
     */
    public Call route(ICS ics, String site, String path, String query)
            throws Exception {
        try {
            // get and extecute the router
            Object obj = loadSiteClass(ics, "Router").newInstance();
            if (obj instanceof Router) {
                Router router = (Router) obj;
                router.init(site);
                return router.route(ics, path, query);
            } else {
                throw new Exception("Router not found");
            }
        } catch (Exception e) {
            log.error(e, "[Dispatcher.route]");
            throw e;
        }
    }

    /**
     * Deploy will invoke the <site>.Model class passing username and password.
     * <p/>
     * Note that <site> is the normalised site name
     *
     * @param ics
     * @return
     */
    public String deploy(ICS ics, String sites, String user, String pass) {

        if (sites == null) {
            return "Cannot Setup, no sites specified!";
        }

        StringTokenizer st = new StringTokenizer(sites, ",");
        StringBuilder msg = new StringBuilder();
        while (st.hasMoreTokens()) {
            // next setup to run...
            String site = st.nextToken().trim();
            String className = WCS.normalizeSiteName(site) + ".Setup";
            try {
                // cast to Setup and execute
                Class<?> clazz = loadClass(className);
                Object obj = null;
                if (clazz != null) obj = clazz.newInstance();
                if (obj != null && obj instanceof wcs.core.Setup) {
                    log.debug("[Dispatcher.deploy] obj is a wcs.core.Setup");
                    Setup setup = (wcs.core.Setup) obj;
                    msg.append(setup.exec(ics, site, user, pass));
                } else {
                    log.debug("[Dispatcher.deploy] obj is NOT a wcs.core.Setup");
                    msg.append("*** Not Found Setup for " + site + "\n");
                }
            } catch (Exception e) {
                log.error(e, "[Dispatcher.deploy]");
                msg.append("<h1>Exception</h1><p>Class: " + className
                        + "</p>\n<p>Message: " + e.getMessage() + "</p>\n");
            }
        }
        return msg.toString();
    }
}
