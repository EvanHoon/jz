package com.evan.jz.service;

import com.evan.jz.bean.Category;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface ICategoryService {
    void saveOrUpdate(Category category) throws CustomerException;

    List<Category> findLikeName(String name);

    void deleteById(Long id) throws CustomerException;

    List<Category> findAll();

    Category findById(Long id);

}
