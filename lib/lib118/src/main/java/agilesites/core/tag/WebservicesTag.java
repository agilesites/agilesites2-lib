package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class WebservicesTag  {    
  private static Log log = Log.getLog(WebservicesTag.class);  
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
    
 
  public static class Parameter {
  private FTValList args = new FTValList();
  private String output;
  public Parameter set(String name, String value) { args.setValString(name,value); return this; }
 public Parameter type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Parameter value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Parameter() { }
  public int run(ICS ics) { 
      ics.runTag("WEBSERVICES.PARAMETER", args); 
      log.trace(ftValList2String("Parameter", args));
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
  public Parameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Parameter parameter() {
  return new Parameter();
}


  public static class Invoke {
  private FTValList args = new FTValList();
  private String output;
  public Invoke set(String name, String value) { args.setValString(name,value); return this; }
 public Invoke wsdl(String val) { args.setValString("WSDL", val); return this; } 
      
 public Invoke target(String val) { args.setValString("TARGET", val); return this; } 
      
 public Invoke service(String val) { args.setValString("SERVICE", val); return this; } 
      
 public Invoke port(String val) { args.setValString("PORT", val); return this; } 
      
 public Invoke operation(String val) { args.setValString("OPERATION", val); return this; } 
      
 public Invoke object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Invoke() { }
  public int run(ICS ics) { 
      ics.runTag("WEBSERVICES.INVOKE", args); 
      log.trace(ftValList2String("Invoke", args));
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
  public Invoke set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Invoke invoke() {
  return new Invoke();
}

}
