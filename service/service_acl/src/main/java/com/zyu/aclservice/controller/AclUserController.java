package com.zyu.aclservice.controller;


import com.zyu.aclservice.client.EduClient;
import com.zyu.aclservice.entity.AclUser;
import com.zyu.aclservice.mapper.AclUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zyu
 * @since 2023-07-27
 */
@RestController
@RequestMapping("/aclservice/acl-user")
public class AclUserController {

    @Autowired
    AclUserMapper aclUserMapper;

    @Autowired
    EduClient eduClient;

    @GetMapping("/getAllUser")
    public List<AclUser> getAllUser(){
        List<AclUser> res=aclUserMapper.selectList(null);
        return res;
    }

    @GetMapping("/test")
    public String test(){
        return eduClient.testNacos();
    }

}

