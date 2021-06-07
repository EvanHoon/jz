package com.briup.jz.bean.extend;

import com.briup.jz.bean.Product;
import com.briup.jz.bean.ProductCategory;

public class ProductExtend extends Product{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProductCategory productCategory;

	
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
}
