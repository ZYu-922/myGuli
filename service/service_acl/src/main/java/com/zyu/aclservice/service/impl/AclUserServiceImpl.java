package com.zyu.aclservice.service.impl;

import com.zyu.aclservice.entity.AclUser;
import com.zyu.aclservice.mapper.AclUserMapper;
import com.zyu.aclservice.service.AclUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author zyu
 * @since 2023-07-27
 */
@Service
public class AclUserServiceImpl extends ServiceImpl<AclUserMapper, AclUser> implements AclUserService {

}
