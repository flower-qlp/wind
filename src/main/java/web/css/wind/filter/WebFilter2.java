package web.css.wind.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * 请求拦截 方法2
 * 过滤器
 **/
public class WebFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------WebFilter2----init----------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("--------WebFilter2--doFilter----------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("--------WebFilter2--destroy----------");
    }
}
