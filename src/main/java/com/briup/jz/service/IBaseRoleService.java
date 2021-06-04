package com.briup.jz.service;

import com.briup.jz.bean.BaseRole;
import com.briup.jz.utils.CustomerException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 07:34:05
 */

public interface IBaseRoleService {

    void saveOrUpdate(BaseRole baseRole) throws CustomerException;

    BaseRole findById(Long id);

    List<BaseRole> findAll();

    void deleteById(Long id) throws CustomerException;

}
