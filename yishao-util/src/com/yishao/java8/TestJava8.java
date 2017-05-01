package com.yishao.java8;

import java.io.PrintStream;

import org.junit.Test;

public class TestJava8 {

	public static void main(String[] args) throws ClassNotFoundException {
		int a = 10;
		int b = 20;
		method1(a,b);
		
		ClassLoader classLoader = TestJava8.class.getClassLoader();
		System.out.println(classLoader);
		while(classLoader.getParent()!=null){
			System.out.println(classLoader.getParent());
			classLoader = classLoader.getParent();
		}
		
	}
	
	public static void method1(int a,int b){
		PrintStream out = System.out;
		out.println("a="+100);
		out.println("b="+200);
		
//		System.exit(0);
	}
}
