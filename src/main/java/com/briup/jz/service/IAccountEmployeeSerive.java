package com.briup.jz.service;

import java.util.List;
import com.briup.jz.bean.AccountEmployee;
import com.briup.jz.utils.CustomerException;

public interface IAccountEmployeeSerive {
void saveOrUpdate(AccountEmployee accountEmployee) throws CustomerException;
	
	List<AccountEmployee> findAll();
	
	AccountEmployee findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
