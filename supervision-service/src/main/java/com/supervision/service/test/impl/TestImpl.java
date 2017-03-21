package com.supervision.service.test.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.supervision.dal.authority.user.dao.AuthorityUserDAO;
import com.supervision.dal.conf.domain.dao.ConfDomainDAO;
import com.supervision.dal.conf.domain.entity.ConfDomainDO;
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
    ConfDomainDAO confDomainDAO;
    @Override
    public List<ConfDomainDO> test() {
        PageHelper.startPage(2,10);
        List<ConfDomainDO> confDomainDOS = confDomainDAO.getDomainConfList();
        return confDomainDOS;
    }
}
