package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class InsiteTag  {    
  private static Log log = Log.getLog(InsiteTag.class);  
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
      ics.runTag("INSITE.ARGUMENT", args); 
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


  public static class Edit {
  private FTValList args = new FTValList();
  private String output;
  public Edit set(String name, String value) { args.setValString(name,value); return this; }
 public Edit assetfieldvalue(String val) { args.setValString("ASSETFIELDVALUE", val); return this; } 
      
 public Edit value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Edit variable(String val) { args.setValString("VARIABLE", val); return this; } 
      
 public Edit list(String val) { args.setValString("LIST", val); return this; } 
      
 public Edit column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Edit ssvariable(String val) { args.setValString("SSVARIABLE", val); return this; } 
      
 public Edit property(String val) { args.setValString("PROPERTY", val); return this; } 
      
 public Edit assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Edit assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Edit assetfield(String val) { args.setValString("ASSETFIELD", val); return this; } 
      
 public Edit editor(String val) { args.setValString("EDITOR", val); return this; } 
      
 public Edit field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Edit width(String val) { args.setValString("WIDTH", val); return this; } 
      
 public Edit height(String val) { args.setValString("HEIGHT", val); return this; } 
      
 public Edit mode(String val) { args.setValString("MODE", val); return this; } 
      
 public Edit params(String val) { args.setValString("PARAMS", val); return this; } 
      
 public Edit index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Edit() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.EDIT", args); 
      log.trace(ftValList2String("Edit", args));
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
  public Edit set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Edit edit() {
  return new Edit();
}


  public static class Calltemplate {
  private FTValList args = new FTValList();
  private String output;
  public Calltemplate set(String name, String value) { args.setValString(name,value); return this; }
 public Calltemplate cid(String val) { args.setValString("CID", val); return this; } 
      
 public Calltemplate c(String val) { args.setValString("C", val); return this; } 
      
 public Calltemplate packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Calltemplate tid(String val) { args.setValString("TID", val); return this; } 
      
 public Calltemplate slotname(String val) { args.setValString("SLOTNAME", val); return this; } 
      
 public Calltemplate context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Calltemplate site(String val) { args.setValString("SITE", val); return this; } 
      
 public Calltemplate ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Calltemplate tname(String val) { args.setValString("TNAME", val); return this; } 
      
 public Calltemplate style(String val) { args.setValString("STYLE", val); return this; } 
      
 public Calltemplate clegal(String val) { args.setValString("CLEGAL", val); return this; } 
      
 public Calltemplate cssstyle(String val) { args.setValString("CSSSTYLE", val); return this; } 
      
 public Calltemplate parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Calltemplate parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Calltemplate parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
 public Calltemplate assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Calltemplate assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Calltemplate field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Calltemplate defaultvalue(String val) { args.setValString("DEFAULTVALUE", val); return this; } 
      
 public Calltemplate variant(String val) { args.setValString("VARIANT", val); return this; } 
      
 public Calltemplate emptytext(String val) { args.setValString("EMPTYTEXT", val); return this; } 
      
 public Calltemplate roles(String val) { args.setValString("ROLES", val); return this; } 
      
 public Calltemplate args(String val) { args.setValString("ARGS", val); return this; } 
      
 public Calltemplate title(String val) { args.setValString("TITLE", val); return this; } 
      
 public Calltemplate buttons(String val) { args.setValString("BUTTONS", val); return this; } 
      
 public Calltemplate index(String val) { args.setValString("INDEX", val); return this; } 
      
 public Calltemplate d(String val) { args.setValString("D", val); return this; } 
      
 public Calltemplate resolvetemplatefordevice(String val) { args.setValString("RESOLVETEMPLATEFORDEVICE", val); return this; } 
      
  public Calltemplate() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.CALLTEMPLATE", args); 
      log.trace(ftValList2String("Calltemplate", args));
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
  public Calltemplate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Calltemplate calltemplate() {
  return new Calltemplate();
}


  public static class Slotlist {
  private FTValList args = new FTValList();
  private String output;
  public Slotlist set(String name, String value) { args.setValString(name,value); return this; }
 public Slotlist slotname(String val) { args.setValString("SLOTNAME", val); return this; } 
      
 public Slotlist context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Slotlist ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Slotlist tname(String val) { args.setValString("TNAME", val); return this; } 
      
 public Slotlist style(String val) { args.setValString("STYLE", val); return this; } 
      
 public Slotlist clegal(String val) { args.setValString("CLEGAL", val); return this; } 
      
 public Slotlist parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Slotlist parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Slotlist parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
 public Slotlist assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Slotlist assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Slotlist field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Slotlist variant(String val) { args.setValString("VARIANT", val); return this; } 
      
 public Slotlist emptytext(String val) { args.setValString("EMPTYTEXT", val); return this; } 
      
 public Slotlist countervar(String val) { args.setValString("COUNTERVAR", val); return this; } 
      
 public Slotlist roles(String val) { args.setValString("ROLES", val); return this; } 
      
 public Slotlist title(String val) { args.setValString("TITLE", val); return this; } 
      
 public Slotlist buttons(String val) { args.setValString("BUTTONS", val); return this; } 
      
  public Slotlist() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.SLOTLIST", args); 
      log.trace(ftValList2String("Slotlist", args));
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
  public Slotlist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Slotlist slotlist() {
  return new Slotlist();
}


  public static class List {
  private FTValList args = new FTValList();
  private String output;
  public List set(String name, String value) { args.setValString(name,value); return this; }
 public List field(String val) { args.setValString("FIELD", val); return this; } 
      
 public List assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public List assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public List editor(String val) { args.setValString("EDITOR", val); return this; } 
      
 public List params(String val) { args.setValString("PARAMS", val); return this; } 
      
 public List mode(String val) { args.setValString("MODE", val); return this; } 
      
 public List countervar(String val) { args.setValString("COUNTERVAR", val); return this; } 
      
 public List buttons(String val) { args.setValString("BUTTONS", val); return this; } 
      
  public List() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.LIST", args); 
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


  public static class Ifedit {
  private FTValList args = new FTValList();
  private String output;
  public Ifedit set(String name, String value) { args.setValString(name,value); return this; }

  public Ifedit() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.IFEDIT", args); 
      log.trace(ftValList2String("Ifedit", args));
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
  public Ifedit set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Ifedit ifedit() {
  return new Ifedit();
}


  public static class Setlocale {
  private FTValList args = new FTValList();
  private String output;
  public Setlocale set(String name, String value) { args.setValString(name,value); return this; }
 public Setlocale locale(String val) { args.setValString("LOCALE", val); return this; } 
      
  public Setlocale() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.SETLOCALE", args); 
      log.trace(ftValList2String("Setlocale", args));
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
  public Setlocale set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setlocale setlocale() {
  return new Setlocale();
}

}
