package com.yishao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JsTest {

	private JsTest(){};
	private static JsTest jsTest = new JsTest();
	public static JsTest getInstance(){
		if (null!=jsTest) {
			return jsTest;
		}
		return jsTest = new JsTest();
	}
	 private static Integer sum;
	
	 public static JsTest call(Method method,Object[] objs) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		 JsTest instance = getInstance();
		 
		 return  (JsTest) method.invoke(Integer.class, objs);
	 }
	 
	 public static JsTest add(Integer a,Integer b){
		 JsTest instance = getInstance();
		 instance.sum = a+b;
		 return instance;
	 }
	 public static JsTest sub(int a,int b){
		 JsTest instance = getInstance();
		 instance.sum = a-b;
		 return instance;
	 }
	 
	 
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		JsTest instance = getInstance();
		Class<? extends JsTest> class1 = instance.getClass();
		
		JsTest call = call(class1.getMethod("add", new Class[]{Integer.class,Integer.class}), new Object[]{12,12});
		System.out.println(call.sum);
	}
}
