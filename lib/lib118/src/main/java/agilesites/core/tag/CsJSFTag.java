package agilesites.core.tag;
    
import static agilesites.Api.*;
import agilesites.api.Arg;
import agilesites.api.Log;
import COM.FutureTense.Interfaces.*;
    
public class CsJSFTag  {    
  private static Log log = Log.getLog(CsJSFTag.class);  
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
    
 
  public static class Span {
  private FTValList args = new FTValList();
  private String output;
  public Span set(String name, String value) { args.setValString(name,value); return this; }

  public Span() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.SPAN", args); 
      log.trace(ftValList2String("Span", args));
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
  public Span set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Span span() {
  return new Span();
}


  public static class Div {
  private FTValList args = new FTValList();
  private String output;
  public Div set(String name, String value) { args.setValString(name,value); return this; }

  public Div() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.DIV", args); 
      log.trace(ftValList2String("Div", args));
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
  public Div set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Div div() {
  return new Div();
}


  public static class FilterSelect {
  private FTValList args = new FTValList();
  private String output;
  public FilterSelect set(String name, String value) { args.setValString(name,value); return this; }

  public FilterSelect() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.FILTERSELECT", args); 
      log.trace(ftValList2String("FilterSelect", args));
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
  public FilterSelect set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static FilterSelect filterselect() {
  return new FilterSelect();
}


  public static class Iframe {
  private FTValList args = new FTValList();
  private String output;
  public Iframe set(String name, String value) { args.setValString(name,value); return this; }

  public Iframe() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.IFRAME", args); 
      log.trace(ftValList2String("Iframe", args));
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
  public Iframe set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Iframe iframe() {
  return new Iframe();
}


  public static class ScrollTabs {
  private FTValList args = new FTValList();
  private String output;
  public ScrollTabs set(String name, String value) { args.setValString(name,value); return this; }

  public ScrollTabs() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.SCROLLTABS", args); 
      log.trace(ftValList2String("ScrollTabs", args));
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
  public ScrollTabs set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static ScrollTabs scrolltabs() {
  return new ScrollTabs();
}


  public static class Center {
  private FTValList args = new FTValList();
  private String output;
  public Center set(String name, String value) { args.setValString(name,value); return this; }

  public Center() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.CENTER", args); 
      log.trace(ftValList2String("Center", args));
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
  public Center set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Center center() {
  return new Center();
}


  public static class Ul {
  private FTValList args = new FTValList();
  private String output;
  public Ul set(String name, String value) { args.setValString(name,value); return this; }

  public Ul() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.UL", args); 
      log.trace(ftValList2String("Ul", args));
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
  public Ul set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Ul ul() {
  return new Ul();
}


  public static class Li {
  private FTValList args = new FTValList();
  private String output;
  public Li set(String name, String value) { args.setValString(name,value); return this; }

  public Li() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.LI", args); 
      log.trace(ftValList2String("Li", args));
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
  public Li set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Li li() {
  return new Li();
}


  public static class Scroller {
  private FTValList args = new FTValList();
  private String output;
  public Scroller set(String name, String value) { args.setValString(name,value); return this; }
 public Scroller flashId(String val) { args.setValString("FLASHID", val); return this; } 
      
 public Scroller classId(String val) { args.setValString("CLASSID", val); return this; } 
      
 public Scroller movie(String val) { args.setValString("MOVIE", val); return this; } 
      
  public Scroller() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.SCROLLER", args); 
      log.trace(ftValList2String("Scroller", args));
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
  public Scroller set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Scroller scroller() {
  return new Scroller();
}


  public static class Uitree {
  private FTValList args = new FTValList();
  private String output;
  public Uitree set(String name, String value) { args.setValString(name,value); return this; }
 public Uitree value(String val) { args.setValString("VALUE", val); return this; } 
      
  public Uitree() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.UITREE", args); 
      log.trace(ftValList2String("Uitree", args));
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
  public Uitree set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Uitree uitree() {
  return new Uitree();
}


  public static class Include {
  private FTValList args = new FTValList();
  private String output;
  public Include set(String name, String value) { args.setValString(name,value); return this; }
 public Include url(String val) { args.setValString("URL", val); return this; } 
      
  public Include() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.INCLUDE", args); 
      log.trace(ftValList2String("Include", args));
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
  public Include set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Include include() {
  return new Include();
}


  public static class Flash {
  private FTValList args = new FTValList();
  private String output;
  public Flash set(String name, String value) { args.setValString(name,value); return this; }
 public Flash id(String val) { args.setValString("ID", val); return this; } 
      
 public Flash flashId(String val) { args.setValString("FLASHID", val); return this; } 
      
 public Flash classId(String val) { args.setValString("CLASSID", val); return this; } 
      
 public Flash movie(String val) { args.setValString("MOVIE", val); return this; } 
      
  public Flash() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.FLASH", args); 
      log.trace(ftValList2String("Flash", args));
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
  public Flash set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Flash flash() {
  return new Flash();
}


  public static class Calendar {
  private FTValList args = new FTValList();
  private String output;
  public Calendar set(String name, String value) { args.setValString(name,value); return this; }

  public Calendar() { }
  public int run(ICS ics) { 
      ics.runTag("CSJSF.CALENDAR", args); 
      log.trace(ftValList2String("Calendar", args));
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
  public Calendar set(Arg ... _args) {
	  for(Arg arg: _args) {
		  args.setValString(arg.name, arg.value);
	  }
	  return this;
  }
}

public static Calendar calendar() {
  return new Calendar();
}

}
