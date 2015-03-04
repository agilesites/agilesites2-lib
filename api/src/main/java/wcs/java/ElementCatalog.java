package wcs.java;


import COM.FutureTense.Interfaces.FTValList;
import COM.FutureTense.Interfaces.ICS;

public class ElementCatalog {
    ICS ics;

    public ElementCatalog(ICS ics) {
        this.ics = ics;
    }

    public ElementCatalog(ICS ics, String username, String password) {
        this.ics = ics;
        login(username, password);
    }

    public void login(String username, String password) {
        FTValList ls = new FTValList();

        ls.setValString("ftcmd", "login");
        ls.setValString("username", username);
        ls.setValString("password", password);
        ics.CatalogManager(ls);

    }

    public void replace(String filename, String body) {
        FTValList ls = new FTValList();

        int slashIndex = filename.lastIndexOf("/");
        int dotIndex = filename.lastIndexOf(".");

        String name = "";
        if (dotIndex > 0)
            name = filename.substring(0, dotIndex);
        else
            name = filename;


        String file = filename;
        String folder = "";
        if (slashIndex > 0) {
            folder = filename.substring(0, slashIndex);
            file = filename.substring(slashIndex + 1);
        }


        ls.setValString("ftcmd", "replacerow");
        ls.setValString("tablename", "ElementCatalog");
        ls.setValString("elementname", name);
        ls.setValString("url_file", file);
        ls.setValString("url_folder", folder);
        ls.setValString("url", body);
        ics.CatalogManager(ls);

    }


    public void close() {
        FTValList ls = new FTValList();
        ls.setValString("ftcmd", "logout");
        ls.setValString("killsession", "true");
        ics.CatalogManager(ls);
    }


}