package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowactionlistTag  {    
  private static Log log = Log.getLog(WorkflowactionlistTag.class);  
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
      ics.runTag("WORKFLOWACTIONLIST.SCATTER", args); 
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
      ics.runTag("WORKFLOWACTIONLIST.GATHER", args); 
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


  public static class Clearactions {
  private FTValList args = new FTValList();
  private String output;
  public Clearactions set(String name, String value) { args.setValString(name,value); return this; }
 public Clearactions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clearactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTIONLIST.CLEARACTIONS", args); 
      log.trace(ftValList2String("Clearactions", args));
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
  public Clearactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clearactions clearactions() {
  return new Clearactions();
}


  public static class Getallactions {
  private FTValList args = new FTValList();
  private String output;
  public Getallactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getallactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallactions varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getallactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTIONLIST.GETALLACTIONS", args); 
      log.trace(ftValList2String("Getallactions", args));
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
  public Getallactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallactions getallactions() {
  return new Getallactions();
}


  public static class Addaction {
  private FTValList args = new FTValList();
  private String output;
  public Addaction set(String name, String value) { args.setValString(name,value); return this; }
 public Addaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addaction value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Addaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTIONLIST.ADDACTION", args); 
      log.trace(ftValList2String("Addaction", args));
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
  public Addaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addaction addaction() {
  return new Addaction();
}


  public static class Removeaction {
  private FTValList args = new FTValList();
  private String output;
  public Removeaction set(String name, String value) { args.setValString(name,value); return this; }
 public Removeaction name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removeaction value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Removeaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTIONLIST.REMOVEACTION", args); 
      log.trace(ftValList2String("Removeaction", args));
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
  public Removeaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeaction removeaction() {
  return new Removeaction();
}

}
