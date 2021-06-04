package com.briup.jz.service;

import com.briup.jz.bean.AccountEmployee;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IAccountEmployeeSerive {
    void saveOrUpdate(AccountEmployee accountEmployee) throws CustomerException;

    List<AccountEmployee> findAll();

    AccountEmployee findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
