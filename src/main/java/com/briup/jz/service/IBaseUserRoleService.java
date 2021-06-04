package com.briup.jz.service;

import com.briup.jz.bean.BaseUserRole;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IBaseUserRoleService {
    void saveOrUpdate(BaseUserRole baseUserRole) throws CustomerException;


    void deleteById(Long id) throws CustomerException;

    List<BaseUserRole> findAll();

    BaseUserRole findById(Long id);
}
