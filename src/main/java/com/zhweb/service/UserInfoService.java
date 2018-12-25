package com.zhweb.service;

import com.baomidou.mybatisplus.service.IService;
import com.zhweb.entity.MMovie;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public interface UserInfoService extends IService<UserInfo> {
    /**
     * 通过username查找用户信息;
     */
     UserInfo findByUsername(String username);

    /**
     * 查询角色信息
     * @param id
     * @return
     */
    List<SysRole> getRoleList(String id);

}
