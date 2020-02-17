package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * RequestMapping注解：
     * 将Web请求映射到特定处理程序类和/或处理程序方法，
     * 	这个注解可以用于类或者方法上，并通过属性value指定请求路径
     *
     * 返回值会通过视图解析器解析为实际的视图，对于InternalResourceViewResolver视图解析器，
     * 最后会通过 prefix + returnVal + suffix 的方式得到实际的视图
     *
     * @return
     */
    @RequestMapping("/hello")
    public String kk(){
//        System.out.println(2/0);
        return "hello";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String k1(){
        return "return data --->>>1>>2";
    }
}
