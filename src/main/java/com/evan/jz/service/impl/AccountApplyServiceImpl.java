package com.evan.jz.service.impl;

import com.evan.jz.bean.AccountApply;
import com.evan.jz.bean.AccountApplyExample;
import com.evan.jz.bean.extend.AccountApplyExtend;
import com.evan.jz.dao.AccountApplyMapper;
import com.evan.jz.service.IAccountApplyService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountApplyServiceImpl implements IAccountApplyService {
    @Autowired
    private AccountApplyMapper accountApplyMapper;
    @Autowired
    private com.evan.jz.dao.extend.AccountApplyExtendMapper AccountApplyExtendMapper;
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

	@Override
	public List<AccountApplyExtend> queryCascade(String applyType,String status,Long userId) {
		return AccountApplyExtendMapper.select(applyType, status, userId);
	}


}
