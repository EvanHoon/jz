package com.briup.jz.service;

import com.briup.jz.bean.ProductCategory;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IProductCategoryService {
    void saveOrUpdate(ProductCategory productCategory) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<ProductCategory> findAll();

    ProductCategory findById(Long id);
}
