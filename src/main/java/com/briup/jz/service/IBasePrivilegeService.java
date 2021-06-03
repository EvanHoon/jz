package com.briup.jz.service;

import com.briup.jz.bean.BasePrivilege;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:34
 */

public interface IBasePrivilegeService {

    void saveOrUpdate(BasePrivilege basePrivilege);

    BasePrivilege findById(Long id);

    List<BasePrivilege> findAll();

    void deleteById(Long id);

}
