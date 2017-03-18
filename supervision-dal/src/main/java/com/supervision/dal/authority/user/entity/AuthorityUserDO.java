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
    private Integer ID;
    /**
     * 用户账号
     */
    private String USER_ACCT;
    /**
     * 用户密码
     */
    private String USER_PWD;
    /**
     * 用户角色id
     */
    private Integer USER_ROLE_ID;
    /**
     * 用户电话
     */
    private String USER_PHONE;
    /**
     * 用户邮件地址
     */
    private String USER_EMAIL;

    @Override
    public String toString() {
        return "AuthorityUserDO{" +
            "ID=" + ID +
            ", USER_ACCT='" + USER_ACCT + '\'' +
            ", USER_PWD='" + USER_PWD + '\'' +
            ", USER_ROLE_ID=" + USER_ROLE_ID +
            ", USER_PHONE='" + USER_PHONE + '\'' +
            ", USER_EMAIL='" + USER_EMAIL + '\'' +
            '}';
    }

    public AuthorityUserDO() {
        this.USER_ACCT = "null";
        this.USER_PWD = "null";
        this.USER_EMAIL = "null";
        this.USER_PHONE = "null";
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUSER_ACCT() {
        return USER_ACCT;
    }

    public void setUSER_ACCT(String USER_ACCT) {
        if (USER_ACCT == null){
            this.USER_ACCT = "null";
        }else{
            this.USER_ACCT = USER_ACCT;
        }
    }

    public String getUSER_PWD() {
        return USER_PWD;
    }

    public void setUSER_PWD(String USER_PWD) {
        if(USER_PWD == null){
            this.USER_PWD = "null";
        }else{
            this.USER_PWD = USER_PWD;
        }
    }

    public Integer getUSER_ROLE_ID() {
        return USER_ROLE_ID;
    }

    public void setUSER_ROLE_ID(Integer USER_ROLE_ID) {
        this.USER_ROLE_ID = USER_ROLE_ID;
    }

    public String getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }

    public String getUSER_EMAIL() {
        return USER_EMAIL;
    }

    public void setUSER_EMAIL(String USER_EMAIL) {
        this.USER_EMAIL = USER_EMAIL;
    }
}
