package com.zhweb.service.impl;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.imageclassify.AipImageClassify;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.zhweb.config.BaiDuApiConfiguration;
import com.zhweb.entity.IdentifyResult;
import com.zhweb.entity.ResultInfo;
import com.zhweb.service.ThingsIdentifyService;
import com.zhweb.util.ImageDeFogUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
    public List<ResultInfo> plantDetect(MultipartFile image)throws Exception {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        byte[] bytes = image.getBytes();
        JSONObject jsonObject = client.plantDetect(bytes, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();

    }

    @Override
    public List<ResultInfo> animalDetect(MultipartFile image) throws Exception {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        byte[] bytes = image.getBytes();
        //图像去雾
        ImageDeFogUtil.imageDeFog(bytes);

        JSONObject jsonObject = client.animalDetect(bytes, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> carDetect(MultipartFile image) throws Exception {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        byte[] bytes = image.getBytes();
        JSONObject jsonObject = client.carDetect(bytes, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> dishDetect(MultipartFile image) throws Exception {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        byte[] bytes = image.getBytes();
        JSONObject jsonObject = client.dishDetect(bytes, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }

    @Override
    public List<ResultInfo> advancedGeneral(MultipartFile image) throws Exception {
        AipImageClassify client = BaiDuApiConfiguration.getClient();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put(CommonConstants.BAIKE_INFO, "5");
        byte[] bytes = image.getBytes();
        JSONObject jsonObject = client.advancedGeneral(bytes, options);
        IdentifyResult identifyResult = JSON.parseObject(jsonObject.toString(2), IdentifyResult.class);
        return identifyResult.getResult();
    }
}
