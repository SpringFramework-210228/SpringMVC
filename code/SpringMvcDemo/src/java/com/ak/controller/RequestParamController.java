package com.ak.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/RequestParam")
public class RequestParamController {

    /**
     *
     * @param name 姓名
     * @param age 年龄，非必传，默认为10
     * @return
     */
    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name,
                           @RequestParam(value="age",required=false,defaultValue="10") int age) {
        System.out.println(name+",age: " + age);
        return "success";
    }
}
