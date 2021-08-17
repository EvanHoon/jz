package com.evan.jz.service;

import java.util.List;

import com.evan.jz.bean.Article;
import com.evan.jz.bean.extend.ArticleExtend;
import com.evan.jz.utils.CustomerException;

public interface IArticleService {
	List<ArticleExtend> queryCascade(String title, String status, Long categoryId);
	
	List<Article> query(String title,String status,Long categoryId);
	
	void saveOrUpdate(Article article);

	ArticleExtend read(Long id);
	
	void deleteById(Long id) throws CustomerException;
}
