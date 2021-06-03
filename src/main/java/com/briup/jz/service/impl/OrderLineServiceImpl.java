package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.briup.jz.bean.OrderLine;
import com.briup.jz.bean.OrderLineExample;
import com.briup.jz.dao.OrderLineMapper;
import com.briup.jz.service.IOrderLineService;
import com.briup.jz.utils.CustomerException;

@Service
public class OrderLineServiceImpl implements IOrderLineService{
	
	@Autowired
	private OrderLineMapper orderLineMapper;
	
	@Override
	public void saveOrUpdate(OrderLine orderLine) throws CustomerException {
		if (orderLine.getId()!=null) {
			orderLineMapper.updateByPrimaryKey(orderLine);
		}else {
			orderLineMapper.insert(orderLine);
		}
		
	}

	@Override
	public void deleteById(Long id) throws CustomerException {
		OrderLine orderLine=orderLineMapper.selectByPrimaryKey(id);
		if(orderLine==null) {
			throw new CustomerException("要删除的分类信息不存在");
		}else {
			orderLineMapper.deleteByPrimaryKey(id);
		}			
	}

	@Override
	public List<OrderLine> findAll() {
		return orderLineMapper.selectByExample(new OrderLineExample());
	}

	@Override
	public OrderLine findById(Long id) {
		OrderLine orderLine=orderLineMapper.selectByPrimaryKey(id);
		if(orderLine==null) {
			throw new CustomerException("要查找的分类信息不存在");
		}
		return orderLine;
	}
}
