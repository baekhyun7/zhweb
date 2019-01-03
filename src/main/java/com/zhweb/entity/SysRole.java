package com.zhweb.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName SysRole
 * @Description TODO
 * @Author zh
 * @Data 12-23 21:29
 * @Version 1.0
 */
@Data
public class SysRole extends Model<SysRole> implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private String id;
    /**
     * 角色标识程序中判断使用,如"admin",这个是唯一的:
     */
    private String role;
    /**
     *  角色描述,UI界面显示使用
     */
    private String description;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
