package com.supervision.service.test;

import com.supervision.service.test.impl.TestImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
@Service
public class TestServiceConfig {
    @Bean
    public TestService testService(){
        TestService testService = new TestImpl();
        return testService;
    }
}
