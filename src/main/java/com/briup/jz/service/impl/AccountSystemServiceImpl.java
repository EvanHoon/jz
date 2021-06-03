package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.jz.bean.AccountSystem;
import com.briup.jz.bean.AccountSystemExample;
import com.briup.jz.dao.AccountSystemMapper;
import com.briup.jz.service.IAccountSystemService;
import com.briup.jz.utils.CustomerException;
@Service
public class AccountSystemServiceImpl implements IAccountSystemService{
	@Autowired
	private AccountSystemMapper accountSystemMapper;

	@Override
	public void saveOrUpdate(AccountSystem accountSystem) throws CustomerException {
		if(accountSystem.getId()==null) {
			accountSystemMapper.insert(accountSystem);
		}else {
			accountSystemMapper.updateByPrimaryKey(accountSystem);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		AccountSystem accountSystem = accountSystemMapper.selectByPrimaryKey(id);
		if(accountSystem == null) {
			throw new CustomerException("要删除的分类信息不存在");
		}
		accountSystemMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<AccountSystem> findAll() {
		return accountSystemMapper.selectByExample(new AccountSystemExample());
	}

	@Override
	public AccountSystem findById(long id) {
		return accountSystemMapper.selectByPrimaryKey(id);
	}
	
}
