package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.utils.CustomerException;

public interface IBaseUserService {
	void saveOrUpdate(BaseUser baseUser) throws CustomerException;

	
	void deleteById(long id) throws CustomerException;
	
	List<BaseUser> findAll();
	
	BaseUser findById(long id);
}
