package wcs.core;


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import wcs.api.Log;

/**
 * Created by msciab on 11/08/15.
 */
public class StaticsCache {
   final static Log log = Log.getLog(StaticsCache.class);

    private Map<String, byte[]> cache = new HashMap<String, byte[]>();
    private File jarFile = null;
    private File jarDir = null;
    private long jarTimeStamp = 0;
    private Pattern toCache = null;

    private static StaticsCache instance = null;

    public static void init(File dir, Pattern toCache) {
        instance = new StaticsCache(dir, toCache);
    }

    public static StaticsCache getInstance() {
        if (instance == null)
            throw new RuntimeException("need to initialize before getting instance");
        return instance;
    }

    private StaticsCache(File file, Pattern toCache) {
        log.debug("jarDir "+file);
        this.jarDir = file;
        this.toCache = toCache;
        if(updateJarFile())
            cache = reloadCache();
    }

    public synchronized byte[] get(String key) {
        if (updateJarFile())
            cache = reloadCache();
        return cache.get(key);
    }

    private boolean updateJarFile() {
        if (jarFile == null || !jarFile.exists() || jarFile.lastModified() > jarTimeStamp) {
            log.debug("updating jar ");
            List<File> files = new LinkedList<File>();
            for (File f : jarDir.listFiles()) {
                if (f.getName().endsWith(".jar"))
                    files.add(f);
            }
            if (files.size() == 0)
                throw new RuntimeException("no jar found");
            Collections.sort(files, new Comparator<File>() {
                @Override
                public int compare(File file, File otherFile) {
                    return new Long(otherFile.lastModified()).compareTo(file.lastModified());
                }
            });
            jarFile = files.get(0);
            jarTimeStamp = jarFile.lastModified();
            log.debug("jar "+jarFile+" #"+jarTimeStamp);
            return true;
        }
        return false;
    }

    private Map<String, byte[]> reloadCache() {
        log.debug("reloadCache");
        Map<String, byte[]> cache = new HashMap<String, byte[]>();
        ZipInputStream zip = null;
        try {
            // 2.1 Get zip input stream
            zip = new ZipInputStream(new FileInputStream(jarFile));
            ZipEntry entry = null;
            int len;
            byte[] buffer = new byte[1024];

            // 2.2 Go over each entry "file/folder" in zip file
            while ((entry = zip.getNextEntry()) != null) {

                String name = (entry.getName());
                Matcher m = toCache.matcher(name);
                if (!m.find())
                    continue;

                if (!entry.isDirectory()) {
                   log.debug("add cache" + entry.getName());

                    // create a new file
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();

                    // copy bytes
                    while ((len = zip.read(buffer)) > 0) {
                        baos.write(buffer, 0, len);
                    }
                    cache.put(name, baos.toByteArray());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                zip.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cache;
    }
}

