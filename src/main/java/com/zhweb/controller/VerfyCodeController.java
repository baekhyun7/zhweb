package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.RestResult;
import com.zhweb.JwtToken.JwtToken;
import com.zhweb.entity.RO.UserInfoReq;
import com.zhweb.entity.UserInfo;
import com.zhweb.entity.UserJwtInfo;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.JwtUtils;
import com.zhweb.util.MD5Util;
import com.zhweb.util.VerifyCodeUtil;
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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "VerfyCodeController的接口")
@Controller
public class VerfyCodeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @ApiOperation(value = "getVerfyCode", notes = "getVerfyCode")
    @GetMapping("/getVerfyCode")
    @ResponseBody
    public RestResult getVerfyCode(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            VerifyCodeUtil verifyCodeUtil = new VerifyCodeUtil();
            verifyCodeUtil.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            logger.error("获取验证码失败>>>>   ", e);
        }
        return null;
    }
    @ApiOperation(value = "checkVerfyCode", notes = "checkVerfyCode")
    @GetMapping("/checkVerfyCode")
    @ResponseBody
    public RestResult checkVerfyCode(@RequestParam(value = "inputStr") String inputStr, HttpServletRequest request) {
        try {
            Boolean check;
            String random = (String) request.getSession().getAttribute("RANDOMVALIDATECODEKEY");
            if (random == null) {
                 check=false;
                return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"注册码失效",check);
            }
            if (random.equals(inputStr)) {
                check= true;
                return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"校验通过",check);
            } else {
                check=false;
                return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"注册码格式不正确",check);
            }
        } catch (Exception e) {
            return RestResult.restFail(e.getMessage());
        }
    }


}

