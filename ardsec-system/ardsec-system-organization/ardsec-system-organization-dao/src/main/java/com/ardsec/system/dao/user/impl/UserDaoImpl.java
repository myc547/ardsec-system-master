package com.ardsec.system.dao.user.impl;

import com.ardsec.framework.dao.impl.BaseDaoImpl;
import com.ardsec.framework.mybatis.plgins.Paging;
import com.ardsec.system.dao.user.UserDao;
import com.ardsec.system.entity.user.User;
import org.springframework.stereotype.Repository;

/**
 * @author myc
 * @version 1.0, 2017/10/20
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    /**
     * 分页获取用户列表
     * @param pageNumber 页码
     * @param pageSize 条数
     * @return
     */
    @Override
    public Paging<User> getUserListByPaging(int pageNumber, int pageSize) {

        return super.selectPaging("selectUserPaging", pageNumber, pageSize);
    }
}
