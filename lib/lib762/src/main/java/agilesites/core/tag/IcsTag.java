package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class IcsTag  {    
  private static Log log = Log.getLog(IcsTag.class);  
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
    
 
  public static class Debug {
  private FTValList args = new FTValList();
  private String output;
  public Debug set(String name, String value) { args.setValString(name,value); return this; }
 public Debug on(String val) { args.setValString("ON", val); return this; } 
      
  public Debug() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.DEBUG", args); 
      log.trace(ftValList2String("Debug", args));
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
  public Debug set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Debug debug() {
  return new Debug();
}


  public static class Cdata {
  private FTValList args = new FTValList();
  private String output;
  public Cdata set(String name, String value) { args.setValString(name,value); return this; }

  public Cdata() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CDATA", args); 
      log.trace(ftValList2String("Cdata", args));
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
  public Cdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cdata cdata() {
  return new Cdata();
}


  public static class Getcookie {
  private FTValList args = new FTValList();
  private String output;
  public Getcookie set(String name, String value) { args.setValString(name,value); return this; }
 public Getcookie name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcookie output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getcookie() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETCOOKIE", args); 
      log.trace(ftValList2String("Getcookie", args));
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
  public Getcookie set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcookie getcookie() {
  return new Getcookie();
}


  public static class Geterrno {
  private FTValList args = new FTValList();
  private String output;
  public Geterrno set(String name, String value) { args.setValString(name,value); return this; }

  public Geterrno() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETERRNO", args); 
      log.trace(ftValList2String("Geterrno", args));
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
  public Geterrno set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Geterrno geterrno() {
  return new Geterrno();
}


  public static class Getvar {
  private FTValList args = new FTValList();
  private String output;
  public Getvar set(String name, String value) { args.setValString(name,value); return this; }
 public Getvar name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getvar encoding(String val) { args.setValString("ENCODING", val); return this; } 
      
 public Getvar output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getvar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETVAR", args); 
      log.trace(ftValList2String("Getvar", args));
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
  public Getvar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getvar getvar() {
  return new Getvar();
}


  public static class Getssvar {
  private FTValList args = new FTValList();
  private String output;
  public Getssvar set(String name, String value) { args.setValString(name,value); return this; }
 public Getssvar name(String val) { args.setValString("NAME", val); return this; } 
      
  public Getssvar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETSSVAR", args); 
      log.trace(ftValList2String("Getssvar", args));
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
  public Getssvar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getssvar getssvar() {
  return new Getssvar();
}


  public static class Resolvevariables {
  private FTValList args = new FTValList();
  private String output;
  public Resolvevariables set(String name, String value) { args.setValString(name,value); return this; }
 public Resolvevariables name(String val) { args.setValString("NAME", val); return this; } 
      
 public Resolvevariables delimited(String val) { args.setValString("DELIMITED", val); return this; } 
      
 public Resolvevariables output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Resolvevariables() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.RESOLVEVARIABLES", args); 
      log.trace(ftValList2String("Resolvevariables", args));
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
  public Resolvevariables set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Resolvevariables resolvevariables() {
  return new Resolvevariables();
}


  public static class Hasdata {
  private FTValList args = new FTValList();
  private String output;
  public Hasdata set(String name, String value) { args.setValString(name,value); return this; }
 public Hasdata listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
  public Hasdata() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.HASDATA", args); 
      log.trace(ftValList2String("Hasdata", args));
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
  public Hasdata set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Hasdata hasdata() {
  return new Hasdata();
}


  public static class Listget {
  private FTValList args = new FTValList();
  private String output;
  public Listget set(String name, String value) { args.setValString(name,value); return this; }
 public Listget listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Listget fieldname(String val) { args.setValString("FIELDNAME", val); return this; } 
      
 public Listget output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Listget() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.LISTGET", args); 
      log.trace(ftValList2String("Listget", args));
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
  public Listget set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Listget listget() {
  return new Listget();
}


  public static class Seterrno {
  private FTValList args = new FTValList();
  private String output;
  public Seterrno set(String name, String value) { args.setValString(name,value); return this; }
 public Seterrno value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Seterrno() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SETERRNO", args); 
      log.trace(ftValList2String("Seterrno", args));
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
  public Seterrno set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Seterrno seterrno() {
  return new Seterrno();
}


  public static class Setvar {
  private FTValList args = new FTValList();
  private String output;
  public Setvar set(String name, String value) { args.setValString(name,value); return this; }
 public Setvar name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setvar value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setvar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SETVAR", args); 
      log.trace(ftValList2String("Setvar", args));
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
  public Setvar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setvar setvar() {
  return new Setvar();
}


  public static class Removevar {
  private FTValList args = new FTValList();
  private String output;
  public Removevar set(String name, String value) { args.setValString(name,value); return this; }
 public Removevar name(String val) { args.setValString("NAME", val); return this; } 
      
  public Removevar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.REMOVEVAR", args); 
      log.trace(ftValList2String("Removevar", args));
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
  public Removevar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removevar removevar() {
  return new Removevar();
}


  public static class Setssvar {
  private FTValList args = new FTValList();
  private String output;
  public Setssvar set(String name, String value) { args.setValString(name,value); return this; }
 public Setssvar name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setssvar value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setssvar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SETSSVAR", args); 
      log.trace(ftValList2String("Setssvar", args));
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
  public Setssvar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setssvar setssvar() {
  return new Setssvar();
}


  public static class Removessvar {
  private FTValList args = new FTValList();
  private String output;
  public Removessvar set(String name, String value) { args.setValString(name,value); return this; }
 public Removessvar name(String val) { args.setValString("NAME", val); return this; } 
      
  public Removessvar() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.REMOVESSVAR", args); 
      log.trace(ftValList2String("Removessvar", args));
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
  public Removessvar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removessvar removessvar() {
  return new Removessvar();
}


  public static class Argument {
  private FTValList args = new FTValList();
  private String output;
  public Argument set(String name, String value) { args.setValString(name,value); return this; }
 public Argument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Argument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Argument() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.ARGUMENT", args); 
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


  public static class Callelement {
  private FTValList args = new FTValList();
  private String output;
  public Callelement set(String name, String value) { args.setValString(name,value); return this; }
 public Callelement element(String val) { args.setValString("ELEMENT", val); return this; } 
      
  public Callelement() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CALLELEMENT", args); 
      log.trace(ftValList2String("Callelement", args));
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
  public Callelement set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Callelement callelement() {
  return new Callelement();
}


  public static class Catalogmanager {
  private FTValList args = new FTValList();
  private String output;
  public Catalogmanager set(String name, String value) { args.setValString(name,value); return this; }

  public Catalogmanager() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CATALOGMANAGER", args); 
      log.trace(ftValList2String("Catalogmanager", args));
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
  public Catalogmanager set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Catalogmanager catalogmanager() {
  return new Catalogmanager();
}


  public static class Treemanager {
  private FTValList args = new FTValList();
  private String output;
  public Treemanager set(String name, String value) { args.setValString(name,value); return this; }

  public Treemanager() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.TREEMANAGER", args); 
      log.trace(ftValList2String("Treemanager", args));
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
  public Treemanager set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Treemanager treemanager() {
  return new Treemanager();
}


  public static class Sendmail {
  private FTValList args = new FTValList();
  private String output;
  public Sendmail set(String name, String value) { args.setValString(name,value); return this; }
 public Sendmail to(String val) { args.setValString("TO", val); return this; } 
      
 public Sendmail subject(String val) { args.setValString("SUBJECT", val); return this; } 
      
 public Sendmail body(String val) { args.setValString("BODY", val); return this; } 
      
 public Sendmail replyto(String val) { args.setValString("REPLYTO", val); return this; } 
      
 public Sendmail contenttype(String val) { args.setValString("CONTENTTYPE", val); return this; } 
      
 public Sendmail charset(String val) { args.setValString("CHARSET", val); return this; } 
      
  public Sendmail() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SENDMAIL", args); 
      log.trace(ftValList2String("Sendmail", args));
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
  public Sendmail set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sendmail sendmail() {
  return new Sendmail();
}


  public static class Attachment {
  private FTValList args = new FTValList();
  private String output;
  public Attachment set(String name, String value) { args.setValString(name,value); return this; }
 public Attachment value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Attachment name(String val) { args.setValString("NAME", val); return this; } 
      
  public Attachment() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.ATTACHMENT", args); 
      log.trace(ftValList2String("Attachment", args));
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
  public Attachment set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Attachment attachment() {
  return new Attachment();
}


  public static class Listloop {
  private FTValList args = new FTValList();
  private String output;
  public Listloop set(String name, String value) { args.setValString(name,value); return this; }
 public Listloop listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Listloop maxrows(String val) { args.setValString("MAXROWS", val); return this; } 
      
 public Listloop startrow(String val) { args.setValString("STARTROW", val); return this; } 
      
 public Listloop endrow(String val) { args.setValString("ENDROW", val); return this; } 
      
 public Listloop wrapto(String val) { args.setValString("WRAPTO", val); return this; } 
      
  public Listloop() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.LISTLOOP", args); 
      log.trace(ftValList2String("Listloop", args));
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
  public Listloop set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Listloop listloop() {
  return new Listloop();
}


  public static class If_ {
  private FTValList args = new FTValList();
  private String output;
  public If_ set(String name, String value) { args.setValString(name,value); return this; }
 public If_ condition(String val) { args.setValString("CONDITION", val); return this; } 
      
  public If_() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.IF_", args); 
      log.trace(ftValList2String("If_", args));
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
  public If_ set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static If_ if_() {
  return new If_();
}


  public static class Then {
  private FTValList args = new FTValList();
  private String output;
  public Then set(String name, String value) { args.setValString(name,value); return this; }

  public Then() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.THEN", args); 
      log.trace(ftValList2String("Then", args));
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
  public Then set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Then then() {
  return new Then();
}


  public static class Else_ {
  private FTValList args = new FTValList();
  private String output;
  public Else_ set(String name, String value) { args.setValString(name,value); return this; }

  public Else_() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.ELSE_", args); 
      log.trace(ftValList2String("Else_", args));
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
  public Else_ set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Else_ else_() {
  return new Else_();
}


  public static class Selectto {
  private FTValList args = new FTValList();
  private String output;
  public Selectto set(String name, String value) { args.setValString(name,value); return this; }
 public Selectto table(String val) { args.setValString("TABLE", val); return this; } 
      
 public Selectto listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Selectto what(String val) { args.setValString("WHAT", val); return this; } 
      
 public Selectto where(String val) { args.setValString("WHERE", val); return this; } 
      
 public Selectto orderby(String val) { args.setValString("ORDERBY", val); return this; } 
      
 public Selectto limit(String val) { args.setValString("LIMIT", val); return this; } 
      
  public Selectto() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SELECTTO", args); 
      log.trace(ftValList2String("Selectto", args));
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
  public Selectto set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Selectto selectto() {
  return new Selectto();
}


  public static class Catalogdef {
  private FTValList args = new FTValList();
  private String output;
  public Catalogdef set(String name, String value) { args.setValString(name,value); return this; }
 public Catalogdef table(String val) { args.setValString("TABLE", val); return this; } 
      
 public Catalogdef listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
  public Catalogdef() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CATALOGDEF", args); 
      log.trace(ftValList2String("Catalogdef", args));
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
  public Catalogdef set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Catalogdef catalogdef() {
  return new Catalogdef();
}


  public static class Sql {
  private FTValList args = new FTValList();
  private String output;
  public Sql set(String name, String value) { args.setValString(name,value); return this; }
 public Sql sql(String val) { args.setValString("SQL", val); return this; } 
      
 public Sql listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Sql table(String val) { args.setValString("TABLE", val); return this; } 
      
 public Sql limit(String val) { args.setValString("LIMIT", val); return this; } 
      
  public Sql() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SQL", args); 
      log.trace(ftValList2String("Sql", args));
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
  public Sql set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sql sql() {
  return new Sql();
}


  public static class Callsql {
  private FTValList args = new FTValList();
  private String output;
  public Callsql set(String name, String value) { args.setValString(name,value); return this; }
 public Callsql qryname(String val) { args.setValString("QRYNAME", val); return this; } 
      
 public Callsql listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Callsql limit(String val) { args.setValString("LIMIT", val); return this; } 
      
  public Callsql() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CALLSQL", args); 
      log.trace(ftValList2String("Callsql", args));
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
  public Callsql set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Callsql callsql() {
  return new Callsql();
}


  public static class Clearerrno {
  private FTValList args = new FTValList();
  private String output;
  public Clearerrno set(String name, String value) { args.setValString(name,value); return this; }

  public Clearerrno() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CLEARERRNO", args); 
      log.trace(ftValList2String("Clearerrno", args));
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
  public Clearerrno set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clearerrno clearerrno() {
  return new Clearerrno();
}


  public static class Copylist {
  private FTValList args = new FTValList();
  private String output;
  public Copylist set(String name, String value) { args.setValString(name,value); return this; }
 public Copylist from(String val) { args.setValString("FROM", val); return this; } 
      
 public Copylist to(String val) { args.setValString("TO", val); return this; } 
      
  public Copylist() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.COPYLIST", args); 
      log.trace(ftValList2String("Copylist", args));
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
  public Copylist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Copylist copylist() {
  return new Copylist();
}


  public static class Disablecache {
  private FTValList args = new FTValList();
  private String output;
  public Disablecache set(String name, String value) { args.setValString(name,value); return this; }
 public Disablecache recursive(String val) { args.setValString("RECURSIVE", val); return this; } 
      
  public Disablecache() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.DISABLECACHE", args); 
      log.trace(ftValList2String("Disablecache", args));
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
  public Disablecache set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Disablecache disablecache() {
  return new Disablecache();
}


  public static class Flushcatalog {
  private FTValList args = new FTValList();
  private String output;
  public Flushcatalog set(String name, String value) { args.setValString(name,value); return this; }
 public Flushcatalog catalog(String val) { args.setValString("CATALOG", val); return this; } 
      
  public Flushcatalog() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.FLUSHCATALOG", args); 
      log.trace(ftValList2String("Flushcatalog", args));
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
  public Flushcatalog set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flushcatalog flushcatalog() {
  return new Flushcatalog();
}


  public static class Flushstream {
  private FTValList args = new FTValList();
  private String output;
  public Flushstream set(String name, String value) { args.setValString(name,value); return this; }

  public Flushstream() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.FLUSHSTREAM", args); 
      log.trace(ftValList2String("Flushstream", args));
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
  public Flushstream set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flushstream flushstream() {
  return new Flushstream();
}


  public static class Getproperty {
  private FTValList args = new FTValList();
  private String output;
  public Getproperty set(String name, String value) { args.setValString(name,value); return this; }
 public Getproperty name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getproperty file(String val) { args.setValString("FILE", val); return this; } 
      
 public Getproperty output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getproperty() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETPROPERTY", args); 
      log.trace(ftValList2String("Getproperty", args));
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
  public Getproperty set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getproperty getproperty() {
  return new Getproperty();
}


  public static class Pushvars {
  private FTValList args = new FTValList();
  private String output;
  public Pushvars set(String name, String value) { args.setValString(name,value); return this; }

  public Pushvars() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.PUSHVARS", args); 
      log.trace(ftValList2String("Pushvars", args));
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
  public Pushvars set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Pushvars pushvars() {
  return new Pushvars();
}


  public static class Popvars {
  private FTValList args = new FTValList();
  private String output;
  public Popvars set(String name, String value) { args.setValString(name,value); return this; }

  public Popvars() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.POPVARS", args); 
      log.trace(ftValList2String("Popvars", args));
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
  public Popvars set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Popvars popvars() {
  return new Popvars();
}


  public static class Insertpage {
  private FTValList args = new FTValList();
  private String output;
  public Insertpage set(String name, String value) { args.setValString(name,value); return this; }
 public Insertpage pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
  public Insertpage() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INSERTPAGE", args); 
      log.trace(ftValList2String("Insertpage", args));
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
  public Insertpage set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Insertpage insertpage() {
  return new Insertpage();
}


  public static class Logmsg {
  private FTValList args = new FTValList();
  private String output;
  public Logmsg set(String name, String value) { args.setValString(name,value); return this; }
 public Logmsg msg(String val) { args.setValString("MSG", val); return this; } 
      
 public Logmsg name(String val) { args.setValString("NAME", val); return this; } 
      
 public Logmsg severity(String val) { args.setValString("SEVERITY", val); return this; } 
      
  public Logmsg() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.LOGMSG", args); 
      log.trace(ftValList2String("Logmsg", args));
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
  public Logmsg set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Logmsg logmsg() {
  return new Logmsg();
}


  public static class Search {
  private FTValList args = new FTValList();
  private String output;
  public Search set(String name, String value) { args.setValString(name,value); return this; }
 public Search searchterm(String val) { args.setValString("SEARCHTERM", val); return this; } 
      
 public Search listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
 public Search searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Search charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Search index(String val) { args.setValString("INDEX", val); return this; } 
      
 public Search relevanceterm(String val) { args.setValString("RELEVANCETERM", val); return this; } 
      
 public Search queryparser(String val) { args.setValString("QUERYPARSER", val); return this; } 
      
 public Search maxresults(String val) { args.setValString("MAXRESULTS", val); return this; } 
      
  public Search() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SEARCH", args); 
      log.trace(ftValList2String("Search", args));
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
  public Search set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Search search() {
  return new Search();
}


  public static class Indexexists {
  private FTValList args = new FTValList();
  private String output;
  public Indexexists set(String name, String value) { args.setValString(name,value); return this; }
 public Indexexists searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexexists charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexexists index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Indexexists() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXEXISTS", args); 
      log.trace(ftValList2String("Indexexists", args));
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
  public Indexexists set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexexists indexexists() {
  return new Indexexists();
}


  public static class Dateargument {
  private FTValList args = new FTValList();
  private String output;
  public Dateargument set(String name, String value) { args.setValString(name,value); return this; }
 public Dateargument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Dateargument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Dateargument() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.DATEARGUMENT", args); 
      log.trace(ftValList2String("Dateargument", args));
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
  public Dateargument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Dateargument dateargument() {
  return new Dateargument();
}


  public static class Textargument {
  private FTValList args = new FTValList();
  private String output;
  public Textargument set(String name, String value) { args.setValString(name,value); return this; }
 public Textargument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Textargument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Textargument() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.TEXTARGUMENT", args); 
      log.trace(ftValList2String("Textargument", args));
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
  public Textargument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Textargument textargument() {
  return new Textargument();
}


  public static class Fileargument {
  private FTValList args = new FTValList();
  private String output;
  public Fileargument set(String name, String value) { args.setValString(name,value); return this; }
 public Fileargument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fileargument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Fileargument() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.FILEARGUMENT", args); 
      log.trace(ftValList2String("Fileargument", args));
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
  public Fileargument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fileargument fileargument() {
  return new Fileargument();
}


  public static class Indexadd {
  private FTValList args = new FTValList();
  private String output;
  public Indexadd set(String name, String value) { args.setValString(name,value); return this; }
 public Indexadd entryname(String val) { args.setValString("ENTRYNAME", val); return this; } 
      
 public Indexadd searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexadd charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexadd index(String val) { args.setValString("INDEX", val); return this; } 
      
 public Indexadd entrydetail(String val) { args.setValString("ENTRYDETAIL", val); return this; } 
      
 public Indexadd wordlist(String val) { args.setValString("WORDLIST", val); return this; } 
      
 public Indexadd wordlistdelimiters(String val) { args.setValString("WORDLISTDELIMITERS", val); return this; } 
      
 public Indexadd filelist(String val) { args.setValString("FILELIST", val); return this; } 
      
 public Indexadd date(String val) { args.setValString("DATE", val); return this; } 
      
  public Indexadd() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXADD", args); 
      log.trace(ftValList2String("Indexadd", args));
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
  public Indexadd set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexadd indexadd() {
  return new Indexadd();
}


  public static class Indexreplace {
  private FTValList args = new FTValList();
  private String output;
  public Indexreplace set(String name, String value) { args.setValString(name,value); return this; }
 public Indexreplace entryname(String val) { args.setValString("ENTRYNAME", val); return this; } 
      
 public Indexreplace searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexreplace charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexreplace index(String val) { args.setValString("INDEX", val); return this; } 
      
 public Indexreplace entrydetail(String val) { args.setValString("ENTRYDETAIL", val); return this; } 
      
 public Indexreplace wordlist(String val) { args.setValString("WORDLIST", val); return this; } 
      
 public Indexreplace wordlistdelimiters(String val) { args.setValString("WORDLISTDELIMITERS", val); return this; } 
      
 public Indexreplace filelist(String val) { args.setValString("FILELIST", val); return this; } 
      
 public Indexreplace date(String val) { args.setValString("DATE", val); return this; } 
      
  public Indexreplace() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXREPLACE", args); 
      log.trace(ftValList2String("Indexreplace", args));
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
  public Indexreplace set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexreplace indexreplace() {
  return new Indexreplace();
}


  public static class Fieldargument {
  private FTValList args = new FTValList();
  private String output;
  public Fieldargument set(String name, String value) { args.setValString(name,value); return this; }
 public Fieldargument name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fieldargument value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Fieldargument() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.FIELDARGUMENT", args); 
      log.trace(ftValList2String("Fieldargument", args));
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
  public Fieldargument set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Fieldargument fieldargument() {
  return new Fieldargument();
}


  public static class Indexcreate {
  private FTValList args = new FTValList();
  private String output;
  public Indexcreate set(String name, String value) { args.setValString(name,value); return this; }
 public Indexcreate searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexcreate charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexcreate index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Indexcreate() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXCREATE", args); 
      log.trace(ftValList2String("Indexcreate", args));
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
  public Indexcreate set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexcreate indexcreate() {
  return new Indexcreate();
}


  public static class Indexremove {
  private FTValList args = new FTValList();
  private String output;
  public Indexremove set(String name, String value) { args.setValString(name,value); return this; }
 public Indexremove entryname(String val) { args.setValString("ENTRYNAME", val); return this; } 
      
 public Indexremove searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexremove charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexremove index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Indexremove() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXREMOVE", args); 
      log.trace(ftValList2String("Indexremove", args));
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
  public Indexremove set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexremove indexremove() {
  return new Indexremove();
}


  public static class Indexdestroy {
  private FTValList args = new FTValList();
  private String output;
  public Indexdestroy set(String name, String value) { args.setValString(name,value); return this; }
 public Indexdestroy searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Indexdestroy charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Indexdestroy index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Indexdestroy() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.INDEXDESTROY", args); 
      log.trace(ftValList2String("Indexdestroy", args));
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
  public Indexdestroy set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Indexdestroy indexdestroy() {
  return new Indexdestroy();
}


  public static class Searchdatetonative {
  private FTValList args = new FTValList();
  private String output;
  public Searchdatetonative set(String name, String value) { args.setValString(name,value); return this; }
 public Searchdatetonative date(String val) { args.setValString("DATE", val); return this; } 
      
 public Searchdatetonative outputvariable(String val) { args.setValString("OUTPUTVARIABLE", val); return this; } 
      
 public Searchdatetonative searchengine(String val) { args.setValString("SEARCHENGINE", val); return this; } 
      
 public Searchdatetonative charset(String val) { args.setValString("CHARSET", val); return this; } 
      
 public Searchdatetonative index(String val) { args.setValString("INDEX", val); return this; } 
      
  public Searchdatetonative() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SEARCHDATETONATIVE", args); 
      log.trace(ftValList2String("Searchdatetonative", args));
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
  public Searchdatetonative set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Searchdatetonative searchdatetonative() {
  return new Searchdatetonative();
}


  public static class Mirrorlist {
  private FTValList args = new FTValList();
  private String output;
  public Mirrorlist set(String name, String value) { args.setValString(name,value); return this; }
 public Mirrorlist listname(String val) { args.setValString("LISTNAME", val); return this; } 
      
  public Mirrorlist() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.MIRRORLIST", args); 
      log.trace(ftValList2String("Mirrorlist", args));
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
  public Mirrorlist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Mirrorlist mirrorlist() {
  return new Mirrorlist();
}


  public static class Mirrortreenode {
  private FTValList args = new FTValList();
  private String output;
  public Mirrortreenode set(String name, String value) { args.setValString(name,value); return this; }
 public Mirrortreenode tree(String val) { args.setValString("TREE", val); return this; } 
      
 public Mirrortreenode node(String val) { args.setValString("NODE", val); return this; } 
      
  public Mirrortreenode() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.MIRRORTREENODE", args); 
      log.trace(ftValList2String("Mirrortreenode", args));
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
  public Mirrortreenode set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Mirrortreenode mirrortreenode() {
  return new Mirrortreenode();
}


  public static class Mirror {
  private FTValList args = new FTValList();
  private String output;
  public Mirror set(String name, String value) { args.setValString(name,value); return this; }
 public Mirror target(String val) { args.setValString("TARGET", val); return this; } 
      
 public Mirror username(String val) { args.setValString("USERNAME", val); return this; } 
      
 public Mirror password(String val) { args.setValString("PASSWORD", val); return this; } 
      
 public Mirror cgiprefix(String val) { args.setValString("CGIPREFIX", val); return this; } 
      
 public Mirror targetinifile(String val) { args.setValString("TARGETINIFILE", val); return this; } 
      
 public Mirror port(String val) { args.setValString("PORT", val); return this; } 
      
 public Mirror useproxy(String val) { args.setValString("USEPROXY", val); return this; } 
      
 public Mirror secure(String val) { args.setValString("SECURE", val); return this; } 
      
 public Mirror httpversion(String val) { args.setValString("HTTPVERSION", val); return this; } 
      
 public Mirror outputvariable(String val) { args.setValString("OUTPUTVARIABLE", val); return this; } 
      
  public Mirror() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.MIRROR", args); 
      log.trace(ftValList2String("Mirror", args));
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
  public Mirror set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Mirror mirror() {
  return new Mirror();
}


  public static class Catalogbatch {
  private FTValList args = new FTValList();
  private String output;
  public Catalogbatch set(String name, String value) { args.setValString(name,value); return this; }

  public Catalogbatch() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.CATALOGBATCH", args); 
      log.trace(ftValList2String("Catalogbatch", args));
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
  public Catalogbatch set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Catalogbatch catalogbatch() {
  return new Catalogbatch();
}


  public static class Getnamespace {
  private FTValList args = new FTValList();
  private String output;
  public Getnamespace set(String name, String value) { args.setValString(name,value); return this; }
 public Getnamespace output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Getnamespace() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.GETNAMESPACE", args); 
      log.trace(ftValList2String("Getnamespace", args));
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
  public Getnamespace set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getnamespace getnamespace() {
  return new Getnamespace();
}


  public static class Encode {
  private FTValList args = new FTValList();
  private String output;
  public Encode set(String name, String value) { args.setValString(name,value); return this; }
 public Encode base(String val) { args.setValString("BASE", val); return this; } 
      
 public Encode session(String val) { args.setValString("SESSION", val); return this; } 
      
 public Encode output(String val) { args.setValString("OUTPUT", val); return this; } 
      
  public Encode() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.ENCODE", args); 
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


  public static class Readevent {
  private FTValList args = new FTValList();
  private String output;
  public Readevent set(String name, String value) { args.setValString(name,value); return this; }
 public Readevent name(String val) { args.setValString("NAME", val); return this; } 
      
 public Readevent list(String val) { args.setValString("LIST", val); return this; } 
      
  public Readevent() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.READEVENT", args); 
      log.trace(ftValList2String("Readevent", args));
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
  public Readevent set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Readevent readevent() {
  return new Readevent();
}


  public static class Queryevents {
  private FTValList args = new FTValList();
  private String output;
  public Queryevents set(String name, String value) { args.setValString(name,value); return this; }
 public Queryevents list(String val) { args.setValString("LIST", val); return this; } 
      
 public Queryevents name(String val) { args.setValString("NAME", val); return this; } 
      
 public Queryevents type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Queryevents enabled(String val) { args.setValString("ENABLED", val); return this; } 
      
  public Queryevents() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.QUERYEVENTS", args); 
      log.trace(ftValList2String("Queryevents", args));
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
  public Queryevents set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Queryevents queryevents() {
  return new Queryevents();
}


  public static class Literal {
  private FTValList args = new FTValList();
  private String output;
  public Literal set(String name, String value) { args.setValString(name,value); return this; }
 public Literal column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Literal output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Literal string(String val) { args.setValString("STRING", val); return this; } 
      
 public Literal table(String val) { args.setValString("TABLE", val); return this; } 
      
  public Literal() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.LITERAL", args); 
      log.trace(ftValList2String("Literal", args));
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
  public Literal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Literal literal() {
  return new Literal();
}


  public static class Sqlexp {
  private FTValList args = new FTValList();
  private String output;
  public Sqlexp set(String name, String value) { args.setValString(name,value); return this; }
 public Sqlexp column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Sqlexp output(String val) { args.setValString("OUTPUT", val); return this; } 
      
 public Sqlexp string(String val) { args.setValString("STRING", val); return this; } 
      
 public Sqlexp table(String val) { args.setValString("TABLE", val); return this; } 
      
 public Sqlexp verb(String val) { args.setValString("VERB", val); return this; } 
      
 public Sqlexp expression(String val) { args.setValString("EXPRESSION", val); return this; } 
      
 public Sqlexp type(String val) { args.setValString("TYPE", val); return this; } 
      
  public Sqlexp() { }
  public int run(ICS ics) { 
      ics.runTag("ICS.SQLEXP", args); 
      log.trace(ftValList2String("Sqlexp", args));
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
  public Sqlexp set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sqlexp sqlexp() {
  return new Sqlexp();
}

}
