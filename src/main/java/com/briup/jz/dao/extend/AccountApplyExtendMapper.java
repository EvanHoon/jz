package com.briup.jz.dao.extend;

import java.util.List;

import com.briup.jz.bean.extend.AccountApplyExtend;

public interface AccountApplyExtendMapper {
	
List<AccountApplyExtend> select(String applyType,String status,Long userId);
}
