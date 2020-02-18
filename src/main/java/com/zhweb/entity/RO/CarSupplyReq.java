package com.zhweb.entity.RO;

import com.zhweb.entity.CarSupply;
import com.zhweb.entity.CarTypeRel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
public class CarSupplyReq extends CarSupply {

    @ApiModelProperty(value = "carTypeNums", name = "数组")
    private List<CarTypeRel> carTypeNums;

    @ApiModelProperty(value="当前页码",name="curPage")
    private int curPage;

    /**
     * 每页数据大小
     */
    @ApiModelProperty(value="每页数据大小",name="pageSize")
    private int pageSize;
}
