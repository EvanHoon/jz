package com.evan.jz.dao.extend;

import java.util.List;

import com.evan.jz.bean.extend.AccountEmployeeExtend;

public interface AccountEmployeeExtendMapper {
	List<AccountEmployeeExtend> select(String type,String status,Long userId);
}
