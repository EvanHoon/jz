package com.evan.jz.bean.extend;

import com.evan.jz.bean.Address;
import com.evan.jz.bean.BaseUser;
import com.evan.jz.bean.Order;


public class OrderExtend extends Order{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BaseUser baseUser;
	private Address address;
	public BaseUser getBaseUser() {
		return baseUser;
	}
	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
