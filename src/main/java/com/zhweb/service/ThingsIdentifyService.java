package com.zhweb.service;

import com.common.exception.BaseException;
import com.zhweb.entity.ResultInfo;

import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/1/23 0023 09:07
 * @Description:
 */

public interface ThingsIdentifyService {

    /**
     *
     * 功能描述: 植物识别
     *
     * @param: image 文件地址
     * @return:
     * @auther: ZH
     * @date: 2019/1/23 0023 9:07
     */
    List<ResultInfo> plantDetect(String image)throws BaseException;

    /**
     *
     * 功能描述: 动物识别
     *
     * @param: image 文件地址
     * @return:
     * @auther: ZH
     * @date: 2019/1/23
     */
    List<ResultInfo> animalDetect(String image)throws BaseException;

    /**
     *
     * 功能描述: 车辆识别
     *
     * @param: image 文件地址
     * @return:
     * @auther: ZH
     * @date: 2019/1/23 0023 14:31
     */
    List<ResultInfo> carDetect(String image)throws BaseException;

    /**
     *
     * 功能描述: 菜品识别
     *
     * @param: image 图片
     * @return:
     * @auther: ZH
     * @date: 2019/1/23 0023 14:41
     */
    List<ResultInfo> dishDetect(String image)throws BaseException;

    /**
     *
     * 功能描述: 通用识别
     *
     * @param: image 图片
     * @return:
     * @auther: ZH
     * @date: 2019/1/23 0023 14:58
     */
    List<ResultInfo> advancedGeneral(String image)throws BaseException;
}
