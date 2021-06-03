package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.BaseUserRole;
import com.briup.jz.utils.CustomerException;

public interface IBaseUserRoleService {
	void saveOrUpdate(BaseUserRole baseUserRole) throws CustomerException;

	
	void deleteById(long id) throws CustomerException;
	
	List<BaseUserRole> findAll();
	
	BaseUserRole findById(long id);
}
