package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.RestResult;
import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.*;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.JwtUtils;
import com.zhweb.util.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.crazycake.shiro.RedisManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "HomeController的接口")
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private RedisManager redisManager;


    @ApiOperation(value = "login", notes = "login")
    @PostMapping("/login")
    @ResponseBody
    public RestResult login(HttpServletRequest request, @RequestParam String username, @RequestParam String password) {

        UserInfo userInfo = null;
        try {
            userInfo = userInfoService.findByUsername(username);
            if(userInfo == null){
                throw new BaseException("无该用户名");
            }
            String password1 = userInfo.getPassword();
            String password2 = MD5Util.MD5(password);
            String jwt;
            if(userInfo!=null && password1.equals(password2)){
                List<String> roleList = userInfoService.getRoleListString(userInfo.getId());
                List<String> permissionList = userInfoService.getPermissionListString(userInfo.getId());
                jwt = JwtUtils.sign(username);
                JwtToken jwtToken=new JwtToken(jwt,password);
                SecurityUtils.getSubject().login(jwtToken);

                UserJwtInfo userJwtInfo = new UserJwtInfo();
                userJwtInfo.setId(userInfo.getId());
                userJwtInfo.setPassword(userInfo.getPassword());
                userJwtInfo.setName(userInfo.getUserName());
                userJwtInfo.setToken(jwt);
                userJwtInfo.setPermission(permissionList);
                userJwtInfo.setRole(roleList);
                //redisManager.set("user".getBytes(),userJwtInfo.toString().getBytes());
                return RestResult.restSuccess(userJwtInfo);
            }else{
                return RestResult.restFail("登录失败，请重新登录");
            }
        } catch (BaseException e) {
            return RestResult.restFail(e.getMessage());
        }

    }
    @ApiOperation(value = "register", notes = "register")
    @PostMapping("/register")
    @ResponseBody
    public RestResult register(@RequestBody UserInfoReq userInfoReq) {
        try {
            UserInfo userInfo = userInfoService.register(userInfoReq);

            List<String> roleList = userInfoService.getRoleListString(userInfo.getId());
            List<String> permissionList = userInfoService.getPermissionListString(userInfo.getId());

            String jwt = JwtUtils.sign(userInfoReq.getUserName());
            JwtToken jwtToken=new JwtToken(jwt,userInfoReq.getPassword());
            SecurityUtils.getSubject().login(jwtToken);

            UserJwtInfo userJwtInfo = new UserJwtInfo();
            userJwtInfo.setId(userInfo.getId());
            userJwtInfo.setPassword(userInfo.getPassword());
            userJwtInfo.setName(userInfo.getUserName());
            userJwtInfo.setToken(jwt);
            userJwtInfo.setPermission(permissionList);
            userJwtInfo.setRole(roleList);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"注册成功",userJwtInfo);
        } catch (BaseException e) {
            return RestResult.restFail(e.getMessage());
        }
    }


}

