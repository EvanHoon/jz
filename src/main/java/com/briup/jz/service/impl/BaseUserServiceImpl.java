package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.bean.BaseUserExample;
import com.briup.jz.dao.BaseUserMapper;
import com.briup.jz.service.IBaseUserService;
import com.briup.jz.utils.CustomerException;
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
