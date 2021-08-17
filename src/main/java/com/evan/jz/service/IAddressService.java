package com.evan.jz.service;

import com.evan.jz.bean.Address;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IAddressService {
    void saveOrUpdate(Address address) throws CustomerException;

    void deleteById(Long id) throws CustomerException;

    List<Address> findAll();

    Address findById(Long id);

    List<Address> findLikeName(String name);
}
