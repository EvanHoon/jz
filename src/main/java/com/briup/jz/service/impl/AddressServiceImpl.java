package com.briup.jz.service.impl;

import com.briup.jz.bean.Address;
import com.briup.jz.bean.AddressExample;
import com.briup.jz.dao.AddressMapper;
import com.briup.jz.service.IAddressService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public void saveOrUpdate(Address address) throws CustomerException {
        if (address.getId() != null) {
            addressMapper.updateByPrimaryKey(address);
        } else {
            addressMapper.insert(address);
        }

    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        Address address = addressMapper.selectByPrimaryKey(id);
        if (address == null) {
            throw new CustomerException("要删除的分类信息不存在");
        } else {
            addressMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public List<Address> findAll() {
        return addressMapper.selectByExample(new AddressExample());
    }

    @Override
    public Address findById(Long id) {
        Address address = addressMapper.selectByPrimaryKey(id);
        if (address == null) {
            throw new CustomerException("要查找的分类信息不存在");
        }
        return address;
    }

    @Override
    public List<Address> findLikeName(String name) {
        AddressExample example = new AddressExample();
        if (name != null) {
            example.createCriteria().andUsernameLike("%" + name + "%");
            List<Address> list = addressMapper.selectByExample(example);
            return list;
        } else {
            throw new CustomerException("请输入姓名");
        }
    }

}
