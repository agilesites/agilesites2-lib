package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowengineTag  {    
  private static Log log = Log.getLog(WorkflowengineTag.class);  
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
    
 
  public static class Createnewprivs {
  private FTValList args = new FTValList();
  private String output;
  public Createnewprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewprivs objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWPRIVS", args); 
      log.trace(ftValList2String("Createnewprivs", args));
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
  public Createnewprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewprivs createnewprivs() {
  return new Createnewprivs();
}


  public static class Getobjectprivs {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectprivs object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectprivs objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getobjectprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTPRIVS", args); 
      log.trace(ftValList2String("Getobjectprivs", args));
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
  public Getobjectprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectprivs getobjectprivs() {
  return new Getobjectprivs();
}


  public static class Setobjectprivs {
  private FTValList args = new FTValList();
  private String output;
  public Setobjectprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Setobjectprivs object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Setobjectprivs privs(String val) { args.setValString("PRIVS", val); return this; } 
      
  public Setobjectprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETOBJECTPRIVS", args); 
      log.trace(ftValList2String("Setobjectprivs", args));
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
  public Setobjectprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setobjectprivs setobjectprivs() {
  return new Setobjectprivs();
}


  public static class Abstainfromvoting {
  private FTValList args = new FTValList();
  private String output;
  public Abstainfromvoting set(String name, String value) { args.setValString(name,value); return this; }
 public Abstainfromvoting site(String val) { args.setValString("SITE", val); return this; } 
      
 public Abstainfromvoting id(String val) { args.setValString("ID", val); return this; } 
      
 public Abstainfromvoting comment(String val) { args.setValString("COMMENT", val); return this; } 
      
  public Abstainfromvoting() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ABSTAINFROMVOTING", args); 
      log.trace(ftValList2String("Abstainfromvoting", args));
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
  public Abstainfromvoting set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Abstainfromvoting abstainfromvoting() {
  return new Abstainfromvoting();
}


  public static class Addnewobjecttogroup {
  private FTValList args = new FTValList();
  private String output;
  public Addnewobjecttogroup set(String name, String value) { args.setValString(name,value); return this; }
 public Addnewobjecttogroup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Addnewobjecttogroup object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Addnewobjecttogroup id(String val) { args.setValString("ID", val); return this; } 
      
 public Addnewobjecttogroup comment(String val) { args.setValString("COMMENT", val); return this; } 
      
 public Addnewobjecttogroup deadline(String val) { args.setValString("DEADLINE", val); return this; } 
      
 public Addnewobjecttogroup assignmentlist(String val) { args.setValString("ASSIGNMENTLIST", val); return this; } 
      
  public Addnewobjecttogroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ADDNEWOBJECTTOGROUP", args); 
      log.trace(ftValList2String("Addnewobjecttogroup", args));
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
  public Addnewobjecttogroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addnewobjecttogroup addnewobjecttogroup() {
  return new Addnewobjecttogroup();
}


  public static class Addobjecttogroup {
  private FTValList args = new FTValList();
  private String output;
  public Addobjecttogroup set(String name, String value) { args.setValString(name,value); return this; }
 public Addobjecttogroup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Addobjecttogroup object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Addobjecttogroup id(String val) { args.setValString("ID", val); return this; } 
      
  public Addobjecttogroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ADDOBJECTTOGROUP", args); 
      log.trace(ftValList2String("Addobjecttogroup", args));
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
  public Addobjecttogroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addobjecttogroup addobjecttogroup() {
  return new Addobjecttogroup();
}


  public static class Assigntoself {
  private FTValList args = new FTValList();
  private String output;
  public Assigntoself set(String name, String value) { args.setValString(name,value); return this; }
 public Assigntoself object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Assigntoself comment(String val) { args.setValString("COMMENT", val); return this; } 
      
 public Assigntoself deadline(String val) { args.setValString("DEADLINE", val); return this; } 
      
  public Assigntoself() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ASSIGNTOSELF", args); 
      log.trace(ftValList2String("Assigntoself", args));
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
  public Assigntoself set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Assigntoself assigntoself() {
  return new Assigntoself();
}


  public static class Cancelassignment {
  private FTValList args = new FTValList();
  private String output;
  public Cancelassignment set(String name, String value) { args.setValString(name,value); return this; }
 public Cancelassignment site(String val) { args.setValString("SITE", val); return this; } 
      
 public Cancelassignment id(String val) { args.setValString("ID", val); return this; } 
      
 public Cancelassignment comment(String val) { args.setValString("COMMENT", val); return this; } 
      
  public Cancelassignment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CANCELASSIGNMENT", args); 
      log.trace(ftValList2String("Cancelassignment", args));
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
  public Cancelassignment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cancelassignment cancelassignment() {
  return new Cancelassignment();
}


  public static class Candeletegroup {
  private FTValList args = new FTValList();
  private String output;
  public Candeletegroup set(String name, String value) { args.setValString(name,value); return this; }
 public Candeletegroup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Candeletegroup id(String val) { args.setValString("ID", val); return this; } 
      
 public Candeletegroup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Candeletegroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CANDELETEGROUP", args); 
      log.trace(ftValList2String("Candeletegroup", args));
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
  public Candeletegroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Candeletegroup candeletegroup() {
  return new Candeletegroup();
}


  public static class Caneditgroup {
  private FTValList args = new FTValList();
  private String output;
  public Caneditgroup set(String name, String value) { args.setValString(name,value); return this; }
 public Caneditgroup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Caneditgroup id(String val) { args.setValString("ID", val); return this; } 
      
 public Caneditgroup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Caneditgroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CANEDITGROUP", args); 
      log.trace(ftValList2String("Caneditgroup", args));
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
  public Caneditgroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Caneditgroup caneditgroup() {
  return new Caneditgroup();
}


  public static class Canstartworkflow {
  private FTValList args = new FTValList();
  private String output;
  public Canstartworkflow set(String name, String value) { args.setValString(name,value); return this; }
 public Canstartworkflow site(String val) { args.setValString("SITE", val); return this; } 
      
 public Canstartworkflow id(String val) { args.setValString("ID", val); return this; } 
      
 public Canstartworkflow varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Canstartworkflow() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CANSTARTWORKFLOW", args); 
      log.trace(ftValList2String("Canstartworkflow", args));
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
  public Canstartworkflow set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Canstartworkflow canstartworkflow() {
  return new Canstartworkflow();
}


  public static class Checkprocessactive {
  private FTValList args = new FTValList();
  private String output;
  public Checkprocessactive set(String name, String value) { args.setValString(name,value); return this; }
 public Checkprocessactive id(String val) { args.setValString("ID", val); return this; } 
      
 public Checkprocessactive varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkprocessactive() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CHECKPROCESSACTIVE", args); 
      log.trace(ftValList2String("Checkprocessactive", args));
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
  public Checkprocessactive set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkprocessactive checkprocessactive() {
  return new Checkprocessactive();
}


  public static class Closeassignments {
  private FTValList args = new FTValList();
  private String output;
  public Closeassignments set(String name, String value) { args.setValString(name,value); return this; }
 public Closeassignments site(String val) { args.setValString("SITE", val); return this; } 
      
 public Closeassignments object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Closeassignments comment(String val) { args.setValString("COMMENT", val); return this; } 
      
  public Closeassignments() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CLOSEASSIGNMENTS", args); 
      log.trace(ftValList2String("Closeassignments", args));
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
  public Closeassignments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Closeassignments closeassignments() {
  return new Closeassignments();
}


  public static class Completeassignment {
  private FTValList args = new FTValList();
  private String output;
  public Completeassignment set(String name, String value) { args.setValString(name,value); return this; }
 public Completeassignment site(String val) { args.setValString("SITE", val); return this; } 
      
 public Completeassignment id(String val) { args.setValString("ID", val); return this; } 
      
 public Completeassignment nextstep(String val) { args.setValString("NEXTSTEP", val); return this; } 
      
 public Completeassignment varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Completeassignment action(String val) { args.setValString("ACTION", val); return this; } 
      
 public Completeassignment comment(String val) { args.setValString("COMMENT", val); return this; } 
      
 public Completeassignment deadline(String val) { args.setValString("DEADLINE", val); return this; } 
      
 public Completeassignment assignmentlist(String val) { args.setValString("ASSIGNMENTLIST", val); return this; } 
      
  public Completeassignment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.COMPLETEASSIGNMENT", args); 
      log.trace(ftValList2String("Completeassignment", args));
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
  public Completeassignment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Completeassignment completeassignment() {
  return new Completeassignment();
}


  public static class Createnewassignmentaction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewassignmentaction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewassignmentaction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewassignmentaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWASSIGNMENTACTION", args); 
      log.trace(ftValList2String("Createnewassignmentaction", args));
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
  public Createnewassignmentaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewassignmentaction createnewassignmentaction() {
  return new Createnewassignmentaction();
}


  public static class Createnewcondition {
  private FTValList args = new FTValList();
  private String output;
  public Createnewcondition set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewcondition objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewcondition() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWCONDITION", args); 
      log.trace(ftValList2String("Createnewcondition", args));
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
  public Createnewcondition set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewcondition createnewcondition() {
  return new Createnewcondition();
}


  public static class Createnewdeadlockaction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewdeadlockaction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewdeadlockaction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewdeadlockaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWDEADLOCKACTION", args); 
      log.trace(ftValList2String("Createnewdeadlockaction", args));
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
  public Createnewdeadlockaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewdeadlockaction createnewdeadlockaction() {
  return new Createnewdeadlockaction();
}


  public static class Createnewdelegateaction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewdelegateaction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewdelegateaction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewdelegateaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWDELEGATEACTION", args); 
      log.trace(ftValList2String("Createnewdelegateaction", args));
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
  public Createnewdelegateaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewdelegateaction createnewdelegateaction() {
  return new Createnewdelegateaction();
}


  public static class Createnewfunction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewfunction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewfunction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewfunction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWFUNCTION", args); 
      log.trace(ftValList2String("Createnewfunction", args));
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
  public Createnewfunction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewfunction createnewfunction() {
  return new Createnewfunction();
}


  public static class Createnewgroup {
  private FTValList args = new FTValList();
  private String output;
  public Createnewgroup set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewgroup objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewgroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWGROUP", args); 
      log.trace(ftValList2String("Createnewgroup", args));
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
  public Createnewgroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewgroup createnewgroup() {
  return new Createnewgroup();
}


  public static class Createnewgroupaction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewgroupaction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewgroupaction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewgroupaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWGROUPACTION", args); 
      log.trace(ftValList2String("Createnewgroupaction", args));
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
  public Createnewgroupaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewgroupaction createnewgroupaction() {
  return new Createnewgroupaction();
}


  public static class Createnewprocess {
  private FTValList args = new FTValList();
  private String output;
  public Createnewprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewprocess objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWPROCESS", args); 
      log.trace(ftValList2String("Createnewprocess", args));
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
  public Createnewprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewprocess createnewprocess() {
  return new Createnewprocess();
}


  public static class Createnewstate {
  private FTValList args = new FTValList();
  private String output;
  public Createnewstate set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewstate objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWSTATE", args); 
      log.trace(ftValList2String("Createnewstate", args));
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
  public Createnewstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewstate createnewstate() {
  return new Createnewstate();
}


  public static class Createnewstepaction {
  private FTValList args = new FTValList();
  private String output;
  public Createnewstepaction set(String name, String value) { args.setValString(name,value); return this; }
 public Createnewstepaction objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Createnewstepaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.CREATENEWSTEPACTION", args); 
      log.trace(ftValList2String("Createnewstepaction", args));
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
  public Createnewstepaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createnewstepaction createnewstepaction() {
  return new Createnewstepaction();
}


  public static class Delegateassignment {
  private FTValList args = new FTValList();
  private String output;
  public Delegateassignment set(String name, String value) { args.setValString(name,value); return this; }
 public Delegateassignment id(String val) { args.setValString("ID", val); return this; } 
      
 public Delegateassignment site(String val) { args.setValString("SITE", val); return this; } 
      
 public Delegateassignment delegatedto(String val) { args.setValString("DELEGATEDTO", val); return this; } 
      
 public Delegateassignment comment(String val) { args.setValString("COMMENT", val); return this; } 
      
  public Delegateassignment() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELEGATEASSIGNMENT", args); 
      log.trace(ftValList2String("Delegateassignment", args));
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
  public Delegateassignment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Delegateassignment delegateassignment() {
  return new Delegateassignment();
}


  public static class Deleteassignmentactionid {
  private FTValList args = new FTValList();
  private String output;
  public Deleteassignmentactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteassignmentactionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deleteassignmentactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEASSIGNMENTACTIONID", args); 
      log.trace(ftValList2String("Deleteassignmentactionid", args));
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
  public Deleteassignmentactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteassignmentactionid deleteassignmentactionid() {
  return new Deleteassignmentactionid();
}


  public static class Deleteconditionid {
  private FTValList args = new FTValList();
  private String output;
  public Deleteconditionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteconditionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deleteconditionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETECONDITIONID", args); 
      log.trace(ftValList2String("Deleteconditionid", args));
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
  public Deleteconditionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteconditionid deleteconditionid() {
  return new Deleteconditionid();
}


  public static class Deletedeadlockactionid {
  private FTValList args = new FTValList();
  private String output;
  public Deletedeadlockactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletedeadlockactionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletedeadlockactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEDEADLOCKACTIONID", args); 
      log.trace(ftValList2String("Deletedeadlockactionid", args));
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
  public Deletedeadlockactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletedeadlockactionid deletedeadlockactionid() {
  return new Deletedeadlockactionid();
}


  public static class Deletedelegateactionid {
  private FTValList args = new FTValList();
  private String output;
  public Deletedelegateactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletedelegateactionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletedelegateactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEDELEGATEACTIONID", args); 
      log.trace(ftValList2String("Deletedelegateactionid", args));
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
  public Deletedelegateactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletedelegateactionid deletedelegateactionid() {
  return new Deletedelegateactionid();
}


  public static class Deletefunctionid {
  private FTValList args = new FTValList();
  private String output;
  public Deletefunctionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletefunctionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletefunctionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEFUNCTIONID", args); 
      log.trace(ftValList2String("Deletefunctionid", args));
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
  public Deletefunctionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletefunctionid deletefunctionid() {
  return new Deletefunctionid();
}


  public static class Deletegroupactionid {
  private FTValList args = new FTValList();
  private String output;
  public Deletegroupactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletegroupactionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletegroupactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEGROUPACTIONID", args); 
      log.trace(ftValList2String("Deletegroupactionid", args));
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
  public Deletegroupactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletegroupactionid deletegroupactionid() {
  return new Deletegroupactionid();
}


  public static class Deletegroupid {
  private FTValList args = new FTValList();
  private String output;
  public Deletegroupid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletegroupid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletegroupid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEGROUPID", args); 
      log.trace(ftValList2String("Deletegroupid", args));
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
  public Deletegroupid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletegroupid deletegroupid() {
  return new Deletegroupid();
}


  public static class Deleteprocessid {
  private FTValList args = new FTValList();
  private String output;
  public Deleteprocessid set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteprocessid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deleteprocessid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEPROCESSID", args); 
      log.trace(ftValList2String("Deleteprocessid", args));
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
  public Deleteprocessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteprocessid deleteprocessid() {
  return new Deleteprocessid();
}


  public static class Deletestateid {
  private FTValList args = new FTValList();
  private String output;
  public Deletestateid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletestateid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletestateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETESTATEID", args); 
      log.trace(ftValList2String("Deletestateid", args));
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
  public Deletestateid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletestateid deletestateid() {
  return new Deletestateid();
}


  public static class Deletestepactionid {
  private FTValList args = new FTValList();
  private String output;
  public Deletestepactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Deletestepactionid id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletestepactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETESTEPACTIONID", args); 
      log.trace(ftValList2String("Deletestepactionid", args));
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
  public Deletestepactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletestepactionid deletestepactionid() {
  return new Deletestepactionid();
}


  public static class Deleteworkflowhistory {
  private FTValList args = new FTValList();
  private String output;
  public Deleteworkflowhistory set(String name, String value) { args.setValString(name,value); return this; }

  public Deleteworkflowhistory() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.DELETEWORKFLOWHISTORY", args); 
      log.trace(ftValList2String("Deleteworkflowhistory", args));
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
  public Deleteworkflowhistory set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteworkflowhistory deleteworkflowhistory() {
  return new Deleteworkflowhistory();
}


  public static class Executetimedactions {
  private FTValList args = new FTValList();
  private String output;
  public Executetimedactions set(String name, String value) { args.setValString(name,value); return this; }

  public Executetimedactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.EXECUTETIMEDACTIONS", args); 
      log.trace(ftValList2String("Executetimedactions", args));
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
  public Executetimedactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Executetimedactions executetimedactions() {
  return new Executetimedactions();
}


  public static class Getabsdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Getabsdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Getabsdeadline object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getabsdeadline varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getabsdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETABSDEADLINE", args); 
      log.trace(ftValList2String("Getabsdeadline", args));
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
  public Getabsdeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getabsdeadline getabsdeadline() {
  return new Getabsdeadline();
}


  public static class Getaddobjecttogroupcandidateassignees {
  private FTValList args = new FTValList();
  private String output;
  public Getaddobjecttogroupcandidateassignees set(String name, String value) { args.setValString(name,value); return this; }
 public Getaddobjecttogroupcandidateassignees site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getaddobjecttogroupcandidateassignees id(String val) { args.setValString("ID", val); return this; } 
      
 public Getaddobjecttogroupcandidateassignees objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getaddobjecttogroupcandidateassignees object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Getaddobjecttogroupcandidateassignees() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETADDOBJECTTOGROUPCANDIDATEASSIGNEES", args); 
      log.trace(ftValList2String("Getaddobjecttogroupcandidateassignees", args));
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
  public Getaddobjecttogroupcandidateassignees set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getaddobjecttogroupcandidateassignees getaddobjecttogroupcandidateassignees() {
  return new Getaddobjecttogroupcandidateassignees();
}


  public static class Getallfunctions {
  private FTValList args = new FTValList();
  private String output;
  public Getallfunctions set(String name, String value) { args.setValString(name,value); return this; }
 public Getallfunctions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getallfunctions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETALLFUNCTIONS", args); 
      log.trace(ftValList2String("Getallfunctions", args));
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
  public Getallfunctions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallfunctions getallfunctions() {
  return new Getallfunctions();
}


  public static class Getallprocesses {
  private FTValList args = new FTValList();
  private String output;
  public Getallprocesses set(String name, String value) { args.setValString(name,value); return this; }
 public Getallprocesses prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getallprocesses pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public Getallprocesses assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
  public Getallprocesses() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETALLPROCESSES", args); 
      log.trace(ftValList2String("Getallprocesses", args));
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
  public Getallprocesses set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallprocesses getallprocesses() {
  return new Getallprocesses();
}


  public static class Getallstates {
  private FTValList args = new FTValList();
  private String output;
  public Getallstates set(String name, String value) { args.setValString(name,value); return this; }
 public Getallstates prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getallstates() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETALLSTATES", args); 
      log.trace(ftValList2String("Getallstates", args));
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
  public Getallstates set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallstates getallstates() {
  return new Getallstates();
}


  public static class Getallstatesforprocess {
  private FTValList args = new FTValList();
  private String output;
  public Getallstatesforprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Getallstatesforprocess prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getallstatesforprocess process(String val) { args.setValString("PROCESS", val); return this; } 
      
  public Getallstatesforprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETALLSTATESFORPROCESS", args); 
      log.trace(ftValList2String("Getallstatesforprocess", args));
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
  public Getallstatesforprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallstatesforprocess getallstatesforprocess() {
  return new Getallstatesforprocess();
}


  public static class Getassignmentactionid {
  private FTValList args = new FTValList();
  private String output;
  public Getassignmentactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignmentactionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getassignmentactionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getassignmentactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETASSIGNMENTACTIONID", args); 
      log.trace(ftValList2String("Getassignmentactionid", args));
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
  public Getassignmentactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignmentactionid getassignmentactionid() {
  return new Getassignmentactionid();
}


  public static class Getassignmentactionname {
  private FTValList args = new FTValList();
  private String output;
  public Getassignmentactionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignmentactionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassignmentactionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getassignmentactionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETASSIGNMENTACTIONNAME", args); 
      log.trace(ftValList2String("Getassignmentactionname", args));
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
  public Getassignmentactionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignmentactionname getassignmentactionname() {
  return new Getassignmentactionname();
}


  public static class Getassignmentid {
  private FTValList args = new FTValList();
  private String output;
  public Getassignmentid set(String name, String value) { args.setValString(name,value); return this; }
 public Getassignmentid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getassignmentid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getassignmentid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETASSIGNMENTID", args); 
      log.trace(ftValList2String("Getassignmentid", args));
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
  public Getassignmentid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassignmentid getassignmentid() {
  return new Getassignmentid();
}


  public static class Getavailableassignmentactions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailableassignmentactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailableassignmentactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailableassignmentactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLEASSIGNMENTACTIONS", args); 
      log.trace(ftValList2String("Getavailableassignmentactions", args));
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
  public Getavailableassignmentactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailableassignmentactions getavailableassignmentactions() {
  return new Getavailableassignmentactions();
}


  public static class Getavailableconditions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailableconditions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailableconditions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailableconditions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLECONDITIONS", args); 
      log.trace(ftValList2String("Getavailableconditions", args));
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
  public Getavailableconditions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailableconditions getavailableconditions() {
  return new Getavailableconditions();
}


  public static class Getavailabledeadlockactions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailabledeadlockactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailabledeadlockactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailabledeadlockactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLEDEADLOCKACTIONS", args); 
      log.trace(ftValList2String("Getavailabledeadlockactions", args));
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
  public Getavailabledeadlockactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailabledeadlockactions getavailabledeadlockactions() {
  return new Getavailabledeadlockactions();
}


  public static class Getavailabledelegateactions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailabledelegateactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailabledelegateactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailabledelegateactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLEDELEGATEACTIONS", args); 
      log.trace(ftValList2String("Getavailabledelegateactions", args));
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
  public Getavailabledelegateactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailabledelegateactions getavailabledelegateactions() {
  return new Getavailabledelegateactions();
}


  public static class Getavailablegroupactions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailablegroupactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailablegroupactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailablegroupactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLEGROUPACTIONS", args); 
      log.trace(ftValList2String("Getavailablegroupactions", args));
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
  public Getavailablegroupactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailablegroupactions getavailablegroupactions() {
  return new Getavailablegroupactions();
}


  public static class Getavailablegroups {
  private FTValList args = new FTValList();
  private String output;
  public Getavailablegroups set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailablegroups prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getavailablegroups pubid(String val) { args.setValString("PUBID", val); return this; } 
      
 public Getavailablegroups groupids(String val) { args.setValString("GROUPIDS", val); return this; } 
      
  public Getavailablegroups() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLEGROUPS", args); 
      log.trace(ftValList2String("Getavailablegroups", args));
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
  public Getavailablegroups set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailablegroups getavailablegroups() {
  return new Getavailablegroups();
}


  public static class Getavailablestepactions {
  private FTValList args = new FTValList();
  private String output;
  public Getavailablestepactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getavailablestepactions prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getavailablestepactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETAVAILABLESTEPACTIONS", args); 
      log.trace(ftValList2String("Getavailablestepactions", args));
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
  public Getavailablestepactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getavailablestepactions getavailablestepactions() {
  return new Getavailablestepactions();
}


  public static class Getblockingreason {
  private FTValList args = new FTValList();
  private String output;
  public Getblockingreason set(String name, String value) { args.setValString(name,value); return this; }
 public Getblockingreason id(String val) { args.setValString("ID", val); return this; } 
      
 public Getblockingreason site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getblockingreason nextstep(String val) { args.setValString("NEXTSTEP", val); return this; } 
      
 public Getblockingreason varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getblockingreason() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETBLOCKINGREASON", args); 
      log.trace(ftValList2String("Getblockingreason", args));
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
  public Getblockingreason set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getblockingreason getblockingreason() {
  return new Getblockingreason();
}


  public static class Getcompleteassignmentcandidateassignees {
  private FTValList args = new FTValList();
  private String output;
  public Getcompleteassignmentcandidateassignees set(String name, String value) { args.setValString(name,value); return this; }
 public Getcompleteassignmentcandidateassignees site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getcompleteassignmentcandidateassignees nextstep(String val) { args.setValString("NEXTSTEP", val); return this; } 
      
 public Getcompleteassignmentcandidateassignees objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getcompleteassignmentcandidateassignees id(String val) { args.setValString("ID", val); return this; } 
      
  public Getcompleteassignmentcandidateassignees() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETCOMPLETEASSIGNMENTCANDIDATEASSIGNEES", args); 
      log.trace(ftValList2String("Getcompleteassignmentcandidateassignees", args));
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
  public Getcompleteassignmentcandidateassignees set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcompleteassignmentcandidateassignees getcompleteassignmentcandidateassignees() {
  return new Getcompleteassignmentcandidateassignees();
}


  public static class Getconditionid {
  private FTValList args = new FTValList();
  private String output;
  public Getconditionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getconditionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getconditionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getconditionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETCONDITIONID", args); 
      log.trace(ftValList2String("Getconditionid", args));
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
  public Getconditionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getconditionid getconditionid() {
  return new Getconditionid();
}


  public static class Getconditionname {
  private FTValList args = new FTValList();
  private String output;
  public Getconditionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getconditionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getconditionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getconditionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETCONDITIONNAME", args); 
      log.trace(ftValList2String("Getconditionname", args));
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
  public Getconditionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getconditionname getconditionname() {
  return new Getconditionname();
}


  public static class Getdeadlockactionid {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadlockactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadlockactionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getdeadlockactionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdeadlockactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETDEADLOCKACTIONID", args); 
      log.trace(ftValList2String("Getdeadlockactionid", args));
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
  public Getdeadlockactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeadlockactionid getdeadlockactionid() {
  return new Getdeadlockactionid();
}


  public static class Getdeadlockactionname {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadlockactionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadlockactionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeadlockactionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdeadlockactionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETDEADLOCKACTIONNAME", args); 
      log.trace(ftValList2String("Getdeadlockactionname", args));
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
  public Getdeadlockactionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeadlockactionname getdeadlockactionname() {
  return new Getdeadlockactionname();
}


  public static class Getdelegateactionid {
  private FTValList args = new FTValList();
  private String output;
  public Getdelegateactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getdelegateactionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getdelegateactionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdelegateactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETDELEGATEACTIONID", args); 
      log.trace(ftValList2String("Getdelegateactionid", args));
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
  public Getdelegateactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdelegateactionid getdelegateactionid() {
  return new Getdelegateactionid();
}


  public static class Getdelegateactionname {
  private FTValList args = new FTValList();
  private String output;
  public Getdelegateactionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getdelegateactionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdelegateactionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdelegateactionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETDELEGATEACTIONNAME", args); 
      log.trace(ftValList2String("Getdelegateactionname", args));
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
  public Getdelegateactionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdelegateactionname getdelegateactionname() {
  return new Getdelegateactionname();
}


  public static class Getdelegateecandidates {
  private FTValList args = new FTValList();
  private String output;
  public Getdelegateecandidates set(String name, String value) { args.setValString(name,value); return this; }
 public Getdelegateecandidates id(String val) { args.setValString("ID", val); return this; } 
      
 public Getdelegateecandidates site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getdelegateecandidates listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getdelegateecandidates() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETDELEGATEECANDIDATES", args); 
      log.trace(ftValList2String("Getdelegateecandidates", args));
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
  public Getdelegateecandidates set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdelegateecandidates getdelegateecandidates() {
  return new Getdelegateecandidates();
}


  public static class Getfilteredassignments {
  private FTValList args = new FTValList();
  private String output;
  public Getfilteredassignments set(String name, String value) { args.setValString(name,value); return this; }
 public Getfilteredassignments prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getfilteredassignments site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getfilteredassignments objectprefix(String val) { args.setValString("OBJECTPREFIX", val); return this; } 
      
 public Getfilteredassignments limitassigneeroles(String val) { args.setValString("LIMITASSIGNEEROLES", val); return this; } 
      
 public Getfilteredassignments object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getfilteredassignments processstatus(String val) { args.setValString("PROCESSSTATUS", val); return this; } 
      
 public Getfilteredassignments notprocessstatus(String val) { args.setValString("NOTPROCESSSTATUS", val); return this; } 
      
 public Getfilteredassignments status(String val) { args.setValString("STATUS", val); return this; } 
      
 public Getfilteredassignments notstatus(String val) { args.setValString("NOTSTATUS", val); return this; } 
      
 public Getfilteredassignments disposition(String val) { args.setValString("DISPOSITION", val); return this; } 
      
 public Getfilteredassignments stateid(String val) { args.setValString("STATEID", val); return this; } 
      
 public Getfilteredassignments groupid(String val) { args.setValString("GROUPID", val); return this; } 
      
 public Getfilteredassignments notgroupid(String val) { args.setValString("NOTGROUPID", val); return this; } 
      
 public Getfilteredassignments assignedto(String val) { args.setValString("ASSIGNEDTO", val); return this; } 
      
 public Getfilteredassignments notassignedto(String val) { args.setValString("NOTASSIGNEDTO", val); return this; } 
      
 public Getfilteredassignments assignedby(String val) { args.setValString("ASSIGNEDBY", val); return this; } 
      
 public Getfilteredassignments disposer(String val) { args.setValString("DISPOSER", val); return this; } 
      
 public Getfilteredassignments assigneddatebefore(String val) { args.setValString("ASSIGNEDDATEBEFORE", val); return this; } 
      
 public Getfilteredassignments assigneddateafter(String val) { args.setValString("ASSIGNEDDATEAFTER", val); return this; } 
      
 public Getfilteredassignments disposeddatebefore(String val) { args.setValString("DISPOSEDDATEBEFORE", val); return this; } 
      
 public Getfilteredassignments disposeddateafter(String val) { args.setValString("DISPOSEDDATEAFTER", val); return this; } 
      
 public Getfilteredassignments overdue(String val) { args.setValString("OVERDUE", val); return this; } 
      
 public Getfilteredassignments overduemins(String val) { args.setValString("OVERDUEMINS", val); return this; } 
      
 public Getfilteredassignments processoverdue(String val) { args.setValString("PROCESSOVERDUE", val); return this; } 
      
 public Getfilteredassignments processoverduemins(String val) { args.setValString("PROCESSOVERDUEMINS", val); return this; } 
      
 public Getfilteredassignments deadlocked(String val) { args.setValString("DEADLOCKED", val); return this; } 
      
 public Getfilteredassignments process(String val) { args.setValString("PROCESS", val); return this; } 
      
 public Getfilteredassignments descending(String val) { args.setValString("DESCENDING", val); return this; } 
      
 public Getfilteredassignments sortstyle(String val) { args.setValString("SORTSTYLE", val); return this; } 
      
 public Getfilteredassignments excludecomments(String val) { args.setValString("EXCLUDECOMMENTS", val); return this; } 
      
  public Getfilteredassignments() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETFILTEREDASSIGNMENTS", args); 
      log.trace(ftValList2String("Getfilteredassignments", args));
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
  public Getfilteredassignments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfilteredassignments getfilteredassignments() {
  return new Getfilteredassignments();
}


  public static class Getfunctionid {
  private FTValList args = new FTValList();
  private String output;
  public Getfunctionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getfunctionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getfunctionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getfunctionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETFUNCTIONID", args); 
      log.trace(ftValList2String("Getfunctionid", args));
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
  public Getfunctionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfunctionid getfunctionid() {
  return new Getfunctionid();
}


  public static class Getfunctionname {
  private FTValList args = new FTValList();
  private String output;
  public Getfunctionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getfunctionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getfunctionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getfunctionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETFUNCTIONNAME", args); 
      log.trace(ftValList2String("Getfunctionname", args));
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
  public Getfunctionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfunctionname getfunctionname() {
  return new Getfunctionname();
}


  public static class Getgroupactionid {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupactionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getgroupactionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getgroupactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPACTIONID", args); 
      log.trace(ftValList2String("Getgroupactionid", args));
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
  public Getgroupactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupactionid getgroupactionid() {
  return new Getgroupactionid();
}


  public static class Getgroupactionname {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupactionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupactionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupactionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getgroupactionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPACTIONNAME", args); 
      log.trace(ftValList2String("Getgroupactionname", args));
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
  public Getgroupactionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupactionname getgroupactionname() {
  return new Getgroupactionname();
}


  public static class Getgroupid {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupid set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getgroupid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getgroupid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPID", args); 
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


  public static class Getgroupmembers {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupmembers set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupmembers groupid(String val) { args.setValString("GROUPID", val); return this; } 
      
 public Getgroupmembers prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getgroupmembers() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPMEMBERS", args); 
      log.trace(ftValList2String("Getgroupmembers", args));
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
  public Getgroupmembers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupmembers getgroupmembers() {
  return new Getgroupmembers();
}


  public static class Getgroupmembership {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupmembership set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupmembership object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getgroupmembership varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getgroupmembership() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPMEMBERSHIP", args); 
      log.trace(ftValList2String("Getgroupmembership", args));
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
  public Getgroupmembership set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupmembership getgroupmembership() {
  return new Getgroupmembership();
}


  public static class Getgroupname {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupname set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getgroupname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETGROUPNAME", args); 
      log.trace(ftValList2String("Getgroupname", args));
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
  public Getgroupname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupname getgroupname() {
  return new Getgroupname();
}


  public static class Getlegalnextworkflowsteps {
  private FTValList args = new FTValList();
  private String output;
  public Getlegalnextworkflowsteps set(String name, String value) { args.setValString(name,value); return this; }
 public Getlegalnextworkflowsteps site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getlegalnextworkflowsteps object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getlegalnextworkflowsteps prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getlegalnextworkflowsteps role(String val) { args.setValString("ROLE", val); return this; } 
      
  public Getlegalnextworkflowsteps() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETLEGALNEXTWORKFLOWSTEPS", args); 
      log.trace(ftValList2String("Getlegalnextworkflowsteps", args));
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
  public Getlegalnextworkflowsteps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlegalnextworkflowsteps getlegalnextworkflowsteps() {
  return new Getlegalnextworkflowsteps();
}


  public static class Getmultisiteprocesses {
  private FTValList args = new FTValList();
  private String output;
  public Getmultisiteprocesses set(String name, String value) { args.setValString(name,value); return this; }
 public Getmultisiteprocesses prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getmultisiteprocesses pubids(String val) { args.setValString("PUBIDS", val); return this; } 
      
 public Getmultisiteprocesses assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
  public Getmultisiteprocesses() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETMULTISITEPROCESSES", args); 
      log.trace(ftValList2String("Getmultisiteprocesses", args));
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
  public Getmultisiteprocesses set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getmultisiteprocesses getmultisiteprocesses() {
  return new Getmultisiteprocesses();
}


  public static class Getobjecthistory {
  private FTValList args = new FTValList();
  private String output;
  public Getobjecthistory set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjecthistory prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getobjecthistory object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Getobjecthistory() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTHISTORY", args); 
      log.trace(ftValList2String("Getobjecthistory", args));
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
  public Getobjecthistory set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjecthistory getobjecthistory() {
  return new Getobjecthistory();
}


  public static class Getobjectparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectparticipants object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectparticipants objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getobjectparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTPARTICIPANTS", args); 
      log.trace(ftValList2String("Getobjectparticipants", args));
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
  public Getobjectparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectparticipants getobjectparticipants() {
  return new Getobjectparticipants();
}


  public static class Getpotentialparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Getpotentialparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Getpotentialparticipants process(String val) { args.setValString("PROCESS", val); return this; } 
      
 public Getpotentialparticipants site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getpotentialparticipants objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getpotentialparticipants object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Getpotentialparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETPOTENTIALPARTICIPANTS", args); 
      log.trace(ftValList2String("Getpotentialparticipants", args));
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
  public Getpotentialparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpotentialparticipants getpotentialparticipants() {
  return new Getpotentialparticipants();
}


  public static class Getobjectstateid {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectstateid set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectstateid object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectstateid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getobjectstateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTSTATEID", args); 
      log.trace(ftValList2String("Getobjectstateid", args));
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
  public Getobjectstateid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectstateid getobjectstateid() {
  return new Getobjectstateid();
}


  public static class Getprocessid {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessid set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getprocessid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getprocessid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETPROCESSID", args); 
      log.trace(ftValList2String("Getprocessid", args));
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
  public Getprocessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocessid getprocessid() {
  return new Getprocessid();
}


  public static class Getprocessname {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessname set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocessname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getprocessname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETPROCESSNAME", args); 
      log.trace(ftValList2String("Getprocessname", args));
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
  public Getprocessname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocessname getprocessname() {
  return new Getprocessname();
}


  public static class Getstartworkflowcandidateassignees {
  private FTValList args = new FTValList();
  private String output;
  public Getstartworkflowcandidateassignees set(String name, String value) { args.setValString(name,value); return this; }
 public Getstartworkflowcandidateassignees objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getstartworkflowcandidateassignees id(String val) { args.setValString("ID", val); return this; } 
      
 public Getstartworkflowcandidateassignees site(String val) { args.setValString("SITE", val); return this; } 
      
 public Getstartworkflowcandidateassignees object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Getstartworkflowcandidateassignees() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTARTWORKFLOWCANDIDATEASSIGNEES", args); 
      log.trace(ftValList2String("Getstartworkflowcandidateassignees", args));
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
  public Getstartworkflowcandidateassignees set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstartworkflowcandidateassignees getstartworkflowcandidateassignees() {
  return new Getstartworkflowcandidateassignees();
}


  public static class Getstateid {
  private FTValList args = new FTValList();
  private String output;
  public Getstateid set(String name, String value) { args.setValString(name,value); return this; }
 public Getstateid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getstateid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getstateid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTATEID", args); 
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


  public static class Getstatename {
  private FTValList args = new FTValList();
  private String output;
  public Getstatename set(String name, String value) { args.setValString(name,value); return this; }
 public Getstatename name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstatename objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getstatename() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTATENAME", args); 
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


  public static class Getstepactionid {
  private FTValList args = new FTValList();
  private String output;
  public Getstepactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Getstepactionid id(String val) { args.setValString("ID", val); return this; } 
      
 public Getstepactionid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getstepactionid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTEPACTIONID", args); 
      log.trace(ftValList2String("Getstepactionid", args));
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
  public Getstepactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstepactionid getstepactionid() {
  return new Getstepactionid();
}


  public static class Getstepactionname {
  private FTValList args = new FTValList();
  private String output;
  public Getstepactionname set(String name, String value) { args.setValString(name,value); return this; }
 public Getstepactionname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstepactionname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getstepactionname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTEPACTIONNAME", args); 
      log.trace(ftValList2String("Getstepactionname", args));
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
  public Getstepactionname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstepactionname getstepactionname() {
  return new Getstepactionname();
}


  public static class Getstepid {
  private FTValList args = new FTValList();
  private String output;
  public Getstepid set(String name, String value) { args.setValString(name,value); return this; }
 public Getstepid objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getstepid id(String val) { args.setValString("ID", val); return this; } 
      
  public Getstepid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETSTEPID", args); 
      log.trace(ftValList2String("Getstepid", args));
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
  public Getstepid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstepid getstepid() {
  return new Getstepid();
}


  public static class Isfunctionlegal {
  private FTValList args = new FTValList();
  private String output;
  public Isfunctionlegal set(String name, String value) { args.setValString(name,value); return this; }
 public Isfunctionlegal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isfunctionlegal object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Isfunctionlegal functionname(String val) { args.setValString("FUNCTIONNAME", val); return this; } 
      
 public Isfunctionlegal reasonvarname(String val) { args.setValString("REASONVARNAME", val); return this; } 
      
 public Isfunctionlegal site(String val) { args.setValString("SITE", val); return this; } 
      
 public Isfunctionlegal role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Isfunctionlegal mustbeassigned(String val) { args.setValString("MUSTBEASSIGNED", val); return this; } 
      
  public Isfunctionlegal() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISFUNCTIONLEGAL", args); 
      log.trace(ftValList2String("Isfunctionlegal", args));
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
  public Isfunctionlegal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isfunctionlegal isfunctionlegal() {
  return new Isfunctionlegal();
}


  public static class Isinitialdeadlineallowed {
  private FTValList args = new FTValList();
  private String output;
  public Isinitialdeadlineallowed set(String name, String value) { args.setValString(name,value); return this; }
 public Isinitialdeadlineallowed varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isinitialdeadlineallowed process(String val) { args.setValString("PROCESS", val); return this; } 
      
  public Isinitialdeadlineallowed() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISINITIALDEADLINEALLOWED", args); 
      log.trace(ftValList2String("Isinitialdeadlineallowed", args));
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
  public Isinitialdeadlineallowed set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isinitialdeadlineallowed isinitialdeadlineallowed() {
  return new Isinitialdeadlineallowed();
}


  public static class Isobjectassigned {
  private FTValList args = new FTValList();
  private String output;
  public Isobjectassigned set(String name, String value) { args.setValString(name,value); return this; }
 public Isobjectassigned varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isobjectassigned object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Isobjectassigned() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISOBJECTASSIGNED", args); 
      log.trace(ftValList2String("Isobjectassigned", args));
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
  public Isobjectassigned set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isobjectassigned isobjectassigned() {
  return new Isobjectassigned();
}


  public static class Isobjectassignedtogroup {
  private FTValList args = new FTValList();
  private String output;
  public Isobjectassignedtogroup set(String name, String value) { args.setValString(name,value); return this; }
 public Isobjectassignedtogroup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isobjectassignedtogroup object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Isobjectassignedtogroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISOBJECTASSIGNEDTOGROUP", args); 
      log.trace(ftValList2String("Isobjectassignedtogroup", args));
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
  public Isobjectassignedtogroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isobjectassignedtogroup isobjectassignedtogroup() {
  return new Isobjectassignedtogroup();
}


  public static class Isobjectassignedtouser {
  private FTValList args = new FTValList();
  private String output;
  public Isobjectassignedtouser set(String name, String value) { args.setValString(name,value); return this; }
 public Isobjectassignedtouser varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isobjectassignedtouser object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Isobjectassignedtouser assignedto(String val) { args.setValString("ASSIGNEDTO", val); return this; } 
      
  public Isobjectassignedtouser() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISOBJECTASSIGNEDTOUSER", args); 
      log.trace(ftValList2String("Isobjectassignedtouser", args));
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
  public Isobjectassignedtouser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isobjectassignedtouser isobjectassignedtouser() {
  return new Isobjectassignedtouser();
}


  public static class Isobjectdeadlocked {
  private FTValList args = new FTValList();
  private String output;
  public Isobjectdeadlocked set(String name, String value) { args.setValString(name,value); return this; }
 public Isobjectdeadlocked varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Isobjectdeadlocked object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Isobjectdeadlocked() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.ISOBJECTDEADLOCKED", args); 
      log.trace(ftValList2String("Isobjectdeadlocked", args));
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
  public Isobjectdeadlocked set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isobjectdeadlocked isobjectdeadlocked() {
  return new Isobjectdeadlocked();
}


  public static class Newparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Newparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Newparticipants objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Newparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.NEWPARTICIPANTS", args); 
      log.trace(ftValList2String("Newparticipants", args));
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
  public Newparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Newparticipants newparticipants() {
  return new Newparticipants();
}


  public static class Removeobjectfromgroup {
  private FTValList args = new FTValList();
  private String output;
  public Removeobjectfromgroup set(String name, String value) { args.setValString(name,value); return this; }
 public Removeobjectfromgroup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Removeobjectfromgroup object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Removeobjectfromgroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.REMOVEOBJECTFROMGROUP", args); 
      log.trace(ftValList2String("Removeobjectfromgroup", args));
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
  public Removeobjectfromgroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeobjectfromgroup removeobjectfromgroup() {
  return new Removeobjectfromgroup();
}


  public static class Setabsdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Setabsdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Setabsdeadline object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Setabsdeadline absdeadline(String val) { args.setValString("ABSDEADLINE", val); return this; } 
      
  public Setabsdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETABSDEADLINE", args); 
      log.trace(ftValList2String("Setabsdeadline", args));
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
  public Setabsdeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setabsdeadline setabsdeadline() {
  return new Setabsdeadline();
}


  public static class Setassignmentaction {
  private FTValList args = new FTValList();
  private String output;
  public Setassignmentaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setassignmentaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setassignmentaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETASSIGNMENTACTION", args); 
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


  public static class Setassignmentdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Setassignmentdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Setassignmentdeadline id(String val) { args.setValString("ID", val); return this; } 
      
 public Setassignmentdeadline deadline(String val) { args.setValString("DEADLINE", val); return this; } 
      
  public Setassignmentdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETASSIGNMENTDEADLINE", args); 
      log.trace(ftValList2String("Setassignmentdeadline", args));
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
  public Setassignmentdeadline set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setassignmentdeadline setassignmentdeadline() {
  return new Setassignmentdeadline();
}


  public static class Setcondition {
  private FTValList args = new FTValList();
  private String output;
  public Setcondition set(String name, String value) { args.setValString(name,value); return this; }
 public Setcondition object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setcondition() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETCONDITION", args); 
      log.trace(ftValList2String("Setcondition", args));
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
  public Setcondition set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setcondition setcondition() {
  return new Setcondition();
}


  public static class Setdeadlockaction {
  private FTValList args = new FTValList();
  private String output;
  public Setdeadlockaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setdeadlockaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setdeadlockaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETDEADLOCKACTION", args); 
      log.trace(ftValList2String("Setdeadlockaction", args));
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
  public Setdeadlockaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdeadlockaction setdeadlockaction() {
  return new Setdeadlockaction();
}


  public static class Setdelegateaction {
  private FTValList args = new FTValList();
  private String output;
  public Setdelegateaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setdelegateaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setdelegateaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETDELEGATEACTION", args); 
      log.trace(ftValList2String("Setdelegateaction", args));
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
  public Setdelegateaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdelegateaction setdelegateaction() {
  return new Setdelegateaction();
}


  public static class Setfunction {
  private FTValList args = new FTValList();
  private String output;
  public Setfunction set(String name, String value) { args.setValString(name,value); return this; }
 public Setfunction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setfunction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETFUNCTION", args); 
      log.trace(ftValList2String("Setfunction", args));
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
  public Setfunction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setfunction setfunction() {
  return new Setfunction();
}


  public static class Setgroup {
  private FTValList args = new FTValList();
  private String output;
  public Setgroup set(String name, String value) { args.setValString(name,value); return this; }
 public Setgroup object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setgroup() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETGROUP", args); 
      log.trace(ftValList2String("Setgroup", args));
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
  public Setgroup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setgroup setgroup() {
  return new Setgroup();
}


  public static class Setgroupaction {
  private FTValList args = new FTValList();
  private String output;
  public Setgroupaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setgroupaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setgroupaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETGROUPACTION", args); 
      log.trace(ftValList2String("Setgroupaction", args));
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
  public Setgroupaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setgroupaction setgroupaction() {
  return new Setgroupaction();
}


  public static class Setobjectparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Setobjectparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Setobjectparticipants object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Setobjectparticipants participants(String val) { args.setValString("PARTICIPANTS", val); return this; } 
      
  public Setobjectparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETOBJECTPARTICIPANTS", args); 
      log.trace(ftValList2String("Setobjectparticipants", args));
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
  public Setobjectparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setobjectparticipants setobjectparticipants() {
  return new Setobjectparticipants();
}


  public static class Setprocess {
  private FTValList args = new FTValList();
  private String output;
  public Setprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Setprocess object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETPROCESS", args); 
      log.trace(ftValList2String("Setprocess", args));
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
  public Setprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setprocess setprocess() {
  return new Setprocess();
}


  public static class Setstate {
  private FTValList args = new FTValList();
  private String output;
  public Setstate set(String name, String value) { args.setValString(name,value); return this; }
 public Setstate object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setstate() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETSTATE", args); 
      log.trace(ftValList2String("Setstate", args));
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
  public Setstate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstate setstate() {
  return new Setstate();
}


  public static class Setstepaction {
  private FTValList args = new FTValList();
  private String output;
  public Setstepaction set(String name, String value) { args.setValString(name,value); return this; }
 public Setstepaction object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setstepaction() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.SETSTEPACTION", args); 
      log.trace(ftValList2String("Setstepaction", args));
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
  public Setstepaction set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setstepaction setstepaction() {
  return new Setstepaction();
}


  public static class Startobjectworkflowprocess {
  private FTValList args = new FTValList();
  private String output;
  public Startobjectworkflowprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Startobjectworkflowprocess object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Startobjectworkflowprocess site(String val) { args.setValString("SITE", val); return this; } 
      
 public Startobjectworkflowprocess id(String val) { args.setValString("ID", val); return this; } 
      
 public Startobjectworkflowprocess comment(String val) { args.setValString("COMMENT", val); return this; } 
      
 public Startobjectworkflowprocess assignmentlist(String val) { args.setValString("ASSIGNMENTLIST", val); return this; } 
      
 public Startobjectworkflowprocess deadline(String val) { args.setValString("DEADLINE", val); return this; } 
      
 public Startobjectworkflowprocess absdeadline(String val) { args.setValString("ABSDEADLINE", val); return this; } 
      
 public Startobjectworkflowprocess participants(String val) { args.setValString("PARTICIPANTS", val); return this; } 
      
  public Startobjectworkflowprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.STARTOBJECTWORKFLOWPROCESS", args); 
      log.trace(ftValList2String("Startobjectworkflowprocess", args));
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
  public Startobjectworkflowprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Startobjectworkflowprocess startobjectworkflowprocess() {
  return new Startobjectworkflowprocess();
}


  public static class Getobjectworkflows {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectworkflows set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectworkflows object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectworkflows listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getobjectworkflows() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTWORKFLOWS", args); 
      log.trace(ftValList2String("Getobjectworkflows", args));
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
  public Getobjectworkflows set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectworkflows getobjectworkflows() {
  return new Getobjectworkflows();
}


  public static class Getobjectworkflowprocess {
  private FTValList args = new FTValList();
  private String output;
  public Getobjectworkflowprocess set(String name, String value) { args.setValString(name,value); return this; }
 public Getobjectworkflowprocess object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Getobjectworkflowprocess varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getobjectworkflowprocess() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWENGINE.GETOBJECTWORKFLOWPROCESS", args); 
      log.trace(ftValList2String("Getobjectworkflowprocess", args));
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
  public Getobjectworkflowprocess set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getobjectworkflowprocess getobjectworkflowprocess() {
  return new Getobjectworkflowprocess();
}

}
