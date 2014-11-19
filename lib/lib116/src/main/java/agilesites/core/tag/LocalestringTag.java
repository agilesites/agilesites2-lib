package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class LocalestringTag  {    
  private static Log log = Log.getLog(LocalestringTag.class);  
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
      ics.runTag("LOCALESTRING.ARGUMENT", args); 
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
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.CREATE", args); 
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


  public static class Delete {
  private FTValList args = new FTValList();
  private String output;
  public Delete set(String name, String value) { args.setValString(name,value); return this; }
 public Delete name(String val) { args.setValString("NAME", val); return this; } 
      
  public Delete() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.DELETE", args); 
      log.trace(ftValList2String("Delete", args));
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
  public Delete set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Delete delete() {
  return new Delete();
}


  public static class Gather {
  private FTValList args = new FTValList();
  private String output;
  public Gather set(String name, String value) { args.setValString(name,value); return this; }
 public Gather name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gather prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Gather fieldlist(String val) { args.setValString("FIELDLIST", val); return this; } 
      
  public Gather() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.GATHER", args); 
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


  public static class Get {
  private FTValList args = new FTValList();
  private String output;
  public Get set(String name, String value) { args.setValString(name,value); return this; }
 public Get name(String val) { args.setValString("NAME", val); return this; } 
      
 public Get field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Get output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Get() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.GET", args); 
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


  public static class Getstring {
  private FTValList args = new FTValList();
  private String output;
  public Getstring set(String name, String value) { args.setValString(name,value); return this; }
 public Getstring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstring locale(String val) { args.setValString("LOCALE", val); return this; } 
      
 public Getstring output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Getstring resolve(String val) { args.setValString("RESOLVE", val); return this; } 
      
  public Getstring() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.GETSTRING", args); 
      log.trace(ftValList2String("Getstring", args));
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
  public Getstring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstring getstring() {
  return new Getstring();
}


  public static class List {
  private FTValList args = new FTValList();
  private String output;
  public List set(String name, String value) { args.setValString(name,value); return this; }
 public List list(String val) { args.setValString("LIST", val); return this; } 
      
 public List order(String val) { args.setValString("ORDER", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.LIST", args); 
      log.trace(ftValList2String("List", args));
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
  public List set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static List list() {
  return new List();
}


  public static class Load {
  private FTValList args = new FTValList();
  private String output;
  public Load set(String name, String value) { args.setValString(name,value); return this; }
 public Load name(String val) { args.setValString("NAME", val); return this; } 
      
  public Load() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.LOAD", args); 
      log.trace(ftValList2String("Load", args));
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
  public Load set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Load load() {
  return new Load();
}


  public static class Save {
  private FTValList args = new FTValList();
  private String output;
  public Save set(String name, String value) { args.setValString(name,value); return this; }
 public Save name(String val) { args.setValString("NAME", val); return this; } 
      
 public Save flush(String val) { args.setValString("FLUSH", val); return this; } 
      
  public Save() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.SAVE", args); 
      log.trace(ftValList2String("Save", args));
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
  public Save set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Save save() {
  return new Save();
}


  public static class Scatter {
  private FTValList args = new FTValList();
  private String output;
  public Scatter set(String name, String value) { args.setValString(name,value); return this; }
 public Scatter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Scatter prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
  public Scatter() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.SCATTER", args); 
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


  public static class Set {
  private FTValList args = new FTValList();
  private String output;
  public Set set(String name, String value) { args.setValString(name,value); return this; }
 public Set name(String val) { args.setValString("NAME", val); return this; } 
      
 public Set field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Set value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Set() { }
  public int run(ICS ics) { 
      ics.runTag("LOCALESTRING.SET", args); 
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
