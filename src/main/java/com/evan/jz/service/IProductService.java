package com.evan.jz.service;

import com.evan.jz.bean.Product;
import com.evan.jz.bean.extend.ProductExtend;
import com.evan.jz.utils.CustomerException;

import java.util.List;


public interface IProductService {
    void saveOrUpdate(Product product) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Product> findAll();

    Product findById(Long id);

    List<Product> findLikeName(String name);
    
    List<ProductExtend> selectCascade(String name,Double price,String status);
}
