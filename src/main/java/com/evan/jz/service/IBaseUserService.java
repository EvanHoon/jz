package com.evan.jz.service;

import com.evan.jz.bean.BaseUser;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IBaseUserService {
    void saveOrUpdate(BaseUser baseUser) throws CustomerException;


    void deleteById(Long id) throws CustomerException;

    List<BaseUser> findAll();

    BaseUser findById(Long id);
}
