package com.yishao.serialzable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class MainTest {

	public static void main(String[] args) {

		ObjectOutputStream objectOutputStream = null;
		ObjectInputStream objectInputStream = null;
		OutputStream os = null;
		InputStream is = null;
		Collection user = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.java"));
			objectInputStream = new ObjectInputStream(new FileInputStream("user.java"));
			
			os = new FileOutputStream("user.java");
			is = new FileInputStream("user.java");

			User newProxyInstance = (User)Proxy.newProxyInstance(IUser.class.getClassLoader(), new Class[] { IUser.class },
					new InvocationHandler() {
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							return null;
						}
					});
			objectOutputStream.writeObject(newProxyInstance);
			
//			byte[] b = new byte[1024];
//			int len = 0;
			

			try {
				// user = (Collection)objectInputStream.readObject();
				// System.out.println(user.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 可序列化对象 必须要继承Serializabel接口，成员属性必须是可序列化
 * 
 * @author yishao
 *
 */
class User implements IUser,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", password=" + password + "]";
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test01(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}

interface IUser extends Serializable{
	void test();
	String test01(String str);
}



