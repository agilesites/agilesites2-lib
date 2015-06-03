<%@ taglib prefix="cs" uri="futuretense_cs/ftcs1_0.tld"
%><%@ taglib prefix="user" uri="futuretense_cs/user.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="satellite" uri="futuretense_cs/satellite.tld"
%><%@ taglib prefix="asset" uri="futuretense_cs/asset.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="ics" uri="futuretense_cs/ics.tld"
%><%@ page import="COM.FutureTense.Interfaces.ICS,
COM.FutureTense.Interfaces.FTValList, 
java.util.StringTokenizer,
com.fatwire.assetapi.def.AssetTypeDefManager,
com.fatwire.assetapi.site.Site,
com.fatwire.assetapi.site.SiteInfo,
com.fatwire.assetapi.site.SiteManager,
com.fatwire.system.Session,
com.fatwire.system.SessionFactory,
java.util.*,
java.io.*,
wcs.api.Log" %><%!
    final static Log log = Log.getLog("wcs.core.AAAgileSetup");
    /**
     * Ensure there is a Jar asset before uploading it
     * <p/>
     * Return sites where the jar must be uploaded (at least AdminSite)
     */
    public String ensureJarAsset(ICS ics, String sites, String username, String password) throws Exception {
  
            // load the required managers
            Session ses = SessionFactory.newSession(username, password);
            AssetTypeDefManager atdm = (AssetTypeDefManager) ses
                    .getManager(AssetTypeDefManager.class.getName());
            SiteManager sim = (SiteManager) ses.getManager(SiteManager.class
                    .getName());

            // create the Jar Asset type if it does not exits
            boolean existJarAsset = false;
            Iterator<String> it = atdm.getAssetTypes().iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase("Jar")) {
                    existJarAsset = true;
                    log.debug("Jar exist");
                    break;
                } 
            }
            if (!existJarAsset) {
                log.debug("Jar does not exist");
                File base = new File(ics.GetProperty("xcelerate.defaultbase",
                        "futuretense_xcel.ini", true));
                File baseJar = new File(base, "Jar");
                StringBuilder sb = new StringBuilder();
                sb.append("<?xml version=\"1.0\" ?>\n");
                sb.append("<ASSET NAME=\"Jar\" DESCRIPTION=\"Jar\" DEFDIR=\"").append(baseJar.getAbsolutePath()).append("\">\n");
                sb.append("    <PROPERTIES>\n");
                sb.append("        <PROPERTY NAME=\"URL\" DESCRIPTION=\"URL\">\n");
                sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"255\" />\n");
                sb.append("            <INPUTFORM TYPE=\"UPLOAD\" WIDTH=\"64\" LINKTEXT=\"Url\" REQUIRED=\"YES\"/>\n");
                sb.append("        </PROPERTY>\n");
                sb.append("    </PROPERTIES>\n");
                sb.append("</ASSET>\n");
                atdm.createAssetMakerAssetType("Jar", "Jar.xml",
                        sb.toString(), false, false);
            }

            /// enable the Jar type in the requires sites

            // ensure AdminSite is in the list
            if (sites.indexOf("AdminSite") == -1)
                sites = sites + ",AdminSite";
            if (sites.startsWith(","))
                sites = sites.substring(1);


            log.debug("sites="+sites);

            // enable jar
            StringBuffer found = new StringBuffer();
            StringTokenizer st = new StringTokenizer(sites, ",");
            while (st.hasMoreTokens()) {
                String siteName = st.nextToken();
                log.debug("checking="+siteName);
                boolean exist = false;
                for (SiteInfo sif : sim.list()) {
                    if (sif.getName().equals(siteName)) {
                        found.append(siteName).append(",");
                        Site site = sim.read(Arrays.asList(siteName)).get(0);
                        List<String> types = site.getAssetTypes();
                        log.debug("site types="+types);
                        boolean hasJar = false;
                        for (String type : types)
                            if (type.equals("Jar")) {
                                hasJar = true;
                                break;
                            }
                        log.debug(siteName+" hasJar="+hasJar);
                        if (!hasJar) {
                            List<String> newtypes = new LinkedList<String>();
                            newtypes.addAll(types);
                            newtypes.add("Jar");
                            site.setAssetTypes(newtypes);
                            log.debug("7. "+siteName+" newtypes="+newtypes);
                            sim.update(Arrays.asList(site));
                        }
                    }
                }
            }
            if (found.length() > 0)
                found.setLength(found.length() - 1);
            return found.toString();

    }
