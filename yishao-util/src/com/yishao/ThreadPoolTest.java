package com.yishao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(8);
		
		for(int i = 0;i<10;i++){
			final int task = i;
			executor.execute(new  Runnable() {
				public void run() {
					
					for(int j = 0;j<10;j++){
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+j+"---ÈÎÎñ£º"+task);
					}
				}
			});
			
		}
	}
	
}
