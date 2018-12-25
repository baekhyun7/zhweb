package com.zhweb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhweb.entity.MMovie;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import com.zhweb.mapper.MMovieMapper;
import com.zhweb.mapper.UserInfoMapper;
import com.zhweb.service.MMovieService;
import com.zhweb.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoMapper.findByUsername(username);
    }

    @Override
    public List<SysRole> getRoleList(String id) {
        return  userInfoMapper.getRoleList(id);

    }
}
