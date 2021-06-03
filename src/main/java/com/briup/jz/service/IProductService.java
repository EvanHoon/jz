package com.briup.jz.service;

import java.util.List;


import com.briup.jz.bean.Product;
import com.briup.jz.utils.CustomerException;


public interface IProductService {
	void saveOrUpdate(Product product) throws CustomerException;
	void deleteById(long id) throws CustomerException;
	List<Product> findAll();
	Product findById(long id);
	List<Product> findLikeName(String name);
}
