package com.briup.jz.service.impl;

import com.briup.jz.bean.Product;
import com.briup.jz.bean.ProductExample;
import com.briup.jz.dao.ProductMapper;
import com.briup.jz.service.IProductService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void saveOrUpdate(Product product) throws CustomerException {
        if (product.getId() != null) {
            productMapper.updateByPrimaryKey(product);
        } else {
            ProductExample example = new ProductExample();
            example.createCriteria().andNameEqualTo(product.getName());
            List<Product> list = productMapper.selectByExample(example);
            if (list.size() > 0) {
                throw new CustomerException("同名的分类已存在");
            }
            productMapper.insert(product);
        }

    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        Product product = productMapper.selectByPrimaryKey(id);
        if (product == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.selectByExample(new ProductExample());
    }

    @Override
    public Product findById(Long id) {
        Product product = productMapper.selectByPrimaryKey(id);
        if (product == null) {
            throw new CustomerException("要查找的分类信息不存在");
        }
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> findLikeName(String name) {
        ProductExample example = new ProductExample();
        if (name != null) {
            example.createCriteria().andNameLike("%" + name + "%");
        }
        List<Product> list = productMapper.selectByExample(example);
        return list;
    }

}
