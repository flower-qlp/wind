package web.css.wind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {


    @GetMapping(value = "/")
    public String index(HttpServletRequest request) {
        return "index";
    }

    @GetMapping(value = "/page")
    public String page(HttpServletRequest request) {
        return "index";
    }

}
