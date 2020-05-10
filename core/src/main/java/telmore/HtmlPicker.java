package telmore;

import telmore.jsoup.Jsoup;
import telmore.jsoup.nodes.Document;
import telmore.jsoup.nodes.Element;
import telmore.jsoup.select.Elements;
import wcs.api.Content;
import wcs.api.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static wcs.Api.*;


/**
 * HtmlPicker is a template engine building html pages or snippets using
 * replacements and modifications in the html with jQuery-style selectors.
 * 
 * @author msciab
 * 
 */
public class HtmlPicker {

    private static Log log = Log.getLog(HtmlPicker.class);
    private StringBuffer warnings = new StringBuffer();

    // we need a a better default
    private static final String baseUrl = "http://localhost:8080/";

    private Stack<Element> stack = new Stack<Element>();

    private Element top;
    private Element bottom;
    // last select operation was ok?
    private boolean selectOk;

    private void warn(Exception ex, String warning) {
        warnings.append("<li>").append(warning); //
        if (ex != null)
            warnings.append("<blockquote><pre>").append(ex2str(ex))//
                    .append("</pre></blockquote>");
        warnings.append("</li>");
        log.warn(warning);
    }

    private String warnings() {
        if (warnings.length() > 0)
            return "<ol style='font-color: red'>" + warnings.toString()
                    + "</ol>";
        else
            return "";
    }

    private void push(Element elem) {
        stack.push(elem);
        top = elem;
    }

    private void pop() {
        stack.pop();
        top = stack.lastElement();
    }

    /**
     * Get a HtmlPicker form a given resource in the classpath
     *
     * @param resource
     * @param cssq
     * @return a new HtmlPicker
     */
    public static HtmlPicker load(String resource, String cssq) {
        return new HtmlPicker(HtmlPicker.class.getResourceAsStream(resource), null,
                cssq);
    }

    /**
     * Get a HtmlPicker form a given resource in the classpath and select the given
     * query
     *
     * @param resource
     * @param cssq
     * @return a new HtmlPicker
     */
    public static HtmlPicker load(String resource) {
        return new HtmlPicker(HtmlPicker.class.getResourceAsStream(resource), null,
                null);
    }

    /**
     * Get a HtmlPicker from a string
     *
     * @param resource
     * @param cssq
     * @return a new HtmlPicker
     */
    public static HtmlPicker create(String html) {
        return new HtmlPicker(null, html, null);
    }

    /**
     * Get a HtmlPicker from a string and select the given query
     *
     * @param resource
     * @param cssq
     * @return a new HtmlPicker
     */
    public static HtmlPicker create(String html, String cssq) {
        return new HtmlPicker(null, html, cssq);
    }

