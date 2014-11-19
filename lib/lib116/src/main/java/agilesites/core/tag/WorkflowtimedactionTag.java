package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowtimedactionTag  {    
  private static Log log = Log.getLog(WorkflowtimedactionTag.class);  
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
      ics.runTag("WORKFLOWTIMEDACTION.SCATTER", args); 
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
      ics.runTag("WORKFLOWTIMEDACTION.GATHER", args); 
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


  public static class Getassignmentaction {
  private FTValList args = new FTValList();
  private String output;
  public Getassignmentaction set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignmentaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassignmentaction varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassignmentaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTION.GETASSIGNMENTACTION", args); 
      log.trace(ftValList2String("Getassignmentaction", args));
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
  public Getassignmentaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignmentaction getassignmentaction() {
  return new Getassignmentaction();
}


  public static class Setassignmentaction {
  private FTValList args = new FTValList();
  private String output;
  public Setassignmentaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setassignmentaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setassignmentaction value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setassignmentaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTION.SETASSIGNMENTACTION", args); 
      log.trace(ftValList2String("Setassignmentaction", args));
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
  public Setassignmentaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setassignmentaction setassignmentaction() {
  return new Setassignmentaction();
}


  public static class Getrelativetime {
  private FTValList args = new FTValList();
  private String output;
  public Getrelativetime set(String name, String value) { args.setValString(name,value); return this; }
 public Getrelativetime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getrelativetime varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getrelativetime() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTION.GETRELATIVETIME", args); 
      log.trace(ftValList2String("Getrelativetime", args));
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
  public Getrelativetime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getrelativetime getrelativetime() {
  return new Getrelativetime();
}


  public static class Setrelativetime {
  private FTValList args = new FTValList();
  private String output;
  public Setrelativetime set(String name, String value) { args.setValString(name,value); return this; }
 public Setrelativetime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setrelativetime time(String val) { args.setValString("TIME", val); return this; } 
      
  public Setrelativetime() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTION.SETRELATIVETIME", args); 
      log.trace(ftValList2String("Setrelativetime", args));
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
  public Setrelativetime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setrelativetime setrelativetime() {
  return new Setrelativetime();
}

}
