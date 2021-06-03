package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.AccountCustomer;
import com.briup.jz.bean.AccountCustomerExample;
import com.briup.jz.dao.AccountCustomerMapper;
import com.briup.jz.service.IAccountCustomerService;
import com.briup.jz.utils.CustomerException;
@Service
public class AccountCustomerServiceImpl implements IAccountCustomerService{
	@Autowired
	private AccountCustomerMapper accountCustomerMapper;

	@Override
	public void saveOrUpdate(AccountCustomer accountCustomer) throws CustomerException {
		if(accountCustomer.getId()==null) {
			accountCustomerMapper.insert(accountCustomer);
		}else {
			accountCustomerMapper.updateByPrimaryKey(accountCustomer);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		AccountCustomer accountCustomer = accountCustomerMapper.selectByPrimaryKey(id);
		if(accountCustomer == null) {
			throw new CustomerException("要删除的分类信息不存在");
		}
		accountCustomerMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<AccountCustomer> findAll() {
		return accountCustomerMapper.selectByExample(new AccountCustomerExample());
	}

	@Override
	public AccountCustomer findById(long id) {
		return accountCustomerMapper.selectByPrimaryKey(id);
	}
}
