package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowstateTag  {    
  private static Log log = Log.getLog(WorkflowstateTag.class);  
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
      ics.runTag("WORKFLOWSTATE.SCATTER", args); 
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
      ics.runTag("WORKFLOWSTATE.GATHER", args); 
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


  public static class Getid {
  private FTValList args = new FTValList();
  private String output;
  public Getid set(String name, String value) { args.setValString(name,value); return this; }
 public Getid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.GETID", args); 
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


  public static class Getstatename {
  private FTValList args = new FTValList();
  private String output;
  public Getstatename set(String name, String value) { args.setValString(name,value); return this; }
 public Getstatename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstatename varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstatename() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.GETSTATENAME", args); 
      log.trace(ftValList2String("Getstatename", args));
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
  public Getstatename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstatename getstatename() {
  return new Getstatename();
}


  public static class Setstatename {
  private FTValList args = new FTValList();
  private String output;
  public Setstatename set(String name, String value) { args.setValString(name,value); return this; }
 public Setstatename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setstatename value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setstatename() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.SETSTATENAME", args); 
      log.trace(ftValList2String("Setstatename", args));
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
  public Setstatename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstatename setstatename() {
  return new Setstatename();
}


  public static class Getstatedescription {
  private FTValList args = new FTValList();
  private String output;
  public Getstatedescription set(String name, String value) { args.setValString(name,value); return this; }
 public Getstatedescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstatedescription varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstatedescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.GETSTATEDESCRIPTION", args); 
      log.trace(ftValList2String("Getstatedescription", args));
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
  public Getstatedescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstatedescription getstatedescription() {
  return new Getstatedescription();
}


  public static class Setstatedescription {
  private FTValList args = new FTValList();
  private String output;
  public Setstatedescription set(String name, String value) { args.setValString(name,value); return this; }
 public Setstatedescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setstatedescription value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setstatedescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.SETSTATEDESCRIPTION", args); 
      log.trace(ftValList2String("Setstatedescription", args));
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
  public Setstatedescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstatedescription setstatedescription() {
  return new Setstatedescription();
}


  public static class Getestimatedstatetime {
  private FTValList args = new FTValList();
  private String output;
  public Getestimatedstatetime set(String name, String value) { args.setValString(name,value); return this; }
 public Getestimatedstatetime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getestimatedstatetime varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getestimatedstatetime() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.GETESTIMATEDSTATETIME", args); 
      log.trace(ftValList2String("Getestimatedstatetime", args));
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
  public Getestimatedstatetime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getestimatedstatetime getestimatedstatetime() {
  return new Getestimatedstatetime();
}


  public static class Setestimatedstatetime {
  private FTValList args = new FTValList();
  private String output;
  public Setestimatedstatetime set(String name, String value) { args.setValString(name,value); return this; }
 public Setestimatedstatetime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setestimatedstatetime time(String val) { args.setValString("TIME", val); return this; } 
      
  public Setestimatedstatetime() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.SETESTIMATEDSTATETIME", args); 
      log.trace(ftValList2String("Setestimatedstatetime", args));
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
  public Setestimatedstatetime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setestimatedstatetime setestimatedstatetime() {
  return new Setestimatedstatetime();
}


  public static class Getactions {
  private FTValList args = new FTValList();
  private String output;
  public Getactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getactions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.GETACTIONS", args); 
      log.trace(ftValList2String("Getactions", args));
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
  public Getactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getactions getactions() {
  return new Getactions();
}


  public static class Setactions {
  private FTValList args = new FTValList();
  private String output;
  public Setactions set(String name, String value) { args.setValString(name,value); return this; }
 public Setactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setactions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTATE.SETACTIONS", args); 
      log.trace(ftValList2String("Setactions", args));
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
  public Setactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setactions setactions() {
  return new Setactions();
}

}
