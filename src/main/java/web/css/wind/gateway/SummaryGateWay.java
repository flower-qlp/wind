package web.css.wind.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "advanced",url = "http://10.2.26.143:8081")
public interface SummaryGateWay {

    @GetMapping(value = "/summary/all/parent/list")
     Object pageParentList();
}
