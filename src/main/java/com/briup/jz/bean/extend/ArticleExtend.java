package com.briup.jz.bean.extend;

import com.briup.jz.bean.Article;
import com.briup.jz.bean.Category;

//
public class ArticleExtend extends Article {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
}
