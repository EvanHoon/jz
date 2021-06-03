package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.Article;
import com.briup.jz.bean.ArticleExample;
import com.briup.jz.dao.ArticleMapper;
import com.briup.jz.service.IArticleService;
import com.briup.jz.utils.CustomerException;
@Service
public class ArticleServiceImpl implements IArticleService{

	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public void saveOrUpdate(Article article) throws CustomerException {
		if(article.getId()!=null) {
			articleMapper.updateByPrimaryKey(article);
		} else {
			// 判断是否有同id，如果有抛出异常
			ArticleExample example = new ArticleExample();
			example.createCriteria().andIdEqualTo(article.getId());
			List<Article> list = articleMapper.selectByExample(example);
			if(list.size()>0) {
				throw new CustomerException("相同id已存在");
			}
			articleMapper.insert(article);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		Article article =articleMapper.selectByPrimaryKey(id);
		if(article == null) {
			throw new CustomerException("要删除的分类信息不存在");
		}
		articleMapper.deleteByPrimaryKey(id);
	}

	

	@Override
	public List<Article> findAll() {
		return articleMapper.selectByExample(new ArticleExample());
	}

	@Override
	public Article findById(long id) {
		return  articleMapper.selectByPrimaryKey(id);
	}

}
