package com.yishao;

import java.util.ArrayList;
import java.util.List;

public class MyException {

	public static void main(String[] args) throws MySimpleException{
//		List<String> list = new ArrayList<>();
//		list.add("dandan");
		
//		int[] array = {1,23};
		try {
//			int i = 3/0;
//			int a = array[3];
			
//			int i = 3/0;
			test();
			
		}catch(MySimpleException e){
			throw new MySimpleException("fasd");
		}finally {
			System.out.println("what the fuck");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test() throws MySimpleException{
		
		throw new MySimpleException("∏Á√«£¨±¨¥÷¿≤");
	}
}

class MySimpleException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public MySimpleException(String message) {
		super(message);
		this.message = message;
		printMessage();
	}
	
	public void printMessage(){
		System.out.println("wtf.."+message);
	}
}