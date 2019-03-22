package com.zhweb.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.common.exception.BaseException;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.entity.SysPermission;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import com.zhweb.entity.UserShowInfo;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public interface UserInfoService extends IService<UserInfo> {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username) throws BaseException;

    /**
     * 查询角色信息
     *
     * @param id
     * @return
     */
    List<SysRole> getRoleList(String id);

    /**
     * 查询角色信息 string
     *
     * @param id
     * @return
     */
    List<String> getRoleListString(String id) throws BaseException;

    /**
     * 查询权限信息
     *
     * @param id
     * @return
     */
    List<SysPermission> getPermissionList(String id);

    /**
     * 查询权限信息 string
     *
     * @param id
     * @return
     */
    List<String> getPermissionListString(String id) throws BaseException;

    /**
     * 注册用户
     *
     * @param userInfoReq
     * @throws BaseException
     */
    UserInfo register(UserInfoReq userInfoReq) throws BaseException;

    /**
     * 查询用户
     * @return
     * @throws BaseException
     */
    List<UserShowInfo> query(String userName) throws BaseException;

    /**
     * 删除用户
     * @return
     * @throws BaseException
     */
    void deleteUser(List<String> list) throws BaseException;

    /**
     * 删除用户
     * @return
     * @throws BaseException
     */
    void delete(String id) throws BaseException;

    /**
     * 查询角色信息（下拉框）
     * @return
     * @throws BaseException
     */
    List<SysRole> getRole() throws  BaseException;

    void update(UserInfoConReq userInfoConReq) throws  BaseException;

}
