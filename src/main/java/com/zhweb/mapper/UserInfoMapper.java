package com.zhweb.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhweb.entity.MMovie;
import com.zhweb.entity.SysPerssion;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

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

    List<SysPerssion> getPermissionList(String id);

}
