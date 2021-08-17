package com.evan.jz.bean.extend;

import com.evan.jz.bean.AccountEmployee;
import com.evan.jz.bean.BaseUser;

public class AccountEmployeeExtend extends AccountEmployee{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private BaseUser baseUser;
public BaseUser getBaseUser() {
	return baseUser;
}
public void setBaseUser(BaseUser baseUser) {
	this.baseUser = baseUser;
}
}
