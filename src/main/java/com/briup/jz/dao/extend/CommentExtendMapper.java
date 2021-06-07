package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.Comment;

public interface CommentExtendMapper {
	List<Comment> selectByArticleId(long articleId);
}
