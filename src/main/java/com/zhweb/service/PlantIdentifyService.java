package com.zhweb.service;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.imageclassify.AipImageClassify;
import com.zhweb.config.BaiDuApiConfiguration;
import com.zhweb.entity.ResultInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @Author: ZH
 * @Date: 2019/1/22 0022 17:42
 * @Description:
 */
public class PlantIdentifyService {
    @Autowired
    private BaiDuApiConfiguration baiDuApiConfiguration;


    public void plantDetect(String image){
        AipImageClassify client = baiDuApiConfiguration.getClient();
        JSONObject jsonObject = client.plantDetect(image, new HashMap<>());
    }



}
