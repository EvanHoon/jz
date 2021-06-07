package com.briup.jz.bean.extend;

import java.util.List;

import com.briup.jz.bean.Article;
import com.briup.jz.bean.BaseUser;
import com.briup.jz.bean.Category;
import com.briup.jz.bean.Comment;

//
public class ArticleExtend extends Article {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Category category;
	private BaseUser author;
	private List<Comment> comments;

	public BaseUser getAuthor() {
		return author;
	}

	public void setAuthor(BaseUser author) {
		this.author = author;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
}
