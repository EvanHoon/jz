package com.briup.jz.service;

import com.briup.jz.bean.Order;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IOrderService {
    void saveOrUpdate(Order order) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Order> findAll();

    Order findById(Long id);
}
