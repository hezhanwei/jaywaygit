package com.yishao.usertest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IUserTest {

	public String getUser(String name) {

		return name;
	}

	public String getUser(String name, int age,User user) {
System.out.println(user);
		return name + Integer.toString(age) + "int";
	}

	public String getUser(String name, Integer age) {

		return name + Integer.toString(age) + "integer";
	}

	public static void main(String[] args) {

		Integer integer = new Integer(12);

		try {
			
			System.out.println(reflectTest(IUserTest.class, "getUser", new Object[] { "dandan", 12 ,new User("dandan", 12)},
					new Class[] { String.class, int.class,User.class }));

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static <T, E> Object reflectTest(Class<T> clazz, String methodName, Object[] parameter,
			Class[] parameterTypes) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {

		Method method = clazz.getMethod(methodName, parameterTypes);

		Object invoke = method.invoke(clazz.newInstance(), parameter);

		return invoke;

	}
}

class User{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}