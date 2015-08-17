package wcs.core;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import wcs.api.Log;

/**
 * Servlet Filter implementation 
 */
public class StaticsFilter implements Filter {
    final static Log log = Log.getLog(StaticsFilter.class);

    private Pattern flexBlobs = Pattern.compile("^/Satellite/[a-z0-9]+/(\\d{6,})/.*$");
    private Pattern hashedBlob = Pattern.compile("^/Satellite/(.*)_[a-h0-9]{32}(\\..*$)");

    /**
     * Default constructor.
     */
    public StaticsFilter() { }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {

        //out.println(">>> entering filter");
        HttpServletRequest request = (HttpServletRequest) req;
        String path = request.getRequestURI().substring(request.getContextPath().length());
        log.debug("checking: " + path);
        Matcher m = flexBlobs.matcher(path);
        if (m.find()) {
            log.debug("it is a blob, skipping");
            chain.doFilter(req, res);
            return;
        }

        m = hashedBlob.matcher(path);
        if (m.find()) {
            String resource = m.group(1) + m.group(2);
            String mimeType = MimeTypes.mimeType(path);
            log.debug("statics: " + resource+" "+mimeType);
            byte[] stream = StaticsCache.getInstance().get(resource);
            if (stream == null) {
                log.warn("stream not found for " + resource);
                chain.doFilter(req, res);
                return;
            }
            //System.out.println("output "+mimeType+" "+stream.length);
            res.setContentType(mimeType);
            res.getOutputStream().write(stream);
            return;
        }
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {
        //out.println("*** configuring filter");
        StaticsCache.init(new File(config.getInitParameter("jarDir")),
                Pattern.compile(config.getInitParameter("staticsRegexp")));
    }

}
