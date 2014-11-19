package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CommerceengineTag  {    
  private static Log log = Log.getLog(CommerceengineTag.class);  
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
    
 
  public static class Argument {
  private FTValList args = new FTValList();
  private String output;
  public Argument set(String name, String value) { args.setValString(name,value); return this; }
 public Argument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Argument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Argument() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.ARGUMENT", args); 
      log.trace(ftValList2String("Argument", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Argument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Argument argument() {
  return new Argument();
}


  public static class Checkconnection {
  private FTValList args = new FTValList();
  private String output;
  public Checkconnection set(String name, String value) { args.setValString(name,value); return this; }
 public Checkconnection varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkconnection() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.CHECKCONNECTION", args); 
      log.trace(ftValList2String("Checkconnection", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Checkconnection set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkconnection checkconnection() {
  return new Checkconnection();
}


  public static class Getstores {
  private FTValList args = new FTValList();
  private String output;
  public Getstores set(String name, String value) { args.setValString(name,value); return this; }
 public Getstores listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getstores() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETSTORES", args); 
      log.trace(ftValList2String("Getstores", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getstores set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstores getstores() {
  return new Getstores();
}


  public static class Getlocale {
  private FTValList args = new FTValList();
  private String output;
  public Getlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Getlocale varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getlocale() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETLOCALE", args); 
      log.trace(ftValList2String("Getlocale", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlocale getlocale() {
  return new Getlocale();
}


  public static class Setlocale {
  private FTValList args = new FTValList();
  private String output;
  public Setlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Setlocale locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Setlocale() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.SETLOCALE", args); 
      log.trace(ftValList2String("Setlocale", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setlocale setlocale() {
  return new Setlocale();
}


  public static class Getcurrencycode {
  private FTValList args = new FTValList();
  private String output;
  public Getcurrencycode set(String name, String value) { args.setValString(name,value); return this; }
 public Getcurrencycode storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Getcurrencycode varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getcurrencycode() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETCURRENCYCODE", args); 
      log.trace(ftValList2String("Getcurrencycode", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getcurrencycode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcurrencycode getcurrencycode() {
  return new Getcurrencycode();
}


  public static class Roundforcurrency {
  private FTValList args = new FTValList();
  private String output;
  public Roundforcurrency set(String name, String value) { args.setValString(name,value); return this; }
 public Roundforcurrency storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Roundforcurrency value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Roundforcurrency varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Roundforcurrency() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.ROUNDFORCURRENCY", args); 
      log.trace(ftValList2String("Roundforcurrency", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Roundforcurrency set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Roundforcurrency roundforcurrency() {
  return new Roundforcurrency();
}


  public static class Checkuser {
  private FTValList args = new FTValList();
  private String output;
  public Checkuser set(String name, String value) { args.setValString(name,value); return this; }
 public Checkuser username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Checkuser credential(String val) { args.setValString("CREDENTIAL", val); return this; } 
      
 public Checkuser value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Checkuser varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkuser() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.CHECKUSER", args); 
      log.trace(ftValList2String("Checkuser", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Checkuser set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkuser checkuser() {
  return new Checkuser();
}


  public static class Getcredentialtypes {
  private FTValList args = new FTValList();
  private String output;
  public Getcredentialtypes set(String name, String value) { args.setValString(name,value); return this; }
 public Getcredentialtypes userid(String val) { args.setValString("USERID", val); return this; } 
      
 public Getcredentialtypes listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getcredentialtypes() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETCREDENTIALTYPES", args); 
      log.trace(ftValList2String("Getcredentialtypes", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getcredentialtypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcredentialtypes getcredentialtypes() {
  return new Getcredentialtypes();
}


  public static class Lookupuserdata {
  private FTValList args = new FTValList();
  private String output;
  public Lookupuserdata set(String name, String value) { args.setValString(name,value); return this; }
 public Lookupuserdata username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Lookupuserdata objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Lookupuserdata() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.LOOKUPUSERDATA", args); 
      log.trace(ftValList2String("Lookupuserdata", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Lookupuserdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Lookupuserdata lookupuserdata() {
  return new Lookupuserdata();
}


  public static class Getuserdata {
  private FTValList args = new FTValList();
  private String output;
  public Getuserdata set(String name, String value) { args.setValString(name,value); return this; }
 public Getuserdata userid(String val) { args.setValString("USERID", val); return this; } 
      
 public Getuserdata objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
  public Getuserdata() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETUSERDATA", args); 
      log.trace(ftValList2String("Getuserdata", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getuserdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuserdata getuserdata() {
  return new Getuserdata();
}


  public static class Checkuserdata {
  private FTValList args = new FTValList();
  private String output;
  public Checkuserdata set(String name, String value) { args.setValString(name,value); return this; }
 public Checkuserdata object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Checkuserdata varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkuserdata() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.CHECKUSERDATA", args); 
      log.trace(ftValList2String("Checkuserdata", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Checkuserdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkuserdata checkuserdata() {
  return new Checkuserdata();
}


  public static class Commituserdata {
  private FTValList args = new FTValList();
  private String output;
  public Commituserdata set(String name, String value) { args.setValString(name,value); return this; }
 public Commituserdata object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Commituserdata varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Commituserdata() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.COMMITUSERDATA", args); 
      log.trace(ftValList2String("Commituserdata", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Commituserdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Commituserdata commituserdata() {
  return new Commituserdata();
}


  public static class Deleteuserdata {
  private FTValList args = new FTValList();
  private String output;
  public Deleteuserdata set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteuserdata userid(String val) { args.setValString("USERID", val); return this; } 
      
  public Deleteuserdata() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.DELETEUSERDATA", args); 
      log.trace(ftValList2String("Deleteuserdata", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Deleteuserdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteuserdata deleteuserdata() {
  return new Deleteuserdata();
}


  public static class Checkcart {
  private FTValList args = new FTValList();
  private String output;
  public Checkcart set(String name, String value) { args.setValString(name,value); return this; }
 public Checkcart object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Checkcart varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Checkcart storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Checkcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.CHECKCART", args); 
      log.trace(ftValList2String("Checkcart", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Checkcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkcart checkcart() {
  return new Checkcart();
}


  public static class Commitcart {
  private FTValList args = new FTValList();
  private String output;
  public Commitcart set(String name, String value) { args.setValString(name,value); return this; }
 public Commitcart object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Commitcart varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Commitcart storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Commitcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.COMMITCART", args); 
      log.trace(ftValList2String("Commitcart", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Commitcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Commitcart commitcart() {
  return new Commitcart();
}


  public static class Getordersummary {
  private FTValList args = new FTValList();
  private String output;
  public Getordersummary set(String name, String value) { args.setValString(name,value); return this; }
 public Getordersummary userid(String val) { args.setValString("USERID", val); return this; } 
      
 public Getordersummary listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getordersummary startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
 public Getordersummary enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Getordersummary list(String val) { args.setValString("LIST", val); return this; } 
      
  public Getordersummary() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETORDERSUMMARY", args); 
      log.trace(ftValList2String("Getordersummary", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getordersummary set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getordersummary getordersummary() {
  return new Getordersummary();
}


  public static class Getorders {
  private FTValList args = new FTValList();
  private String output;
  public Getorders set(String name, String value) { args.setValString(name,value); return this; }
 public Getorders list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getorders prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Getorders() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETORDERS", args); 
      log.trace(ftValList2String("Getorders", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getorders set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getorders getorders() {
  return new Getorders();
}


  public static class Getpaymentaccountsummary {
  private FTValList args = new FTValList();
  private String output;
  public Getpaymentaccountsummary set(String name, String value) { args.setValString(name,value); return this; }
 public Getpaymentaccountsummary list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getpaymentaccountsummary userid(String val) { args.setValString("USERID", val); return this; } 
      
 public Getpaymentaccountsummary listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getpaymentaccountsummary() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETPAYMENTACCOUNTSUMMARY", args); 
      log.trace(ftValList2String("Getpaymentaccountsummary", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getpaymentaccountsummary set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpaymentaccountsummary getpaymentaccountsummary() {
  return new Getpaymentaccountsummary();
}


  public static class Getpaymentaccount {
  private FTValList args = new FTValList();
  private String output;
  public Getpaymentaccount set(String name, String value) { args.setValString(name,value); return this; }
 public Getpaymentaccount objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Getpaymentaccount accountid(String val) { args.setValString("ACCOUNTID", val); return this; } 
      
  public Getpaymentaccount() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.GETPAYMENTACCOUNT", args); 
      log.trace(ftValList2String("Getpaymentaccount", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getpaymentaccount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpaymentaccount getpaymentaccount() {
  return new Getpaymentaccount();
}


  public static class Checkpaymentaccount {
  private FTValList args = new FTValList();
  private String output;
  public Checkpaymentaccount set(String name, String value) { args.setValString(name,value); return this; }
 public Checkpaymentaccount object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Checkpaymentaccount varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Checkpaymentaccount() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.CHECKPAYMENTACCOUNT", args); 
      log.trace(ftValList2String("Checkpaymentaccount", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Checkpaymentaccount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Checkpaymentaccount checkpaymentaccount() {
  return new Checkpaymentaccount();
}


  public static class Commitpaymentaccount {
  private FTValList args = new FTValList();
  private String output;
  public Commitpaymentaccount set(String name, String value) { args.setValString(name,value); return this; }
 public Commitpaymentaccount object(String val) { args.setValString("OBJECT", val); return this; } 
      
 public Commitpaymentaccount varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Commitpaymentaccount() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.COMMITPAYMENTACCOUNT", args); 
      log.trace(ftValList2String("Commitpaymentaccount", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Commitpaymentaccount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Commitpaymentaccount commitpaymentaccount() {
  return new Commitpaymentaccount();
}


  public static class Deletepaymentaccount {
  private FTValList args = new FTValList();
  private String output;
  public Deletepaymentaccount set(String name, String value) { args.setValString(name,value); return this; }
 public Deletepaymentaccount accountid(String val) { args.setValString("ACCOUNTID", val); return this; } 
      
  public Deletepaymentaccount() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCEENGINE.DELETEPAYMENTACCOUNT", args); 
      log.trace(ftValList2String("Deletepaymentaccount", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Deletepaymentaccount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletepaymentaccount deletepaymentaccount() {
  return new Deletepaymentaccount();
}

}
