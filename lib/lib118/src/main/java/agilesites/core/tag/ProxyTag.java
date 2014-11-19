package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class ProxyTag  {    
  private static Log log = Log.getLog(ProxyTag.class);  
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
      ics.runTag("PROXY.ARGUMENT", args); 
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


  public static class Createstore {
  private FTValList args = new FTValList();
  private String output;
  public Createstore set(String name, String value) { args.setValString(name,value); return this; }
 public Createstore store(String val) { args.setValString("STORE", val); return this; } 
      
  public Createstore() { }
  public int run(ICS ics) { 
      ics.runTag("PROXY.CREATESTORE", args); 
      log.trace(ftValList2String("Createstore", args));
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
  public Createstore set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createstore createstore() {
  return new Createstore();
}


  public static class Addstoreitem {
  private FTValList args = new FTValList();
  private String output;
  public Addstoreitem set(String name, String value) { args.setValString(name,value); return this; }
 public Addstoreitem store(String val) { args.setValString("STORE", val); return this; } 
      
 public Addstoreitem type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Addstoreitem id(String val) { args.setValString("ID", val); return this; } 
      
  public Addstoreitem() { }
  public int run(ICS ics) { 
      ics.runTag("PROXY.ADDSTOREITEM", args); 
      log.trace(ftValList2String("Addstoreitem", args));
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
  public Addstoreitem set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addstoreitem addstoreitem() {
  return new Addstoreitem();
}


  public static class Register {
  private FTValList args = new FTValList();
  private String output;
  public Register set(String name, String value) { args.setValString(name,value); return this; }
 public Register externalid(String val) { args.setValString("EXTERNALID", val); return this; } 
      
 public Register type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Register name(String val) { args.setValString("NAME", val); return this; } 
      
 public Register varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Register() { }
  public int run(ICS ics) { 
      ics.runTag("PROXY.REGISTER", args); 
      log.trace(ftValList2String("Register", args));
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
  public Register set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Register register() {
  return new Register();
}


  public static class Tojson {
  private FTValList args = new FTValList();
  private String output;
  public Tojson set(String name, String value) { args.setValString(name,value); return this; }
 public Tojson store(String val) { args.setValString("STORE", val); return this; } 
      
 public Tojson total(String val) { args.setValString("TOTAL", val); return this; } 
      
  public Tojson() { }
  public int run(ICS ics) { 
      ics.runTag("PROXY.TOJSON", args); 
      log.trace(ftValList2String("Tojson", args));
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
  public Tojson set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Tojson tojson() {
  return new Tojson();
}

}
