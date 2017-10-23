package com.ardsec.system.dao.user;

import com.ardsec.framework.dao.BaseDao;
import com.ardsec.framework.mybatis.plgins.Paging;
import com.ardsec.system.entity.user.User;

/**
 * 用户DAO
 *
 * @author myc
 * @version 1.0, 2017/10/20
 */
public interface UserDao extends BaseDao {

    /**
     * 分页获取用户列表
     * @param pageNumber 页码
     * @param pageSize 条数
     * @return
     */
    Paging<User> getUserListByPaging(int pageNumber, int pageSize);
}
