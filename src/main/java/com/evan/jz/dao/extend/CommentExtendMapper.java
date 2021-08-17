package com.evan.jz.dao.extend;

import java.util.List;

import com.evan.jz.bean.Comment;

public interface CommentExtendMapper {
	List<Comment> selectByArticleId(long articleId);
}
