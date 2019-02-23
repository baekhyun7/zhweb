package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.RestResult;
import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.MMovie;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.entity.UserInfo;
import com.zhweb.service.MMovieService;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.JwtUtils;
import com.zhweb.util.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.crazycake.shiro.RedisManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
                jwt = JwtUtils.sign(username);
                JwtToken jwtToken=new JwtToken(jwt,password);
                SecurityUtils.getSubject().login(jwtToken);
                return RestResult.restSuccess(jwt);
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
            userInfoService.register(userInfoReq);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"注册成功");
        } catch (BaseException e) {
            return RestResult.restFail(e.getMessage());
        }
    }


}

