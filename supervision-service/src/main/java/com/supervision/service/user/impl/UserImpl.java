package com.supervision.service.user.impl;

import javax.servlet.http.HttpSession;

import com.supervision.dal.authority.user.dao.AuthorityUserDAO;
import com.supervision.dal.authority.user.entity.AuthorityUserDO;
import com.supervision.service.user.UserService;
import com.supervision.service.user.contants.UserErrorCodeEnum;
import com.supervision.service.user.contants.UserSessions;
import com.supervision.service.results.*;
import com.supervision.service.utils.EncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class UserImpl implements UserService {
    @Autowired
    AuthorityUserDAO authorityUserDAO;

    private static String NULL_SIGN = "null";

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

    @Override
    public BaseResult<String> userLogin(AuthorityUserDO authorityUserDO) {
        BaseResult<String> result = new BaseResult<String>();
        if (NULL_SIGN.equals(authorityUserDO.getUSER_ACCT())){
            result = result.assembleFalseResult(
                UserErrorCodeEnum.USER_ACCOUNT_IS_NULL.getErrorCode(),
                UserErrorCodeEnum.USER_ACCOUNT_IS_NULL.getErrorMsg());
            return result;
        }
        if (NULL_SIGN.equals(authorityUserDO.getUSER_PWD())){
            result = result.assembleFalseResult(
                UserErrorCodeEnum.USER_PASSWORD_IS_NULL.getErrorCode(),
                UserErrorCodeEnum.USER_PASSWORD_IS_NULL.getErrorMsg());
            return result;
        }
        String userAcct = authorityUserDO.getUSER_ACCT();
        AuthorityUserDO userDO = authorityUserDAO.getUserByUserAcct(userAcct);
        if (userDO == null){
            result = result.assembleFalseResult(
                UserErrorCodeEnum.USER_ACCOUNT_DOES_NOT_EXIST.getErrorCode(),
                UserErrorCodeEnum.USER_ACCOUNT_DOES_NOT_EXIST.getErrorMsg());
            return result;
        }

        if (!userDO.getUSER_PWD().equals(EncryptionUtil.MD5Creator(authorityUserDO.getUSER_PWD()))){
            result = result.assembleFalseResult(
                UserErrorCodeEnum.USER_PASSWORD_IS_INCORRECT.getErrorCode(),
                UserErrorCodeEnum.USER_PASSWORD_IS_INCORRECT.getErrorMsg());
            return result;
        }

        result = result.assembleTrueResult("null");
        return result;
    }
}