package com.sxt.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyIntercptor implements HandlerInterceptor {

    /**
     * 确认是否放行，在执行controller里面的方法之前调用
     * @param request
     * @param response
     * @param handler  代表要访问的控制器对象,如/user/queryAllUser,action: UserController -->queryAllUser
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;
    }

    /**
     * 当自定义的contoller方式之前完成之后，进行转发重定向之前执行
     * @param request
     * @param response
     * @param handler hander 同上
     * @param modelAndView 自定义Controller完成之后返回的对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }


    /**
     * @param request
     * @param response
     * @param handler  渲染完成之后
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
