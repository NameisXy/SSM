package cn.bdqn.controller;

import cn.bdqn.bean.User;
import cn.bdqn.service.IService;
import com.mysql.cj.Session;
import org.apache.coyote.Request;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MapperController {
    @Autowired
    private IService service;


    //登陆页面
    @RequestMapping("login.html")
    public String a(){
        return "login.html";
    }

    //显示页面
    @RequestMapping("/denglu.html")
    public String name(String name, String password, Model model, HttpSession session){
        String name1 = service.name(name);
        if (null == name1){
            return "login.html";
        }
        else{
            String password1 = service.password(password);
            if (null != password1){
                session.setAttribute("name1",name1);
                session.setAttribute("password",password1);
                Object name11 = session.getAttribute("name1");
                // model.addAttribute("name1",name1);
                return "billList.html";
            }
            else {
            return "login.html";}
        }
    }
    //修改密码页面跳转
    @RequestMapping("password.html")
    public String xiugai(HttpSession session){
        if (session.getAttribute("name1") ==null ){
            return "login.html";
        }
        else {
            return "password.html";
        }
    }

    //修改密码
    @RequestMapping("ChangePassword")
    public String ChangePassword(HttpSession session,String password,String password1,String password2){
        if (session.getAttribute("name1") ==null ){
            return "login.html";
        }
        else {
            if (password == session.getAttribute("password")){
                if (password1.equals(password2)){
                    String name1 = (String) session.getAttribute("name1");
                    service.ChangePassword(name1,password1);
                    return "login.html";
                }
                else {
                    return "shibai.html"; }
                }
                else {
                    return "shibai.html";
            }
        }

    }

    //主页
    @RequestMapping("billList.html")
    public String billList(HttpSession session){
        if (session.getAttribute("name1") ==null ){
            return "login.html";
        }
        else {
            return "billList.html";
        }
    }

    //用户在线下单
    @RequestMapping("providerList.html")
    public String providerList(HttpSession session){
        if (session.getAttribute("name1") ==null ){
            return "login.html";
        }
        else {
            return "providerList.html";
        }
    }

}
