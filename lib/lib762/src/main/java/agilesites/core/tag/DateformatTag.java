package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DateformatTag  {    
  private static Log log = Log.getLog(DateformatTag.class);  
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
      ics.runTag("DATEFORMAT.ARGUMENT", args); 
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
      
 public Create datestyle(String val) { args.setValString("DATESTYLE", val); return this; } 
      
 public Create timestyle(String val) { args.setValString("TIMESTYLE", val); return this; } 
      
 public Create timezoneid(String val) { args.setValString("TIMEZONEID", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("DATEFORMAT.CREATE", args); 
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


  public static class Getdate {
  private FTValList args = new FTValList();
  private String output;
  public Getdate set(String name, String value) { args.setValString(name,value); return this; }
 public Getdate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdate value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getdate valuetype(String val) { args.setValString("VALUETYPE", val); return this; } 
      
 public Getdate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdate() { }
  public int run(ICS ics) { 
      ics.runTag("DATEFORMAT.GETDATE", args); 
      log.trace(ftValList2String("Getdate", args));
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
  public Getdate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdate getdate() {
  return new Getdate();
}


  public static class Gettime {
  private FTValList args = new FTValList();
  private String output;
  public Gettime set(String name, String value) { args.setValString(name,value); return this; }
 public Gettime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettime value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Gettime valuetype(String val) { args.setValString("VALUETYPE", val); return this; } 
      
 public Gettime varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Gettime() { }
  public int run(ICS ics) { 
      ics.runTag("DATEFORMAT.GETTIME", args); 
      log.trace(ftValList2String("Gettime", args));
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
  public Gettime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettime gettime() {
  return new Gettime();
}


  public static class Getdatetime {
  private FTValList args = new FTValList();
  private String output;
  public Getdatetime set(String name, String value) { args.setValString(name,value); return this; }
 public Getdatetime name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getdatetime value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getdatetime valuetype(String val) { args.setValString("VALUETYPE", val); return this; } 
      
 public Getdatetime varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getdatetime() { }
  public int run(ICS ics) { 
      ics.runTag("DATEFORMAT.GETDATETIME", args); 
      log.trace(ftValList2String("Getdatetime", args));
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
  public Getdatetime set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getdatetime getdatetime() {
  return new Getdatetime();
}

}
