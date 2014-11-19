package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DirTag  {    
  private static Log log = Log.getLog(DirTag.class);  
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
    
 
  public static class Addattrs {
  private FTValList args = new FTValList();
  private String output;
  public Addattrs set(String name, String value) { args.setValString(name,value); return this; }
 public Addattrs name(String val) { args.setValString("NAME", val); return this; } 
      
  public Addattrs() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.ADDATTRS", args); 
      log.trace(ftValList2String("Addattrs", args));
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
  public Addattrs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addattrs addattrs() {
  return new Addattrs();
}


  public static class Addgroupmember {
  private FTValList args = new FTValList();
  private String output;
  public Addgroupmember set(String name, String value) { args.setValString(name,value); return this; }
 public Addgroupmember name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addgroupmember member(String val) { args.setValString("MEMBER", val); return this; } 
      
  public Addgroupmember() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.ADDGROUPMEMBER", args); 
      log.trace(ftValList2String("Addgroupmember", args));
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
  public Addgroupmember set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addgroupmember addgroupmember() {
  return new Addgroupmember();
}


  public static class Argument {
  private FTValList args = new FTValList();
  private String output;
  public Argument set(String name, String value) { args.setValString(name,value); return this; }
 public Argument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Argument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Argument() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.ARGUMENT", args); 
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
      
  public Children() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.CHILDREN", args); 
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
      
 public Create defaults(String val) { args.setValString("DEFAULTS", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.CREATE", args); 
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
      ics.runTag("DIR.DELETE", args); 
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


  public static class Getattrs {
  private FTValList args = new FTValList();
  private String output;
  public Getattrs set(String name, String value) { args.setValString(name,value); return this; }
 public Getattrs list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getattrs name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getattrs attrs(String val) { args.setValString("ATTRS", val); return this; } 
      
  public Getattrs() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.GETATTRS", args); 
      log.trace(ftValList2String("Getattrs", args));
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
  public Getattrs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getattrs getattrs() {
  return new Getattrs();
}


  public static class Groupmembers {
  private FTValList args = new FTValList();
  private String output;
  public Groupmembers set(String name, String value) { args.setValString(name,value); return this; }
 public Groupmembers name(String val) { args.setValString("NAME", val); return this; } 
      
 public Groupmembers list(String val) { args.setValString("LIST", val); return this; } 
      
  public Groupmembers() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.GROUPMEMBERS", args); 
      log.trace(ftValList2String("Groupmembers", args));
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
  public Groupmembers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Groupmembers groupmembers() {
  return new Groupmembers();
}


  public static class Groupmemberships {
  private FTValList args = new FTValList();
  private String output;
  public Groupmemberships set(String name, String value) { args.setValString(name,value); return this; }
 public Groupmemberships name(String val) { args.setValString("NAME", val); return this; } 
      
 public Groupmemberships list(String val) { args.setValString("LIST", val); return this; } 
      
  public Groupmemberships() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.GROUPMEMBERSHIPS", args); 
      log.trace(ftValList2String("Groupmemberships", args));
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
  public Groupmemberships set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Groupmemberships groupmemberships() {
  return new Groupmemberships();
}


  public static class Listusers {
  private FTValList args = new FTValList();
  private String output;
  public Listusers set(String name, String value) { args.setValString(name,value); return this; }
 public Listusers list(String val) { args.setValString("LIST", val); return this; } 
      
 public Listusers commonancestor(String val) { args.setValString("COMMONANCESTOR", val); return this; } 
      
  public Listusers() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.LISTUSERS", args); 
      log.trace(ftValList2String("Listusers", args));
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
  public Listusers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Listusers listusers() {
  return new Listusers();
}


  public static class Removeattrs {
  private FTValList args = new FTValList();
  private String output;
  public Removeattrs set(String name, String value) { args.setValString(name,value); return this; }
 public Removeattrs name(String val) { args.setValString("NAME", val); return this; } 
      
  public Removeattrs() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.REMOVEATTRS", args); 
      log.trace(ftValList2String("Removeattrs", args));
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
  public Removeattrs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeattrs removeattrs() {
  return new Removeattrs();
}


  public static class Removegroupmember {
  private FTValList args = new FTValList();
  private String output;
  public Removegroupmember set(String name, String value) { args.setValString(name,value); return this; }
 public Removegroupmember name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removegroupmember member(String val) { args.setValString("MEMBER", val); return this; } 
      
  public Removegroupmember() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.REMOVEGROUPMEMBER", args); 
      log.trace(ftValList2String("Removegroupmember", args));
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
  public Removegroupmember set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removegroupmember removegroupmember() {
  return new Removegroupmember();
}


  public static class Replaceattrs {
  private FTValList args = new FTValList();
  private String output;
  public Replaceattrs set(String name, String value) { args.setValString(name,value); return this; }
 public Replaceattrs name(String val) { args.setValString("NAME", val); return this; } 
      
  public Replaceattrs() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.REPLACEATTRS", args); 
      log.trace(ftValList2String("Replaceattrs", args));
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
  public Replaceattrs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Replaceattrs replaceattrs() {
  return new Replaceattrs();
}


  public static class Search {
  private FTValList args = new FTValList();
  private String output;
  public Search set(String name, String value) { args.setValString(name,value); return this; }
 public Search list(String val) { args.setValString("LIST", val); return this; } 
      
 public Search context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Search operator(String val) { args.setValString("OPERATOR", val); return this; } 
      
  public Search() { }
  public int run(ICS ics) { 
      ics.runTag("DIR.SEARCH", args); 
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

}
