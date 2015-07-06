package wcs.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import wcs.core.Loader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by msciab on 06/07/15.
 */
public class LoaderTestJarOrdering {

    File f1 = new File("f1");
    File f2 = new File("f2");
    File f3 = new File("f3");

    @Before
    public void before() throws IOException, InterruptedException {
        FileWriter fw = new FileWriter(f1);
        fw.write('\n');
        fw.close();
        System.out.println("f1:"+f1.lastModified());
        Thread.sleep(2000l);
        fw = new FileWriter(f2);
        fw.write('\n');
        fw.close();
        System.out.println("f2:"+f2.lastModified());
        Thread.sleep(2000l);
        fw = new FileWriter(f3);
        fw.write('\n');
        fw.close();
        System.out.println("f3:"+f3.lastModified());
    }

    @Test
    public  void testOrdering1() {
        List<File> filelist = new LinkedList<File>();
        filelist.add(f1);
        filelist.add(f2);
        filelist.add(f3);
        Loader.orderByTimestap(filelist);
        System.out.println(filelist);
        assert(filelist.get(0)==f3);
        assert(filelist.get(1)==f2);
        assert(filelist.get(2)==f1);
    }

    @Test
    public  void testOrdering2() {
        List<File> filelist = new LinkedList<File>();
        filelist.add(f2);
        filelist.add(f1);
        filelist.add(f3);
        Loader.orderByTimestap(filelist);
        System.out.println(filelist);
        assert(filelist.get(0)==f3);
        assert(filelist.get(1)==f2);
        assert(filelist.get(2)==f1);
    }


    @Test
    public  void testOrdering3() {
        List<File> filelist = new LinkedList<File>();
        filelist.add(f3);
        filelist.add(f1);
        filelist.add(f2);
        Loader.orderByTimestap(filelist);
        System.out.println(filelist);
        assert(filelist.get(0)==f3);
        assert(filelist.get(1)==f2);
        assert(filelist.get(2)==f1);
    }


    @Test
    public  void testOrdering4() {
        List<File> filelist = new LinkedList<File>();
        filelist.add(f3);
        filelist.add(f2);
        filelist.add(f1);
        Loader.orderByTimestap(filelist);
        System.out.println(filelist);
        assert(filelist.get(0)==f3);
        assert(filelist.get(1)==f2);
        assert(filelist.get(2)==f1);
    }

    @After
    public void after() {
        f1.delete();
        f2.delete();
        f3.delete();
    }

}
