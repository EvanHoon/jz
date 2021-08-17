package com.evan.jz.dao.extend;

import java.util.List;

import com.evan.jz.bean.extend.AccountCustomerExtend;

public interface AccountCustomerExtendMapper {
	List<AccountCustomerExtend> select(String type, String status, Long userId);
}
