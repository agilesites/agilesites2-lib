package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CsmacTag  {    
  private static Log log = Log.getLog(CsmacTag.class);  
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
      ics.runTag("CSMAC.ARGUMENT", args); 
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


  public static class Cookievalue {
  private FTValList args = new FTValList();
  private String output;
  public Cookievalue set(String name, String value) { args.setValString(name,value); return this; }
 public Cookievalue userid(String val) { args.setValString("USERID", val); return this; } 
      
 public Cookievalue storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Cookievalue varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Cookievalue seconds(String val) { args.setValString("SECONDS", val); return this; } 
      
  public Cookievalue() { }
  public int run(ICS ics) { 
      ics.runTag("CSMAC.COOKIEVALUE", args); 
      log.trace(ftValList2String("Cookievalue", args));
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
  public Cookievalue set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cookievalue cookievalue() {
  return new Cookievalue();
}


  public static class Payload {
  private FTValList args = new FTValList();
  private String output;
  public Payload set(String name, String value) { args.setValString(name,value); return this; }
 public Payload varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Payload storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Payload value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Payload() { }
  public int run(ICS ics) { 
      ics.runTag("CSMAC.PAYLOAD", args); 
      log.trace(ftValList2String("Payload", args));
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
  public Payload set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Payload payload() {
  return new Payload();
}


  public static class String_ {
  private FTValList args = new FTValList();
  private String output;
  public String_ set(String name, String value) { args.setValString(name,value); return this; }
 public String_ varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public String_ storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public String_ value(String val) { args.setValString("VALUE", val); return this; } 
      
  public String_() { }
  public int run(ICS ics) { 
      ics.runTag("CSMAC.STRING_", args); 
      log.trace(ftValList2String("String_", args));
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
  public String_ set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static String_ string_() {
  return new String_();
}


  public static class Transactserver {
  private FTValList args = new FTValList();
  private String output;
  public Transactserver set(String name, String value) { args.setValString(name,value); return this; }
 public Transactserver varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Transactserver protocol(String val) { args.setValString("PROTOCOL", val); return this; } 
      
  public Transactserver() { }
  public int run(ICS ics) { 
      ics.runTag("CSMAC.TRANSACTSERVER", args); 
      log.trace(ftValList2String("Transactserver", args));
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
  public Transactserver set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Transactserver transactserver() {
  return new Transactserver();
}

}
