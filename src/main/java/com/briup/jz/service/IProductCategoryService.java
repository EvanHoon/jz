package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.ProductCategory;
import com.briup.jz.utils.CustomerException;

public interface IProductCategoryService {
	void saveOrUpdate(ProductCategory productCategory) throws CustomerException;
	void deleteById(long id) throws CustomerException;
	List<ProductCategory> findAll();
	ProductCategory findById(long id);
}
