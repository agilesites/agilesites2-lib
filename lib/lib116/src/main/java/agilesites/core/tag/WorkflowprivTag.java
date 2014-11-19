package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowprivTag  {    
  private static Log log = Log.getLog(WorkflowprivTag.class);  
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
    
 
  public static class Scatter {
  private FTValList args = new FTValList();
  private String output;
  public Scatter set(String name, String value) { args.setValString(name,value); return this; }
 public Scatter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Scatter prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.SCATTER", args); 
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


  public static class Gather {
  private FTValList args = new FTValList();
  private String output;
  public Gather set(String name, String value) { args.setValString(name,value); return this; }
 public Gather name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gather prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Gather() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.GATHER", args); 
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


  public static class Getfunctionid {
  private FTValList args = new FTValList();
  private String output;
  public Getfunctionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getfunctionid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getfunctionid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getfunctionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.GETFUNCTIONID", args); 
      log.trace(ftValList2String("Getfunctionid", args));
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
  public Getfunctionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfunctionid getfunctionid() {
  return new Getfunctionid();
}


  public static class Setfunctionid {
  private FTValList args = new FTValList();
  private String output;
  public Setfunctionid set(String name, String value) { args.setValString(name,value); return this; }
 public Setfunctionid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setfunctionid value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setfunctionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.SETFUNCTIONID", args); 
      log.trace(ftValList2String("Setfunctionid", args));
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
  public Setfunctionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setfunctionid setfunctionid() {
  return new Setfunctionid();
}


  public static class Getstateid {
  private FTValList args = new FTValList();
  private String output;
  public Getstateid set(String name, String value) { args.setValString(name,value); return this; }
 public Getstateid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstateid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.GETSTATEID", args); 
      log.trace(ftValList2String("Getstateid", args));
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
  public Getstateid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstateid getstateid() {
  return new Getstateid();
}


  public static class Setstateid {
  private FTValList args = new FTValList();
  private String output;
  public Setstateid set(String name, String value) { args.setValString(name,value); return this; }
 public Setstateid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setstateid value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setstateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.SETSTATEID", args); 
      log.trace(ftValList2String("Setstateid", args));
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
  public Setstateid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstateid setstateid() {
  return new Setstateid();
}


  public static class Getrole {
  private FTValList args = new FTValList();
  private String output;
  public Getrole set(String name, String value) { args.setValString(name,value); return this; }
 public Getrole name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getrole varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getrole() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.GETROLE", args); 
      log.trace(ftValList2String("Getrole", args));
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
  public Getrole set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getrole getrole() {
  return new Getrole();
}


  public static class Setrole {
  private FTValList args = new FTValList();
  private String output;
  public Setrole set(String name, String value) { args.setValString(name,value); return this; }
 public Setrole name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setrole role(String val) { args.setValString("ROLE", val); return this; } 
      
  public Setrole() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.SETROLE", args); 
      log.trace(ftValList2String("Setrole", args));
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
  public Setrole set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setrole setrole() {
  return new Setrole();
}


  public static class Getallowed {
  private FTValList args = new FTValList();
  private String output;
  public Getallowed set(String name, String value) { args.setValString(name,value); return this; }
 public Getallowed name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallowed varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getallowed() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.GETALLOWED", args); 
      log.trace(ftValList2String("Getallowed", args));
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
  public Getallowed set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallowed getallowed() {
  return new Getallowed();
}


  public static class Setallowed {
  private FTValList args = new FTValList();
  private String output;
  public Setallowed set(String name, String value) { args.setValString(name,value); return this; }
 public Setallowed name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setallowed allowed(String val) { args.setValString("ALLOWED", val); return this; } 
      
  public Setallowed() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIV.SETALLOWED", args); 
      log.trace(ftValList2String("Setallowed", args));
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
  public Setallowed set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setallowed setallowed() {
  return new Setallowed();
}

}
