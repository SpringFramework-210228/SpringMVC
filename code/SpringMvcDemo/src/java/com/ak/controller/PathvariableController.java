package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Pathvariable 讲解
 * 取走的是 URL 上面的内容，不是 URL 后面？ 的内容
 */
@RequestMapping("Pathvariable")
@Controller
public class PathvariableController {

    /**
     * 单参数
     * @param user_name
     * @return
     */
    @GetMapping("/sayhello/{name}")
    public String k1(@PathVariable("name") String user_name){
       System.out.println("name -->>"+user_name);
        return "success";
    }

    /**
     * 多参数
     * @param name
     * @param content
     * @return
     */
    @GetMapping("/{name}/say/{content}")
    public String saySth(@PathVariable String name,@PathVariable String content) {
        System.out.println(name+",say: " + content);
        return "success";
    }

    /**
     * 正则表达式 ,匹配的是 一个小写字母+一个数字
     * 其他 比如 joker1--不行 Per1 不行
     * j1,p3,h3 啥的都可以
     * @param name
     * @param content
     * @return
     */
    @GetMapping("/{name:[a-z]\\d}/says/{content}")
    public String saySth2(@PathVariable("name") String name,@PathVariable("content") String content) {
        System.out.println(name+",say: " + content);
        return "success";
    }

    /**
     * 正则表达式的
     * URL:/spring-web-3.0.5.jar
     * @param version
     * @param ext
     */
    @GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
    public String handle(@PathVariable String version, @PathVariable String ext) {
       System.out.println(version+"-----ext--"+ext);
       return "success";
    }

}
