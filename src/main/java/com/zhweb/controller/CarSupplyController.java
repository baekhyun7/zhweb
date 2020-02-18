package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.DataGrid;
import com.common.web.entity.RestResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhweb.entity.*;
import com.zhweb.entity.RO.CarSupplyConReq;
import com.zhweb.entity.RO.CarSupplyReq;
import com.zhweb.entity.RO.PageReq;
import com.zhweb.entity.RO.UserInfoConReq;
import com.zhweb.service.CarSupplyService;
import com.zhweb.service.UserInfoService;
import com.zhweb.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** 供应商
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "CarSupplyController")
@Controller
@RequestMapping("/carSupply")
public class CarSupplyController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CarSupplyService carSupplyService;

    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/query")
    @ResponseBody
    public RestResult query(@RequestBody CarSupplyConReq pageReq) {
            PageHelper.startPage(pageReq.getCurPage(), pageReq.getPageSize());
            List<CarSupply> query = carSupplyService.query(pageReq);
            PageInfo pageInfo = new PageInfo(query);
            if(query.size()==0){
                return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"无供应商信息");
            }
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,new DataGrid<>(pageInfo.getTotal(),query));
    }
    @ApiOperation(value = "add", notes = "add")
    @PostMapping("/add")
    @ResponseBody
    public RestResult add(@RequestBody CarSupplyReq carSupply) {
        int add = carSupplyService.add(carSupply);
        if(add==0){
            return RestResult.restFail(CommonConstants.FAIL_RESPONSE_CODE,"供应商入库失败");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"供应商信息入库成功");
    }
    @ApiOperation(value = "update", notes = "update")
    @PostMapping("/update")
    @ResponseBody
    public RestResult update(@RequestBody CarSupplyReq carSupply) {
        int add = carSupplyService.update(carSupply);
        if(add==0){
            return RestResult.restFail(CommonConstants.FAIL_RESPONSE_CODE,"供应商入库修改失败");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"供应商信息修改成功");
    }
    @ApiOperation(value = "delete", notes = "delete")
    @PostMapping("/delete")
    @ResponseBody
    public RestResult delete(@RequestBody List<String> list) {
        int add = carSupplyService.deleteBatch(list);
        if(add!=list.size()){
            return RestResult.restFail(CommonConstants.FAIL_RESPONSE_CODE,"供应商入库删除失败");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"供应商信息删除成功");
    }
    @ApiOperation(value = "query", notes = "query")
    @PostMapping("/queryCarType")
    @ResponseBody
    public RestResult queryCarType() {
        List<CarType> add = carSupplyService.queryCarType();
        if(add==null || add.size()==0){
            return RestResult.restFail(CommonConstants.FAIL_RESPONSE_CODE,"汽车品牌不存在任何数据");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,add);
    }
    @ApiOperation(value = "queryCarTypeRel", notes = "queryCarTypeRel")
    @GetMapping("/queryCarTypeRel")
    @ResponseBody
    public RestResult queryCarTypeRel(@RequestParam String id) {
        List<CarTypeRel> add = carSupplyService.queryTypeNum(id);
        if(add==null || add.size()==0){
            return RestResult.restFail(CommonConstants.FAIL_RESPONSE_CODE,"不存在任何数据!");
        }
        return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,add);
    }

}

