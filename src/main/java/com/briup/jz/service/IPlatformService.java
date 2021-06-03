package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Platform;
import com.briup.jz.utils.CustomerException;

public interface IPlatformService {
void saveOrUpdate(Platform platform) throws CustomerException;
	
	List<Platform> findAll();
	
	Platform findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
