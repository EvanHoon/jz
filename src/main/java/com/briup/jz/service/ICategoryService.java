package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Category;
import com.briup.jz.utils.CustomerException;

public interface ICategoryService {
	void saveOrUpdate(Category category) throws CustomerException;
	
	 List<Category>findLikeName(String name);
	
	void deleteById(long id) throws CustomerException;
	
	List<Category> findAll();
	
	 Category findById(long id);
	  
}
