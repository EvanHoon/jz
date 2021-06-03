package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.OrderComment;
import com.briup.jz.utils.CustomerException;

public interface IOrderCommentService {
	void saveOrUpdate(OrderComment orderComment) throws CustomerException;
	void deleteById(Long id) throws CustomerException;
	List<OrderComment> findAll();
	OrderComment findById(Long id);
}
