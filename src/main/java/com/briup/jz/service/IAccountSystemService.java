package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.AccountSystem;
import com.briup.jz.utils.CustomerException;

public interface IAccountSystemService {
void saveOrUpdate(AccountSystem accountSystem) throws CustomerException;
	
	List<AccountSystem> findAll();
	
	AccountSystem findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
