package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CurrencyTag  {    
  private static Log log = Log.getLog(CurrencyTag.class);  
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
      ics.runTag("CURRENCY.ARGUMENT", args); 
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


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
 public Create isocurrency(String val) { args.setValString("ISOCURRENCY", val); return this; } 
      
 public Create separator(String val) { args.setValString("SEPARATOR", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.CREATE", args); 
      log.trace(ftValList2String("Create", args));
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
  public Create set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Create create() {
  return new Create();
}


  public static class Getsymbol {
  private FTValList args = new FTValList();
  private String output;
  public Getsymbol set(String name, String value) { args.setValString(name,value); return this; }
 public Getsymbol name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getsymbol varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getsymbol() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.GETSYMBOL", args); 
      log.trace(ftValList2String("Getsymbol", args));
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
  public Getsymbol set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsymbol getsymbol() {
  return new Getsymbol();
}


  public static class Getcurrency {
  private FTValList args = new FTValList();
  private String output;
  public Getcurrency set(String name, String value) { args.setValString(name,value); return this; }
 public Getcurrency name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcurrency value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getcurrency varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getcurrency() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.GETCURRENCY", args); 
      log.trace(ftValList2String("Getcurrency", args));
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
  public Getcurrency set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcurrency getcurrency() {
  return new Getcurrency();
}


  public static class Readcurrency {
  private FTValList args = new FTValList();
  private String output;
  public Readcurrency set(String name, String value) { args.setValString(name,value); return this; }
 public Readcurrency name(String val) { args.setValString("NAME", val); return this; } 
      
 public Readcurrency value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Readcurrency varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Readcurrency() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.READCURRENCY", args); 
      log.trace(ftValList2String("Readcurrency", args));
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
  public Readcurrency set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Readcurrency readcurrency() {
  return new Readcurrency();
}


  public static class Roundup {
  private FTValList args = new FTValList();
  private String output;
  public Roundup set(String name, String value) { args.setValString(name,value); return this; }
 public Roundup name(String val) { args.setValString("NAME", val); return this; } 
      
 public Roundup value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Roundup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Roundup() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.ROUNDUP", args); 
      log.trace(ftValList2String("Roundup", args));
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
  public Roundup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Roundup roundup() {
  return new Roundup();
}


  public static class Rounddown {
  private FTValList args = new FTValList();
  private String output;
  public Rounddown set(String name, String value) { args.setValString(name,value); return this; }
 public Rounddown name(String val) { args.setValString("NAME", val); return this; } 
      
 public Rounddown value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Rounddown varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Rounddown() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.ROUNDDOWN", args); 
      log.trace(ftValList2String("Rounddown", args));
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
  public Rounddown set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Rounddown rounddown() {
  return new Rounddown();
}


  public static class Round {
  private FTValList args = new FTValList();
  private String output;
  public Round set(String name, String value) { args.setValString(name,value); return this; }
 public Round name(String val) { args.setValString("NAME", val); return this; } 
      
 public Round value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Round varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Round() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.ROUND", args); 
      log.trace(ftValList2String("Round", args));
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
  public Round set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Round round() {
  return new Round();
}


  public static class Getisocode {
  private FTValList args = new FTValList();
  private String output;
  public Getisocode set(String name, String value) { args.setValString(name,value); return this; }
 public Getisocode name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getisocode varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getisocode() { }
  public int run(ICS ics) { 
      ics.runTag("CURRENCY.GETISOCODE", args); 
      log.trace(ftValList2String("Getisocode", args));
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
  public Getisocode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getisocode getisocode() {
  return new Getisocode();
}

}
