package com.zhweb.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
public class MMovie extends Model<MMovie> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Date time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MMovie{" +
        ", id=" + id +
        ", name=" + name +
        ", time=" + time +
        "}";
    }
}
