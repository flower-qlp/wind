package web.css.wind.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 请求拦截 方法1 会拦截所有的url
 * 当前实现 存值
 * 过滤器
 **/
@Component
public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------WebFilter----init----------");
    }

    @Override
    public void destroy() {
        System.out.println("----------WebFilter----destroy----------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("----------WebFilter----doFilter----------");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        servletRequest.setAttribute("basePath", request.getServletContext().getContextPath());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
