package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.extend.AccountEmployeeExtend;

public interface AccountEmployeeExtendMapper {
	List<AccountEmployeeExtend> select(String type,String status,Long userId);
}
