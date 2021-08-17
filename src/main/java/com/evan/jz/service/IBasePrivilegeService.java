package com.evan.jz.service;

import com.evan.jz.bean.BasePrivilege;
import com.evan.jz.utils.CustomerException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:34
 */

public interface IBasePrivilegeService {

    void saveOrUpdate(BasePrivilege basePrivilege) throws CustomerException;

    BasePrivilege findById(Long id);

    List<BasePrivilege> findAll();

    void deleteById(Long id) throws CustomerException;

}
