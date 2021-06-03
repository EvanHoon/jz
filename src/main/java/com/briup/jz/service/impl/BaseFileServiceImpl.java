package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseFile;
import com.briup.jz.bean.BaseFileExample;
import com.briup.jz.bean.Category;
import com.briup.jz.bean.CategoryExample;
import com.briup.jz.dao.BaseFileMapper;
import com.briup.jz.service.IBaseFileService;
import com.briup.jz.utils.CustomerException;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:52
 */

@Service
public class BaseFileServiceImpl implements IBaseFileService {

    @Autowired
    private BaseFileMapper baseFileMapper;

    @Override
    public void save(BaseFile baseFile) {
        // 判断是否有同名的分类，如果有抛出异常
        baseFileMapper.insert(baseFile);
    }

    @Override
    public BaseFile findById(String id) {
        return baseFileMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseFile> findAll() {
        return baseFileMapper.selectByExample(new BaseFileExample());
    }

    @Override
    public void deleteById(String id) {
        if (baseFileMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseFileMapper.deleteByPrimaryKey(id);
    }

}
