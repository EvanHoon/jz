package com.briup.jz.service;

import com.briup.jz.bean.BaseRolePrivilege;
import com.briup.jz.utils.CustomerException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:17
 */

public interface IBaseRolePrivilegeService {

    void saveOrUpdate(BaseRolePrivilege baseRolePrivilege) throws CustomerException;

    BaseRolePrivilege findById(Long id);

    List<BaseRolePrivilege> findAll();

    void deleteById(Long id) throws CustomerException;

}
