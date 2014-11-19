package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class HashTag  {    
  private static Log log = Log.getLog(HashTag.class);  
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
      ics.runTag("HASH.ARGUMENT", args); 
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
      
 public Create list(String val) { args.setValString("LIST", val); return this; } 
      
 public Create column(String val) { args.setValString("COLUMN", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("HASH.CREATE", args); 
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


  public static class Add {
  private FTValList args = new FTValList();
  private String output;
  public Add set(String name, String value) { args.setValString(name,value); return this; }
 public Add name(String val) { args.setValString("NAME", val); return this; } 
      
 public Add value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Add() { }
  public int run(ICS ics) { 
      ics.runTag("HASH.ADD", args); 
      log.trace(ftValList2String("Add", args));
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
  public Add set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Add add() {
  return new Add();
}


  public static class Contains {
  private FTValList args = new FTValList();
  private String output;
  public Contains set(String name, String value) { args.setValString(name,value); return this; }
 public Contains name(String val) { args.setValString("NAME", val); return this; } 
      
 public Contains value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Contains varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Contains() { }
  public int run(ICS ics) { 
      ics.runTag("HASH.CONTAINS", args); 
      log.trace(ftValList2String("Contains", args));
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
  public Contains set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Contains contains() {
  return new Contains();
}


  public static class Tostring {
  private FTValList args = new FTValList();
  private String output;
  public Tostring set(String name, String value) { args.setValString(name,value); return this; }
 public Tostring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Tostring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Tostring delim(String val) { args.setValString("DELIM", val); return this; } 
      
  public Tostring() { }
  public int run(ICS ics) { 
      ics.runTag("HASH.TOSTRING", args); 
      log.trace(ftValList2String("Tostring", args));
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
  public Tostring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Tostring tostring() {
  return new Tostring();
}


  public static class Hasdata {
  private FTValList args = new FTValList();
  private String output;
  public Hasdata set(String name, String value) { args.setValString(name,value); return this; }
 public Hasdata varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Hasdata name(String val) { args.setValString("NAME", val); return this; } 
      
  public Hasdata() { }
  public int run(ICS ics) { 
      ics.runTag("HASH.HASDATA", args); 
      log.trace(ftValList2String("Hasdata", args));
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
  public Hasdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Hasdata hasdata() {
  return new Hasdata();
}

}
