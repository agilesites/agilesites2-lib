package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DateTag  {    
  private static Log log = Log.getLog(DateTag.class);  
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
      ics.runTag("DATE.ARGUMENT", args); 
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


  public static class Clocklist {
  private FTValList args = new FTValList();
  private String output;
  public Clocklist set(String name, String value) { args.setValString(name,value); return this; }
 public Clocklist listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Clocklist clock(String val) { args.setValString("CLOCK", val); return this; } 
      
 public Clocklist timezone(String val) { args.setValString("TIMEZONE", val); return this; } 
      
 public Clocklist locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Clocklist() { }
  public int run(ICS ics) { 
      ics.runTag("DATE.CLOCKLIST", args); 
      log.trace(ftValList2String("Clocklist", args));
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
  public Clocklist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clocklist clocklist() {
  return new Clocklist();
}


  public static class Convert {
  private FTValList args = new FTValList();
  private String output;
  public Convert set(String name, String value) { args.setValString(name,value); return this; }
 public Convert varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Convert year(String val) { args.setValString("YEAR", val); return this; } 
      
 public Convert month(String val) { args.setValString("MONTH", val); return this; } 
      
 public Convert day(String val) { args.setValString("DAY", val); return this; } 
      
 public Convert hour(String val) { args.setValString("HOUR", val); return this; } 
      
 public Convert minute(String val) { args.setValString("MINUTE", val); return this; } 
      
 public Convert ampm(String val) { args.setValString("AMPM", val); return this; } 
      
 public Convert timezone(String val) { args.setValString("TIMEZONE", val); return this; } 
      
  public Convert() { }
  public int run(ICS ics) { 
      ics.runTag("DATE.CONVERT", args); 
      log.trace(ftValList2String("Convert", args));
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
  public Convert set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Convert convert() {
  return new Convert();
}


  public static class Defaulttz {
  private FTValList args = new FTValList();
  private String output;
  public Defaulttz set(String name, String value) { args.setValString(name,value); return this; }
 public Defaulttz varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Defaulttz() { }
  public int run(ICS ics) { 
      ics.runTag("DATE.DEFAULTTZ", args); 
      log.trace(ftValList2String("Defaulttz", args));
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
  public Defaulttz set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Defaulttz defaulttz() {
  return new Defaulttz();
}

}
