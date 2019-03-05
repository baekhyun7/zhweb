package com.zhweb.entity.RO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
public class PageReq {
    /**
     * 当前页码
     */
    @ApiModelProperty(value="当前页码",name="curPage")
    private int curPage;

    /**
     * 每页数据大小
     */
    @ApiModelProperty(value="每页数据大小",name="pageSize")
    private int pageSize;

    @ApiModelProperty(value="用户名",name="userName")
    private String userName;


}
