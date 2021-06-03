package com.briup.jz.service;

import com.briup.jz.bean.BaseRole;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 07:34:05
 */

public interface IBaseRoleService {

    void saveOrUpdate(BaseRole baseRole);

    BaseRole findById(Long id);

    List<BaseRole> findAll();

    void deleteById(Long id);

}
