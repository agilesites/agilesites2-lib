package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DeviceTag  {    
  private static Log log = Log.getLog(DeviceTag.class);  
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
    
 
  public static class Load {
  private FTValList args = new FTValList();
  private String output;
  public Load set(String name, String value) { args.setValString(name,value); return this; }
 public Load name(String val) { args.setValString("NAME", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("DEVICE.LOAD", args); 
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


  public static class Hascapability {
  private FTValList args = new FTValList();
  private String output;
  public Hascapability set(String name, String value) { args.setValString(name,value); return this; }
 public Hascapability name(String val) { args.setValString("NAME", val); return this; } 
      
 public Hascapability capability(String val) { args.setValString("CAPABILITY", val); return this; } 
      
  public Hascapability() { }
  public int run(ICS ics) { 
      ics.runTag("DEVICE.HASCAPABILITY", args); 
      log.trace(ftValList2String("Hascapability", args));
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
  public Hascapability set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Hascapability hascapability() {
  return new Hascapability();
}


  public static class Capability {
  private FTValList args = new FTValList();
  private String output;
  public Capability set(String name, String value) { args.setValString(name,value); return this; }
 public Capability name(String val) { args.setValString("NAME", val); return this; } 
      
 public Capability capability(String val) { args.setValString("CAPABILITY", val); return this; } 
      
 public Capability output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Capability() { }
  public int run(ICS ics) { 
      ics.runTag("DEVICE.CAPABILITY", args); 
      log.trace(ftValList2String("Capability", args));
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
  public Capability set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Capability capability() {
  return new Capability();
}


  public static class Get {
  private FTValList args = new FTValList();
  private String output;
  public Get set(String name, String value) { args.setValString(name,value); return this; }
 public Get name(String val) { args.setValString("NAME", val); return this; } 
      
 public Get property(String val) { args.setValString("PROPERTY", val); return this; } 
      
 public Get output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Get() { }
  public int run(ICS ics) { 
      ics.runTag("DEVICE.GET", args); 
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


  public static class Siteplan {
  private FTValList args = new FTValList();
  private String output;
  public Siteplan set(String name, String value) { args.setValString(name,value); return this; }
 public Siteplan output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Siteplan d(String val) { args.setValString("D", val); return this; } 
      
 public Siteplan pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public Siteplan site(String val) { args.setValString("SITE", val); return this; } 
      
  public Siteplan() { }
  public int run(ICS ics) { 
      ics.runTag("DEVICE.SITEPLAN", args); 
      log.trace(ftValList2String("Siteplan", args));
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
  public Siteplan set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Siteplan siteplan() {
  return new Siteplan();
}

}
