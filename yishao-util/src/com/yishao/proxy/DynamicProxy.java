package com.yishao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class DynamicProxy {

	public static void main(String[] args) throws Exception {

//		IUserProxy proxy = (IUserProxy) proxy(new UserProxyImpl());
//		proxy.getSomething("dandna");
		
		Class<?> forName = Class.forName("java.lang.String");
		
		try {
			Method method = DynamicProxy.class.getMethod("apply", List.class);
			
			Type[] genericParameterTypes = method.getGenericParameterTypes();
			ParameterizedType type = (ParameterizedType) genericParameterTypes[0];
			System.out.println(type.getTypeName());
			System.out.println(type.getActualTypeArguments()[0]+"--"+type.getRawType()+"---"+type.getOwnerType());
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static Object proxy(final IUserProxy iup) {

		Object proxy = Proxy.newProxyInstance(iup.getClass().getClassLoader(), iup.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// System.out.println(proxy);
						return method.invoke(iup, args);
					}
				});

		System.out.println("main--> " + proxy);

		return proxy;
	}

	
	public void apply(List<Date> list){}
	
}
