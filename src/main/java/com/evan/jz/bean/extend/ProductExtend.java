package com.evan.jz.bean.extend;

import com.evan.jz.bean.Product;
import com.evan.jz.bean.ProductCategory;

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
