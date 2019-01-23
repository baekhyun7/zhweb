package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/23 0023 10:35
 * @Description:
 */
@Data
@ApiModel(value = "BaikeInfo", description = "百度百科信息")
public class BaikeInfo {

    @ApiModelProperty(value = "百度百科地址",name = "baikeUrl")
    private String baikeUrl;

    @ApiModelProperty(value = "图片地址",name = "imageUrl")
    private String imageUrl;

    @ApiModelProperty(value = "描述",name = "description")
    private String description;
}
