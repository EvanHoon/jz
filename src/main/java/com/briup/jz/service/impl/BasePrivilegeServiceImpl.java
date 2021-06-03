package com.briup.jz.service.impl;

import com.briup.jz.bean.BasePrivilege;
import com.briup.jz.bean.BasePrivilegeExample;
import com.briup.jz.dao.BasePrivilegeMapper;
import com.briup.jz.service.IBasePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:34
 */

@Service
public class BasePrivilegeServiceImpl implements IBasePrivilegeService {

    @Autowired
    private BasePrivilegeMapper basePrivilegeMapper;

    @Override
    public void saveOrUpdate(BasePrivilege basePrivilege) {
        if (basePrivilege.getId() != null) {
            basePrivilegeMapper.updateByPrimaryKey(basePrivilege);
        } else {
            basePrivilegeMapper.insert(basePrivilege);
        }
    }

    @Override
    public BasePrivilege findById(Long id) {
        return basePrivilegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BasePrivilege> findAll() {
        return basePrivilegeMapper.selectByExample(new BasePrivilegeExample());
    }

    @Override
    public void deleteById(Long id) {
        basePrivilegeMapper.deleteByPrimaryKey(id);
    }
}
