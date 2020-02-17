package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 重定向 转发 的
 */
@RequestMapping("/Redirect")
@Controller
public class RedirectController {

    @GetMapping("/demo")
    public String demo() {
//		return "redirect:/index.jsp";//重定向到页面
        return "redirect:/Redirect/me";//重定向到下面这个请求
    }

    @GetMapping("/me")
    public String method2(ModelMap map) {
        map.addAttribute("date", new Date());
        return "su";
    }

}
