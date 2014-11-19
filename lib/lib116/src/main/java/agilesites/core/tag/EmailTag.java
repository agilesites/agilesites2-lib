package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class EmailTag  {    
  private static Log log = Log.getLog(EmailTag.class);  
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
      ics.runTag("EMAIL.SCATTER", args); 
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
      ics.runTag("EMAIL.GATHER", args); 
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
      ics.runTag("EMAIL.GETID", args); 
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
      ics.runTag("EMAIL.GETNAME", args); 
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
      ics.runTag("EMAIL.SETNAME", args); 
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
      ics.runTag("EMAIL.GETDESCRIPTION", args); 
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
      ics.runTag("EMAIL.SETDESCRIPTION", args); 
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


  public static class Getsubject {
  private FTValList args = new FTValList();
  private String output;
  public Getsubject set(String name, String value) { args.setValString(name,value); return this; }
 public Getsubject name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsubject varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getsubject() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.GETSUBJECT", args); 
      log.trace(ftValList2String("Getsubject", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getsubject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsubject getsubject() {
  return new Getsubject();
}


  public static class Setsubject {
  private FTValList args = new FTValList();
  private String output;
  public Setsubject set(String name, String value) { args.setValString(name,value); return this; }
 public Setsubject name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsubject value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setsubject() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.SETSUBJECT", args); 
      log.trace(ftValList2String("Setsubject", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setsubject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsubject setsubject() {
  return new Setsubject();
}


  public static class Getbody {
  private FTValList args = new FTValList();
  private String output;
  public Getbody set(String name, String value) { args.setValString(name,value); return this; }
 public Getbody name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getbody varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getbody() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.GETBODY", args); 
      log.trace(ftValList2String("Getbody", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getbody set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getbody getbody() {
  return new Getbody();
}


  public static class Setbody {
  private FTValList args = new FTValList();
  private String output;
  public Setbody set(String name, String value) { args.setValString(name,value); return this; }
 public Setbody name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setbody value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setbody() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.SETBODY", args); 
      log.trace(ftValList2String("Setbody", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setbody set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setbody setbody() {
  return new Setbody();
}


  public static class Translatesubject {
  private FTValList args = new FTValList();
  private String output;
  public Translatesubject set(String name, String value) { args.setValString(name,value); return this; }
 public Translatesubject name(String val) { args.setValString("NAME", val); return this; } 
      
 public Translatesubject varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Translatesubject params(String val) { args.setValString("PARAMS", val); return this; } 
      
  public Translatesubject() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.TRANSLATESUBJECT", args); 
      log.trace(ftValList2String("Translatesubject", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Translatesubject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Translatesubject translatesubject() {
  return new Translatesubject();
}


  public static class Translatebody {
  private FTValList args = new FTValList();
  private String output;
  public Translatebody set(String name, String value) { args.setValString(name,value); return this; }
 public Translatebody name(String val) { args.setValString("NAME", val); return this; } 
      
 public Translatebody varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Translatebody params(String val) { args.setValString("PARAMS", val); return this; } 
      
  public Translatebody() { }
  public int run(ICS ics) { 
      ics.runTag("EMAIL.TRANSLATEBODY", args); 
      log.trace(ftValList2String("Translatebody", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Translatebody set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Translatebody translatebody() {
  return new Translatebody();
}

}
