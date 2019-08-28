package web.css.wind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.css.wind.service.SummaryService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PageController {

    @Autowired
    private SummaryService service;

    @GetMapping(value = "/")
    public String index(HttpServletRequest request) {
        Map pageList = (Map<String, Object>) service.pageParentList();
        request.setAttribute("parentPageList", pageList.get("data"));
        return "index";
    }

    @GetMapping(value = "/admin")
    public String admin(HttpServletRequest request) {
        return "admin";
    }

}
