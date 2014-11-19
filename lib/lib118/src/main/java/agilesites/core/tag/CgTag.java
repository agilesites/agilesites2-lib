package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CgTag  {    
  private static Log log = Log.getLog(CgTag.class);  
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
    
 
  public static class Render {
  private FTValList args = new FTValList();
  private String output;
  public Render set(String name, String value) { args.setValString(name,value); return this; }
 public Render id(String val) { args.setValString("ID", val); return this; } 
      
 public Render type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Render resourceid(String val) { args.setValString("RESOURCEID", val); return this; } 
      
 public Render settings(String val) { args.setValString("SETTINGS", val); return this; } 
      
  public Render() { }
  public int run(ICS ics) { 
      ics.runTag("CG.RENDER", args); 
      log.trace(ftValList2String("Render", args));
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
  public Render set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Render render() {
  return new Render();
}

}
