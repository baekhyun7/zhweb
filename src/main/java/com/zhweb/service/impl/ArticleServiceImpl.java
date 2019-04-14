package com.zhweb.service.impl;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.imageclassify.AipImageClassify;
import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.zhweb.config.BaiDuApiConfiguration;
import com.zhweb.entity.Article;
import com.zhweb.entity.ArticleShow;
import com.zhweb.entity.IdentifyResult;
import com.zhweb.entity.RO.ArticleReq;
import com.zhweb.entity.ResultInfo;
import com.zhweb.mapper.ArticleMapper;
import com.zhweb.service.ArticleService;
import com.zhweb.service.ThingsIdentifyService;
import com.zhweb.util.FileUtil;
import com.zhweb.util.UUIDUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: ZH
 * @Date: 2019/3/24
 * @Description: ArticleServiceImpl
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleShow> getArticleShowList() throws BaseException {
        return articleMapper.getArticleShowList();
    }

    @Override
    public ArticleShow getArticleShow(String id) throws BaseException {
        ArticleShow articleShowById = articleMapper.getArticleShowById(id);
        Long readingAmount = articleShowById.getReadingAmount();
        Long readingAmountAddOne = readingAmount+1;
        Article article =new Article();
        article.setId(id);
        article.setReadingAmount(readingAmountAddOne);
        articleMapper.readingAmountAddOne(article);
        return articleMapper.getArticleShowById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addArticle(Article article) throws BaseException {
        String id = UUIDUtils.creatUUID();
        article.setId(id);
        article.setPraiseClicks(0L);
        article.setReadingAmount(0L);
        articleMapper.addArticle(article);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void readingAmountAddOne(ArticleReq articleReq) throws BaseException {
        String id = articleReq.getId();
        ArticleShow articleShowById = articleMapper.getArticleShowById(id);
        Long readingAmount = articleShowById.getReadingAmount();
        Long readingAmountAddOne = readingAmount+1;
        Article article =new Article();
        article.setId(id);
        article.setReadingAmount(readingAmountAddOne);
        articleMapper.readingAmountAddOne(article);
    }

    @Override
    public void praiseClicksAddOne(ArticleReq articleReq) throws BaseException {
        String id = articleReq.getId();
        ArticleShow articleShowById = articleMapper.getArticleShowById(id);
        Long praiseClicks = articleShowById.getPraiseClicks();
        Long praiseClicksAddOne = praiseClicks+1;
        Article article =new Article();
        article.setId(id);
        article.setPraiseClicks(praiseClicksAddOne);
        articleMapper.praiseClicksAddOne(article);
    }

    @Override
    public String uploadPicture(MultipartFile file) throws BaseException {
        return FileUtil.upload(file);
    }
}
