package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class RenderTag  {    
  private static Log log = Log.getLog(RenderTag.class);  
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
      ics.runTag("RENDER.ARGUMENT", args); 
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


  public static class Encode {
  private FTValList args = new FTValList();
  private String output;
  public Encode set(String name, String value) { args.setValString(name,value); return this; }
 public Encode outstr(String val) { args.setValString("OUTSTR", val); return this; } 
      
 public Encode str(String val) { args.setValString("STR", val); return this; } 
      
 public Encode packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Encode addsession(String val) { args.setValString("ADDSESSION", val); return this; } 
      
  public Encode() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.ENCODE", args); 
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


  public static class Filter {
  private FTValList args = new FTValList();
  private String output;
  public Filter set(String name, String value) { args.setValString(name,value); return this; }
 public Filter varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Filter id(String val) { args.setValString("ID", val); return this; } 
      
 public Filter type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Filter listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Filter list(String val) { args.setValString("LIST", val); return this; } 
      
 public Filter listidcol(String val) { args.setValString("LISTIDCOL", val); return this; } 
      
 public Filter listtypecol(String val) { args.setValString("LISTTYPECOL", val); return this; } 
      
  public Filter() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.FILTER", args); 
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


  public static class Packargs {
  private FTValList args = new FTValList();
  private String output;
  public Packargs set(String name, String value) { args.setValString(name,value); return this; }
 public Packargs outstr(String val) { args.setValString("OUTSTR", val); return this; } 
      
 public Packargs packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
  public Packargs() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.PACKARGS", args); 
      log.trace(ftValList2String("Packargs", args));
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
  public Packargs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Packargs packargs() {
  return new Packargs();
}


  public static class Unpackarg {
  private FTValList args = new FTValList();
  private String output;
  public Unpackarg set(String name, String value) { args.setValString(name,value); return this; }
 public Unpackarg packed(String val) { args.setValString("PACKED", val); return this; } 
      
 public Unpackarg outvar(String val) { args.setValString("OUTVAR", val); return this; } 
      
 public Unpackarg unpack(String val) { args.setValString("UNPACK", val); return this; } 
      
 public Unpackarg remove(String val) { args.setValString("REMOVE", val); return this; } 
      
  public Unpackarg() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.UNPACKARG", args); 
      log.trace(ftValList2String("Unpackarg", args));
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
  public Unpackarg set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Unpackarg unpackarg() {
  return new Unpackarg();
}


  public static class Contentserver {
  private FTValList args = new FTValList();
  private String output;
  public Contentserver set(String name, String value) { args.setValString(name,value); return this; }
 public Contentserver pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
  public Contentserver() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.CONTENTSERVER", args); 
      log.trace(ftValList2String("Contentserver", args));
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
  public Contentserver set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Contentserver contentserver() {
  return new Contentserver();
}


  public static class Callelement {
  private FTValList args = new FTValList();
  private String output;
  public Callelement set(String name, String value) { args.setValString(name,value); return this; }
 public Callelement elementname(String val) { args.setValString("ELEMENTNAME", val); return this; } 
      
 public Callelement scoped(String val) { args.setValString("SCOPED", val); return this; } 
      
  public Callelement() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.CALLELEMENT", args); 
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


  public static class Satellitepage {
  private FTValList args = new FTValList();
  private String output;
  public Satellitepage set(String name, String value) { args.setValString(name,value); return this; }
 public Satellitepage pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
 public Satellitepage packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
  public Satellitepage() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.SATELLITEPAGE", args); 
      log.trace(ftValList2String("Satellitepage", args));
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
  public Satellitepage set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Satellitepage satellitepage() {
  return new Satellitepage();
}


  public static class Satelliteblob {
  private FTValList args = new FTValList();
  private String output;
  public Satelliteblob set(String name, String value) { args.setValString(name,value); return this; }
 public Satelliteblob assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Satelliteblob cachecontrol(String val) { args.setValString("CACHECONTROL", val); return this; } 
      
 public Satelliteblob blobtable(String val) { args.setValString("BLOBTABLE", val); return this; } 
      
 public Satelliteblob blobkey(String val) { args.setValString("BLOBKEY", val); return this; } 
      
 public Satelliteblob blobwhere(String val) { args.setValString("BLOBWHERE", val); return this; } 
      
 public Satelliteblob blobheader(String val) { args.setValString("BLOBHEADER", val); return this; } 
      
 public Satelliteblob c(String val) { args.setValString("C", val); return this; } 
      
 public Satelliteblob cid(String val) { args.setValString("CID", val); return this; } 
      
 public Satelliteblob asset(String val) { args.setValString("ASSET", val); return this; } 
      
 public Satelliteblob field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Satelliteblob csblobid(String val) { args.setValString("CSBLOBID", val); return this; } 
      
 public Satelliteblob service(String val) { args.setValString("SERVICE", val); return this; } 
      
 public Satelliteblob blobcol(String val) { args.setValString("BLOBCOL", val); return this; } 
      
 public Satelliteblob blobnocache(String val) { args.setValString("BLOBNOCACHE", val); return this; } 
      
 public Satelliteblob container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Satelliteblob satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Satelliteblob scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Satelliteblob authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Satelliteblob fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
 public Satelliteblob preferredfile(String val) { args.setValString("PREFERREDFILE", val); return this; } 
      
 public Satelliteblob parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
  public Satelliteblob() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.SATELLITEBLOB", args); 
      log.trace(ftValList2String("Satelliteblob", args));
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
  public Satelliteblob set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Satelliteblob satelliteblob() {
  return new Satelliteblob();
}


  public static class Deletecache {
  private FTValList args = new FTValList();
  private String output;
  public Deletecache set(String name, String value) { args.setValString(name,value); return this; }
 public Deletecache argname(String val) { args.setValString("ARGNAME", val); return this; } 
      
 public Deletecache value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Deletecache() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.DELETECACHE", args); 
      log.trace(ftValList2String("Deletecache", args));
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
  public Deletecache set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deletecache deletecache() {
  return new Deletecache();
}


  public static class Logdep {
  private FTValList args = new FTValList();
  private String output;
  public Logdep set(String name, String value) { args.setValString(name,value); return this; }
 public Logdep asset(String val) { args.setValString("ASSET", val); return this; } 
      
 public Logdep cid(String val) { args.setValString("CID", val); return this; } 
      
 public Logdep c(String val) { args.setValString("C", val); return this; } 
      
 public Logdep deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Logdep() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.LOGDEP", args); 
      log.trace(ftValList2String("Logdep", args));
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
  public Logdep set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Logdep logdep() {
  return new Logdep();
}


  public static class Overridedeps {
  private FTValList args = new FTValList();
  private String output;
  public Overridedeps set(String name, String value) { args.setValString(name,value); return this; }
 public Overridedeps asset(String val) { args.setValString("ASSET", val); return this; } 
      
 public Overridedeps cid(String val) { args.setValString("CID", val); return this; } 
      
 public Overridedeps c(String val) { args.setValString("C", val); return this; } 
      
 public Overridedeps deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Overridedeps() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.OVERRIDEDEPS", args); 
      log.trace(ftValList2String("Overridedeps", args));
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
  public Overridedeps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Overridedeps overridedeps() {
  return new Overridedeps();
}


  public static class Unknowndeps {
  private FTValList args = new FTValList();
  private String output;
  public Unknowndeps set(String name, String value) { args.setValString(name,value); return this; }
 public Unknowndeps assettype(String val) { args.setValString("ASSETTYPE", val); return this; } 
      
  public Unknowndeps() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.UNKNOWNDEPS", args); 
      log.trace(ftValList2String("Unknowndeps", args));
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
  public Unknowndeps set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Unknowndeps unknowndeps() {
  return new Unknowndeps();
}


  public static class Getpageurl {
  private FTValList args = new FTValList();
  private String output;
  public Getpageurl set(String name, String value) { args.setValString(name,value); return this; }
 public Getpageurl outstr(String val) { args.setValString("OUTSTR", val); return this; } 
      
 public Getpageurl pagename(String val) { args.setValString("PAGENAME", val); return this; } 
      
 public Getpageurl cid(String val) { args.setValString("CID", val); return this; } 
      
 public Getpageurl c(String val) { args.setValString("C", val); return this; } 
      
 public Getpageurl p(String val) { args.setValString("P", val); return this; } 
      
 public Getpageurl packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Getpageurl addsession(String val) { args.setValString("ADDSESSION", val); return this; } 
      
 public Getpageurl dynamic(String val) { args.setValString("DYNAMIC", val); return this; } 
      
 public Getpageurl simplename(String val) { args.setValString("SIMPLENAME", val); return this; } 
      
 public Getpageurl simpledir(String val) { args.setValString("SIMPLEDIR", val); return this; } 
      
 public Getpageurl export(String val) { args.setValString("EXPORT", val); return this; } 
      
 public Getpageurl deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Getpageurl wrapperpage(String val) { args.setValString("WRAPPERPAGE", val); return this; } 
      
 public Getpageurl container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Getpageurl satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Getpageurl assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Getpageurl scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Getpageurl authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Getpageurl fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
 public Getpageurl preferredfile(String val) { args.setValString("PREFERREDFILE", val); return this; } 
      
 public Getpageurl preferreddir(String val) { args.setValString("PREFERREDDIR", val); return this; } 
      
  public Getpageurl() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.GETPAGEURL", args); 
      log.trace(ftValList2String("Getpageurl", args));
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
  public Getpageurl set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpageurl getpageurl() {
  return new Getpageurl();
}


  public static class Getbloburl {
  private FTValList args = new FTValList();
  private String output;
  public Getbloburl set(String name, String value) { args.setValString(name,value); return this; }
 public Getbloburl outstr(String val) { args.setValString("OUTSTR", val); return this; } 
      
 public Getbloburl blobtable(String val) { args.setValString("BLOBTABLE", val); return this; } 
      
 public Getbloburl blobkey(String val) { args.setValString("BLOBKEY", val); return this; } 
      
 public Getbloburl blobwhere(String val) { args.setValString("BLOBWHERE", val); return this; } 
      
 public Getbloburl blobcol(String val) { args.setValString("BLOBCOL", val); return this; } 
      
 public Getbloburl c(String val) { args.setValString("C", val); return this; } 
      
 public Getbloburl cid(String val) { args.setValString("CID", val); return this; } 
      
 public Getbloburl asset(String val) { args.setValString("ASSET", val); return this; } 
      
 public Getbloburl field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getbloburl blobheader(String val) { args.setValString("BLOBHEADER", val); return this; } 
      
 public Getbloburl blobnocache(String val) { args.setValString("BLOBNOCACHE", val); return this; } 
      
 public Getbloburl csblobid(String val) { args.setValString("CSBLOBID", val); return this; } 
      
 public Getbloburl addsession(String val) { args.setValString("ADDSESSION", val); return this; } 
      
 public Getbloburl dynamic(String val) { args.setValString("DYNAMIC", val); return this; } 
      
 public Getbloburl simplename(String val) { args.setValString("SIMPLENAME", val); return this; } 
      
 public Getbloburl container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Getbloburl satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Getbloburl scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Getbloburl authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Getbloburl fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
 public Getbloburl preferredfile(String val) { args.setValString("PREFERREDFILE", val); return this; } 
      
 public Getbloburl preferreddir(String val) { args.setValString("PREFERREDDIR", val); return this; } 
      
 public Getbloburl assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Getbloburl parentid(String val) { args.setValString("PARENTID", val); return this; } 
      
  public Getbloburl() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.GETBLOBURL", args); 
      log.trace(ftValList2String("Getbloburl", args));
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
  public Getbloburl set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getbloburl getbloburl() {
  return new Getbloburl();
}


  public static class Stream {
  private FTValList args = new FTValList();
  private String output;
  public Stream set(String name, String value) { args.setValString(name,value); return this; }
 public Stream value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Stream variable(String val) { args.setValString("VARIABLE", val); return this; } 
      
 public Stream list(String val) { args.setValString("LIST", val); return this; } 
      
 public Stream column(String val) { args.setValString("COLUMN", val); return this; } 
      
 public Stream filecolumn(String val) { args.setValString("FILECOLUMN", val); return this; } 
      
 public Stream ssvariable(String val) { args.setValString("SSVARIABLE", val); return this; } 
      
 public Stream property(String val) { args.setValString("PROPERTY", val); return this; } 
      
  public Stream() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.STREAM", args); 
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
      
 public Calltemplate variant(String val) { args.setValString("VARIANT", val); return this; } 
      
  public Calltemplate() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.CALLTEMPLATE", args); 
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


  public static class Lookup {
  private FTValList args = new FTValList();
  private String output;
  public Lookup set(String name, String value) { args.setValString(name,value); return this; }
 public Lookup key(String val) { args.setValString("KEY", val); return this; } 
      
 public Lookup varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Lookup tid(String val) { args.setValString("TID", val); return this; } 
      
 public Lookup ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Lookup match(String val) { args.setValString("MATCH", val); return this; } 
      
 public Lookup site(String val) { args.setValString("SITE", val); return this; } 
      
 public Lookup siteid(String val) { args.setValString("SITEID", val); return this; } 
      
 public Lookup sitepfx(String val) { args.setValString("SITEPFX", val); return this; } 
      
  public Lookup() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.LOOKUP", args); 
      log.trace(ftValList2String("Lookup", args));
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
  public Lookup set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Lookup lookup() {
  return new Lookup();
}


  public static class Gettemplateurl {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplateurl set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplateurl outstr(String val) { args.setValString("OUTSTR", val); return this; } 
      
 public Gettemplateurl tid(String val) { args.setValString("TID", val); return this; } 
      
 public Gettemplateurl slotname(String val) { args.setValString("SLOTNAME", val); return this; } 
      
 public Gettemplateurl site(String val) { args.setValString("SITE", val); return this; } 
      
 public Gettemplateurl cid(String val) { args.setValString("CID", val); return this; } 
      
 public Gettemplateurl c(String val) { args.setValString("C", val); return this; } 
      
 public Gettemplateurl packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Gettemplateurl context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Gettemplateurl ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Gettemplateurl tname(String val) { args.setValString("TNAME", val); return this; } 
      
 public Gettemplateurl addsession(String val) { args.setValString("ADDSESSION", val); return this; } 
      
 public Gettemplateurl dynamic(String val) { args.setValString("DYNAMIC", val); return this; } 
      
 public Gettemplateurl simplename(String val) { args.setValString("SIMPLENAME", val); return this; } 
      
 public Gettemplateurl simpledir(String val) { args.setValString("SIMPLEDIR", val); return this; } 
      
 public Gettemplateurl export(String val) { args.setValString("EXPORT", val); return this; } 
      
 public Gettemplateurl deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Gettemplateurl wrapperpage(String val) { args.setValString("WRAPPERPAGE", val); return this; } 
      
 public Gettemplateurl variant(String val) { args.setValString("VARIANT", val); return this; } 
      
 public Gettemplateurl assembler(String val) { args.setValString("ASSEMBLER", val); return this; } 
      
 public Gettemplateurl container(String val) { args.setValString("CONTAINER", val); return this; } 
      
 public Gettemplateurl satellite(String val) { args.setValString("SATELLITE", val); return this; } 
      
 public Gettemplateurl scheme(String val) { args.setValString("SCHEME", val); return this; } 
      
 public Gettemplateurl authority(String val) { args.setValString("AUTHORITY", val); return this; } 
      
 public Gettemplateurl fragment(String val) { args.setValString("FRAGMENT", val); return this; } 
      
  public Gettemplateurl() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.GETTEMPLATEURL", args); 
      log.trace(ftValList2String("Gettemplateurl", args));
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
  public Gettemplateurl set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplateurl gettemplateurl() {
  return new Gettemplateurl();
}


  public static class Gettemplateurlparameters {
  private FTValList args = new FTValList();
  private String output;
  public Gettemplateurlparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Gettemplateurlparameters outlist(String val) { args.setValString("OUTLIST", val); return this; } 
      
 public Gettemplateurlparameters tid(String val) { args.setValString("TID", val); return this; } 
      
 public Gettemplateurlparameters slotname(String val) { args.setValString("SLOTNAME", val); return this; } 
      
 public Gettemplateurlparameters site(String val) { args.setValString("SITE", val); return this; } 
      
 public Gettemplateurlparameters cid(String val) { args.setValString("CID", val); return this; } 
      
 public Gettemplateurlparameters c(String val) { args.setValString("C", val); return this; } 
      
 public Gettemplateurlparameters packedargs(String val) { args.setValString("PACKEDARGS", val); return this; } 
      
 public Gettemplateurlparameters context(String val) { args.setValString("CONTEXT", val); return this; } 
      
 public Gettemplateurlparameters ttype(String val) { args.setValString("TTYPE", val); return this; } 
      
 public Gettemplateurlparameters tname(String val) { args.setValString("TNAME", val); return this; } 
      
 public Gettemplateurlparameters deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Gettemplateurlparameters wrapperpage(String val) { args.setValString("WRAPPERPAGE", val); return this; } 
      
 public Gettemplateurlparameters variant(String val) { args.setValString("VARIANT", val); return this; } 
      
  public Gettemplateurlparameters() { }
  public int run(ICS ics) { 
      ics.runTag("RENDER.GETTEMPLATEURLPARAMETERS", args); 
      log.trace(ftValList2String("Gettemplateurlparameters", args));
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
  public Gettemplateurlparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettemplateurlparameters gettemplateurlparameters() {
  return new Gettemplateurlparameters();
}

}
