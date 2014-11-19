package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowstepTag  {    
  private static Log log = Log.getLog(WorkflowstepTag.class);  
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
      ics.runTag("WORKFLOWSTEP.SCATTER", args); 
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
      ics.runTag("WORKFLOWSTEP.GATHER", args); 
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
      ics.runTag("WORKFLOWSTEP.GETID", args); 
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
      ics.runTag("WORKFLOWSTEP.GETNAME", args); 
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
      ics.runTag("WORKFLOWSTEP.SETNAME", args); 
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


  public static class Getdeadlinetype {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadlinetype set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadlinetype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeadlinetype varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdeadlinetype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETDEADLINETYPE", args); 
      log.trace(ftValList2String("Getdeadlinetype", args));
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
  public Getdeadlinetype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeadlinetype getdeadlinetype() {
  return new Getdeadlinetype();
}


  public static class Setdeadlinetype {
  private FTValList args = new FTValList();
  private String output;
  public Setdeadlinetype set(String name, String value) { args.setValString(name,value); return this; }
 public Setdeadlinetype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdeadlinetype type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Setdeadlinetype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETDEADLINETYPE", args); 
      log.trace(ftValList2String("Setdeadlinetype", args));
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
  public Setdeadlinetype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdeadlinetype setdeadlinetype() {
  return new Setdeadlinetype();
}


  public static class Getstartstate {
  private FTValList args = new FTValList();
  private String output;
  public Getstartstate set(String name, String value) { args.setValString(name,value); return this; }
 public Getstartstate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstartstate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstartstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETSTARTSTATE", args); 
      log.trace(ftValList2String("Getstartstate", args));
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
  public Getstartstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstartstate getstartstate() {
  return new Getstartstate();
}


  public static class Setstartstate {
  private FTValList args = new FTValList();
  private String output;
  public Setstartstate set(String name, String value) { args.setValString(name,value); return this; }
 public Setstartstate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setstartstate value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setstartstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETSTARTSTATE", args); 
      log.trace(ftValList2String("Setstartstate", args));
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
  public Setstartstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstartstate setstartstate() {
  return new Setstartstate();
}


  public static class Getendstate {
  private FTValList args = new FTValList();
  private String output;
  public Getendstate set(String name, String value) { args.setValString(name,value); return this; }
 public Getendstate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getendstate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getendstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETENDSTATE", args); 
      log.trace(ftValList2String("Getendstate", args));
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
  public Getendstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getendstate getendstate() {
  return new Getendstate();
}


  public static class Setendstate {
  private FTValList args = new FTValList();
  private String output;
  public Setendstate set(String name, String value) { args.setValString(name,value); return this; }
 public Setendstate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setendstate value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setendstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETENDSTATE", args); 
      log.trace(ftValList2String("Setendstate", args));
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
  public Setendstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setendstate setendstate() {
  return new Setendstate();
}


  public static class Getoverrideflag {
  private FTValList args = new FTValList();
  private String output;
  public Getoverrideflag set(String name, String value) { args.setValString(name,value); return this; }
 public Getoverrideflag name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getoverrideflag varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getoverrideflag() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETOVERRIDEFLAG", args); 
      log.trace(ftValList2String("Getoverrideflag", args));
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
  public Getoverrideflag set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getoverrideflag getoverrideflag() {
  return new Getoverrideflag();
}


  public static class Setoverrideflag {
  private FTValList args = new FTValList();
  private String output;
  public Setoverrideflag set(String name, String value) { args.setValString(name,value); return this; }
 public Setoverrideflag name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setoverrideflag flag(String val) { args.setValString("FLAG", val); return this; } 
      
  public Setoverrideflag() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETOVERRIDEFLAG", args); 
      log.trace(ftValList2String("Setoverrideflag", args));
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
  public Setoverrideflag set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setoverrideflag setoverrideflag() {
  return new Setoverrideflag();
}


  public static class Getgrouplockflag {
  private FTValList args = new FTValList();
  private String output;
  public Getgrouplockflag set(String name, String value) { args.setValString(name,value); return this; }
 public Getgrouplockflag name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgrouplockflag varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgrouplockflag() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETGROUPLOCKFLAG", args); 
      log.trace(ftValList2String("Getgrouplockflag", args));
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
  public Getgrouplockflag set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgrouplockflag getgrouplockflag() {
  return new Getgrouplockflag();
}


  public static class Setgrouplockflag {
  private FTValList args = new FTValList();
  private String output;
  public Setgrouplockflag set(String name, String value) { args.setValString(name,value); return this; }
 public Setgrouplockflag name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setgrouplockflag flag(String val) { args.setValString("FLAG", val); return this; } 
      
  public Setgrouplockflag() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETGROUPLOCKFLAG", args); 
      log.trace(ftValList2String("Setgrouplockflag", args));
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
  public Setgrouplockflag set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setgrouplockflag setgrouplockflag() {
  return new Setgrouplockflag();
}


  public static class Getsteptype {
  private FTValList args = new FTValList();
  private String output;
  public Getsteptype set(String name, String value) { args.setValString(name,value); return this; }
 public Getsteptype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsteptype varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getsteptype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETSTEPTYPE", args); 
      log.trace(ftValList2String("Getsteptype", args));
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
  public Getsteptype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsteptype getsteptype() {
  return new Getsteptype();
}


  public static class Setsteptype {
  private FTValList args = new FTValList();
  private String output;
  public Setsteptype set(String name, String value) { args.setValString(name,value); return this; }
 public Setsteptype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsteptype type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Setsteptype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETSTEPTYPE", args); 
      log.trace(ftValList2String("Setsteptype", args));
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
  public Setsteptype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsteptype setsteptype() {
  return new Setsteptype();
}


  public static class Getconditions {
  private FTValList args = new FTValList();
  private String output;
  public Getconditions set(String name, String value) { args.setValString(name,value); return this; }
 public Getconditions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getconditions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getconditions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETCONDITIONS", args); 
      log.trace(ftValList2String("Getconditions", args));
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
  public Getconditions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getconditions getconditions() {
  return new Getconditions();
}


  public static class Setconditions {
  private FTValList args = new FTValList();
  private String output;
  public Setconditions set(String name, String value) { args.setValString(name,value); return this; }
 public Setconditions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setconditions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setconditions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETCONDITIONS", args); 
      log.trace(ftValList2String("Setconditions", args));
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
  public Setconditions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setconditions setconditions() {
  return new Setconditions();
}


  public static class Getcompletionactions {
  private FTValList args = new FTValList();
  private String output;
  public Getcompletionactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getcompletionactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcompletionactions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getcompletionactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETCOMPLETIONACTIONS", args); 
      log.trace(ftValList2String("Getcompletionactions", args));
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
  public Getcompletionactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcompletionactions getcompletionactions() {
  return new Getcompletionactions();
}


  public static class Setcompletionactions {
  private FTValList args = new FTValList();
  private String output;
  public Setcompletionactions set(String name, String value) { args.setValString(name,value); return this; }
 public Setcompletionactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setcompletionactions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setcompletionactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETCOMPLETIONACTIONS", args); 
      log.trace(ftValList2String("Setcompletionactions", args));
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
  public Setcompletionactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setcompletionactions setcompletionactions() {
  return new Setcompletionactions();
}


  public static class Getauthorizationroles {
  private FTValList args = new FTValList();
  private String output;
  public Getauthorizationroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getauthorizationroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getauthorizationroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getauthorizationroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETAUTHORIZATIONROLES", args); 
      log.trace(ftValList2String("Getauthorizationroles", args));
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
  public Getauthorizationroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getauthorizationroles getauthorizationroles() {
  return new Getauthorizationroles();
}


  public static class Setauthorizationroles {
  private FTValList args = new FTValList();
  private String output;
  public Setauthorizationroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setauthorizationroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setauthorizationroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setauthorizationroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETAUTHORIZATIONROLES", args); 
      log.trace(ftValList2String("Setauthorizationroles", args));
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
  public Setauthorizationroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setauthorizationroles setauthorizationroles() {
  return new Setauthorizationroles();
}


  public static class Getnotifyroles {
  private FTValList args = new FTValList();
  private String output;
  public Getnotifyroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getnotifyroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getnotifyroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getnotifyroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETNOTIFYROLES", args); 
      log.trace(ftValList2String("Getnotifyroles", args));
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
  public Getnotifyroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getnotifyroles getnotifyroles() {
  return new Getnotifyroles();
}


  public static class Setnotifyroles {
  private FTValList args = new FTValList();
  private String output;
  public Setnotifyroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setnotifyroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setnotifyroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setnotifyroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETNOTIFYROLES", args); 
      log.trace(ftValList2String("Setnotifyroles", args));
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
  public Setnotifyroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setnotifyroles setnotifyroles() {
  return new Setnotifyroles();
}


  public static class Getdeadlockactions {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadlockactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadlockactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeadlockactions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdeadlockactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.GETDEADLOCKACTIONS", args); 
      log.trace(ftValList2String("Getdeadlockactions", args));
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
  public Getdeadlockactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeadlockactions getdeadlockactions() {
  return new Getdeadlockactions();
}


  public static class Setdeadlockactions {
  private FTValList args = new FTValList();
  private String output;
  public Setdeadlockactions set(String name, String value) { args.setValString(name,value); return this; }
 public Setdeadlockactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdeadlockactions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setdeadlockactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWSTEP.SETDEADLOCKACTIONS", args); 
      log.trace(ftValList2String("Setdeadlockactions", args));
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
  public Setdeadlockactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdeadlockactions setdeadlockactions() {
  return new Setdeadlockactions();
}

}
