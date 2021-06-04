package com.briup.jz.service.impl;


import com.briup.jz.bean.Comment;
import com.briup.jz.bean.CommentExample;
import com.briup.jz.dao.CommentMapper;
import com.briup.jz.service.ICommentService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;


    @Override
    public void saveOrUpdate(Comment comment) throws CustomerException {
        if (comment.getId() != null) {
            commentMapper.updateByPrimaryKey(comment);
        } else {
            commentMapper.insert(comment);
        }
    }


    @Override
    public void deleteById(Long id) throws CustomerException {
        Comment comment = commentMapper.selectByPrimaryKey(id);
        if (comment == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        commentMapper.selectByPrimaryKey(id);

    }

    @Override
    public List<Comment> findAll() {
        return commentMapper.selectByExample(new CommentExample());
    }

    @Override
    public Comment findById(Long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

}
