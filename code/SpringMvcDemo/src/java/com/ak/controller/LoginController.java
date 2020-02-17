package com.ak.controller;

import com.ak.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/Login")
@Controller
public class LoginController {

    @RequestMapping("/Check")
    public String kk(String name, String password, HttpServletRequest request){
        if(name.equals("joker")&&password.equals("123")){
            request.getSession().setAttribute("user",new User(1,"joker",30.0));
            return "success";
        }
        return "Register";
    }

    @RequestMapping("Register")
    public String k1(){
        return "Register";
    }

}
