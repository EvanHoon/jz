package com.evan.jz.service.impl;

import com.evan.jz.bean.AccountEmployee;
import com.evan.jz.bean.AccountEmployeeExample;
import com.evan.jz.bean.extend.AccountEmployeeExtend;
import com.evan.jz.dao.AccountEmployeeMapper;
import com.evan.jz.dao.extend.AccountEmployeeExtendMapper;
import com.evan.jz.service.IAccountEmployeeSerive;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountEmployeeServiceImpl implements IAccountEmployeeSerive {
    @Autowired
    private AccountEmployeeMapper accountEmployeeMapper;
    @Autowired
    private AccountEmployeeExtendMapper accountEmployeeExtendMapper;
    @Override
    public void saveOrUpdate(AccountEmployee accountEmployee) throws CustomerException {
        if (accountEmployee.getId() == null) {
            accountEmployeeMapper.insert(accountEmployee);
        } else {
            accountEmployeeMapper.updateByPrimaryKey(accountEmployee);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        AccountEmployee accountEmployee = accountEmployeeMapper.selectByPrimaryKey(id);
        if (accountEmployee == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        accountEmployeeMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<AccountEmployee> findAll() {
        return accountEmployeeMapper.selectByExample(new AccountEmployeeExample());
    }

    @Override
    public AccountEmployee findById(Long id) {
        return accountEmployeeMapper.selectByPrimaryKey(id);
    }

	@Override
	public List<AccountEmployeeExtend> queryCascade(String type, String status, Long userId) {
		
		return accountEmployeeExtendMapper.select(type, status, userId);
	}

}
