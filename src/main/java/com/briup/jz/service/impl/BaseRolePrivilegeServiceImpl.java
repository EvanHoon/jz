package com.briup.jz.service.impl;

import com.briup.jz.bean.BasePrivilege;
import com.briup.jz.bean.BaseRolePrivilege;
import com.briup.jz.bean.BaseRolePrivilegeExample;
import com.briup.jz.dao.BaseRolePrivilegeMapper;
import com.briup.jz.service.IBaseRolePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:17
 */

@Service
public class BaseRolePrivilegeServiceImpl implements IBaseRolePrivilegeService {
    @Autowired
    private BaseRolePrivilegeMapper baseRolePrivilegeMapper;

    @Override
    public void saveOrUpdate(BaseRolePrivilege baseRolePrivilege) {
        if (baseRolePrivilege.getId() != null) {
            baseRolePrivilegeMapper.updateByPrimaryKey(baseRolePrivilege);
        } else {
            baseRolePrivilegeMapper.insert(baseRolePrivilege);
        }
    }

    @Override
    public BaseRolePrivilege findById(Long id) {
        return baseRolePrivilegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseRolePrivilege> findAll() {
        return baseRolePrivilegeMapper.selectByExample(new BaseRolePrivilegeExample());
    }

    @Override
    public void deleteById(Long id) {
        baseRolePrivilegeMapper.deleteByPrimaryKey(id);
    }
}