%><cs:ftcs><% 

 String result ="";
 String tmp = ics.GetVar("op");
 if(tmp==null) tmp = "deploy";

 log.debug("ops="+tmp);

 StringTokenizer ops = new StringTokenizer(tmp, ",");
 while(ops.hasMoreTokens()) {
  try {
   String op = ops.nextToken();
   if(op.equals("upload")) {     
     String sites = ensureJarAsset(ics, ics.GetVar("sites"), ics.GetVar("username"), ics.GetVar("password"));
     log.debug("post ensureJar sites="+sites);
     byte[] jar = ics.GetBin("jar");
     String filename = ics.GetVar("jar_file");  
  %><user:login 
     username='<%=ics.GetVar("username") %>' 
     password='<%=ics.GetVar("password") %>'
  /><asset:load name="obj" type="Jar" field="name" value='<%= filename %>' editable="true"
  /><% if(ics.GetObj("obj")==null) { 
        result = "created,";  
  %><asset:create name="obj" type="Jar"
  /><asset:set name="obj" field="name" value='<%= filename %>'
  /><% } else { 
        result = "updated,";  
  %><asset:scatter name="obj" prefix="data" fieldlist="url"
  /><% } 
  %><% StringTokenizer st = new StringTokenizer(sites, ",");
       while(st.hasMoreTokens()) { 
         %><publication:load name="Pub" field="name" value='<%= st.nextToken() %>'
         /><publication:get name="Pub" field="id" output="siteid"
         /><asset:addsite name="obj" pubid='<%=ics.GetVar("siteid")%>' 
  /><% } 
       FTValList list = new FTValList();
       list.setValBLOB("jar", jar);
       ics.SetVar("data:url", list.getVal("jar"));
  %><ics:setvar name="data:url_file" value='<%= filename %>'
  /><ics:setvar name="data:url_folder" value="agilesites"
  /><asset:gather name="obj" prefix="data" fieldlist="url"
  /><asset:save name="obj"
  /><asset:get name="obj" field="id" output="id"/><%
    result +=  ics.GetVar("id") + "," +filename + "," + jar.length;
    //log.debug("Jar "+ics.GetObj("obj"));
    /*java.util.Enumeration en = ics.GetVars();
    while(en.hasMoreElements())  {
      String k = en.nextElement().toString();
      log.debug(k+"="+ics.GetVar(k));
    }*/
    //log.debug("Jar "+ics.GetBin("jar:url").length);
 } else if(op.equals("deploy")) {
	 result = wcs.core.WCS.deploy(ics, 
	  ics.GetVar("sites"), 
	  ics.GetVar("username"),
	  ics.GetVar("password"));
  } else if(op.equals("hello")) {
     result = "Nice to meet you, please take a cookie.";
  } else if(op.equals("key")) {
     result = ics.GetSSVar("_authkey_");
  } else if(op.equals("form")) { 
%><form method="POST" 
      action="/cs/Satellite" 
      enctype="multipart/form-data">
<input type="file" name="jar">
<input type="hidden" name="_authkey_" 
       value="<%=ics.GetSSVar("_authkey_")%>">
<input type="hidden" name="pagename" 
       value="AAAgileSetup">
<input type="submit">
</form>
<% } else { 
  	 result = "unknown op";
   }
 } catch(NullPointerException ex) { 
    result = "ERROR: no op specified";
 } catch(Exception ex) { 
    result = "ERROR: "+ex.getMessage();
    ex.printStackTrace(); 
 } 
}%><%= result %></cs:ftcs>
