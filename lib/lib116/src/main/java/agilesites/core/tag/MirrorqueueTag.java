package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class MirrorqueueTag  {    
  private static Log log = Log.getLog(MirrorqueueTag.class);  
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
      ics.runTag("MIRRORQUEUE.ARGUMENT", args); 
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
      
 public Create session(String val) { args.setValString("SESSION", val); return this; } 
      
 public Create pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
 public Create address(String val) { args.setValString("ADDRESS", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.CREATE", args); 
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


  public static class Cancel {
  private FTValList args = new FTValList();
  private String output;
  public Cancel set(String name, String value) { args.setValString(name,value); return this; }
 public Cancel name(String val) { args.setValString("NAME", val); return this; } 
      
  public Cancel() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.CANCEL", args); 
      log.trace(ftValList2String("Cancel", args));
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
  public Cancel set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cancel cancel() {
  return new Cancel();
}


  public static class Close {
  private FTValList args = new FTValList();
  private String output;
  public Close set(String name, String value) { args.setValString(name,value); return this; }
 public Close name(String val) { args.setValString("NAME", val); return this; } 
      
  public Close() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.CLOSE", args); 
      log.trace(ftValList2String("Close", args));
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
  public Close set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Close close() {
  return new Close();
}


  public static class Sendrow {
  private FTValList args = new FTValList();
  private String output;
  public Sendrow set(String name, String value) { args.setValString(name,value); return this; }
 public Sendrow name(String val) { args.setValString("NAME", val); return this; } 
      
 public Sendrow asset(String val) { args.setValString("ASSET", val); return this; } 
      
 public Sendrow tablename(String val) { args.setValString("TABLENAME", val); return this; } 
      
 public Sendrow objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Sendrow objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Sendrow field1(String val) { args.setValString("FIELD1", val); return this; } 
      
 public Sendrow value1(String val) { args.setValString("VALUE1", val); return this; } 
      
  public Sendrow() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.SENDROW", args); 
      log.trace(ftValList2String("Sendrow", args));
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
  public Sendrow set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sendrow sendrow() {
  return new Sendrow();
}


  public static class Deinstall {
  private FTValList args = new FTValList();
  private String output;
  public Deinstall set(String name, String value) { args.setValString(name,value); return this; }
 public Deinstall arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Deinstall() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.DEINSTALL", args); 
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
      ics.runTag("MIRRORQUEUE.DELETE", args); 
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
      ics.runTag("MIRRORQUEUE.GATHER", args); 
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
      ics.runTag("MIRRORQUEUE.GET", args); 
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
 public Install dir(String val) { args.setValString("DIR", val); return this; } 
      
 public Install acl(String val) { args.setValString("ACL", val); return this; } 
      
 public Install track(String val) { args.setValString("TRACK", val); return this; } 
      
 public Install arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Install() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.INSTALL", args); 
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


  public static class List {
  private FTValList args = new FTValList();
  private String output;
  public List set(String name, String value) { args.setValString(name,value); return this; }
 public List classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public List list(String val) { args.setValString("LIST", val); return this; } 
      
 public List order(String val) { args.setValString("ORDER", val); return this; } 
      
 public List arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.LIST", args); 
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
      
 public Load objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Load objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Load checkout(String val) { args.setValString("CHECKOUT", val); return this; } 
      
 public Load nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
 public Load field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Load value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Load arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.LOAD", args); 
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


  public static class Rollback {
  private FTValList args = new FTValList();
  private String output;
  public Rollback set(String name, String value) { args.setValString(name,value); return this; }
 public Rollback classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Rollback objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Rollback objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Rollback revision(String val) { args.setValString("REVISION", val); return this; } 
      
 public Rollback objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
  public Rollback() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.ROLLBACK", args); 
      log.trace(ftValList2String("Rollback", args));
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
  public Rollback set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Rollback rollback() {
  return new Rollback();
}


  public static class Root {
  private FTValList args = new FTValList();
  private String output;
  public Root set(String name, String value) { args.setValString(name,value); return this; }
 public Root classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Root list(String val) { args.setValString("LIST", val); return this; } 
      
 public Root objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Root objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Root objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Root code(String val) { args.setValString("CODE", val); return this; } 
      
 public Root order(String val) { args.setValString("ORDER", val); return this; } 
      
 public Root arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Root() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.ROOT", args); 
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
      ics.runTag("MIRRORQUEUE.SAVE", args); 
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
      ics.runTag("MIRRORQUEUE.SCATTER", args); 
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
      ics.runTag("MIRRORQUEUE.SET", args); 
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
      ics.runTag("MIRRORQUEUE.SETOBJECT", args); 
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
      ics.runTag("MIRRORQUEUE.SETPARENT", args); 
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
      ics.runTag("MIRRORQUEUE.STREAM", args); 
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


  public static class Undocheckout {
  private FTValList args = new FTValList();
  private String output;
  public Undocheckout set(String name, String value) { args.setValString(name,value); return this; }
 public Undocheckout name(String val) { args.setValString("NAME", val); return this; } 
      
 public Undocheckout revert(String val) { args.setValString("REVERT", val); return this; } 
      
 public Undocheckout flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Undocheckout() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.UNDOCHECKOUT", args); 
      log.trace(ftValList2String("Undocheckout", args));
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
  public Undocheckout set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Undocheckout undocheckout() {
  return new Undocheckout();
}


  public static class Sendassets {
  private FTValList args = new FTValList();
  private String output;
  public Sendassets set(String name, String value) { args.setValString(name,value); return this; }
 public Sendassets name(String val) { args.setValString("NAME", val); return this; } 
      
 public Sendassets type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Sendassets ids(String val) { args.setValString("IDS", val); return this; } 
      
  public Sendassets() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.SENDASSETS", args); 
      log.trace(ftValList2String("Sendassets", args));
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
  public Sendassets set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sendassets sendassets() {
  return new Sendassets();
}


  public static class Sendall {
  private FTValList args = new FTValList();
  private String output;
  public Sendall set(String name, String value) { args.setValString(name,value); return this; }
 public Sendall name(String val) { args.setValString("NAME", val); return this; } 
      
 public Sendall prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Sendall count(String val) { args.setValString("COUNT", val); return this; } 
      
  public Sendall() { }
  public int run(ICS ics) { 
      ics.runTag("MIRRORQUEUE.SENDALL", args); 
      log.trace(ftValList2String("Sendall", args));
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
  public Sendall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sendall sendall() {
  return new Sendall();
}

}
