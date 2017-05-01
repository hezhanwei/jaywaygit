package com.yishao;

import java.util.Random;

public class Mail implements Cloneable{

	public static void main(String[] args) {

//		Mail mail = new Mail();
//
//		Mail clone = mail.clone();
//
//		System.out.println(mail +"---"+clone);
		
		Random random = new Random(5);
		System.out.println(random);
		
		
		for(int i = 0;i < 10;i=i+2){
			System.out.println(i);
		}
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(random.nextInt(3));
//			 
//			
//			
//			
//			
//		}
		
	}
	
	@Override
	protected Mail clone() {
		
		Mail mail = null;
		try {
			mail = (Mail)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mail;
	}
}
