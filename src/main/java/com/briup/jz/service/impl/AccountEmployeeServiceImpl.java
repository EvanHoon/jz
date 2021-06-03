package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.AccountEmployee;
import com.briup.jz.bean.AccountEmployeeExample;
import com.briup.jz.dao.AccountEmployeeMapper;
import com.briup.jz.service.IAccountEmployeeSerive;
import com.briup.jz.utils.CustomerException;
@Service
public class AccountEmployeeServiceImpl implements IAccountEmployeeSerive{
	@Autowired
	private AccountEmployeeMapper accountEmployeeMapper;

	@Override
	public void saveOrUpdate(AccountEmployee accountEmployee) throws CustomerException {
		if(accountEmployee.getId()==null) {
			accountEmployeeMapper.insert(accountEmployee);
		}else {
			accountEmployeeMapper.updateByPrimaryKey(accountEmployee);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		AccountEmployee accountEmployee = accountEmployeeMapper.selectByPrimaryKey(id);
		if(accountEmployee == null) {
			throw new CustomerException("要删除的分类信息不存在");
		}
		accountEmployeeMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<AccountEmployee> findAll() {
		return accountEmployeeMapper.selectByExample(new AccountEmployeeExample());
	}

	@Override
	public AccountEmployee findById(long id) {
		return accountEmployeeMapper.selectByPrimaryKey(id);
	}
	
}
