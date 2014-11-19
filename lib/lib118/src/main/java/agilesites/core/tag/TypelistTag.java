package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class TypelistTag  {    
  private static Log log = Log.getLog(TypelistTag.class);  
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
    
 
  public static class Scatter {
  private FTValList args = new FTValList();
  private String output;
  public Scatter set(String name, String value) { args.setValString(name,value); return this; }
 public Scatter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Scatter prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.SCATTER", args); 
      log.trace(ftValList2String("Scatter", args));
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
  public Scatter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Scatter scatter() {
  return new Scatter();
}


  public static class Gather {
  private FTValList args = new FTValList();
  private String output;
  public Gather set(String name, String value) { args.setValString(name,value); return this; }
 public Gather name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gather prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Gather() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.GATHER", args); 
      log.trace(ftValList2String("Gather", args));
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
  public Gather set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gather gather() {
  return new Gather();
}


  public static class Clearassettypes {
  private FTValList args = new FTValList();
  private String output;
  public Clearassettypes set(String name, String value) { args.setValString(name,value); return this; }
 public Clearassettypes name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clearassettypes() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.CLEARASSETTYPES", args); 
      log.trace(ftValList2String("Clearassettypes", args));
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
  public Clearassettypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clearassettypes clearassettypes() {
  return new Clearassettypes();
}


  public static class Getallassettypes {
  private FTValList args = new FTValList();
  private String output;
  public Getallassettypes set(String name, String value) { args.setValString(name,value); return this; }
 public Getallassettypes name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getallassettypes varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getallassettypes() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.GETALLASSETTYPES", args); 
      log.trace(ftValList2String("Getallassettypes", args));
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
  public Getallassettypes set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getallassettypes getallassettypes() {
  return new Getallassettypes();
}


  public static class Addassettype {
  private FTValList args = new FTValList();
  private String output;
  public Addassettype set(String name, String value) { args.setValString(name,value); return this; }
 public Addassettype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addassettype value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Addassettype() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.ADDASSETTYPE", args); 
      log.trace(ftValList2String("Addassettype", args));
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
  public Addassettype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addassettype addassettype() {
  return new Addassettype();
}


  public static class Deleteassettype {
  private FTValList args = new FTValList();
  private String output;
  public Deleteassettype set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteassettype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deleteassettype value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Deleteassettype() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.DELETEASSETTYPE", args); 
      log.trace(ftValList2String("Deleteassettype", args));
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
  public Deleteassettype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteassettype deleteassettype() {
  return new Deleteassettype();
}


  public static class Hastype {
  private FTValList args = new FTValList();
  private String output;
  public Hastype set(String name, String value) { args.setValString(name,value); return this; }
 public Hastype name(String val) { args.setValString("NAME", val); return this; } 
      
 public Hastype value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Hastype varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Hastype() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.HASTYPE", args); 
      log.trace(ftValList2String("Hastype", args));
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
  public Hastype set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Hastype hastype() {
  return new Hastype();
}


  public static class Isall {
  private FTValList args = new FTValList();
  private String output;
  public Isall set(String name, String value) { args.setValString(name,value); return this; }
 public Isall name(String val) { args.setValString("NAME", val); return this; } 
      
 public Isall varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Isall() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.ISALL", args); 
      log.trace(ftValList2String("Isall", args));
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
  public Isall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Isall isall() {
  return new Isall();
}


  public static class Setall {
  private FTValList args = new FTValList();
  private String output;
  public Setall set(String name, String value) { args.setValString(name,value); return this; }
 public Setall name(String val) { args.setValString("NAME", val); return this; } 
      
  public Setall() { }
  public int run(ICS ics) { 
      ics.runTag("TYPELIST.SETALL", args); 
      log.trace(ftValList2String("Setall", args));
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
  public Setall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setall setall() {
  return new Setall();
}

}
