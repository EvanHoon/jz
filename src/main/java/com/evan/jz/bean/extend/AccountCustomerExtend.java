package com.evan.jz.bean.extend;

import com.evan.jz.bean.AccountCustomer;
import com.evan.jz.bean.BaseUser;

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
