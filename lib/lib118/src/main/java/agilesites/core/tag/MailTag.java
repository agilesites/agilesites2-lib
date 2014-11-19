package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class MailTag  {    
  private static Log log = Log.getLog(MailTag.class);  
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
    
 
  public static class Send {
  private FTValList args = new FTValList();
  private String output;
  public Send set(String name, String value) { args.setValString(name,value); return this; }
 public Send to(String val) { args.setValString("TO", val); return this; } 
      
 public Send from(String val) { args.setValString("FROM", val); return this; } 
      
 public Send subject(String val) { args.setValString("SUBJECT", val); return this; } 
      
 public Send replyto(String val) { args.setValString("REPLYTO", val); return this; } 
      
 public Send body(String val) { args.setValString("BODY", val); return this; } 
      
 public Send contenttype(String val) { args.setValString("CONTENTTYPE", val); return this; } 
      
 public Send charset(String val) { args.setValString("CHARSET", val); return this; } 
      
  public Send() { }
  public int run(ICS ics) { 
      ics.runTag("MAIL.SEND", args); 
      log.trace(ftValList2String("Send", args));
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
  public Send set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Send send() {
  return new Send();
}


  public static class Attachment {
  private FTValList args = new FTValList();
  private String output;
  public Attachment set(String name, String value) { args.setValString(name,value); return this; }
 public Attachment value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Attachment name(String val) { args.setValString("NAME", val); return this; } 
      
  public Attachment() { }
  public int run(ICS ics) { 
      ics.runTag("MAIL.ATTACHMENT", args); 
      log.trace(ftValList2String("Attachment", args));
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
  public Attachment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Attachment attachment() {
  return new Attachment();
}

}
