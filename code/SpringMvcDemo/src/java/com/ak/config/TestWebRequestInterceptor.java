package com.ak.config;

import com.ak.Pojo.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 拦截器第二种写法
 * 感觉一般用作资源 准备
 */
public class TestWebRequestInterceptor implements WebRequestInterceptor {

//    SCOPE_REQUEST ：它的值是0 ，代表只有在request 中可以访问。
//    SCOPE_SESSION ：它的值是1 ，如果环境允许的话它代表的是一个局部的隔离的session，否则就代表普通的session，并且在该session范围内可以访问。
//    SCOPE_GLOBAL_SESSION ：它的值是2 ，如果环境允许的话，它代表的是一个全局共享的session，否则就代表普通的session，并且在该session 范围内可以访问。
//
    /**
     * 方法调用之前
     * WebRequestInterceptor的该方法返回值为void，不是boolean。所以该方法不能用于请求阻断，一般用于资源准备。
     * @param webRequest
     * @throws Exception
     */
    @Override
    public void preHandle(WebRequest webRequest) throws Exception {

        User u =(User)webRequest.getAttribute("user",WebRequest.SCOPE_SESSION);
        System.out.println("目标方法之前"+u);

    }

    /**
     * 视图渲染之前
     * preHandle 中准备的数据都可以通过参数WebRequest访问。ModelMap 是Controller 处理之后返回的Model 对象，可以通过改变它的属性来改变Model 对象模型，达到改变视图渲染效果的目的。
     * @param webRequest
     * @param modelMap
     * @throws Exception
     */
    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    /**
     * 视图渲染之后
     * Exception 参数表示的是当前请求的异常对象，如果Controller 抛出的异常已经被处理过，则Exception对象为null 。
     * @param webRequest
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
