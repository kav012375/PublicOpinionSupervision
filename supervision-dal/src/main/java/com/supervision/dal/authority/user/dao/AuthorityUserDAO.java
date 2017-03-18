package com.supervision.dal.authority.user.dao;

import java.util.List;

import com.supervision.dal.authority.user.entity.AuthorityUserDO;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public interface AuthorityUserDAO {

    int count();

    /**
     * 根据用户账户查找用户
     * @param userAcct
     * @return
     */
    AuthorityUserDO getUserByUserAcct(String userAcct);
}
