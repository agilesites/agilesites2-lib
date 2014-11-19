package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowobjectTag  {    
  private static Log log = Log.getLog(WorkflowobjectTag.class);  
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
    
 
  public static class Getobjectname {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectname set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectname object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectname varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getobjectname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWOBJECT.GETOBJECTNAME", args); 
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


  public static class Getdisplayablename {
  private FTValList args = new FTValList();
  private String output;
  public Getdisplayablename set(String name, String value) { args.setValString(name,value); return this; }
 public Getdisplayablename object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getdisplayablename varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdisplayablename() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWOBJECT.GETDISPLAYABLENAME", args); 
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

}
