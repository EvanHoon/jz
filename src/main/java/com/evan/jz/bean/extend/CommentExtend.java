package com.evan.jz.bean.extend;

import com.evan.jz.bean.Article;
import com.evan.jz.bean.Comment;

public class CommentExtend extends Comment {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Article article;

		public Article getArticle() {
			return article;
		}

		public void setArticle(Article article) {
			this.article = article;
		}
	    
	}
