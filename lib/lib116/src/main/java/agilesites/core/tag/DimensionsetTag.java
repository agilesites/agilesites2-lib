package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class DimensionsetTag  {    
  private static Log log = Log.getLog(DimensionsetTag.class);  
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
    
 
  public static class Asset {
  private FTValList args = new FTValList();
  private String output;
  public Asset set(String name, String value) { args.setValString(name,value); return this; }
 public Asset assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Asset assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
  public Asset() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.ASSET", args); 
      log.trace(ftValList2String("Asset", args));
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
  public Asset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Asset asset() {
  return new Asset();
}


  public static class Setenableddimensions {
  private FTValList args = new FTValList();
  private String output;
  public Setenableddimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Setenableddimensions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Setenableddimensions() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.SETENABLEDDIMENSIONS", args); 
      log.trace(ftValList2String("Setenableddimensions", args));
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
  public Setenableddimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setenableddimensions setenableddimensions() {
  return new Setenableddimensions();
}


  public static class Getenableddimensions {
  private FTValList args = new FTValList();
  private String output;
  public Getenableddimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Getenableddimensions name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getenableddimensions list(String val) { args.setValString("LIST", val); return this; } 
      
  public Getenableddimensions() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.GETENABLEDDIMENSIONS", args); 
      log.trace(ftValList2String("Getenableddimensions", args));
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
  public Getenableddimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getenableddimensions getenableddimensions() {
  return new Getenableddimensions();
}


  public static class Addenableddimensions {
  private FTValList args = new FTValList();
  private String output;
  public Addenableddimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Addenableddimensions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Addenableddimensions() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.ADDENABLEDDIMENSIONS", args); 
      log.trace(ftValList2String("Addenableddimensions", args));
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
  public Addenableddimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Addenableddimensions addenableddimensions() {
  return new Addenableddimensions();
}


  public static class Removeenableddimensions {
  private FTValList args = new FTValList();
  private String output;
  public Removeenableddimensions set(String name, String value) { args.setValString(name,value); return this; }
 public Removeenableddimensions name(String val) { args.setValString("NAME", val); return this; } 
      
  public Removeenableddimensions() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.REMOVEENABLEDDIMENSIONS", args); 
      log.trace(ftValList2String("Removeenableddimensions", args));
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
  public Removeenableddimensions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Removeenableddimensions removeenableddimensions() {
  return new Removeenableddimensions();
}


  public static class Filter {
  private FTValList args = new FTValList();
  private String output;
  public Filter set(String name, String value) { args.setValString(name,value); return this; }
 public Filter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Filter tofilter(String val) { args.setValString("TOFILTER", val); return this; } 
      
 public Filter list(String val) { args.setValString("LIST", val); return this; } 
      
  public Filter() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.FILTER", args); 
      log.trace(ftValList2String("Filter", args));
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
  public Filter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Filter filter() {
  return new Filter();
}


  public static class Filtersingleasset {
  private FTValList args = new FTValList();
  private String output;
  public Filtersingleasset set(String name, String value) { args.setValString(name,value); return this; }
 public Filtersingleasset name(String val) { args.setValString("NAME", val); return this; } 
      
 public Filtersingleasset assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
 public Filtersingleasset assetid(String val) { args.setValString("ASSETID", val); return this; } 
      
 public Filtersingleasset list(String val) { args.setValString("LIST", val); return this; } 
      
  public Filtersingleasset() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.FILTERSINGLEASSET", args); 
      log.trace(ftValList2String("Filtersingleasset", args));
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
  public Filtersingleasset set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Filtersingleasset filtersingleasset() {
  return new Filtersingleasset();
}


  public static class Getfilter {
  private FTValList args = new FTValList();
  private String output;
  public Getfilter set(String name, String value) { args.setValString(name,value); return this; }
 public Getfilter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getfilter objname(String val) { args.setValString("OBJNAME", val); return this; } 
      
  public Getfilter() { }
  public int run(ICS ics) { 
      ics.runTag("DIMENSIONSET.GETFILTER", args); 
      log.trace(ftValList2String("Getfilter", args));
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
  public Getfilter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfilter getfilter() {
  return new Getfilter();
}

}
