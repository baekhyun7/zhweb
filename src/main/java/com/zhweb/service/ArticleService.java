package com.zhweb.service;

import com.common.exception.BaseException;
import com.zhweb.entity.Article;
import com.zhweb.entity.ArticleShow;
import com.zhweb.entity.RO.ArticleReq;
import com.zhweb.entity.ResultInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/3/24 0023 09:07
 * @Description:
 */

public interface ArticleService {

    /**
     * 查询文章列表
     * @return
     */
    List<ArticleShow> getArticleShowList() throws BaseException;

    /**
     * 查询文章列表
     * @return
     */
    ArticleShow getArticleShow(String id) throws BaseException;

    /**
     * 添加文章
     * @param article
     * @throws BaseException
     */
    void addArticle(Article article) throws  BaseException;

    /**
     * 阅读量加一
     * @param articleReq
     * @throws BaseException
     */
    void readingAmountAddOne(ArticleReq articleReq) throws  BaseException;

    /**
     * 点赞量加一
     * @param articleReq
     * @throws BaseException
     */
    void praiseClicksAddOne(ArticleReq articleReq) throws  BaseException;
}
