package com.evan.jz.service;

import com.evan.jz.bean.AccountCustomer;
import com.evan.jz.bean.extend.AccountCustomerExtend;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IAccountCustomerService {
	List<AccountCustomerExtend> queryCascade(String type, String status, Long userId);
	
    void saveOrUpdate(AccountCustomer accountCustomer) throws CustomerException;

    List<AccountCustomer> findAll();

    AccountCustomer findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
