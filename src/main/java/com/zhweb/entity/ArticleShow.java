package com.zhweb.entity;

import lombok.Data;

import java.util.Date;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName ArticleShow
 * @Description ArticleShow
 * @Author zh
 * @Data 3.24 14:01
 * @Version 1.0
 */
@Data
public class ArticleShow {
    private String id;

    /**
     * 创建该文章的用户id
     */
    private String createdUserId;

    /**
     * 创建该文章的用户名
     */
    private String createdUsername;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    private String content;

    /**
     * 阅读量
     */
    private Long readingAmount;

    /**
     * 点赞量
     */
    private Long praiseClicks;

    /**
     * 是否原创
     */
    private Boolean original;

    /**
     * 原作者id
     */
    private String originalAuthorId;

    /**
     * 原作者用户名
     */
    private String originalAuthorUsername;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
