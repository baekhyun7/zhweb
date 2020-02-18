package com.zhweb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: ZH
 * @Date: 2019/3/24
 * @Description: 文章
 */
@Data
@ApiModel(value = "CarTypeRel", description = "文章")
public class CarTypeRel {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "supplyId", name = "供应商id")
    private String supplyId;

    @ApiModelProperty(value = "id", name = "品牌id")
    private String carType;

    @ApiModelProperty(value = "num", name = "数量")
    private int num;


}
