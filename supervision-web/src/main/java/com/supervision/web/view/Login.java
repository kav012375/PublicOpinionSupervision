package com.supervision.web.view;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
@RestController
@RequestMapping(value = "/")
public class Login {

    @RequestMapping(value = "/login")
    @ResponseBody
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
