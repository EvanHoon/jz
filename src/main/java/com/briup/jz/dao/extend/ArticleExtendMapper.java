package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.extend.ArticleExtend;

 public interface ArticleExtendMapper {

	List<ArticleExtend> select(String title,String status,Long categoryId);
	ArticleExtend selectById(Long id);
}
