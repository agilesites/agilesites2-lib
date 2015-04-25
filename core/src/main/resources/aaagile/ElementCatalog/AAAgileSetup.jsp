<%@ taglib prefix="cs" uri="futuretense_cs/ftcs1_0.tld"
%><%@ taglib prefix="user" uri="futuretense_cs/user.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="satellite" uri="futuretense_cs/satellite.tld"
%><%@ taglib prefix="asset" uri="futuretense_cs/asset.tld"
%><%@ taglib prefix="publication" uri="futuretense_cs/publication.tld"
%><%@ taglib prefix="ics" uri="futuretense_cs/ics.tld"
%><%@ page import="COM.FutureTense.Interfaces.FTValList, 
                   java.util.StringTokenizer" 
%><cs:ftcs><% 
 String result ="";
 String tmp = ics.GetVar("op");
 if(tmp==null) tmp = "deploy";
 StringTokenizer ops = new StringTokenizer(tmp, ",");
 while(ops.hasMoreTokens()) {
  try {
   String op = ops.nextToken();
   if(op.equals("upload")) {
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
  %><% StringTokenizer st = new StringTokenizer(ics.GetVar("sites"), ",");
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
    //System.out.println("Jar "+ics.GetObj("obj"));
    /*java.util.Enumeration en = ics.GetVars();
    while(en.hasMoreElements())  {
      String k = en.nextElement().toString();
      System.out.println(k+"="+ics.GetVar(k));
    }*/
    //System.out.println("Jar "+ics.GetBin("jar:url").length);
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
