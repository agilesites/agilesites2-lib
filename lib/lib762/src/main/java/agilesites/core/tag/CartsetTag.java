package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CartsetTag  {    
  private static Log log = Log.getLog(CartsetTag.class);  
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
      ics.runTag("CARTSET.ARGUMENT", args); 
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


  public static class Addcart {
  private FTValList args = new FTValList();
  private String output;
  public Addcart set(String name, String value) { args.setValString(name,value); return this; }
 public Addcart name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addcart cartid(String val) { args.setValString("CARTID", val); return this; } 
      
 public Addcart cart(String val) { args.setValString("CART", val); return this; } 
      
  public Addcart() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.ADDCART", args); 
      log.trace(ftValList2String("Addcart", args));
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
  public Addcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addcart addcart() {
  return new Addcart();
}


  public static class Cartids {
  private FTValList args = new FTValList();
  private String output;
  public Cartids set(String name, String value) { args.setValString(name,value); return this; }
 public Cartids name(String val) { args.setValString("NAME", val); return this; } 
      
 public Cartids listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Cartids() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.CARTIDS", args); 
      log.trace(ftValList2String("Cartids", args));
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
  public Cartids set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cartids cartids() {
  return new Cartids();
}


  public static class Deletecart {
  private FTValList args = new FTValList();
  private String output;
  public Deletecart set(String name, String value) { args.setValString(name,value); return this; }
 public Deletecart name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deletecart cartid(String val) { args.setValString("CARTID", val); return this; } 
      
  public Deletecart() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.DELETECART", args); 
      log.trace(ftValList2String("Deletecart", args));
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
  public Deletecart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletecart deletecart() {
  return new Deletecart();
}


  public static class Getcart {
  private FTValList args = new FTValList();
  private String output;
  public Getcart set(String name, String value) { args.setValString(name,value); return this; }
 public Getcart name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcart cartid(String val) { args.setValString("CARTID", val); return this; } 
      
 public Getcart cart(String val) { args.setValString("CART", val); return this; } 
      
  public Getcart() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.GETCART", args); 
      log.trace(ftValList2String("Getcart", args));
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
  public Getcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcart getcart() {
  return new Getcart();
}


  public static class Getset {
  private FTValList args = new FTValList();
  private String output;
  public Getset set(String name, String value) { args.setValString(name,value); return this; }
 public Getset name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getset userid(String val) { args.setValString("USERID", val); return this; } 
      
  public Getset() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.GETSET", args); 
      log.trace(ftValList2String("Getset", args));
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
  public Getset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getset getset() {
  return new Getset();
}


  public static class Install {
  private FTValList args = new FTValList();
  private String output;
  public Install set(String name, String value) { args.setValString(name,value); return this; }

  public Install() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.INSTALL", args); 
      log.trace(ftValList2String("Install", args));
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
  public Install set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Install install() {
  return new Install();
}


  public static class Deinstall {
  private FTValList args = new FTValList();
  private String output;
  public Deinstall set(String name, String value) { args.setValString(name,value); return this; }

  public Deinstall() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.DEINSTALL", args); 
      log.trace(ftValList2String("Deinstall", args));
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
  public Deinstall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deinstall deinstall() {
  return new Deinstall();
}


  public static class Deleteall {
  private FTValList args = new FTValList();
  private String output;
  public Deleteall set(String name, String value) { args.setValString(name,value); return this; }

  public Deleteall() { }
  public int run(ICS ics) { 
      ics.runTag("CARTSET.DELETEALL", args); 
      log.trace(ftValList2String("Deleteall", args));
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
  public Deleteall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteall deleteall() {
  return new Deleteall();
}

}
