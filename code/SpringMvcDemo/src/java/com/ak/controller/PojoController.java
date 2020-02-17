package com.ak.controller;

import com.ak.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 测试 处理类
 */
@Controller
@RequestMapping("/Pojo")
public class PojoController {

   @PostMapping("/User")
   public String kk(User u){
       System.out.println(u);
       return "success";
   }

    @PostMapping("/Model")
    public String k1(User u, Model model){
        System.out.println(u);
        model.addAttribute("user",u);
        model.addAttribute("name","Model 发送过来的数据");
        return "accept";
    }

    @PostMapping("/ModelMap")
    public String k2(User u, ModelMap modelMap){
        System.out.println(u);
        modelMap.addAttribute("user",u);
        modelMap.addAttribute("name","Modelmap 发送过来的");
        return "accept";
    }

    @PostMapping("/Map")
    public String k5(User u, Map<String,Object> map){
        System.out.println(u);
        map.put("user",u);
        map.put("name","Map 发送过来的");
        return "accept";
    }

    @PostMapping("/ModelAndView")
    public ModelAndView k3(User u){
        System.out.println(u);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("accept");
        modelAndView.addObject("user",u);
        modelAndView.addObject("name","ModelAndView 过来的数据 ");
        return modelAndView;
    }

    /**
     * 跳转到 Users.jsp 页面emmm
     * @return
     */
    @GetMapping("/Users")
    public String k4(){
       return "users";
    }

}
