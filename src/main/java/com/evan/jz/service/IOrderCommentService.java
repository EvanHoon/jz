package com.evan.jz.service;

import com.evan.jz.bean.OrderComment;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IOrderCommentService {
    void saveOrUpdate(OrderComment orderComment) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<OrderComment> findAll();

    OrderComment findById(Long id);
}
