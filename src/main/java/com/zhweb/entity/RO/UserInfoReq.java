package com.zhweb.entity.RO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
public class UserInfoReq {

    @ApiModelProperty(value="电话号码",name="telephone")
    private String telephone;

    @ApiModelProperty(value="qq",name="qq")
    private String qq;

    @ApiModelProperty(value="用户名",name="userName")
    private String userName;

    @ApiModelProperty(value="密码",name="password")
    private String password;

    @ApiModelProperty(value="性别",name="sex")
    private int sex;


}
