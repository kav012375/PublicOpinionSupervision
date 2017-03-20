package com.supervision.web.view;

import com.sun.javafx.sg.prism.NGShape.Mode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zeus Feng on 2017/3/20.
 *
 * @author Zeus Feng
 * @date 2017/03/20
 */
@RestController
@RequestMapping(value = "/")
public class Index {

    @RequestMapping(value = "/")
    public ModelAndView indexPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
