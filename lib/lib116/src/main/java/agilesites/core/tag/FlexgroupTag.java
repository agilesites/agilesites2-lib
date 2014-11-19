package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class FlexgroupTag  {    
  private static Log log = Log.getLog(FlexgroupTag.class);  
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
      ics.runTag("FLEXGROUP.ARGUMENT", args); 
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


  public static class Getattribute {
  private FTValList args = new FTValList();
  private String output;
  public Getattribute set(String name, String value) { args.setValString(name,value); return this; }
 public Getattribute name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getattribute id(String val) { args.setValString("ID", val); return this; } 
      
 public Getattribute listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getattribute() { }
  public int run(ICS ics) { 
      ics.runTag("FLEXGROUP.GETATTRIBUTE", args); 
      log.trace(ftValList2String("Getattribute", args));
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
  public Getattribute set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getattribute getattribute() {
  return new Getattribute();
}


  public static class Setattribute {
  private FTValList args = new FTValList();
  private String output;
  public Setattribute set(String name, String value) { args.setValString(name,value); return this; }
 public Setattribute name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setattribute id(String val) { args.setValString("ID", val); return this; } 
      
 public Setattribute list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setattribute() { }
  public int run(ICS ics) { 
      ics.runTag("FLEXGROUP.SETATTRIBUTE", args); 
      log.trace(ftValList2String("Setattribute", args));
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
  public Setattribute set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setattribute setattribute() {
  return new Setattribute();
}


  public static class Setcgiattribute {
  private FTValList args = new FTValList();
  private String output;
  public Setcgiattribute set(String name, String value) { args.setValString(name,value); return this; }
 public Setcgiattribute name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setcgiattribute id(String val) { args.setValString("ID", val); return this; } 
      
 public Setcgiattribute list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setcgiattribute() { }
  public int run(ICS ics) { 
      ics.runTag("FLEXGROUP.SETCGIATTRIBUTE", args); 
      log.trace(ftValList2String("Setcgiattribute", args));
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
  public Setcgiattribute set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setcgiattribute setcgiattribute() {
  return new Setcgiattribute();
}


  public static class Setsingleattribute {
  private FTValList args = new FTValList();
  private String output;
  public Setsingleattribute set(String name, String value) { args.setValString(name,value); return this; }
 public Setsingleattribute name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsingleattribute id(String val) { args.setValString("ID", val); return this; } 
      
 public Setsingleattribute value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Setsingleattribute cgi(String val) { args.setValString("CGI", val); return this; } 
      
  public Setsingleattribute() { }
  public int run(ICS ics) { 
      ics.runTag("FLEXGROUP.SETSINGLEATTRIBUTE", args); 
      log.trace(ftValList2String("Setsingleattribute", args));
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
  public Setsingleattribute set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsingleattribute setsingleattribute() {
  return new Setsingleattribute();
}

}