    /**
     * Create a HtmlPicker for a string
     */
    private HtmlPicker(InputStream is, String html, String cssq) {

        Element elem = null;
        Document doc = null;

        // parse
        try {
            if (is != null) {
                log.debug("parsing resource");
                doc = Jsoup.parse(is, "UTF-8", baseUrl);
            } else if (html != null) {
                log.debug("parsing string");
                doc = Jsoup.parse(html);
            }
            if (doc != null) {
                doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
                doc.outputSettings().outline(true);
            }
        } catch (Exception e) {
            warn(e, "cannot parse template");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    warn(e, "Could not close stream!");
                }
            }
        }

        // select internally
        if (doc != null) {
            if (cssq != null) {
                log.debug("selecting " + cssq);
                elem = doc.select(cssq).first();
                if (elem == null) {
                    throw new IllegalArgumentException("cannot select " + cssq);
                }
            } else
                elem = doc;
        } else {
            throw new IllegalArgumentException("cannot load document");
        }

        // finally assign....
        bottom = elem;
        push(elem);
    }

    /**
     * Select a new element and return a new HtmlPicker
     *
     * @param where
     * @return
     * @throws Exception
     */
    public HtmlPicker select(String where) {
        Elements selected = top.select(where);
        if (selected != null && selected.size() > 0) {
            push(selected.first());
            selectOk = true;
            return this;
        } else {
            selectOk = false;
            warn(null, "cannot select " + where);
            return this;
        }
    }

    /**
     * Return to the precedent selected element
     *
     * @param where
     * @return HtmlPicker
     */
    public HtmlPicker up() {
        pop();
        return this;
    }

    /**
     * Replace where indicated with the specified html
     *
     * @param where
     * @param what
     * @return
     * @throws Exception
     */
    public HtmlPicker replace(String where, String what) {
        if (select(where).selectOk) {
            top.html(nn(what));
            up();
        }
        return this;
    }

    // private method to implement both single and remove
    private HtmlPicker removeOrSingle(String where, boolean keepFirst) {

        Iterator<telmore.jsoup.nodes.Element> it = top.select(where).iterator();
        // keep the first
        if (keepFirst)
            if (it.hasNext())
                it.next();

        // remove others
        while (it.hasNext())
            it.next().remove();

        return this;
    }

    /**
     * Remove nodes specified
     *
     * @param where
     * @return
     */
    public HtmlPicker remove(String where) {
        return removeOrSingle(where, false);
    }

    /**
     * Remove specified attributes
     *
     * @param where
     * @return
     */
    public HtmlPicker removeAttrs(String where, String... attrs) {
        for (Element el : top.select(where))
            for (String attr : attrs)
                el.attributes().remove(attr);
        return this;
    }

    /**
     * Keep only one instance of the node specified
     *
     * @param where
     * @return
     */
    public HtmlPicker single(String where) {
        return removeOrSingle(where, true);
    }

    /**
     * Empty the specified node
     *
     * @param where
     * @return HtmlPicker
     */
    public HtmlPicker empty(String where) {
        top.select(where).empty();
        return this;
    }

    /**
     * Empty the current node
     *
     * @param where
     * @return
     */
    public HtmlPicker empty() {
        top.empty();
        return this;
    }

    /**
     * Print the current selected node as a string
     */
    public String toString() {
        // log.debug(doc.toString());
        return top.toString();
    }

    public String toString(Content... contents) {
        // log.debug(doc.toString());
        return moustache(top.toString(), contents);
    }

    private static Pattern moupat = Pattern.compile("\\{\\{(\\w+)\\}\\}");

    private static String moustache(String s, Content... contents) {
        StringBuffer sb = new StringBuffer();
        Matcher m = moupat.matcher(s);
        next: while (m.find()) {
            String rep = m.group(1);
            log.trace("looking for %s", rep);
            for (Content c : contents) {
                if (c.exists(rep)) {
                    String val = c.getString(rep);
                    log.trace("found %s=%s", rep, val);
                    m.appendReplacement(sb, val);
                    continue next;
                }
            }
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /**
     * Return the inner html of the selected nod. Replace the content of all the
     * variables between {{ }}
     */
    public String html(Content... content) {
        return moustache(bottom.html(), content) + warnings();
    }

    /**
     * Alias for html(...)
     */
    public String innerHtml(Content ... content) {
        return html(content);
    }

    /**
     * Return the html of the selected node including the node itself
     */
    public String outerHtml(Content... content) {
        return moustache(bottom.outerHtml(), content) + warnings();
    }

    /**
     * Add before a given node
     *
     * @param where
     * @param what
     * @return itself
     */
    public HtmlPicker before(String where, String what) {
        // top.select(where).parents().first().append(what);
        top.select(where).before(nn(what));
        return this;
    }

    /**
     * Add after a given node
     *
     * @param where
     * @param what
     * @return itself
     */
    public HtmlPicker after(String where, String what) {
        // top.select(where).parents().first().prepend(what);
        top.select(where).after(nn(what));
        return this;
    }

    /**
     * Append the node as a children to the selected node.
     *
     * @param where
     * @param what
     * @return itself
     */
    public HtmlPicker append(String where, String what) {
        top.select(where).append(nn(what));
        return this;
    }

    /**
     * Append the node as a children to the current node
     *
     * @param where
     * @param what
     * @return
     */
    public HtmlPicker append(String what) {
        top.append(nn(what));
        return this;
    }

    /**
     * Set attribute
     */
    public HtmlPicker attr(String where, String attr, String what) {
        top.select(where).attr(attr, nn(what));
        return this;
    }

    /**
     * Set attribute prefix for all the attributes found
     */
    public HtmlPicker prefixAttrs(String where, String attr, String prefix) {
        prefix = nn(prefix);
        for (Element el : top.select(where)) {
            el.attr(attr, prefix + el.attr(attr));
        }
        return this;
    }

    /**
     * Add a class
     *
     */
    public HtmlPicker addClass(String where, String what) {
        top.select(where).addClass(what);
        return this;
    }
    /**
     * Add a class
     *
     */
    public HtmlPicker removeClass(String where, String what) {
        top.select(where).removeClass(what);
        return this;
    }

    /**
     * Convenience method to dump the html of the current node - embedded calls
     * are decoded.
     *
     * @param stream
     * @return itself
     */
    public HtmlPicker dump(Log log) {
        if (log != null)
            log.trace(dumpStream(html()));
        return this;
    }

    /**
     * Convenience method to dump a generic html are decoded.
     *
     * @param stream
     * @return
     */
    public static void dump(Log log, String html) {
        if (log != null)
            log.trace(dumpStream(html));
    }

    /**
     * Convenience method to dump the outer html of the current node - embedded
     * calls are decoded.
     *
     * @param stream
     * @return
     */
    public HtmlPicker odump(Log log) {
        if (log != null)
            log.trace(dumpStream(outerHtml()));
        return this;
    }

    /**
     * Replace tag selected by "where" with String "What"
     *
     * @param where
     *            Selection criteria (placeholder)
     * @param what
     *            The string to replace the "where" with, this must be valid
     *            HTML
     * @return This HtmlPicker
     */
    public HtmlPicker replaceWith(String where, String what) {
        Document newTag = Jsoup.parse(what);
        Elements elements = top.select(where);
        for (Element element : elements) {
            log.trace("Replace with: %s", newTag.childNode(0).childNode(1)
                    .childNode(0));
            element.replaceWith(newTag.childNode(0).childNode(1).childNode(0));
        }
        return this;

    }

    /**
     * Does the class exist?
     *
     * @param where
     *            Selection criteria (placeholder)
     * @param className the class to look for
     *
     *
     * @return This HtmlPicker
     */
    public boolean hasClass(String where, String className) {
        return top.select(where).hasClass(className);

    }

    public HtmlPicker deleteElementMoveUpChildren(String where){
        Elements e = top.select(where).unwrap();
        return this;
    }

    public Elements getElements(String where) {
        return top.select(where);
    }

}