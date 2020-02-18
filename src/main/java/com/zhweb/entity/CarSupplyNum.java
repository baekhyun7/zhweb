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
@ApiModel(value = "CarSupplyNum", description = "汽车厂商库存")
public class CarSupplyNum {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "supplyId", name = "supplyId")
    private String supplyId;

    @ApiModelProperty(value = "汽车品牌名", name = "name")
    private String name;

    @ApiModelProperty(value = "汽车库存量", name = "num")
    private int num;
}
