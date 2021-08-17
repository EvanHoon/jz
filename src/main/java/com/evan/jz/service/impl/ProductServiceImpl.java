package com.evan.jz.service.impl;

import com.evan.jz.bean.Product;
import com.evan.jz.bean.ProductExample;
import com.evan.jz.bean.extend.ProductExtend;
import com.evan.jz.dao.ProductMapper;
import com.evan.jz.dao.extend.ProductExtendMapper;
import com.evan.jz.service.IProductService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductExtendMapper productExtendMapper;

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

	@Override
	public List<ProductExtend> selectCascade(String name, Double price, String status) {
		return productExtendMapper.selectCascade(name, price, status);
	}

}
