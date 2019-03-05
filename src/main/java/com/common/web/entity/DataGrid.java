package com.common.web.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据
 * --object 修改为泛型 by:malei
 *
 * @author malei
 * @author 王赢方
 * @version 1.0.0
 * @date 2018/8/21
 */
public class DataGrid<T> {
    /**
     * 分页数据总条数
     */
    private int total;
    /**
     * 分页数据
     */
    private T items;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

    public DataGrid() {
    }

    public DataGrid(int total, T items) {
        super();
        this.total = total;
        this.items = items;
    }

    @Override
    public String toString() {
        return "DataGrid{" + "total=" + total + ", items=" + items + '}';
    }


}
