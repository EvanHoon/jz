package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.OrderComment;
import com.briup.jz.bean.OrderCommentExample;
import com.briup.jz.bean.OrderLine;
import com.briup.jz.dao.OrderCommentMapper;
import com.briup.jz.service.IOrderCommentService;
import com.briup.jz.utils.CustomerException;

@Service
public class OrderCommentServiceImpl implements IOrderCommentService{
	
	@Autowired
	private OrderCommentMapper orderCommentMapper;

	@Override
	public void saveOrUpdate(OrderComment orderComment) throws CustomerException {
		if(orderComment.getId()!=null) {
			orderCommentMapper.updateByPrimaryKey(orderComment);
		}else {
			orderCommentMapper.insert(orderComment);
		}
	}

	@Override
	public void deleteById(Long id) throws CustomerException {
		OrderComment orderComment=orderCommentMapper.selectByPrimaryKey(id);
		if(orderComment==null) {
			throw new CustomerException("要删除的分类信息不存在");
		}else {
			orderCommentMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public List<OrderComment> findAll() {
		return orderCommentMapper.selectByExample(new OrderCommentExample());
	}

	@Override
	public OrderComment findById(Long id) {
		OrderComment orderComment=orderCommentMapper.selectByPrimaryKey(id);
		if(orderComment==null) {
			throw new CustomerException("要查找的分类信息不存在");
		}
		return orderComment;
	}
}
