package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class EventTag  {    
  private static Log log = Log.getLog(EventTag.class);  
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
    
 
  public static class InstallListenerRegistry {
  private FTValList args = new FTValList();
  private String output;
  public InstallListenerRegistry set(String name, String value) { args.setValString(name,value); return this; }
 public InstallListenerRegistry storage(String val) { args.setValString("STORAGE", val); return this; } 
      
  public InstallListenerRegistry() { }
  public int run(ICS ics) { 
      ics.runTag("EVENT.INSTALLLISTENERREGISTRY", args); 
      log.trace(ftValList2String("InstallListenerRegistry", args));
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
  public InstallListenerRegistry set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static InstallListenerRegistry installlistenerregistry() {
  return new InstallListenerRegistry();
}


  public static class UninstallListenerRegistry {
  private FTValList args = new FTValList();
  private String output;
  public UninstallListenerRegistry set(String name, String value) { args.setValString(name,value); return this; }
 public UninstallListenerRegistry storage(String val) { args.setValString("STORAGE", val); return this; } 
      
  public UninstallListenerRegistry() { }
  public int run(ICS ics) { 
      ics.runTag("EVENT.UNINSTALLLISTENERREGISTRY", args); 
      log.trace(ftValList2String("UninstallListenerRegistry", args));
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
  public UninstallListenerRegistry set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static UninstallListenerRegistry uninstalllistenerregistry() {
  return new UninstallListenerRegistry();
}

}
