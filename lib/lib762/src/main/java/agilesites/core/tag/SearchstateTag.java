package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class SearchstateTag  {    
  private static Log log = Log.getLog(SearchstateTag.class);  
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
      ics.runTag("SEARCHSTATE.ARGUMENT", args); 
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
      
 public Create op(String val) { args.setValString("OP", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.CREATE", args); 
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


  public static class Addnestedconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addnestedconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addnestedconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addnestedconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addnestedconstraint searchstate(String val) { args.setValString("SEARCHSTATE", val); return this; } 
      
  public Addnestedconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDNESTEDCONSTRAINT", args); 
      log.trace(ftValList2String("Addnestedconstraint", args));
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
  public Addnestedconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addnestedconstraint addnestedconstraint() {
  return new Addnestedconstraint();
}


  public static class Addrichtextconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addrichtextconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addrichtextconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addrichtextconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addrichtextconstraint value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Addrichtextconstraint confidence(String val) { args.setValString("CONFIDENCE", val); return this; } 
      
 public Addrichtextconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addrichtextconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addrichtextconstraint parser(String val) { args.setValString("PARSER", val); return this; } 
      
 public Addrichtextconstraint maxcount(String val) { args.setValString("MAXCOUNT", val); return this; } 
      
  public Addrichtextconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDRICHTEXTCONSTRAINT", args); 
      log.trace(ftValList2String("Addrichtextconstraint", args));
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
  public Addrichtextconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addrichtextconstraint addrichtextconstraint() {
  return new Addrichtextconstraint();
}


  public static class Addrangeconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addrangeconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addrangeconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addrangeconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addrangeconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addrangeconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addrangeconstraint lower(String val) { args.setValString("LOWER", val); return this; } 
      
 public Addrangeconstraint lowerequal(String val) { args.setValString("LOWEREQUAL", val); return this; } 
      
 public Addrangeconstraint upper(String val) { args.setValString("UPPER", val); return this; } 
      
 public Addrangeconstraint upperequal(String val) { args.setValString("UPPEREQUAL", val); return this; } 
      
  public Addrangeconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDRANGECONSTRAINT", args); 
      log.trace(ftValList2String("Addrangeconstraint", args));
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
  public Addrangeconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addrangeconstraint addrangeconstraint() {
  return new Addrangeconstraint();
}


  public static class Addsimplestandardconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addsimplestandardconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addsimplestandardconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addsimplestandardconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addsimplestandardconstraint value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Addsimplestandardconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addsimplestandardconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addsimplestandardconstraint immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
  public Addsimplestandardconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDSIMPLESTANDARDCONSTRAINT", args); 
      log.trace(ftValList2String("Addsimplestandardconstraint", args));
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
  public Addsimplestandardconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addsimplestandardconstraint addsimplestandardconstraint() {
  return new Addsimplestandardconstraint();
}


  public static class Addstandardconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addstandardconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addstandardconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addstandardconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addstandardconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addstandardconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addstandardconstraint list(String val) { args.setValString("LIST", val); return this; } 
      
 public Addstandardconstraint immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
 public Addstandardconstraint caseinsensitive(String val) { args.setValString("CASEINSENSITIVE", val); return this; } 
      
  public Addstandardconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDSTANDARDCONSTRAINT", args); 
      log.trace(ftValList2String("Addstandardconstraint", args));
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
  public Addstandardconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addstandardconstraint addstandardconstraint() {
  return new Addstandardconstraint();
}


  public static class Deleteconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Deleteconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deleteconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Deleteconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Deleteconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
  public Deleteconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.DELETECONSTRAINT", args); 
      log.trace(ftValList2String("Deleteconstraint", args));
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
  public Deleteconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteconstraint deleteconstraint() {
  return new Deleteconstraint();
}


  public static class Duplicate {
  private FTValList args = new FTValList();
  private String output;
  public Duplicate set(String name, String value) { args.setValString(name,value); return this; }
 public Duplicate name(String val) { args.setValString("NAME", val); return this; } 
      
 public Duplicate varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Duplicate() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.DUPLICATE", args); 
      log.trace(ftValList2String("Duplicate", args));
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
  public Duplicate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Duplicate duplicate() {
  return new Duplicate();
}


  public static class Findconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Findconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Findconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Findconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Findconstraint varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Findconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Findconstraint objvarname(String val) { args.setValString("OBJVARNAME", val); return this; } 
      
 public Findconstraint attrtypevarname(String val) { args.setValString("ATTRTYPEVARNAME", val); return this; } 
      
 public Findconstraint attrvarname(String val) { args.setValString("ATTRVARNAME", val); return this; } 
      
 public Findconstraint listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Findconstraint expressionvarname(String val) { args.setValString("EXPRESSIONVARNAME", val); return this; } 
      
 public Findconstraint parservarname(String val) { args.setValString("PARSERVARNAME", val); return this; } 
      
 public Findconstraint confidencevarname(String val) { args.setValString("CONFIDENCEVARNAME", val); return this; } 
      
 public Findconstraint maxcountvarname(String val) { args.setValString("MAXCOUNTVARNAME", val); return this; } 
      
 public Findconstraint lowervarname(String val) { args.setValString("LOWERVARNAME", val); return this; } 
      
 public Findconstraint uppervarname(String val) { args.setValString("UPPERVARNAME", val); return this; } 
      
 public Findconstraint lowerequalvarname(String val) { args.setValString("LOWEREQUALVARNAME", val); return this; } 
      
 public Findconstraint upperequalvarname(String val) { args.setValString("UPPEREQUALVARNAME", val); return this; } 
      
 public Findconstraint immediateonlyvarname(String val) { args.setValString("IMMEDIATEONLYVARNAME", val); return this; } 
      
  public Findconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.FINDCONSTRAINT", args); 
      log.trace(ftValList2String("Findconstraint", args));
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
  public Findconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Findconstraint findconstraint() {
  return new Findconstraint();
}


  public static class Fromstring {
  private FTValList args = new FTValList();
  private String output;
  public Fromstring set(String name, String value) { args.setValString(name,value); return this; }
 public Fromstring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fromstring value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Fromstring() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.FROMSTRING", args); 
      log.trace(ftValList2String("Fromstring", args));
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
  public Fromstring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fromstring fromstring() {
  return new Fromstring();
}


  public static class Tostring {
  private FTValList args = new FTValList();
  private String output;
  public Tostring set(String name, String value) { args.setValString(name,value); return this; }
 public Tostring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Tostring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Tostring() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.TOSTRING", args); 
      log.trace(ftValList2String("Tostring", args));
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
  public Tostring set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Tostring tostring() {
  return new Tostring();
}


  public static class Addsimplelikeconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addsimplelikeconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addsimplelikeconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addsimplelikeconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addsimplelikeconstraint value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Addsimplelikeconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addsimplelikeconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addsimplelikeconstraint immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
  public Addsimplelikeconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDSIMPLELIKECONSTRAINT", args); 
      log.trace(ftValList2String("Addsimplelikeconstraint", args));
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
  public Addsimplelikeconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addsimplelikeconstraint addsimplelikeconstraint() {
  return new Addsimplelikeconstraint();
}


  public static class Addlikeconstraint {
  private FTValList args = new FTValList();
  private String output;
  public Addlikeconstraint set(String name, String value) { args.setValString(name,value); return this; }
 public Addlikeconstraint name(String val) { args.setValString("NAME", val); return this; } 
      
 public Addlikeconstraint attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Addlikeconstraint bucket(String val) { args.setValString("BUCKET", val); return this; } 
      
 public Addlikeconstraint typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Addlikeconstraint list(String val) { args.setValString("LIST", val); return this; } 
      
 public Addlikeconstraint immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
 public Addlikeconstraint caseinsensitive(String val) { args.setValString("CASEINSENSITIVE", val); return this; } 
      
  public Addlikeconstraint() { }
  public int run(ICS ics) { 
      ics.runTag("SEARCHSTATE.ADDLIKECONSTRAINT", args); 
      log.trace(ftValList2String("Addlikeconstraint", args));
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
  public Addlikeconstraint set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addlikeconstraint addlikeconstraint() {
  return new Addlikeconstraint();
}

}
