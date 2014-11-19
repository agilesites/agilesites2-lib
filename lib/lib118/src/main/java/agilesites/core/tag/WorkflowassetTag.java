package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowassetTag  {    
  private static Log log = Log.getLog(WorkflowassetTag.class);  
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
 public Load objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Load objectname(String val) { args.setValString("OBJECTNAME", val); return this; } 
      
 public Load assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Load id(String val) { args.setValString("ID", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSET.LOAD", args); 
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


  public static class Getassetid {
  private FTValList args = new FTValList();
  private String output;
  public Getassetid set(String name, String value) { args.setValString(name,value); return this; }
 public Getassetid object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getassetid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassetid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSET.GETASSETID", args); 
      log.trace(ftValList2String("Getassetid", args));
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
  public Getassetid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassetid getassetid() {
  return new Getassetid();
}


  public static class Getassettype {
  private FTValList args = new FTValList();
  private String output;
  public Getassettype set(String name, String value) { args.setValString(name,value); return this; }
 public Getassettype object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getassettype varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassettype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSET.GETASSETTYPE", args); 
      log.trace(ftValList2String("Getassettype", args));
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
  public Getassettype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassettype getassettype() {
  return new Getassettype();
}


  public static class Getobjectname {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectname set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectname object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectname varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getobjectname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSET.GETOBJECTNAME", args); 
      log.trace(ftValList2String("Getobjectname", args));
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
  public Getobjectname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectname getobjectname() {
  return new Getobjectname();
}

}
