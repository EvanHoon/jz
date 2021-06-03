package com.briup.jz.service;

import java.util.List;
import com.briup.jz.bean.Order;
import com.briup.jz.utils.CustomerException;

public interface IOrderService {
	void saveOrUpdate(Order order) throws CustomerException;
	void deleteById(Long id) throws CustomerException;
	List<Order> findAll();
	Order findById(Long id);
}
