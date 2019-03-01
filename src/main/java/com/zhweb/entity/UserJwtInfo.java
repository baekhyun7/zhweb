package com.zhweb.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName UserInfo
 * @Description TODO
 * @Author zh
 * @Data 2018-12-23 21:19
 * @Version 1.0
 */
@Data
public class UserJwtInfo  implements Serializable{
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
     * 密码
     */
    private String password;

    /**
     * 角色
     */
    private String role;

    /**
     * 权限
     */
    private String permission;

}
