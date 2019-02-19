package com.zhweb.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

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
public class SysPermission extends Model<SysPermission> implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 资源类型
     */
    private String resourceType;
    /**
     * 资源路径
     */
    private String url;
    /**
     * 权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
     */
    private String permission;
    /**
     * 父编号
     */
    private Long parentId;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
