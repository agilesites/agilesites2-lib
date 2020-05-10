package wcs.core;

// **** DANGER ZONE ****
// This file is critical and difficult to test
// change it at your own risk.
// **********************

import org.apache.commons.io.FileUtils;
import org.xeustechnologies.jcl.JarClassLoader;
import wcs.api.Log;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Load a pool of jars using a classloader. It caches the classloader and check
 * if the underlying jar file are changed before reloading it. A check is done
 * only after an interval passes.
 *
 * @author msciab
 */
public class Loader {

    final static Log log = Log.getLog(Loader.class);

    private File jarDir; // classical jar spool dir
    private File jarAssetDir; // jar storage dir
    private File libDir;
    private long lastCheck = 0;
    private long jarTimeStamp;

    private ClassLoader parentClassLoader;
    private ClassLoader currentClassLoader = null;

    /**
     * Build a loader
     *
     * @param dir where locate the jars
     * @param cl  parent classloader
     */
    public Loader(File dir, File assetDir, final ClassLoader cl) {
        jarDir = dir;
        jarAssetDir = assetDir;
        libDir = new File(dir, "lib");

        parentClassLoader = cl;
        currentClassLoader = null;
        lastCheck = System.currentTimeMillis();
    }

    /**
     * Build a default loader
     */
    public Loader() {
        jarDir = null;
    }

    /**
     * Return the parent classloader
     */
    public ClassLoader getParentClassLoader() {
        return parentClassLoader;
    }

    public static void orderByTimestamp(List<File> files) {
         /* sort the list putting the file modified more recently first in the list */
        Collections.sort(files, new Comparator<File>() {
            @Override
            public int compare(File file, File otherFile) {
                return new Long(otherFile.lastModified()).compareTo(file.lastModified());
            }
        });
    }

    // return the list of the urls , ordered by timestap
    private URL[] toUrlArray(List<File> files) throws MalformedURLException {
        orderByTimestamp(files);
        URL[] res = new URL[files.size()];
        int i = 0;
        for (File file : files)
            res[i++] = file.toURI().toURL();
        return res;
    }

    /**
     * Return a class loader allowing to access new jars. It copies jars to a
     * spool dir before loading them.
     *
     * @return
     */
    public ClassLoader getClassLoader(int interval) {

        // get jars if somehing changed
        File[] jars;
        if(currentClassLoader==null)
          jars = getJarsIfSomeIsModifiedAfterInterval(0);
        else
          jars = getJarsIfSomeIsModifiedAfterInterval(interval);

        // curren
        if(jars==null || jars.length > 1)
            if(currentClassLoader==null)
                return parentClassLoader;
            else
                return currentClassLoader;

        // update classloader
        synchronized (this) {
            try {
                // create a new classloader
                List<File> list = new LinkedList<File>();
                for (File f : jars) {
                    list.add(f);
                    log.info("updated jar %s", f);
                }

                // adding lib jars
                for (File f : libDir.listFiles(onlyJars)) {
                    // allow a jar with the same name
                    // to replace a jar in the lib dir
                    if (!new File(jarDir, f.getName()).exists())
                        list.add(f);
                    else if (log.debug())
                        log.debug("jar %s override the same in the lib dir",
                                f.getName());
                }

                if (log.debug()) {
                    //System.out.println("Loader: reloader " + newSpoolDir);
                    if (log.trace()) {
                        for (File f : list)
                            log.trace("jar %s", f.toString());
                    }
                }
                // create a class loader according the current choice
                //log.error("using JCL classloader without parent");
                currentClassLoader = new JarClassLoader(toUrlArray(list));
            } catch (Exception ex) {
                log.error(ex, "[Loader.getClassLoader]");
            }
            return currentClassLoader;
        }
    }

    /**
     * Close the current classloader, freeing the underlying opened jars.
     */
    public void close() {
        if (log.trace())
            log.trace("called Loader.close - currently do nothing");
    }

    /**
     * Filter only for jars
     */
    private FileFilter onlyJars = new FileFilter() {
        @Override
        public boolean accept(File f) {
            return !f.isDirectory()
                    && f.getName().toLowerCase().endsWith(".jar");
        }
    };

    /**
     * Filter only for dirs
     */
    private FileFilter onlyDirs = new FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.isDirectory();
        }
    };


    /*
     * note that this function relies on the fact that generated names starts
	 * with _
	 */
    private FileFilter onlyTempDirs = new FileFilter() {
        @Override
        public boolean accept(File f) {
            return f.isDirectory() && f.getName().startsWith("_");
        }
    };


    /**
     * File Array zero-length to be used as a proto
     */

    File[] protoFileArray = new File[0];

    /**
     * Return the jars to use only for the classloader if some of them has been
     * modified Check only once in a given interval.
     *
     * @return
     * @throws MalformedURLException
     */
    public File[] getJarsIfSomeIsModifiedAfterInterval(int reloadInterval) {

        // ********************
        // DO NOT CHANGE THIS METHOD WITHOUT CAREFUL TESTING
        // IT IS ACCESSED HEAVILY CONCURRENTLY
        // ********************

        // check it is is time to check
        // do it in an unsychronized way
        long now = System.currentTimeMillis();
        if (now < lastCheck + reloadInterval)
            return null;

        synchronized (this) {

            // some time was spent trying to acquire the lock
            // someone else may have updated the time to check
            // checking again what is the time
            // if someone updated the lastCheck
            // update time for the next check
            now = System.currentTimeMillis();
            if (now < lastCheck + reloadInterval)
                return null;

            // set last check time
            lastCheck = now;

            // get the more recent lastmodified timestamp
            long curTimeStamp = 0;

            ArrayList<File> jars = new ArrayList<File>();

            // look in the classical jarDir
            if (jarDir != null && jarDir.isDirectory())
                Collections.addAll(jars, jarDir.listFiles(onlyJars));

            // look in the jar asset dir for 2 levels
            if (jarAssetDir != null && jarAssetDir.isDirectory()) {
                Collections.addAll(jars, jarAssetDir.listFiles(onlyJars));
                for (File dir1 : jarAssetDir.listFiles(onlyDirs)) {
                    Collections.addAll(jars, dir1.listFiles(onlyJars));
                    for (File dir2 : dir1.listFiles(onlyDirs)) {
                        Collections.addAll(jars, dir2.listFiles(onlyJars));
                    }
                }
            }

            if (jars.size() == 0) {
                log.warn("no jars in the jar folder");
                return null;
            }

            for (File file : jars) {
                curTimeStamp = Math.max(curTimeStamp, file.lastModified());
            }

            // log.trace("curTimestamp=%d jarTimestamp=%d", curTimestamp,
            // jarTimestamp);
            if (curTimeStamp > jarTimeStamp) {
                if (log.debug()) {
                    log.debug("jar changed, timestamp=%d", curTimeStamp);
                    System.out.println("Loader: detected change");
                }
                jarTimeStamp = curTimeStamp;
                return jars.toArray(protoFileArray);
            } else {
                if (log.trace())
                    log.trace("no changes detected");
            }
            return null;
        }
    }

    /**
     * Load a class for name from current class loaders
     *
     * @param classname
     * @return
     */
    public Class<?> loadClass(String classname, int interval) {
        ClassLoader cl = getClassLoader(interval);
        try {
            if (log.trace())
                log.trace("loading %s", classname);
            return Class.forName(classname, true, cl);
        } catch (ClassNotFoundException ex) {
            log.error(ex, "[Loader.loadClass]");
            return null;
        }
    }
}
