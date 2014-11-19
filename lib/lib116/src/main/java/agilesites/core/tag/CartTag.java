package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CartTag  {    
  private static Log log = Log.getLog(CartTag.class);  
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
      ics.runTag("CART.ARGUMENT", args); 
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


  public static class Additem {
  private FTValList args = new FTValList();
  private String output;
  public Additem set(String name, String value) { args.setValString(name,value); return this; }
 public Additem name(String val) { args.setValString("NAME", val); return this; } 
      
 public Additem storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Additem id(String val) { args.setValString("ID", val); return this; } 
      
 public Additem quantity(String val) { args.setValString("QUANTITY", val); return this; } 
      
 public Additem price(String val) { args.setValString("PRICE", val); return this; } 
      
 public Additem type(String val) { args.setValString("TYPE", val); return this; } 
      
 public Additem list(String val) { args.setValString("LIST", val); return this; } 
      
 public Additem merge(String val) { args.setValString("MERGE", val); return this; } 
      
 public Additem insertbefore(String val) { args.setValString("INSERTBEFORE", val); return this; } 
      
 public Additem varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Additem() { }
  public int run(ICS ics) { 
      ics.runTag("CART.ADDITEM", args); 
      log.trace(ftValList2String("Additem", args));
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
  public Additem set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Additem additem() {
  return new Additem();
}


  public static class Check {
  private FTValList args = new FTValList();
  private String output;
  public Check set(String name, String value) { args.setValString(name,value); return this; }
 public Check name(String val) { args.setValString("NAME", val); return this; } 
      
 public Check varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Check() { }
  public int run(ICS ics) { 
      ics.runTag("CART.CHECK", args); 
      log.trace(ftValList2String("Check", args));
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
  public Check set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Check check() {
  return new Check();
}


  public static class Clear {
  private FTValList args = new FTValList();
  private String output;
  public Clear set(String name, String value) { args.setValString(name,value); return this; }
 public Clear name(String val) { args.setValString("NAME", val); return this; } 
      
  public Clear() { }
  public int run(ICS ics) { 
      ics.runTag("CART.CLEAR", args); 
      log.trace(ftValList2String("Clear", args));
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
  public Clear set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Clear clear() {
  return new Clear();
}


  public static class Cleardiscounts {
  private FTValList args = new FTValList();
  private String output;
  public Cleardiscounts set(String name, String value) { args.setValString(name,value); return this; }
 public Cleardiscounts name(String val) { args.setValString("NAME", val); return this; } 
      
  public Cleardiscounts() { }
  public int run(ICS ics) { 
      ics.runTag("CART.CLEARDISCOUNTS", args); 
      log.trace(ftValList2String("Cleardiscounts", args));
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
  public Cleardiscounts set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Cleardiscounts cleardiscounts() {
  return new Cleardiscounts();
}


  public static class Commit {
  private FTValList args = new FTValList();
  private String output;
  public Commit set(String name, String value) { args.setValString(name,value); return this; }
 public Commit name(String val) { args.setValString("NAME", val); return this; } 
      
 public Commit varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Commit() { }
  public int run(ICS ics) { 
      ics.runTag("CART.COMMIT", args); 
      log.trace(ftValList2String("Commit", args));
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
  public Commit set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Commit commit() {
  return new Commit();
}


  public static class Create {
  private FTValList args = new FTValList();
  private String output;
  public Create set(String name, String value) { args.setValString(name,value); return this; }
 public Create name(String val) { args.setValString("NAME", val); return this; } 
      
  public Create() { }
  public int run(ICS ics) { 
      ics.runTag("CART.CREATE", args); 
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


  public static class Deleteitem {
  private FTValList args = new FTValList();
  private String output;
  public Deleteitem set(String name, String value) { args.setValString(name,value); return this; }
 public Deleteitem name(String val) { args.setValString("NAME", val); return this; } 
      
 public Deleteitem id(String val) { args.setValString("ID", val); return this; } 
      
 public Deleteitem listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Deleteitem() { }
  public int run(ICS ics) { 
      ics.runTag("CART.DELETEITEM", args); 
      log.trace(ftValList2String("Deleteitem", args));
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
  public Deleteitem set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Deleteitem deleteitem() {
  return new Deleteitem();
}


  public static class Getcartdiscounts {
  private FTValList args = new FTValList();
  private String output;
  public Getcartdiscounts set(String name, String value) { args.setValString(name,value); return this; }
 public Getcartdiscounts name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcartdiscounts listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getcartdiscounts() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETCARTDISCOUNTS", args); 
      log.trace(ftValList2String("Getcartdiscounts", args));
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
  public Getcartdiscounts set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcartdiscounts getcartdiscounts() {
  return new Getcartdiscounts();
}


  public static class Getcartdiscounttotal {
  private FTValList args = new FTValList();
  private String output;
  public Getcartdiscounttotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getcartdiscounttotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getcartdiscounttotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getcartdiscounttotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getcartdiscounttotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETCARTDISCOUNTTOTAL", args); 
      log.trace(ftValList2String("Getcartdiscounttotal", args));
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
  public Getcartdiscounttotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getcartdiscounttotal getcartdiscounttotal() {
  return new Getcartdiscounttotal();
}


  public static class Geterrors {
  private FTValList args = new FTValList();
  private String output;
  public Geterrors set(String name, String value) { args.setValString(name,value); return this; }
 public Geterrors name(String val) { args.setValString("NAME", val); return this; } 
      
 public Geterrors listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Geterrors storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Geterrors() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETERRORS", args); 
      log.trace(ftValList2String("Geterrors", args));
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
  public Geterrors set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Geterrors geterrors() {
  return new Geterrors();
}


  public static class Getfinaltotal {
  private FTValList args = new FTValList();
  private String output;
  public Getfinaltotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getfinaltotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getfinaltotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getfinaltotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getfinaltotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETFINALTOTAL", args); 
      log.trace(ftValList2String("Getfinaltotal", args));
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
  public Getfinaltotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getfinaltotal getfinaltotal() {
  return new Getfinaltotal();
}


  public static class Fromstring {
  private FTValList args = new FTValList();
  private String output;
  public Fromstring set(String name, String value) { args.setValString(name,value); return this; }
 public Fromstring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Fromstring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Fromstring() { }
  public int run(ICS ics) { 
      ics.runTag("CART.FROMSTRING", args); 
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


  public static class Getitemdiscounts {
  private FTValList args = new FTValList();
  private String output;
  public Getitemdiscounts set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemdiscounts name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemdiscounts id(String val) { args.setValString("ID", val); return this; } 
      
 public Getitemdiscounts listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getitemdiscounts() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMDISCOUNTS", args); 
      log.trace(ftValList2String("Getitemdiscounts", args));
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
  public Getitemdiscounts set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemdiscounts getitemdiscounts() {
  return new Getitemdiscounts();
}


  public static class Getitemdiscounttotal {
  private FTValList args = new FTValList();
  private String output;
  public Getitemdiscounttotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemdiscounttotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemdiscounttotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getitemdiscounttotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMDISCOUNTTOTAL", args); 
      log.trace(ftValList2String("Getitemdiscounttotal", args));
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
  public Getitemdiscounttotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemdiscounttotal getitemdiscounttotal() {
  return new Getitemdiscounttotal();
}


  public static class Getitemerrors {
  private FTValList args = new FTValList();
  private String output;
  public Getitemerrors set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemerrors name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemerrors id(String val) { args.setValString("ID", val); return this; } 
      
 public Getitemerrors listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getitemerrors() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMERRORS", args); 
      log.trace(ftValList2String("Getitemerrors", args));
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
  public Getitemerrors set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemerrors getitemerrors() {
  return new Getitemerrors();
}


  public static class Getitemlegalvalues {
  private FTValList args = new FTValList();
  private String output;
  public Getitemlegalvalues set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemlegalvalues name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemlegalvalues field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getitemlegalvalues id(String val) { args.setValString("ID", val); return this; } 
      
 public Getitemlegalvalues listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getitemlegalvalues() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMLEGALVALUES", args); 
      log.trace(ftValList2String("Getitemlegalvalues", args));
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
  public Getitemlegalvalues set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemlegalvalues getitemlegalvalues() {
  return new Getitemlegalvalues();
}


  public static class Getitemparameter {
  private FTValList args = new FTValList();
  private String output;
  public Getitemparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemparameter field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getitemparameter storeid(String val) { args.setValString("STOREID", val); return this; } 
      
 public Getitemparameter varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getitemparameter() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMPARAMETER", args); 
      log.trace(ftValList2String("Getitemparameter", args));
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
  public Getitemparameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemparameter getitemparameter() {
  return new Getitemparameter();
}


  public static class Getitemparameters {
  private FTValList args = new FTValList();
  private String output;
  public Getitemparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemparameters field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getitemparameters id(String val) { args.setValString("ID", val); return this; } 
      
 public Getitemparameters listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getitemparameters() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMPARAMETERS", args); 
      log.trace(ftValList2String("Getitemparameters", args));
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
  public Getitemparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemparameters getitemparameters() {
  return new Getitemparameters();
}


  public static class Getitems {
  private FTValList args = new FTValList();
  private String output;
  public Getitems set(String name, String value) { args.setValString(name,value); return this; }
 public Getitems name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitems listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getitems list(String val) { args.setValString("LIST", val); return this; } 
      
 public Getitems storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getitems() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMS", args); 
      log.trace(ftValList2String("Getitems", args));
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
  public Getitems set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitems getitems() {
  return new Getitems();
}


  public static class Getitemtotal {
  private FTValList args = new FTValList();
  private String output;
  public Getitemtotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getitemtotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getitemtotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getitemtotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getitemtotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETITEMTOTAL", args); 
      log.trace(ftValList2String("Getitemtotal", args));
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
  public Getitemtotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getitemtotal getitemtotal() {
  return new Getitemtotal();
}


  public static class Getlegalvalues {
  private FTValList args = new FTValList();
  private String output;
  public Getlegalvalues set(String name, String value) { args.setValString(name,value); return this; }
 public Getlegalvalues name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getlegalvalues field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getlegalvalues listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
 public Getlegalvalues storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getlegalvalues() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETLEGALVALUES", args); 
      log.trace(ftValList2String("Getlegalvalues", args));
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
  public Getlegalvalues set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getlegalvalues getlegalvalues() {
  return new Getlegalvalues();
}


  public static class Getparameter {
  private FTValList args = new FTValList();
  private String output;
  public Getparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Getparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparameter field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Getparameter varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getparameter storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getparameter() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETPARAMETER", args); 
      log.trace(ftValList2String("Getparameter", args));
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
  public Getparameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparameter getparameter() {
  return new Getparameter();
}


  public static class Getparameters {
  private FTValList args = new FTValList();
  private String output;
  public Getparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Getparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getparameters listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getparameters() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETPARAMETERS", args); 
      log.trace(ftValList2String("Getparameters", args));
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
  public Getparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getparameters getparameters() {
  return new Getparameters();
}


  public static class Getpreliminarytotal {
  private FTValList args = new FTValList();
  private String output;
  public Getpreliminarytotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getpreliminarytotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getpreliminarytotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getpreliminarytotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getpreliminarytotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETPRELIMINARYTOTAL", args); 
      log.trace(ftValList2String("Getpreliminarytotal", args));
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
  public Getpreliminarytotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getpreliminarytotal getpreliminarytotal() {
  return new Getpreliminarytotal();
}


  public static class Getshippingtotal {
  private FTValList args = new FTValList();
  private String output;
  public Getshippingtotal set(String name, String value) { args.setValString(name,value); return this; }
 public Getshippingtotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getshippingtotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Getshippingtotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Getshippingtotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETSHIPPINGTOTAL", args); 
      log.trace(ftValList2String("Getshippingtotal", args));
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
  public Getshippingtotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getshippingtotal getshippingtotal() {
  return new Getshippingtotal();
}


  public static class Getstores {
  private FTValList args = new FTValList();
  private String output;
  public Getstores set(String name, String value) { args.setValString(name,value); return this; }
 public Getstores name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getstores listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Getstores() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETSTORES", args); 
      log.trace(ftValList2String("Getstores", args));
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
  public Getstores set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getstores getstores() {
  return new Getstores();
}


  public static class Gettaxtotal {
  private FTValList args = new FTValList();
  private String output;
  public Gettaxtotal set(String name, String value) { args.setValString(name,value); return this; }
 public Gettaxtotal name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettaxtotal varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gettaxtotal storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Gettaxtotal() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETTAXTOTAL", args); 
      log.trace(ftValList2String("Gettaxtotal", args));
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
  public Gettaxtotal set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettaxtotal gettaxtotal() {
  return new Gettaxtotal();
}


  public static class Gettransactionid {
  private FTValList args = new FTValList();
  private String output;
  public Gettransactionid set(String name, String value) { args.setValString(name,value); return this; }
 public Gettransactionid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettransactionid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
 public Gettransactionid storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Gettransactionid() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETTRANSACTIONID", args); 
      log.trace(ftValList2String("Gettransactionid", args));
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
  public Gettransactionid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettransactionid gettransactionid() {
  return new Gettransactionid();
}


  public static class Gettransactionids {
  private FTValList args = new FTValList();
  private String output;
  public Gettransactionids set(String name, String value) { args.setValString(name,value); return this; }
 public Gettransactionids name(String val) { args.setValString("NAME", val); return this; } 
      
 public Gettransactionids listvarname(String val) { args.setValString("LISTVARNAME", val); return this; } 
      
  public Gettransactionids() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETTRANSACTIONIDS", args); 
      log.trace(ftValList2String("Gettransactionids", args));
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
  public Gettransactionids set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Gettransactionids gettransactionids() {
  return new Gettransactionids();
}


  public static class Merge {
  private FTValList args = new FTValList();
  private String output;
  public Merge set(String name, String value) { args.setValString(name,value); return this; }
 public Merge name(String val) { args.setValString("NAME", val); return this; } 
      
 public Merge cart(String val) { args.setValString("CART", val); return this; } 
      
  public Merge() { }
  public int run(ICS ics) { 
      ics.runTag("CART.MERGE", args); 
      log.trace(ftValList2String("Merge", args));
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
  public Merge set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Merge merge() {
  return new Merge();
}


  public static class Setitemparameters {
  private FTValList args = new FTValList();
  private String output;
  public Setitemparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Setitemparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setitemparameters id(String val) { args.setValString("ID", val); return this; } 
      
 public Setitemparameters list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setitemparameters() { }
  public int run(ICS ics) { 
      ics.runTag("CART.SETITEMPARAMETERS", args); 
      log.trace(ftValList2String("Setitemparameters", args));
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
  public Setitemparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setitemparameters setitemparameters() {
  return new Setitemparameters();
}


  public static class Setitemquantity {
  private FTValList args = new FTValList();
  private String output;
  public Setitemquantity set(String name, String value) { args.setValString(name,value); return this; }
 public Setitemquantity name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setitemquantity id(String val) { args.setValString("ID", val); return this; } 
      
 public Setitemquantity quantity(String val) { args.setValString("QUANTITY", val); return this; } 
      
 public Setitemquantity price(String val) { args.setValString("PRICE", val); return this; } 
      
  public Setitemquantity() { }
  public int run(ICS ics) { 
      ics.runTag("CART.SETITEMQUANTITY", args); 
      log.trace(ftValList2String("Setitemquantity", args));
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
  public Setitemquantity set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setitemquantity setitemquantity() {
  return new Setitemquantity();
}


  public static class Setparameter {
  private FTValList args = new FTValList();
  private String output;
  public Setparameter set(String name, String value) { args.setValString(name,value); return this; }
 public Setparameter name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparameter field(String val) { args.setValString("FIELD", val); return this; } 
      
 public Setparameter value(String val) { args.setValString("VALUE", val); return this; } 
      
 public Setparameter storeid(String val) { args.setValString("STOREID", val); return this; } 
      
  public Setparameter() { }
  public int run(ICS ics) { 
      ics.runTag("CART.SETPARAMETER", args); 
      log.trace(ftValList2String("Setparameter", args));
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
  public Setparameter set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparameter setparameter() {
  return new Setparameter();
}


  public static class Setparameters {
  private FTValList args = new FTValList();
  private String output;
  public Setparameters set(String name, String value) { args.setValString(name,value); return this; }
 public Setparameters name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setparameters list(String val) { args.setValString("LIST", val); return this; } 
      
  public Setparameters() { }
  public int run(ICS ics) { 
      ics.runTag("CART.SETPARAMETERS", args); 
      log.trace(ftValList2String("Setparameters", args));
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
  public Setparameters set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setparameters setparameters() {
  return new Setparameters();
}


  public static class Tostring {
  private FTValList args = new FTValList();
  private String output;
  public Tostring set(String name, String value) { args.setValString(name,value); return this; }
 public Tostring name(String val) { args.setValString("NAME", val); return this; } 
      
 public Tostring varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Tostring() { }
  public int run(ICS ics) { 
      ics.runTag("CART.TOSTRING", args); 
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


  public static class Setuserid {
  private FTValList args = new FTValList();
  private String output;
  public Setuserid set(String name, String value) { args.setValString(name,value); return this; }
 public Setuserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Setuserid userid(String val) { args.setValString("USERID", val); return this; } 
      
  public Setuserid() { }
  public int run(ICS ics) { 
      ics.runTag("CART.SETUSERID", args); 
      log.trace(ftValList2String("Setuserid", args));
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
  public Setuserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Setuserid setuserid() {
  return new Setuserid();
}


  public static class Getuserid {
  private FTValList args = new FTValList();
  private String output;
  public Getuserid set(String name, String value) { args.setValString(name,value); return this; }
 public Getuserid name(String val) { args.setValString("NAME", val); return this; } 
      
 public Getuserid varname(String val) { args.setValString("VARNAME", val); return this; } 
      
  public Getuserid() { }
  public int run(ICS ics) { 
      ics.runTag("CART.GETUSERID", args); 
      log.trace(ftValList2String("Getuserid", args));
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
  public Getuserid set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Getuserid getuserid() {
  return new Getuserid();
}

}
