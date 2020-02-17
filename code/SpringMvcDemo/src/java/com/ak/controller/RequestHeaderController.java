package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("RequestHeader")
public class RequestHeaderController {
    @GetMapping("/sayHello")
    public String sayHello(@RequestHeader("Host") String header) {
        System.out.println(header);
        return "success";
    }


    @GetMapping("/demo")
    public String handle(
            @RequestHeader("Accept-Encoding") String encoding,
            @RequestHeader("Keep-Alive") long keepAlive) {
        System.out.println(encoding+"---"+keepAlive);
    return "success";
    }

    /**
     * Map 获取
     * @param map
     * @return
     */
    @GetMapping("/sayHello_Map")
    public String sayHello(@RequestHeader Map<String,String> map) {
        for(String key:map.keySet()) {
            System.out.println("header: "+key +" , value : "+ map.get(key));
        }
        return "success";
    }

    /**
     * 数组可以获取
     * @param str
     * @return
     */
    @GetMapping("/sayHello_S")
    public String sayHello(@RequestHeader("accept-encoding") String[] str) {
        for(String s:str) {
            System.out.println(s);
        }
        System.out.println(str);
        return "success";
    }
}
