package com.supervision.web;

import com.supervision.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
@RestController
@RequestMapping(value = "/test")
public class TestMvc {
    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "/tt")
    public String ttMvc(){
        return testService.test();
    }
}
