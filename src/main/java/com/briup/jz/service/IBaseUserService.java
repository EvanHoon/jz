package com.briup.jz.service;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IBaseUserService {
    void saveOrUpdate(BaseUser baseUser) throws CustomerException;


    void deleteById(Long id) throws CustomerException;

    List<BaseUser> findAll();

    BaseUser findById(Long id);
}
