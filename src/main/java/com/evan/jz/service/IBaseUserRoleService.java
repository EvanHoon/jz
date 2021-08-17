package com.evan.jz.service;

import com.evan.jz.bean.BaseUserRole;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IBaseUserRoleService {
    void saveOrUpdate(BaseUserRole baseUserRole) throws CustomerException;


    void deleteById(Long id) throws CustomerException;

    List<BaseUserRole> findAll();

    BaseUserRole findById(Long id);
}
