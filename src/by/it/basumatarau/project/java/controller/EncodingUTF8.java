package by.it.basumatarau.project.java.controller;

import javax.servlet.*;
import java.io.IOException;

public class EncodingUTF8 implements Filter {
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        if(encoding!=null &&
                !encoding.equalsIgnoreCase(servletRequest.getCharacterEncoding())
        ){
            servletResponse.setCharacterEncoding(encoding);
        }

        if(encoding!=null &&
                !encoding.equalsIgnoreCase(servletResponse.getCharacterEncoding())
        ){
            servletResponse.setCharacterEncoding(encoding);
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        encoding=null;
    }
}
