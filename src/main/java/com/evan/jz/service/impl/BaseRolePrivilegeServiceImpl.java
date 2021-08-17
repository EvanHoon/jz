package com.evan.jz.service.impl;

import com.evan.jz.bean.BaseRolePrivilege;
import com.evan.jz.bean.BaseRolePrivilegeExample;
import com.evan.jz.dao.BaseRolePrivilegeMapper;
import com.evan.jz.service.IBaseRolePrivilegeService;
import com.evan.jz.utils.CustomerException;
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
        if (baseRolePrivilegeMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseRolePrivilegeMapper.deleteByPrimaryKey(id);
    }
}
