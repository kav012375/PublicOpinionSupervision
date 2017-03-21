package com.supervision.dal.conf.domain.dao;

import java.util.List;

import com.supervision.dal.conf.domain.entity.ConfDomainDO;

/**
 * Created by Zeus Feng on 2017/3/20.
 *
 * @author Zeus Feng
 * @date 2017/03/20
 */
public interface ConfDomainDAO {
    List<ConfDomainDO> getDomainConfList();
}
