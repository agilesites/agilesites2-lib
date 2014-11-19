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


  public static class Createasset {
  private FTValList args = new FTValList();
  private String output;
  public Createasset set(String name, String value) { args.setValString(name,value); return this; }
 public Createasset assettypes(String val) { args.setValString("ASSETTYPES", val); return this; } 
      
 public Createasset startmenu(String val) { args.setValString("STARTMENU", val); return this; } 
      
 public Createasset displayname(String val) { args.setValString("DISPLAYNAME", val); return this; } 
      
 public Createasset dmv(String val) { args.setValString("DMV", val); return this; } 
      
  public Createasset() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.CREATEASSET", args); 
      log.trace(ftValList2String("Createasset", args));
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
  public Createasset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Createasset createasset() {
  return new Createasset();
}


  public static class Editasset {
  private FTValList args = new FTValList();
  private String output;
  public Editasset set(String name, String value) { args.setValString(name,value); return this; }
 public Editasset assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Editasset assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Editasset displayname(String val) { args.setValString("DISPLAYNAME", val); return this; } 
      
 public Editasset dmv(String val) { args.setValString("DMV", val); return this; } 
      
  public Editasset() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.EDITASSET", args); 
      log.trace(ftValList2String("Editasset", args));
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
  public Editasset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Editasset editasset() {
  return new Editasset();
}


  public static class Edit {
  private FTValList args = new FTValList();
  private String output;
  public Edit set(String name, String value) { args.setValString(name,value); return this; }
 public Edit assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Edit assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Edit assetfield(String val) { args.setValString("ASSETFIELD", val); return this; } 
      
 public Edit assetfieldvalue(String val) { args.setValString("ASSETFIELDVALUE", val); return this; } 
      
 public Edit variable(String val) { args.setValString("VARIABLE", val); return this; } 
      
 public Edit list(String val) { args.setValString("LIST", val); return this; } 
      
 public Edit column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Edit ssvariable(String val) { args.setValString("SSVARIABLE", val); return this; } 
      
 public Edit property(String val) { args.setValString("PROPERTY", val); return this; } 
      
 public Edit editor(String val) { args.setValString("EDITOR", val); return this; } 
      
 public Edit ewebeditpro(String val) { args.setValString("EWEBEDITPRO", val); return this; } 
      
 public Edit width(String val) { args.setValString("WIDTH", val); return this; } 
      
 public Edit height(String val) { args.setValString("HEIGHT", val); return this; } 
      
 public Edit mode(String val) { args.setValString("MODE", val); return this; } 
      
 public Edit params(String val) { args.setValString("PARAMS", val); return this; } 
      
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
 public Calltemplate tid(String val) { args.setValString("TID", val); return this; } 
      
 public Calltemplate slotname(String val) { args.setValString("SLOTNAME", val); return this; } 
      
 public Calltemplate site(String val) { args.setValString("SITE", val); return this; } 
      
 public Calltemplate cid(String val) { args.setValString("CID", val); return this; } 
      
 public Calltemplate c(String val) { args.setValString("C", val); return this; } 
      
 public Calltemplate packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Calltemplate context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Calltemplate ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Calltemplate tname(String val) { args.setValString("TNAME", val); return this; } 
      
 public Calltemplate style(String val) { args.setValString("STYLE", val); return this; } 
      
 public Calltemplate clegal(String val) { args.setValString("CLEGAL", val); return this; } 
      
 public Calltemplate cssstyle(String val) { args.setValString("CSSSTYLE", val); return this; } 
      
 public Calltemplate parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Calltemplate parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Calltemplate parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
 public Calltemplate defaultvalue(String val) { args.setValString("DEFAULTVALUE", val); return this; } 
      
 public Calltemplate variant(String val) { args.setValString("VARIANT", val); return this; } 
      
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


  public static class Addref {
  private FTValList args = new FTValList();
  private String output;
  public Addref set(String name, String value) { args.setValString(name,value); return this; }
 public Addref parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Addref parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Addref parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
  public Addref() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.ADDREF", args); 
      log.trace(ftValList2String("Addref", args));
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
  public Addref set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addref addref() {
  return new Addref();
}


  public static class Beginlist {
  private FTValList args = new FTValList();
  private String output;
  public Beginlist set(String name, String value) { args.setValString(name,value); return this; }
 public Beginlist parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Beginlist parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Beginlist parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
 public Beginlist cssstyle(String val) { args.setValString("CSSSTYLE", val); return this; } 
      
  public Beginlist() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.BEGINLIST", args); 
      log.trace(ftValList2String("Beginlist", args));
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
  public Beginlist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Beginlist beginlist() {
  return new Beginlist();
}


  public static class Endlist {
  private FTValList args = new FTValList();
  private String output;
  public Endlist set(String name, String value) { args.setValString(name,value); return this; }

  public Endlist() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.ENDLIST", args); 
      log.trace(ftValList2String("Endlist", args));
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
  public Endlist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Endlist endlist() {
  return new Endlist();
}


  public static class Beginref {
  private FTValList args = new FTValList();
  private String output;
  public Beginref set(String name, String value) { args.setValString(name,value); return this; }
 public Beginref parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
 public Beginref parenttype(String val) { args.setValString("PARENTTYPE", val); return this; } 
      
 public Beginref parentfield(String val) { args.setValString("PARENTFIELD", val); return this; } 
      
 public Beginref id(String val) { args.setValString("ID", val); return this; } 
      
 public Beginref type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Beginref cssstyle(String val) { args.setValString("CSSSTYLE", val); return this; } 
      
  public Beginref() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.BEGINREF", args); 
      log.trace(ftValList2String("Beginref", args));
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
  public Beginref set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Beginref beginref() {
  return new Beginref();
}


  public static class Endref {
  private FTValList args = new FTValList();
  private String output;
  public Endref set(String name, String value) { args.setValString(name,value); return this; }

  public Endref() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.ENDREF", args); 
      log.trace(ftValList2String("Endref", args));
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
  public Endref set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Endref endref() {
  return new Endref();
}


  public static class Addvalue {
  private FTValList args = new FTValList();
  private String output;
  public Addvalue set(String name, String value) { args.setValString(name,value); return this; }
 public Addvalue assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Addvalue assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Addvalue assetfield(String val) { args.setValString("ASSETFIELD", val); return this; } 
      
 public Addvalue mode(String val) { args.setValString("MODE", val); return this; } 
      
 public Addvalue delim(String val) { args.setValString("DELIM", val); return this; } 
      
 public Addvalue editor(String val) { args.setValString("EDITOR", val); return this; } 
      
 public Addvalue width(String val) { args.setValString("WIDTH", val); return this; } 
      
 public Addvalue height(String val) { args.setValString("HEIGHT", val); return this; } 
      
 public Addvalue params(String val) { args.setValString("PARAMS", val); return this; } 
      
  public Addvalue() { }
  public int run(ICS ics) { 
      ics.runTag("INSITE.ADDVALUE", args); 
      log.trace(ftValList2String("Addvalue", args));
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
  public Addvalue set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addvalue addvalue() {
  return new Addvalue();
}

}
