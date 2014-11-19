package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowassignmentTag  {    
  private static Log log = Log.getLog(WorkflowassignmentTag.class);  
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
    
 
  public static class Getid {
  private FTValList args = new FTValList();
  private String output;
  public Getid set(String name, String value) { args.setValString(name,value); return this; }
 public Getid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETID", args); 
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


  public static class Getassigndate {
  private FTValList args = new FTValList();
  private String output;
  public Getassigndate set(String name, String value) { args.setValString(name,value); return this; }
 public Getassigndate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassigndate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassigndate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETASSIGNDATE", args); 
      log.trace(ftValList2String("Getassigndate", args));
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
  public Getassigndate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassigndate getassigndate() {
  return new Getassigndate();
}


  public static class Getassignedobject {
  private FTValList args = new FTValList();
  private String output;
  public Getassignedobject set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignedobject name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassignedobject objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getassignedobject() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETASSIGNEDOBJECT", args); 
      log.trace(ftValList2String("Getassignedobject", args));
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
  public Getassignedobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignedobject getassignedobject() {
  return new Getassignedobject();
}


  public static class Getassigneduserid {
  private FTValList args = new FTValList();
  private String output;
  public Getassigneduserid set(String name, String value) { args.setValString(name,value); return this; }
 public Getassigneduserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassigneduserid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassigneduserid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETASSIGNEDUSERID", args); 
      log.trace(ftValList2String("Getassigneduserid", args));
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
  public Getassigneduserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassigneduserid getassigneduserid() {
  return new Getassigneduserid();
}


  public static class Getassigneruserid {
  private FTValList args = new FTValList();
  private String output;
  public Getassigneruserid set(String name, String value) { args.setValString(name,value); return this; }
 public Getassigneruserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassigneruserid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassigneruserid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETASSIGNERUSERID", args); 
      log.trace(ftValList2String("Getassigneruserid", args));
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
  public Getassigneruserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassigneruserid getassigneruserid() {
  return new Getassigneruserid();
}


  public static class Getassignmentcomment {
  private FTValList args = new FTValList();
  private String output;
  public Getassignmentcomment set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignmentcomment name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassignmentcomment varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getassignmentcomment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETASSIGNMENTCOMMENT", args); 
      log.trace(ftValList2String("Getassignmentcomment", args));
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
  public Getassignmentcomment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignmentcomment getassignmentcomment() {
  return new Getassignmentcomment();
}


  public static class Getdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadline name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeadline varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETDEADLINE", args); 
      log.trace(ftValList2String("Getdeadline", args));
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
  public Getdeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeadline getdeadline() {
  return new Getdeadline();
}


  public static class Getdisposition {
  private FTValList args = new FTValList();
  private String output;
  public Getdisposition set(String name, String value) { args.setValString(name,value); return this; }
 public Getdisposition name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdisposition varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdisposition() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETDISPOSITION", args); 
      log.trace(ftValList2String("Getdisposition", args));
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
  public Getdisposition set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdisposition getdisposition() {
  return new Getdisposition();
}


  public static class Getdispositioncomment {
  private FTValList args = new FTValList();
  private String output;
  public Getdispositioncomment set(String name, String value) { args.setValString(name,value); return this; }
 public Getdispositioncomment name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdispositioncomment varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdispositioncomment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETDISPOSITIONCOMMENT", args); 
      log.trace(ftValList2String("Getdispositioncomment", args));
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
  public Getdispositioncomment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdispositioncomment getdispositioncomment() {
  return new Getdispositioncomment();
}


  public static class Getdispositiondate {
  private FTValList args = new FTValList();
  private String output;
  public Getdispositiondate set(String name, String value) { args.setValString(name,value); return this; }
 public Getdispositiondate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdispositiondate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdispositiondate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETDISPOSITIONDATE", args); 
      log.trace(ftValList2String("Getdispositiondate", args));
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
  public Getdispositiondate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdispositiondate getdispositiondate() {
  return new Getdispositiondate();
}


  public static class Getdispositionuserid {
  private FTValList args = new FTValList();
  private String output;
  public Getdispositionuserid set(String name, String value) { args.setValString(name,value); return this; }
 public Getdispositionuserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdispositionuserid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdispositionuserid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETDISPOSITIONUSERID", args); 
      log.trace(ftValList2String("Getdispositionuserid", args));
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
  public Getdispositionuserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdispositionuserid getdispositionuserid() {
  return new Getdispositionuserid();
}


  public static class Getgroupedcomment {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupedcomment set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupedcomment name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupedcomment varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgroupedcomment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETGROUPEDCOMMENT", args); 
      log.trace(ftValList2String("Getgroupedcomment", args));
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
  public Getgroupedcomment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupedcomment getgroupedcomment() {
  return new Getgroupedcomment();
}


  public static class Getgroupeddeadline {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupeddeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupeddeadline name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupeddeadline varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgroupeddeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETGROUPEDDEADLINE", args); 
      log.trace(ftValList2String("Getgroupeddeadline", args));
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
  public Getgroupeddeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupeddeadline getgroupeddeadline() {
  return new Getgroupeddeadline();
}


  public static class Getgroupid {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupid set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgroupid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETGROUPID", args); 
      log.trace(ftValList2String("Getgroupid", args));
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
  public Getgroupid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupid getgroupid() {
  return new Getgroupid();
}


  public static class Getgroupedworkflowstepid {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupedworkflowstepid set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupedworkflowstepid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupedworkflowstepid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgroupedworkflowstepid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETGROUPEDWORKFLOWSTEPID", args); 
      log.trace(ftValList2String("Getgroupedworkflowstepid", args));
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
  public Getgroupedworkflowstepid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupedworkflowstepid getgroupedworkflowstepid() {
  return new Getgroupedworkflowstepid();
}


  public static class Getqueuedworkflowstepid {
  private FTValList args = new FTValList();
  private String output;
  public Getqueuedworkflowstepid set(String name, String value) { args.setValString(name,value); return this; }
 public Getqueuedworkflowstepid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getqueuedworkflowstepid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getqueuedworkflowstepid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETQUEUEDWORKFLOWSTEPID", args); 
      log.trace(ftValList2String("Getqueuedworkflowstepid", args));
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
  public Getqueuedworkflowstepid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getqueuedworkflowstepid getqueuedworkflowstepid() {
  return new Getqueuedworkflowstepid();
}


  public static class Getstateid {
  private FTValList args = new FTValList();
  private String output;
  public Getstateid set(String name, String value) { args.setValString(name,value); return this; }
 public Getstateid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstateid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETSTATEID", args); 
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


  public static class Getstatus {
  private FTValList args = new FTValList();
  private String output;
  public Getstatus set(String name, String value) { args.setValString(name,value); return this; }
 public Getstatus name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstatus varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getstatus() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETSTATUS", args); 
      log.trace(ftValList2String("Getstatus", args));
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
  public Getstatus set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstatus getstatus() {
  return new Getstatus();
}


  public static class Getprocessstatus {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessstatus set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessstatus name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocessstatus varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getprocessstatus() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETPROCESSSTATUS", args); 
      log.trace(ftValList2String("Getprocessstatus", args));
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
  public Getprocessstatus set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocessstatus getprocessstatus() {
  return new Getprocessstatus();
}


  public static class Getprocessdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessdeadline name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocessdeadline varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getprocessdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETPROCESSDEADLINE", args); 
      log.trace(ftValList2String("Getprocessdeadline", args));
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
  public Getprocessdeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocessdeadline getprocessdeadline() {
  return new Getprocessdeadline();
}


  public static class Getprocess {
  private FTValList args = new FTValList();
  private String output;
  public Getprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocess name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocess varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWASSIGNMENT.GETPROCESS", args); 
      log.trace(ftValList2String("Getprocess", args));
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
  public Getprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocess getprocess() {
  return new Getprocess();
}

}
