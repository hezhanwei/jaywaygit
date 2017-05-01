package com.yishao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Main {

	public static void main(String[] args) {
		// BigDecimal bd = new BigDecimal(0);
		// int i = 12;
		// String str = "abc";
		//
		// StringBuilder sb = new StringBuilder("hello ");
		//
		// List<User> list = new ArrayList<>();
		// test(bd,i,str,list,sb);
		//
		// System.out.println(bd.toString()+"------"+i);
		// System.out.println(str);
		// System.out.println(list.get(0));
		//
		// System.out.println(sb);

		// int a = 3;
		// short b = 4;
		//// b = a+b;
		// b+=a;
		// a+=b;
		//
		// float f = 3.4f;
		// System.out.println((1+1.6)==2.6);
		//
		// String s = new String("");
		// String ss = new String("");
		// System.out.println(s==ss+"---"+s.equals(ss));
		//
		// User user = new User();
		// User user2 = new User();
		// System.out.println(user.equals(user2));

		// System.out.println("abcde".intern());

		// int total_fee = (int) (btsOfflinePay.getAmount().doubleValue() *
		// 100);

		// System.out.println((int)new BigDecimal(2.30).doubleValue() * 100);
		//
		// System.out.println(String.valueOf((int) (2.3f * 100)));

		// System.out.println((int)(0.199f*100));

		// ��ʹ�õ���������������������ν���ֵ

		int a = 2;
		int b = 3;

		// System.out.println("����ǰ�� "+"a="+a+"-------"+"b="+b);
		//
		// a = a+b;
		// b= a-b;
		// a= a-b;
		//
		// System.out.println("����� "+"a="+a+"-------"+"b="+b);
		//
		// new Thread(){
		// public void run() {
		// System.out.println("hello.");
		// };
		// }.start();

		//
		// System.out.println(new User(){});
		//
		//
		//
		//
		// System.out.println(new User());
		char c = 'A' + 13;
		System.out.println(c);

		int x = 1, y = 0, aa = 0, bb = 0;
		switch (x) {
		case 1:
			switch (y) {
			case 0:
				aa++;
				break;
			case 1:
				bb++;
				break;
			}
		case 2:
			aa++;
			bb++;
			break;
		case 3:
			aa++;
			bb++;

		}
		// System.out.println(aa +"--"+bb);

//		System.out.println(test(13431));
//		System.out.println(test(12322));
//		perfectNum(10);
//		
//		System.out.println(7/2);
		
//		System.out.println(test("123454321"));
		
		////////////////////////////////////////
		Integer i1 = 2;
		Integer i2 = 2;
		System.out.println("i1==i2 ? "+ (i1==i2));// i1==i2 ? true
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println("i3 == i4 ? "+(i3==i4));//i3 == i4 ? false
		
		//���ۣ�jvm Ϊ�˽�ʡ�ռ䣬��Integer��ֵ���ڣ�-128 ~ 127����Χ��ʱ��
		//jvm���ȼ���Ƿ��Ѵ���ֵ���� i1 =2 ��2��ֵ�Ƿ���ڣ��������ڣ���ֱ�������Ѵ��ڵĶ������� i1 == i2 =>ture ,
		// i3==i4 => false;
		
		
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "231fa23");
		map.put("bbb", "231fasd23");
		map.put("aacca", "2fa3123");
		map.put("dd", "231fds23");
		
		Set<String> keySet = map.keySet();
		Collection<String> values = map.values();
		
		for (String string : values) {
			System.out.println("-"+string);
		}
		
		for (String string : keySet) {
			System.out.println(string);
		}
		
		
		
	}

	public static void test(BigDecimal bd, int param, String str, List<User> list, StringBuilder sb) {

		bd = bd.add(new BigDecimal(12)); // �����ѱ䡣����
		System.out.println(bd.toString());

		System.out.println(param = 120);

		str = str + "dafd"; //

		String string = "hello world"; // ������ String string = new String("hello
										// world");

		User user = new User();
		user.setName("daf");
		user.setPassword("fasdf");

		list.add(user);

		sb.append("dandan");
		sb = new StringBuilder("dandan");

	}

	public static boolean test(int num) {
		boolean flag = false;
		char[] charArray = String.valueOf(num).toCharArray();
		if (charArray[0] == charArray[4] && charArray[1] == charArray[3]) {
			flag = true;
		}
		return flag;
	}

	public static boolean test(String str) {
		boolean flag = true;
		
		if (str!=null && !str.equals("")) {
			int len = str.length();
			char[] gen = str.toCharArray();
			int m = len/2;
			int in = 0;
			char[] ch1 = new char[m];
			char[] ch2 = new char[m];
			for(int i=0;i<m;i++){
				ch1[i]=gen[i];
			}
			for(int i=len-1;i>m;i--){
				ch2[in++]=gen[i];
			}
			for (int i = 0; i < m; i++) {
				if(ch1[i]!=ch2[i]){
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void perfectNum(int num) {

		int i = 1, n = 1000, s = 0, j = 0;
		for (i = 1; i < n; i++) {
			s = 0;
			for (j = 1; j < i; j++) {
				if (i % j == 0) {
					s = j + s;
				}
			}
			if (s == i) {
				System.out.println(j);
			}
		}
	}
}

class User {
	private String name;
	private String password;
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	
	
}
