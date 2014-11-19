package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class VdmTag  {    
  private static Log log = Log.getLog(VdmTag.class);  
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
      ics.runTag("VDM.ARGUMENT", args); 
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


  public static class Setscalar {
  private FTValList args = new FTValList();
  private String output;
  public Setscalar set(String name, String value) { args.setValString(name,value); return this; }
 public Setscalar attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Setscalar value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setscalar() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.SETSCALAR", args); 
      log.trace(ftValList2String("Setscalar", args));
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
  public Setscalar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setscalar setscalar() {
  return new Setscalar();
}


  public static class Recordhistory {
  private FTValList args = new FTValList();
  private String output;
  public Recordhistory set(String name, String value) { args.setValString(name,value); return this; }
 public Recordhistory attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Recordhistory list(String val) { args.setValString("LIST", val); return this; } 
      
  public Recordhistory() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.RECORDHISTORY", args); 
      log.trace(ftValList2String("Recordhistory", args));
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
  public Recordhistory set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Recordhistory recordhistory() {
  return new Recordhistory();
}


  public static class Gethistoryearliest {
  private FTValList args = new FTValList();
  private String output;
  public Gethistoryearliest set(String name, String value) { args.setValString(name,value); return this; }
 public Gethistoryearliest attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Gethistoryearliest varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gethistoryearliest startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
 public Gethistoryearliest enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Gethistoryearliest list(String val) { args.setValString("LIST", val); return this; } 
      
  public Gethistoryearliest() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETHISTORYEARLIEST", args); 
      log.trace(ftValList2String("Gethistoryearliest", args));
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
  public Gethistoryearliest set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gethistoryearliest gethistoryearliest() {
  return new Gethistoryearliest();
}


  public static class Gethistorylatest {
  private FTValList args = new FTValList();
  private String output;
  public Gethistorylatest set(String name, String value) { args.setValString(name,value); return this; }
 public Gethistorylatest attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Gethistorylatest varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gethistorylatest startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
 public Gethistorylatest enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Gethistorylatest list(String val) { args.setValString("LIST", val); return this; } 
      
  public Gethistorylatest() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETHISTORYLATEST", args); 
      log.trace(ftValList2String("Gethistorylatest", args));
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
  public Gethistorylatest set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gethistorylatest gethistorylatest() {
  return new Gethistorylatest();
}


  public static class Getscalar {
  private FTValList args = new FTValList();
  private String output;
  public Getscalar set(String name, String value) { args.setValString(name,value); return this; }
 public Getscalar attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Getscalar varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getscalar() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETSCALAR", args); 
      log.trace(ftValList2String("Getscalar", args));
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
  public Getscalar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getscalar getscalar() {
  return new Getscalar();
}


  public static class Gethistorycount {
  private FTValList args = new FTValList();
  private String output;
  public Gethistorycount set(String name, String value) { args.setValString(name,value); return this; }
 public Gethistorycount attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Gethistorycount varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gethistorycount startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
 public Gethistorycount enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Gethistorycount list(String val) { args.setValString("LIST", val); return this; } 
      
  public Gethistorycount() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETHISTORYCOUNT", args); 
      log.trace(ftValList2String("Gethistorycount", args));
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
  public Gethistorycount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gethistorycount gethistorycount() {
  return new Gethistorycount();
}


  public static class Gethistorysum {
  private FTValList args = new FTValList();
  private String output;
  public Gethistorysum set(String name, String value) { args.setValString(name,value); return this; }
 public Gethistorysum attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Gethistorysum varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gethistorysum field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Gethistorysum startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
 public Gethistorysum enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Gethistorysum list(String val) { args.setValString("LIST", val); return this; } 
      
  public Gethistorysum() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETHISTORYSUM", args); 
      log.trace(ftValList2String("Gethistorysum", args));
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
  public Gethistorysum set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gethistorysum gethistorysum() {
  return new Gethistorysum();
}


  public static class Getalias {
  private FTValList args = new FTValList();
  private String output;
  public Getalias set(String name, String value) { args.setValString(name,value); return this; }
 public Getalias key(String val) { args.setValString("KEY", val); return this; } 
      
 public Getalias varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getalias() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETALIAS", args); 
      log.trace(ftValList2String("Getalias", args));
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
  public Getalias set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getalias getalias() {
  return new Getalias();
}


  public static class Setalias {
  private FTValList args = new FTValList();
  private String output;
  public Setalias set(String name, String value) { args.setValString(name,value); return this; }
 public Setalias key(String val) { args.setValString("KEY", val); return this; } 
      
 public Setalias value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setalias() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.SETALIAS", args); 
      log.trace(ftValList2String("Setalias", args));
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
  public Setalias set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setalias setalias() {
  return new Setalias();
}


  public static class Getcommerceid {
  private FTValList args = new FTValList();
  private String output;
  public Getcommerceid set(String name, String value) { args.setValString(name,value); return this; }
 public Getcommerceid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getcommerceid() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETCOMMERCEID", args); 
      log.trace(ftValList2String("Getcommerceid", args));
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
  public Getcommerceid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcommerceid getcommerceid() {
  return new Getcommerceid();
}


  public static class Setcommerceid {
  private FTValList args = new FTValList();
  private String output;
  public Setcommerceid set(String name, String value) { args.setValString(name,value); return this; }
 public Setcommerceid id(String val) { args.setValString("ID", val); return this; } 
      
  public Setcommerceid() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.SETCOMMERCEID", args); 
      log.trace(ftValList2String("Setcommerceid", args));
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
  public Setcommerceid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setcommerceid setcommerceid() {
  return new Setcommerceid();
}


  public static class Getaccessid {
  private FTValList args = new FTValList();
  private String output;
  public Getaccessid set(String name, String value) { args.setValString(name,value); return this; }
 public Getaccessid key(String val) { args.setValString("KEY", val); return this; } 
      
 public Getaccessid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getaccessid() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.GETACCESSID", args); 
      log.trace(ftValList2String("Getaccessid", args));
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
  public Getaccessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getaccessid getaccessid() {
  return new Getaccessid();
}


  public static class Setaccessid {
  private FTValList args = new FTValList();
  private String output;
  public Setaccessid set(String name, String value) { args.setValString(name,value); return this; }
 public Setaccessid key(String val) { args.setValString("KEY", val); return this; } 
      
 public Setaccessid id(String val) { args.setValString("ID", val); return this; } 
      
  public Setaccessid() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.SETACCESSID", args); 
      log.trace(ftValList2String("Setaccessid", args));
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
  public Setaccessid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setaccessid setaccessid() {
  return new Setaccessid();
}


  public static class Savescalarobject {
  private FTValList args = new FTValList();
  private String output;
  public Savescalarobject set(String name, String value) { args.setValString(name,value); return this; }
 public Savescalarobject attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Savescalarobject object(String val) { args.setValString("OBJECT", val); return this; } 
      
  public Savescalarobject() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.SAVESCALAROBJECT", args); 
      log.trace(ftValList2String("Savescalarobject", args));
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
  public Savescalarobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Savescalarobject savescalarobject() {
  return new Savescalarobject();
}


  public static class Loadscalarobject {
  private FTValList args = new FTValList();
  private String output;
  public Loadscalarobject set(String name, String value) { args.setValString(name,value); return this; }
 public Loadscalarobject attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Loadscalarobject varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Loadscalarobject() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.LOADSCALAROBJECT", args); 
      log.trace(ftValList2String("Loadscalarobject", args));
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
  public Loadscalarobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Loadscalarobject loadscalarobject() {
  return new Loadscalarobject();
}


  public static class Flushinactive {
  private FTValList args = new FTValList();
  private String output;
  public Flushinactive set(String name, String value) { args.setValString(name,value); return this; }
 public Flushinactive startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
  public Flushinactive() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.FLUSHINACTIVE", args); 
      log.trace(ftValList2String("Flushinactive", args));
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
  public Flushinactive set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flushinactive flushinactive() {
  return new Flushinactive();
}


  public static class Mergeinactive {
  private FTValList args = new FTValList();
  private String output;
  public Mergeinactive set(String name, String value) { args.setValString(name,value); return this; }
 public Mergeinactive startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
  public Mergeinactive() { }
  public int run(ICS ics) { 
      ics.runTag("VDM.MERGEINACTIVE", args); 
      log.trace(ftValList2String("Mergeinactive", args));
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
  public Mergeinactive set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Mergeinactive mergeinactive() {
  return new Mergeinactive();
}

}
