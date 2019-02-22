package com.zhweb.controller;

import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.RestResult;
import com.zhweb.entity.ResultInfo;
import com.zhweb.service.ThingsIdentifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/1/23 0023 09:47
 * @Description:
 */
@Api(tags = "thingsIdentify的接口")
@RestController
@RequestMapping("/thingsIdentify")
public class ThingsIdentifyController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ThingsIdentifyService thingsIdentifyService;

    @ApiOperation(value = "plantDetect", notes = "plantDetect")
    @PostMapping("/plantDetect")
    public RestResult<List<ResultInfo>> plantDetect(@RequestParam byte[] image){
        List<ResultInfo> resultInfos = null;
        try {
            resultInfos = thingsIdentifyService.plantDetect(image);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,resultInfos);
        } catch (BaseException e) {
            logger.error(e.getMessage());
            return RestResult.restFail("植物识别出现异常");
            }
    }

    @ApiOperation(value = "animalDetect", notes = "animalDetect")
    @PostMapping("/animalDetect")
    public RestResult<List<ResultInfo>> animalDetect(@RequestParam byte[] image){
        List<ResultInfo> resultInfos = null;
        try {
            resultInfos = thingsIdentifyService.animalDetect(image);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,resultInfos);
        } catch (BaseException e) {
            logger.error(e.getMessage());
            return RestResult.restFail("动物识别出现异常");
        }
    }

    @ApiOperation(value = "carDetect", notes = "carDetect")
    @PostMapping("/carDetect")
    public RestResult<List<ResultInfo>> carDetect(@RequestParam byte[] image){
        List<ResultInfo> resultInfos = null;
        try {
            resultInfos = thingsIdentifyService.carDetect(image);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,resultInfos);
        } catch (BaseException e) {
            logger.error(e.getMessage());
            return RestResult.restFail("车牌识别出现异常");
        }
    }

    @ApiOperation(value = "dishDetect", notes = "dishDetect")
    @PostMapping("/dishDetect")
    public RestResult<List<ResultInfo>> dishDetect(@RequestParam byte[] image){
        List<ResultInfo> resultInfos = null;
        try {
            resultInfos = thingsIdentifyService.dishDetect(image);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,resultInfos);
        } catch (BaseException e) {
            logger.error(e.getMessage());
            return RestResult.restFail("菜品识别出现异常");
        }
    }

    @ApiOperation(value = "advancedGeneral", notes = "advancedGeneral")
    @PostMapping("/advancedGeneral")
    public RestResult<List<ResultInfo>> advancedGeneral(@RequestParam MultipartFile file){
        List<ResultInfo> resultInfos = null;
        try {
            resultInfos = thingsIdentifyService.advancedGeneral(file);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,resultInfos);
        } catch (BaseException e) {
            logger.error(e.getMessage());
            return RestResult.restFail("通用物品识别出现异常");
        } catch (Exception e) {
            return RestResult.restFail("通用物品识别出现异常");
        }
    }
}
