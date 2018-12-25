package com.zhweb.controller;


import com.zhweb.entity.MMovie;
import com.zhweb.service.MMovieService;
import com.zhweb.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
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


    @ApiOperation(value = "testThymeleaf", notes = "testThymeleaf")
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        model.addAttribute("name","123456");
        logger.info("这里是testThymeleaf的方法");
        return "index";
    }

    @ApiOperation(value = "add", notes = "add")
    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("name","123456");
        logger.info("这里是add的方法");
        return "user/add";
    }
    @ApiOperation(value = "update", notes = "update")
    @RequestMapping("/update")
    public String update(Model model){
        model.addAttribute("name","123456");
        logger.info("这里是update的方法");
        return "user/update";
    }
    @ApiOperation(value = "index", notes = "index")
    @RequestMapping("/toLogin")
    public String toLogin(){
        logger.info("这里是toLogin的方法");
        return "/login";
    }

    @ApiOperation(value = "login", notes = "login")
    @RequestMapping("/login")
    public String login(HttpServletRequest request,String name,String password) throws Exception{
        System.out.println("HomeController.login()");

        SecurityUtils.getSubject().login(new UsernamePasswordToken(name,password));
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.

        String exception = (String) request.getAttribute("shiroLoginFailure");

        System.out.println("exception=" + exception);
        String msg = "";
        if (exception != null) {
            if (UnknownAccountException.class.getName().equals(exception)) {
                System.out.println("UnknownAccountException -- > 账号不存在：");
                msg = "UnknownAccountException -- > 账号不存在：";
            } else if (IncorrectCredentialsException.class.getName().equals(exception)) {
                System.out.println("IncorrectCredentialsException -- > 密码不正确：");
                msg = "IncorrectCredentialsException -- > 密码不正确：";
            } else if ("kaptchaValidateFailed".equals(exception)) {
                System.out.println("kaptchaValidateFailed -- > 验证码错误");
                msg = "kaptchaValidateFailed -- > 验证码错误";
            } else {
                msg = "else >> "+exception;
                System.out.println("else -- >" + exception);
            }
        }
      //  map.put("msg", msg);
        // 此方法不处理登录成功,由shiro进行处理.
        return "index";
    }



}

