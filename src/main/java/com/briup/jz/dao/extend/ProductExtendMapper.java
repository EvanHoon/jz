package com.briup.jz.dao.extend;

import java.util.List;
import com.briup.jz.bean.extend.ProductExtend;

public interface ProductExtendMapper {
	List<ProductExtend> selectCascade(String name,Double price,String status);
}
