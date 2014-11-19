package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class Ftcs1_0Tag  {    
  private static Log log = Log.getLog(Ftcs1_0Tag.class);  
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
    
 
  public static class Ftcs {
  private FTValList args = new FTValList();
  private String output;
  public Ftcs set(String name, String value) { args.setValString(name,value); return this; }
 public Ftcs path(String val) { args.setValString("PATH", val); return this; } 
      
 public Ftcs ini(String val) { args.setValString("INI", val); return this; } 
      
 public Ftcs name(String val) { args.setValString("NAME", val); return this; } 
      
  public Ftcs() { }
  public int run(ICS ics) { 
      ics.runTag("FTCS1_0.FTCS", args); 
      log.trace(ftValList2String("Ftcs", args));
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
  public Ftcs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Ftcs ftcs() {
  return new Ftcs();
}


  public static class Flush {
  private FTValList args = new FTValList();
  private String output;
  public Flush set(String name, String value) { args.setValString(name,value); return this; }

  public Flush() { }
  public int run(ICS ics) { 
      ics.runTag("FTCS1_0.FLUSH", args); 
      log.trace(ftValList2String("Flush", args));
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
  public Flush set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flush flush() {
  return new Flush();
}


  public static class Debugbreak {
  private FTValList args = new FTValList();
  private String output;
  public Debugbreak set(String name, String value) { args.setValString(name,value); return this; }
 public Debugbreak id(String val) { args.setValString("ID", val); return this; } 
      
 public Debugbreak stepin(String val) { args.setValString("STEPIN", val); return this; } 
      
  public Debugbreak() { }
  public int run(ICS ics) { 
      ics.runTag("FTCS1_0.DEBUGBREAK", args); 
      log.trace(ftValList2String("Debugbreak", args));
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
  public Debugbreak set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Debugbreak debugbreak() {
  return new Debugbreak();
}

}
