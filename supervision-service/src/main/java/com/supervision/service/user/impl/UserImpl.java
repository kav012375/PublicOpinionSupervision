package com.supervision.service.user.impl;

import javax.servlet.http.HttpSession;

import com.supervision.service.user.UserService;
import com.supervision.service.user.contants.UserSessions;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class UserImpl implements UserService {

    @Override
    public Boolean checkUserLoginStatus(HttpSession httpSession) {
        if(httpSession.getAttribute(UserSessions.CURRENT_LOGIN_USER_ACCT) == null){
            return false;
        }
        if(httpSession.getAttribute(UserSessions.CURRENT_LOGIN_TIME) == null){
            return false;
        }
        if (httpSession.getAttribute(UserSessions.CURRENT_ACCESS_TOKEN) == null){
            return false;
        }
        return true;
    }
}
