package com.supervision.web.config;

import com.supervision.web.controller.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //        super.addInterceptors(registry);
        registry.addInterceptor(new LoginInterceptor());
    }
}
