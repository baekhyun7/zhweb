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
@ApiModel(value = "carType", description = "汽车类型")
public class CarType {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "汽车品牌名", name = "name")
    private String name;
}
