package com.zhweb.entity.RO;

import com.common.web.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
public class UserInfoReq extends BaseEntity{

    @ApiModelProperty(value="电话号码",name="telephone")
    private String telephone;

    @ApiModelProperty(value="地址",name="address")
    private String address;

    @ApiModelProperty(value="qq",name="qq")
    private String qq;

    @ApiModelProperty(value="用户名",name="userName")
    private String userName;

    @ApiModelProperty(value="密码",name="password")
    private String password;
}
