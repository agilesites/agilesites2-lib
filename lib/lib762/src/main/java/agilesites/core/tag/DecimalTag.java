package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DecimalTag  {    
  private static Log log = Log.getLog(DecimalTag.class);  
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
      ics.runTag("DECIMAL.ARGUMENT", args); 
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


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.CREATE", args); 
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


  public static class Getdecimal {
  private FTValList args = new FTValList();
  private String output;
  public Getdecimal set(String name, String value) { args.setValString(name,value); return this; }
 public Getdecimal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdecimal value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getdecimal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdecimal() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.GETDECIMAL", args); 
      log.trace(ftValList2String("Getdecimal", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getdecimal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdecimal getdecimal() {
  return new Getdecimal();
}


  public static class Readdecimal {
  private FTValList args = new FTValList();
  private String output;
  public Readdecimal set(String name, String value) { args.setValString(name,value); return this; }
 public Readdecimal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Readdecimal value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Readdecimal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Readdecimal() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.READDECIMAL", args); 
      log.trace(ftValList2String("Readdecimal", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Readdecimal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Readdecimal readdecimal() {
  return new Readdecimal();
}


  public static class Getmaxplaces {
  private FTValList args = new FTValList();
  private String output;
  public Getmaxplaces set(String name, String value) { args.setValString(name,value); return this; }
 public Getmaxplaces name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getmaxplaces varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getmaxplaces() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.GETMAXPLACES", args); 
      log.trace(ftValList2String("Getmaxplaces", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getmaxplaces set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getmaxplaces getmaxplaces() {
  return new Getmaxplaces();
}


  public static class Getminplaces {
  private FTValList args = new FTValList();
  private String output;
  public Getminplaces set(String name, String value) { args.setValString(name,value); return this; }
 public Getminplaces name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getminplaces varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getminplaces() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.GETMINPLACES", args); 
      log.trace(ftValList2String("Getminplaces", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getminplaces set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getminplaces getminplaces() {
  return new Getminplaces();
}


  public static class Getthousands {
  private FTValList args = new FTValList();
  private String output;
  public Getthousands set(String name, String value) { args.setValString(name,value); return this; }
 public Getthousands name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getthousands varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getthousands() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.GETTHOUSANDS", args); 
      log.trace(ftValList2String("Getthousands", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Getthousands set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getthousands getthousands() {
  return new Getthousands();
}


  public static class Setmaxplaces {
  private FTValList args = new FTValList();
  private String output;
  public Setmaxplaces set(String name, String value) { args.setValString(name,value); return this; }
 public Setmaxplaces name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setmaxplaces places(String val) { args.setValString("PLACES", val); return this; } 
      
  public Setmaxplaces() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.SETMAXPLACES", args); 
      log.trace(ftValList2String("Setmaxplaces", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setmaxplaces set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setmaxplaces setmaxplaces() {
  return new Setmaxplaces();
}


  public static class Setminplaces {
  private FTValList args = new FTValList();
  private String output;
  public Setminplaces set(String name, String value) { args.setValString(name,value); return this; }
 public Setminplaces name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setminplaces places(String val) { args.setValString("PLACES", val); return this; } 
      
  public Setminplaces() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.SETMINPLACES", args); 
      log.trace(ftValList2String("Setminplaces", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setminplaces set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setminplaces setminplaces() {
  return new Setminplaces();
}


  public static class Setthousands {
  private FTValList args = new FTValList();
  private String output;
  public Setthousands set(String name, String value) { args.setValString(name,value); return this; }
 public Setthousands name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setthousands value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setthousands() { }
  public int run(ICS ics) { 
      ics.runTag("DECIMAL.SETTHOUSANDS", args); 
      log.trace(ftValList2String("Setthousands", args));
      return ics.GetErrno(); 
  }
  public String eval(ICS ics, String output) {
	  String tmp = tmp();
	  args.setValString(output.toUpperCase(), tmp);
	  run(ics);
	  String res = ics.GetVar(tmp);
	  ics.RemoveVar(tmp);
	  return res;		
  } 
  public Setthousands set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setthousands setthousands() {
  return new Setthousands();
}

}
