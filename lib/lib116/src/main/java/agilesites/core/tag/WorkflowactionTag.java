package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowactionTag  {    
  private static Log log = Log.getLog(WorkflowactionTag.class);  
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
      ics.runTag("WORKFLOWACTION.SCATTER", args); 
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
      ics.runTag("WORKFLOWACTION.GATHER", args); 
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
      ics.runTag("WORKFLOWACTION.GETID", args); 
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
      ics.runTag("WORKFLOWACTION.GETNAME", args); 
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
      ics.runTag("WORKFLOWACTION.SETNAME", args); 
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


  public static class Getelementname {
  private FTValList args = new FTValList();
  private String output;
  public Getelementname set(String name, String value) { args.setValString(name,value); return this; }
 public Getelementname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getelementname varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getelementname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.GETELEMENTNAME", args); 
      log.trace(ftValList2String("Getelementname", args));
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
  public Getelementname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getelementname getelementname() {
  return new Getelementname();
}


  public static class Setelementname {
  private FTValList args = new FTValList();
  private String output;
  public Setelementname set(String name, String value) { args.setValString(name,value); return this; }
 public Setelementname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setelementname value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setelementname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.SETELEMENTNAME", args); 
      log.trace(ftValList2String("Setelementname", args));
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
  public Setelementname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setelementname setelementname() {
  return new Setelementname();
}


  public static class Getdescription {
  private FTValList args = new FTValList();
  private String output;
  public Getdescription set(String name, String value) { args.setValString(name,value); return this; }
 public Getdescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdescription varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.GETDESCRIPTION", args); 
      log.trace(ftValList2String("Getdescription", args));
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
  public Getdescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdescription getdescription() {
  return new Getdescription();
}


  public static class Setdescription {
  private FTValList args = new FTValList();
  private String output;
  public Setdescription set(String name, String value) { args.setValString(name,value); return this; }
 public Setdescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdescription value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setdescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.SETDESCRIPTION", args); 
      log.trace(ftValList2String("Setdescription", args));
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
  public Setdescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdescription setdescription() {
  return new Setdescription();
}


  public static class Getarguments {
  private FTValList args = new FTValList();
  private String output;
  public Getarguments set(String name, String value) { args.setValString(name,value); return this; }
 public Getarguments name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getarguments varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getarguments() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.GETARGUMENTS", args); 
      log.trace(ftValList2String("Getarguments", args));
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
  public Getarguments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getarguments getarguments() {
  return new Getarguments();
}


  public static class Setarguments {
  private FTValList args = new FTValList();
  private String output;
  public Setarguments set(String name, String value) { args.setValString(name,value); return this; }
 public Setarguments name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setarguments value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setarguments() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWACTION.SETARGUMENTS", args); 
      log.trace(ftValList2String("Setarguments", args));
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
  public Setarguments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setarguments setarguments() {
  return new Setarguments();
}

}
