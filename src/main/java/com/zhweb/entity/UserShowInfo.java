package com.zhweb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName UserShowInfo
 * @Description UserShowInfo
 * @Author zh
 * @Data 2019-3-22 15:52
 * @Version 1.0
 */
@Data
public class UserShowInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private String id;
    /**
     *账号.
     */
    private String userName;
    /**
     * 名称（昵称或者真实姓名，不同系统不同定义）
     */
    private String name;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 性别
     */
    private int sex;

    /**
     * qq
     */
    private String QQ;

    /**
     * 角色
     */
    private String role;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 角色描述
     */
    private String description;
}
