package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.extend.OrderExtend;

public interface OrderExtendMapper {
	OrderExtend selectCascade(Long id);
}
