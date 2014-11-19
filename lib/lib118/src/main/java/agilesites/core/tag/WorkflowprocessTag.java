package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowprocessTag  {    
  private static Log log = Log.getLog(WorkflowprocessTag.class);  
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
    
 
  public static class Checkprocessrequiresparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Checkprocessrequiresparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Checkprocessrequiresparticipants name(String val) { args.setValString("NAME", val); return this; } 
      
 public Checkprocessrequiresparticipants varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkprocessrequiresparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.CHECKPROCESSREQUIRESPARTICIPANTS", args); 
      log.trace(ftValList2String("Checkprocessrequiresparticipants", args));
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
  public Checkprocessrequiresparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkprocessrequiresparticipants checkprocessrequiresparticipants() {
  return new Checkprocessrequiresparticipants();
}


  public static class Scatter {
  private FTValList args = new FTValList();
  private String output;
  public Scatter set(String name, String value) { args.setValString(name,value); return this; }
 public Scatter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Scatter prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SCATTER", args); 
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
      ics.runTag("WORKFLOWPROCESS.GATHER", args); 
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
      ics.runTag("WORKFLOWPROCESS.GETID", args); 
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


  public static class Getprocessname {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessname set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocessname varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getprocessname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETPROCESSNAME", args); 
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


  public static class Setprocessname {
  private FTValList args = new FTValList();
  private String output;
  public Setprocessname set(String name, String value) { args.setValString(name,value); return this; }
 public Setprocessname name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setprocessname value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setprocessname() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETPROCESSNAME", args); 
      log.trace(ftValList2String("Setprocessname", args));
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
  public Setprocessname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setprocessname setprocessname() {
  return new Setprocessname();
}


  public static class Getprocessdescription {
  private FTValList args = new FTValList();
  private String output;
  public Getprocessdescription set(String name, String value) { args.setValString(name,value); return this; }
 public Getprocessdescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getprocessdescription varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getprocessdescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETPROCESSDESCRIPTION", args); 
      log.trace(ftValList2String("Getprocessdescription", args));
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
  public Getprocessdescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getprocessdescription getprocessdescription() {
  return new Getprocessdescription();
}


  public static class Setprocessdescription {
  private FTValList args = new FTValList();
  private String output;
  public Setprocessdescription set(String name, String value) { args.setValString(name,value); return this; }
 public Setprocessdescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setprocessdescription value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setprocessdescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETPROCESSDESCRIPTION", args); 
      log.trace(ftValList2String("Setprocessdescription", args));
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
  public Setprocessdescription set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setprocessdescription setprocessdescription() {
  return new Setprocessdescription();
}


  public static class Getdeadlinetype {
  private FTValList args = new FTValList();
  private String output;
  public Getdeadlinetype set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeadlinetype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeadlinetype varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdeadlinetype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETDEADLINETYPE", args); 
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
      
 public Setdeadlinetype value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setdeadlinetype() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETDEADLINETYPE", args); 
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


  public static class Getroles {
  private FTValList args = new FTValList();
  private String output;
  public Getroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETROLES", args); 
      log.trace(ftValList2String("Getroles", args));
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
  public Getroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getroles getroles() {
  return new Getroles();
}


  public static class Setroles {
  private FTValList args = new FTValList();
  private String output;
  public Setroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETROLES", args); 
      log.trace(ftValList2String("Setroles", args));
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
  public Setroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setroles setroles() {
  return new Setroles();
}


  public static class Getadminroles {
  private FTValList args = new FTValList();
  private String output;
  public Getadminroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getadminroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getadminroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getadminroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETADMINROLES", args); 
      log.trace(ftValList2String("Getadminroles", args));
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
  public Getadminroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getadminroles getadminroles() {
  return new Getadminroles();
}


  public static class Setadminroles {
  private FTValList args = new FTValList();
  private String output;
  public Setadminroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setadminroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setadminroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setadminroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETADMINROLES", args); 
      log.trace(ftValList2String("Setadminroles", args));
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
  public Setadminroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setadminroles setadminroles() {
  return new Setadminroles();
}


  public static class Getsites {
  private FTValList args = new FTValList();
  private String output;
  public Getsites set(String name, String value) { args.setValString(name,value); return this; }
 public Getsites name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsites objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getsites() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETSITES", args); 
      log.trace(ftValList2String("Getsites", args));
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
  public Getsites set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsites getsites() {
  return new Getsites();
}


  public static class Setsites {
  private FTValList args = new FTValList();
  private String output;
  public Setsites set(String name, String value) { args.setValString(name,value); return this; }
 public Setsites name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsites object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setsites() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETSITES", args); 
      log.trace(ftValList2String("Setsites", args));
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
  public Setsites set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsites setsites() {
  return new Setsites();
}


  public static class Gettypes {
  private FTValList args = new FTValList();
  private String output;
  public Gettypes set(String name, String value) { args.setValString(name,value); return this; }
 public Gettypes name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettypes objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Gettypes() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETTYPES", args); 
      log.trace(ftValList2String("Gettypes", args));
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
  public Gettypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettypes gettypes() {
  return new Gettypes();
}


  public static class Settypes {
  private FTValList args = new FTValList();
  private String output;
  public Settypes set(String name, String value) { args.setValString(name,value); return this; }
 public Settypes name(String val) { args.setValString("NAME", val); return this; } 
      
 public Settypes object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Settypes() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETTYPES", args); 
      log.trace(ftValList2String("Settypes", args));
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
  public Settypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Settypes settypes() {
  return new Settypes();
}


  public static class Getdelegateactions {
  private FTValList args = new FTValList();
  private String output;
  public Getdelegateactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getdelegateactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdelegateactions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdelegateactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETDELEGATEACTIONS", args); 
      log.trace(ftValList2String("Getdelegateactions", args));
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
  public Getdelegateactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdelegateactions getdelegateactions() {
  return new Getdelegateactions();
}


  public static class Setdelegateactions {
  private FTValList args = new FTValList();
  private String output;
  public Setdelegateactions set(String name, String value) { args.setValString(name,value); return this; }
 public Setdelegateactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdelegateactions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setdelegateactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETDELEGATEACTIONS", args); 
      log.trace(ftValList2String("Setdelegateactions", args));
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
  public Setdelegateactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdelegateactions setdelegateactions() {
  return new Setdelegateactions();
}


  public static class Getfunctionprivs {
  private FTValList args = new FTValList();
  private String output;
  public Getfunctionprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Getfunctionprivs name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getfunctionprivs objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getfunctionprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETFUNCTIONPRIVS", args); 
      log.trace(ftValList2String("Getfunctionprivs", args));
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
  public Getfunctionprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfunctionprivs getfunctionprivs() {
  return new Getfunctionprivs();
}


  public static class Setfunctionprivs {
  private FTValList args = new FTValList();
  private String output;
  public Setfunctionprivs set(String name, String value) { args.setValString(name,value); return this; }
 public Setfunctionprivs name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setfunctionprivs object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setfunctionprivs() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETFUNCTIONPRIVS", args); 
      log.trace(ftValList2String("Setfunctionprivs", args));
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
  public Setfunctionprivs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setfunctionprivs setfunctionprivs() {
  return new Setfunctionprivs();
}


  public static class Getsteps {
  private FTValList args = new FTValList();
  private String output;
  public Getsteps set(String name, String value) { args.setValString(name,value); return this; }
 public Getsteps name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsteps prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getsteps() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETSTEPS", args); 
      log.trace(ftValList2String("Getsteps", args));
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
  public Getsteps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsteps getsteps() {
  return new Getsteps();
}


  public static class Setsteps {
  private FTValList args = new FTValList();
  private String output;
  public Setsteps set(String name, String value) { args.setValString(name,value); return this; }
 public Setsteps name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsteps prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Setsteps() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.SETSTEPS", args); 
      log.trace(ftValList2String("Setsteps", args));
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
  public Setsteps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsteps setsteps() {
  return new Setsteps();
}


  public static class Addstep {
  private FTValList args = new FTValList();
  private String output;
  public Addstep set(String name, String value) { args.setValString(name,value); return this; }
 public Addstep name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addstep objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Addstep() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.ADDSTEP", args); 
      log.trace(ftValList2String("Addstep", args));
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
  public Addstep set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addstep addstep() {
  return new Addstep();
}


  public static class Getstep {
  private FTValList args = new FTValList();
  private String output;
  public Getstep set(String name, String value) { args.setValString(name,value); return this; }
 public Getstep name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstep objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getstep value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Getstep() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETSTEP", args); 
      log.trace(ftValList2String("Getstep", args));
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
  public Getstep set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstep getstep() {
  return new Getstep();
}


  public static class Deletestep {
  private FTValList args = new FTValList();
  private String output;
  public Deletestep set(String name, String value) { args.setValString(name,value); return this; }
 public Deletestep name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deletestep value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Deletestep() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.DELETESTEP", args); 
      log.trace(ftValList2String("Deletestep", args));
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
  public Deletestep set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletestep deletestep() {
  return new Deletestep();
}


  public static class Clearsteps {
  private FTValList args = new FTValList();
  private String output;
  public Clearsteps set(String name, String value) { args.setValString(name,value); return this; }
 public Clearsteps name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clearsteps() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.CLEARSTEPS", args); 
      log.trace(ftValList2String("Clearsteps", args));
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
  public Clearsteps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clearsteps clearsteps() {
  return new Clearsteps();
}


  public static class Getinitialstepid {
  private FTValList args = new FTValList();
  private String output;
  public Getinitialstepid set(String name, String value) { args.setValString(name,value); return this; }
 public Getinitialstepid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getinitialstepid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getinitialstepid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETINITIALSTEPID", args); 
      log.trace(ftValList2String("Getinitialstepid", args));
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
  public Getinitialstepid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getinitialstepid getinitialstepid() {
  return new Getinitialstepid();
}


  public static class Getsourceroles {
  private FTValList args = new FTValList();
  private String output;
  public Getsourceroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getsourceroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsourceroles varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getsourceroles sourcestate(String val) { args.setValString("SOURCESTATE", val); return this; } 
      
  public Getsourceroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWPROCESS.GETSOURCEROLES", args); 
      log.trace(ftValList2String("Getsourceroles", args));
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
  public Getsourceroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsourceroles getsourceroles() {
  return new Getsourceroles();
}

}
