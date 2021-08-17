package com.evan.jz.dao.extend;

import com.evan.jz.bean.extend.OrderExtend;

public interface OrderExtendMapper {
	OrderExtend selectCascade(Long id);
}
