//package com.ak.config;
//
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 异常处理 类
// */
//@Component
//public class TestHandlerException implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
//
//        System.out.println("使用了implements HandlerExceptionResolver");
//        if(e instanceof RuntimeException){
//
//        }
//       ModelAndView modelAndView=new ModelAndView();
//       modelAndView.setViewName("500");
//       modelAndView.addObject("error","对不起有错误");
//        return modelAndView;
//    }
//}
