package com.supervision.service.user;
import javax.servlet.http.HttpSession;

import com.supervision.dal.authority.user.entity.AuthorityUserDO;
import com.supervision.service.results.*;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public interface UserService {
    /**
     * 检查用户是否登录
     * @param httpSession
     * @return 已经登录返回true，未登录返回false
     */
    Boolean checkUserLoginStatus(HttpSession httpSession);

    /**
     * 用户登录服务
     * @param authorityUserDO
     * @return
     */
    BaseResult<String> userLogin(AuthorityUserDO authorityUserDO);

}
