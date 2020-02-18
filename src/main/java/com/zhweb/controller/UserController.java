package com.zhweb.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.DataGrid;
import com.common.web.entity.RestResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhweb.entity.RO.PageReq;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.UserInfo;
import com.zhweb.entity.UserShowInfo;
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

    @ApiOperation(value = "id", notes = "id")
    @GetMapping("/id")
    @ResponseBody
    public RestResult queryById(@RequestParam(value = "id") String id) {
            UserShowInfo query = userInfoService.queryById(id);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,query);
    }
    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/query")
    @ResponseBody
    public RestResult query(@RequestBody PageReq pageReq) {
        try {
            PageHelper.startPage(pageReq.getCurPage(), pageReq.getPageSize());
            List<UserShowInfo> query = userInfoService.query(pageReq.getUserName());
            PageInfo pageInfo = new PageInfo(query);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,new DataGrid<>(pageInfo.getTotal(),query)
            );
        } catch (BaseException e) {
            return RestResult.restFail("查询失败！");
        }

    }
    @ApiOperation(value = "deleteUser", notes = "deleteUser")
    @PostMapping("/deleteUser")
    @ResponseBody
    public RestResult deleteUser(@RequestBody List<String> ids) {
        try {
            userInfoService.deleteUser(ids);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"删除成功！");
        } catch (BaseException e) {
            return RestResult.restFail("删除失败！");
        }
    }

    @ApiOperation(value = "delete", notes = "delete")
    @PostMapping("/delete")
    @ResponseBody
    public RestResult delete(@RequestBody UserInfoConReq userInfoConReq) {
        try {
            userInfoService.delete(userInfoConReq.getId());
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"删除成功！");
        } catch (BaseException e) {
            return RestResult.restFail("删除失败！");
        }
    }

    @ApiOperation(value = "getRole", notes = "查询角色信息")
    @PostMapping("/getRole")
    @ResponseBody
    public RestResult getRole() {
        try {
            List<SysRole> role = userInfoService.getRole();
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"查询成功！",role);
        } catch (BaseException e) {
            return RestResult.restFail("查询失败！");
        }
    }

    @ApiOperation(value = "update", notes = "更新")
    @PostMapping("/update")
    @ResponseBody
    public RestResult update(@RequestBody UserInfoConReq userInfoConReq) {
        try {
            userInfoService.update(userInfoConReq);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"更新成功！");
        } catch (BaseException e) {
            return RestResult.restFail("更新失败！");
        }
    }

}

