package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowtimedactionlistTag  {    
  private static Log log = Log.getLog(WorkflowtimedactionlistTag.class);  
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
      ics.runTag("WORKFLOWTIMEDACTIONLIST.SCATTER", args); 
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
      ics.runTag("WORKFLOWTIMEDACTIONLIST.GATHER", args); 
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


  public static class Getalltimedactions {
  private FTValList args = new FTValList();
  private String output;
  public Getalltimedactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getalltimedactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getalltimedactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getalltimedactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTIONLIST.GETALLTIMEDACTIONS", args); 
      log.trace(ftValList2String("Getalltimedactions", args));
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
  public Getalltimedactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getalltimedactions getalltimedactions() {
  return new Getalltimedactions();
}


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTIONLIST.CREATE", args); 
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


  public static class Cleartimedactions {
  private FTValList args = new FTValList();
  private String output;
  public Cleartimedactions set(String name, String value) { args.setValString(name,value); return this; }
 public Cleartimedactions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Cleartimedactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTIONLIST.CLEARTIMEDACTIONS", args); 
      log.trace(ftValList2String("Cleartimedactions", args));
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
  public Cleartimedactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cleartimedactions cleartimedactions() {
  return new Cleartimedactions();
}


  public static class Addtimedaction {
  private FTValList args = new FTValList();
  private String output;
  public Addtimedaction set(String name, String value) { args.setValString(name,value); return this; }
 public Addtimedaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addtimedaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Addtimedaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTIONLIST.ADDTIMEDACTION", args); 
      log.trace(ftValList2String("Addtimedaction", args));
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
  public Addtimedaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addtimedaction addtimedaction() {
  return new Addtimedaction();
}


  public static class Removetimedaction {
  private FTValList args = new FTValList();
  private String output;
  public Removetimedaction set(String name, String value) { args.setValString(name,value); return this; }
 public Removetimedaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removetimedaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Removetimedaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWTIMEDACTIONLIST.REMOVETIMEDACTION", args); 
      log.trace(ftValList2String("Removetimedaction", args));
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
  public Removetimedaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removetimedaction removetimedaction() {
  return new Removetimedaction();
}

}
