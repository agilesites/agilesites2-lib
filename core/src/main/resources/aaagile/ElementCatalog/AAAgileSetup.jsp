<%@ taglib prefix="cs" uri="futuretense_cs/ftcs1_0.tld"
%><%@ taglib prefix="user" uri="futuretense_cs/user.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="satellite" uri="futuretense_cs/satellite.tld"
%><%@ taglib prefix="asset" uri="futuretense_cs/asset.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="ics" uri="futuretense_cs/ics.tld"
%><%@ page import="COM.FutureTense.Interfaces.*,
 com.fatwire.assetapi.common.*,
 com.fatwire.assetapi.data.*,
 com.fatwire.assetapi.def.*,
 com.fatwire.assetapi.site.*,
 com.fatwire.system.*,
 wcs.core.*,
 wcs.core.tag.*,
 java.io.*,
 java.util.*"
%><%! 
public static class MyInstaller {

    final static Log log = Log.getLog(Installer.class);
    
    ICS ics;
    Session ses;
    SiteManager sim;
    String username;
    String password;

    public MyInstaller(ICS ics, String username, String password) {
        this.ics = ics;
        this.username =  username;
        this.password = password;

        //System.out.println(username);
        //System.out.println(password);

        ses = SessionFactory.newSession(username, password);
        sim = (SiteManager) ses.getManager(SiteManager.class
                .getName());
    }

    private String xmlByType(String typeName) {
        log.trace("xmlByType %s", typeName);
        File base = new File(ics.GetProperty("xcelerate.defaultbase",
                "futuretense_xcel.ini", true));
        StringBuilder sb = new StringBuilder();
        String defDir = new File(base, typeName).getAbsolutePath();

        if (typeName.equals(("Jar"))) {
            sb.append("<?xml version='1.0' ?>\n");
            sb.append("<ASSET NAME='Jar' DESCRIPTION='Jar' DEFDIR='").append(defDir).append("'>\n");
            sb.append(" <PROPERTIES>\n");
            sb.append("  <PROPERTY NAME='URL' DESCRIPTION='URL'>\n");
            sb.append("    <STORAGE TYPE='VARCHAR' LENGTH='255' />\n");
            sb.append("    <INPUTFORM TYPE='UPLOAD' WIDTH='64' LINKTEXT='Url' REQUIRED='YES'/>\n");
            sb.append("  </PROPERTY>\n");
            sb.append(" </PROPERTIES>\n");
            sb.append("</ASSET>\n");
        }
        if (typeName.equals("Static")) {
            sb.append("<?xml version='1.0' ?>\n");
            sb.append("<ASSET NAME='Static' DESCRIPTION='Static' DEFDIR='").append(defDir).append("'>\n");
            sb.append(" <PROPERTIES>\n");
            sb.append("  <PROPERTY NAME='URL' DESCRIPTION='URL'>\n");
            sb.append("   <STORAGE TYPE='VARCHAR' LENGTH='255' />\n");
            sb.append("   <INPUTFORM TYPE='UPLOAD' WIDTH='64' LINKTEXT='Url' REQUIRED='YES'/>\n");
            sb.append(" </PROPERTY>\n");
            sb.append(" <PROPERTY NAME='FILEPATH' DESCRIPTION='FILEPATH'>\n");
            sb.append("   <STORAGE TYPE='VARCHAR' LENGTH='512'/>\n");
            sb.append("   <INPUTFORM TYPE='TEXT' DESCRIPTION='FILE PATH' REQUIRED='YES'/>\n");
            sb.append("   <SEARCHFORM TYPE='TEXT' DESCRIPTION='FILE PATH'/>\n");
            sb.append("   <SEARCHRESULTS INCLUDE='TRUE'/>\n");
            sb.append(" </PROPERTY>\n");
            sb.append(" <PROPERTY NAME='HASH' DESCRIPTION='HASH'>\n");
            sb.append("  <STORAGE TYPE='VARCHAR' LENGTH='32'/>\n");
            sb.append("  <INPUTFORM TYPE='TEXT' DESCRIPTION='HASH' REQUIRED='YES'/>\n");
            sb.append("  <SEARCHFORM TYPE='TEXT' DESCRIPTION='HASH'/>\n");
            sb.append("  <SEARCHRESULTS INCLUDE='TRUE'/>\n");
            sb.append(" </PROPERTY>\n");
            sb.append(" <PROPERTY NAME='HASHFILEPATH' DESCRIPTION='HASHFILEPATH'>\n");
            sb.append("  <STORAGE TYPE='VARCHAR' LENGTH='512'/>\n");
            sb.append("  <INPUTFORM TYPE='TEXT' DESCRIPTION='HASH FILE PATH' REQUIRED='YES'/>\n");
            sb.append("  <SEARCHFORM TYPE='TEXT' DESCRIPTION='HASH FILE PATH'/>\n");
            sb.append("  <SEARCHRESULTS INCLUDE='TRUE'/>\n");
            sb.append(" </PROPERTY>\n");
            sb.append(" <PROPERTY NAME='MIMETYPE' DESCRIPTION='MIMETYPE'>\n");
            sb.append("   <STORAGE TYPE='VARCHAR' LENGTH='255'/>\n");
            sb.append("   <INPUTFORM TYPE='TEXT' DESCRIPTION='MIMETYPE' REQUIRED='YES'/>\n");
            sb.append("   <SEARCHFORM TYPE='TEXT' DESCRIPTION='MIMETYPE'/>\n");
            sb.append("   <SEARCHRESULTS INCLUDE='TRUE'/>\n");
            sb.append("  </PROPERTY>\n");
            sb.append(" </PROPERTIES>\n");
            sb.append("</ASSET>\n");
        }
        String body = sb.toString().replace('\'', '"');
        //System.out.println(body);
        return body;
    }

