package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Address;
import com.briup.jz.utils.CustomerException;

public interface IAddressService {
	void saveOrUpdate(Address address) throws CustomerException;
	void deleteById(long id) throws CustomerException;
	List<Address> findAll();
	Address findById(long id);
	List<Address> findLikeName(String name);
}
