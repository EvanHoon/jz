package com.evan.jz.service;

import com.evan.jz.bean.AccountSystem;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IAccountSystemService {
    void saveOrUpdate(AccountSystem accountSystem) throws CustomerException;

    List<AccountSystem> findAll();

    AccountSystem findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
