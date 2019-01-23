package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/22
 * @Description:
 */
@Data
@ApiModel(value = "ResultInfo", description = "检验结果类")
public class ResultInfo {

    @ApiModelProperty(value = "概率", name = "score")
    private float score;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;

    @ApiModelProperty(value = "年份", name = "year")
    private String year;

    @ApiModelProperty(value = "卡路里", name = "calorie")
    private float calorie;

    @ApiModelProperty(value = "概率(用于菜品识别)", name = "score")
    private float probability;

    @ApiModelProperty(value = "是否含有卡路里", name = "hasCalorie")
    private boolean hasCalorie;

    @ApiModelProperty(value = "识别结果的上层标签，有部分钱币、动漫、烟酒等tag无上层标签", name = "root")
    private String root;

    @ApiModelProperty(value = "图片中的物体或场景名称", name = "keyword ")
    private String keyword;

    @ApiModelProperty(value = "百度百科信息", name = "baikeInfo")
    private BaikeInfo baikeInfo;
}
