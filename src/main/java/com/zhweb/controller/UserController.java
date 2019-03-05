package com.zhweb.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.DataGrid;
import com.common.web.entity.RestResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhweb.entity.RO.PageReq;
import com.zhweb.entity.UserInfo;
import com.zhweb.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "UserController的接口")
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoService userInfoService;


    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/query")
    @ResponseBody
    public RestResult query(@RequestBody PageReq pageReq) {
        try {
            PageHelper.startPage(pageReq.getCurPage(), pageReq.getPageSize());
            List<UserInfo> query = userInfoService.query(pageReq.getUserName());
            PageInfo pageInfo = new PageInfo(query);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,new DataGrid<>(pageInfo.getTotal(),query)
            );
        } catch (BaseException e) {
            return RestResult.restFail("查询失败！");
        }

    }

}

