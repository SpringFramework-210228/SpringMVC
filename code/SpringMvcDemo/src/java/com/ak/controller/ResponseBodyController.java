package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/ResponseBody")
@Controller
public class ResponseBodyController {


    @ResponseBody
    @GetMapping("/demo1")
    public Map<String,Object> demo1() {
        Map<String,Object> map = new HashMap<>();
        map.put("date", new Date());
        map.put("name", "罗小黑");
        map.put("age", 20);
        return map;
    }


}
