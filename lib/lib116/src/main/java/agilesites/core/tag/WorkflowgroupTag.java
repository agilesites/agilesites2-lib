package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WorkflowgroupTag  {    
  private static Log log = Log.getLog(WorkflowgroupTag.class);  
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
      ics.runTag("WORKFLOWGROUP.SCATTER", args); 
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
      ics.runTag("WORKFLOWGROUP.GATHER", args); 
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
      ics.runTag("WORKFLOWGROUP.GETID", args); 
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
      ics.runTag("WORKFLOWGROUP.GETNAME", args); 
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
      ics.runTag("WORKFLOWGROUP.SETNAME", args); 
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


  public static class Getdescription {
  private FTValList args = new FTValList();
  private String output;
  public Getdescription set(String name, String value) { args.setValString(name,value); return this; }
 public Getdescription name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdescription varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdescription() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETDESCRIPTION", args); 
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
      ics.runTag("WORKFLOWGROUP.SETDESCRIPTION", args); 
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


  public static class Getworkflowprocessid {
  private FTValList args = new FTValList();
  private String output;
  public Getworkflowprocessid set(String name, String value) { args.setValString(name,value); return this; }
 public Getworkflowprocessid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getworkflowprocessid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getworkflowprocessid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETWORKFLOWPROCESSID", args); 
      log.trace(ftValList2String("Getworkflowprocessid", args));
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
  public Getworkflowprocessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getworkflowprocessid getworkflowprocessid() {
  return new Getworkflowprocessid();
}


  public static class Setworkflowprocessid {
  private FTValList args = new FTValList();
  private String output;
  public Setworkflowprocessid set(String name, String value) { args.setValString(name,value); return this; }
 public Setworkflowprocessid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setworkflowprocessid value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setworkflowprocessid() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETWORKFLOWPROCESSID", args); 
      log.trace(ftValList2String("Setworkflowprocessid", args));
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
  public Setworkflowprocessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setworkflowprocessid setworkflowprocessid() {
  return new Setworkflowprocessid();
}


  public static class Getabsdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Getabsdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Getabsdeadline name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getabsdeadline varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getabsdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETABSDEADLINE", args); 
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


  public static class Setabsdeadline {
  private FTValList args = new FTValList();
  private String output;
  public Setabsdeadline set(String name, String value) { args.setValString(name,value); return this; }
 public Setabsdeadline name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setabsdeadline absdeadline(String val) { args.setValString("ABSDEADLINE", val); return this; } 
      
  public Setabsdeadline() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETABSDEADLINE", args); 
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


  public static class Geteditroles {
  private FTValList args = new FTValList();
  private String output;
  public Geteditroles set(String name, String value) { args.setValString(name,value); return this; }
 public Geteditroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Geteditroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Geteditroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETEDITROLES", args); 
      log.trace(ftValList2String("Geteditroles", args));
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
  public Geteditroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Geteditroles geteditroles() {
  return new Geteditroles();
}


  public static class Seteditroles {
  private FTValList args = new FTValList();
  private String output;
  public Seteditroles set(String name, String value) { args.setValString(name,value); return this; }
 public Seteditroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Seteditroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Seteditroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETEDITROLES", args); 
      log.trace(ftValList2String("Seteditroles", args));
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
  public Seteditroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Seteditroles seteditroles() {
  return new Seteditroles();
}


  public static class Getdeleteroles {
  private FTValList args = new FTValList();
  private String output;
  public Getdeleteroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getdeleteroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdeleteroles objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getdeleteroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETDELETEROLES", args); 
      log.trace(ftValList2String("Getdeleteroles", args));
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
  public Getdeleteroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdeleteroles getdeleteroles() {
  return new Getdeleteroles();
}


  public static class Setdeleteroles {
  private FTValList args = new FTValList();
  private String output;
  public Setdeleteroles set(String name, String value) { args.setValString(name,value); return this; }
 public Setdeleteroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setdeleteroles object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setdeleteroles() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETDELETEROLES", args); 
      log.trace(ftValList2String("Setdeleteroles", args));
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
  public Setdeleteroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setdeleteroles setdeleteroles() {
  return new Setdeleteroles();
}


  public static class Getsites {
  private FTValList args = new FTValList();
  private String output;
  public Getsites set(String name, String value) { args.setValString(name,value); return this; }
 public Getsites name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsites objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getsites() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETSITES", args); 
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
      ics.runTag("WORKFLOWGROUP.SETSITES", args); 
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


  public static class Getgroupactions {
  private FTValList args = new FTValList();
  private String output;
  public Getgroupactions set(String name, String value) { args.setValString(name,value); return this; }
 public Getgroupactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getgroupactions objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getgroupactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETGROUPACTIONS", args); 
      log.trace(ftValList2String("Getgroupactions", args));
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
  public Getgroupactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getgroupactions getgroupactions() {
  return new Getgroupactions();
}


  public static class Setgroupactions {
  private FTValList args = new FTValList();
  private String output;
  public Setgroupactions set(String name, String value) { args.setValString(name,value); return this; }
 public Setgroupactions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setgroupactions object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setgroupactions() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETGROUPACTIONS", args); 
      log.trace(ftValList2String("Setgroupactions", args));
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
  public Setgroupactions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setgroupactions setgroupactions() {
  return new Setgroupactions();
}


  public static class Getparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Getparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Getparticipants name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparticipants objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.GETPARTICIPANTS", args); 
      log.trace(ftValList2String("Getparticipants", args));
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
  public Getparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparticipants getparticipants() {
  return new Getparticipants();
}


  public static class Setparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Setparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Setparticipants name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparticipants object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("WORKFLOWGROUP.SETPARTICIPANTS", args); 
      log.trace(ftValList2String("Setparticipants", args));
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
  public Setparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparticipants setparticipants() {
  return new Setparticipants();
}

}
