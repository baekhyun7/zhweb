package com.zhweb.mapper;

import com.zhweb.entity.Article;
import com.zhweb.entity.ArticleShow;
import com.zhweb.entity.SysRole;
import com.zhweb.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  ArticleMapper 接口
 * </p>
 *
 * @author zh
 * @since 2018-12-17
 */
@Mapper
public interface ArticleMapper {
  /**
   * 查询文章列表
   * @return
   */
  List<ArticleShow> getArticleShowList();

  /**
   * 通过id查询文章
   * @param id
   * @return
   */
  ArticleShow getArticleShowById(String id);

  /**
   * 添加文章
   * @param article
   */
  void addArticle(Article article);

  /**
   * 阅读量+1
   * @param article
   */
  void readingAmountAddOne(Article article);

  /**
   * 点赞量+1
   * @param article
   */
  void praiseClicksAddOne(Article article);
}
