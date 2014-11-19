package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CommercecontextTag  {    
  private static Log log = Log.getLog(CommercecontextTag.class);  
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
      ics.runTag("COMMERCECONTEXT.ARGUMENT", args); 
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


  public static class Getabandonedcartsessions {
  private FTValList args = new FTValList();
  private String output;
  public Getabandonedcartsessions set(String name, String value) { args.setValString(name,value); return this; }
 public Getabandonedcartsessions listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getabandonedcartsessions enddate(String val) { args.setValString("ENDDATE", val); return this; } 
      
 public Getabandonedcartsessions startdate(String val) { args.setValString("STARTDATE", val); return this; } 
      
  public Getabandonedcartsessions() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETABANDONEDCARTSESSIONS", args); 
      log.trace(ftValList2String("Getabandonedcartsessions", args));
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
  public Getabandonedcartsessions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getabandonedcartsessions getabandonedcartsessions() {
  return new Getabandonedcartsessions();
}


  public static class Getcurrentcart {
  private FTValList args = new FTValList();
  private String output;
  public Getcurrentcart set(String name, String value) { args.setValString(name,value); return this; }
 public Getcurrentcart varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getcurrentcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETCURRENTCART", args); 
      log.trace(ftValList2String("Getcurrentcart", args));
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
  public Getcurrentcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcurrentcart getcurrentcart() {
  return new Getcurrentcart();
}


  public static class Getsessioncart {
  private FTValList args = new FTValList();
  private String output;
  public Getsessioncart set(String name, String value) { args.setValString(name,value); return this; }
 public Getsessioncart session(String val) { args.setValString("SESSION", val); return this; } 
      
 public Getsessioncart varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getsessioncart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETSESSIONCART", args); 
      log.trace(ftValList2String("Getsessioncart", args));
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
  public Getsessioncart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsessioncart getsessioncart() {
  return new Getsessioncart();
}


  public static class Logout {
  private FTValList args = new FTValList();
  private String output;
  public Logout set(String name, String value) { args.setValString(name,value); return this; }

  public Logout() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.LOGOUT", args); 
      log.trace(ftValList2String("Logout", args));
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
  public Logout set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Logout logout() {
  return new Logout();
}


  public static class Saveall {
  private FTValList args = new FTValList();
  private String output;
  public Saveall set(String name, String value) { args.setValString(name,value); return this; }

  public Saveall() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.SAVEALL", args); 
      log.trace(ftValList2String("Saveall", args));
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
  public Saveall set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Saveall saveall() {
  return new Saveall();
}


  public static class Setcurrentcart {
  private FTValList args = new FTValList();
  private String output;
  public Setcurrentcart set(String name, String value) { args.setValString(name,value); return this; }
 public Setcurrentcart cart(String val) { args.setValString("CART", val); return this; } 
      
  public Setcurrentcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.SETCURRENTCART", args); 
      log.trace(ftValList2String("Setcurrentcart", args));
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
  public Setcurrentcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setcurrentcart setcurrentcart() {
  return new Setcurrentcart();
}


  public static class Calculatepromotions {
  private FTValList args = new FTValList();
  private String output;
  public Calculatepromotions set(String name, String value) { args.setValString(name,value); return this; }

  public Calculatepromotions() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.CALCULATEPROMOTIONS", args); 
      log.trace(ftValList2String("Calculatepromotions", args));
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
  public Calculatepromotions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Calculatepromotions calculatepromotions() {
  return new Calculatepromotions();
}


  public static class Calculatesegments {
  private FTValList args = new FTValList();
  private String output;
  public Calculatesegments set(String name, String value) { args.setValString(name,value); return this; }

  public Calculatesegments() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.CALCULATESEGMENTS", args); 
      log.trace(ftValList2String("Calculatesegments", args));
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
  public Calculatesegments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Calculatesegments calculatesegments() {
  return new Calculatesegments();
}


  public static class Discountcart {
  private FTValList args = new FTValList();
  private String output;
  public Discountcart set(String name, String value) { args.setValString(name,value); return this; }

  public Discountcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.DISCOUNTCART", args); 
      log.trace(ftValList2String("Discountcart", args));
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
  public Discountcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Discountcart discountcart() {
  return new Discountcart();
}


  public static class Discounttempcart {
  private FTValList args = new FTValList();
  private String output;
  public Discounttempcart set(String name, String value) { args.setValString(name,value); return this; }
 public Discounttempcart cart(String val) { args.setValString("CART", val); return this; } 
      
  public Discounttempcart() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.DISCOUNTTEMPCART", args); 
      log.trace(ftValList2String("Discounttempcart", args));
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
  public Discounttempcart set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Discounttempcart discounttempcart() {
  return new Discounttempcart();
}


  public static class Getpromotions {
  private FTValList args = new FTValList();
  private String output;
  public Getpromotions set(String name, String value) { args.setValString(name,value); return this; }
 public Getpromotions listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getpromotions() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETPROMOTIONS", args); 
      log.trace(ftValList2String("Getpromotions", args));
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
  public Getpromotions set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpromotions getpromotions() {
  return new Getpromotions();
}


  public static class Getratings {
  private FTValList args = new FTValList();
  private String output;
  public Getratings set(String name, String value) { args.setValString(name,value); return this; }
 public Getratings listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getratings assets(String val) { args.setValString("ASSETS", val); return this; } 
      
 public Getratings defaultrating(String val) { args.setValString("DEFAULTRATING", val); return this; } 
      
  public Getratings() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETRATINGS", args); 
      log.trace(ftValList2String("Getratings", args));
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
  public Getratings set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getratings getratings() {
  return new Getratings();
}


  public static class Getrecommendations {
  private FTValList args = new FTValList();
  private String output;
  public Getrecommendations set(String name, String value) { args.setValString(name,value); return this; }
 public Getrecommendations listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getrecommendations collection(String val) { args.setValString("COLLECTION", val); return this; } 
      
 public Getrecommendations collectionid(String val) { args.setValString("COLLECTIONID", val); return this; } 
      
 public Getrecommendations list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getrecommendations maxcount(String val) { args.setValString("MAXCOUNT", val); return this; } 
      
 public Getrecommendations value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getrecommendations deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
 public Getrecommendations filter(String val) { args.setValString("FILTER", val); return this; } 
      
  public Getrecommendations() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETRECOMMENDATIONS", args); 
      log.trace(ftValList2String("Getrecommendations", args));
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
  public Getrecommendations set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getrecommendations getrecommendations() {
  return new Getrecommendations();
}


  public static class Getsegments {
  private FTValList args = new FTValList();
  private String output;
  public Getsegments set(String name, String value) { args.setValString(name,value); return this; }
 public Getsegments listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getsegments() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETSEGMENTS", args); 
      log.trace(ftValList2String("Getsegments", args));
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
  public Getsegments set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsegments getsegments() {
  return new Getsegments();
}


  public static class Getsinglerecommendation {
  private FTValList args = new FTValList();
  private String output;
  public Getsinglerecommendation set(String name, String value) { args.setValString(name,value); return this; }
 public Getsinglerecommendation varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getsinglerecommendation typevarname(String val) { args.setValString("TYPEVARNAME", val); return this; } 
      
 public Getsinglerecommendation collection(String val) { args.setValString("COLLECTION", val); return this; } 
      
 public Getsinglerecommendation collectionid(String val) { args.setValString("COLLECTIONID", val); return this; } 
      
 public Getsinglerecommendation list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getsinglerecommendation value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Getsinglerecommendation deptype(String val) { args.setValString("DEPTYPE", val); return this; } 
      
  public Getsinglerecommendation() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.GETSINGLERECOMMENDATION", args); 
      log.trace(ftValList2String("Getsinglerecommendation", args));
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
  public Getsinglerecommendation set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getsinglerecommendation getsinglerecommendation() {
  return new Getsinglerecommendation();
}


  public static class Setpromotioncutoff {
  private FTValList args = new FTValList();
  private String output;
  public Setpromotioncutoff set(String name, String value) { args.setValString(name,value); return this; }
 public Setpromotioncutoff value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setpromotioncutoff() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.SETPROMOTIONCUTOFF", args); 
      log.trace(ftValList2String("Setpromotioncutoff", args));
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
  public Setpromotioncutoff set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setpromotioncutoff setpromotioncutoff() {
  return new Setpromotioncutoff();
}


  public static class Setsegmentcutoff {
  private FTValList args = new FTValList();
  private String output;
  public Setsegmentcutoff set(String name, String value) { args.setValString(name,value); return this; }
 public Setsegmentcutoff value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Setsegmentcutoff() { }
  public int run(ICS ics) { 
      ics.runTag("COMMERCECONTEXT.SETSEGMENTCUTOFF", args); 
      log.trace(ftValList2String("Setsegmentcutoff", args));
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
  public Setsegmentcutoff set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setsegmentcutoff setsegmentcutoff() {
  return new Setsegmentcutoff();
}

}
