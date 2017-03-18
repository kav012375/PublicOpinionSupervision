package com.supervision.web.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.supervision.service.user.UserService;
import com.supervision.service.user.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
@Scope(value = "request")
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        //定义不需要进行拦截的URL
        String[] nonFilterUri = new String[]{
            "/login",
            "/images",
            "/metro",
            "/user",
            "/css",
            "/getCode.do",
            "/register.do",
            "/task/gettask",
            "/file","/error",
            "/taskresult"
        };
        String preferUrl = request.getRequestURI();
        for(String url:nonFilterUri){
            if(preferUrl.contains(url)){
                return super.preHandle(request, response, handler);
            }
        }
        //检测是否已经登录
        HttpSession httpSession = request.getSession();
        if (httpSession == null){
            response.sendRedirect("/user/login");
        }else{
            //不能使用注入，实际证明拦截器中无法使用注入
            UserService userService = new UserImpl();
            boolean chcekResult = userService.checkUserLoginStatus(httpSession);
            if(!chcekResult){
                response.sendRedirect("/login");
            }else{
                return super.preHandle(request, response, handler);
            }
        }
        return super.preHandle(request, response, handler);
    }

    //    @Override
    //    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
    //            throws Exception {
    //
    //        //super.postHandle(request, response, handler, modelAndView);
    //    }

    @Bean
    @Scope(value = "request")
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }
}
