package com.ak.controller;

import com.ak.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeController_3 {

    /**
     * 这个返回值User，会被自动的放入Model中，绑定名为首字母小写user，相当于model.addAttribute("user", new User("kelly2","30"));
     * @return
     */
    @ModelAttribute
    public User testModelAttribute2() {
        System.out.println("先执行这个方法2");
        return new User(1,"kelly2",30.0);
    }

    /**
     * 这个方法中的入参User user 的值，来自方法testModelAttribute2中。并且也会存在于model中。
     * @param user
     * @return
     */
    @GetMapping("/sayHello5")
    public String sayHello5(@ModelAttribute("user") User user) {
        System.out.println("执行了sayHello5方法");
        System.out.println(user);
        return "success";
    }
}
