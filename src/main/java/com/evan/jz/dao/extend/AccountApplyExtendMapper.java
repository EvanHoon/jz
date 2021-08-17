package com.evan.jz.dao.extend;

import java.util.List;

import com.evan.jz.bean.extend.AccountApplyExtend;

public interface AccountApplyExtendMapper {
	
List<AccountApplyExtend> select(String applyType,String status,Long userId);
}
