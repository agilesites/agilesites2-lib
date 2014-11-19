package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class UsermanagerTag  {    
  private static Log log = Log.getLog(UsermanagerTag.class);  
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
    
 
  public static class Getuser {
  private FTValList args = new FTValList();
  private String output;
  public Getuser set(String name, String value) { args.setValString(name,value); return this; }
 public Getuser user(String val) { args.setValString("USER", val); return this; } 
      
 public Getuser objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getuser() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETUSER", args); 
      log.trace(ftValList2String("Getuser", args));
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
  public Getuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuser getuser() {
  return new Getuser();
}


  public static class Getuserfromname {
  private FTValList args = new FTValList();
  private String output;
  public Getuserfromname set(String name, String value) { args.setValString(name,value); return this; }
 public Getuserfromname username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Getuserfromname objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getuserfromname() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETUSERFROMNAME", args); 
      log.trace(ftValList2String("Getuserfromname", args));
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
  public Getuserfromname set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuserfromname getuserfromname() {
  return new Getuserfromname();
}


  public static class Getusername {
  private FTValList args = new FTValList();
  private String output;
  public Getusername set(String name, String value) { args.setValString(name,value); return this; }
 public Getusername user(String val) { args.setValString("USER", val); return this; } 
      
 public Getusername varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getusername() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETUSERNAME", args); 
      log.trace(ftValList2String("Getusername", args));
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
  public Getusername set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getusername getusername() {
  return new Getusername();
}


  public static class Getdisplayableusername {
  private FTValList args = new FTValList();
  private String output;
  public Getdisplayableusername set(String name, String value) { args.setValString(name,value); return this; }
 public Getdisplayableusername user(String val) { args.setValString("USER", val); return this; } 
      
 public Getdisplayableusername varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdisplayableusername() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETDISPLAYABLEUSERNAME", args); 
      log.trace(ftValList2String("Getdisplayableusername", args));
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
  public Getdisplayableusername set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdisplayableusername getdisplayableusername() {
  return new Getdisplayableusername();
}


  public static class Setuser {
  private FTValList args = new FTValList();
  private String output;
  public Setuser set(String name, String value) { args.setValString(name,value); return this; }
 public Setuser object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Setuser() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.SETUSER", args); 
      log.trace(ftValList2String("Setuser", args));
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
  public Setuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setuser setuser() {
  return new Setuser();
}


  public static class Getusers {
  private FTValList args = new FTValList();
  private String output;
  public Getusers set(String name, String value) { args.setValString(name,value); return this; }
 public Getusers prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getusers role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Getusers site(String val) { args.setValString("SITE", val); return this; } 
      
  public Getusers() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETUSERS", args); 
      log.trace(ftValList2String("Getusers", args));
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
  public Getusers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getusers getusers() {
  return new Getusers();
}


  public static class Getmultisiteusers {
  private FTValList args = new FTValList();
  private String output;
  public Getmultisiteusers set(String name, String value) { args.setValString(name,value); return this; }
 public Getmultisiteusers prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getmultisiteusers role(String val) { args.setValString("ROLE", val); return this; } 
      
 public Getmultisiteusers sites(String val) { args.setValString("SITES", val); return this; } 
      
  public Getmultisiteusers() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETMULTISITEUSERS", args); 
      log.trace(ftValList2String("Getmultisiteusers", args));
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
  public Getmultisiteusers set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getmultisiteusers getmultisiteusers() {
  return new Getmultisiteusers();
}


  public static class Getuserids {
  private FTValList args = new FTValList();
  private String output;
  public Getuserids set(String name, String value) { args.setValString(name,value); return this; }
 public Getuserids prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getuserids list(String val) { args.setValString("LIST", val); return this; } 
      
  public Getuserids() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETUSERIDS", args); 
      log.trace(ftValList2String("Getuserids", args));
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
  public Getuserids set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuserids getuserids() {
  return new Getuserids();
}


  public static class Deleteuser {
  private FTValList args = new FTValList();
  private String output;
  public Deleteuser set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteuser user(String val) { args.setValString("USER", val); return this; } 
      
  public Deleteuser() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.DELETEUSER", args); 
      log.trace(ftValList2String("Deleteuser", args));
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
  public Deleteuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteuser deleteuser() {
  return new Deleteuser();
}


  public static class Deletesite {
  private FTValList args = new FTValList();
  private String output;
  public Deletesite set(String name, String value) { args.setValString(name,value); return this; }
 public Deletesite site(String val) { args.setValString("SITE", val); return this; } 
      
  public Deletesite() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.DELETESITE", args); 
      log.trace(ftValList2String("Deletesite", args));
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
  public Deletesite set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletesite deletesite() {
  return new Deletesite();
}


  public static class Loginuser {
  private FTValList args = new FTValList();
  private String output;
  public Loginuser set(String name, String value) { args.setValString(name,value); return this; }
 public Loginuser username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Loginuser password(String val) { args.setValString("PASSWORD", val); return this; } 
      
 public Loginuser varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Loginuser() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.LOGINUSER", args); 
      log.trace(ftValList2String("Loginuser", args));
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
  public Loginuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Loginuser loginuser() {
  return new Loginuser();
}


  public static class Getloginuser {
  private FTValList args = new FTValList();
  private String output;
  public Getloginuser set(String name, String value) { args.setValString(name,value); return this; }
 public Getloginuser varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getloginuser() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETLOGINUSER", args); 
      log.trace(ftValList2String("Getloginuser", args));
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
  public Getloginuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getloginuser getloginuser() {
  return new Getloginuser();
}


  public static class Getloginusername {
  private FTValList args = new FTValList();
  private String output;
  public Getloginusername set(String name, String value) { args.setValString(name,value); return this; }
 public Getloginusername varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getloginusername() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETLOGINUSERNAME", args); 
      log.trace(ftValList2String("Getloginusername", args));
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
  public Getloginusername set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getloginusername getloginusername() {
  return new Getloginusername();
}


  public static class Getlogindisplayableusername {
  private FTValList args = new FTValList();
  private String output;
  public Getlogindisplayableusername set(String name, String value) { args.setValString(name,value); return this; }
 public Getlogindisplayableusername varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getlogindisplayableusername() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.GETLOGINDISPLAYABLEUSERNAME", args); 
      log.trace(ftValList2String("Getlogindisplayableusername", args));
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
  public Getlogindisplayableusername set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlogindisplayableusername getlogindisplayableusername() {
  return new Getlogindisplayableusername();
}


  public static class Logout {
  private FTValList args = new FTValList();
  private String output;
  public Logout set(String name, String value) { args.setValString(name,value); return this; }

  public Logout() { }
  public int run(ICS ics) { 
      ics.runTag("USERMANAGER.LOGOUT", args); 
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

}
