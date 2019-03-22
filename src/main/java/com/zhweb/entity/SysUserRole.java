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
public class SysUserRole  implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private String userId;
    /**
     * 角色
     */
    private String roleId;

}
