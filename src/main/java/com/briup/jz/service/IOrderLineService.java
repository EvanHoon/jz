package com.briup.jz.service;

import com.briup.jz.bean.OrderLine;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IOrderLineService {
    void saveOrUpdate(OrderLine orderLine) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<OrderLine> findAll();

    OrderLine findById(Long id);
}
