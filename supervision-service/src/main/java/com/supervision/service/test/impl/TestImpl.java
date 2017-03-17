package com.supervision.service.test.impl;

import com.supervision.dal.authority.user.dao.AuthorityUserDAO;
import com.supervision.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class TestImpl implements TestService {
    @Autowired
    AuthorityUserDAO authorityUserDAO;
    @Override
    public String test() {
        return String.valueOf(authorityUserDAO.count());
    }
}
