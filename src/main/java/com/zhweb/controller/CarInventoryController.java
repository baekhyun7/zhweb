package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.DataGrid;
import com.common.web.entity.RestResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarInventoryConReq;
import com.zhweb.entity.RO.PageReq;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.service.CarInventoryService;
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
@Api(tags = "CarInventoryController的接口")
@Controller
@RequestMapping("/carInventory")
public class CarInventoryController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarInventoryService carInventoryService;

    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/query")
    @ResponseBody
    public RestResult query(@RequestBody CarInventoryConReq pageReq) {
            PageHelper.startPage(pageReq.getCurPage(), pageReq.getPageSize());
            List<CarTypeTotal> query = carInventoryService.query(pageReq.getName());
            if(query.size()==0){
                return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"无任何信息");
            }
            PageInfo pageInfo = new PageInfo(query);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,new DataGrid<>(pageInfo.getTotal(),query));
    }
    @ApiOperation(value = "queryCarSupplyNum", notes = "queryCarSupplyNum")
    @GetMapping("/queryCarSupplyNum")
    @ResponseBody
    public RestResult queryCarSupplyNum(@RequestParam String typeId) {
        List<CarSupplyNum> query = carInventoryService.queryCarSupplyNum(typeId);
        if(query.size()==0){
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"无任何信息");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,query);
    }
    @ApiOperation(value = "update", notes = "update")
    @GetMapping("/update")
    @ResponseBody
    public RestResult update(CarTypeRel carTypeRel) {
        int i = carInventoryService.update(carTypeRel);
        if(i==0){
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"更新失败");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"更新成功");
    }

}

