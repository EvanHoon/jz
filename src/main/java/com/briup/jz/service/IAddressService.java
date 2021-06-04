package com.briup.jz.service;

import com.briup.jz.bean.Address;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IAddressService {
    void saveOrUpdate(Address address) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Address> findAll();

    Address findById(Long id);

    List<Address> findLikeName(String name);
}
