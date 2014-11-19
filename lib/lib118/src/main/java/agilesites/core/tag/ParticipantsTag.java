package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class ParticipantsTag  {    
  private static Log log = Log.getLog(ParticipantsTag.class);  
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
      ics.runTag("PARTICIPANTS.SCATTER", args); 
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
      ics.runTag("PARTICIPANTS.GATHER", args); 
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


  public static class Clear {
  private FTValList args = new FTValList();
  private String output;
  public Clear set(String name, String value) { args.setValString(name,value); return this; }
 public Clear name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clear() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.CLEAR", args); 
      log.trace(ftValList2String("Clear", args));
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
  public Clear set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clear clear() {
  return new Clear();
}


  public static class Getallparticipants {
  private FTValList args = new FTValList();
  private String output;
  public Getallparticipants set(String name, String value) { args.setValString(name,value); return this; }
 public Getallparticipants name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallparticipants listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getallparticipants() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.GETALLPARTICIPANTS", args); 
      log.trace(ftValList2String("Getallparticipants", args));
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
  public Getallparticipants set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallparticipants getallparticipants() {
  return new Getallparticipants();
}


  public static class Getallroles {
  private FTValList args = new FTValList();
  private String output;
  public Getallroles set(String name, String value) { args.setValString(name,value); return this; }
 public Getallroles name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallroles varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getallroles() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.GETALLROLES", args); 
      log.trace(ftValList2String("Getallroles", args));
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
  public Getallroles set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallroles getallroles() {
  return new Getallroles();
}


  public static class Addparticipant {
  private FTValList args = new FTValList();
  private String output;
  public Addparticipant set(String name, String value) { args.setValString(name,value); return this; }
 public Addparticipant name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addparticipant role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Addparticipant user(String val) { args.setValString("USER", val); return this; } 
      
  public Addparticipant() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.ADDPARTICIPANT", args); 
      log.trace(ftValList2String("Addparticipant", args));
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
  public Addparticipant set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addparticipant addparticipant() {
  return new Addparticipant();
}


  public static class Removeparticipant {
  private FTValList args = new FTValList();
  private String output;
  public Removeparticipant set(String name, String value) { args.setValString(name,value); return this; }
 public Removeparticipant name(String val) { args.setValString("NAME", val); return this; } 
      
 public Removeparticipant role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Removeparticipant user(String val) { args.setValString("USER", val); return this; } 
      
  public Removeparticipant() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.REMOVEPARTICIPANT", args); 
      log.trace(ftValList2String("Removeparticipant", args));
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
  public Removeparticipant set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeparticipant removeparticipant() {
  return new Removeparticipant();
}


  public static class Getparticipantsforrole {
  private FTValList args = new FTValList();
  private String output;
  public Getparticipantsforrole set(String name, String value) { args.setValString(name,value); return this; }
 public Getparticipantsforrole name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparticipantsforrole role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Getparticipantsforrole listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getparticipantsforrole() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.GETPARTICIPANTSFORROLE", args); 
      log.trace(ftValList2String("Getparticipantsforrole", args));
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
  public Getparticipantsforrole set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparticipantsforrole getparticipantsforrole() {
  return new Getparticipantsforrole();
}


  public static class Setparticipantsforrole {
  private FTValList args = new FTValList();
  private String output;
  public Setparticipantsforrole set(String name, String value) { args.setValString(name,value); return this; }
 public Setparticipantsforrole name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparticipantsforrole role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Setparticipantsforrole list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setparticipantsforrole() { }
  public int run(ICS ics) { 
      ics.runTag("PARTICIPANTS.SETPARTICIPANTSFORROLE", args); 
      log.trace(ftValList2String("Setparticipantsforrole", args));
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
  public Setparticipantsforrole set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparticipantsforrole setparticipantsforrole() {
  return new Setparticipantsforrole();
}

}
