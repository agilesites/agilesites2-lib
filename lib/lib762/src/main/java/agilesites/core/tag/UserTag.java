package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class UserTag  {    
  private static Log log = Log.getLog(UserTag.class);  
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
    
 
  public static class Add {
  private FTValList args = new FTValList();
  private String output;
  public Add set(String name, String value) { args.setValString(name,value); return this; }
 public Add username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Add password(String val) { args.setValString("PASSWORD", val); return this; } 
      
 public Add acl(String val) { args.setValString("ACL", val); return this; } 
      
  public Add() { }
  public int run(ICS ics) { 
      ics.runTag("USER.ADD", args); 
      log.trace(ftValList2String("Add", args));
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
  public Add set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Add add() {
  return new Add();
}


  public static class Changepassword {
  private FTValList args = new FTValList();
  private String output;
  public Changepassword set(String name, String value) { args.setValString(name,value); return this; }
 public Changepassword password1(String val) { args.setValString("PASSWORD1", val); return this; } 
      
 public Changepassword password2(String val) { args.setValString("PASSWORD2", val); return this; } 
      
  public Changepassword() { }
  public int run(ICS ics) { 
      ics.runTag("USER.CHANGEPASSWORD", args); 
      log.trace(ftValList2String("Changepassword", args));
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
  public Changepassword set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Changepassword changepassword() {
  return new Changepassword();
}


  public static class Delete {
  private FTValList args = new FTValList();
  private String output;
  public Delete set(String name, String value) { args.setValString(name,value); return this; }
 public Delete username(String val) { args.setValString("USERNAME", val); return this; } 
      
  public Delete() { }
  public int run(ICS ics) { 
      ics.runTag("USER.DELETE", args); 
      log.trace(ftValList2String("Delete", args));
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
  public Delete set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Delete delete() {
  return new Delete();
}


  public static class Login {
  private FTValList args = new FTValList();
  private String output;
  public Login set(String name, String value) { args.setValString(name,value); return this; }
 public Login username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Login password(String val) { args.setValString("PASSWORD", val); return this; } 
      
  public Login() { }
  public int run(ICS ics) { 
      ics.runTag("USER.LOGIN", args); 
      log.trace(ftValList2String("Login", args));
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
  public Login set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Login login() {
  return new Login();
}


  public static class Logout {
  private FTValList args = new FTValList();
  private String output;
  public Logout set(String name, String value) { args.setValString(name,value); return this; }

  public Logout() { }
  public int run(ICS ics) { 
      ics.runTag("USER.LOGOUT", args); 
      log.trace(ftValList2String("Logout", args));
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
  public Logout set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Logout logout() {
  return new Logout();
}


  public static class Modify {
  private FTValList args = new FTValList();
  private String output;
  public Modify set(String name, String value) { args.setValString(name,value); return this; }
 public Modify username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Modify password(String val) { args.setValString("PASSWORD", val); return this; } 
      
 public Modify acl(String val) { args.setValString("ACL", val); return this; } 
      
  public Modify() { }
  public int run(ICS ics) { 
      ics.runTag("USER.MODIFY", args); 
      log.trace(ftValList2String("Modify", args));
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
  public Modify set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Modify modify() {
  return new Modify();
}


  public static class Su {
  private FTValList args = new FTValList();
  private String output;
  public Su set(String name, String value) { args.setValString(name,value); return this; }
 public Su username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Su password(String val) { args.setValString("PASSWORD", val); return this; } 
      
  public Su() { }
  public int run(ICS ics) { 
      ics.runTag("USER.SU", args); 
      log.trace(ftValList2String("Su", args));
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
  public Su set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Su su() {
  return new Su();
}

}
