package com.ardsec.system.entity.user;

import com.alibaba.fastjson.annotation.JSONField;
import com.ardsec.framework.entity.BaseEntity;

/**
 * @author myc
 * @version 1.0, 2017/10/20
 */
public class User extends BaseEntity {

    /** 用户名称 **/
    @JSONField(name = "user_name")
    private String userName;

    /** 手机号码 **/
    private String phone;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
