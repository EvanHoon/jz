package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.BaseUserRole;
import com.briup.jz.bean.BaseUserRoleExample;
import com.briup.jz.dao.BaseUserRoleMapper;
import com.briup.jz.service.IBaseUserRoleService;

import com.briup.jz.utils.CustomerException;

@Service
public class BaseUserRoleServiceImpl implements IBaseUserRoleService{

	@Autowired
	private BaseUserRoleMapper baseUserRoleMapper;
	@Override
	public void saveOrUpdate(BaseUserRole baseUserRole) throws CustomerException {
		if(baseUserRole.getId()!=null) {
			baseUserRoleMapper.updateByPrimaryKey(baseUserRole);
		} else {
			// 判断是否有同id，如果有抛出异常
			BaseUserRoleExample example = new BaseUserRoleExample();
			example.createCriteria().andIdEqualTo(baseUserRole.getId());
			List<BaseUserRole> list = baseUserRoleMapper.selectByExample(example);
			if(list.size()>0) {
				throw new CustomerException("相同id已存在");
			}
			baseUserRoleMapper.insert(baseUserRole);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		BaseUserRole baseUserRole =baseUserRoleMapper.selectByPrimaryKey(id);
		if(baseUserRole == null) {
			throw new CustomerException("要删除的id信息不存在");
		}
		baseUserRoleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<BaseUserRole> findAll() {
		return baseUserRoleMapper.selectByExample(new BaseUserRoleExample());
	}
	@Override
	public BaseUserRole findById(long id) {
		return  baseUserRoleMapper.selectByPrimaryKey(id);
	}
}
