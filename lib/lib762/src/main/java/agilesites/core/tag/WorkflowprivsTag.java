package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowprivsTag  {    
  private static Log log = Log.getLog(WorkflowprivsTag.class);  
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
      ics.runTag("WORKFLOWPRIVS.SCATTER", args); 
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
      ics.runTag("WORKFLOWPRIVS.GATHER", args); 
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


  public static class Getallprivs {
  private FTValList args = new FTValList();
  private String output;
  public Getallprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Getallprivs name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallprivs prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getallprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIVS.GETALLPRIVS", args); 
      log.trace(ftValList2String("Getallprivs", args));
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
  public Getallprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallprivs getallprivs() {
  return new Getallprivs();
}


  public static class Add {
  private FTValList args = new FTValList();
  private String output;
  public Add set(String name, String value) { args.setValString(name,value); return this; }
 public Add name(String val) { args.setValString("NAME", val); return this; } 
      
 public Add object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Add() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIVS.ADD", args); 
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


  public static class Remove {
  private FTValList args = new FTValList();
  private String output;
  public Remove set(String name, String value) { args.setValString(name,value); return this; }
 public Remove name(String val) { args.setValString("NAME", val); return this; } 
      
 public Remove object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Remove() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIVS.REMOVE", args); 
      log.trace(ftValList2String("Remove", args));
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
  public Remove set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Remove remove() {
  return new Remove();
}


  public static class Clear {
  private FTValList args = new FTValList();
  private String output;
  public Clear set(String name, String value) { args.setValString(name,value); return this; }
 public Clear name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clear() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIVS.CLEAR", args); 
      log.trace(ftValList2String("Clear", args));
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
  public Clear set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clear clear() {
  return new Clear();
}


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPRIVS.CREATE", args); 
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

}
