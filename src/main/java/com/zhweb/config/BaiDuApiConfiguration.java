package com.zhweb.config;

import com.baidu.aip.imageclassify.AipImageClassify;

/**
 * @Author: ZH
 * @Date: 2019/1/22 0022 17:29
 * @Description:
 */
public class BaiDuApiConfiguration {

    //设置APPID/AK/SK
    public static final String APP_ID = "15323474";
    public static final String API_KEY = "Q1Fi4BTITp5waRZ7ETeZLpLf";
    public static final String SECRET_KEY = "mIXs938d6FmwvbXNIECL5NTRcg0l9B8V";

    public static AipImageClassify getClient(){
        // 初始化一个AipImageClassifyClient
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        return client;

    }
}
