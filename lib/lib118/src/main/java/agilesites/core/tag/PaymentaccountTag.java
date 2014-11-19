package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class PaymentaccountTag  {    
  private static Log log = Log.getLog(PaymentaccountTag.class);  
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
      ics.runTag("PAYMENTACCOUNT.ARGUMENT", args); 
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


  public static class Tostring {
  private FTValList args = new FTValList();
  private String output;
  public Tostring set(String name, String value) { args.setValString(name,value); return this; }
 public Tostring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Tostring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Tostring() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.TOSTRING", args); 
      log.trace(ftValList2String("Tostring", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Tostring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Tostring tostring() {
  return new Tostring();
}


  public static class Fromstring {
  private FTValList args = new FTValList();
  private String output;
  public Fromstring set(String name, String value) { args.setValString(name,value); return this; }
 public Fromstring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fromstring value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Fromstring() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.FROMSTRING", args); 
      log.trace(ftValList2String("Fromstring", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Fromstring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fromstring fromstring() {
  return new Fromstring();
}


  public static class Getuserid {
  private FTValList args = new FTValList();
  private String output;
  public Getuserid set(String name, String value) { args.setValString(name,value); return this; }
 public Getuserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getuserid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getuserid() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETUSERID", args); 
      log.trace(ftValList2String("Getuserid", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getuserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuserid getuserid() {
  return new Getuserid();
}


  public static class Setuserid {
  private FTValList args = new FTValList();
  private String output;
  public Setuserid set(String name, String value) { args.setValString(name,value); return this; }
 public Setuserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setuserid userid(String val) { args.setValString("USERID", val); return this; } 
      
  public Setuserid() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.SETUSERID", args); 
      log.trace(ftValList2String("Setuserid", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setuserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setuserid setuserid() {
  return new Setuserid();
}


  public static class Getaccountid {
  private FTValList args = new FTValList();
  private String output;
  public Getaccountid set(String name, String value) { args.setValString(name,value); return this; }
 public Getaccountid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getaccountid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getaccountid() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETACCOUNTID", args); 
      log.trace(ftValList2String("Getaccountid", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getaccountid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getaccountid getaccountid() {
  return new Getaccountid();
}


  public static class Geterrors {
  private FTValList args = new FTValList();
  private String output;
  public Geterrors set(String name, String value) { args.setValString(name,value); return this; }
 public Geterrors name(String val) { args.setValString("NAME", val); return this; } 
      
 public Geterrors listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Geterrors() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETERRORS", args); 
      log.trace(ftValList2String("Geterrors", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Geterrors set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Geterrors geterrors() {
  return new Geterrors();
}


  public static class Getparameter {
  private FTValList args = new FTValList();
  private String output;
  public Getparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Getparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparameter varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getparameter parameter(String val) { args.setValString("PARAMETER", val); return this; } 
      
  public Getparameter() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETPARAMETER", args); 
      log.trace(ftValList2String("Getparameter", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getparameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparameter getparameter() {
  return new Getparameter();
}


  public static class Getparameters {
  private FTValList args = new FTValList();
  private String output;
  public Getparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Getparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparameters listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getparameters() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETPARAMETERS", args); 
      log.trace(ftValList2String("Getparameters", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparameters getparameters() {
  return new Getparameters();
}


  public static class Setparameter {
  private FTValList args = new FTValList();
  private String output;
  public Setparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Setparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparameter parameter(String val) { args.setValString("PARAMETER", val); return this; } 
      
 public Setparameter value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setparameter() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.SETPARAMETER", args); 
      log.trace(ftValList2String("Setparameter", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setparameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparameter setparameter() {
  return new Setparameter();
}


  public static class Setparameters {
  private FTValList args = new FTValList();
  private String output;
  public Setparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Setparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparameters list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setparameters() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.SETPARAMETERS", args); 
      log.trace(ftValList2String("Setparameters", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparameters setparameters() {
  return new Setparameters();
}


  public static class Clear {
  private FTValList args = new FTValList();
  private String output;
  public Clear set(String name, String value) { args.setValString(name,value); return this; }
 public Clear name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clear() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.CLEAR", args); 
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


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.CREATE", args); 
      log.trace(ftValList2String("Create", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Create set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Create create() {
  return new Create();
}


  public static class Getlegalparametervalues {
  private FTValList args = new FTValList();
  private String output;
  public Getlegalparametervalues set(String name, String value) { args.setValString(name,value); return this; }
 public Getlegalparametervalues name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlegalparametervalues parameter(String val) { args.setValString("PARAMETER", val); return this; } 
      
 public Getlegalparametervalues listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getlegalparametervalues() { }
  public int run(ICS ics) { 
      ics.runTag("PAYMENTACCOUNT.GETLEGALPARAMETERVALUES", args); 
      log.trace(ftValList2String("Getlegalparametervalues", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getlegalparametervalues set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlegalparametervalues getlegalparametervalues() {
  return new Getlegalparametervalues();
}

}