    // create a type if it does not exist
    private boolean createTypeIfDoesNotExist(String typeName) throws AssetAccessException {
        AssetTypeDefManager atdm = (AssetTypeDefManager) ses
                .getManager(AssetTypeDefManager.class.getName());

        // create the Jar Asset type if it does not exits
        Iterator<String> it = atdm.getAssetTypes().iterator();
        while (it.hasNext()) 
            if (it.next().equalsIgnoreCase(typeName)) 
                return false;

        atdm.createAssetMakerAssetType(
                typeName, 
                typeName + ".xml",
                xmlByType(typeName), false, false);

        return true;
    }

    // create a site if it does not exist
    private boolean createSiteIfDoesNotExist(String sitename, long siteid) throws SiteAccessException {
        for (SiteInfo inf : sim.list())
            if (inf.getName().equals(sitename)) 
                return false;
        try {

            Site site = new SiteImpl();
            site.setId(siteid);
            site.setName(sitename);
            site.setDescription(sitename);
            site.setUserRoles(username, Arrays.asList("GeneralAdmin", "SitesUser", "AdvancedUser"));
            sim.create(Arrays.asList(site));

           // sim.create(Collections.<Site>singletonList(new MiniSite(sitename, siteid)));
        } catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Enable a type for the existing site
     */
    private boolean enableType(String siteName, String typeName) throws SiteAccessException {
        log.trace("enableType in %s for %s", siteName, typeName);
        Site site = sim.read(Arrays.asList(siteName)).get(0);
        List<String> types = site.getAssetTypes();
        boolean hasType = false;
        for (String type : types)
            if (type.equals(typeName)) {
                hasType = true;
                break;
            }
        if(hasType)
            return false;

        List<String> newtypes = new LinkedList<String>();
        newtypes.addAll(types);
        newtypes.add(typeName);
        site.setAssetTypes(newtypes);
        log.debug("adding " + siteName + " newtypes=" + newtypes);
        sim.update(Arrays.asList(site));
        return true;
    }

    /**
     * init a site creating a Jar, a Static and a Site with a given id
     */
    public String init(String siteName, long siteId) throws Exception {
        StringBuilder sb = new StringBuilder();
        if(createTypeIfDoesNotExist("Jar"))
            sb.append("Created Jar\n");
        
        if(createTypeIfDoesNotExist("Static")) 
            sb.append("Created Static.\n");

        if(createSiteIfDoesNotExist(siteName, siteId))
            sb.append("Created ").append(siteName+"("+siteId+")");

        if(enableType(siteName, "Jar"))
            sb.append("Enabled Jar for").append(siteName+"("+siteId+")");

        if(enableType(siteName, "Static"))
            sb.append("Enabled Static for").append(siteName+"("+siteId+")");

        return sb.toString();
    }

    /**
     * Upload a jar
     *
     * @return
     */
    public String uploadJar(String siteid) {
         UserTag.login()
                .username(username)
                .password(password)
                .run(ics);

        byte[] file = ics.GetBin("jar");
        String filename = ics.GetVar("jar_file");
        String result;

        AssetTag.load()
                .name("obj")
                .type("Jar")
                .field("name")
                .value(filename)
                .editable("true")
                .run(ics);

        if (ics.GetObj("obj") == null) {
            result = "created: ";
            AssetTag.create()
                    .name("obj")
                    .type("Jar")
                    .run(ics);
            AssetTag.set()
                    .name("obj")
                    .field("name")
                    .value(filename)
                    .run(ics);
        } else {
            result = "updated: ";
            AssetTag.scatter()
                    .name("obj")
                    .prefix("data")
                    .fieldlist("url")
                    .run(ics);
        }

        AssetTag.addsite()
                .name("obj")
                .pubid(ics.GetVar("siteid"))
                .run(ics);

        FTValList list = new FTValList();
        list.setValBLOB("jar", file);
        ics.SetVar("data:url", list.getVal("jar"));

        IcsTag.setvar()
                .name("data:url_file")
                .value(filename)
                .run(ics);

        IcsTag.setvar()
                .name("data:url_folder")
                .value("agilesites")
                .run(ics);

        IcsTag.setvar()
                .name("data:status")
                .value("ED")
                .run(ics);

        AssetTag.gather()
                .name("obj")
                .prefix("data")
                .fieldlist("url")
                .run(ics);

        AssetTag.save()
                .name("obj")
                .run(ics);

        AssetTag.get()
                .name("obj")
                .field("id")
                .output("id")
                .run(ics);

        result += filename+" #"+file.length + "("+ ics.GetVar("id") + ")";
        return result;
    }

    private void dumpVars() {
        java.util.Enumeration en = ics.GetVars();
        while(en.hasMoreElements())  {
          String k = en.nextElement().toString();
          log.debug(k+"="+ics.GetVar(k));
        }
    }
}
%><cs:ftcs><% 
 String op = ics.GetVar("op");
 String result ="Unknown command: "+op;
 try {
  String username = ics.GetVar("username");
  String password = ics.GetVar("password");
  if (op == null) {
    throw new Exception("You are using an obsolete version of the deployer - plase upgrade plugin to version 11g or later");
  } else if(op.equals("init")) {
     String site = ics.GetVar("site");
     long siteid = Long.parseLong(ics.GetVar("siteid"));
     result = new MyInstaller(ics, username, password).init(site,siteid);
  } else if(op.equals("status")) {
     result = ics.GetSSVar("_authkey_");    
  }  else if(op.equals("upload")) {
    result = new MyInstaller(ics, username, password).uploadJar(ics.GetVar("siteid"));
  } else if(op.equals("deploy")) {
    result = wcs.core.WCS.deploy(ics,
        ics.GetVar("site"),
        ics.GetVar("username"),
        ics.GetVar("password"));
  } else {
   throw new Exception("unknow command "+op);
  } 
} catch(Exception ex) {
    result = "ERROR: "+ex.getMessage();
    ex.printStackTrace();
} 
%><%= result %></cs:ftcs>
