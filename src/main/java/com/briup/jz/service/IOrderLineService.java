package com.briup.jz.service;

import java.util.List;
import com.briup.jz.bean.OrderLine;
import com.briup.jz.utils.CustomerException;

public interface IOrderLineService {
	void saveOrUpdate(OrderLine orderLine) throws CustomerException;
	void deleteById(Long id) throws CustomerException;
	List<OrderLine> findAll();
	OrderLine findById(Long id);
}
