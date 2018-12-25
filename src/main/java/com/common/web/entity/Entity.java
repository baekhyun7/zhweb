package com.common.web.entity;

import java.io.Serializable;
import java.util.Map;

public interface Entity extends Serializable{

    public int getCurPage() ;

    public void setCurPage(int curPage) ;

    public int getPageSize();

    public void setPageSize(int pageSize);

    public String getId() ;

    public void setId(String id);

    public Map<String, Object> getParamMap() ;

    public void setParamMap(Map<String, Object> paramMap) ;
   
}
