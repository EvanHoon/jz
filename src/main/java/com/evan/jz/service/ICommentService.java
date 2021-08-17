package com.evan.jz.service;

import com.evan.jz.bean.Comment;
import com.evan.jz.utils.CustomerException;

import java.util.List;

;

public interface ICommentService {

    void saveOrUpdate(Comment comment) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Comment> findAll();

    Comment findById(Long id);
}
