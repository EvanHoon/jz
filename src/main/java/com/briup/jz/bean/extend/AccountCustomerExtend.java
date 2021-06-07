package com.briup.jz.bean.extend;

import com.briup.jz.bean.AccountCustomer;
import com.briup.jz.bean.BaseUser;

public class AccountCustomerExtend extends AccountCustomer{
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
