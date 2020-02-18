package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZH
 * @Date: 2019/1/22
 * @Description:
 */
@Data
@ApiModel(value = "CarSupply", description = "汽车供应商信息")
public class CarSupply implements Serializable {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "供应商名称", name = "name")
    private String name;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "电话号码", name = "telephone")
    private String telephone;

    @ApiModelProperty(value = "描述", name = "description")
    private String description;
}
