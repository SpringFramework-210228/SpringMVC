package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeController_2 {

    /**
     * 这两个注解一起使用，返回的return "success" 并不是返回视图的名称，而是把success放入了model中，
     * 返回的视图名称是@RequestMapping中的value值，即：testModelAttribute4
     * @return
     */
    @RequestMapping("login")//这个是值是返回的视图名称,意味这我需要login.jsp
    @ModelAttribute("returnVal")
    public String testModelAttribute4() {
        System.out.println("先执行这个方法4");
        return "success";//此处为放入model中绑定的值
        // 即model.addAttribute(“returnVal”,”success”)
    }

    /**
     * 实现的效果---和上面的一样
     * @return
     */
    @RequestMapping("login1")
    public  @ModelAttribute("returnVal")String testModelAttribute2() {
        System.out.println("先执行这个方法5");
        return "success";
    }

}
