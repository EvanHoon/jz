package com.evan.jz.service.impl;

import com.evan.jz.bean.BasePrivilege;
import com.evan.jz.bean.BasePrivilegeExample;
import com.evan.jz.dao.BasePrivilegeMapper;
import com.evan.jz.service.IBasePrivilegeService;
import com.evan.jz.utils.CustomerException;
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
        if (basePrivilegeMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        basePrivilegeMapper.deleteByPrimaryKey(id);
    }
}
