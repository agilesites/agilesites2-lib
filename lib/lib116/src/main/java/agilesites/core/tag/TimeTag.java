package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class TimeTag  {    
  private static Log log = Log.getLog(TimeTag.class);  
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
    
 
  public static class Get {
  private FTValList args = new FTValList();
  private String output;
  public Get set(String name, String value) { args.setValString(name,value); return this; }
 public Get name(String val) { args.setValString("NAME", val); return this; } 
      
 public Get output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Get() { }
  public int run(ICS ics) { 
      ics.runTag("TIME.GET", args); 
      log.trace(ftValList2String("Get", args));
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
  public Get set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Get get() {
  return new Get();
}


  public static class Set {
  private FTValList args = new FTValList();
  private String output;
  public Set set(String name, String value) { args.setValString(name,value); return this; }
 public Set name(String val) { args.setValString("NAME", val); return this; } 
      
  public Set() { }
  public int run(ICS ics) { 
      ics.runTag("TIME.SET", args); 
      log.trace(ftValList2String("Set", args));
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
  public Set set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Set set() {
  return new Set();
}

}
