package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 类型转换器的测试
 */
@RequestMapping("/Date")
@Controller
public class DateController {

    @RequestMapping("/Test")
    public String testCustomConverter(Date date1,Date date2,Date date3) {
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
        return "success";
    }

    @RequestMapping("/Date")
    public String kk(){
        return "Date";
    }

}
