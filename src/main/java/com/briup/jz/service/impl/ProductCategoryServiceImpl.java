package com.briup.jz.service.impl;

import com.briup.jz.bean.ProductCategory;
import com.briup.jz.bean.ProductCategoryExample;
import com.briup.jz.dao.ProductCategoryMapper;
import com.briup.jz.service.IProductCategoryService;
import com.briup.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public void saveOrUpdate(ProductCategory productCategory) throws CustomerException {
        if (productCategory.getId() != null) {
            productCategoryMapper.updateByPrimaryKey(productCategory);
        } else {
            ProductCategoryExample example = new ProductCategoryExample();
            example.createCriteria().andNameEqualTo(productCategory.getName());
            List<ProductCategory> list = productCategoryMapper.selectByExample(example);
            if (list.size() > 0) {
                throw new CustomerException("同名的分类已存在");
            }
            productCategoryMapper.insert(productCategory);
        }

    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(id);
        if (productCategory == null) {
            throw new CustomerException("要删除的分类信息不存在");
        } else {
            productCategoryMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.selectByExample(new ProductCategoryExample());
    }

    @Override
    public ProductCategory findById(Long id) {
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(id);
        if (productCategory == null) {
            throw new CustomerException("要查找的分类信息不存在");
        }
        return productCategory;
    }

}
