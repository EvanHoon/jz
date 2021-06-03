package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Article;
import com.briup.jz.utils.CustomerException;

public interface IArticleService {
	 void saveOrUpdate(Article article) throws CustomerException;
	 
	 void deleteById(long id) throws CustomerException;
	 
	 
	 List<Article> findAll();
	  
	 Article findById(long id);
	  
	 
}
