package com.zhweb.entity;

import com.common.web.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:07
 * @Description:
 */
@Data
@ApiModel(value = "UserInfoMore", description = "用户的更多信息")
public class UserInfoMore extends BaseEntity{

    @ApiModelProperty(value="电话号码",name="telephone")
    private String telephone;

    @ApiModelProperty(value="性别",name="sex")
    private int sex;

    @ApiModelProperty(value="qq",name="qq")
    private String qq;


}
