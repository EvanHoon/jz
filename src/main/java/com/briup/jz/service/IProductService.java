package com.briup.jz.service;

import com.briup.jz.bean.Product;
import com.briup.jz.utils.CustomerException;

import java.util.List;


public interface IProductService {
    void saveOrUpdate(Product product) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Product> findAll();

    Product findById(Long id);

    List<Product> findLikeName(String name);
}
