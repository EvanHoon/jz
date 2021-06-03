package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.AccountApply;
import com.briup.jz.utils.CustomerException;

public interface IAccountApplyService {
	
void saveOrUpdate(AccountApply accountApply) throws CustomerException;
	
	List<AccountApply> findAll();
	
	AccountApply findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
 