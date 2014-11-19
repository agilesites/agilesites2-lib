package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class SiteplanTag  {    
  private static Log log = Log.getLog(SiteplanTag.class);  
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
      
  public Argument() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.ARGUMENT", args); 
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


  public static class Children {
  private FTValList args = new FTValList();
  private String output;
  public Children set(String name, String value) { args.setValString(name,value); return this; }
 public Children name(String val) { args.setValString("NAME", val); return this; } 
      
 public Children list(String val) { args.setValString("LIST", val); return this; } 
      
 public Children objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Children objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Children objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Children code(String val) { args.setValString("CODE", val); return this; } 
      
 public Children order(String val) { args.setValString("ORDER", val); return this; } 
      
  public Children() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.CHILDREN", args); 
      log.trace(ftValList2String("Children", args));
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
  public Children set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Children children() {
  return new Children();
}


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.CREATE", args); 
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


  public static class Deinstall {
  private FTValList args = new FTValList();
  private String output;
  public Deinstall set(String name, String value) { args.setValString(name,value); return this; }
 public Deinstall arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Deinstall() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.DEINSTALL", args); 
      log.trace(ftValList2String("Deinstall", args));
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
  public Deinstall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deinstall deinstall() {
  return new Deinstall();
}


  public static class Delete {
  private FTValList args = new FTValList();
  private String output;
  public Delete set(String name, String value) { args.setValString(name,value); return this; }
 public Delete name(String val) { args.setValString("NAME", val); return this; } 
      
  public Delete() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.DELETE", args); 
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
      ics.runTag("SITEPLAN.GATHER", args); 
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
      ics.runTag("SITEPLAN.GET", args); 
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


  public static class Install {
  private FTValList args = new FTValList();
  private String output;
  public Install set(String name, String value) { args.setValString(name,value); return this; }
 public Install acl(String val) { args.setValString("ACL", val); return this; } 
      
 public Install track(String val) { args.setValString("TRACK", val); return this; } 
      
 public Install arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Install() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.INSTALL", args); 
      log.trace(ftValList2String("Install", args));
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
  public Install set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Install install() {
  return new Install();
}


  public static class Load {
  private FTValList args = new FTValList();
  private String output;
  public Load set(String name, String value) { args.setValString(name,value); return this; }
 public Load name(String val) { args.setValString("NAME", val); return this; } 
      
 public Load nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.LOAD", args); 
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


  public static class Root {
  private FTValList args = new FTValList();
  private String output;
  public Root set(String name, String value) { args.setValString(name,value); return this; }
 public Root list(String val) { args.setValString("LIST", val); return this; } 
      
 public Root objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Root objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Root objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Root code(String val) { args.setValString("CODE", val); return this; } 
      
 public Root order(String val) { args.setValString("ORDER", val); return this; } 
      
 public Root arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Root() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.ROOT", args); 
      log.trace(ftValList2String("Root", args));
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
  public Root set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Root root() {
  return new Root();
}


  public static class Save {
  private FTValList args = new FTValList();
  private String output;
  public Save set(String name, String value) { args.setValString(name,value); return this; }
 public Save name(String val) { args.setValString("NAME", val); return this; } 
      
 public Save flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Save() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.SAVE", args); 
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
      ics.runTag("SITEPLAN.SCATTER", args); 
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
      ics.runTag("SITEPLAN.SET", args); 
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


  public static class Setobject {
  private FTValList args = new FTValList();
  private String output;
  public Setobject set(String name, String value) { args.setValString(name,value); return this; }
 public Setobject name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setobject object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setobject() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.SETOBJECT", args); 
      log.trace(ftValList2String("Setobject", args));
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
  public Setobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setobject setobject() {
  return new Setobject();
}


  public static class Setparent {
  private FTValList args = new FTValList();
  private String output;
  public Setparent set(String name, String value) { args.setValString(name,value); return this; }
 public Setparent name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparent parentnode(String val) { args.setValString("PARENTNODE", val); return this; } 
      
  public Setparent() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.SETPARENT", args); 
      log.trace(ftValList2String("Setparent", args));
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
  public Setparent set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparent setparent() {
  return new Setparent();
}


  public static class Stream {
  private FTValList args = new FTValList();
  private String output;
  public Stream set(String name, String value) { args.setValString(name,value); return this; }
 public Stream name(String val) { args.setValString("NAME", val); return this; } 
      
 public Stream field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Stream resolve(String val) { args.setValString("RESOLVE", val); return this; } 
      
  public Stream() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.STREAM", args); 
      log.trace(ftValList2String("Stream", args));
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
  public Stream set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Stream stream() {
  return new Stream();
}


  public static class Getpagename {
  private FTValList args = new FTValList();
  private String output;
  public Getpagename set(String name, String value) { args.setValString(name,value); return this; }
 public Getpagename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getpagename output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getpagename() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.GETPAGENAME", args); 
      log.trace(ftValList2String("Getpagename", args));
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
  public Getpagename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpagename getpagename() {
  return new Getpagename();
}


  public static class Listpages {
  private FTValList args = new FTValList();
  private String output;
  public Listpages set(String name, String value) { args.setValString(name,value); return this; }
 public Listpages name(String val) { args.setValString("NAME", val); return this; } 
      
 public Listpages placedlist(String val) { args.setValString("PLACEDLIST", val); return this; } 
      
 public Listpages unplacedlist(String val) { args.setValString("UNPLACEDLIST", val); return this; } 
      
 public Listpages level(String val) { args.setValString("LEVEL", val); return this; } 
      
 public Listpages pagetype(String val) { args.setValString("PAGETYPE", val); return this; } 
      
  public Listpages() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.LISTPAGES", args); 
      log.trace(ftValList2String("Listpages", args));
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
  public Listpages set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Listpages listpages() {
  return new Listpages();
}


  public static class Place {
  private FTValList args = new FTValList();
  private String output;
  public Place set(String name, String value) { args.setValString(name,value); return this; }
 public Place name(String val) { args.setValString("NAME", val); return this; } 
      
 public Place rank(String val) { args.setValString("RANK", val); return this; } 
      
 public Place childid(String val) { args.setValString("CHILDID", val); return this; } 
      
 public Place type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Place nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
  public Place() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.PLACE", args); 
      log.trace(ftValList2String("Place", args));
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
  public Place set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Place place() {
  return new Place();
}


  public static class Unplace {
  private FTValList args = new FTValList();
  private String output;
  public Unplace set(String name, String value) { args.setValString(name,value); return this; }
 public Unplace name(String val) { args.setValString("NAME", val); return this; } 
      
 public Unplace nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
  public Unplace() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.UNPLACE", args); 
      log.trace(ftValList2String("Unplace", args));
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
  public Unplace set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Unplace unplace() {
  return new Unplace();
}


  public static class Unplacedancestor {
  private FTValList args = new FTValList();
  private String output;
  public Unplacedancestor set(String name, String value) { args.setValString(name,value); return this; }
 public Unplacedancestor name(String val) { args.setValString("NAME", val); return this; } 
      
 public Unplacedancestor output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Unplacedancestor() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.UNPLACEDANCESTOR", args); 
      log.trace(ftValList2String("Unplacedancestor", args));
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
  public Unplacedancestor set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Unplacedancestor unplacedancestor() {
  return new Unplacedancestor();
}


  public static class Nodepath {
  private FTValList args = new FTValList();
  private String output;
  public Nodepath set(String name, String value) { args.setValString(name,value); return this; }
 public Nodepath name(String val) { args.setValString("NAME", val); return this; } 
      
 public Nodepath list(String val) { args.setValString("LIST", val); return this; } 
      
  public Nodepath() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.NODEPATH", args); 
      log.trace(ftValList2String("Nodepath", args));
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
  public Nodepath set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Nodepath nodepath() {
  return new Nodepath();
}


  public static class Getpathtoroot {
  private FTValList args = new FTValList();
  private String output;
  public Getpathtoroot set(String name, String value) { args.setValString(name,value); return this; }
 public Getpathtoroot name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getpathtoroot list(String val) { args.setValString("LIST", val); return this; } 
      
  public Getpathtoroot() { }
  public int run(ICS ics) { 
      ics.runTag("SITEPLAN.GETPATHTOROOT", args); 
      log.trace(ftValList2String("Getpathtoroot", args));
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
  public Getpathtoroot set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpathtoroot getpathtoroot() {
  return new Getpathtoroot();
}

}
