package com.yishao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy01 implements InvocationHandler{

	private Object obj;
	
	public DynamicProxy01(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("before...");
		
		Object invoke = method.invoke(obj, args);
		
		System.out.println("after...");
		
		return invoke;
	}

	
	public static void main(String[] args) {
		
//		Class<?> proxyClass = Proxy.getProxyClass(IUserProxy.class.getClassLoader(), IUserProxy.class.getInterfaces());
//		
//		proxyClass./*getcon*/
		
		IUserProxy proxy = (IUserProxy) Proxy.newProxyInstance(
				IUserProxy.class.getClassLoader(), 
				new Class[]{IUserProxy.class},
				new DynamicProxy01(new UserProxyImpl())
				);
		
		System.out.println(proxy);
//		proxy.getSomething("dandan");
		
		
		
	}
	
}
