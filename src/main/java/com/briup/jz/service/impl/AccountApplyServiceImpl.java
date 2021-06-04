package com.briup.jz.service.impl;

import com.briup.jz.bean.AccountApply;
import com.briup.jz.bean.AccountApplyExample;
import com.briup.jz.dao.AccountApplyMapper;
import com.briup.jz.service.IAccountApplyService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountApplyServiceImpl implements IAccountApplyService {
    @Autowired
    private AccountApplyMapper accountApplyMapper;

    @Override
    public void saveOrUpdate(AccountApply accountApply) throws CustomerException {
        if (accountApply.getId() == null) {
            accountApplyMapper.insert(accountApply);
        } else {
            accountApplyMapper.updateByPrimaryKey(accountApply);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        AccountApply accountApply = accountApplyMapper.selectByPrimaryKey(id);
        if (accountApply == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        accountApplyMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<AccountApply> findAll() {
        return accountApplyMapper.selectByExample(new AccountApplyExample());
    }

    @Override
    public AccountApply findById(Long id) {
        return accountApplyMapper.selectByPrimaryKey(id);
    }


}
