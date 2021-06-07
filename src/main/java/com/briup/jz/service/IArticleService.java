package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Article;
import com.briup.jz.bean.extend.ArticleExtend;

public interface IArticleService {
	List<ArticleExtend> queryCascade(String title,String status,Long categoryId);
	
	List<Article> query(String title,String status,Long categoryId);
	
	void saveOrUpdate(Article article);

	ArticleExtend read(Long id);
}
