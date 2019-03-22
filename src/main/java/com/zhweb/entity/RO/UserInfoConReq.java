package com.zhweb.entity.RO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
public class UserInfoConReq {

    @ApiModelProperty(value="id",name="id")
    private String id;

    @ApiModelProperty(value="电话号码",name="telephone")
    private String telephone;

    @ApiModelProperty(value="qq",name="qq")
    private String qq;

    @ApiModelProperty(value="用户名",name="userName")
    private String userName;

    @ApiModelProperty(value="用户名",name="name")
    private String name;

    @ApiModelProperty(value="性别",name="sex")
    private int sex;

    @ApiModelProperty(value="这里用作role的id",name="description")
    private String description;

    @ApiModelProperty(value="这里用作role的id",name="description")
    private String roleId;
}
