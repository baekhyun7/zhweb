package com.zhweb.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.zhweb.entity.SysPermission;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    UserInfo findByUsername(String username);

    List<SysRole> getRoleList(String id);

    List<SysPermission> getPermissionList(String id);

    void addUser(UserInfo userInfo);

    void addRole(@Param("user_id") String user_id, @Param("role_id") String role_id);

    List<UserInfo> query(Pagination page, @Param("userName")String userName);

}
