package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class XlatTag  {    
  private static Log log = Log.getLog(XlatTag.class);  
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
      ics.runTag("XLAT.ARGUMENT", args); 
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


  public static class Lookup {
  private FTValList args = new FTValList();
  private String output;
  public Lookup set(String name, String value) { args.setValString(name,value); return this; }
 public Lookup key(String val) { args.setValString("KEY", val); return this; } 
      
 public Lookup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Lookup encode(String val) { args.setValString("ENCODE", val); return this; } 
      
 public Lookup escape(String val) { args.setValString("ESCAPE", val); return this; } 
      
 public Lookup evalall(String val) { args.setValString("EVALALL", val); return this; } 
      
 public Lookup locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Lookup() { }
  public int run(ICS ics) { 
      ics.runTag("XLAT.LOOKUP", args); 
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


  public static class Stream {
  private FTValList args = new FTValList();
  private String output;
  public Stream set(String name, String value) { args.setValString(name,value); return this; }
 public Stream key(String val) { args.setValString("KEY", val); return this; } 
      
 public Stream encode(String val) { args.setValString("ENCODE", val); return this; } 
      
 public Stream escape(String val) { args.setValString("ESCAPE", val); return this; } 
      
 public Stream evalall(String val) { args.setValString("EVALALL", val); return this; } 
      
 public Stream locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Stream() { }
  public int run(ICS ics) { 
      ics.runTag("XLAT.STREAM", args); 
      log.trace(ftValList2String("Stream", args));
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
  public Stream set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Stream stream() {
  return new Stream();
}

}
