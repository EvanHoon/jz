package com.evan.jz.service.impl;

import com.evan.jz.bean.AccountCustomer;
import com.evan.jz.bean.AccountCustomerExample;
import com.evan.jz.bean.extend.AccountCustomerExtend;
import com.evan.jz.dao.AccountCustomerMapper;
import com.evan.jz.dao.extend.AccountCustomerExtendMapper;
import com.evan.jz.service.IAccountCustomerService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountCustomerServiceImpl implements IAccountCustomerService {
    @Autowired
    private AccountCustomerMapper accountCustomerMapper;
    @Autowired
    private AccountCustomerExtendMapper accountCustomerExtendMapper;
    @Override
    public void saveOrUpdate(AccountCustomer accountCustomer) throws CustomerException {
        if (accountCustomer.getId() == null) {
            accountCustomerMapper.insert(accountCustomer);
        } else {
            accountCustomerMapper.updateByPrimaryKey(accountCustomer);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        AccountCustomer accountCustomer = accountCustomerMapper.selectByPrimaryKey(id);
        if (accountCustomer == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        accountCustomerMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<AccountCustomer> findAll() {
        return accountCustomerMapper.selectByExample(new AccountCustomerExample());
    }

    @Override
    public AccountCustomer findById(Long id) {
        return accountCustomerMapper.selectByPrimaryKey(id);
    }

	@Override
	public List<AccountCustomerExtend> queryCascade(String type, String status, Long userId) {
		
		return accountCustomerExtendMapper.select(type, status, userId);
	}
}
