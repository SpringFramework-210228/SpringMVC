package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("name")
//也可以@SessionAttributes(types=String.class)
@Controller
@RequestMapping("/SessionAttributes")
public class SessionAttributesController {

    /**
     * 在Model 里面放置 ，可以放进session
     * @param model
     * @return
     */
    @GetMapping("/sayHello")
    public String sayHello(Model model) {
        model.addAttribute("name", "amy");
        return "success";
    }


    @RequestMapping(value="/hw")
    public String helloWorld(SessionStatus status) {
        status.setComplete();//这个方法会清空SessionAttributes里的所有数据
        return "success";
    }

    /**
     * 获取 session 里面的 内容
     * @param name
     * @return
     */
    @RequestMapping("/demo")
    public String method2(@SessionAttribute("name") String name) {
        System.out.println("name----"+name);
        return "success";
    }



}
