package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class StringTag  {    
  private static Log log = Log.getLog(StringTag.class);  
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
      ics.runTag("STRING.ARGUMENT", args); 
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


  public static class Toobject {
  private FTValList args = new FTValList();
  private String output;
  public Toobject set(String name, String value) { args.setValString(name,value); return this; }
 public Toobject value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Toobject varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Toobject() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.TOOBJECT", args); 
      log.trace(ftValList2String("Toobject", args));
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
  public Toobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Toobject toobject() {
  return new Toobject();
}


  public static class Length {
  private FTValList args = new FTValList();
  private String output;
  public Length set(String name, String value) { args.setValString(name,value); return this; }
 public Length value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Length varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Length() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.LENGTH", args); 
      log.trace(ftValList2String("Length", args));
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
  public Length set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Length length() {
  return new Length();
}


  public static class Fromobject {
  private FTValList args = new FTValList();
  private String output;
  public Fromobject set(String name, String value) { args.setValString(name,value); return this; }
 public Fromobject value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Fromobject varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Fromobject() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.FROMOBJECT", args); 
      log.trace(ftValList2String("Fromobject", args));
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
  public Fromobject set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fromobject fromobject() {
  return new Fromobject();
}


  public static class Stream {
  private FTValList args = new FTValList();
  private String output;
  public Stream set(String name, String value) { args.setValString(name,value); return this; }
 public Stream value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Stream variable(String val) { args.setValString("VARIABLE", val); return this; } 
      
 public Stream ssvariable(String val) { args.setValString("SSVARIABLE", val); return this; } 
      
 public Stream property(String val) { args.setValString("PROPERTY", val); return this; } 
      
 public Stream list(String val) { args.setValString("LIST", val); return this; } 
      
 public Stream column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Stream filecolumn(String val) { args.setValString("FILECOLUMN", val); return this; } 
      
  public Stream() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.STREAM", args); 
      log.trace(ftValList2String("Stream", args));
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
  public Stream set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Stream stream() {
  return new Stream();
}


  public static class Streambinary {
  private FTValList args = new FTValList();
  private String output;
  public Streambinary set(String name, String value) { args.setValString(name,value); return this; }
 public Streambinary list(String val) { args.setValString("LIST", val); return this; } 
      
 public Streambinary cgi(String val) { args.setValString("CGI", val); return this; } 
      
 public Streambinary filename(String val) { args.setValString("FILENAME", val); return this; } 
      
 public Streambinary column(String val) { args.setValString("COLUMN", val); return this; } 
      
  public Streambinary() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.STREAMBINARY", args); 
      log.trace(ftValList2String("Streambinary", args));
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
  public Streambinary set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Streambinary streambinary() {
  return new Streambinary();
}


  public static class Encode {
  private FTValList args = new FTValList();
  private String output;
  public Encode set(String name, String value) { args.setValString(name,value); return this; }
 public Encode varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Encode value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Encode variable(String val) { args.setValString("VARIABLE", val); return this; } 
      
 public Encode ssvariable(String val) { args.setValString("SSVARIABLE", val); return this; } 
      
 public Encode property(String val) { args.setValString("PROPERTY", val); return this; } 
      
 public Encode list(String val) { args.setValString("LIST", val); return this; } 
      
 public Encode column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Encode filecolumn(String val) { args.setValString("FILECOLUMN", val); return this; } 
      
  public Encode() { }
  public int run(ICS ics) { 
      ics.runTag("STRING.ENCODE", args); 
      log.trace(ftValList2String("Encode", args));
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
  public Encode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Encode encode() {
  return new Encode();
}

}
