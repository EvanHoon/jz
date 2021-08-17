package com.evan.jz.service;

import com.evan.jz.bean.AccountApply;
import com.evan.jz.bean.extend.AccountApplyExtend;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IAccountApplyService {
	
	List<AccountApplyExtend> queryCascade(String applyType,String status,Long userId);
	
    void saveOrUpdate(AccountApply accountApply) throws CustomerException;

    List<AccountApply> findAll();

    AccountApply findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
 