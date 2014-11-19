package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class ObjectTag  {    
  private static Log log = Log.getLog(ObjectTag.class);  
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
      ics.runTag("OBJECT.ARGUMENT", args); 
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


  public static class Checkin {
  private FTValList args = new FTValList();
  private String output;
  public Checkin set(String name, String value) { args.setValString(name,value); return this; }
 public Checkin name(String val) { args.setValString("NAME", val); return this; } 
      
 public Checkin annotation(String val) { args.setValString("ANNOTATION", val); return this; } 
      
 public Checkin checkout(String val) { args.setValString("CHECKOUT", val); return this; } 
      
 public Checkin flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Checkin() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.CHECKIN", args); 
      log.trace(ftValList2String("Checkin", args));
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
  public Checkin set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkin checkin() {
  return new Checkin();
}


  public static class Checkout {
  private FTValList args = new FTValList();
  private String output;
  public Checkout set(String name, String value) { args.setValString(name,value); return this; }
 public Checkout classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Checkout objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Checkout objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Checkout objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
  public Checkout() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.CHECKOUT", args); 
      log.trace(ftValList2String("Checkout", args));
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
  public Checkout set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkout checkout() {
  return new Checkout();
}


  public static class Deleterevision {
  private FTValList args = new FTValList();
  private String output;
  public Deleterevision set(String name, String value) { args.setValString(name,value); return this; }
 public Deleterevision classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Deleterevision objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Deleterevision objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Deleterevision objectrevision(String val) { args.setValString("OBJECTREVISION", val); return this; } 
      
  public Deleterevision() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.DELETEREVISION", args); 
      log.trace(ftValList2String("Deleterevision", args));
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
  public Deleterevision set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleterevision deleterevision() {
  return new Deleterevision();
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
      ics.runTag("OBJECT.CHILDREN", args); 
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
 public Create classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create arg1(String val) { args.setValString("ARG1", val); return this; } 
      
 public Create arg2(String val) { args.setValString("ARG2", val); return this; } 
      
 public Create allocate(String val) { args.setValString("ALLOCATE", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.CREATE", args); 
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
 public Deinstall classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Deinstall arg1(String val) { args.setValString("ARG1", val); return this; } 
      
 public Deinstall arg2(String val) { args.setValString("ARG2", val); return this; } 
      
  public Deinstall() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.DEINSTALL", args); 
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
      
 public Delete flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Delete() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.DELETE", args); 
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
      ics.runTag("OBJECT.GATHER", args); 
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
      ics.runTag("OBJECT.GET", args); 
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
 public Install classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Install dir(String val) { args.setValString("DIR", val); return this; } 
      
 public Install acl(String val) { args.setValString("ACL", val); return this; } 
      
 public Install track(String val) { args.setValString("TRACK", val); return this; } 
      
 public Install arg1(String val) { args.setValString("ARG1", val); return this; } 
      
 public Install arg2(String val) { args.setValString("ARG2", val); return this; } 
      
  public Install() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.INSTALL", args); 
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


  public static class Isempty {
  private FTValList args = new FTValList();
  private String output;
  public Isempty set(String name, String value) { args.setValString(name,value); return this; }
 public Isempty name(String val) { args.setValString("NAME", val); return this; } 
      
 public Isempty field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Isempty output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Isempty() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.ISEMPTY", args); 
      log.trace(ftValList2String("Isempty", args));
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
  public Isempty set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isempty isempty() {
  return new Isempty();
}


  public static class List {
  private FTValList args = new FTValList();
  private String output;
  public List set(String name, String value) { args.setValString(name,value); return this; }
 public List classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public List list(String val) { args.setValString("LIST", val); return this; } 
      
 public List order(String val) { args.setValString("ORDER", val); return this; } 
      
 public List arg1(String val) { args.setValString("ARG1", val); return this; } 
      
 public List arg2(String val) { args.setValString("ARG2", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.LIST", args); 
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
 public Load classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Load name(String val) { args.setValString("NAME", val); return this; } 
      
 public Load objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Load objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Load checkout(String val) { args.setValString("CHECKOUT", val); return this; } 
      
 public Load lazy(String val) { args.setValString("LAZY", val); return this; } 
      
 public Load nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
 public Load field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Load value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Load list(String val) { args.setValString("LIST", val); return this; } 
      
 public Load arg1(String val) { args.setValString("ARG1", val); return this; } 
      
 public Load arg2(String val) { args.setValString("ARG2", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.LOAD", args); 
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
      ics.runTag("OBJECT.ROLLBACK", args); 
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
      ics.runTag("OBJECT.ROOT", args); 
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
      ics.runTag("OBJECT.SAVE", args); 
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
      ics.runTag("OBJECT.SCATTER", args); 
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
      ics.runTag("OBJECT.SET", args); 
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
      ics.runTag("OBJECT.SETOBJECT", args); 
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
      ics.runTag("OBJECT.SETPARENT", args); 
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
      ics.runTag("OBJECT.STREAM", args); 
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


  public static class Track {
  private FTValList args = new FTValList();
  private String output;
  public Track set(String name, String value) { args.setValString(name,value); return this; }
 public Track classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Track revisions(String val) { args.setValString("REVISIONS", val); return this; } 
      
 public Track dir(String val) { args.setValString("DIR", val); return this; } 
      
 public Track arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Track() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.TRACK", args); 
      log.trace(ftValList2String("Track", args));
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
  public Track set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Track track() {
  return new Track();
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
      ics.runTag("OBJECT.UNDOCHECKOUT", args); 
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


  public static class Untrack {
  private FTValList args = new FTValList();
  private String output;
  public Untrack set(String name, String value) { args.setValString(name,value); return this; }
 public Untrack classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Untrack arg1(String val) { args.setValString("ARG1", val); return this; } 
      
  public Untrack() { }
  public int run(ICS ics) { 
      ics.runTag("OBJECT.UNTRACK", args); 
      log.trace(ftValList2String("Untrack", args));
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
  public Untrack set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Untrack untrack() {
  return new Untrack();
}

}
