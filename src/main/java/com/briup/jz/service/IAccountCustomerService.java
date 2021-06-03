package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.AccountCustomer;
import com.briup.jz.utils.CustomerException;

public interface IAccountCustomerService {
void saveOrUpdate(AccountCustomer accountCustomer) throws CustomerException;
	
	List<AccountCustomer> findAll();
	
	AccountCustomer findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
