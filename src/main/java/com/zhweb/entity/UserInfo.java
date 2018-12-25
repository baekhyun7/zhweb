package com.zhweb.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import org.apache.ibatis.mapping.FetchType;

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
public class UserInfo extends Model<MMovie> implements Serializable{
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
     * 加密密码的盐
     */
    private String salt;

    /**
    用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
     */
    private byte state;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.userName+this.salt;
    }
}
