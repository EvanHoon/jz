package com.evan.jz.service;

import com.evan.jz.bean.Order;
import com.evan.jz.bean.extend.OrderExtend;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IOrderService {
    void saveOrUpdate(Order order) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Order> findAll();

    Order findById(Long id);
    
    OrderExtend selectCascade(Long id);
}
