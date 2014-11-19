package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CsuserTag  {    
  private static Log log = Log.getLog(CsuserTag.class);  
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
      ics.runTag("CSUSER.ARGUMENT", args); 
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


  public static class Authenticate {
  private FTValList args = new FTValList();
  private String output;
  public Authenticate set(String name, String value) { args.setValString(name,value); return this; }
 public Authenticate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Authenticate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Authenticate() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.AUTHENTICATE", args); 
      log.trace(ftValList2String("Authenticate", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Authenticate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Authenticate authenticate() {
  return new Authenticate();
}


  public static class Clear {
  private FTValList args = new FTValList();
  private String output;
  public Clear set(String name, String value) { args.setValString(name,value); return this; }
 public Clear name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clear() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.CLEAR", args); 
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
      ics.runTag("CSUSER.CREATE", args); 
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


  public static class Createpmtacct {
  private FTValList args = new FTValList();
  private String output;
  public Createpmtacct set(String name, String value) { args.setValString(name,value); return this; }
 public Createpmtacct name(String val) { args.setValString("NAME", val); return this; } 
      
 public Createpmtacct varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Createpmtacct list(String val) { args.setValString("LIST", val); return this; } 
      
  public Createpmtacct() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.CREATEPMTACCT", args); 
      log.trace(ftValList2String("Createpmtacct", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Createpmtacct set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createpmtacct createpmtacct() {
  return new Createpmtacct();
}


  public static class Deletepmtacct {
  private FTValList args = new FTValList();
  private String output;
  public Deletepmtacct set(String name, String value) { args.setValString(name,value); return this; }
 public Deletepmtacct name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deletepmtacct varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Deletepmtacct id(String val) { args.setValString("ID", val); return this; } 
      
  public Deletepmtacct() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.DELETEPMTACCT", args); 
      log.trace(ftValList2String("Deletepmtacct", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Deletepmtacct set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletepmtacct deletepmtacct() {
  return new Deletepmtacct();
}


  public static class Fromstring {
  private FTValList args = new FTValList();
  private String output;
  public Fromstring set(String name, String value) { args.setValString(name,value); return this; }
 public Fromstring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fromstring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Fromstring() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.FROMSTRING", args); 
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


  public static class Getallpmtaccts {
  private FTValList args = new FTValList();
  private String output;
  public Getallpmtaccts set(String name, String value) { args.setValString(name,value); return this; }
 public Getallpmtaccts name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallpmtaccts listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getallpmtaccts() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.GETALLPMTACCTS", args); 
      log.trace(ftValList2String("Getallpmtaccts", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getallpmtaccts set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallpmtaccts getallpmtaccts() {
  return new Getallpmtaccts();
}


  public static class Geterrors {
  private FTValList args = new FTValList();
  private String output;
  public Geterrors set(String name, String value) { args.setValString(name,value); return this; }
 public Geterrors name(String val) { args.setValString("NAME", val); return this; } 
      
 public Geterrors listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Geterrors() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.GETERRORS", args); 
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


  public static class Getlegalpmtbrands {
  private FTValList args = new FTValList();
  private String output;
  public Getlegalpmtbrands set(String name, String value) { args.setValString(name,value); return this; }
 public Getlegalpmtbrands name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlegalpmtbrands listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getlegalpmtbrands() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.GETLEGALPMTBRANDS", args); 
      log.trace(ftValList2String("Getlegalpmtbrands", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getlegalpmtbrands set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlegalpmtbrands getlegalpmtbrands() {
  return new Getlegalpmtbrands();
}


  public static class Getparameter {
  private FTValList args = new FTValList();
  private String output;
  public Getparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Getparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparameter varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getparameter field(String val) { args.setValString("FIELD", val); return this; } 
      
  public Getparameter() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.GETPARAMETER", args); 
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
      ics.runTag("CSUSER.GETPARAMETERS", args); 
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


  public static class Lookup {
  private FTValList args = new FTValList();
  private String output;
  public Lookup set(String name, String value) { args.setValString(name,value); return this; }
 public Lookup name(String val) { args.setValString("NAME", val); return this; } 
      
 public Lookup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Lookup() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.LOOKUP", args); 
      log.trace(ftValList2String("Lookup", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Lookup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Lookup lookup() {
  return new Lookup();
}


  public static class Modify {
  private FTValList args = new FTValList();
  private String output;
  public Modify set(String name, String value) { args.setValString(name,value); return this; }
 public Modify name(String val) { args.setValString("NAME", val); return this; } 
      
 public Modify varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Modify() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.MODIFY", args); 
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


  public static class Modifypmtacct {
  private FTValList args = new FTValList();
  private String output;
  public Modifypmtacct set(String name, String value) { args.setValString(name,value); return this; }
 public Modifypmtacct name(String val) { args.setValString("NAME", val); return this; } 
      
 public Modifypmtacct list(String val) { args.setValString("LIST", val); return this; } 
      
 public Modifypmtacct varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Modifypmtacct() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.MODIFYPMTACCT", args); 
      log.trace(ftValList2String("Modifypmtacct", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Modifypmtacct set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Modifypmtacct modifypmtacct() {
  return new Modifypmtacct();
}


  public static class Register {
  private FTValList args = new FTValList();
  private String output;
  public Register set(String name, String value) { args.setValString(name,value); return this; }
 public Register name(String val) { args.setValString("NAME", val); return this; } 
      
 public Register varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Register() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.REGISTER", args); 
      log.trace(ftValList2String("Register", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Register set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Register register() {
  return new Register();
}


  public static class Setchallenges {
  private FTValList args = new FTValList();
  private String output;
  public Setchallenges set(String name, String value) { args.setValString(name,value); return this; }
 public Setchallenges name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setchallenges list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setchallenges() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.SETCHALLENGES", args); 
      log.trace(ftValList2String("Setchallenges", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setchallenges set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setchallenges setchallenges() {
  return new Setchallenges();
}


  public static class Setparameter {
  private FTValList args = new FTValList();
  private String output;
  public Setparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Setparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparameter field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Setparameter value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setparameter() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.SETPARAMETER", args); 
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
      ics.runTag("CSUSER.SETPARAMETERS", args); 
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


  public static class Tostring {
  private FTValList args = new FTValList();
  private String output;
  public Tostring set(String name, String value) { args.setValString(name,value); return this; }
 public Tostring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Tostring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Tostring() { }
  public int run(ICS ics) { 
      ics.runTag("CSUSER.TOSTRING", args); 
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

}
