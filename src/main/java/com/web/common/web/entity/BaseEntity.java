package com.web.common.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 /**
  * 功能描述： 公共实体类
  * @author 张浩
  * @date 2018/12/19 21:51
  * @version 1.0
  */

public class BaseEntity implements Entity{

    private static final long serialVersionUID = 3338825286128845567L;

    /**
     * 当前页码
     */
    @ApiModelProperty(value="当前页码",name="curPage")
    private int curPage=1;
    
    /**
     * 每页数据大小
     */
    @ApiModelProperty(value="每页数据大小",name="pageSize")
    private int pageSize=10;
    
    /**
     * 主键数据ID
     */
    @ApiModelProperty(value="主键id,编辑时用",name="id")
    @Length(max=64)
    private String id;
    
    /**
     * 主键数据ID集合
     */
    @ApiModelProperty(hidden=false)
    private List<String> idList;
    
    /**
     * 操作用户id
     */
    @ApiModelProperty(hidden=true)
    private String userId;
    
    /**
     * 操作用户名称
     */
    @ApiModelProperty(hidden=true)
    private String userName;
    
    /**
     * 创建时间
     */
    @ApiModelProperty(hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime=new Date();
    
    /**
     * 更新时间
     */
    @ApiModelProperty(hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime=new Date();
    
    /**
     * 扩展数据信息
     */
    @ApiModelProperty(hidden=true)
    private Map<String , Object> paramMap = new HashMap<>();
    
    @Override
    public int getCurPage() {
        return curPage;
    }

    @Override
    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Map<String, Object> getParamMap() {
        return paramMap;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getUpdateTime() {
		return updateTime;
	}

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Date getCreateTime() {
		return createTime;
	}

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    @Override
	public void setParamMap(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    @Override
    public String toString() {
        return "BaseEntity [curPage=" + curPage + ", pageSize=" + pageSize + ", id=" + id + ", userId=" + userId
                + ", userName=" + userName + ", createTime=" + createTime + ", updateTime=" + updateTime + ", paramMap=" + paramMap + "]";
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }
    
}

