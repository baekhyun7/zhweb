package com.zhweb.controller;


import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.MMovie;
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
    private RedisManager redisManager;
    @Autowired
    private UserInfoService userInfoService;


    @ApiOperation(value = "login", notes = "login")
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request,String userName,String password) throws Exception{
        System.out.println("HomeController.login()");

        UserInfo userInfo = userInfoService.findByUsername(userName);
        //String passwordMd5 = MD5Util.MD5(MD5Util.MD5(password));

        String password1 = userInfo.getPassword();

        String jwt=null;
        //System.err.println("这里判断密码是否相等"+ password1.equals(passwordMd5));
        if(userInfo!=null){
            jwt = JwtUtils.sign(userName);
            JwtToken jwtToken=new JwtToken(jwt,password1);
        SecurityUtils.getSubject().login(jwtToken);
        }else{
            System.err.println("错误");
        }
        redisManager.set(userName.getBytes(),password.getBytes());
      //  map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理.
        return jwt;
    }



}

