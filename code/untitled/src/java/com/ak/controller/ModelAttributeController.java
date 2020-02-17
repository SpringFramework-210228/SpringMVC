package com.ak.controller;

import com.ak.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeController {

    /**
     * 注解在 void 上
     */
    @ModelAttribute
    public void testModelAttribute1() {
        System.out.println("先执行这个方法1");
    }

    /**
     * 注解在 void
     * @param model
     */
    @ModelAttribute
    public void testModelAttribute(Model model) {
        System.out.println(model.hashCode());
        System.out.println("先执行这个方法2");
        model.addAttribute("user1",new User(1,"ak",99.9));

    }
    /**
     * 这个返回值User，会被自动的放入Model中，绑定名为首字母小写user，相当于model.addAttribute("user", new User(2,"joker",50.0));
     * @return
     */
    @ModelAttribute
    public User testModelAttribute2() {
        System.out.println("先执行这个方法2");
        return new User(2,"joker",50.0);
    }

    /**
     * @ModelAttribute("userKelly") = @ModelAttribute(value="userKelly")
     * 显式的指定绑定名称。默认为User类名首字母小写
    注意：在目标方法中取值时，需要使用@ModelAttribute("userKelly")方式，否则取不到。
    例如
    public String  updateUser(@ModelAttribute("userKelly")User user){
    return SUCCESS;
    }
     * @return
     */
    @ModelAttribute("userKelly")
    public User testModelAttribute3() {
        System.out.println("先执行这个方法3");
        return new User(3,"peter",60.0);
    }

    @GetMapping("/sayHello")
    public String sayHello(Model model) {
        System.out.println(model.hashCode());
       User user3=(User) model.getAttribute("userKelly");
       User user2=(User) model.getAttribute("user");
        User user1=(User) model.getAttribute("user1");
        System.out.println("执行了sayHello方法");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        return "success";
    }
}
