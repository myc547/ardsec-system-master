package com.ardsec.system.service.user;

import com.ardsec.framework.mybatis.plgins.Paging;
import com.ardsec.framework.paging.PagingResult;
import com.ardsec.framework.service.BaseService;
import com.ardsec.system.dao.user.UserDao;
import com.ardsec.system.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myc on 2017/10/19.
 */
@Service
public class UserService extends BaseService{

    /** 用户DAO **/
    @Autowired
    private UserDao userDao;

    /**
     * 分页获取用户列表
     * @param pageNumber 页码
     * @param pageSeize 条数
     * @return
     */
    public PagingResult<User> getAllList(int pageNumber, int pageSeize) {
        Paging<User> pageUser = userDao.getUserListByPaging(pageNumber, pageSeize);
        return new PagingResult<>(pageUser);
    }
}
