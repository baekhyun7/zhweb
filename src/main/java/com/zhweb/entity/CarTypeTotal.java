package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/3/24
 * @Description: 文章
 */
@Data
@ApiModel(value = "carType", description = "汽车类型")
public class CarTypeTotal {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "id", name = "id")
    private String typeId;

    @ApiModelProperty(value = "汽车品牌名", name = "name")
    private String name;

    @ApiModelProperty(value = "汽车总量", name = "total")
    private int total;

}
