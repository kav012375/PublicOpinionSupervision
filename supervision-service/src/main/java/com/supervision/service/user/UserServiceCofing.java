package com.supervision.service.user;

import com.supervision.service.user.impl.UserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
@Service
public class UserServiceCofing {

    @Bean
    public UserService userService(){
        UserService userService = new UserImpl();
        return userService;
    }
}
