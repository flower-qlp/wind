package web.css.wind.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.css.wind.filter.WebFilter2;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebFilter2Config {

    @Bean
    public FilterRegistrationBean webFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        WebFilter2 webFilter2 = new WebFilter2();
        filterRegistrationBean.setFilter(webFilter2);
        List<String> url = new ArrayList<>();
        url.add("/page");
        filterRegistrationBean.setUrlPatterns(url);
        return filterRegistrationBean;
    }

}
