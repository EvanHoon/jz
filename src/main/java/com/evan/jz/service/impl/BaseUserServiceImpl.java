package com.evan.jz.service.impl;

import com.evan.jz.bean.BaseUser;
import com.evan.jz.bean.BaseUserExample;
import com.evan.jz.dao.BaseUserMapper;
import com.evan.jz.service.IBaseUserService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseUserServiceImpl implements IBaseUserService {


    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public void saveOrUpdate(BaseUser baseUser) throws CustomerException {
        if (baseUser.getId() != null) {
            baseUserMapper.updateByPrimaryKey(baseUser);
        } else {
            baseUserMapper.insert(baseUser);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        BaseUser baseUser = baseUserMapper.selectByPrimaryKey(id);
        if (baseUser == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<BaseUser> findAll() {
        return baseUserMapper.selectByExample(new BaseUserExample());
    }

    @Override
    public BaseUser findById(Long id) {
        return baseUserMapper.selectByPrimaryKey(id);
    }

}
