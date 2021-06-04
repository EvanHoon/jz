package com.briup.jz.service.impl;

import com.briup.jz.bean.Category;
import com.briup.jz.bean.CategoryExample;
import com.briup.jz.dao.CategoryMapper;
import com.briup.jz.service.ICategoryService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void saveOrUpdate(Category category) throws CustomerException {
        if (category.getId() != null) {
            categoryMapper.updateByPrimaryKey(category);
        } else {
            // 判断是否有同名的分类，如果有抛出异常
            CategoryExample example = new CategoryExample();
            example.createCriteria().andNameEqualTo(category.getName());
            List<Category> list = categoryMapper.selectByExample(example);
            if (list.size() > 0) {
                throw new CustomerException("同名的分类已存在");
            }
            categoryMapper.insert(category);
        }
    }

    @Override
    public List<Category> findLikeName(String name) {
        CategoryExample example = new CategoryExample();
        if (name != null) {
            example.createCriteria().andNameLike("%" + name + "%");
        }
        List<Category> list = categoryMapper.selectByExample(example);
        return list;
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        categoryMapper.deleteByPrimaryKey(id);

    }

    @Override
    public Category findById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryMapper.selectByExample(new CategoryExample());
    }


}
