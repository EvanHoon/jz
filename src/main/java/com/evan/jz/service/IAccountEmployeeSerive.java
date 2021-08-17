package com.evan.jz.service;

import com.evan.jz.bean.AccountEmployee;
import com.evan.jz.bean.extend.AccountEmployeeExtend;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IAccountEmployeeSerive {
	
	List<AccountEmployeeExtend> queryCascade(String type,String status,Long userId);
	
    void saveOrUpdate(AccountEmployee accountEmployee) throws CustomerException;

    List<AccountEmployee> findAll();

    AccountEmployee findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
