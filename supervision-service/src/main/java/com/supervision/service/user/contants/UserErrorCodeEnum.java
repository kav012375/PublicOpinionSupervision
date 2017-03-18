package com.supervision.service.user.contants;

/**
 * Created by Zeus Feng on 2017/3/18.
 *
 * @author Zeus Feng
 * @date 2017/03/18
 */
public enum UserErrorCodeEnum {
    USER_ACCOUNT_IS_NULL("USER_ACCOUNT_IS_NULL","用户账户为空"),
    USER_PASSWORD_IS_NULL("USER_PASSWORD_IS_NULL","用户密码为空"),
    USER_ACCOUNT_DOES_NOT_EXIST("USER_ACCOUNT_DOES_NOT_EXIST","用户账户不存在"),
    USER_PASSWORD_IS_INCORRECT("USER_PASSWORD_IS_INCORRECT","用户密码错误");

    String errorCode;
    String errorMsg;

    private UserErrorCodeEnum(String errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
