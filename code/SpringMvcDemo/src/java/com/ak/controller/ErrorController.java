package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用来测试异常的使用方法
 */
@RequestMapping("/Error")
@Controller
public class ErrorController {

    @RequestMapping("/sayHello")
    public String testExceptionHandler() {
        System.out.println(2/0);
        return "success";
    }

    @ExceptionHandler
    public ModelAndView handleException(Exception e) {
        System.out.println("使用了注解的异常处理");
        ModelAndView mav =  new ModelAndView("500");
        mav.addObject("error", e.getMessage());
        return mav;
    }

    /**
     * 这个缩小范围的
     * @param e
     * @return
     */
    @ExceptionHandler({NullPointerException.class,NumberFormatException.class})
    public ModelAndView handleException2(Exception e) {
        System.out.println("handleException2"+e.getMessage());
        ModelAndView mav =  new ModelAndView("500");
        mav.addObject("error", e.getMessage());
        return mav;
    }

}
