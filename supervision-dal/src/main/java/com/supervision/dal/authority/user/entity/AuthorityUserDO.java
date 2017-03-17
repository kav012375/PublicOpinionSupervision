package com.supervision.dal.authority.user.entity;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class AuthorityUserDO {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户账号
     */
    private String userAcct;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 用户角色id
     */
    private Integer userRoleId;
    /**
     * 用户电话
     */
    private String userPhone;
    /**
     * 用户邮件地址
     */
    private String userEmail;

    @Override
    public String toString() {
        return "AuthorityUserDO{" +
            "userId=" + userId +
            ", userAcct='" + userAcct + '\'' +
            ", userPwd='" + userPwd + '\'' +
            ", userRoleId=" + userRoleId +
            ", userPhone='" + userPhone + '\'' +
            ", userEmail='" + userEmail + '\'' +
            '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
