package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseUserRole;
import com.briup.jz.bean.BaseUserRoleExample;
import com.briup.jz.dao.BaseUserRoleMapper;
import com.briup.jz.service.IBaseUserRoleService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserRoleServiceImpl implements IBaseUserRoleService {

    @Autowired
    private BaseUserRoleMapper baseUserRoleMapper;

    @Override
    public void saveOrUpdate(BaseUserRole baseUserRole) throws CustomerException {
        if (baseUserRole.getId() != null) {
            baseUserRoleMapper.updateByPrimaryKey(baseUserRole);
        } else {
            baseUserRoleMapper.insert(baseUserRole);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        BaseUserRole baseUserRole = baseUserRoleMapper.selectByPrimaryKey(id);
        if (baseUserRole == null) {
            throw new CustomerException("要删除的id信息不存在");
        }
        baseUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<BaseUserRole> findAll() {
        return baseUserRoleMapper.selectByExample(new BaseUserRoleExample());
    }

    @Override
    public BaseUserRole findById(Long id) {
        return baseUserRoleMapper.selectByPrimaryKey(id);
    }
}
