package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/22 0022 18:15
 * @Description:
 */
@Data
@ApiModel(value = "ResultInfo", description = "检验结果类")
public class ResultInfo {

    @ApiModelProperty(value = "概率", name = "score")
    private double score;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;
}
