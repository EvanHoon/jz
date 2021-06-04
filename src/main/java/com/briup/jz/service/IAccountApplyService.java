package com.briup.jz.service;

import com.briup.jz.bean.AccountApply;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IAccountApplyService {

    void saveOrUpdate(AccountApply accountApply) throws CustomerException;

    List<AccountApply> findAll();

    AccountApply findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
 