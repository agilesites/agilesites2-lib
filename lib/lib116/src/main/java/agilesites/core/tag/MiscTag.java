package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class MiscTag  {    
  private static Log log = Log.getLog(MiscTag.class);  
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
      ics.runTag("MISC.ARGUMENT", args); 
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


  public static class Getlistcolumnnames {
  private FTValList args = new FTValList();
  private String output;
  public Getlistcolumnnames set(String name, String value) { args.setValString(name,value); return this; }
 public Getlistcolumnnames list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getlistcolumnnames listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getlistcolumnnames() { }
  public int run(ICS ics) { 
      ics.runTag("MISC.GETLISTCOLUMNNAMES", args); 
      log.trace(ftValList2String("Getlistcolumnnames", args));
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
  public Getlistcolumnnames set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlistcolumnnames getlistcolumnnames() {
  return new Getlistcolumnnames();
}


  public static class Checkobjectexists {
  private FTValList args = new FTValList();
  private String output;
  public Checkobjectexists set(String name, String value) { args.setValString(name,value); return this; }
 public Checkobjectexists name(String val) { args.setValString("NAME", val); return this; } 
      
 public Checkobjectexists varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkobjectexists() { }
  public int run(ICS ics) { 
      ics.runTag("MISC.CHECKOBJECTEXISTS", args); 
      log.trace(ftValList2String("Checkobjectexists", args));
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
  public Checkobjectexists set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkobjectexists checkobjectexists() {
  return new Checkobjectexists();
}


  public static class Base64encode {
  private FTValList args = new FTValList();
  private String output;
  public Base64encode set(String name, String value) { args.setValString(name,value); return this; }
 public Base64encode list(String val) { args.setValString("LIST", val); return this; } 
      
 public Base64encode column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Base64encode varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Base64encode() { }
  public int run(ICS ics) { 
      ics.runTag("MISC.BASE64ENCODE", args); 
      log.trace(ftValList2String("Base64encode", args));
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
  public Base64encode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Base64encode base64encode() {
  return new Base64encode();
}


  public static class Listtoxml {
  private FTValList args = new FTValList();
  private String output;
  public Listtoxml set(String name, String value) { args.setValString(name,value); return this; }
 public Listtoxml list(String val) { args.setValString("LIST", val); return this; } 
      
 public Listtoxml namespace(String val) { args.setValString("NAMESPACE", val); return this; } 
      
 public Listtoxml varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Listtoxml() { }
  public int run(ICS ics) { 
      ics.runTag("MISC.LISTTOXML", args); 
      log.trace(ftValList2String("Listtoxml", args));
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
  public Listtoxml set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Listtoxml listtoxml() {
  return new Listtoxml();
}


  public static class Callmain {
  private FTValList args = new FTValList();
  private String output;
  public Callmain set(String name, String value) { args.setValString(name,value); return this; }
 public Callmain classname(String val) { args.setValString("CLASSNAME", val); return this; } 
      
 public Callmain args(String val) { args.setValString("ARGS", val); return this; } 
      
  public Callmain() { }
  public int run(ICS ics) { 
      ics.runTag("MISC.CALLMAIN", args); 
      log.trace(ftValList2String("Callmain", args));
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
  public Callmain set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Callmain callmain() {
  return new Callmain();
}

}
