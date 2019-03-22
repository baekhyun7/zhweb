package com.zhweb.mapper;

import com.zhweb.entity.SysRole;
import com.zhweb.entity.SysUserRole;
import com.zhweb.entity.UserInfoMore;
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
public interface RoleInfoMapper {

  List<SysRole> getRole();

  void updateRole(SysUserRole sysUserRole);
}
