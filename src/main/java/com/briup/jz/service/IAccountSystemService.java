package com.briup.jz.service;

import com.briup.jz.bean.AccountSystem;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IAccountSystemService {
    void saveOrUpdate(AccountSystem accountSystem) throws CustomerException;

    List<AccountSystem> findAll();

    AccountSystem findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
