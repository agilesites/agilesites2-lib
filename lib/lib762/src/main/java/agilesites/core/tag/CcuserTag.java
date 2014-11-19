package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CcuserTag  {    
  private static Log log = Log.getLog(CcuserTag.class);  
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
    
 
  public static class Getid {
  private FTValList args = new FTValList();
  private String output;
  public Getid set(String name, String value) { args.setValString(name,value); return this; }
 public Getid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getid() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETID", args); 
      log.trace(ftValList2String("Getid", args));
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
  public Getid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getid getid() {
  return new Getid();
}


  public static class Getname {
  private FTValList args = new FTValList();
  private String output;
  public Getname set(String name, String value) { args.setValString(name,value); return this; }
 public Getname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getname varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getname() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETNAME", args); 
      log.trace(ftValList2String("Getname", args));
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
  public Getname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getname getname() {
  return new Getname();
}


  public static class Setname {
  private FTValList args = new FTValList();
  private String output;
  public Setname set(String name, String value) { args.setValString(name,value); return this; }
 public Setname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setname value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setname() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.SETNAME", args); 
      log.trace(ftValList2String("Setname", args));
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
  public Setname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setname setname() {
  return new Setname();
}


  public static class Getdisplayablename {
  private FTValList args = new FTValList();
  private String output;
  public Getdisplayablename set(String name, String value) { args.setValString(name,value); return this; }
 public Getdisplayablename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdisplayablename varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdisplayablename() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETDISPLAYABLENAME", args); 
      log.trace(ftValList2String("Getdisplayablename", args));
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
  public Getdisplayablename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdisplayablename getdisplayablename() {
  return new Getdisplayablename();
}


  public static class Setdisplayablename {
  private FTValList args = new FTValList();
  private String output;
  public Setdisplayablename set(String name, String value) { args.setValString(name,value); return this; }
 public Setdisplayablename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdisplayablename value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setdisplayablename() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.SETDISPLAYABLENAME", args); 
      log.trace(ftValList2String("Setdisplayablename", args));
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
  public Setdisplayablename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdisplayablename setdisplayablename() {
  return new Setdisplayablename();
}


  public static class Getemail {
  private FTValList args = new FTValList();
  private String output;
  public Getemail set(String name, String value) { args.setValString(name,value); return this; }
 public Getemail name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getemail varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getemail() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETEMAIL", args); 
      log.trace(ftValList2String("Getemail", args));
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
  public Getemail set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getemail getemail() {
  return new Getemail();
}


  public static class Setemail {
  private FTValList args = new FTValList();
  private String output;
  public Setemail set(String name, String value) { args.setValString(name,value); return this; }
 public Setemail name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setemail value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setemail() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.SETEMAIL", args); 
      log.trace(ftValList2String("Setemail", args));
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
  public Setemail set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setemail setemail() {
  return new Setemail();
}


  public static class Getlocale {
  private FTValList args = new FTValList();
  private String output;
  public Getlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Getlocale name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlocale varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getlocale() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETLOCALE", args); 
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


  public static class Setlocale {
  private FTValList args = new FTValList();
  private String output;
  public Setlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Setlocale name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setlocale value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setlocale() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.SETLOCALE", args); 
      log.trace(ftValList2String("Setlocale", args));
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
  public Setlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setlocale setlocale() {
  return new Setlocale();
}


  public static class Getsiteroles {
  private FTValList args = new FTValList();
  private String output;
  public Getsiteroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getsiteroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsiteroles site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getsiteroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getsiteroles() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETSITEROLES", args); 
      log.trace(ftValList2String("Getsiteroles", args));
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
  public Getsiteroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsiteroles getsiteroles() {
  return new Getsiteroles();
}


  public static class Setsiteroles {
  private FTValList args = new FTValList();
  private String output;
  public Setsiteroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setsiteroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsiteroles site(String val) { args.setValString("SITE", val); return this; } 
      
 public Setsiteroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setsiteroles() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.SETSITEROLES", args); 
      log.trace(ftValList2String("Setsiteroles", args));
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
  public Setsiteroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsiteroles setsiteroles() {
  return new Setsiteroles();
}


  public static class Getsites {
  private FTValList args = new FTValList();
  private String output;
  public Getsites set(String name, String value) { args.setValString(name,value); return this; }
 public Getsites name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsites objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getsites() { }
  public int run(ICS ics) { 
      ics.runTag("CCUSER.GETSITES", args); 
      log.trace(ftValList2String("Getsites", args));
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
  public Getsites set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsites getsites() {
  return new Getsites();
}

}
