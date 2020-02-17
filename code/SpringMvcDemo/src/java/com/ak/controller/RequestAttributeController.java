package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/RequestAttribute")
public class RequestAttributeController {

    @ModelAttribute
    public void before(HttpServletRequest request) {
        request.setAttribute("na2", "shanghai");
        request.setAttribute("na1", "guangzhou");
    }

    @RequestMapping("/testme")
    public String testme(@RequestAttribute("na1") String na) { //这里的na1会取到上面方法中request的值
        System.out.println(na);
        return "success";
    }


}
