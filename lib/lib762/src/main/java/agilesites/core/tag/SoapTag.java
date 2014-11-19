package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class SoapTag  {    
  private static Log log = Log.getLog(SoapTag.class);  
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
      ics.runTag("SOAP.ARGUMENT", args); 
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


  public static class Message {
  private FTValList args = new FTValList();
  private String output;
  public Message set(String name, String value) { args.setValString(name,value); return this; }
 public Message ns(String val) { args.setValString("NS", val); return this; } 
      
 public Message uri(String val) { args.setValString("URI", val); return this; } 
      
  public Message() { }
  public int run(ICS ics) { 
      ics.runTag("SOAP.MESSAGE", args); 
      log.trace(ftValList2String("Message", args));
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
  public Message set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Message message() {
  return new Message();
}


  public static class Header {
  private FTValList args = new FTValList();
  private String output;
  public Header set(String name, String value) { args.setValString(name,value); return this; }

  public Header() { }
  public int run(ICS ics) { 
      ics.runTag("SOAP.HEADER", args); 
      log.trace(ftValList2String("Header", args));
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
  public Header set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Header header() {
  return new Header();
}


  public static class Body {
  private FTValList args = new FTValList();
  private String output;
  public Body set(String name, String value) { args.setValString(name,value); return this; }
 public Body tagname(String val) { args.setValString("TAGNAME", val); return this; } 
      
  public Body() { }
  public int run(ICS ics) { 
      ics.runTag("SOAP.BODY", args); 
      log.trace(ftValList2String("Body", args));
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
  public Body set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Body body() {
  return new Body();
}


  public static class Fault {
  private FTValList args = new FTValList();
  private String output;
  public Fault set(String name, String value) { args.setValString(name,value); return this; }
 public Fault code(String val) { args.setValString("CODE", val); return this; } 
      
 public Fault string(String val) { args.setValString("STRING", val); return this; } 
      
 public Fault actor(String val) { args.setValString("ACTOR", val); return this; } 
      
 public Fault detail(String val) { args.setValString("DETAIL", val); return this; } 
      
  public Fault() { }
  public int run(ICS ics) { 
      ics.runTag("SOAP.FAULT", args); 
      log.trace(ftValList2String("Fault", args));
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
  public Fault set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fault fault() {
  return new Fault();
}

}
