package com.briup.jz.service;

import com.briup.jz.bean.AccountCustomer;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IAccountCustomerService {
    void saveOrUpdate(AccountCustomer accountCustomer) throws CustomerException;

    List<AccountCustomer> findAll();

    AccountCustomer findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
