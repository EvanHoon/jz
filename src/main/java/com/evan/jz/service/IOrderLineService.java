package com.evan.jz.service;

import com.evan.jz.bean.OrderLine;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IOrderLineService {
    void saveOrUpdate(OrderLine orderLine) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<OrderLine> findAll();

    OrderLine findById(Long id);
}
