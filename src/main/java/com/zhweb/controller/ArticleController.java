package com.zhweb.controller;


import com.common.constants.CommonConstants;
import com.common.exception.BaseException;
import com.common.web.entity.DataGrid;
import com.common.web.entity.RestResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhweb.entity.Article;
import com.zhweb.entity.ArticleShow;
import com.zhweb.entity.MMovie;
import com.zhweb.entity.RO.ArticleReq;
import com.zhweb.entity.RO.PageReq;
import com.zhweb.entity.SysRole;
import com.zhweb.service.ArticleService;
import com.zhweb.service.MMovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 *
 * @author zh
 * @since 2018-12-17
 */
@Api(tags = "ArticleController的接口")
@RestController
@RequestMapping("/article")
public class ArticleController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ArticleService articleService;

    @ApiOperation(value = "getArticleShowList", notes = "查询文章列表")
    @PostMapping("/getArticleShowList")
    @ResponseBody
    public RestResult getArticleShowList(@RequestBody PageReq pageReq) {
        try {
            PageHelper.startPage(pageReq.getCurPage(),pageReq.getPageSize());
            List<ArticleShow> articleShowList = articleService.getArticleShowList();
            PageInfo pageInfo = new PageInfo(articleShowList);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"文章查询成功！",new DataGrid<>(pageInfo.getTotal(),articleShowList));
        } catch (BaseException e) {
            return RestResult.restFail("文章查询失败！");
        }
    }

    @ApiOperation(value = "getArticleShow", notes = "查询文章列表通过id")
    @PostMapping("/getArticleShowById")
    @ResponseBody
    public RestResult getArticleShowById(@RequestBody ArticleReq articleReq) {
        try {
            ArticleShow articleShow = articleService.getArticleShow(articleReq.getId());
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"文章查询成功！",articleShow);
        } catch (BaseException e) {
            return RestResult.restFail("文章查询失败！");
        }
    }

    @ApiOperation(value = "addArticle", notes = "添加文章列表")
    @PostMapping("/addArticle")
    @ResponseBody
    public RestResult addArticle(@RequestBody Article article) {
        try {
            articleService.addArticle(article);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"文章添加成功！");
        } catch (BaseException e) {
            return RestResult.restFail("文章添加失败！");
        }
    }
    @ApiOperation(value = "praiseClicksAddOne", notes = "文章点赞")
    @PostMapping("/praiseClicksAddOne")
    @ResponseBody
        public RestResult praiseClicksAddOne(@RequestBody ArticleReq articleReq) {
        try {
            articleService.praiseClicksAddOne(articleReq);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"文章点赞成功！");
        } catch (BaseException e) {
            return RestResult.restFail("文章点赞失败！");
        }
    }
    @ApiOperation(value = "upload", notes = "上传图片")
    @PostMapping("/uploadPicture")
    @ResponseBody
    public RestResult uploadPicture(@RequestParam MultipartFile file) {
        try {
            String s = articleService.uploadPicture(file);
            return RestResult.restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE,"上传图片成功！",s);
        } catch (BaseException e) {
            return RestResult.restFail("上传图片失败！");
        }
    }


}

