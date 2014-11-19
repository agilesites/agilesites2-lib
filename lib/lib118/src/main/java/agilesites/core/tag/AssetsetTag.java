package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class AssetsetTag  {    
  private static Log log = Log.getLog(AssetsetTag.class);  
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
      ics.runTag("ASSETSET.ARGUMENT", args); 
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


  public static class Getassetcount {
  private FTValList args = new FTValList();
  private String output;
  public Getassetcount set(String name, String value) { args.setValString(name,value); return this; }
 public Getassetcount name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassetcount varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getassetcount list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getassetcount immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
 public Getassetcount distinctonly(String val) { args.setValString("DISTINCTONLY", val); return this; } 
      
  public Getassetcount() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.GETASSETCOUNT", args); 
      log.trace(ftValList2String("Getassetcount", args));
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
  public Getassetcount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassetcount getassetcount() {
  return new Getassetcount();
}


  public static class Getassetlist {
  private FTValList args = new FTValList();
  private String output;
  public Getassetlist set(String name, String value) { args.setValString(name,value); return this; }
 public Getassetlist name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getassetlist listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getassetlist list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getassetlist maxcount(String val) { args.setValString("MAXCOUNT", val); return this; } 
      
 public Getassetlist method(String val) { args.setValString("METHOD", val); return this; } 
      
 public Getassetlist immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
 public Getassetlist distinctonly(String val) { args.setValString("DISTINCTONLY", val); return this; } 
      
  public Getassetlist() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.GETASSETLIST", args); 
      log.trace(ftValList2String("Getassetlist", args));
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
  public Getassetlist set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getassetlist getassetlist() {
  return new Getassetlist();
}


  public static class Getattributevaluecount {
  private FTValList args = new FTValList();
  private String output;
  public Getattributevaluecount set(String name, String value) { args.setValString(name,value); return this; }
 public Getattributevaluecount name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getattributevaluecount attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Getattributevaluecount varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getattributevaluecount typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Getattributevaluecount immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
  public Getattributevaluecount() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.GETATTRIBUTEVALUECOUNT", args); 
      log.trace(ftValList2String("Getattributevaluecount", args));
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
  public Getattributevaluecount set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getattributevaluecount getattributevaluecount() {
  return new Getattributevaluecount();
}


  public static class Getattributevalues {
  private FTValList args = new FTValList();
  private String output;
  public Getattributevalues set(String name, String value) { args.setValString(name,value); return this; }
 public Getattributevalues name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getattributevalues attribute(String val) { args.setValString("ATTRIBUTE", val); return this; } 
      
 public Getattributevalues listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getattributevalues typename(String val) { args.setValString("TYPENAME", val); return this; } 
      
 public Getattributevalues ordering(String val) { args.setValString("ORDERING", val); return this; } 
      
 public Getattributevalues immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
  public Getattributevalues() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.GETATTRIBUTEVALUES", args); 
      log.trace(ftValList2String("Getattributevalues", args));
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
  public Getattributevalues set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getattributevalues getattributevalues() {
  return new Getattributevalues();
}


  public static class Getmultiplevalues {
  private FTValList args = new FTValList();
  private String output;
  public Getmultiplevalues set(String name, String value) { args.setValString(name,value); return this; }
 public Getmultiplevalues name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getmultiplevalues prefix(String val) { args.setValString("PREFIX", val); return this; } 
      
 public Getmultiplevalues list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getmultiplevalues byasset(String val) { args.setValString("BYASSET", val); return this; } 
      
 public Getmultiplevalues immediateonly(String val) { args.setValString("IMMEDIATEONLY", val); return this; } 
      
  public Getmultiplevalues() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.GETMULTIPLEVALUES", args); 
      log.trace(ftValList2String("Getmultiplevalues", args));
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
  public Getmultiplevalues set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getmultiplevalues getmultiplevalues() {
  return new Getmultiplevalues();
}


  public static class Sortlistentry {
  private FTValList args = new FTValList();
  private String output;
  public Sortlistentry set(String name, String value) { args.setValString(name,value); return this; }
 public Sortlistentry attributetypename(String val) { args.setValString("ATTRIBUTETYPENAME", val); return this; } 
      
 public Sortlistentry attributename(String val) { args.setValString("ATTRIBUTENAME", val); return this; } 
      
 public Sortlistentry direction(String val) { args.setValString("DIRECTION", val); return this; } 
      
  public Sortlistentry() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.SORTLISTENTRY", args); 
      log.trace(ftValList2String("Sortlistentry", args));
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
  public Sortlistentry set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Sortlistentry sortlistentry() {
  return new Sortlistentry();
}


  public static class Setasset {
  private FTValList args = new FTValList();
  private String output;
  public Setasset set(String name, String value) { args.setValString(name,value); return this; }
 public Setasset name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setasset type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Setasset id(String val) { args.setValString("ID", val); return this; } 
      
 public Setasset locale(String val) { args.setValString("LOCALE", val); return this; } 
      
 public Setasset deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Setasset() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.SETASSET", args); 
      log.trace(ftValList2String("Setasset", args));
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
  public Setasset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setasset setasset() {
  return new Setasset();
}


  public static class Setempty {
  private FTValList args = new FTValList();
  private String output;
  public Setempty set(String name, String value) { args.setValString(name,value); return this; }
 public Setempty name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setempty locale(String val) { args.setValString("LOCALE", val); return this; } 
      
 public Setempty deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Setempty() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.SETEMPTY", args); 
      log.trace(ftValList2String("Setempty", args));
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
  public Setempty set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setempty setempty() {
  return new Setempty();
}


  public static class Setlistedassets {
  private FTValList args = new FTValList();
  private String output;
  public Setlistedassets set(String name, String value) { args.setValString(name,value); return this; }
 public Setlistedassets name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setlistedassets assets(String val) { args.setValString("ASSETS", val); return this; } 
      
 public Setlistedassets assettypes(String val) { args.setValString("ASSETTYPES", val); return this; } 
      
 public Setlistedassets locale(String val) { args.setValString("LOCALE", val); return this; } 
      
 public Setlistedassets deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Setlistedassets() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.SETLISTEDASSETS", args); 
      log.trace(ftValList2String("Setlistedassets", args));
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
  public Setlistedassets set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setlistedassets setlistedassets() {
  return new Setlistedassets();
}


  public static class Setsearchedassets {
  private FTValList args = new FTValList();
  private String output;
  public Setsearchedassets set(String name, String value) { args.setValString(name,value); return this; }
 public Setsearchedassets name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setsearchedassets assettypes(String val) { args.setValString("ASSETTYPES", val); return this; } 
      
 public Setsearchedassets constraint(String val) { args.setValString("CONSTRAINT", val); return this; } 
      
 public Setsearchedassets locale(String val) { args.setValString("LOCALE", val); return this; } 
      
 public Setsearchedassets site(String val) { args.setValString("SITE", val); return this; } 
      
 public Setsearchedassets deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Setsearchedassets fixedlist(String val) { args.setValString("FIXEDLIST", val); return this; } 
      
  public Setsearchedassets() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.SETSEARCHEDASSETS", args); 
      log.trace(ftValList2String("Setsearchedassets", args));
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
  public Setsearchedassets set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsearchedassets setsearchedassets() {
  return new Setsearchedassets();
}


  public static class Establishratings {
  private FTValList args = new FTValList();
  private String output;
  public Establishratings set(String name, String value) { args.setValString(name,value); return this; }
 public Establishratings name(String val) { args.setValString("NAME", val); return this; } 
      
 public Establishratings defaultrating(String val) { args.setValString("DEFAULTRATING", val); return this; } 
      
  public Establishratings() { }
  public int run(ICS ics) { 
      ics.runTag("ASSETSET.ESTABLISHRATINGS", args); 
      log.trace(ftValList2String("Establishratings", args));
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
  public Establishratings set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Establishratings establishratings() {
  return new Establishratings();
}

}
