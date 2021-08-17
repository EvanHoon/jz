package com.evan.jz.service;

import com.evan.jz.bean.ProductCategory;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IProductCategoryService {
    void saveOrUpdate(ProductCategory productCategory) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<ProductCategory> findAll();

    ProductCategory findById(Long id);
}
