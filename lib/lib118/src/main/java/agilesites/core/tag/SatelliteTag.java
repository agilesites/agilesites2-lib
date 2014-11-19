package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class SatelliteTag  {    
  private static Log log = Log.getLog(SatelliteTag.class);  
  static String ftValList2String(String name, FTValList vl)  {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(":");
    java.util.Enumeration en = vl.keys();
    while (en.hasMoreElements()) {
      String k = en.nextElement().toString();
      Object v = vl.getValString(k);
      sb.append(" ").append(k).append("=").append(v!=null?v.toString():"null");
    }
    return sb.toString();
  }
    
 
  public static class Argument {
  private FTValList args = new FTValList();
  private String output;
  public Argument set(String name, String value) { args.setValString(name,value); return this; }
 public Argument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Argument value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Argument condition(String val) { args.setValString("CONDITION", val); return this; } 
      
  public Argument() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.ARGUMENT", args); 
      log.trace(ftValList2String("Argument", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Argument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Argument argument() {
  return new Argument();
}


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.CREATE", args); 
      log.trace(ftValList2String("Create", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Create set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Create create() {
  return new Create();
}


  public static class Delete {
  private FTValList args = new FTValList();
  private String output;
  public Delete set(String name, String value) { args.setValString(name,value); return this; }
 public Delete name(String val) { args.setValString("NAME", val); return this; } 
      
  public Delete() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.DELETE", args); 
      log.trace(ftValList2String("Delete", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Delete set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Delete delete() {
  return new Delete();
}


  public static class Gather {
  private FTValList args = new FTValList();
  private String output;
  public Gather set(String name, String value) { args.setValString(name,value); return this; }
 public Gather name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gather prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Gather fieldlist(String val) { args.setValString("FIELDLIST", val); return this; } 
      
  public Gather() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.GATHER", args); 
      log.trace(ftValList2String("Gather", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Gather set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gather gather() {
  return new Gather();
}


  public static class Get {
  private FTValList args = new FTValList();
  private String output;
  public Get set(String name, String value) { args.setValString(name,value); return this; }
 public Get name(String val) { args.setValString("NAME", val); return this; } 
      
 public Get field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Get output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Get() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.GET", args); 
      log.trace(ftValList2String("Get", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Get set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Get get() {
  return new Get();
}


  public static class List {
  private FTValList args = new FTValList();
  private String output;
  public List set(String name, String value) { args.setValString(name,value); return this; }
 public List list(String val) { args.setValString("LIST", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.LIST", args); 
      log.trace(ftValList2String("List", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public List set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static List list() {
  return new List();
}


  public static class Load {
  private FTValList args = new FTValList();
  private String output;
  public Load set(String name, String value) { args.setValString(name,value); return this; }
 public Load name(String val) { args.setValString("NAME", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.LOAD", args); 
      log.trace(ftValList2String("Load", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Load set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Load load() {
  return new Load();
}


  public static class Parameter {
  private FTValList args = new FTValList();
  private String output;
  public Parameter set(String name, String value) { args.setValString(name,value); return this; }
 public Parameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Parameter value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Parameter() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.PARAMETER", args); 
      log.trace(ftValList2String("Parameter", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Parameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Parameter parameter() {
  return new Parameter();
}


  public static class Ping {
  private FTValList args = new FTValList();
  private String output;
  public Ping set(String name, String value) { args.setValString(name,value); return this; }
 public Ping id(String val) { args.setValString("ID", val); return this; } 
      
  public Ping() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.PING", args); 
      log.trace(ftValList2String("Ping", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Ping set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Ping ping() {
  return new Ping();
}


  public static class Save {
  private FTValList args = new FTValList();
  private String output;
  public Save set(String name, String value) { args.setValString(name,value); return this; }
 public Save name(String val) { args.setValString("NAME", val); return this; } 
      
  public Save() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.SAVE", args); 
      log.trace(ftValList2String("Save", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Save set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Save save() {
  return new Save();
}


  public static class Scatter {
  private FTValList args = new FTValList();
  private String output;
  public Scatter set(String name, String value) { args.setValString(name,value); return this; }
 public Scatter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Scatter prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.SCATTER", args); 
      log.trace(ftValList2String("Scatter", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Scatter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Scatter scatter() {
  return new Scatter();
}


  public static class Set {
  private FTValList args = new FTValList();
  private String output;
  public Set set(String name, String value) { args.setValString(name,value); return this; }
 public Set name(String val) { args.setValString("NAME", val); return this; } 
      
 public Set field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Set value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Set() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.SET", args); 
      log.trace(ftValList2String("Set", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Set set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Set set() {
  return new Set();
}


  public static class Form {
  private FTValList args = new FTValList();
  private String output;
  public Form set(String name, String value) { args.setValString(name,value); return this; }
 public Form assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Form classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Form container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Form satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Form action(String val) { args.setValString("ACTION", val); return this; } 
      
 public Form method(String val) { args.setValString("METHOD", val); return this; } 
      
 public Form enctype(String val) { args.setValString("ENCTYPE", val); return this; } 
      
 public Form acceptcharset(String val) { args.setValString("ACCEPTCHARSET", val); return this; } 
      
 public Form accept(String val) { args.setValString("ACCEPT", val); return this; } 
      
 public Form name(String val) { args.setValString("NAME", val); return this; } 
      
 public Form id(String val) { args.setValString("ID", val); return this; } 
      
 public Form onsubmit(String val) { args.setValString("ONSUBMIT", val); return this; } 
      
 public Form onkeypress(String val) { args.setValString("ONKEYPRESS", val); return this; } 
      
 public Form onreset(String val) { args.setValString("ONRESET", val); return this; } 
      
 public Form target(String val) { args.setValString("TARGET", val); return this; } 
      
 public Form windowstate(String val) { args.setValString("WINDOWSTATE", val); return this; } 
      
 public Form portletmode(String val) { args.setValString("PORTLETMODE", val); return this; } 
      
 public Form portleturltype(String val) { args.setValString("PORTLETURLTYPE", val); return this; } 
      
  public Form() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.FORM", args); 
      log.trace(ftValList2String("Form", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Form set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Form form() {
  return new Form();
}


  public static class Cookie {
  private FTValList args = new FTValList();
  private String output;
  public Cookie set(String name, String value) { args.setValString(name,value); return this; }
 public Cookie name(String val) { args.setValString("NAME", val); return this; } 
      
 public Cookie value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Cookie timeout(String val) { args.setValString("TIMEOUT", val); return this; } 
      
 public Cookie url(String val) { args.setValString("URL", val); return this; } 
      
 public Cookie domain(String val) { args.setValString("DOMAIN", val); return this; } 
      
 public Cookie secure(String val) { args.setValString("SECURE", val); return this; } 
      
 public Cookie xhtml(String val) { args.setValString("XHTML", val); return this; } 
      
  public Cookie() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.COOKIE", args); 
      log.trace(ftValList2String("Cookie", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Cookie set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cookie cookie() {
  return new Cookie();
}


  public static class Tag {
  private FTValList args = new FTValList();
  private String output;
  public Tag set(String name, String value) { args.setValString(name,value); return this; }

  public Tag() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.TAG", args); 
      log.trace(ftValList2String("Tag", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Tag set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Tag tag() {
  return new Tag();
}


  public static class Blob {
  private FTValList args = new FTValList();
  private String output;
  public Blob set(String name, String value) { args.setValString(name,value); return this; }
 public Blob assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Blob blobtable(String val) { args.setValString("BLOBTABLE", val); return this; } 
      
 public Blob blobcol(String val) { args.setValString("BLOBCOL", val); return this; } 
      
 public Blob blobwhere(String val) { args.setValString("BLOBWHERE", val); return this; } 
      
 public Blob blobkey(String val) { args.setValString("BLOBKEY", val); return this; } 
      
 public Blob blobnocache(String val) { args.setValString("BLOBNOCACHE", val); return this; } 
      
 public Blob csblobid(String val) { args.setValString("CSBLOBID", val); return this; } 
      
 public Blob blobheader(String val) { args.setValString("BLOBHEADER", val); return this; } 
      
 public Blob service(String val) { args.setValString("SERVICE", val); return this; } 
      
 public Blob cachecontrol(String val) { args.setValString("CACHECONTROL", val); return this; } 
      
 public Blob classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Blob container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Blob overridetype(String val) { args.setValString("OVERRIDETYPE", val); return this; } 
      
 public Blob outstring(String val) { args.setValString("OUTSTRING", val); return this; } 
      
 public Blob satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Blob urlbase(String val) { args.setValString("URLBASE", val); return this; } 
      
 public Blob parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Blob scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Blob authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Blob fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
  public Blob() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.BLOB", args); 
      log.trace(ftValList2String("Blob", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Blob set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Blob blob() {
  return new Blob();
}


  public static class Page {
  private FTValList args = new FTValList();
  private String output;
  public Page set(String name, String value) { args.setValString(name,value); return this; }
 public Page pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
 public Page d(String val) { args.setValString("D", val); return this; } 
      
 public Page resolvetemplatefordevice(String val) { args.setValString("RESOLVETEMPLATEFORDEVICE", val); return this; } 
      
  public Page() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.PAGE", args); 
      log.trace(ftValList2String("Page", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Page set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Page page() {
  return new Page();
}


  public static class Link {
  private FTValList args = new FTValList();
  private String output;
  public Link set(String name, String value) { args.setValString(name,value); return this; }
 public Link assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Link pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
 public Link classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Link container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Link overridetype(String val) { args.setValString("OVERRIDETYPE", val); return this; } 
      
 public Link outstring(String val) { args.setValString("OUTSTRING", val); return this; } 
      
 public Link satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Link urlbase(String val) { args.setValString("URLBASE", val); return this; } 
      
 public Link windowstate(String val) { args.setValString("WINDOWSTATE", val); return this; } 
      
 public Link portletmode(String val) { args.setValString("PORTLETMODE", val); return this; } 
      
 public Link portleturltype(String val) { args.setValString("PORTLETURLTYPE", val); return this; } 
      
 public Link scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Link authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Link fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
 public Link d(String val) { args.setValString("D", val); return this; } 
      
 public Link resolvetemplatefordevice(String val) { args.setValString("RESOLVETEMPLATEFORDEVICE", val); return this; } 
      
  public Link() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.LINK", args); 
      log.trace(ftValList2String("Link", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Link set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Link link() {
  return new Link();
}


  public static class Normalizeurl {
  private FTValList args = new FTValList();
  private String output;
  public Normalizeurl set(String name, String value) { args.setValString(name,value); return this; }
 public Normalizeurl url(String val) { args.setValString("URL", val); return this; } 
      
 public Normalizeurl outstring(String val) { args.setValString("OUTSTRING", val); return this; } 
      
  public Normalizeurl() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.NORMALIZEURL", args); 
      log.trace(ftValList2String("Normalizeurl", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Normalizeurl set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Normalizeurl normalizeurl() {
  return new Normalizeurl();
}


  public static class Flush {
  private FTValList args = new FTValList();
  private String output;
  public Flush set(String name, String value) { args.setValString(name,value); return this; }

  public Flush() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.FLUSH", args); 
      log.trace(ftValList2String("Flush", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Flush set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flush flush() {
  return new Flush();
}


  public static class Server {
  private FTValList args = new FTValList();
  private String output;
  public Server set(String name, String value) { args.setValString(name,value); return this; }
 public Server name(String val) { args.setValString("NAME", val); return this; } 
      
 public Server username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Server password(String val) { args.setValString("PASSWORD", val); return this; } 
      
  public Server() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.SERVER", args); 
      log.trace(ftValList2String("Server", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Server set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Server server() {
  return new Server();
}


  public static class Pages {
  private FTValList args = new FTValList();
  private String output;
  public Pages set(String name, String value) { args.setValString(name,value); return this; }
 public Pages pagetags(String val) { args.setValString("PAGETAGS", val); return this; } 
      
  public Pages() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.PAGES", args); 
      log.trace(ftValList2String("Pages", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Pages set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Pages pages() {
  return new Pages();
}


  public static class Preference {
  private FTValList args = new FTValList();
  private String output;
  public Preference set(String name, String value) { args.setValString(name,value); return this; }
 public Preference name(String val) { args.setValString("NAME", val); return this; } 
      
 public Preference value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Preference() { }
  public int run(ICS ics) { 
      ics.runTag("SATELLITE.PREFERENCE", args); 
      log.trace(ftValList2String("Preference", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Preference set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Preference preference() {
  return new Preference();
}

}
