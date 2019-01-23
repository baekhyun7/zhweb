package com.zhweb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/1/23 0023 09:10
 * @Description:
 */
@Data
@ApiModel(value = "ResultInfo", description = "检验结果类接受实体")
public class IdentifyResult {

    @ApiModelProperty(value = "结果", name = "result")
    private List<ResultInfo> result;
}
