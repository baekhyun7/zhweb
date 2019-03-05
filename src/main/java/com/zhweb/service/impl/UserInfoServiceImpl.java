package com.zhweb.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.common.exception.BaseException;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.entity.SysPermission;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import com.zhweb.entity.UserInfoMore;
import com.zhweb.mapper.UserInfoMapper;
import com.zhweb.mapper.UserInfoMoreMapper;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.JwtUtils;
import com.zhweb.util.MD5Util;
import com.zhweb.util.UUIDUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserInfoMoreMapper userInfoMoreMapper;

    @Override
    public UserInfo findByUsername(String username) throws BaseException {
        return userInfoMapper.findByUsername(username);
    }

    @Override
    public List<SysRole> getRoleList(String id) {
        return userInfoMapper.getRoleList(id);

    }

    @Override
    public List<String> getRoleListString(String id) throws BaseException {
        List<SysRole> roleList = userInfoMapper.getRoleList(id);
        List<String> list =  new ArrayList<>();
        if(roleList.size()==0 && roleList.isEmpty()){
            return Lists.newArrayList();
        }
        for (SysRole sysRole : roleList) {
            list.add(sysRole.getRole());
        }
        return list;
    }

    @Override
    public List<SysPermission> getPermissionList(String id) {
        return userInfoMapper.getPermissionList(id);
    }

    @Override
    public List<String> getPermissionListString(String id) throws BaseException {
        List<SysPermission> permissionList = userInfoMapper.getPermissionList(id);
        List<String> list = Lists.newArrayList() ;
        if(permissionList.size()==0 && permissionList.isEmpty()){
            return Lists.newArrayList();
        }
        for (SysPermission sysPermission : permissionList) {
            list.add(sysPermission.getPermission());
        }
        return list;
    }

    @Override
    public void register(UserInfoReq userInfoReq) throws BaseException {
        UserInfo byUsername = userInfoMapper.findByUsername(userInfoReq.getUserName());
        if (byUsername != null) {
            throw new BaseException("该用户名已经被注册！！");
        }
        String id = UUIDUtils.creatUUID();
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserName(userInfoReq.getUserName());
        userInfo.setPassword(MD5Util.MD5(userInfoReq.getPassword()));

        UserInfoMore userInfoMore = new UserInfoMore();
        userInfoMore.setId(id);
        userInfoMore.setQq(userInfoReq.getQq());
        userInfoMore.setTelephone(userInfoReq.getTelephone());

        userInfoMapper.addUser(userInfo);
        userInfoMapper.addRole(userInfo.getId(),"1");
        userInfoMoreMapper.addUserInfo(userInfoMore);


    }

    @Override
    public Page<UserInfo> query(Page<UserInfo> page, String userName) throws BaseException {
        page.setRecords(userInfoMapper.query(page,userName));
        return page;
    }
}
