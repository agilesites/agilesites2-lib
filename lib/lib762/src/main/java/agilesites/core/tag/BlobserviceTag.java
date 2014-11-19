package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class BlobserviceTag  {    
  private static Log log = Log.getLog(BlobserviceTag.class);  
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
      ics.runTag("BLOBSERVICE.ARGUMENT", args); 
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


  public static class Readdata {
  private FTValList args = new FTValList();
  private String output;
  public Readdata set(String name, String value) { args.setValString(name,value); return this; }
 public Readdata listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Readdata id(String val) { args.setValString("ID", val); return this; } 
      
  public Readdata() { }
  public int run(ICS ics) { 
      ics.runTag("BLOBSERVICE.READDATA", args); 
      log.trace(ftValList2String("Readdata", args));
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
  public Readdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Readdata readdata() {
  return new Readdata();
}


  public static class Getidcolumn {
  private FTValList args = new FTValList();
  private String output;
  public Getidcolumn set(String name, String value) { args.setValString(name,value); return this; }
 public Getidcolumn varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getidcolumn() { }
  public int run(ICS ics) { 
      ics.runTag("BLOBSERVICE.GETIDCOLUMN", args); 
      log.trace(ftValList2String("Getidcolumn", args));
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
  public Getidcolumn set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getidcolumn getidcolumn() {
  return new Getidcolumn();
}


  public static class Gettablename {
  private FTValList args = new FTValList();
  private String output;
  public Gettablename set(String name, String value) { args.setValString(name,value); return this; }
 public Gettablename varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Gettablename() { }
  public int run(ICS ics) { 
      ics.runTag("BLOBSERVICE.GETTABLENAME", args); 
      log.trace(ftValList2String("Gettablename", args));
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
  public Gettablename set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettablename gettablename() {
  return new Gettablename();
}


  public static class Geturlcolumn {
  private FTValList args = new FTValList();
  private String output;
  public Geturlcolumn set(String name, String value) { args.setValString(name,value); return this; }
 public Geturlcolumn varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Geturlcolumn() { }
  public int run(ICS ics) { 
      ics.runTag("BLOBSERVICE.GETURLCOLUMN", args); 
      log.trace(ftValList2String("Geturlcolumn", args));
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
  public Geturlcolumn set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Geturlcolumn geturlcolumn() {
  return new Geturlcolumn();
}

}
