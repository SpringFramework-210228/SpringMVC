package com.ak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestController_Test {

    @GetMapping("/demo2")
    public Map<String,Object> demo2() {
        Map<String,Object> map = new HashMap<>();
        map.put("date", new Date());
        map.put("name", "peter");
        map.put("age", 20);
        return map;
    }

    @GetMapping("/demo3")
    public Map<String,Object> demo3() {
        Map<String,Object> map = new HashMap<>();
        map.put("date", new Date());
        map.put("name", "joker");
        map.put("age", 18);
        return map;
    }

}
