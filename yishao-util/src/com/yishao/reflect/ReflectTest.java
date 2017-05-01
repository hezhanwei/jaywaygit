package com.yishao.reflect;

import java.lang.reflect.Constructor;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		
		Constructor<String> constructor = String.class.getConstructor(StringBuffer.class);
		
		String newInstance = constructor.newInstance(new StringBuffer("abc"));
		
		System.out.println(newInstance);
		
		String newInstance2 = String.class.newInstance();
		
		
	}
}
