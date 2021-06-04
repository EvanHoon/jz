package com.briup.jz.service;

import com.briup.jz.bean.Category;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface ICategoryService {
    void saveOrUpdate(Category category) throws CustomerException;

    List<Category> findLikeName(String name);

    void deleteById(Long id) throws CustomerException;

    List<Category> findAll();

    Category findById(Long id);

}
