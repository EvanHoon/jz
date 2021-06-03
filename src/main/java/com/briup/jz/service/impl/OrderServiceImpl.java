package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.Order;
import com.briup.jz.bean.OrderExample;
import com.briup.jz.dao.OrderMapper;
import com.briup.jz.service.IOrderService;
import com.briup.jz.utils.CustomerException;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private OrderMapper orderMapper;	
	
	@Override
	public void saveOrUpdate(Order order) throws CustomerException {
		if (order.getId()!=null) {
			orderMapper.updateByPrimaryKey(order);
		}else {
			orderMapper.insert(order);
		}
		
	}

	@Override
	public void deleteById(Long id) throws CustomerException {
		Order order=orderMapper.selectByPrimaryKey(id);
		if(order==null) {
			throw new CustomerException("要删除的分类信息不存在");
		}else {
			orderMapper.deleteByPrimaryKey(id);
		}		
	}

	@Override
	public List<Order> findAll() {
		return orderMapper.selectByExample(new OrderExample());
	}

	@Override
	public Order findById(Long id) {
		Order order=orderMapper.selectByPrimaryKey(id);
		if(order==null) {
			throw new CustomerException("要查找的分类信息不存在");
		}
		return order;
	}
}
