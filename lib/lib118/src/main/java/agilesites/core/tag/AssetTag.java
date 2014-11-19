package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class AssetTag  {    
  private static Log log = Log.getLog(AssetTag.class);  
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
      ics.runTag("ASSET.ARGUMENT", args); 
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
      ics.runTag("ASSET.CHECKIN", args); 
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
 public Checkout type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Checkout objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Checkout classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Checkout objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
  public Checkout() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CHECKOUT", args); 
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


  public static class Children {
  private FTValList args = new FTValList();
  private String output;
  public Children set(String name, String value) { args.setValString(name,value); return this; }
 public Children list(String val) { args.setValString("LIST", val); return this; } 
      
 public Children name(String val) { args.setValString("NAME", val); return this; } 
      
 public Children type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Children assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Children objecttype(String val) { args.setValString("OBJECTTYPE", val); return this; } 
      
 public Children objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Children objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Children code(String val) { args.setValString("CODE", val); return this; } 
      
 public Children order(String val) { args.setValString("ORDER", val); return this; } 
      
 public Children deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Children() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CHILDREN", args); 
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
      
 public Create type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CREATE", args); 
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
 public Deinstall type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Deinstall() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DEINSTALL", args); 
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
      ics.runTag("ASSET.DELETE", args); 
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
      
 public Gather exclude(String val) { args.setValString("EXCLUDE", val); return this; } 
      
  public Gather() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GATHER", args); 
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
      ics.runTag("ASSET.GET", args); 
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
 public Install type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Install dir(String val) { args.setValString("DIR", val); return this; } 
      
 public Install acl(String val) { args.setValString("ACL", val); return this; } 
      
 public Install track(String val) { args.setValString("TRACK", val); return this; } 
      
  public Install() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.INSTALL", args); 
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
 public List list(String val) { args.setValString("LIST", val); return this; } 
      
 public List type(String val) { args.setValString("TYPE", val); return this; } 
      
 public List order(String val) { args.setValString("ORDER", val); return this; } 
      
 public List pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public List excludevoided(String val) { args.setValString("EXCLUDEVOIDED", val); return this; } 
      
 public List field1(String val) { args.setValString("FIELD1", val); return this; } 
      
 public List value1(String val) { args.setValString("VALUE1", val); return this; } 
      
 public List field2(String val) { args.setValString("FIELD2", val); return this; } 
      
 public List value2(String val) { args.setValString("VALUE2", val); return this; } 
      
 public List field3(String val) { args.setValString("FIELD3", val); return this; } 
      
 public List value3(String val) { args.setValString("VALUE3", val); return this; } 
      
 public List field4(String val) { args.setValString("FIELD4", val); return this; } 
      
 public List value4(String val) { args.setValString("VALUE4", val); return this; } 
      
 public List field5(String val) { args.setValString("FIELD5", val); return this; } 
      
 public List value5(String val) { args.setValString("VALUE5", val); return this; } 
      
 public List field6(String val) { args.setValString("FIELD6", val); return this; } 
      
 public List value6(String val) { args.setValString("VALUE6", val); return this; } 
      
 public List field7(String val) { args.setValString("FIELD7", val); return this; } 
      
 public List value7(String val) { args.setValString("VALUE7", val); return this; } 
      
 public List field8(String val) { args.setValString("FIELD8", val); return this; } 
      
 public List value8(String val) { args.setValString("VALUE8", val); return this; } 
      
 public List field9(String val) { args.setValString("FIELD9", val); return this; } 
      
 public List value9(String val) { args.setValString("VALUE9", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.LIST", args); 
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
      
 public Load type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Load objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Load objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
 public Load checkout(String val) { args.setValString("CHECKOUT", val); return this; } 
      
 public Load nodeid(String val) { args.setValString("NODEID", val); return this; } 
      
 public Load field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Load value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Load deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Load editable(String val) { args.setValString("EDITABLE", val); return this; } 
      
 public Load option(String val) { args.setValString("OPTION", val); return this; } 
      
 public Load flushonvoid(String val) { args.setValString("FLUSHONVOID", val); return this; } 
      
 public Load site(String val) { args.setValString("SITE", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.LOAD", args); 
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
 public Rollback type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Rollback objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Rollback revision(String val) { args.setValString("REVISION", val); return this; } 
      
 public Rollback classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Rollback objectversion(String val) { args.setValString("OBJECTVERSION", val); return this; } 
      
  public Rollback() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ROLLBACK", args); 
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


  public static class Save {
  private FTValList args = new FTValList();
  private String output;
  public Save set(String name, String value) { args.setValString(name,value); return this; }
 public Save name(String val) { args.setValString("NAME", val); return this; } 
      
 public Save flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Save() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SAVE", args); 
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
      
 public Scatter fieldlist(String val) { args.setValString("FIELDLIST", val); return this; } 
      
 public Scatter exclude(String val) { args.setValString("EXCLUDE", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SCATTER", args); 
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
      ics.runTag("ASSET.SET", args); 
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


  public static class Stream {
  private FTValList args = new FTValList();
  private String output;
  public Stream set(String name, String value) { args.setValString(name,value); return this; }
 public Stream name(String val) { args.setValString("NAME", val); return this; } 
      
 public Stream field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Stream resolve(String val) { args.setValString("RESOLVE", val); return this; } 
      
  public Stream() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.STREAM", args); 
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
      ics.runTag("ASSET.UNDOCHECKOUT", args); 
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


  public static class Addchild {
  private FTValList args = new FTValList();
  private String output;
  public Addchild set(String name, String value) { args.setValString(name,value); return this; }
 public Addchild name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addchild type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Addchild childid(String val) { args.setValString("CHILDID", val); return this; } 
      
 public Addchild rank(String val) { args.setValString("RANK", val); return this; } 
      
 public Addchild code(String val) { args.setValString("CODE", val); return this; } 
      
  public Addchild() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ADDCHILD", args); 
      log.trace(ftValList2String("Addchild", args));
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
  public Addchild set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addchild addchild() {
  return new Addchild();
}


  public static class Childgather {
  private FTValList args = new FTValList();
  private String output;
  public Childgather set(String name, String value) { args.setValString(name,value); return this; }
 public Childgather name(String val) { args.setValString("NAME", val); return this; } 
      
 public Childgather prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Childgather codelist(String val) { args.setValString("CODELIST", val); return this; } 
      
  public Childgather() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CHILDGATHER", args); 
      log.trace(ftValList2String("Childgather", args));
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
  public Childgather set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Childgather childgather() {
  return new Childgather();
}


  public static class Getassettype {
  private FTValList args = new FTValList();
  private String output;
  public Getassettype set(String name, String value) { args.setValString(name,value); return this; }
 public Getassettype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassettype outname(String val) { args.setValString("OUTNAME", val); return this; } 
      
  public Getassettype() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETASSETTYPE", args); 
      log.trace(ftValList2String("Getassettype", args));
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
  public Getassettype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassettype getassettype() {
  return new Getassettype();
}


  public static class Getpubdeps {
  private FTValList args = new FTValList();
  private String output;
  public Getpubdeps set(String name, String value) { args.setValString(name,value); return this; }
 public Getpubdeps name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getpubdeps list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getpubdeps depth(String val) { args.setValString("DEPTH", val); return this; } 
      
  public Getpubdeps() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETPUBDEPS", args); 
      log.trace(ftValList2String("Getpubdeps", args));
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
  public Getpubdeps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpubdeps getpubdeps() {
  return new Getpubdeps();
}


  public static class Getsitenode {
  private FTValList args = new FTValList();
  private String output;
  public Getsitenode set(String name, String value) { args.setValString(name,value); return this; }
 public Getsitenode name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsitenode output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getsitenode() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETSITENODE", args); 
      log.trace(ftValList2String("Getsitenode", args));
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
  public Getsitenode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsitenode getsitenode() {
  return new Getsitenode();
}


  public static class Gettemplate {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplate set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettemplate type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Gettemplate template(String val) { args.setValString("TEMPLATE", val); return this; } 
      
 public Gettemplate outname(String val) { args.setValString("OUTNAME", val); return this; } 
      
 public Gettemplate out(String val) { args.setValString("OUT", val); return this; } 
      
  public Gettemplate() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETTEMPLATE", args); 
      log.trace(ftValList2String("Gettemplate", args));
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
  public Gettemplate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplate gettemplate() {
  return new Gettemplate();
}


  public static class Removechildren {
  private FTValList args = new FTValList();
  private String output;
  public Removechildren set(String name, String value) { args.setValString(name,value); return this; }
 public Removechildren name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removechildren type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Removechildren childid(String val) { args.setValString("CHILDID", val); return this; } 
      
 public Removechildren code(String val) { args.setValString("CODE", val); return this; } 
      
  public Removechildren() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVECHILDREN", args); 
      log.trace(ftValList2String("Removechildren", args));
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
  public Removechildren set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removechildren removechildren() {
  return new Removechildren();
}


  public static class Share {
  private FTValList args = new FTValList();
  private String output;
  public Share set(String name, String value) { args.setValString(name,value); return this; }
 public Share name(String val) { args.setValString("NAME", val); return this; } 
      
 public Share publist(String val) { args.setValString("PUBLIST", val); return this; } 
      
  public Share() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SHARE", args); 
      log.trace(ftValList2String("Share", args));
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
  public Share set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Share share() {
  return new Share();
}


  public static class Siteparent {
  private FTValList args = new FTValList();
  private String output;
  public Siteparent set(String name, String value) { args.setValString(name,value); return this; }
 public Siteparent name(String val) { args.setValString("NAME", val); return this; } 
      
 public Siteparent outname(String val) { args.setValString("OUTNAME", val); return this; } 
      
  public Siteparent() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SITEPARENT", args); 
      log.trace(ftValList2String("Siteparent", args));
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
  public Siteparent set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Siteparent siteparent() {
  return new Siteparent();
}


  public static class Void_ {
  private FTValList args = new FTValList();
  private String output;
  public Void_ set(String name, String value) { args.setValString(name,value); return this; }
 public Void_ name(String val) { args.setValString("NAME", val); return this; } 
      
  public Void_() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.VOID_", args); 
      log.trace(ftValList2String("Void_", args));
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
  public Void_ set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Void_ void_() {
  return new Void_();
}


  public static class Getexportfile {
  private FTValList args = new FTValList();
  private String output;
  public Getexportfile set(String name, String value) { args.setValString(name,value); return this; }
 public Getexportfile name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getexportfile outname(String val) { args.setValString("OUTNAME", val); return this; } 
      
 public Getexportfile parent(String val) { args.setValString("PARENT", val); return this; } 
      
 public Getexportfile target(String val) { args.setValString("TARGET", val); return this; } 
      
  public Getexportfile() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETEXPORTFILE", args); 
      log.trace(ftValList2String("Getexportfile", args));
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
  public Getexportfile set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getexportfile getexportfile() {
  return new Getexportfile();
}


  public static class Loadall {
  private FTValList args = new FTValList();
  private String output;
  public Loadall set(String name, String value) { args.setValString(name,value); return this; }
 public Loadall prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Loadall type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Loadall list(String val) { args.setValString("LIST", val); return this; } 
      
 public Loadall ids(String val) { args.setValString("IDS", val); return this; } 
      
 public Loadall idfield(String val) { args.setValString("IDFIELD", val); return this; } 
      
 public Loadall deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Loadall editable(String val) { args.setValString("EDITABLE", val); return this; } 
      
 public Loadall option(String val) { args.setValString("OPTION", val); return this; } 
      
  public Loadall() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.LOADALL", args); 
      log.trace(ftValList2String("Loadall", args));
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
  public Loadall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Loadall loadall() {
  return new Loadall();
}


  public static class Saveall {
  private FTValList args = new FTValList();
  private String output;
  public Saveall set(String name, String value) { args.setValString(name,value); return this; }
 public Saveall prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Saveall type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Saveall() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SAVEALL", args); 
      log.trace(ftValList2String("Saveall", args));
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
  public Saveall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Saveall saveall() {
  return new Saveall();
}


  public static class Referencedby {
  private FTValList args = new FTValList();
  private String output;
  public Referencedby set(String name, String value) { args.setValString(name,value); return this; }
 public Referencedby name(String val) { args.setValString("NAME", val); return this; } 
      
 public Referencedby list(String val) { args.setValString("LIST", val); return this; } 
      
 public Referencedby embeddedreflist(String val) { args.setValString("EMBEDDEDREFLIST", val); return this; } 
      
  public Referencedby() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REFERENCEDBY", args); 
      log.trace(ftValList2String("Referencedby", args));
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
  public Referencedby set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Referencedby referencedby() {
  return new Referencedby();
}


  public static class Childtypes {
  private FTValList args = new FTValList();
  private String output;
  public Childtypes set(String name, String value) { args.setValString(name,value); return this; }
 public Childtypes list(String val) { args.setValString("LIST", val); return this; } 
      
 public Childtypes name(String val) { args.setValString("NAME", val); return this; } 
      
 public Childtypes type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Childtypes objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
  public Childtypes() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CHILDTYPES", args); 
      log.trace(ftValList2String("Childtypes", args));
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
  public Childtypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Childtypes childtypes() {
  return new Childtypes();
}


  public static class Sites {
  private FTValList args = new FTValList();
  private String output;
  public Sites set(String name, String value) { args.setValString(name,value); return this; }
 public Sites list(String val) { args.setValString("LIST", val); return this; } 
      
 public Sites name(String val) { args.setValString("NAME", val); return this; } 
      
 public Sites type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Sites objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Sites pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Sites() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SITES", args); 
      log.trace(ftValList2String("Sites", args));
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
  public Sites set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sites sites() {
  return new Sites();
}


  public static class Canedit {
  private FTValList args = new FTValList();
  private String output;
  public Canedit set(String name, String value) { args.setValString(name,value); return this; }
 public Canedit name(String val) { args.setValString("NAME", val); return this; } 
      
 public Canedit type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Canedit objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
  public Canedit() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CANEDIT", args); 
      log.trace(ftValList2String("Canedit", args));
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
  public Canedit set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Canedit canedit() {
  return new Canedit();
}


  public static class Export {
  private FTValList args = new FTValList();
  private String output;
  public Export set(String name, String value) { args.setValString(name,value); return this; }
 public Export name(String val) { args.setValString("NAME", val); return this; } 
      
 public Export prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Export output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Export file(String val) { args.setValString("FILE", val); return this; } 
      
 public Export subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Export pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public Export writeattrvalue(String val) { args.setValString("WRITEATTRVALUE", val); return this; } 
      
  public Export() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.EXPORT", args); 
      log.trace(ftValList2String("Export", args));
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
  public Export set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Export export() {
  return new Export();
}


  public static class Exportinxsdschema {
  private FTValList args = new FTValList();
  private String output;
  public Exportinxsdschema set(String name, String value) { args.setValString(name,value); return this; }
 public Exportinxsdschema name(String val) { args.setValString("NAME", val); return this; } 
      
 public Exportinxsdschema namespace(String val) { args.setValString("NAMESPACE", val); return this; } 
      
 public Exportinxsdschema prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Exportinxsdschema output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Exportinxsdschema subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Exportinxsdschema pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Exportinxsdschema() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.EXPORTINXSDSCHEMA", args); 
      log.trace(ftValList2String("Exportinxsdschema", args));
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
  public Exportinxsdschema set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Exportinxsdschema exportinxsdschema() {
  return new Exportinxsdschema();
}


  public static class Exportinlists {
  private FTValList args = new FTValList();
  private String output;
  public Exportinlists set(String name, String value) { args.setValString(name,value); return this; }
 public Exportinlists name(String val) { args.setValString("NAME", val); return this; } 
      
 public Exportinlists outlistprefix(String val) { args.setValString("OUTLISTPREFIX", val); return this; } 
      
 public Exportinlists prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Exportinlists subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Exportinlists pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Exportinlists() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.EXPORTINLISTS", args); 
      log.trace(ftValList2String("Exportinlists", args));
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
  public Exportinlists set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Exportinlists exportinlists() {
  return new Exportinlists();
}


  public static class Import_ {
  private FTValList args = new FTValList();
  private String output;
  public Import_ set(String name, String value) { args.setValString(name,value); return this; }
 public Import_ name(String val) { args.setValString("NAME", val); return this; } 
      
 public Import_ prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Import_ xml(String val) { args.setValString("XML", val); return this; } 
      
 public Import_ file(String val) { args.setValString("FILE", val); return this; } 
      
 public Import_ pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public Import_ subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Import_ readattrvalue(String val) { args.setValString("READATTRVALUE", val); return this; } 
      
  public Import_() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.IMPORT_", args); 
      log.trace(ftValList2String("Import_", args));
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
  public Import_ set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Import_ import_() {
  return new Import_();
}


  public static class Getlegalsubtypes {
  private FTValList args = new FTValList();
  private String output;
  public Getlegalsubtypes set(String name, String value) { args.setValString(name,value); return this; }
 public Getlegalsubtypes type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getlegalsubtypes list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getlegalsubtypes pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Getlegalsubtypes() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETLEGALSUBTYPES", args); 
      log.trace(ftValList2String("Getlegalsubtypes", args));
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
  public Getlegalsubtypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlegalsubtypes getlegalsubtypes() {
  return new Getlegalsubtypes();
}


  public static class Getsubtype {
  private FTValList args = new FTValList();
  private String output;
  public Getsubtype set(String name, String value) { args.setValString(name,value); return this; }
 public Getsubtype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsubtype type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getsubtype objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Getsubtype output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getsubtype() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETSUBTYPE", args); 
      log.trace(ftValList2String("Getsubtype", args));
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
  public Getsubtype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsubtype getsubtype() {
  return new Getsubtype();
}


  public static class Setsubtype {
  private FTValList args = new FTValList();
  private String output;
  public Setsubtype set(String name, String value) { args.setValString(name,value); return this; }
 public Setsubtype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsubtype value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setsubtype() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SETSUBTYPE", args); 
      log.trace(ftValList2String("Setsubtype", args));
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
  public Setsubtype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsubtype setsubtype() {
  return new Setsubtype();
}


  public static class Gettemplaterootelement {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplaterootelement set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplaterootelement output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Gettemplaterootelement name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettemplaterootelement type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Gettemplaterootelement template(String val) { args.setValString("TEMPLATE", val); return this; } 
      
  public Gettemplaterootelement() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETTEMPLATEROOTELEMENT", args); 
      log.trace(ftValList2String("Gettemplaterootelement", args));
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
  public Gettemplaterootelement set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplaterootelement gettemplaterootelement() {
  return new Gettemplaterootelement();
}


  public static class Def {
  private FTValList args = new FTValList();
  private String output;
  public Def set(String name, String value) { args.setValString(name,value); return this; }
 public Def list(String val) { args.setValString("LIST", val); return this; } 
      
 public Def type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Def subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Def pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Def() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DEF", args); 
      log.trace(ftValList2String("Def", args));
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
  public Def set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Def def() {
  return new Def();
}


  public static class Search {
  private FTValList args = new FTValList();
  private String output;
  public Search set(String name, String value) { args.setValString(name,value); return this; }
 public Search type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Search list(String val) { args.setValString("LIST", val); return this; } 
      
 public Search prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Search subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Search fieldlist(String val) { args.setValString("FIELDLIST", val); return this; } 
      
 public Search exclude(String val) { args.setValString("EXCLUDE", val); return this; } 
      
 public Search limit(String val) { args.setValString("LIMIT", val); return this; } 
      
 public Search order(String val) { args.setValString("ORDER", val); return this; } 
      
 public Search what(String val) { args.setValString("WHAT", val); return this; } 
      
  public Search() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SEARCH", args); 
      log.trace(ftValList2String("Search", args));
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
  public Search set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Search search() {
  return new Search();
}


  public static class Gettemplatepagename {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplatepagename set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplatepagename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettemplatepagename target(String val) { args.setValString("TARGET", val); return this; } 
      
 public Gettemplatepagename output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Gettemplatepagename site(String val) { args.setValString("SITE", val); return this; } 
      
  public Gettemplatepagename() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETTEMPLATEPAGENAME", args); 
      log.trace(ftValList2String("Gettemplatepagename", args));
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
  public Gettemplatepagename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplatepagename gettemplatepagename() {
  return new Gettemplatepagename();
}


  public static class Gettemplatefortarget {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplatefortarget set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplatefortarget target(String val) { args.setValString("TARGET", val); return this; } 
      
 public Gettemplatefortarget output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Gettemplatefortarget name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettemplatefortarget type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Gettemplatefortarget objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Gettemplatefortarget subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
  public Gettemplatefortarget() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETTEMPLATEFORTARGET", args); 
      log.trace(ftValList2String("Gettemplatefortarget", args));
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
  public Gettemplatefortarget set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplatefortarget gettemplatefortarget() {
  return new Gettemplatefortarget();
}


  public static class Inspect {
  private FTValList args = new FTValList();
  private String output;
  public Inspect set(String name, String value) { args.setValString(name,value); return this; }
 public Inspect list(String val) { args.setValString("LIST", val); return this; } 
      
 public Inspect type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Inspect subtype(String val) { args.setValString("SUBTYPE", val); return this; } 
      
 public Inspect pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Inspect() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.INSPECT", args); 
      log.trace(ftValList2String("Inspect", args));
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
  public Inspect set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Inspect inspect() {
  return new Inspect();
}


  public static class Loadrevision {
  private FTValList args = new FTValList();
  private String output;
  public Loadrevision set(String name, String value) { args.setValString(name,value); return this; }
 public Loadrevision name(String val) { args.setValString("NAME", val); return this; } 
      
 public Loadrevision type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Loadrevision objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Loadrevision revision(String val) { args.setValString("REVISION", val); return this; } 
      
  public Loadrevision() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.LOADREVISION", args); 
      log.trace(ftValList2String("Loadrevision", args));
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
  public Loadrevision set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Loadrevision loadrevision() {
  return new Loadrevision();
}


  public static class Deleterevision {
  private FTValList args = new FTValList();
  private String output;
  public Deleterevision set(String name, String value) { args.setValString(name,value); return this; }
 public Deleterevision type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Deleterevision objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
 public Deleterevision revision(String val) { args.setValString("REVISION", val); return this; } 
      
  public Deleterevision() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DELETEREVISION", args); 
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


  public static class Removeexcessrevisions {
  private FTValList args = new FTValList();
  private String output;
  public Removeexcessrevisions set(String name, String value) { args.setValString(name,value); return this; }
 public Removeexcessrevisions type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Removeexcessrevisions max(String val) { args.setValString("MAX", val); return this; } 
      
  public Removeexcessrevisions() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVEEXCESSREVISIONS", args); 
      log.trace(ftValList2String("Removeexcessrevisions", args));
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
  public Removeexcessrevisions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeexcessrevisions removeexcessrevisions() {
  return new Removeexcessrevisions();
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
      ics.runTag("ASSET.ISEMPTY", args); 
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


  public static class Getassettypeproperties {
  private FTValList args = new FTValList();
  private String output;
  public Getassettypeproperties set(String name, String value) { args.setValString(name,value); return this; }
 public Getassettypeproperties type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Getassettypeproperties() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETASSETTYPEPROPERTIES", args); 
      log.trace(ftValList2String("Getassettypeproperties", args));
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
  public Getassettypeproperties set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassettypeproperties getassettypeproperties() {
  return new Getassettypeproperties();
}


  public static class Cantakeaction {
  private FTValList args = new FTValList();
  private String output;
  public Cantakeaction set(String name, String value) { args.setValString(name,value); return this; }
 public Cantakeaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Cantakeaction varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Cantakeaction actions(String val) { args.setValString("ACTIONS", val); return this; } 
      
 public Cantakeaction field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Cantakeaction memberid(String val) { args.setValString("MEMBERID", val); return this; } 
      
 public Cantakeaction oldmember(String val) { args.setValString("OLDMEMBER", val); return this; } 
      
  public Cantakeaction() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CANTAKEACTION", args); 
      log.trace(ftValList2String("Cantakeaction", args));
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
  public Cantakeaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cantakeaction cantakeaction() {
  return new Cantakeaction();
}


  public static class Cleanup {
  private FTValList args = new FTValList();
  private String output;
  public Cleanup set(String name, String value) { args.setValString(name,value); return this; }
 public Cleanup name(String val) { args.setValString("NAME", val); return this; } 
      
  public Cleanup() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CLEANUP", args); 
      log.trace(ftValList2String("Cleanup", args));
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
  public Cleanup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cleanup cleanup() {
  return new Cleanup();
}


  public static class Reorder {
  private FTValList args = new FTValList();
  private String output;
  public Reorder set(String name, String value) { args.setValString(name,value); return this; }
 public Reorder name(String val) { args.setValString("NAME", val); return this; } 
      
 public Reorder field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Reorder list(String val) { args.setValString("LIST", val); return this; } 
      
  public Reorder() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REORDER", args); 
      log.trace(ftValList2String("Reorder", args));
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
  public Reorder set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Reorder reorder() {
  return new Reorder();
}


  public static class Removemembers {
  private FTValList args = new FTValList();
  private String output;
  public Removemembers set(String name, String value) { args.setValString(name,value); return this; }
 public Removemembers name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removemembers field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Removemembers list(String val) { args.setValString("LIST", val); return this; } 
      
  public Removemembers() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVEMEMBERS", args); 
      log.trace(ftValList2String("Removemembers", args));
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
  public Removemembers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removemembers removemembers() {
  return new Removemembers();
}


  public static class Addmembers {
  private FTValList args = new FTValList();
  private String output;
  public Addmembers set(String name, String value) { args.setValString(name,value); return this; }
 public Addmembers name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addmembers field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Addmembers list(String val) { args.setValString("LIST", val); return this; } 
      
  public Addmembers() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ADDMEMBERS", args); 
      log.trace(ftValList2String("Addmembers", args));
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
  public Addmembers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addmembers addmembers() {
  return new Addmembers();
}


  public static class Changeref {
  private FTValList args = new FTValList();
  private String output;
  public Changeref set(String name, String value) { args.setValString(name,value); return this; }
 public Changeref name(String val) { args.setValString("NAME", val); return this; } 
      
 public Changeref field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Changeref list(String val) { args.setValString("LIST", val); return this; } 
      
  public Changeref() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.CHANGEREF", args); 
      log.trace(ftValList2String("Changeref", args));
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
  public Changeref set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Changeref changeref() {
  return new Changeref();
}


  public static class Legalchildtypes {
  private FTValList args = new FTValList();
  private String output;
  public Legalchildtypes set(String name, String value) { args.setValString(name,value); return this; }
 public Legalchildtypes name(String val) { args.setValString("NAME", val); return this; } 
      
 public Legalchildtypes listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Legalchildtypes field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Legalchildtypes pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Legalchildtypes() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.LEGALCHILDTYPES", args); 
      log.trace(ftValList2String("Legalchildtypes", args));
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
  public Legalchildtypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Legalchildtypes legalchildtypes() {
  return new Legalchildtypes();
}


  public static class Deleteassettype {
  private FTValList args = new FTValList();
  private String output;
  public Deleteassettype set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteassettype type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Deleteassettype() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DELETEASSETTYPE", args); 
      log.trace(ftValList2String("Deleteassettype", args));
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
  public Deleteassettype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteassettype deleteassettype() {
  return new Deleteassettype();
}


  public static class Getassettypedependents {
  private FTValList args = new FTValList();
  private String output;
  public Getassettypedependents set(String name, String value) { args.setValString(name,value); return this; }
 public Getassettypedependents type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getassettypedependents varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassettypedependents() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETASSETTYPEDEPENDENTS", args); 
      log.trace(ftValList2String("Getassettypedependents", args));
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
  public Getassettypedependents set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassettypedependents getassettypedependents() {
  return new Getassettypedependents();
}


  public static class Getassettypesonwhichidepend {
  private FTValList args = new FTValList();
  private String output;
  public Getassettypesonwhichidepend set(String name, String value) { args.setValString(name,value); return this; }
 public Getassettypesonwhichidepend type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getassettypesonwhichidepend varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassettypesonwhichidepend() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETASSETTYPESONWHICHIDEPEND", args); 
      log.trace(ftValList2String("Getassettypesonwhichidepend", args));
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
  public Getassettypesonwhichidepend set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassettypesonwhichidepend getassettypesonwhichidepend() {
  return new Getassettypesonwhichidepend();
}


  public static class Addsite {
  private FTValList args = new FTValList();
  private String output;
  public Addsite set(String name, String value) { args.setValString(name,value); return this; }
 public Addsite name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addsite pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Addsite() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ADDSITE", args); 
      log.trace(ftValList2String("Addsite", args));
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
  public Addsite set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addsite addsite() {
  return new Addsite();
}


  public static class Removesite {
  private FTValList args = new FTValList();
  private String output;
  public Removesite set(String name, String value) { args.setValString(name,value); return this; }
 public Removesite name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removesite pubid(String val) { args.setValString("PUBID", val); return this; } 
      
  public Removesite() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVESITE", args); 
      log.trace(ftValList2String("Removesite", args));
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
  public Removesite set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removesite removesite() {
  return new Removesite();
}


  public static class Deletevoids {
  private FTValList args = new FTValList();
  private String output;
  public Deletevoids set(String name, String value) { args.setValString(name,value); return this; }
 public Deletevoids list(String val) { args.setValString("LIST", val); return this; } 
      
 public Deletevoids excluderevtracked(String val) { args.setValString("EXCLUDEREVTRACKED", val); return this; } 
      
  public Deletevoids() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DELETEVOIDS", args); 
      log.trace(ftValList2String("Deletevoids", args));
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
  public Deletevoids set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletevoids deletevoids() {
  return new Deletevoids();
}


  public static class Track {
  private FTValList args = new FTValList();
  private String output;
  public Track set(String name, String value) { args.setValString(name,value); return this; }
 public Track revisions(String val) { args.setValString("REVISIONS", val); return this; } 
      
 public Track type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Track() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.TRACK", args); 
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


  public static class Untrack {
  private FTValList args = new FTValList();
  private String output;
  public Untrack set(String name, String value) { args.setValString(name,value); return this; }
 public Untrack type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Untrack() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.UNTRACK", args); 
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


  public static class Asset {
  private FTValList args = new FTValList();
  private String output;
  public Asset set(String name, String value) { args.setValString(name,value); return this; }
 public Asset type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Asset assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
  public Asset() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ASSET", args); 
      log.trace(ftValList2String("Asset", args));
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
  public Asset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Asset asset() {
  return new Asset();
}


  public static class Dimensionparentrelationship {
  private FTValList args = new FTValList();
  private String output;
  public Dimensionparentrelationship set(String name, String value) { args.setValString(name,value); return this; }
 public Dimensionparentrelationship type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Dimensionparentrelationship assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Dimensionparentrelationship group(String val) { args.setValString("GROUP", val); return this; } 
      
  public Dimensionparentrelationship() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.DIMENSIONPARENTRELATIONSHIP", args); 
      log.trace(ftValList2String("Dimensionparentrelationship", args));
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
  public Dimensionparentrelationship set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Dimensionparentrelationship dimensionparentrelationship() {
  return new Dimensionparentrelationship();
}


  public static class Setdimensions {
  private FTValList args = new FTValList();
  private String output;
  public Setdimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Setdimensions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Setdimensions() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SETDIMENSIONS", args); 
      log.trace(ftValList2String("Setdimensions", args));
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
  public Setdimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdimensions setdimensions() {
  return new Setdimensions();
}


  public static class Setlocales {
  private FTValList args = new FTValList();
  private String output;
  public Setlocales set(String name, String value) { args.setValString(name,value); return this; }
 public Setlocales name(String val) { args.setValString("NAME", val); return this; } 
      
  public Setlocales() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SETLOCALES", args); 
      log.trace(ftValList2String("Setlocales", args));
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
  public Setlocales set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setlocales setlocales() {
  return new Setlocales();
}


  public static class Adddimension {
  private FTValList args = new FTValList();
  private String output;
  public Adddimension set(String name, String value) { args.setValString(name,value); return this; }
 public Adddimension name(String val) { args.setValString("NAME", val); return this; } 
      
 public Adddimension dimensionid(String val) { args.setValString("DIMENSIONID", val); return this; } 
      
 public Adddimension dimensionname(String val) { args.setValString("DIMENSIONNAME", val); return this; } 
      
  public Adddimension() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ADDDIMENSION", args); 
      log.trace(ftValList2String("Adddimension", args));
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
  public Adddimension set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Adddimension adddimension() {
  return new Adddimension();
}


  public static class Addlocale {
  private FTValList args = new FTValList();
  private String output;
  public Addlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Addlocale name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addlocale dimensionid(String val) { args.setValString("DIMENSIONID", val); return this; } 
      
 public Addlocale dimensionname(String val) { args.setValString("DIMENSIONNAME", val); return this; } 
      
  public Addlocale() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.ADDLOCALE", args); 
      log.trace(ftValList2String("Addlocale", args));
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
  public Addlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addlocale addlocale() {
  return new Addlocale();
}


  public static class Removedimension {
  private FTValList args = new FTValList();
  private String output;
  public Removedimension set(String name, String value) { args.setValString(name,value); return this; }
 public Removedimension name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removedimension dimensionid(String val) { args.setValString("DIMENSIONID", val); return this; } 
      
 public Removedimension dimensionname(String val) { args.setValString("DIMENSIONNAME", val); return this; } 
      
  public Removedimension() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVEDIMENSION", args); 
      log.trace(ftValList2String("Removedimension", args));
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
  public Removedimension set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removedimension removedimension() {
  return new Removedimension();
}


  public static class Removelocale {
  private FTValList args = new FTValList();
  private String output;
  public Removelocale set(String name, String value) { args.setValString(name,value); return this; }
 public Removelocale name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removelocale dimensionid(String val) { args.setValString("DIMENSIONID", val); return this; } 
      
 public Removelocale dimensionname(String val) { args.setValString("DIMENSIONNAME", val); return this; } 
      
  public Removelocale() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVELOCALE", args); 
      log.trace(ftValList2String("Removelocale", args));
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
  public Removelocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removelocale removelocale() {
  return new Removelocale();
}


  public static class Getdimensions {
  private FTValList args = new FTValList();
  private String output;
  public Getdimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Getdimensions list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getdimensions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdimensions type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getdimensions objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
  public Getdimensions() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETDIMENSIONS", args); 
      log.trace(ftValList2String("Getdimensions", args));
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
  public Getdimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdimensions getdimensions() {
  return new Getdimensions();
}


  public static class Getlocales {
  private FTValList args = new FTValList();
  private String output;
  public Getlocales set(String name, String value) { args.setValString(name,value); return this; }
 public Getlocales list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getlocales name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlocales type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getlocales objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
  public Getlocales() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETLOCALES", args); 
      log.trace(ftValList2String("Getlocales", args));
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
  public Getlocales set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlocales getlocales() {
  return new Getlocales();
}


  public static class Getlocale {
  private FTValList args = new FTValList();
  private String output;
  public Getlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Getlocale prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getlocale name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlocale type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Getlocale objectid(String val) { args.setValString("OBJECTID", val); return this; } 
      
  public Getlocale() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETLOCALE", args); 
      log.trace(ftValList2String("Getlocale", args));
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
  public Getlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlocale getlocale() {
  return new Getlocale();
}


  public static class Setdimparents {
  private FTValList args = new FTValList();
  private String output;
  public Setdimparents set(String name, String value) { args.setValString(name,value); return this; }
 public Setdimparents name(String val) { args.setValString("NAME", val); return this; } 
      
  public Setdimparents() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.SETDIMPARENTS", args); 
      log.trace(ftValList2String("Setdimparents", args));
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
  public Setdimparents set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdimparents setdimparents() {
  return new Setdimparents();
}


  public static class Removedimparents {
  private FTValList args = new FTValList();
  private String output;
  public Removedimparents set(String name, String value) { args.setValString(name,value); return this; }
 public Removedimparents name(String val) { args.setValString("NAME", val); return this; } 
      
  public Removedimparents() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.REMOVEDIMPARENTS", args); 
      log.trace(ftValList2String("Removedimparents", args));
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
  public Removedimparents set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removedimparents removedimparents() {
  return new Removedimparents();
}


  public static class Getdimparents {
  private FTValList args = new FTValList();
  private String output;
  public Getdimparents set(String name, String value) { args.setValString(name,value); return this; }
 public Getdimparents name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdimparents list(String val) { args.setValString("LIST", val); return this; } 
      
  public Getdimparents() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETDIMPARENTS", args); 
      log.trace(ftValList2String("Getdimparents", args));
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
  public Getdimparents set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdimparents getdimparents() {
  return new Getdimparents();
}


  public static class Getrelatives {
  private FTValList args = new FTValList();
  private String output;
  public Getrelatives set(String name, String value) { args.setValString(name,value); return this; }
 public Getrelatives name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getrelatives list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getrelatives filter(String val) { args.setValString("FILTER", val); return this; } 
      
  public Getrelatives() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETRELATIVES", args); 
      log.trace(ftValList2String("Getrelatives", args));
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
  public Getrelatives set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getrelatives getrelatives() {
  return new Getrelatives();
}


  public static class Gettranslations {
  private FTValList args = new FTValList();
  private String output;
  public Gettranslations set(String name, String value) { args.setValString(name,value); return this; }
 public Gettranslations name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettranslations list(String val) { args.setValString("LIST", val); return this; } 
      
 public Gettranslations filter(String val) { args.setValString("FILTER", val); return this; } 
      
  public Gettranslations() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.GETTRANSLATIONS", args); 
      log.trace(ftValList2String("Gettranslations", args));
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
  public Gettranslations set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettranslations gettranslations() {
  return new Gettranslations();
}


  public static class Filterassetsbydate {
  private FTValList args = new FTValList();
  private String output;
  public Filterassetsbydate set(String name, String value) { args.setValString(name,value); return this; }
 public Filterassetsbydate inputList(String val) { args.setValString("INPUTLIST", val); return this; } 
      
 public Filterassetsbydate outputList(String val) { args.setValString("OUTPUTLIST", val); return this; } 
      
 public Filterassetsbydate date(String val) { args.setValString("DATE", val); return this; } 
      
 public Filterassetsbydate logdependency(String val) { args.setValString("LOGDEPENDENCY", val); return this; } 
      
 public Filterassetsbydate deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Filterassetsbydate() { }
  public int run(ICS ics) { 
      ics.runTag("ASSET.FILTERASSETSBYDATE", args); 
      log.trace(ftValList2String("Filterassetsbydate", args));
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
  public Filterassetsbydate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Filterassetsbydate filterassetsbydate() {
  return new Filterassetsbydate();
}

}
