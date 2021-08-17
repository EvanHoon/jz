package com.evan.jz.service.impl;

import com.evan.jz.bean.BaseLog;
import com.evan.jz.bean.BaseLogExample;
import com.evan.jz.dao.BaseLogMapper;
import com.evan.jz.service.IBaseLogService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:44
 */

@Service
public class BaseLogServiceImpl implements IBaseLogService {

    @Autowired
    private BaseLogMapper baseLogMapper;

    @Override
    public void saveOrUpdate(BaseLog baseLog) {
        if (baseLog.getId() != null) {
            baseLogMapper.updateByPrimaryKey(baseLog);
        } else {
            baseLogMapper.insert(baseLog);
        }
    }

    @Override
    public BaseLog findById(Long id) {
        return baseLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseLog> findAll() {
        return baseLogMapper.selectByExample(new BaseLogExample());
    }

    @Override
    public void deleteById(Long id) {
        if (baseLogMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseLogMapper.deleteByPrimaryKey(id);
    }
}
