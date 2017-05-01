package com.yishao.proxy;

public class UserProxyImpl implements IUserProxy {

	@Override
	public String getSomething(String str) {
		
		System.out.println("hello ".concat(str));
		return "Hello  ".concat(str);
	}

}
