package com.briup.jz.bean.extend;

import com.briup.jz.bean.Address;
import com.briup.jz.bean.BaseUser;
import com.briup.jz.bean.Order;


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
