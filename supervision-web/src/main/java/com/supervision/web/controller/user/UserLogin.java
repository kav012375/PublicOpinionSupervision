package com.supervision.web.controller.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.supervision.dal.authority.user.entity.AuthorityUserDO;
import com.supervision.service.results.BaseResult;
import com.supervision.service.user.UserService;
import com.supervision.service.user.contants.UserSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
@RestController
@RequestMapping(value = "/user")
public class UserLogin {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ResponseBody
    public String userLoginAction(
        HttpServletResponse response,
        HttpSession session,
        @RequestParam("ua") String userAcct,
        @RequestParam("up") String userPwd)
    throws Throwable{
        AuthorityUserDO authorityUserDO = new AuthorityUserDO();
        authorityUserDO.setUSER_ACCT(userAcct);
        authorityUserDO.setUSER_PWD(userPwd);
        BaseResult<String> result = userService.userLogin(authorityUserDO);
        if (result.getSuccess()){
            session.setAttribute(UserSessions.CURRENT_LOGIN_USER_ACCT,userAcct);
            session.setAttribute(UserSessions.CURRENT_LOGIN_TIME,(new Date()).toString());
            session.setAttribute(UserSessions.CURRENT_ACCESS_TOKEN,"null");
            //response.setCharacterEncoding("utf-8");
            //response.getWriter().print("登录成功");
            return "登录成功";
        }else{
            return result.getErrorMsg();
        }

    }
}
