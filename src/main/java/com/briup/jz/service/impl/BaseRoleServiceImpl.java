package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseRole;
import com.briup.jz.bean.BaseRoleExample;
import com.briup.jz.dao.BaseRoleMapper;
import com.briup.jz.service.IBaseRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:41:52
 */

@Service
public class BaseRoleServiceImpl implements IBaseRoleService {
    @Autowired
    private BaseRoleMapper baseRoleMapper;

    @Override
    public void saveOrUpdate(BaseRole baseRole) {
        if (baseRole.getId() != null) {
            baseRoleMapper.updateByPrimaryKey(baseRole);
        } else {
            baseRoleMapper.insert(baseRole);
        }
    }

    @Override
    public BaseRole findById(Long id) {
        return baseRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseRole> findAll() {
        return baseRoleMapper.selectByExample(new BaseRoleExample());
    }

    @Override
    public void deleteById(Long id) {
        baseRoleMapper.deleteByPrimaryKey(id);
    }
}
