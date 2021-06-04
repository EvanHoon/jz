package com.briup.jz.service;

import com.briup.jz.bean.Comment;
import com.briup.jz.utils.CustomerException;

import java.util.List;

;

public interface ICommentService {

    void saveOrUpdate(Comment comment) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Comment> findAll();

    Comment findById(Long id);
}
