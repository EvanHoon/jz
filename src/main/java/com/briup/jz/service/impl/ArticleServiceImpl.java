package com.briup.jz.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.Article;
import com.briup.jz.bean.ArticleExample;
import com.briup.jz.bean.ArticleExample.Criteria;
import com.briup.jz.bean.ArticleExample.Criterion;
import com.briup.jz.bean.extend.ArticleExtend;
import com.briup.jz.dao.ArticleMapper;
import com.briup.jz.dao.extend.ArticleExtendMapper;
import com.briup.jz.service.IArticleService;

@Service
public class ArticleServiceImpl implements IArticleService {
	
	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private ArticleExtendMapper articleExtendMapper;

	@Override
	public List<Article> query(String title, String status, Long categoryId) {
		// 模板查询，
		ArticleExample example = new ArticleExample();
		Criteria criteria = example.createCriteria();
		// 多条件符合查询
		if(title != null) {
			criteria.andTitleLike("%"+title+"%");
		}
		if(status != null) {
			criteria.andStatusEqualTo(status);
		}
		if(categoryId != null) {
			System.out.println("categoryId:"+categoryId);
			criteria.andCategoryIdEqualTo(categoryId);
		}
		List<Criterion> cs =  criteria.getAllCriteria();
		System.out.println("条件：");
		for(Criterion c : cs) {
			System.out.println(c.getCondition()+"="+c.getValue());
		}
		// 返回查询结果
		return articleMapper.selectByExample(example);
	}

	@Override
	public void saveOrUpdate(Article article) {
		if(article.getId() == null) {
			// 初始化
			article.setPublishTime(new Date().getTime());
			article.setReadTimes(0l);
			article.setThumpUp(0l);
			article.setStatus("未审核");
			articleMapper.insert(article);
		} else {
			articleMapper.updateByPrimaryKey(article);
		}
	}

	@Override
	public List<ArticleExtend> queryCascade(String title, String status, Long categoryId) {
		return articleExtendMapper.select(title, status, categoryId);
	}

}
