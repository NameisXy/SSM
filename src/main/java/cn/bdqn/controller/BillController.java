package cn.bdqn.controller;

import cn.bdqn.service.IbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class BillController {
    @Autowired
    private IbillService ibillService;
    @RequestMapping("order.html")
    public String order(HttpSession session, String address, Integer kg, String telephone){
        //int kg1=Integer.parseInt(kg);
        if (session.getAttribute("name1") ==null ){
            return "login.html";
        }
        else {
            Integer order = ibillService.order(address, kg, telephone);
            return "success.html";
        }
    }
}
