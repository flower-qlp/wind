package web.css.wind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.css.wind.gateway.SummaryGateWay;

@Service
public class SummaryService {

    @Autowired
    private SummaryGateWay summaryGateWay;

    public Object pageParentList(){
        return summaryGateWay.pageParentList();
    }
}
