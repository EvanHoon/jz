package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.extend.AccountCustomerExtend;

public interface AccountCustomerExtendMapper {
	List<AccountCustomerExtend> select(String type,String status,Long userId);
}
