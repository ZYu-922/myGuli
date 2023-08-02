package com.zyu.aclservice.mapper;

import com.zyu.aclservice.entity.AclUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zyu
 * @since 2023-07-27
 */
@Mapper
public interface AclUserMapper extends BaseMapper<AclUser> {

}
