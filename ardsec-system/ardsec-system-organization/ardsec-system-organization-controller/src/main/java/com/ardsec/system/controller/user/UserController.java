package com.ardsec.system.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ardsec.framework.controller.BaseController;
import com.ardsec.framework.message.Response;
import com.ardsec.framework.swagger.HttpMethod;
import com.ardsec.system.service.user.UserService;

import io.swagger.annotations.ApiOperation;

/**
 * 用户rest
 * @version        1.0, 17/10/20
 * @author         myc
 */
@RestController
@RequestMapping("${ardsec.web.mappings.user:user}")
public class UserController extends BaseController {

    /** 用户 */
    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @ApiOperation(
        value      = "获取用户列表",
        httpMethod = HttpMethod.GET
    )
    @RequestMapping("/list")
    public Response list() {

        return new Response().success(userService.getAllList(1, 10));
    }
}

