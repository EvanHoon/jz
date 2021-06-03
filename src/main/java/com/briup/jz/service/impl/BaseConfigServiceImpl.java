package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseConfig;
import com.briup.jz.bean.BaseConfigExample;
import com.briup.jz.dao.BaseConfigMapper;
import com.briup.jz.service.IBaseConfigService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 07:44:29
 */

@Service
public class BaseConfigServiceImpl implements IBaseConfigService {

    @Autowired
    private BaseConfigMapper baseConfigMapper;

    @Override
    public void saveOrUpdate(BaseConfig baseConfig) {
        if (baseConfig.getId() == null) {
            baseConfigMapper.insert(baseConfig);
        } else {
            baseConfigMapper.updateByPrimaryKey(baseConfig);
        }
    }

    @Override
    public BaseConfig findById(Long id) {
        return baseConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseConfig> findAll() {
        return baseConfigMapper.selectByExample(new BaseConfigExample());
    }

    @Override
    public void deleteById(Long id) {
        if (baseConfigMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseConfigMapper.deleteByPrimaryKey(id);
    }
}
