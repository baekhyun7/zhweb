package com.zhweb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: ZH
 * @Date: 2019/3/24
 * @Description: 文章
 */
@Data
@ApiModel(value = "article", description = "文章")
public class Article {

    @ApiModelProperty(value = "id", name = "id")
    private String id;

    @ApiModelProperty(value = "创建该文章的用户id", name = "createdUserId")
    private String createdUserId;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "正文", name = "content")
    private String content;

    @ApiModelProperty(value = "阅读量", name = "readingAmount")
    private Long readingAmount;

    @ApiModelProperty(value = "点赞量", name = "praiseClicks")
    private Long praiseClicks;

    @ApiModelProperty(value = "是否删除", name = "deleted")
    private int deleted;

    @ApiModelProperty(value = "是否原创", name = "original ")
    private int original;

    @ApiModelProperty(value = "创建时间", name = "createTime ")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime=new Date();

    @ApiModelProperty(value = "更新时间", name = "updateTime ")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime=new Date();
}
