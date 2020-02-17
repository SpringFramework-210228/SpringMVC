package com.ak.config;

import com.ak.Pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器第一种写法
 */
public class TestIntercetor implements HandlerInterceptor {

    /**
     * 在 目标方法前使用
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
// 如果有用户登录的话 ，就可以跳转路径 ，否则不行
        User user=(User)request.getSession().getAttribute("user");
        System.out.println("目标方法之前"+user);
        if(user!=null&&user.getName()!=null){
            return true;
        }
//        没有登录，请登录
        request.getRequestDispatcher("/WEB-INF/views/Register.jsp").forward(request, response);
        return false;
    }

    /**
     * 在 目标方法 调用之后 ，视图渲染之前调用
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("视图渲染之前调用");
    }

    /**
     * 在 视图渲染之后调用
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("视图渲染之后");
    }
}
