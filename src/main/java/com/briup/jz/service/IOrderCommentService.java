package com.briup.jz.service;

import com.briup.jz.bean.OrderComment;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IOrderCommentService {
    void saveOrUpdate(OrderComment orderComment) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<OrderComment> findAll();

    OrderComment findById(Long id);
}
