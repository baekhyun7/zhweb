package com.zhweb.service.impl;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.imageclassify.AipImageClassify;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.zhweb.config.BaiDuApiConfiguration;
import com.zhweb.entity.IdentifyResult;
import com.zhweb.entity.ResultInfo;
import com.zhweb.service.ThingsIdentifyService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/1/22 0022 17:42
 * @Description: ThingsIdentifyServiceImpl
 */
@Service
public class ThingsIdentifyServiceImpl implements ThingsIdentifyService {


    @Override
    public List<ResultInfo> plantDetect(String image)throws BaseException {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        JSONObject jsonObject = client.plantDetect(image, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();

    }

    @Override
    public List<ResultInfo> animalDetect(String image) throws BaseException {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        JSONObject jsonObject = client.animalDetect(image, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> carDetect(String image) throws BaseException {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        JSONObject jsonObject = client.carDetect(image, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> dishDetect(String image) throws BaseException {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        JSONObject jsonObject = client.dishDetect(image, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> advancedGeneral(String image) throws BaseException {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        JSONObject jsonObject = client.advancedGeneral(image, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }
}
