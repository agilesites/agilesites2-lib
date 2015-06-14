<%@ taglib prefix="cs" uri="futuretense_cs/ftcs1_0.tld"
%><%@ taglib prefix="render" uri="futuretense_cs/render.tld"
%><%@ taglib prefix="ics" uri="futuretense_cs/ics.tld"
%><%@ page import="wcs.core.*,wcs.api.*"
%>
<%@ page import="java.util.Enumeration" %>
<cs:ftcs><%! final static Log log = wcs.core.Log.getLog("jsp.wcs.core.Router");
%><%
    Enumeration headers = request.getHeaderNames();
    while (headers.hasMoreElements()) {
        String headerName = (String)headers.nextElement();
        ics.SetVar("Header:" + headerName, request.getHeader(headerName));
    }
   Call c = WCS.route(ics,
   ics.GetVar("site"), 
   ics.GetVar("url"),
   request.getQueryString());
   log.trace(c.toString());
%><ics:callelement  element='<%= c.getOnce("element") %>'><%
 for(String k: c.keysLeft()) {
%><ics:argument name='<%= k %>' value='<%= c.getOnce(k) %>'/><%	 
 } 
%></ics:callelement></cs:ftcs>