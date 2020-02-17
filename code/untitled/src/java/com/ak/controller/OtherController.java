package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Other")
@Controller
public class OtherController {

    /**
     *获取cookie中的JSESSIONID的值
     * @param value
     * @return
     */
    @GetMapping("/sayHello")
    public String sayHello(@CookieValue("JSESSIONID") String value) {
        System.out.println("value"+value);
        return "success";
    }

}
